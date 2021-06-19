package com.df.proyecto_age_of_empiresii;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.proyecto_age_of_empiresii.Models.Unit;

import java.util.List;

public class UnitAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Unit> myUnits;

    public UnitAdapter(Activity activity, List<Unit> myUnits) {
        this.activity = activity;
        this.myUnits = myUnits;
    }

    @Override
    public int getCount() {
        return myUnits.size();
    }

    @Override
    public Object getItem(int position) {
        return myUnits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.unit_item,null);
        }
        Unit unit = myUnits.get(position);
        TextView nombreUnit = view.findViewById(R.id.txtNombreUnit);
        nombreUnit.setText(unit.getName());
        return view;
    }
}
