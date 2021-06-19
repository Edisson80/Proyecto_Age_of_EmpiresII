package com.df.proyecto_age_of_empiresii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.df.proyecto_age_of_empiresii.ApiManager.RetrofitClient;
import com.df.proyecto_age_of_empiresii.Models.Units;

import es.dmoral.toasty.Toasty;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UnitActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvUnits;
    Units myUnits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);
        lvUnits = findViewById(R.id.lvUnits);
        getUnitsfromApi();
        lvUnits.setOnItemClickListener(this);
    }

    private void getUnitsfromApi() {
        Call<Units> call = RetrofitClient.getInstance().getMyApi().getUnits();
        call.enqueue(new Callback<Units>() {
            @Override
            public void onResponse(Call<Units> call, Response<Units> response) {
                myUnits = response.body();
                UnitAdapter adapter = new UnitAdapter(UnitActivity.this, myUnits.getUnitList());
                lvUnits.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Units> call, Throwable t) {
                Toasty.error(getApplicationContext(), "Ocurrió un error", Toast.LENGTH_SHORT, true).show();

            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,UnitDetail.class);
        intent.putExtra("id",myUnits.getUnitList().get(position).getId());
        startActivity(intent);
    }
}