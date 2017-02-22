package com.example.mipc.myway.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Rewards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rewards);
    }
    public void PasarMenu (View view){
        Intent siguiente= new Intent(this,MainMenu.class);
        startActivity(siguiente);
    }

}