package com.example.ruangkelas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AssigmentAdapter extends RecyclerView.Adapter<AssigmentAdapter.MyViewHolder> {

    Context context;
    List<Assigment> listAssigment;

    public AssigmentAdapter(Context context, List<Assigment> listAssigment) {
        this.context = context;
        this.listAssigment = listAssigment;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v2;
        v2 = LayoutInflater.from(context).inflate(R.layout.assignment, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v2);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context)
                .asBitmap()
                .load(listAssigment.get(position).getFotoAssigment())
                .into(holder.fotoTugas);
        holder.namaTugas.setText(listAssigment.get(position).getNamaAssigment());
        holder.tanggalTugas.setText(listAssigment.get(position).getTanggalAssigment());
    }

    @Override
    public int getItemCount() {
        return listAssigment.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView namaTugas;
        TextView tanggalTugas;
        ImageView fotoTugas;


        public MyViewHolder(View itemView) {
            super(itemView);

            namaTugas = (TextView) itemView.findViewById(R.id.nameTugas);
            tanggalTugas = (TextView) itemView.findViewById(R.id.dateTugas);
            fotoTugas = (ImageView) itemView.findViewById(R.id.imageTugas);
        }
    }
}