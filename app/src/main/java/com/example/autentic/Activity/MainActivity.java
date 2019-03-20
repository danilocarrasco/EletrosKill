package com.example.autentic.Activity;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.example.autentic.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.zxing.qrcode.encoder.QRCode;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth auth;

    private EditText edtEmailLogin;
    private EditText edtSenhaLogin;
    BootstrapButton btnLogin;
    BootstrapButton btnNovo;
    BootstrapButton btnRedefine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        edtEmailLogin = ( EditText ) findViewById(R.id.edtemail);
        edtSenhaLogin = ( EditText ) findViewById(R.id.edtsenha);

        //BOTOES
        btnLogin = (BootstrapButton) findViewById(R.id.btnlogin);
        btnNovo = (BootstrapButton) findViewById(R.id.btnnovo);
        btnRedefine = (BootstrapButton) findViewById(R.id.btnredefinir);

        auth = FirebaseAuth.getInstance();

        btnLogin.setOnClickListener(this);
        btnNovo.setOnClickListener(this);
        btnRedefine.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnlogin:

                loginEmail();

                break;

            case R.id.btnnovo:
                Intent intent = new Intent(this, Cadastro.class);
                startActivity(intent);
                finish();

                break;

            case R.id.btnredefinir:

                recuperarSenha();

                break;
        }
    }


    private void recuperarSenha(){

        String email = edtEmailLogin.getText().toString().trim();

        if(email.isEmpty()){

            Toast.makeText(this, "Insira pelo menos o e-mail para recuperar a senha.", Toast.LENGTH_LONG).show();

        }else {

            enviarEmail(email);

        }

    }

    private void enviarEmail(String email){

        auth.sendPasswordResetEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {

                Toast.makeText(getBaseContext(), "Enviamos uma mensagem para o e-mail cadastrado acima.", Toast.LENGTH_LONG).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                String Erro = e.toString();

                Util.opcoesErro(getBaseContext(), Erro);

            }
        });

    }

    private void loginEmail(){

        String email = edtEmailLogin.getText().toString().trim();
        String senha = edtSenhaLogin.getText().toString().trim();

        if(email.isEmpty() || senha.isEmpty()){

            Toast.makeText(this, "Insira os campos obrigatórios!", Toast.LENGTH_LONG).show();
        }else {

            if(Util.verificarInternet(this)){

                ConnectivityManager conexao =  ( ConnectivityManager ) getSystemService(CONNECTIVITY_SERVICE);

                confirmarLoginSenha(email, senha);

            }else {

                Toast.makeText(this, "Certifique-se de que seu dispositivo está conectado a internet.", Toast.LENGTH_LONG).show();
            }

        }

    }

    private void confirmarLoginSenha(String email, String senha) {
        auth.signInWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // se login ok, ira direcionar para a activity principal
                    Intent intent = new Intent(MainActivity.this, Qrcode.class);
                    startActivity(intent);
                    Toast.makeText(getBaseContext(), "Login efetuado com sucesso!", Toast.LENGTH_SHORT).show();
                    finish();  //para nao retornar para tela de login
                } else {
                    String resposta = task.getException().toString();
                    Util.opcoesErro(getBaseContext(), resposta);
                    // Toast.makeText(getBaseContext(), "Erro ao logar Usuario!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
