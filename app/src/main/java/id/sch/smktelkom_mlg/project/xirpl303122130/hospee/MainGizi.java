package id.sch.smktelkom_mlg.project.xirpl303122130.hospee;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter.GiziAdapter;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Gizi;

public class MainGizi extends AppCompatActivity implements GiziAdapter.IGiziAdapter {

    public static final String GIZI = "gizi";
    ArrayList<Gizi> mListGizi = new ArrayList<>();
    GiziAdapter mAdapterGizi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gizi);

        RecyclerView recyclerViewGizi = (RecyclerView) findViewById(R.id.recyclerViewGizi);
        LinearLayoutManager layoutManagerGizi = new LinearLayoutManager(this);
        recyclerViewGizi.setLayoutManager(layoutManagerGizi);
        mAdapterGizi = new GiziAdapter(this, mListGizi);
        recyclerViewGizi.setAdapter(mAdapterGizi);

        fillDataGizi();
    }

    private void fillDataGizi() {
        Resources resources = getResources();
        String[] arJudulGizi = resources.getStringArray(R.array.gizi);
        String[] arDeskripsiGizi = resources.getStringArray(R.array.gizi_desc);
        String[] arManfaatGizi = resources.getStringArray(R.array.gizi_manfaat);
        TypedArray a = resources.obtainTypedArray(R.array.gizi_picture);
        String[] arFotoGizi = new String[a.length()];
        for (int i = 0; i < arFotoGizi.length; i++) {
            int id = a.getResourceId(i, 0);
            arFotoGizi[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + '/'
                    + resources.getResourceTypeName(id) + '/'
                    + resources.getResourceEntryName(id);
        }
        a.recycle();

        for (int i = 0; i < arJudulGizi.length; i++) {
            mListGizi.add(new Gizi(arJudulGizi[i], arDeskripsiGizi[i], arManfaatGizi[i], arFotoGizi[i]));
        }
        mAdapterGizi.notifyDataSetChanged();
    }

    @Override
    public void doClickGizi(int pos) {
        findViewById(R.id.bNextPenyakit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainGizi.this, DetailGizi.class));
            }
        });
    }
}
