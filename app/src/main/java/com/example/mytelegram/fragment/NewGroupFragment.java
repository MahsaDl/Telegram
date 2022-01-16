package com.example.mytelegram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mytelegram.Adapter.CallAdapter;
import com.example.mytelegram.Adapter.NewGroupAdapter;
import com.example.mytelegram.R;
import com.example.mytelegram.databinding.FragmentCallsBinding;
import com.example.mytelegram.databinding.FragmentNewgroupBinding;
import com.example.mytelegram.entity.Call;
import com.example.mytelegram.entity.NewGroup;
import com.example.mytelegram.entity.NewMessage;

import java.util.ArrayList;
import java.util.List;

public class NewGroupFragment extends Fragment {
    NewGroupAdapter adapter;
    FragmentNewgroupBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentNewgroupBinding.inflate(inflater);


        binding.recyclerNewGroup.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new NewGroupAdapter(getActivity(),getData());
        binding.recyclerNewGroup.setAdapter(adapter);

        setHasOptionsMenu(true);

        return binding.getRoot();

    }

    List<NewGroup> getData()
    {
        List<NewGroup> list=new ArrayList<>();
        list.add(new NewGroup(R.drawable.hana,"+98 921 123 1851","last seen Jun 22 at 17:27"));
        list.add(new NewGroup(R.drawable.dad,"Dad","Online"));
        list.add(new NewGroup(R.drawable.bro,"Amirrr","last seen within a month"));
        list.add(new NewGroup(R.drawable.shaghayegh,"Sissy","Online"));
        list.add(new NewGroup(R.drawable.asi,"Aysan","last seen recently"));
        list.add(new NewGroup(R.drawable.amir,"Amir","last seen a long time ago"));
        list.add(new NewGroup(R.drawable.mom,"Mom","last seen at 11:37"));
        list.add(new NewGroup(R.drawable.beni,"Behnam","Online"));
        list.add(new NewGroup(R.drawable.yasi,"Yasii","last seen Apr 07 at 15:45"));
        list.add(new NewGroup(R.drawable.hana,"Hana jon","last seen recently"));
        return list;

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}
