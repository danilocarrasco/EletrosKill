package com.example.autentic.Activity;

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

import com.example.autentic.R;

import static android.graphics.Color.parseColor;

public class CarroFrente extends AppCompatActivity {

    Spinner SerP;
    Spinner SerCapo;
    Spinner SerLE;
    Spinner SerLD;
    Spinner SerGF;
    Spinner SerFF;
    Spinner SerFN;

    Button Finaliza;

    CheckBox P;
    CheckBox C;
    CheckBox LE;
    CheckBox LD;
    CheckBox GF;
    CheckBox FF;
    CheckBox FN;

    TextView Resultado;

    int Conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_frente);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SerP = findViewById(R.id.SParachoque);
        ArrayAdapter<CharSequence> adapterP = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerP.setAdapter(adapterP);
        SerP.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterP.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        SerCapo = findViewById(R.id.SCapo);
        ArrayAdapter<CharSequence> adapterC = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerCapo.setAdapter(adapterC);
        SerCapo.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterC.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        SerLE = findViewById(R.id.SFarolEsquerda);
        ArrayAdapter<CharSequence> adapterLE = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerLE.setAdapter(adapterLE);
        SerLE.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterLE.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        SerLD = findViewById(R.id.SFarolDireita);
        ArrayAdapter<CharSequence> adapterLD = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerLD.setAdapter(adapterLD);
        SerLD.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterLD.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        SerGF = findViewById(R.id.SGradeFrontal);
        ArrayAdapter<CharSequence> adapterGF = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerGF.setAdapter(adapterGF);
        SerGF.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterGF.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        SerFF = findViewById(R.id.SFriso);
        ArrayAdapter<CharSequence> adapterFF = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFF.setAdapter(adapterFF);
        SerFF.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterFF.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        SerFN = findViewById(R.id.SFarolNeblina);
        ArrayAdapter<CharSequence> adapterFN = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFN.setAdapter(adapterFN);
        SerFN.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterFN.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        Resultado = (TextView) findViewById(R.id.ver_checkbox);

        Finaliza = (Button) findViewById(R.id.btFinalizar);
        Finaliza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Resultado.setText("");
                Conta = 0;

                if (P.isChecked()) {
                    Conta = Conta + 10;
                }
                if (C.isChecked()) {
                    Conta = Conta + 20;
                }
                if (LE.isChecked()) {
                    Conta = Conta + 30;
                }
                if (LD.isChecked()) {
                    Conta = Conta + 40;
                }
                if (GF.isChecked()) {
                    Conta = Conta + 50;
                }
                if (FF.isChecked()) {
                    Conta = Conta + 60;
                }
                if (FN.isChecked()) {
                    Conta = Conta + 70;
                }

                Resultado.setText(Integer.toString(Conta));
            }
        });


        P = (CheckBox) findViewById(R.id.cbParachoque);
        C = (CheckBox) findViewById(R.id.cbCapo);
        LE = (CheckBox) findViewById(R.id.cbFarolEsquerda);
        LD = (CheckBox) findViewById(R.id.cbFarolDireita);
        GF = (CheckBox) findViewById(R.id.cbGradeFrontal);
        FF = (CheckBox) findViewById(R.id.cbFriso);
        FN = (CheckBox) findViewById(R.id.cbFarolNeblina);

    }
}

