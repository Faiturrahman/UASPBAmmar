package com.example.timnasplayer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class BeritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        getSupportActionBar().setTitle("Forum Berita");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
