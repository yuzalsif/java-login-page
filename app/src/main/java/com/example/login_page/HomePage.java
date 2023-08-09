package com.example.login_page;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class HomePage extends AppCompatActivity {

    GridView jokesGridView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        jokesGridView = findViewById(R.id.idGridView);

        ArrayList<JokeModel> jokesModelArrayList = new ArrayList<JokeModel>();

        jokesModelArrayList.add(new JokeModel("Why do programmers always mix up Christmas and Halloween? Because Oct 31 == Dec 25."));
        jokesModelArrayList.add(new JokeModel("Why did the programmer go broke? Because he used up all his cache."));
        jokesModelArrayList.add(new JokeModel("Why do Java developers wear glasses? Because they don't C#."));
        jokesModelArrayList.add(new JokeModel("Why do programmers prefer using the dark mode? Because light attracts bugs."));
        jokesModelArrayList.add(new JokeModel("Why did the developer go broke? Because he lost his domain in a bet"));
        jokesModelArrayList.add(new JokeModel("Why don't programmers like nature? It has too many bugs."));
        jokesModelArrayList.add(new JokeModel("Why was the JavaScript developer sad? Because he didn't \"null\" his feelings."));
        jokesModelArrayList.add(new JokeModel("Why do programmers hate nature walks? They prefer a byte"));
        jokesModelArrayList.add(new JokeModel("Why do programmers prefer using the stairs instead of the elevator? Because they're afraid of getting caught in an infinite loop."));
        jokesModelArrayList.add(new JokeModel("Why do programmers always mix up their Christmas and Halloween decorations? Because Oct 31 == Dec 25."));

        JokesGVAdapter adapter = new JokesGVAdapter(this, jokesModelArrayList);
        jokesGridView.setAdapter(adapter);
    }
}