package id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.R;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Gizi;

/**
 * Created by asus on 19-Nov-16.
 */

public class GiziAdapter extends RecyclerView.Adapter<GiziAdapter.ViewHolder> {
    ArrayList<Gizi> giziList;

    public GiziAdapter(ArrayList<Gizi> giziList) {
        this.giziList = giziList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Gizi gizi = giziList.get(position);
        holder.tvJudul.setText(gizi.judul);
        holder.tvDeskripsi.setText(gizi.deskripsi);
        holder.ivFoto.setImageDrawable(gizi.foto);

    }

    @Override
    public int getItemCount() {
        if (giziList != null)
            return giziList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
