package com.example.carlosgilsabrido.tabs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;



/**
 * Actividad que muestra la imagen del item extendida
 */
public class muestra extends AppCompatActivity {


    private Anuncios itemDetallado;
    private ImageView imagenExtendida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_muestra);

        //usarToolbar();

        // Obtener el coche con el identificador establecido en la actividad principal
       // itemDetallado = Anuncios.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));
        //Anuncios item = (Anuncios) getIntent().getSerializableExtra("item");
       imagenExtendida = (ImageView) findViewById(R.id.imagen_extendida);
       imagenExtendida.setImageResource(R.drawable.ic_account_circle_black_24dp);

    }


    private void usarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}