package id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model;

import android.graphics.drawable.Drawable;

/**
 * Created by asus on 23-Nov-16.
 */

public class Gizi {
    public String judulGizi;
    public String deskripsiGizi;
    public Drawable fotoGizi;

    public Gizi(String judulGizi, String deskripsiGizi,
                Drawable fotoGizi) {
        this.judulGizi = judulGizi;
        this.deskripsiGizi = deskripsiGizi;
        this.fotoGizi = fotoGizi;
    }
}
