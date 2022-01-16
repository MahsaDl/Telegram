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
import com.example.mytelegram.Adapter.ChatAdapter;
import com.example.mytelegram.R;
import com.example.mytelegram.databinding.FragmentCallsBinding;
import com.example.mytelegram.databinding.FragmentMainBinding;
import com.example.mytelegram.entity.Call;
import com.example.mytelegram.entity.Chat;
import com.example.mytelegram.entity.NewGroup;

import java.util.ArrayList;
import java.util.List;

public class CallsFragment extends Fragment {

    CallAdapter adapter;
    FragmentCallsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentCallsBinding.inflate(inflater);


        binding.recyclerCall.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new CallAdapter(getActivity(),getData());
        binding.recyclerCall.setAdapter(adapter);

        setHasOptionsMenu(true);

        return binding.getRoot();
    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_calls,menu);

    }

    List<Call> getData()
    {
        List<Call> list=new ArrayList<>();
        list.add(new Call(R.drawable.hana,"+98 921 123 1851","December 23 at 12:18"));
        list.add(new Call(R.drawable.dad,"Dad","(7)July 10 at 23:57"));
        list.add(new Call(R.drawable.bro,"Amirrr","March 26,2020 at 20:16"));
        list.add(new Call(R.drawable.shaghayegh,"Sissy","(11)August 10 at 19:32"));
        list.add(new Call(R.drawable.asi,"Aysan","November 3,2019 at 14:08"));
        list.add(new Call(R.drawable.amir,"Amir","(5)January 18,2018 at 20:49"));
        list.add(new Call(R.drawable.mom,"Mom","April 1,2018 at 11:25"));
        list.add(new Call(R.drawable.beni,"Behnam","(2)March 23,2016 at 21:55"));
        list.add(new Call(R.drawable.yasi,"Yasii","June 15,2016 at 11:30"));
        list.add(new Call(R.drawable.hana,"Hana jon","December 7,2015 at 23:28"));

        return list;

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }

}
