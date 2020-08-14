package com.example.login_hardecode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String KEY_LOGIN = "login";
    public static final String KEY_SENHA = "senha";

    private EditText TextoUsuarioEditText;
    private EditText TextoSenhaEditText;
    private Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextoUsuarioEditText = findViewById(R.id.tLogin);
        TextoSenhaEditText = findViewById(R.id.tSenha);
        LoginButton = findViewById(R.id.btLogin);

        LoginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == LoginButton){
            mostrarTexto();
        }
    }

    private void mostrarTexto(){
        double login, senha;
        try{
            login = Double.valueOf(TextoUsuarioEditText.getText().toString());
            senha = Double.valueOf(TextoSenhaEditText.getText().toString());
        }catch (NumberFormatException nfe){
            login = 0;
            senha = 0;
        }

        if(login != 0 && senha != 0){

            Bundle args = new Bundle();

            args.putDouble(KEY_LOGIN, login);
            args.putDouble(KEY_SENHA, senha);

            Intent intent = new Intent(this, MainActivity2.class);

            intent.putExtras(args);

            startActivity(intent);
        }else{
            Toast.makeText(this, "Os campos usuario e senha devem ser preenchidos!", Toast.LENGTH_SHORT).show();
        }
    }
}