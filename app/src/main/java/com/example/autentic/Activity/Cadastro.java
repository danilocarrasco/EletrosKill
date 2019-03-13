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

import com.example.autentic.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Cadastro extends AppCompatActivity implements View.OnClickListener {

    private Button btnCancelar;
    private Button btncadastrar;

    private EditText cademail, cadsenha1, cadsenha2, cadnome;

    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnCancelar = ( Button ) findViewById(R.id.btncancelar);
        btncadastrar = ( Button ) findViewById(R.id.btncadastrar);

        cademail = ( EditText ) findViewById(R.id.cademail);
        cadsenha1 = ( EditText ) findViewById(R.id.cadsenha1);
        cadsenha2 = ( EditText ) findViewById(R.id.cadsenha2);
        cadnome = ( EditText ) findViewById(R.id.cadnome);

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

        String email = cademail.getText().toString().trim();
        String senha1 = cadsenha1.getText().toString().trim();
        String senha2 = cadsenha2.getText().toString().trim();

        if (email.isEmpty() || senha1.isEmpty() || senha2.isEmpty()) {

            Toast.makeText(this, "Preencha os campos Obrigatórios!", Toast.LENGTH_LONG).show();

        } else {

            if (senha1.contentEquals(senha2)) {

                if (Util.verificarInternet(this)) {

                    criaUsuario(email, senha1);

                }else {

                    Toast.makeText(this, "Erro - Verifique se sua WIffi ou 3g esta funcionando", Toast.LENGTH_LONG).show();

                }
            }else {

                Toast.makeText(this, "Incongruência nas senhas!", Toast.LENGTH_LONG).show();

            }
        }
    }

    private  void criaUsuario(final String email, final String senha){

        auth.createUserWithEmailAndPassword(email, senha).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){

                    Toast.makeText(getBaseContext(), "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();


                }else {

                    String resposta = task.getException().toString();
                    Util.opcoesErro(getBaseContext(), resposta);
                }
            }
        });

    }
}
