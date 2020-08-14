package com.example.login_hardecode;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView TextoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextoTextView = findViewById(R.id.tMensagem);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        exibir();
    }

    private void exibir(){

        Intent intent = getIntent();
        Bundle embrulho = intent.getExtras();

        double arg1 = embrulho.getDouble(MainActivity.KEY_LOGIN);
        double arg2 = embrulho.getDouble(MainActivity.KEY_SENHA);

        if(arg1 == 3000524 && arg2 == 4250003) {
            TextoTextView.setText("Bem vindo 3000524");
        }else {
            TextoTextView.setText("Erro no login");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
