package com.example.tasklist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabListFragment extends Fragment {

    public static ArrayList<Task> taskList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private TaskAdapter myAdapter;

    public TabListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        View view =  inflater.inflate(R.layout.fragment_tab_list, container, false);

        mRecyclerView = view.findViewById(R.id.recyclerView);

        myAdapter = new TaskAdapter(taskList);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mRecyclerView.setAdapter(myAdapter);

        return view;
    }
}
