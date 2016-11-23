package id.sch.smktelkom_mlg.project.xirpl303122130.hospee;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter.GoldarAdapter;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Goldar;

public class MainGoldar extends AppCompatActivity {
    ArrayList<Goldar> mList = new ArrayList<>();
    GoldarAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_goldar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new GoldarAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudulGoldar = resources.getStringArray(R.array.darah);
        String[] arDeskripsiGoldar = resources.getStringArray(R.array.darah_desc);
        TypedArray b = resources.obtainTypedArray(R.array.darah_picture);
        Drawable[] arFotoGoldar = new Drawable[b.length()];
        for (int i = 0; i < arFotoGoldar.length; i++) {
            arFotoGoldar[i] = b.getDrawable(i);
        }
        b.recycle();

        for (int i = 0; i < arJudulGoldar.length; i++) {
            mList.add(new Goldar(arJudulGoldar[i], arDeskripsiGoldar[i], arFotoGoldar[i]));
        }
        mAdapter.notifyDataSetChanged();
    }
}















