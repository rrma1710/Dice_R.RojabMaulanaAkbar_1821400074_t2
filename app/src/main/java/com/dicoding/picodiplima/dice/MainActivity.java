package com.dicoding.picodiplima.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView hasil;
    private Button tombol;

    private Random rdm = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.gambar);
        hasil = findViewById(R.id.nilai);
        tombol = findViewById(R.id.btn_CEK);


        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekDice();
            }
        });
    }

    public void cekDice() {
        int[] gambar = new int[6];

        gambar[0] = R.drawable.dice_1;
        gambar[1] = R.drawable.dice_2;
        gambar[2] = R.drawable.dice_3;
        gambar[3] = R.drawable.dice_4;
        gambar[4] = R.drawable.dice_5;
        gambar[5] = R.drawable.dice_6;

        imageView.setImageResource(gambar[rdm.nextInt(6)]);

        if(imageView.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.dice_1).getConstantState())
        {
            hasil.setText("1");
            Toast.makeText(MainActivity.this, "DADU MENUNJUKKAN ANGKA 1", Toast.LENGTH_SHORT).show();
        }
        else if (imageView.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.dice_2).getConstantState())
        {
            hasil.setText("2");
            Toast.makeText(MainActivity.this, "DADU MENUNJUKKAN ANGKA 2", Toast.LENGTH_SHORT).show();
        }
        else if (imageView.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.dice_3).getConstantState())
        {
            hasil.setText("3");
            Toast.makeText(MainActivity.this, "DADU MENUNJUKKAN ANGKA 3", Toast.LENGTH_SHORT).show();
        }
        else if (imageView.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.dice_4).getConstantState())
        {
            hasil.setText("4");
            Toast.makeText(MainActivity.this, "DADU MENUNJUKKAN ANGKA 4", Toast.LENGTH_SHORT).show();
        }
        else if (imageView.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.dice_5).getConstantState())
        {
            hasil.setText("5");
            Toast.makeText(MainActivity.this, "DADU MENUNJUKKAN ANGKA 5", Toast.LENGTH_SHORT).show();
        }
        else if (imageView.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.dice_6).getConstantState())
        {
            hasil.setText("6");
            Toast.makeText(MainActivity.this, "DADU MENUNJUKKAN ANGKA 6", Toast.LENGTH_SHORT).show();
            tombol.setEnabled(false);
        }
        else {
            hasil.setText("Tidak Terhitung");
            Toast.makeText(MainActivity.this, "DADU TIDAK DIKENALI", Toast.LENGTH_SHORT).show();
        };
    }
}
