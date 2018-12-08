package com.example.nhmatsumoto.exercicios;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("N.H.M");

        ListView listaExercicios = (ListView) findViewById(R.id.listaExercicios);
        List<String> atividades = new ArrayList<String>();

        atividades.add("Exercício 1");
        atividades.add("Exercício 2");
        atividades.add("Exercício 3");
        atividades.add("Exercício 4");

        atividades.add("Prova 01 - Calculadora");
        atividades.add("Prova 02 - Genius");



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, atividades);
        listaExercicios.setAdapter(adapter);

        listaExercicios.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {
                    case 0:
                        Intent paginaExercicio1 = new Intent(getBaseContext(), Exercicio1.class);
                        startActivity(paginaExercicio1);
                    break;
                    case 1:
                        Intent paginaExercicio2 = new Intent(getBaseContext(), Exercicio2.class);
                        startActivity(paginaExercicio2);
                    break;
                    case 2:
                        Intent paginaExercicio3 = new Intent(getBaseContext(), Exercicio3.class);
                        startActivity(paginaExercicio3);
                    break;
                    case 3:
                        Intent paginaExercicio4 = new Intent(getBaseContext(), Exercicio4.class);
                        startActivity(paginaExercicio4);
                    break;
                    case 4:
                        Intent prova1 = new Intent(getBaseContext(), Calculadora.class);
                        startActivity(prova1);
                        break;
                }
            }
        });
    }




}
