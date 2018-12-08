package com.example.kim.googlefeud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Question> questionBank;
    TextView question, ans1, ans2, ans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
