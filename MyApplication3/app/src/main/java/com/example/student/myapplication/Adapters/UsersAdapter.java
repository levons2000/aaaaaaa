package com.example.student.myapplication.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.student.myapplication.Activityes.MainActivity;
import com.example.student.myapplication.Fragments.ChatFragment;
import com.example.student.myapplication.Models.UserModel;
import com.example.student.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Student on 7/14/2018.
 */

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {

    private Context context;
    private List<UserModel> list;

    public UsersAdapter(Context context, List<UserModel> list) {
        this.context = context;
        this.list = list;

    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.userslist_item, parent, false);
        return new UserViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        Picasso.with(context).load(list.get(position).getImgUrl()).into(holder.userImage);
        holder.userName.setText(list.get(position).getName());
        holder.userDescription.setText(list.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView userImage;
        TextView userName;
        TextView userDescription;

        public UserViewHolder(View itemView) {
            super(itemView);
            userImage = (ImageView) itemView.findViewById(R.id.user_image);
            userName = (TextView) itemView.findViewById(R.id.user_name);
            userDescription = (TextView) itemView.findViewById(R.id.user_description);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final ChatFragment chatFragment = new ChatFragment();
                    final Bundle bundle = new Bundle();
                    bundle.putInt("myKey", getAdapterPosition());
                    chatFragment.setArguments(bundle);
                    ((MainActivity) context).getSupportFragmentManager().beginTransaction().replace(R.id.main_container, chatFragment).addToBackStack(null).commit();
                }
            });

        }
    }
}
