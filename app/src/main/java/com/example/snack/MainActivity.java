package com.example.snack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void DisplayToast(View v){
        Toast.makeText(MainActivity.this,"Welcome to this app",Toast.LENGTH_SHORT).show();
    }
}
