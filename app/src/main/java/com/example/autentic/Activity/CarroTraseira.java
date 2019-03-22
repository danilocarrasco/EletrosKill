package com.example.autentic.Activity;

import android.content.Intent;
import android.graphics.PorterDuff;
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

public class CarroTraseira extends AppCompatActivity {

    Spinner SerPaT;
    Spinner SerPoT;
    Spinner SerLE;
    Spinner SerLD;
    Spinner SerAT;
    Spinner SerE;
    Spinner SerMT;

    BootstrapButton FinalizaTraseira;

    CheckBox PaT;
    CheckBox PoT;
    CheckBox LE;
    CheckBox LD;
    CheckBox AT;
    CheckBox E;
    CheckBox MT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_traseira);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SerPaT = findViewById(R.id.SParachoqueTraseiro);
        ArrayAdapter<CharSequence> adapterP = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerPaT.setAdapter(adapterP);
        SerPaT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterP.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerPaT.setVisibility(View.INVISIBLE);

        SerPoT = findViewById(R.id.SPortaTraseira);
        ArrayAdapter<CharSequence> adapterC = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerPoT.setAdapter(adapterC);
        SerPoT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterC.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerPoT.setVisibility(View.INVISIBLE);

        SerLE = findViewById(R.id.SLanternaEsquerda);
        ArrayAdapter<CharSequence> adapterLE = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerLE.setAdapter(adapterLE);
        SerLE.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterLE.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerLE.setVisibility(View.INVISIBLE);

        SerLD = findViewById(R.id.SLanternaDireita);
        ArrayAdapter<CharSequence> adapterLD = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerLD.setAdapter(adapterLD);
        SerLD.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterLD.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerLD.setVisibility(View.INVISIBLE);

        SerAT = findViewById(R.id.SAsaTraseira);
        ArrayAdapter<CharSequence> adapterGF = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerAT.setAdapter(adapterGF);
        SerAT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterGF.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerAT.setVisibility(View.INVISIBLE);

        SerE = findViewById(R.id.SEscapamento);
        ArrayAdapter<CharSequence> adapterFF = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerE.setAdapter(adapterFF);
        SerE.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterFF.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerE.setVisibility(View.INVISIBLE);

        SerMT = findViewById(R.id.SMaçanetaTraseira);
        ArrayAdapter<CharSequence> adapterFN = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerMT.setAdapter(adapterFN);
        SerMT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterFN.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerMT.setVisibility(View.INVISIBLE);

        FinalizaTraseira = (BootstrapButton) findViewById(R.id.btOrçamentoTraseira);
        FinalizaTraseira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarroTraseira.this, PecasDefeito.class);
                startActivity(intent);
            }
        });


        PaT = (CheckBox) findViewById(R.id.cbParachoqueTraseiro);
        PaT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PaT.isChecked()) {
                    SerPaT.setVisibility(View.VISIBLE);
                } else {
                    SerPaT.setVisibility(View.INVISIBLE);
                }
            }
        });

        PoT = (CheckBox) findViewById(R.id.cbPortaTraseira);
        PoT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PoT.isChecked()) {
                    SerPoT.setVisibility(View.VISIBLE);
                } else {
                    SerPoT.setVisibility(View.INVISIBLE);
                }
            }
        });

        LE = (CheckBox) findViewById(R.id.cbLanternaEsquerda);
        LE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (LE.isChecked()) {
                    SerLE.setVisibility(View.VISIBLE);
                } else {
                    SerLE.setVisibility(View.INVISIBLE);
                }
            }
        });

        LD = (CheckBox) findViewById(R.id.cbLanternaDireita);
        LD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (LD.isChecked()) {
                    SerLD.setVisibility(View.VISIBLE);
                } else {
                    SerLD.setVisibility(View.INVISIBLE);
                }
            }
        });

        E = (CheckBox) findViewById(R.id.cbEscapamento);
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (E.isChecked()) {
                    SerE.setVisibility(View.VISIBLE);
                } else {
                    SerE.setVisibility(View.INVISIBLE);
                }
            }
        });

        AT = (CheckBox) findViewById(R.id.cbAsaTraseira);
        AT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AT.isChecked()) {
                    SerAT.setVisibility(View.VISIBLE);
                } else {
                    SerAT.setVisibility(View.INVISIBLE);
                }
            }
        });

        MT = (CheckBox) findViewById(R.id.cbMaçanetaTraseira);
        MT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MT.isChecked()) {
                    SerMT.setVisibility(View.VISIBLE);
                } else {
                    SerMT.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}



