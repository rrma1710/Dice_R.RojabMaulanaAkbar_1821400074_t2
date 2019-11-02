package com.dicoding.picodiplima.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageviewdice;
    private Random rdm = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    imageviewdice = findViewById(R.id.image_view_dice);
    imageviewdice.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cekDice();
        }
    });
    }
    private void cekDice(){
        int acakAngka = rdm.nextInt(6)+1;

        switch (acakAngka){
            case 1:
                imageviewdice.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imageviewdice.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imageviewdice.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imageviewdice.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imageviewdice.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imageviewdice.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}
