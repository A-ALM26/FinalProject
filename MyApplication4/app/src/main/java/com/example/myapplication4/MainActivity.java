package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = findViewById(R.id.button);
        final EditText b = findViewById(R.id.E_mail);
          a.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
               String name = b.getText().toString();
                  Intent x = new Intent(MainActivity.this , MainActivity2.class);
                    x.putExtra("info",name);
            startActivity(x);
              }
          });



    }
}