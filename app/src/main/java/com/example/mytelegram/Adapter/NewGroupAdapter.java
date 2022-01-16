package com.example.mytelegram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytelegram.databinding.CallRecyclerviewItemsBinding;
import com.example.mytelegram.databinding.NewgroopRecyclerviewItemsBinding;
import com.example.mytelegram.entity.NewGroup;

import java.util.List;

public class NewGroupAdapter extends RecyclerView.Adapter<NewGroupAdapter.MyViewHolder> {

    private Context context;
    private List<NewGroup> list;
    private NewgroopRecyclerviewItemsBinding newgroopRecyclerviewItemsBinding;

    public NewGroupAdapter(Context context, List<NewGroup> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        newgroopRecyclerviewItemsBinding =NewgroopRecyclerviewItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(newgroopRecyclerviewItemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull NewGroupAdapter.MyViewHolder holder, int position) {
        NewGroup newGroup=list.get(position);
        holder.binding.tvTime.setText(newGroup.getTvTime());
        holder.binding.tvName.setText(newGroup.getTvName());
        holder.binding.imgProfile.setImageResource(newGroup.getImgProfile());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        NewgroopRecyclerviewItemsBinding binding;


        public MyViewHolder(@NonNull NewgroopRecyclerviewItemsBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }


}
