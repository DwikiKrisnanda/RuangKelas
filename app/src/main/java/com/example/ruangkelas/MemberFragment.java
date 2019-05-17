package com.example.ruangkelas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MemberFragment extends Fragment {
    View v;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    List<Mahasiswa> listMahasiswa;
    List<Dosen> listDosen;

    public MemberFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.member_layout,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rec_Mahasiswa);

        MahasiswaAdapter viewAdapter = new MahasiswaAdapter(getContext(), listMahasiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
        recyclerView2 = (RecyclerView) v.findViewById(R.id.rec_Dosen);

        DosenAdapter viewAdapter2 = new DosenAdapter(getContext(), listDosen);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView2.setAdapter(viewAdapter2);

        TextView buttonBckMember = v.findViewById(R.id.bckMember);
        buttonBckMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listMahasiswa = new ArrayList<>();
        listMahasiswa.add(new Mahasiswa("Ari Wiradana","1705552030","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Bilal Suryananda","1705552035","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Aditya Mahendra","1705552043","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Dwiki Krisnanda","1705552045","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Ari Wiradana","1705552030","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Bilal Suryananda","1705552035","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Aditya Mahendra","1705552043","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Dwiki Krisnanda","1705552045","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Ari Wiradana","1705552030","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Bilal Suryananda","1705552035","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Aditya Mahendra","1705552043","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Dwiki Krisnanda","1705552045","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Ari Wiradana","1705552030","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Bilal Suryananda","1705552035","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Aditya Mahendra","1705552043","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Dwiki Krisnanda","1705552045","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));

        listDosen = new ArrayList<>();
        listDosen.add(new Dosen("Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
    }
}