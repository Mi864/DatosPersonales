package com.example.datospersonales;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    String nombre;
    int dia;
    int mes;
    int año;
    int[] fecha;
    String telefono;
    String email;
    String descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputEditText Nombre = findViewById(R.id.Nombre);
        final TextInputEditText Telefono = findViewById(R.id.Teléfono);
        final TextInputEditText Email = findViewById(R.id.Email);
        final TextInputEditText Descripcion = findViewById(R.id.Descripción);
        final DatePicker Fecha = findViewById(R.id.datePicker);

        Button Siguiente = findViewById(R.id.Siguiente);
        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Editar.class);
                nombre      = Nombre.getText().toString();
                telefono    = Telefono.getText().toString();
                email       = Email.getText().toString();
                descripcion = Descripcion.getText().toString();
                dia         = Fecha.getDayOfMonth();
                mes         = Fecha.getMonth();
                año         = Fecha.getYear();
                fecha       = new int[]{dia,mes,año};
                intent.putExtra("Nombre",nombre);
                intent.putExtra("Teléfono",telefono);
                intent.putExtra("Email",email);
                intent.putExtra("Descripción",descripcion);
                intent.putExtra("Fecha",fecha);
                intent.putExtra("Dia",dia);
                intent.putExtra("Mes",mes);
                intent.putExtra("Año",año);
                startActivity(intent);
            }
        });
    }
}