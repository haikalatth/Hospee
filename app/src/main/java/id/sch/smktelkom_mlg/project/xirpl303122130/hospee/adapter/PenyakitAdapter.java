package id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.MainPenyakit;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.R;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Gizi;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Penyakit;

/**
 * Created by Mic on 24/11/2016.
 */

public class PenyakitAdapter extends RecyclerView.Adapter<PenyakitAdapter.ViewHolder>{

    ArrayList<Penyakit> penyakitList;
    IPenyakitAdapter mIPenyakitAdapter;

    public PenyakitAdapter(MainPenyakit mainPenyakit, ArrayList<Penyakit> penyakitList) {
        this.penyakitList = penyakitList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_penyakit, parent, false);
        ViewHolder vhPenyakit = new ViewHolder(v);
        return vhPenyakit;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Penyakit penyakit = penyakitList.get(position);
        holder.tvJudulPenyakit.setText(penyakit.judulPenyakit);
        holder.tvDeskripsiPenyakit.setText(penyakit.deskripsiPenyakit);
        holder.ivFotoPenyakit.setImageDrawable(penyakit.fotoPenyakit);

    }

    @Override
    public int getItemCount() {
        if (penyakitList != null)
            return penyakitList.size();
        return 0;
    }

    public interface IPenyakitAdapter {
        void doClickPenyakit(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivFotoPenyakit;
        TextView tvJudulPenyakit;
        TextView tvDeskripsiPenyakit;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFotoPenyakit = (ImageView) itemView.findViewById(R.id.imageViewGizi);
            tvJudulPenyakit = (TextView) itemView.findViewById(R.id.textViewJudulPenyakit);
            tvDeskripsiPenyakit = (TextView) itemView.findViewById(R.id.textViewDeskripsiGizi);


        }


    }


}
