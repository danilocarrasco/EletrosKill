package com.example.autentic.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.example.autentic.R;

import static android.graphics.Color.parseColor;

public class CarroFrente extends AppCompatActivity implements View.OnClickListener {

    Spinner SerP;
    Spinner SerCapo;
    Spinner SerFE;
    Spinner SerFD;
    Spinner SerGF;
    Spinner SerFF;
    Spinner SerFN;
    Spinner SerCX;

    BootstrapButton FinalizaFrente;

    CheckBox P;
    CheckBox C;
    CheckBox LE;
    CheckBox LD;
    CheckBox GF;
    CheckBox FF;
    CheckBox FN;
    CheckBox CX;

    TextView Resultado;

    int Conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_frente);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SerP = findViewById(R.id.SParachoqueDianteiro);
        ArrayAdapter<CharSequence> adapterP = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerP.setAdapter(adapterP);
        SerP.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterP.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerP.setVisibility(View.INVISIBLE);


        SerCapo = findViewById(R.id.SCapo);
        ArrayAdapter<CharSequence> adapterC = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerCapo.setAdapter(adapterC);
        SerCapo.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterC.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerCapo.setVisibility(View.INVISIBLE);

        SerFE = findViewById(R.id.SFarolEsquerda);
        ArrayAdapter<CharSequence> adapterLE = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFE.setAdapter(adapterLE);
        SerFE.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterLE.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerFE.setVisibility(View.INVISIBLE);

        SerFD = findViewById(R.id.SFarolDireita);
        ArrayAdapter<CharSequence> adapterLD = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFD.setAdapter(adapterLD);
        SerFD.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterLD.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerFD.setVisibility(View.INVISIBLE);

        SerGF = findViewById(R.id.SGradeFrontal);
        ArrayAdapter<CharSequence> adapterGF = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerGF.setAdapter(adapterGF);
        SerGF.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterGF.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerGF.setVisibility(View.INVISIBLE);

        SerFF = findViewById(R.id.SFriso);
        ArrayAdapter<CharSequence> adapterFF = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFF.setAdapter(adapterFF);
        SerFF.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterFF.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerFF.setVisibility(View.INVISIBLE);

        SerFN = findViewById(R.id.SFarolNeblina);
        ArrayAdapter<CharSequence> adapterFN = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFN.setAdapter(adapterFN);
        SerFN.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterFN.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerFN.setVisibility(View.INVISIBLE);

        SerCX = findViewById(R.id.SCaixaAr);
        ArrayAdapter<CharSequence> adapterCX = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerCX.setAdapter(adapterCX);
        SerCX.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterCX.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerCX.setVisibility(View.INVISIBLE);

        FinalizaFrente = (BootstrapButton) findViewById(R.id.btOrçamentoFrente);
        FinalizaFrente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarroFrente.this, PecasDefeito.class);
                startActivity(intent);
            }
        });

        P = (CheckBox) findViewById(R.id.cbParachoqueDianteiro);
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P.isChecked()) {
                    SerP.setVisibility(View.VISIBLE);
                } else {
                    SerP.setVisibility(View.INVISIBLE);
                }
            }
        });
        C = (CheckBox) findViewById(R.id.cbCapo);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (C.isChecked()) {
                    SerCapo.setVisibility(View.VISIBLE);
                } else {
                    SerCapo.setVisibility(View.INVISIBLE);
                }
            }
        });

        LE = (CheckBox) findViewById(R.id.cbFarolEsquerda);
        LE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (LE.isChecked()) {
                    SerFE.setVisibility(View.VISIBLE);
                } else {
                    SerFE.setVisibility(View.INVISIBLE);
                }
            }
        });

        LD = (CheckBox) findViewById(R.id.cbFarolDireita);
        LD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (LD.isChecked()) {
                    SerFD.setVisibility(View.VISIBLE);
                } else {
                    SerFD.setVisibility(View.INVISIBLE);
                }
            }
        });

        GF = (CheckBox) findViewById(R.id.cbGradeFrontal);
        GF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GF.isChecked()) {
                    SerGF.setVisibility(View.VISIBLE);
                } else {
                    SerGF.setVisibility(View.INVISIBLE);
                }
            }
        });
        FF = (CheckBox) findViewById(R.id.cbFriso);
        FF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FF.isChecked()) {
                    SerFF.setVisibility(View.VISIBLE);
                } else {
                    SerFF.setVisibility(View.INVISIBLE);
                }
            }
        });
        FN = (CheckBox) findViewById(R.id.cbFarolNeblina);
        FN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FN.isChecked()) {
                    SerFN.setVisibility(View.VISIBLE);
                } else {
                    SerFN.setVisibility(View.INVISIBLE);
                }
            }
        });

        CX = (CheckBox) findViewById(R.id.cbCaixaAr);
        CX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CX.isChecked()) {
                    SerCX.setVisibility(View.VISIBLE);
                } else {
                    SerCX.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
