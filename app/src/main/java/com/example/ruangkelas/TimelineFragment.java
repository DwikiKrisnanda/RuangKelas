package com.example.ruangkelas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TimelineFragment extends Fragment {
    View v3;
    RecyclerView recyclerView;
    List<Timeline> listTimeline;
    private TimelineAdapter tlAdapter;
    EditText editTextNewTtlAnn;
    EditText editTextNewAnn;

    public TimelineFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v3 = inflater.inflate(R.layout.timeline_layout,container,false);
        recyclerView = (RecyclerView) v3.findViewById(R.id.rec_pengumuman);
        recyclerView.setHasFixedSize(true);
        tlAdapter = new TimelineAdapter(getContext(), listTimeline);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(tlAdapter);

        editTextNewTtlAnn=(EditText) v3.findViewById(R.id.newTitleAnnounce);
        editTextNewAnn=(EditText) v3.findViewById(R.id.newAnounce);
        Button btAdd=(Button) v3.findViewById(R.id.save);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                String newTtlAnn=editTextNewTtlAnn.getText().toString();
                String newAnn=editTextNewAnn.getText().toString();
                // add new item to arraylist
                listTimeline.add(new Timeline("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","" + newTtlAnn, "" + newAnn,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
                // notify listview of data changed
                tlAdapter.notifyDataSetChanged();
            }

        });

        TextView buttonBckTimeline = v3.findViewById(R.id.bckTimeline);
        buttonBckTimeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return v3;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listTimeline = new ArrayList<>();
        listTimeline.add(new Timeline("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","Jadwal Pengganti","Kuliah hari senin besok diganti ke hari rabu jam 10.00 WITA","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listTimeline.add(new Timeline("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","Jadwal Pengganti","Kuliah hari senin besok diganti ke hari rabu jam 10.00 WITA","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listTimeline.add(new Timeline("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","Jadwal Pengganti","Kuliah hari senin besok diganti ke hari rabu jam 10.00 WITA","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listTimeline.add(new Timeline("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","Jadwal Pengganti","Kuliah hari senin besok diganti ke hari rabu jam 10.00 WITA","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listTimeline.add(new Timeline("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","Jadwal Pengganti","Kuliah hari senin besok diganti ke hari rabu jam 10.00 WITA","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listTimeline.add(new Timeline("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","Jadwal Pengganti","Kuliah hari senin besok diganti ke hari rabu jam 10.00 WITA","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listTimeline.add(new Timeline("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","Jadwal Pengganti","Kuliah hari senin besok diganti ke hari rabu jam 10.00 WITA","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
    }

}
