package com.afifa.uas.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.afifa.uas.EditActivity;
import com.afifa.uas.R;
import com.afifa.uas.model.User;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.MyViewHolder> {
    List<User> mUserList;

    public UsersAdapter(List<User> userList){
        mUserList = userList;
    }
    @NonNull
    @Override
    public UsersAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.users_list, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(mView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.MyViewHolder holder, int position) {
        holder.mTextViewId.setText("ID = "+mUserList.get(position).getId());
        holder.mTextViewFirstName.setText("FirstName = "+mUserList.get(position).getFirst_name());
        holder.mTextViewLastName.setText("LastName = "+mUserList.get(position).getLast_name());
        holder.mTextViewEmail.setText("Email = "+mUserList.get(position).getEmail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), EditActivity.class);
                mIntent.putExtra("Id", mUserList.get(position).getId());
                mIntent.putExtra("FirstName", mUserList.get(position).getFirst_name());
                mIntent.putExtra("LastName", mUserList.get(position).getLast_name());
                mIntent.putExtra("Email", mUserList.get(position).getEmail());
                view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewId, mTextViewFirstName, mTextViewLastName, mTextViewEmail;

        public MyViewHolder(View itemView){
            super(itemView);
            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            mTextViewFirstName = (TextView) itemView.findViewById(R.id.tvFirstName);
            mTextViewLastName = (TextView) itemView.findViewById(R.id.tvLastName);
            mTextViewEmail = (TextView) itemView.findViewById(R.id.tvEmail);
        }
    }
}
