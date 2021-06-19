package com.df.proyecto_age_of_empiresii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.df.proyecto_age_of_empiresii.ApiManager.RetrofitClient;
import com.df.proyecto_age_of_empiresii.Models.Unit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UnitDetail extends AppCompatActivity {

    private TextView txtNameUnit;
    private TextView txtDescription;
    private TextView txtExpansion;
    private TextView txtAge;
    private TextView txtBuild_time;
    private TextView txtReload_time;
    private TextView txtAttack_Delay;
    private TextView txtMovement_rate;
    private TextView txtLine_of_sight;
    private TextView txtHit_points;
    private TextView txtAttack;
    private TextView txtArmor;
    private TextView txtAccuracy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_detail);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        txtNameUnit = findViewById(R.id.txtNameUnit);
        txtDescription = findViewById(R.id.txtDescription);
        txtExpansion = findViewById(R.id.txtExpansion);
        txtAge = findViewById(R.id.txtAge);
        txtBuild_time = findViewById(R.id.txtBuild_time);
        txtReload_time = findViewById(R.id.txtReload_time);
        txtAttack_Delay = findViewById(R.id.txtAttack_delay);
        txtMovement_rate = findViewById(R.id.txtMovement_rate);
        txtLine_of_sight = findViewById(R.id.txtLine_of_sight);
        txtHit_points = findViewById(R.id.txtHit_points);
        txtAttack = findViewById(R.id.txtAttack);
        txtArmor = findViewById(R.id.txtArmor);
        txtAccuracy = findViewById(R.id.txtAccuracy);
        getUnitById(id);
    }

    private void getUnitById(int id) {
        Call<Unit> call = RetrofitClient.getInstance().getMyApi().getUnit(id);
        call.enqueue(new Callback<Unit>() {
            @Override
            public void onResponse(Call<Unit> call, Response<Unit> response) {
                Unit unit = response.body();
                txtNameUnit.setText("Nombre: "+unit.getName());
                txtDescription.setText("Descipcion: "+unit.getDescription());
                txtExpansion.setText("Expancion: "+unit.getExpansion());
                txtAge.setText("Edad: "+unit.getAge());
                txtBuild_time.setText("Tempo de construccion: "+String.valueOf(unit.getBuild_time()));
                txtReload_time.setText("Tiempo de reubicacion: "+String.valueOf(unit.getReload_time()));
                txtAttack_Delay.setText("Retraso del ataque: "+String.valueOf(unit.getAttack_delay()));
                txtMovement_rate.setText("Tasa de movimiento: "+String.valueOf(unit.getMovement_rate()));
                txtLine_of_sight.setText("Linea de vision: "+String.valueOf(unit.getLine_of_sight()));
                txtHit_points.setText("Puntos de golpe: "+String.valueOf(unit.getHit_points()));
                txtAttack.setText("Ataque: "+String.valueOf(unit.getAttack()));
                txtArmor.setText("Armadura: "+unit.getArmor());
                txtAccuracy.setText("Precision: "+unit.getAccuracy());
            }

            @Override
            public void onFailure(Call<Unit> call, Throwable t) {

            }
        });
    }
}