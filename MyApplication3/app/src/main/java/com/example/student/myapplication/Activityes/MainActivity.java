package com.example.student.myapplication.Activityes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.student.myapplication.Fragments.UsersFragment;
import com.example.student.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDefaultFragment();
    }

    private void initDefaultFragment(){
        getSupportFragmentManager().beginTransaction().add(R.id.main_container, new UsersFragment()).commit();
    }
}
