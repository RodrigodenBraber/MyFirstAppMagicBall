package com.example.myfirstappmagicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ballI;
    private TextView respuesta;

    private String[] respuestaArray ={"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Ni con todo el dinero del mundo", "Perspectiva buena", "Olvidalo", "Si no fuera por tu cara", "Eeeeellaaaaa", "Sí", "Si tu lo crees, OK, despues no llores", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "Cada dia tiene su afan", "No puedo predecir ahora", "Di la verdad Rosa", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso", "No te voy a mentir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia imagen
        ballI = findViewById(R.id.boton);
        //referencia segundo texto
        respuesta = findViewById(R.id.respuesta);

        ballI.setOnClickListener(this);
        Toast.makeText(MainActivity.this,"Buscando tu destino!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v){
        //creacion de metodo de respuesta aleatorio

        switch(v.getId()){
            case R.id.boton:
                int random = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[random]);

                break;
        }
    }
}

