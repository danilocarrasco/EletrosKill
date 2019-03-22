package com.example.autentic.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapDropDown;
import com.example.autentic.R;

import static android.graphics.Color.colorSpace;
import static android.graphics.Color.parseColor;

public class CadastroVeiculo extends AppCompatActivity implements View.OnClickListener {

    Spinner Marca;
    Spinner Modelo;
    Spinner Cor;
    Spinner Pintura;

    BootstrapButton btnRegistra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_veiculo);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnRegistra = (BootstrapButton) findViewById(R.id.btnregistrar);
        btnRegistra.setOnClickListener(this);

        Marca = findViewById(R.id.spMarca);
        ArrayAdapter<CharSequence> adapterMarca = ArrayAdapter.createFromResource(this, R.array.bootstrap_dropdown_Marca, R.layout.spinner_colors);
        Marca.setAdapter(adapterMarca);
        Marca.getBackground().setColorFilter(parseColor("White"), PorterDuff.Mode.SRC_ATOP);
        adapterMarca.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        Modelo = findViewById(R.id.spModelo);
        ArrayAdapter<CharSequence> adapterModelo = ArrayAdapter.createFromResource(this, R.array.bootstrap_dropdown_Modelo, R.layout.spinner_colors);
        Modelo.setAdapter(adapterModelo);
        Modelo.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterModelo.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        Cor = findViewById(R.id.spCor);
        ArrayAdapter<CharSequence> adapterCor = ArrayAdapter.createFromResource(this, R.array.bootstrap_dropdown_Cor, R.layout.spinner_colors);
        Cor.setAdapter(adapterCor);
        Cor.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterCor.setDropDownViewResource(R.layout.spinner_dropdown_colors);

        Pintura = findViewById(R.id.spPintura);
        ArrayAdapter<CharSequence> adapterPintura = ArrayAdapter.createFromResource(this, R.array.bootstrap_dropdown_Pintura, R.layout.spinner_colors);
        Pintura.setAdapter(adapterPintura);
        Pintura.getBackground().setColorFilter(parseColor("#f0f0f0"), PorterDuff.Mode.SRC_ATOP);
        adapterPintura.setDropDownViewResource(R.layout.spinner_dropdown_colors);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btnregistrar:

                Intent intent = new Intent(this, PecasDefeito.class);
                startActivity(intent);
                break;


        }
    }
}
