package com.karles.project;

import com.karles.project.file.reader.service.FileReaderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Resource
    FileReaderService fileReaderService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //fileReaderService.deleteFolder();
        fileReaderService.deleteFolder();
        fileReaderService.init();
    }
}
