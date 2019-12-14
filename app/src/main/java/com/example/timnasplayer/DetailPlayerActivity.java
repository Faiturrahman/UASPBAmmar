package com.example.timnasplayer;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;

public class DetailPlayerActivity extends AppCompatActivity {

    public static String EXTRA_PLAYER = "extra_player";
    TextView tvNo, tvNama, tvBirth, tvPos;
    ImageView imgfoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_player);

        getSupportActionBar().setTitle("Pemain Timnas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvNo = findViewById(R.id.tvNo);
        tvNama = findViewById(R.id.tvNama);
        tvBirth = findViewById(R.id.tvBirth);
        tvPos = findViewById(R.id.tvPos);
        imgfoto = findViewById(R.id.Poster);

        PlayerItem playerItem =  getIntent().getParcelableExtra(EXTRA_PLAYER);

        String no = playerItem.getNo();
        String name = playerItem.getName();
        String birth = playerItem.getBirth_date();
        String pos = playerItem.getPosition();

        tvNo.setText(no);
        tvNama.setText(name);
        tvBirth.setText(birth);
        tvPos.setText(pos);
        Picasso.with(this).load(playerItem.getPoster()).into(imgfoto);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
