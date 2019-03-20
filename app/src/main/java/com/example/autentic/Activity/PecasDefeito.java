package com.example.autentic.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.autentic.R;

public class PecasDefeito extends AppCompatActivity {

    ImageButton Frente;
    ImageButton Traseira;
    ImageButton Ldireita;
    ImageButton Lesquerda;
    //ImageButton Teto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecas_defeito);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Frente = (ImageButton) findViewById(R.id.iBtCarFrente);
        Frente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PecasDefeito.this, CarroFrente.class);
                startActivity(intent);
            }
        });

        Traseira = (ImageButton) findViewById(R.id.iBtCarTraseira);
        Ldireita = (ImageButton) findViewById(R.id.iBtCarDireita);
        Lesquerda = (ImageButton) findViewById(R.id.iBtCarEsquerda);

    }


}
