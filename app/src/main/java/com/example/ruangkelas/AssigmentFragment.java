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

public class AssigmentFragment extends Fragment {
    View v2;
    RecyclerView recyclerView;
    List<Assigment> listAssigment;
    private AssigmentAdapter assignAdapter;
    EditText editTextNewAssign;
    EditText editTextNewDateAssign;
    EditText editTextNewDtlAssign;

    public AssigmentFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v2 = inflater.inflate(R.layout.assignment_layout,container,false);
        recyclerView = (RecyclerView) v2.findViewById(R.id.rec_assigment);
        assignAdapter = new AssigmentAdapter(getContext(), listAssigment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(assignAdapter);

        editTextNewAssign=(EditText) v2.findViewById(R.id.namaTugas);
        editTextNewDateAssign=(EditText) v2.findViewById(R.id.tanggalTugas);
        editTextNewDtlAssign=(EditText) v2.findViewById(R.id.detailTugas);
        Button btAddAssign=(Button) v2.findViewById(R.id.saveassignment);
        btAddAssign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAssign=editTextNewAssign.getText().toString();
                String newDateAssign=editTextNewDateAssign.getText().toString();
                String newDtlAssign=editTextNewDtlAssign.getText().toString();
                // add new item to arraylist
                listAssigment.add(new Assigment("" + newAssign,"" + newDateAssign,"https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","" + newDtlAssign));
                // notify listview of data changed
                assignAdapter.notifyDataSetChanged();
            }
        });

        TextView buttonBckAssign = v2.findViewById(R.id.bckAssign);
        buttonBckAssign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return v2;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listAssigment = new ArrayList<>();
        listAssigment.add(new Assigment("Tugas Pertemuan 1","01 Maret 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
        listAssigment.add(new Assigment("Tugas Tambahan","15 Maret 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
        listAssigment.add(new Assigment("Tugas Pengganti UTS","18 April 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
        listAssigment.add(new Assigment("Tugas Pertemuan 1","01 Maret 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
        listAssigment.add(new Assigment("Tugas Tambahan","15 Maret 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
        listAssigment.add(new Assigment("Tugas Pengganti UTS","18 April 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
        listAssigment.add(new Assigment("Tugas Pertemuan 1","01 Maret 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
        listAssigment.add(new Assigment("Tugas Tambahan","15 Maret 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
        listAssigment.add(new Assigment("Tugas Pengganti UTS","18 April 2019","https://cdn4.iconfinder.com/data/icons/iready-symbols-arrows-vol-1/28/004_009_question_ask_help_support_circle1x-512.png","Buatlah program Hello World sederhana, tugas dikumpul ke email saya dengan kode 6YH-123-NIM"));
    }
}
