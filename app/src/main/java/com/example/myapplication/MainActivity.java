package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("create","activites cree");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    @Override
    protected void onStart() {
        Log.d("start","starté");
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop","stopé");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("restart ","restarté");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy","destroyé");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resume","resumé");
    }


}