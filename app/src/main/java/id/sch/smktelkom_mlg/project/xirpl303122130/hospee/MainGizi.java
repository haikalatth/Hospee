package id.sch.smktelkom_mlg.project.xirpl303122130.hospee;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter.GiziAdapter;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Gizi;

public class MainGizi extends AppCompatActivity {

    ArrayList<Gizi> mListGizi = new ArrayList<>();
    GiziAdapter mAdapterGizi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gizi);

        RecyclerView recyclerViewGizi = (RecyclerView) findViewById(R.id.recyclerViewGizi);
        LinearLayoutManager layoutManagerGizi = new LinearLayoutManager(this);
        recyclerViewGizi.setLayoutManager(layoutManagerGizi);
        mAdapterGizi = new GiziAdapter(mListGizi);
        recyclerViewGizi.setAdapter(mAdapterGizi);

        fillDataGizi();
    }

    private void fillDataGizi() {
        Resources resources = getResources();
        String[] arJudulGizi = resources.getStringArray(R.array.gizi);
        String[] arDeskripsiGizi = resources.getStringArray(R.array.gizi_desc);
        TypedArray a = resources.obtainTypedArray(R.array.gizi_picture);
        Drawable[] arFotoGizi = new Drawable[a.length()];
        for (int i = 0; i < arFotoGizi.length; i++) {
            arFotoGizi[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudulGizi.length; i++) {
            mListGizi.add(new Gizi(arJudulGizi[i], arDeskripsiGizi[i], arFotoGizi[i]));
        }
        mAdapterGizi.notifyDataSetChanged();
    }
}
