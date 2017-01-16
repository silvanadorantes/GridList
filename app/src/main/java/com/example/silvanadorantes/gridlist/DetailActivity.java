package com.example.silvanadorantes.gridlist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_PARAM_ID = "com.example.silvanadorantes.gridlist.extra.ID";
    public static final String VIEW_NAME_HEADER_IMAGE = "imagen_compartida";
    private Outfit detalleOutfit;
    private ImageView imagenDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Seleccionaste este Outfit", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        detalleOutfit = Outfit.getOufits(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));
        imagenDetalle = (ImageView) findViewById(R.id.imagen_detalle);
        Glide.with(imagenDetalle.getContext())
                .load(detalleOutfit.getImagen())
                .into(imagenDetalle);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.action_settings:

                Snackbar.make(findViewById(R.id.coordinator_detail), "se abren los ajustes", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();



                return true;



            case R.id.action_favorite:

                Snackbar.make(findViewById(R.id.coordinator_detail), "Añadir a tus  Favoritos", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }



}
