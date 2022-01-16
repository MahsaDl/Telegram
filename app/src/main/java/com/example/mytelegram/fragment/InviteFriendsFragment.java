package com.example.mytelegram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mytelegram.Adapter.CallAdapter;
import com.example.mytelegram.Adapter.InviteFriendsAdapter;
import com.example.mytelegram.R;
import com.example.mytelegram.databinding.FragmentCallsBinding;
import com.example.mytelegram.databinding.FragmentInvitefriendsBinding;
import com.example.mytelegram.entity.Call;
import com.example.mytelegram.entity.InviteFriends;
import com.example.mytelegram.entity.NewMessage;

import java.util.ArrayList;
import java.util.List;

public class InviteFriendsFragment extends Fragment {
    InviteFriendsAdapter adapter;
    FragmentInvitefriendsBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentInvitefriendsBinding.inflate(inflater);


        binding.recyclerInviteFriends.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new InviteFriendsAdapter(getActivity(),getData());
        binding.recyclerInviteFriends.setAdapter(adapter);

        setHasOptionsMenu(true);

        return binding.getRoot();
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_search,menu);
    }

    List<InviteFriends> getData()
    {
        List<InviteFriends> list=new ArrayList<>();
        list.add(new InviteFriends(R.drawable.ar,"Arman Rad","09122869740"));
        list.add(new InviteFriends(R.drawable.mn,"Mohsen Nili","09011065943"));
        list.add(new InviteFriends(R.drawable.a,"Alireza","09211231851"));
        list.add(new InviteFriends(R.drawable.ms,"Meli Soltani","09122869740"));
        list.add(new InviteFriends(R.drawable.ar,"Amirali Rahmati","09011065943"));
        list.add(new InviteFriends(R.drawable.mn,"Melika Nasiri","09211231851"));

        return list;

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}
