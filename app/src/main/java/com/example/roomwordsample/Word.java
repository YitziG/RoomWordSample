package com.example.roomwordsample;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    private String word;

    public Word(@NonNull int id, @NonNull String word) {
        this.id = id;
        this.word = word;
    }

    @Ignore
    public Word(@NonNull String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

    public int getId() {
        return id;
    }
}
