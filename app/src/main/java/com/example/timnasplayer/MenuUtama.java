package com.example.timnasplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuUtama extends AppCompatActivity {

    private Button btnMove1;
    private Button btnMove3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        btnMove1 =(Button)findViewById(R.id.btn1);
        btnMove3 =(Button)findViewById(R.id.btn3);

        btnMove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Player = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Player);
            }
        });

        btnMove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Berita = new Intent(getApplicationContext(),BeritaActivity.class);
                startActivity(Berita);
            }
        });
    }
}
