package com.df.proyecto_age_of_empiresii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.df.proyecto_age_of_empiresii.ApiManager.RetrofitClient;
import com.df.proyecto_age_of_empiresii.Models.Civilizations;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listCivilizations;
    Civilizations myCivilizations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listCivilizations = findViewById(R.id.listCivilizations);
        getFromInternetCivilizations();
        listCivilizations.setOnItemClickListener(this);
    }
    private void getFromInternetCivilizations(){
        Call<Civilizations> call = RetrofitClient.getInstance().getMyApi().getCivilizations();
        call.enqueue(new Callback<Civilizations>() {
            @Override
            public void onResponse(Call<Civilizations> call, Response<Civilizations> response) {
                myCivilizations = response.body();
                String message = "";
                CivilizationAdapter adapter = new CivilizationAdapter(MainActivity.this, myCivilizations.getCivilizationList());
                listCivilizations.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Civilizations> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error",Toast.LENGTH_SHORT).show();
            }

            });
        }
           @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
               Intent intent = new Intent(this, ActivityCivilizationDetail.class);
               intent.putExtra("object",myCivilizations.getCivilizationList().get(position));
               startActivity(intent);

            }
}