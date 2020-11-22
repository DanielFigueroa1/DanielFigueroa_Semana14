package com.example.danielfigueroa_semana14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase db;
    private TextView noRegistradoMain;
    private Button botonAgregar;
    private ListView listaContacto;
    private ContactosAdaptador adapter;
    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noRegistradoMain=findViewById(R.id.noRegistradoMain);
        botonAgregar=findViewById(R.id.botonAgregar);
        listaContacto=findViewById(R.id.listaContacto);

        adapter = new ContactosAdaptador();

        db = FirebaseDatabase.getInstance();


        botonAgregar.setOnClickListener(
                (v)->{

                    Intent i = new Intent(this, AgregarActivity.class);
                    startActivity(i);

                }
        );

        noRegistradoMain.setOnClickListener(
                (v)->{

                    Intent i = new Intent(this, RegistroActivity.class);
                    startActivity(i);

                }
        );

    }
}