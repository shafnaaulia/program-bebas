package com.example.input;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang, etLebar, etTinggi;
    private Button BVolume, BPindah;
    private TextView Hasil;
//        private  Button BTambah;
//        private TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        BTambah = findViewById(R.id.BTambah);
//        Hasil = findViewById(R.id.Hasil);
//
//        BTambah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String n = Hasil.getText().toString();
//                double BTambah = n+1;
//            }
//        });
        etPanjang = findViewById(R.id.P);
        etLebar = findViewById(R.id.L);
        etTinggi = findViewById(R.id.T);
        BVolume = findViewById(R.id.BVolume);
        BPindah = findViewById(R.id.Pindah);
        Hasil = findViewById(R.id.Hasil);

        BPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),nextActivity.class);
                startActivity(intent);
            }
        });

        BVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sPanjang = etPanjang.getText().toString();
                String sLebar = etLebar.getText().toString();
                String sTinggi = etTinggi.getText().toString();

                double panjang = Double.parseDouble(sPanjang);
                double lebar = Double.parseDouble(sLebar);
                double tinggi = Double.parseDouble(sTinggi);

                double hasil = panjang*lebar*tinggi;

                String sHasil = String.valueOf(hasil);
                Hasil.setText(sHasil);

                Intent intent = new Intent(getApplicationContext(),nextActivity.class);
                intent.putExtra( "hasil", sHasil);
                startActivity(intent);

            }
        });
    }
}
