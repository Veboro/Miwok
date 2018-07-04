package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
       words.add(new Word("one","один", R.drawable.number_one));
        words.add(new Word("two","два", R.drawable.number_two));
        words.add(new Word("three","три", R.drawable.number_three));
        words.add(new Word("four","чотири",R.drawable.number_four));
        words.add(new Word("five","п'ять",R.drawable.number_five));
        words.add(new Word("six","шість",R.drawable.number_six));
        words.add(new Word("seven","сім",R.drawable.number_seven));
        words.add(new Word("eight","вісім",R.drawable.number_eight));
        words.add(new Word("nine","дев'ять",R.drawable.number_nine));
        words.add(new Word("ten","десять",R.drawable.number_ten));



        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
