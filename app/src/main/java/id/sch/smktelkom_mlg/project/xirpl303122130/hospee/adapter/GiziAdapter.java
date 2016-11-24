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

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.R;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Gizi;

/**
 * Created by asus on 23-Nov-16.
 */

public class GiziAdapter extends RecyclerView.Adapter<GiziAdapter.ViewHolder> {
    ArrayList<Gizi> giziList;
    IGiziAdapter mIGiziAdapter;

    public GiziAdapter(Context context, ArrayList<Gizi> giziList) {
        this.giziList = giziList;
        mIGiziAdapter = (IGiziAdapter) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_gizi, parent, false);
        ViewHolder vhGizi = new ViewHolder(v);
        return vhGizi;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Gizi gizi = giziList.get(position);
        holder.tvJudulGizi.setText(gizi.judulGizi);
        holder.tvDeskripsiGizi.setText(gizi.deskripsiGizi);
        holder.ivFotoGizi.setImageURI(Uri.parse(gizi.fotoGizi));
    }

    @Override
    public int getItemCount() {
        if (giziList != null)
            return giziList.size();
        return 0;
    }

    public interface IGiziAdapter {
        void doClickGizi(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFotoGizi;
        TextView tvJudulGizi;
        TextView tvDeskripsiGizi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFotoGizi = (ImageView) itemView.findViewById(R.id.imageViewGizi);
            tvJudulGizi = (TextView) itemView.findViewById(R.id.textViewJudulPenyakit);
            tvDeskripsiGizi = (TextView) itemView.findViewById(R.id.textViewDeskripsiGizi);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mIGiziAdapter.doClickGizi(getAdapterPosition());
                }
            });

        }


    }


}
