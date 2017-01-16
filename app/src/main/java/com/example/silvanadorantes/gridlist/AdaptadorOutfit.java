package com.example.silvanadorantes.gridlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by silvana on 03/03/16.
 */
public class AdaptadorOutfit extends BaseAdapter {
    private Context context;

    public AdaptadorOutfit(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return Outfit.outfits.length;
    }

    @Override
    public Outfit getItem(int i) {
        return Outfit.outfits[i];
    }

    @Override
    public long getItemId(int i) {
        return getItem(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_outfit, viewGroup, false);
        }

        ImageView imagenOutfit = (ImageView) view.findViewById(R.id.image_outfit);
        TextView nombreOutfit = (TextView) view.findViewById(R.id.nombre_outfit);
        final Outfit o = getItem(i);
        Glide.with(imagenOutfit.getContext())
                .load(o.getImagen())
                .into(imagenOutfit);

        nombreOutfit.setText(o.getNombre());
        return view;
    }
}
