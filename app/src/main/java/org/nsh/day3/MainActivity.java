package org.nsh.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menuu);
    }

    public void clickhospital(View view) {
        //gambar RS di click
        Intent i = new Intent(this,hospital.class);
        startActivity(i);
    }
}