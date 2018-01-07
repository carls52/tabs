package com.example.carlosgilsabrido.tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

//CASA
public class TabFragment3 extends Fragment {
    Activity context;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context=getActivity();
        View layout = inflater.inflate(R.layout.tab_fragment_3, container,false);

        GridView gridView = (GridView)layout.findViewById(R.id.grid);
        GridAdapter booksAdapter = new GridAdapter(layout.getContext());
        gridView.setAdapter(booksAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Anuncios item = (Anuncios) parent.getItemAtPosition(position);
                    //salto();
                Toast to = Toast.makeText(getContext(),"hola",Toast.LENGTH_LONG);

                //intent.putExtra("item",item.getId());
            }
        });
        return layout;
    }

    public void salto() {
        Intent intent = new Intent (getActivity(), muestra.class);
        startActivity(intent);
    }
    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tab_fragment_3, container, false);
    }*/

}