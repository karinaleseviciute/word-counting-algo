package com.karles.project.file.reader;

import com.karles.project.file.reader.message.ResponseMessage;
import com.karles.project.file.reader.model.WordModel;
import com.karles.project.file.reader.service.FileReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


@Controller
@CrossOrigin("http://localhost:4200")
public class FileController {

    @Autowired
    FileReaderService fileReaderService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file[]") MultipartFile[] files) throws IOException {

        //fileReaderService.deleteFiles();

        String message = "";
        try {

            Arrays.asList(files)
                    .stream()
                    .forEach(file -> fileReaderService.save(file));


            fileReaderService.start();

            message = "File was uploaded successfully: ";
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + "!" + e.getStackTrace() + e.toString();
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @GetMapping("/wordlist")
    public ResponseEntity<List<WordModel>> getListFiles() {

        List<WordModel> wordModelList = fileReaderService.getAgWordModelList();

        return new ResponseEntity(wordModelList, HttpStatus.OK);

    }

}
