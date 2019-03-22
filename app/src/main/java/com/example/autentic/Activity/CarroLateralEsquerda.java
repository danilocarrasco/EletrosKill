package com.example.autentic.Activity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.example.autentic.R;

import static android.graphics.Color.parseColor;

public class CarroLateralEsquerda extends AppCompatActivity {

    Spinner SerPLD;
    Spinner SerPLT;
    Spinner SerFPD;
    Spinner SerFPT;
    Spinner SerRD;
    Spinner SerRT;
    Spinner SerRET;
    Spinner SerPT;
    Spinner SerM;
    Spinner SerFP;
    Spinner SerCC;
    Spinner SerCD;
    Spinner SerCT;

    BootstrapButton FinalizaLD;

    CheckBox PLD;
    CheckBox PLT;
    CheckBox FPD;
    CheckBox FPT;
    CheckBox RD;
    CheckBox RT;
    CheckBox RET;
    CheckBox PT;
    CheckBox M;
    CheckBox FP;
    CheckBox CC;
    CheckBox CD;
    CheckBox CT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_lateral_esquerda);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SerPLD = findViewById(R.id.SPLDianteiro);
        ArrayAdapter<CharSequence> adapterPLD = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerPLD.setAdapter(adapterPLD);
        SerPLD.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterPLD.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerPLD.setVisibility(View.INVISIBLE);

        SerPLT = findViewById(R.id.SPLTraseiro);
        ArrayAdapter<CharSequence> adapterPLT = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerPLT.setAdapter(adapterPLT);
        SerPLT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterPLT.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerPLT.setVisibility(View.INVISIBLE);

        SerFPD = findViewById(R.id.SFrisoPLDianteiro);
        ArrayAdapter<CharSequence> adapterLE = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFPD.setAdapter(adapterLE);
        SerFPD.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterLE.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerFPD.setVisibility(View.INVISIBLE);

        SerFPT = findViewById(R.id.SFrisoPLTraseiro);
        ArrayAdapter<CharSequence> adapterFPT = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFPT.setAdapter(adapterFPT);
        SerFPT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterFPT.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerFPT.setVisibility(View.INVISIBLE);

        SerRD = findViewById(R.id.SRodaDianteira);
        ArrayAdapter<CharSequence> adapterRD = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerRD.setAdapter(adapterRD);
        SerRD.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterRD.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerRD.setVisibility(View.INVISIBLE);

        SerRT = findViewById(R.id.SRodaTraseira);
        ArrayAdapter<CharSequence> adapterRT = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerRT.setAdapter(adapterRT);
        SerRT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterRT.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerRT.setVisibility(View.INVISIBLE);

        SerRET = findViewById(R.id.SRetrovisor);
        ArrayAdapter<CharSequence> adapterRET = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerRET.setAdapter(adapterRET);
        SerRET.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterRET.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerRET.setVisibility(View.INVISIBLE);

        SerPT = findViewById(R.id.SPorta);
        ArrayAdapter<CharSequence> adapterPT = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerPT.setAdapter(adapterPT);
        SerPT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterPT.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerPT.setVisibility(View.INVISIBLE);

        SerM = findViewById(R.id.SMaçaneta);
        ArrayAdapter<CharSequence> adapterM = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerM.setAdapter(adapterM);
        SerM.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterM.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerM.setVisibility(View.INVISIBLE);

        SerFP = findViewById(R.id.SFrisoPorta);
        ArrayAdapter<CharSequence> adapterFP = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerFP.setAdapter(adapterFP);
        SerFP.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterFP.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerFP.setVisibility(View.INVISIBLE);

        SerCC = findViewById(R.id.SColunaCentral);
        ArrayAdapter<CharSequence> adapterCC = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerCC.setAdapter(adapterCC);
        SerCC.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterCC.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerCC.setVisibility(View.INVISIBLE);

        SerCD = findViewById(R.id.SColunaDianteira);
        ArrayAdapter<CharSequence> adapterCD = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerCD.setAdapter(adapterCD);
        SerCD.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterCD.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerCD.setVisibility(View.INVISIBLE);

        SerCT = findViewById(R.id.SColunaTraseira);
        ArrayAdapter<CharSequence> adapterCT = ArrayAdapter.createFromResource(this, R.array.Serviço, R.layout.spinner_colors);
        SerCT.setAdapter(adapterCT);
        SerCT.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterCT.setDropDownViewResource(R.layout.spinner_dropdown_colors);
        SerCT.setVisibility(View.INVISIBLE);


        FinalizaLD = (BootstrapButton) findViewById(R.id.btOrçamentoLD);
        FinalizaLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarroLateralEsquerda.this, PecasDefeito.class);
                startActivity(intent);
            }
        });


        PLD = (CheckBox) findViewById(R.id.cbPLDianteiro);
        PLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PLD.isChecked()) {
                    SerPLD.setVisibility(View.VISIBLE);
                } else {
                    SerPLD.setVisibility(View.INVISIBLE);
                }
            }
        });
        PLT = (CheckBox) findViewById(R.id.cbPLTraseiro);
        PLT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PLT.isChecked()) {
                    SerPLT.setVisibility(View.VISIBLE);
                } else {
                    SerPLT.setVisibility(View.INVISIBLE);
                }
            }
        });
        FPD = (CheckBox) findViewById(R.id.cbFrisoPLDianteiro);
        FPD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FPD.isChecked()) {
                    SerFPD.setVisibility(View.VISIBLE);
                } else {
                    SerFPD.setVisibility(View.INVISIBLE);
                }
            }
        });
        FPT = (CheckBox) findViewById(R.id.cbFrisoPLTraseiro);
        FPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FPT.isChecked()) {
                    SerFPT.setVisibility(View.VISIBLE);
                } else {
                    SerFPT.setVisibility(View.INVISIBLE);
                }
            }
        });
        RD = (CheckBox) findViewById(R.id.cbRodaDianteira);
        RD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RD.isChecked()) {
                    SerRD.setVisibility(View.VISIBLE);
                } else {
                    SerRD.setVisibility(View.INVISIBLE);
                }
            }
        });
        RT = (CheckBox) findViewById(R.id.cbRodaTraseira);
        RT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RT.isChecked()) {
                    SerRT.setVisibility(View.VISIBLE);
                } else {
                    SerRT.setVisibility(View.INVISIBLE);
                }
            }
        });
        RET = (CheckBox) findViewById(R.id.cbRetrovisor);
        RET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RET.isChecked()) {
                    SerRET.setVisibility(View.VISIBLE);
                } else {
                    SerRET.setVisibility(View.INVISIBLE);
                }
            }
        });
        PT = (CheckBox) findViewById(R.id.cbPorta);
        PT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PT.isChecked()) {
                    SerPT.setVisibility(View.VISIBLE);
                } else {
                    SerPT.setVisibility(View.INVISIBLE);
                }
            }
        });
        M = (CheckBox) findViewById(R.id.cbMaçaneta);
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (M.isChecked()) {
                    SerM.setVisibility(View.VISIBLE);
                } else {
                    SerM.setVisibility(View.INVISIBLE);
                }
            }
        });
        FP = (CheckBox) findViewById(R.id.cbFrisoPorta);
        FP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FP.isChecked()) {
                    SerFP.setVisibility(View.VISIBLE);
                } else {
                    SerFP.setVisibility(View.INVISIBLE);
                }
            }
        });
        CC = (CheckBox) findViewById(R.id.cbColunaCentral);
        CC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CC.isChecked()) {
                    SerCC.setVisibility(View.VISIBLE);
                } else {
                    SerCC.setVisibility(View.INVISIBLE);
                }
            }
        });
        CD = (CheckBox) findViewById(R.id.cbColunaDianteira);
        CD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CD.isChecked()) {
                    SerCD.setVisibility(View.VISIBLE);
                } else {
                    SerCD.setVisibility(View.INVISIBLE);
                }
            }
        });
        CT = (CheckBox) findViewById(R.id.cbColunaTraseira);
        CT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CT.isChecked()) {
                    SerCT.setVisibility(View.VISIBLE);
                } else {
                    SerCT.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
