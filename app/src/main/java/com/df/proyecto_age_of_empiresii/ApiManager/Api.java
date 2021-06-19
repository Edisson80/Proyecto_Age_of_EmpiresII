package com.df.proyecto_age_of_empiresii.ApiManager;

import com.df.proyecto_age_of_empiresii.Models.Civilization;
import com.df.proyecto_age_of_empiresii.Models.Civilizations;
import com.df.proyecto_age_of_empiresii.Models.Unit;
import com.df.proyecto_age_of_empiresii.Models.Units;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    String BASE_URL = "https://age-of-empires-2-api.herokuapp.com/api/v1/";

    @GET("civilizations")
    Call<Civilizations> getCivilizations();

    @GET("civilization/{id}")
    Call<Civilization> getCivilization(@Path("id") String id);

    @GET("units")
    Call<Units> getUnits();

    @GET("unit/{id}")
    Call<Unit> getUnit(@Path("id") int id);

}
