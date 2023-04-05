package com.example.resepkue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterResep extends RecyclerView.Adapter<AdapterResep.ViewHolderResep> {
    private Context ctx;
    private ArrayList arrID, arrTerigu, arrGula, arrMentega, arrMauripan, arrSoda, arrPanili, arrAirHangat;

    public AdapterResep(Context ctx, ArrayList arrTerigu, ArrayList arrGula, ArrayList arrMentega, ArrayList arrMauripan, ArrayList arrSoda, ArrayList arrPanili, ArrayList arrAirHangat) {
        this.ctx = ctx;
        this.arrID = arrID;
        this.arrTerigu = arrTerigu;
        this.arrGula = arrGula;
        this.arrMentega = arrMentega;
        this.arrMauripan = arrMauripan;
        this.arrSoda = arrSoda;
        this.arrPanili = arrPanili;
        this.arrAirHangat = arrAirHangat;
    }

    @NonNull
    @Override
    public ViewHolderResep onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater pompa = LayoutInflater.from(ctx);
        View view = pompa.inflate(R.layout.card_item, parent, false);

        return new ViewHolderResep(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderResep holder, int position) {
        holder.tvId.setText(arrID.get(position).toString());
        holder.tvTerigu.setText(arrTerigu.get(position).toString());
        holder.tvGula.setText(arrGula.get(position).toString());
        holder.tvMentega.setText(arrMentega.get(position).toString());
        holder.tvMauripan.setText(arrMauripan.get(position).toString());
        holder.tvSoda.setText(arrSoda.get(position).toString());
        holder.tvPanili.setText(arrPanili.get(position).toString());
        holder.tvAirHangat.setText(arrAirHangat.get(position).toString());


    }

    @Override
    public int getItemCount() {

        return arrTerigu.size();
    }

    public class ViewHolderResep extends RecyclerView.ViewHolder {
        TextView tvId, tvTerigu, tvGula, tvMentega, tvMauripan, tvSoda, tvPanili, tvAirHangat;
        CardView cvResep;

        public ViewHolderResep(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tv_id);
            tvTerigu = itemView.findViewById(R.id.tv_terigu);
            tvGula = itemView.findViewById(R.id.tv_gula);
            tvMentega = itemView.findViewById(R.id.tv_mentega);
            tvMauripan = itemView.findViewById(R.id.tv_mauripan);
            tvSoda = itemView.findViewById(R.id.tv_soda);
            tvPanili = itemView.findViewById(R.id.tv_panili);
            tvAirHangat = itemView.findViewById(R.id.tv_airhangat);
            cvResep = itemView.findViewById(R.id.cv_resep);
        }
    }
}
