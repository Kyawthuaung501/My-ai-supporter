package com.github.Kyawthuaung501.myaisupporter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    CompanyDataManager manager = new CompanyDataManager(this);
        String companyData = manager.loadCompanyData();
        // Attach chat layout
        setContentView(R.layout.activity_chat);
    }
}
