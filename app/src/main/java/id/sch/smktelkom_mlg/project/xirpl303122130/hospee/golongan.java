package id.sch.smktelkom_mlg.project.xirpl303122130.hospee;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter.DarahAdapter;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.darah;

public class golongan extends AppCompatActivity {

    ArrayList<darah> mList1 = new ArrayList<>();
    DarahAdapter mAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golongan);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter1 = new DarahAdapter(mList1);
        recyclerView.setAdapter(mAdapter1);

        fillData();

    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul1 = resources.getStringArray(R.array.darah);
        String[] arDeskripsi1 = resources.getStringArray(R.array.desc_darah);
        TypedArray a = resources.obtainTypedArray(R.array.picture_darah);
        Drawable[] arFoto1 = new Drawable[a.length()];
        for (int i = 0; i < arFoto1.length; i++)
        {
            arFoto1[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudul1.length; i++)
        {
            mList1.add(new darah(arJudul1[i], arDeskripsi1[i], arFoto1[i]));
        }
        mAdapter1.notifyDataSetChanged();
    }


}
