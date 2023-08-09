package com.example.login_page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class JokesGVAdapter extends ArrayAdapter<JokeModel> {
    public JokesGVAdapter(@NonNull Context context, ArrayList<JokeModel> jokesModelArrayList) {
        super(context, 0, jokesModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_view, parent, false);
        }

        JokeModel jokeModel = getItem(position);
        TextView jokeTextView = listitemView.findViewById(R.id.cardTextView);

        jokeTextView.setText(jokeModel.getJoke());
        return listitemView;
    }
}
