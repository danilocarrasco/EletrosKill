package com.example.autentic.Activity;



/* Classe usada para melhorar o código, enxugar as classes. os métodos relacionados em tratar erros de login e de
   conexao de internet */

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;
import static android.content.Context.CONNECTIVITY_SERVICE;

public class Util {





    //metodo que certifica que realmente o aparelho esta sem internet, retornando um boolean(true || false)
    public static  boolean verificarInternet(Context context) {

        //carregando servico do sistema de rede na variavel conexao
        ConnectivityManager conexao = ( ConnectivityManager ) context.getSystemService(CONNECTIVITY_SERVICE);
        //carregando informação de rede na variavel informação
        NetworkInfo informacao = conexao.getActiveNetworkInfo();

        if(informacao != null && informacao.isConnected()) {

            return true;

        } else {

            return false;
        }

    }


    //metodo de tratamento de erro durante o logar do cliente no app..  sempre retornado pelo firebase na variavel resposta
    public static void opcoesErro(Context context, String resposta) {

        if (resposta.contains("least 6 characters")) {

            Toast.makeText(context, "Digite senha maior que 5 caracteres!!", Toast.LENGTH_LONG).show();

        } else if (resposta.contains("address is badly")) {

            Toast.makeText(context, "Email inválido!!", Toast.LENGTH_LONG).show();

        } else if (resposta.contains("interrupted connection")) {

            Toast.makeText(context, "Sem conexção com o Firebase!!", Toast.LENGTH_LONG).show();

        } else if (resposta.contains("password is invalid")) {

            Toast.makeText(context, "Senha invalida!!", Toast.LENGTH_LONG).show();

        } else  if(resposta.contains("There is no user")){

            Toast.makeText(context, "Este E-mail nao cadastrado ainda!!", Toast.LENGTH_LONG).show();

        } else if (resposta.contains("address is already")) {

            Toast.makeText(context, "E-mail já existe na base de dados!!", Toast.LENGTH_LONG).show();

        }else {

            Toast.makeText(context, resposta, Toast.LENGTH_LONG).show();

        }

    }

}

