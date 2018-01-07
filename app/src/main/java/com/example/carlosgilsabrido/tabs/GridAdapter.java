package com.example.carlosgilsabrido.tabs;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    private Context mContext;



    ArrayList<Anuncios> list;

    public GridAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return Anuncios.ITEMS.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return Anuncios.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        Anuncios prueba = Anuncios.ITEMS[position];
        long a = prueba.getItem(position).getId();
        return a;
    }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
      if (convertView == null) {
          LayoutInflater inflater = (LayoutInflater) mContext
                  .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          convertView = inflater.inflate(R.layout.grid_single, parent, false);
      }
       // View salida = inflater.inflate(R.layout.grid_single,parent ,false);
        TextView t1 = convertView.findViewById(R.id.grid_text);

        TextView t2 = convertView.findViewById(R.id.grid_text3);

        ImageView Im1 = convertView.findViewById(R.id.grid_image);

        final Anuncios item = Anuncios.ITEMS[position] ;

        t1.setText(item.getNombre());
        t2.setText(item.getCost());
        Im1.setImageResource(item.getImage());
     /* TextView dummyTextView = new TextView(mContext);
      ImageView hola = new ImageView(mContext);
      hola.setImageResource(imageId[position]);
      dummyTextView.setText(web[position]);*/
      return convertView;
  }
    }

