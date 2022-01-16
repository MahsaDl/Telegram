package com.example.mytelegram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytelegram.databinding.ContactsRecyclerviewItemsBinding;
import com.example.mytelegram.databinding.NewmessageRecyclerviewItemsBinding;
import com.example.mytelegram.entity.Contacts;
import com.example.mytelegram.entity.NewMessage;

import java.util.List;

public class NewMessageAdapter extends RecyclerView.Adapter<NewMessageAdapter.MyViewHolder> {

    private Context context;
    private List<NewMessage> list;
    private NewmessageRecyclerviewItemsBinding newmessageRecyclerviewItemsBinding;

        public NewMessageAdapter(Context context, List<NewMessage> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        newmessageRecyclerviewItemsBinding =NewmessageRecyclerviewItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(newmessageRecyclerviewItemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull NewMessageAdapter.MyViewHolder holder, int position) {
        NewMessage newMessage=list.get(position);
        holder.binding.tvTime.setText(newMessage.getTvTime());
        holder.binding.tvName.setText(newMessage.getTvName());
        holder.binding.imgProfile.setImageResource(newMessage.getImgProfile());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        NewmessageRecyclerviewItemsBinding binding;


        public MyViewHolder(@NonNull NewmessageRecyclerviewItemsBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }


}
