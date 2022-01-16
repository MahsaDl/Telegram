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

import com.example.mytelegram.Adapter.ContactsAdapter;
import com.example.mytelegram.Adapter.NewGroupAdapter;
import com.example.mytelegram.R;
import com.example.mytelegram.databinding.FragmentContactsBinding;
import com.example.mytelegram.databinding.FragmentNewgroupBinding;
import com.example.mytelegram.entity.Contacts;
import com.example.mytelegram.entity.NewGroup;
import com.example.mytelegram.entity.NewMessage;

import java.util.ArrayList;
import java.util.List;

public class ContactsFragment extends Fragment {
    ContactsAdapter adapter;
    FragmentContactsBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentContactsBinding.inflate(inflater);


        binding.recyclerContacts.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new ContactsAdapter(getActivity(),getData());
        binding.recyclerContacts.setAdapter(adapter);

        setHasOptionsMenu(true);

        return binding.getRoot();

    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_search,menu);
    }

    List<Contacts> getData()
    {
        List<Contacts> list=new ArrayList<>();
        list.add(new Contacts(R.drawable.asi,"Aysan","Online"));
        list.add(new Contacts(R.drawable.amir,"Amir","Online"));
        list.add(new Contacts(R.drawable.hana,"Hana jon","Online"));
        list.add(new Contacts(R.drawable.beni,"Behnam","last seen at 21:11"));
        list.add(new Contacts(R.drawable.mom,"Mom","last seen at 11:37"));
        list.add(new Contacts(R.drawable.bro,"Amirrr","last seen yesterday at 03:51"));
        list.add(new Contacts(R.drawable.shaghayegh,"Sissy","last seen Jun 22 at 17:27"));
        list.add(new Contacts(R.drawable.yasi,"Yasiii","last seen recently"));
        list.add(new Contacts(R.drawable.dad,"Dad","last seen recently"));
        list.add(new Contacts(R.drawable.asi,"Asiii","last seen recently"));
        list.add(new Contacts(R.drawable.amir,"Ali","last seen recently"));
        list.add(new Contacts(R.drawable.hana,"Hana","last seen recently"));

        return list;

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}
