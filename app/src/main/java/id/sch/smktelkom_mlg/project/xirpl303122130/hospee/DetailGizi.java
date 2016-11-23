package id.sch.smktelkom_mlg.project.xirpl303122130.hospee;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetailGizi extends AppCompatActivity {

    public static final String GIZI = MainGizi.GIZI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gizi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /*Gizi gizi = (Gizi) getIntent().getSerializableExtra(GIZI);
        setTitle(gizi.judulGizi);
        ImageView ivFoto = (ImageView) findViewById(R.id.imageFotoGizi);
        ivFoto.setImageURI(Uri.parse(gizi.fotoGizi));
        TextView tvdes = (TextView) findViewById(R.id.gizi_detail);
        tvdes.setText(gizi.deskripsiGizi);
        TextView tvlok = (TextView) findViewById(R.id.gizi_manfaat);
        tvlok.setText(gizi.manfaatGizi);*/
    }
}
