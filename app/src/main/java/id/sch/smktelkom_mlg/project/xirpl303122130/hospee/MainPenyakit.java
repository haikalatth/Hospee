package id.sch.smktelkom_mlg.project.xirpl303122130.hospee;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter.GiziAdapter;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter.PenyakitAdapter;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Gizi;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Penyakit;

public class MainPenyakit extends AppCompatActivity {

    public static final String PENYAKIT = "penyakit";
    ArrayList<Penyakit> mListPenyakit = new ArrayList<>();
    PenyakitAdapter mAdapterPenyakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_penyakit);

        RecyclerView recyclerViewPenyakit = (RecyclerView) findViewById(R.id.recyclerViewPenyakit);
        LinearLayoutManager layoutManagerPenyakit = new LinearLayoutManager(this);
        recyclerViewPenyakit.setLayoutManager(layoutManagerPenyakit);
        mAdapterPenyakit = new PenyakitAdapter(this, mListPenyakit);
        recyclerViewPenyakit.setAdapter(mAdapterPenyakit);

        fillDataPenyakit();
    }

    private void fillDataPenyakit() {
        Resources resources = getResources();
        String[] arJudulPenyakit = resources.getStringArray(R.array.Penyakit);
        String[] arDeskripsiPenyakit = resources.getStringArray(R.array.deskripsi_penyakit);
        TypedArray a = resources.obtainTypedArray(R.array.gambar_penyakit);
       Drawable[] arFotoPenyakit = new Drawable[a.length()];
        for (int i = 0; i < arFotoPenyakit.length; i++) {
            arFotoPenyakit[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudulPenyakit.length; i++) {
            mListPenyakit.add(new Penyakit(arJudulPenyakit[i], arDeskripsiPenyakit[i], arFotoPenyakit[i]));
        }
        mAdapterPenyakit.notifyDataSetChanged();
    }


}