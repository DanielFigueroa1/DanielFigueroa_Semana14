package com.example.danielfigueroa_semana14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText correoLogin;
    private EditText contrasenaLogin;
    private Button botonLogin;
    private TextView noCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        correoLogin=findViewById(R.id.correoLogin);
        contrasenaLogin=findViewById(R.id.contrasenaLogin);
        botonLogin=findViewById(R.id.botonLogin);
        noCuenta=findViewById(R.id.noCuenta);

        botonLogin.setOnClickListener(
                (v)->{

                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);

                }
        );

        noCuenta.setOnClickListener(
                (v)->{

                    Intent i = new Intent(this, RegistroActivity.class);
                    startActivity(i);

                }
        );
    }
}