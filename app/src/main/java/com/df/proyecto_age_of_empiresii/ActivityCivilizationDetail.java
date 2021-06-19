package com.df.proyecto_age_of_empiresii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.df.proyecto_age_of_empiresii.Models.Civilization;

public class ActivityCivilizationDetail extends AppCompatActivity {
TextView tvname;
TextView tvexpancion;
TextView tvtipoArma;
TextView tvcivilization_bonus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilization_detail);
        Civilization civilization = (Civilization) getIntent().getSerializableExtra("object");

        tvname = findViewById(R.id.tvNombre);
        tvname.setText("Nombre: "+civilization.getNameCivilization());
        tvexpancion = findViewById(R.id.tvExpansion);
        tvexpancion.setText("Expancion: "+civilization.getExpansion());
        tvtipoArma = findViewById(R.id.tvArmy_type);
        tvtipoArma.setText("Tipo de arma : "+civilization.getArmy_type());
        tvcivilization_bonus = findViewById(R.id.tvCivilization_Bonus);
        tvcivilization_bonus.setText("Bono: "+civilization.getTeam_bonus());
    }
}