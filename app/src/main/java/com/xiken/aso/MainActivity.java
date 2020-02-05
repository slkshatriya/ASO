package com.xiken.aso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    ImageView imgview,imgviewt,imgviewi,imgviewl,imgviewy,imgviewc;
    CardView cardView,cardview1,cardview2,cardview3,cardview4,cardview5,cardview6,cardview7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.facebook);
        imgview = (ImageView) findViewById(R.id.imgview);
        imgviewt = (ImageView) findViewById(R.id.imgviewt);
        imgviewi = (ImageView) findViewById(R.id.imgviewi);
        imgviewl = (ImageView) findViewById(R.id.imgviewl);
        imgviewy = (ImageView) findViewById(R.id.imgviewy);
        imgviewc = (ImageView) findViewById(R.id.imgviewc);
        imgviewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity18();
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        cardview1 = findViewById(R.id.twitter);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        cardview2 = findViewById(R.id.insta);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });

        cardview3 = findViewById(R.id.linkedin);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        });

        cardview4 = findViewById(R.id.youtube);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        });
        cardview5 = findViewById(R.id.reddit);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity12();
            }
        });
        cardview6 = findViewById(R.id.pintrest);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }
        });

        cardview7 = findViewById(R.id.flickr);
        cardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }
        });
    }
    public void openActivity18(){
        Intent intent8 = new Intent(MainActivity.this,screen8.class);
        startActivity(intent8);
    }
    public void openActivity16(){
        Intent intent7 = new Intent(MainActivity.this,screen7.class);
        startActivity(intent7);
    }
    public void openActivity14(){
        Intent intent6 = new Intent(MainActivity.this,screen6.class);
        startActivity(intent6);
    }
    public void openActivity12(){
        Intent intent5 = new Intent(MainActivity.this,screen5.class);
        startActivity(intent5);
    }
    public void openActivity10(){
        Intent intent4 = new Intent(MainActivity.this,screen4.class);
        startActivity(intent4);
    }
    public void openActivity8(){
        Intent intent3 = new Intent(MainActivity.this,screen3.class);
        startActivity(intent3);
    }
    public void openActivity6(){
        Intent intent2 = new Intent(MainActivity.this,screen2.class);
        startActivity(intent2);
    }

    public void openActivity4(){
        Intent intent1 = new Intent(MainActivity.this,screen1.class);
        startActivity(intent1);
    }
    public void openActivity2(){
        Intent intent = new Intent(MainActivity.this, screen.class);
        startActivity(intent);
    }
}
