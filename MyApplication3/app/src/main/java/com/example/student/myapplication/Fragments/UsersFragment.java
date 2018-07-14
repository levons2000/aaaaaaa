package com.example.student.myapplication.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student.myapplication.Adapters.UsersAdapter;
import com.example.student.myapplication.Providers.UsersDataProvider;
import com.example.student.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UsersFragment extends Fragment {

    public UsersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_users, container, false);
        final RecyclerView usersList = (RecyclerView) v.findViewById(R.id.users_recycler);
        usersList.setHasFixedSize(true);
        usersList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        final UsersAdapter usersAdapter = new UsersAdapter(getContext(), UsersDataProvider.getUsersList());
        return v;
    }

}
