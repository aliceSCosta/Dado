package com.example.dado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editTextAposta;
    private TextView textViewResultado;
    private ImageView imageViewDado1;
    private int dado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAposta = findViewById(R.id.edit_text_aposta);
        textViewResultado = findViewById(R.id.text_view_resultado);
        imageViewDado1 = findViewById(R.id.image_view_dado1);
    }

    public void jogarDado (View v){

        Random jogar = new Random();
        int resultadoAleatorio = (jogar.nextInt(6)+1);
        dado = resultadoAleatorio;

        if (resultadoAleatorio == 1){
            imageViewDado1.setImageResource(R.drawable.dado1);
        }
        else if (resultadoAleatorio == 2){
            imageViewDado1.setImageResource(R.drawable.dado2);
        }
        else if (resultadoAleatorio == 3){
            imageViewDado1.setImageResource(R.drawable.dado3);
        }
        else if (resultadoAleatorio == 4){
            imageViewDado1.setImageResource(R.drawable.dado4);
        }
        else if (resultadoAleatorio == 5){
            imageViewDado1.setImageResource(R.drawable.dado5);
        }
        else if (resultadoAleatorio == 6){
            imageViewDado1.setImageResource(R.drawable.dado6);
        }

        if (editTextAposta.equals(imageViewDado1)){
            textViewResultado.setText("Você Acertou!!!");
        }
        else{
            textViewResultado.setText("Você Errou :(");
        }
    }
}


