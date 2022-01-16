package com.example.mytelegram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytelegram.databinding.ContactsRecyclerviewItemsBinding;
import com.example.mytelegram.databinding.NewgroopRecyclerviewItemsBinding;
import com.example.mytelegram.entity.Contacts;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder> {

    private Context context;
    private List<Contacts> list;
    private ContactsRecyclerviewItemsBinding contactsRecyclerviewItemsBinding;

    public ContactsAdapter(Context context, List<Contacts> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contactsRecyclerviewItemsBinding =ContactsRecyclerviewItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(contactsRecyclerviewItemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsAdapter.MyViewHolder holder, int position) {
        Contacts newGroup=list.get(position);
        holder.binding.tvTime.setText(newGroup.getTvTime());
        holder.binding.tvName.setText(newGroup.getTvName());
        holder.binding.imgProfile.setImageResource(newGroup.getImgProfile());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ContactsRecyclerviewItemsBinding binding;


        public MyViewHolder(@NonNull ContactsRecyclerviewItemsBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }


}
