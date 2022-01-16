package com.example.mytelegram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytelegram.databinding.ChatRecyclerviewItemsBinding;
import com.example.mytelegram.entity.Chat;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {

    private Context context;
    private List<Chat> list;
    private ChatRecyclerviewItemsBinding chatRecyclerviewItemsBinding;

    public ChatAdapter(Context context, List<Chat> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        chatRecyclerviewItemsBinding =ChatRecyclerviewItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(chatRecyclerviewItemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.MyViewHolder holder, int position) {
        Chat chat=list.get(position);
        holder.binding.tvTime.setText(chat.getTvTime());
        holder.binding.tvName.setText(chat.getTvName());
        holder.binding.tvMessage.setText(chat.getTvMessage());
        holder.binding.imgTik.setImageResource(chat.getImgTik());
        holder.binding.imgUnread.setImageResource(chat.getImgUnread());
        holder.binding.imgProfile.setImageResource(chat.getImgProfile());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ChatRecyclerviewItemsBinding binding;


        public MyViewHolder(@NonNull ChatRecyclerviewItemsBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }


}
