package com.example.roomwordsample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder {

    private final TextView wordItemView;

    public WordViewHolder(View itemView) {
        super(itemView);
        wordItemView = itemView.findViewById(R.id.textView);
    }

    static WordViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new WordViewHolder(view);
    }

    public void bind(String text) {
        wordItemView.setText(text);
    }
}