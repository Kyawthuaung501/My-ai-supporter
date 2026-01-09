package com.github.YOUR_GITHUB_USERNAME.myaisupporter;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Directly open ChatActivity
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(intent);
        finish();
    }
}
