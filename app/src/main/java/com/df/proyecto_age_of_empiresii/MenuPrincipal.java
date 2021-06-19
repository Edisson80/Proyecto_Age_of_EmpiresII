package com.df.proyecto_age_of_empiresii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnCivilization;
    private ImageButton btnUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnCivilization = findViewById(R.id.btnCivilization);
        btnUnit = findViewById(R.id.btnUnit);

        btnCivilization.setOnClickListener(this);
        btnUnit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnCivilization){
            Intent abrirCivilizaciones = new Intent(this, MainActivity.class);
            startActivity(abrirCivilizaciones);
        }else if(v.getId() == R.id.btnUnit){
            Intent abrirUnit = new Intent(this, UnitActivity.class);
            startActivity(abrirUnit);
        }
    }
}