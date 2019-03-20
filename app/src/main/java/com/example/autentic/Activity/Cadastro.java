package com.example.autentic.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.example.autentic.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.concurrent.Delayed;

public class Cadastro extends AppCompatActivity implements View.OnClickListener {

    private BootstrapButton btnCancelar;
    private BootstrapButton btncadastrar;

    private EditText Nome, Senha, RepeteSenha, Email;

    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnCancelar = (BootstrapButton) findViewById(R.id.btncancelar);
        btncadastrar = (BootstrapButton) findViewById(R.id.btncadastrar);

        Nome = (EditText) findViewById(R.id.edtnome);
        Senha = (EditText) findViewById(R.id.edtsenha);
        RepeteSenha = (EditText) findViewById(R.id.edtrepetesenha);
        Email = (EditText) findViewById(R.id.edtemail);

        btncadastrar.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);

        auth = FirebaseAuth.getInstance();

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btncadastrar:

                cadastrar();

                break;

            case R.id.btncancelar:
                Intent intent = new Intent(Cadastro.this, MainActivity.class);
                startActivity(intent);
                finish();

                break;
        }
    }

    private void cadastrar() {

        String email = Email.getText().toString().trim();
        String senha1 = Senha.getText().toString().trim();
        String senha2 = RepeteSenha.getText().toString().trim();

        if (email.isEmpty() || senha1.isEmpty() || senha2.isEmpty()) {

            Toast.makeText(this, "Preencha os campos obrigatórios!", Toast.LENGTH_LONG).show();

        } else {

            if (senha1.contentEquals(senha2)) {

                if (Util.verificarInternet(this)) {

                    criaUsuario(email, senha1);

                }else {

                    Toast.makeText(this, "Erro - Certifique-se de estar conectado à internet", Toast.LENGTH_LONG).show();

                }
            }else {

                Toast.makeText(this, "As senhas digitadas não são iguais!", Toast.LENGTH_LONG).show();

            }
        }
    }

    private  void criaUsuario(final String email, final String senha){

        auth.createUserWithEmailAndPassword(email, senha).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){

                    Toast.makeText(getBaseContext(), "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();
                    Intent voltar = new Intent(Cadastro.this, MainActivity.class);
                    startActivity(voltar);


                }else {

                    String resposta = task.getException().toString();
                    Util.opcoesErro(getBaseContext(), resposta);
                }
            }
        });

    }
}
