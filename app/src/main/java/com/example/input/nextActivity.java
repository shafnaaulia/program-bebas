package com.example.input;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {
    private TextView H;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        H = findViewById(R.id.H);

        String hasil = getIntent().getStringExtra("hasil");
        H.setText(hasil);
    }
}
