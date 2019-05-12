package com.example.ruangkelas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MemberFragment extends Fragment {
    View v;
    List<Mahasiswa> listMahasiswa;

    public MemberFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.member_layout,container,false);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listMahasiswa = new ArrayList<>();
        listMahasiswa.add(new Mahasiswa("Dwiki Krisnanda","1705552045","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Bilal Suryananda","1705552035","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Aditya Mahendra","1705552043","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        listMahasiswa.add(new Mahasiswa("Ari Wiradana","1705552045","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwvrRHleqfyChlwZVwlDTvFQOKM1J14WiBJ304R4bnRsYya8p1zA"));
        showMahasiswa();
    }

    private void showMahasiswa() {
        RecyclerView recyclerView = v.findViewById(R.id.rec_class);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        MahasiswaAdapter adapter = new MahasiswaAdapter(getContext(), listMahasiswa);
        recyclerView.setAdapter(adapter);
    }
}