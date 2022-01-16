package com.example.mytelegram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytelegram.databinding.CallRecyclerviewItemsBinding;
import com.example.mytelegram.databinding.ChatRecyclerviewItemsBinding;
import com.example.mytelegram.entity.Call;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.MyViewHolder> {

    private Context context;
    private List<Call> list;
    private CallRecyclerviewItemsBinding callRecyclerviewItemsBinding;

    public CallAdapter(Context context, List<Call> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        callRecyclerviewItemsBinding =CallRecyclerviewItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(callRecyclerviewItemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CallAdapter.MyViewHolder holder, int position) {
        Call call=list.get(position);
        holder.binding.tvTime.setText(call.getTvTime());
        holder.binding.tvName.setText(call.getTvName());
        holder.binding.imgProfile.setImageResource(call.getImgProfile());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        CallRecyclerviewItemsBinding binding;


        public MyViewHolder(@NonNull CallRecyclerviewItemsBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }


}
