package id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.R;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.darah;

/**
 * Created by andini on 20/11/2016.
 */

public class DarahAdapter extends RecyclerView.Adapter<DarahAdapter.ViewHolder> {
    ArrayList<darah> darahArrayList;

    public DarahAdapter(ArrayList<darah> darahArrayList) {
        this.darahArrayList = darahArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list1, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        darah Darah = darahArrayList.get(position);
        holder.tvJudul1.setText(Darah.judul1);
        holder.tvJudul1.setText(Darah.deskripsi1);
        holder.ivFoto1.setImageDrawable(Darah.foto1);

    }

    @Override
    public int getItemCount() {
        if (darahArrayList != null)
            return darahArrayList.size();
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
