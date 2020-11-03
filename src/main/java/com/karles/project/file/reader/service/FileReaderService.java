package com.karles.project.file.reader.service;

import com.karles.project.file.reader.model.WordModel;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public interface FileReaderService {

    public void init();

    public void save(MultipartFile file);

    public void start() throws IOException;

    public void deleteFiles() throws IOException;

    public void deleteFolder() throws IOException;

    public List<WordModel> getAgWordModelList();
}
