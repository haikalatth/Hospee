package id.sch.smktelkom_mlg.project.xirpl303122130.hospee;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter.golonganAdapter;

public class golongan extends AppCompatActivity {

    ArrayList<golongan> mList1 = new ArrayList<>();
    golonganAdapter mAdapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golongan);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter1 = new golonganAdapter(mList1);
        recyclerView.setAdapter(mAdapter1);

        fillDataku();
    }

    private void fillDataku() {
        Resources resources1 = getResources();
        String[] arJudul1 = resources1.getStringArray(R.array.golongan);
        String[] arDeskripsi1 = resources1.getStringArray(R.array.desc_golongan);
        TypedArray a = resources1.obtainTypedArray(R.array.picture_golongan);
        Drawable[] arFoto1 = new Drawable[a.length()];
        for (int i = 0; i < arFoto1.length; i++)
        {
            arFoto1[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudul1.length; i++)
        {
            mList1.add(new golongan(arJudul1[i], arDeskripsi1[i], arFoto1[i]));
        }
        mAdapter1.notifyDataSetChanged();

    }
}
