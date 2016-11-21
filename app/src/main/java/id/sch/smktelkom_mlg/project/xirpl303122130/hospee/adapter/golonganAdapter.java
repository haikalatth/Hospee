package id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.R;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.golongan;

/**
 * Created by user on 21/11/2016.
 */

public class golonganAdapter extends RecyclerView.Adapter<golonganAdapter.ViewHolder> {
    ArrayList<golongan> golonganArrayList;

    public golonganAdapter(ArrayList<golongan> golonganArrayList) {
        this.golonganArrayList = golonganArrayList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list1, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        golongan Golongan = golonganArrayList.get(position);
        holder.tvJudul1.setText(Golongan.judul1);
        holder.tvDeskripsi1.setText(Golongan.deskripsi1);
        holder.ivFoto1.setImageDrawable(Golongan.foto1);
    }

    @Override
    public int getItemCount() {
        if (golonganArrayList != null)
            return golonganArrayList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivFoto1;
        TextView tvJudul1;
        TextView tvDeskripsi1;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto1 = (ImageView) itemView.findViewById(R.id.imageView1);
            tvJudul1 = (TextView) itemView.findViewById(R.id.textViewJudul1);
            tvDeskripsi1 = (TextView) itemView.findViewById(R.id.textViewDeskripsi1);
        }
    }
}
