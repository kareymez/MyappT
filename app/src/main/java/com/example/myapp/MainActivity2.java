package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(regresar);

                Context context = getApplicationContext();
                CharSequence text = "Regresa a la actividad principal!!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context,text,duration);
                toast.show();

            }
        });




        }
    }

