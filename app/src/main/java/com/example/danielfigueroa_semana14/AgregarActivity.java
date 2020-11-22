package com.example.danielfigueroa_semana14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class AgregarActivity extends AppCompatActivity {

    private EditText nombreContacto;
    private EditText telefonoContacto;
    private Button botonAgregarContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        nombreContacto=findViewById(R.id.nombreContacto);
        telefonoContacto=findViewById(R.id.telefonoContacto);
        botonAgregarContacto=findViewById(R.id.botonAgregarContacto);

        botonAgregarContacto.setOnClickListener(
                (v)->{

                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);

                }
        );
    }
}