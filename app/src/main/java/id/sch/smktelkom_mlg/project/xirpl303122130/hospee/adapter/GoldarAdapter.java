package id.sch.smktelkom_mlg.project.xirpl303122130.hospee.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.R;
import id.sch.smktelkom_mlg.project.xirpl303122130.hospee.model.Goldar;

/**
 * Created by andini on 23/11/2016.
 */

public class GoldarAdapter extends RecyclerView.Adapter<GoldarAdapter.ViewHolder> {
    ArrayList<Goldar> GoldarList;

    public GoldarAdapter(ArrayList<Goldar> goldarList) {
        this.GoldarList = GoldarList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_goldar, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (GoldarList != null)
            return GoldarList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFotoGoldar;
        TextView tvJudulGoldar;
        TextView tvDeskripsiGoldar;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFotoGoldar = (ImageView) itemView.findViewById(R.id.imageViewGoldar);
            tvJudulGoldar = (TextView) itemView.findViewById(R.id.textViewJudulGoldar);
            tvDeskripsiGoldar = (TextView) itemView.findViewById(R.id.imageViewGoldar);
        }
    }
}
