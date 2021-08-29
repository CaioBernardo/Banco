package com.example.bancodados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.bancodados.controller.NotaController;
import com.example.bancodados.modelo.Nota;

public class ActivityExibirNota extends AppCompatActivity {

    NotaController notaController;
    EditText edTitulo, edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_nota);

        notaController = new NotaController(getApplicationContext());

        edTitulo = findViewById(R.id.edTitulo);
        edText = findViewById(R.id.edTexto);

    }

    public void salvarNota(View v){

        notaController.cadastrarNovaNota(new Nota( edTitulo.getText().toString(),edText.getText().toString()));

    }

}