package com.example.datospersonales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Editar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        Bundle parametros = getIntent().getExtras();
        //assert parametros != null;
        String Nombre = parametros.getString("Nombre");
        String Telefono = parametros.getString("Teléfono");
        String Email = parametros.getString("Email");
        String Descripcion = parametros.getString("Descripción");
        int[]  Fecha = parametros.getIntArray("Fecha");
        int Dia = parametros.getInt("Dia");
        int Mes = parametros.getInt("Mes");
        int Año = parametros.getInt("Año");

        TextView Cnombre = findViewById(R.id.Cnombre);
        Cnombre.setText(Nombre);
        TextView Ctelefono = findViewById(R.id.Ctelefono);
        Ctelefono.setText(Telefono);
        TextView Cemail = findViewById(R.id.Cemail);
        Cemail.setText(Email);
        TextView Cdescripcion = findViewById(R.id.Cdescripcion);
        Cdescripcion.setText(Descripcion);
        TextView Cfecha = findViewById(R.id.Cfecha);
        Cfecha.setText(String.format("%d-%d-%d",Dia,Mes+1,Año));
        //Cfecha.setText(String.format("%d", Fecha));


        Button Editar = findViewById(R.id.Editar);
        Editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editar.super.onBackPressed();

            }
        });
    }
}