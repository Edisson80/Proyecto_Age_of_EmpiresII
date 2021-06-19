package com.df.proyecto_age_of_empiresii;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.proyecto_age_of_empiresii.Models.Civilization;

import java.util.List;

public class CivilizationAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Civilization> myCivilizations;

    public CivilizationAdapter(Activity activity, List<Civilization> civilizationList) {
        this.activity = activity;
        this.myCivilizations = civilizationList;
    }

    @Override
    public int getCount() {
        return myCivilizations.size();
    }

    @Override
    public Object getItem(int position) {
        return myCivilizations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.civilization_item, null);
        }
        Civilization civilization = myCivilizations.get(position);
        TextView nameCivilization = view.findViewById(R.id.tvName);
        nameCivilization.setText(civilization.getNameCivilization());

        TextView idCivilization = view.findViewById(R.id.tvId);
        idCivilization.setText(civilization.getIdCivilization());
        return view;
    }

}
