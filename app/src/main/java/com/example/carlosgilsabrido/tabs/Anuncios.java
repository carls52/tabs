package com.example.carlosgilsabrido.tabs;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by Carlos Gil Sabrido on 02/01/2018.
 */

public class Anuncios implements Serializable {
    public String nombre;
    public String descript;
    public String cost;
    public int image;
    public int phone;

    public Anuncios ( String nombre, String cost, String descript,int image, int phone)
    {
        this.nombre = nombre;
        this.descript = descript;
        this.cost = cost;
        this.image = image;
        this.phone = phone;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescript() {
        return descript;
    }
    public String getCost() {
        return cost;
    }
    public int getImage() {
        return image;
    }
    public int getPhone() {
        return phone;
    }
    public void setNombre(String name) {
        this.nombre= name;
    }
    public void setDescript(String descript) {
        this.descript=descript;
    }
    public void setCost(String cost) {
        this.cost= cost;
    }
    public void setImage(int Image) {
        this.image=Image;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getId(){
        return nombre.hashCode();
    }

    public static Anuncios[] ITEMS = {
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.jaguar_xe,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789),
            new Anuncios("Anuncio","100","BLA BLA BLA BLA", R.drawable.ic_image_black_48dp,654123789)
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Anuncio
     */
    public static Anuncios getItem(int id) {
        for (Anuncios item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}