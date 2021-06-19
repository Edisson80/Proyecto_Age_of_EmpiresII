package com.df.proyecto_age_of_empiresii;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.df.proyecto_age_of_empiresii.ApiManager.RetrofitClient;
import com.df.proyecto_age_of_empiresii.Models.Civilization;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Civilizaciones extends AppCompatActivity {
    private String id;

    @Override
    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_civilization_detail);
        Bundle in = getIntent().getExtras();
        id = in.getString("id");
        getCivilizationById(id);

    }

    private void getCivilizationById(String id) {
        Call<Civilization> call = RetrofitClient.getInstance().getMyApi().getCivilization(id);
        call.enqueue(new Callback<Civilization>() {
            @Override
            public void onResponse(Call<Civilization> call, Response<Civilization> response) {
                Civilization myCivilization = response.body();
                Toast.makeText(getApplicationContext(),myCivilization.getIdCivilization(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Civilization> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
