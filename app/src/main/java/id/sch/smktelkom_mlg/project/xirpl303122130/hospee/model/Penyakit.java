package id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Mic on 24/11/2016.
 */

public class Penyakit {

    public String judulPenyakit;
    public String deskripsiPenyakit;
    public Drawable fotoPenyakit;

    public Penyakit(String judulPenyakit, String deskripsiPenyakit, Drawable fotoPenyakit) {
        this.judulPenyakit = judulPenyakit;
        this.deskripsiPenyakit = deskripsiPenyakit;
        this.fotoPenyakit = fotoPenyakit;
    }
}


