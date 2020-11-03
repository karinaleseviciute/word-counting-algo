package com.karles.project.file.reader.model;


public class WordModel {

    private String word;
    private int duplicates;

    public WordModel(String word, int duplicates) {
        this.word = word;
        this.duplicates = duplicates;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getDuplicates() {
        return duplicates;
    }

    public void setDuplicates(int duplicates) {
        this.duplicates = duplicates;
    }
}
