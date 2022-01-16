package com.example.mytelegram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytelegram.databinding.CallRecyclerviewItemsBinding;
import com.example.mytelegram.databinding.InvitefriendsRecyclerviewItemsBinding;
import com.example.mytelegram.entity.InviteFriends;

import java.util.List;

public class InviteFriendsAdapter extends RecyclerView.Adapter<InviteFriendsAdapter.MyViewHolder> {

    private Context context;
    private List<InviteFriends> list;
    private InvitefriendsRecyclerviewItemsBinding invitefriendsRecyclerviewItemsBinding;

    public InviteFriendsAdapter(Context context, List<InviteFriends> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        invitefriendsRecyclerviewItemsBinding =InvitefriendsRecyclerviewItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(invitefriendsRecyclerviewItemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull InviteFriendsAdapter.MyViewHolder holder, int position) {
        InviteFriends inviteFriends=list.get(position);
        holder.binding.tvNumber.setText(inviteFriends.getTvNumber());
        holder.binding.tvName.setText(inviteFriends.getTvName());
        holder.binding.imgProfile.setImageResource(inviteFriends.getImgProfile());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        InvitefriendsRecyclerviewItemsBinding binding;


        public MyViewHolder(@NonNull InvitefriendsRecyclerviewItemsBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }


}
