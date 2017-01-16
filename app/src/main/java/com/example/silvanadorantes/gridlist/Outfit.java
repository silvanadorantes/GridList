package com.example.silvanadorantes.gridlist;

/**
 * Created by silvana on 03/03/16.
 */
public class Outfit {

    private String nombre;
    private int imagen;

    public Outfit(String nombre, int imagen){
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    // metodo en donde se obtiene el codigo
    public int getId(){
        return nombre.hashCode();
    }

    // asignacion de la data

    public static Outfit[] outfits = {

            new Outfit("Outfit Trendy", R.drawable.outfit_2),
            new Outfit("Outfit de Gala", R.drawable.outfit_3),
            new Outfit("Outfit Nocturno", R.drawable.outfit_1),
            new Outfit("Outfit Ejecutivo", R.drawable.outfit_6),
            new Outfit("Outfit Invierno", R.drawable.outfit_13),
            new Outfit("Outfit Pink", R.drawable.outfit_14),
            new Outfit("Outfit Relax", R.drawable.outfit_15),
            new Outfit("Outfit Black", R.drawable.outfit_18),
            new Outfit("Outfit Purple", R.drawable.outfit_20),
            new Outfit("Outfit Urbano", R.drawable.outfit_21),
            new Outfit("Outfit Cita ", R.drawable.outfit_25),
            new Outfit("Outfit Rockero", R.drawable.outfit_27),

    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return outfit
     */

    public static Outfit getOufits(int id){
        for (Outfit o : outfits){
            if (o.getId() == id){
                return o;
            }
        }

        return null;
    }




}
