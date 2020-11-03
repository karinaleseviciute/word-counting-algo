package com.karles.project.file.reader.model;

import java.util.List;

public class ResultModel {
    private List<WordModel> wordModels;
    private String title;

    public ResultModel(List<WordModel> wordModels, String title) {
        this.wordModels = wordModels;
        this.title = title;
    }

    public List<WordModel> getWordModels() {
        return wordModels;
    }

    public void setWordModels(List<WordModel> wordModels) {
        this.wordModels = wordModels;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
