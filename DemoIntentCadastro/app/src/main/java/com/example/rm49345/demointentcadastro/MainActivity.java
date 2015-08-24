package com.example.rm49345.demointentcadastro;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verPessoaFisica(View v) {
        Intent i = new Intent(getApplicationContext(), PessoaFisicaActivity.class);
        startActivity(i);
    }

    public  void verPessoaJuridica(View v) {
        Intent i = new Intent(getApplicationContext(), PessoaJuridicaActivity.class);
        startActivity(i);
    }
}
