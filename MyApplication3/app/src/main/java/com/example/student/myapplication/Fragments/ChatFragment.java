package com.example.student.myapplication.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student.myapplication.Models.UserModel;
import com.example.student.myapplication.Providers.UsersDataProvider;
import com.example.student.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {


    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chat, container, false);
        if (getArguments() != null) {
            final int userPosition = getArguments().getInt("myKey");
            final UserModel userByPosition =UsersDataProvider.getUserByPosition(userPosition);

        }
        return v;
    }

}
