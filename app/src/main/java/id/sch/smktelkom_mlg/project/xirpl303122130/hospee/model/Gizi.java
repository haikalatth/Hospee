package id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model;

import java.io.Serializable;

/**
 * Created by asus on 23-Nov-16.
 */

public class Gizi implements Serializable {
    public String judulGizi;
    public String deskripsiGizi;
    public String manfaatGizi;
    public String fotoGizi;

    public Gizi(String judulGizi, String deskripsiGizi,
                String manfaatGizi, String fotoGizi) {
        this.judulGizi = judulGizi;
        this.manfaatGizi = manfaatGizi;
        this.deskripsiGizi = deskripsiGizi;
        this.fotoGizi = fotoGizi;
    }
}
