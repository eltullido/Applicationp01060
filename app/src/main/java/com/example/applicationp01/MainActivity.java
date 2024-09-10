package com.example.applicationp01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonCrearCuenta;
    private TextView textViewError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonCrearCuenta = findViewById(R.id.buttonCrearCuenta);
        textViewError = findViewById(R.id.textViewError);

        buttonCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString().trim();
                String apellido = editTextApellido.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                if (nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    textViewError.setText(" complete todos los campos.");
                    textViewError.setVisibility(View.VISIBLE);
                } else {
                    textViewError.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Hola, " + nombre + " " + apellido + "!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
