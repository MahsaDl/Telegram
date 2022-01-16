package com.example.mytelegram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mytelegram.Adapter.ContactsAdapter;
import com.example.mytelegram.Adapter.NewMessageAdapter;
import com.example.mytelegram.R;
import com.example.mytelegram.databinding.FragmentContactsBinding;
import com.example.mytelegram.databinding.FragmentNewmessageBinding;
import com.example.mytelegram.entity.Contacts;
import com.example.mytelegram.entity.NewMessage;

import java.util.ArrayList;
import java.util.List;

public class NewMessageFragment extends Fragment {
    NewMessageAdapter adapter;
    FragmentNewmessageBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentNewmessageBinding.inflate(inflater);


        binding.recyclerNewMessage.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new NewMessageAdapter(getActivity(),getData());
        binding.recyclerNewMessage.setAdapter(adapter);

        setHasOptionsMenu(true);

        return binding.getRoot();

    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_search,menu);
    }

    List<NewMessage> getData()
    {
        List<NewMessage> list=new ArrayList<>();
        list.add(new NewMessage(R.drawable.asi,"Aysan","Online"));
        list.add(new NewMessage(R.drawable.amir,"Amir","Online"));
        list.add(new NewMessage(R.drawable.hana,"Hana jon","Online"));
        list.add(new NewMessage(R.drawable.beni,"Behnam","last seen at 21:11"));
        list.add(new NewMessage(R.drawable.mom,"Mom","last seen at 11:37"));
        list.add(new NewMessage(R.drawable.bro,"Amirrr","last seen yesterday at 03:51"));
        list.add(new NewMessage(R.drawable.shaghayegh,"Sissy","last seen Jun 22 at 17:27"));
        list.add(new NewMessage(R.drawable.yasi,"Yasiii","last seen recently"));
        list.add(new NewMessage(R.drawable.dad,"Dad","last seen recently"));
        list.add(new NewMessage(R.drawable.asi,"Asiii","last seen recently"));
        list.add(new NewMessage(R.drawable.amir,"Ali","last seen recently"));
        list.add(new NewMessage(R.drawable.hana,"Hana","last seen recently"));

        return list;

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}
