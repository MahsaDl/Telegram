package com.example.mytelegram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytelegram.Adapter.ChatAdapter;
import com.example.mytelegram.R;
import com.example.mytelegram.databinding.ChatRecyclerviewItemsBinding;
import com.example.mytelegram.databinding.FragmentMainBinding;
import com.example.mytelegram.entity.Chat;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {

    ChatAdapter adapter;
    FragmentMainBinding binding;
    NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding=FragmentMainBinding.inflate(inflater);


        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new ChatAdapter(getActivity(),getData());
        binding.recycler.setAdapter(adapter);

        setHasOptionsMenu(true);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_mainFragment2_to_nav_newMessage);

            }
        });

    }

    List<Chat> getData()
    {
        List<Chat> list=new ArrayList<>();
        list.add(new Chat(R.drawable.proxy,"MTProto Proxy | پروکسی","New MTProto Proxy!Server:Unkn...","15:00",R.drawable.unread9,0));
        list.add(new Chat(R.drawable.shaghayegh,"Sissy","Voice message","23:42",R.drawable.unread2));
        list.add(new Chat(R.drawable.saved,"Saved Message","طراحی های خلاقانه در اندروید استودیو","14:37",0,0));
        list.add(new Chat(R.drawable.bro,"Amir","تا دو ساعت دیگه اونجام","18:42",0,R.drawable.ic_baseline_done_24));
        list.add(new Chat(R.drawable.advanced,"Advanced Android Development","File","07:30",R.drawable.unread1,0));
        list.add(new Chat(R.drawable.dad,"Dad","Tnx awliiiiiii bod","May 18",0,R.drawable.ic_baseline_done_all_24));
        list.add(new Chat(R.drawable.yasi,"Yasiii","Hahaha hamash vase to...","01:27",R.drawable.unread24,0));

        list.add(new Chat(R.drawable.success,"Success","Training Day.pdf","July 26",R.drawable.unread9));
        list.add(new Chat(R.drawable.hana,"Hana jon","Voice message","10:03",0,R.drawable.ic_baseline_done_all_24));
        list.add(new Chat(R.drawable.android,"homeandroi.ir خانه اندروید","رونمایی از api محاسبه هزینه...","Jan 16",R.drawable.unread67,0));
        list.add(new Chat(R.drawable.beni,"Behnam","Shabih khodet toriii","20:07",0,R.drawable.ic_baseline_done_24));
        list.add(new Chat(R.drawable.mom,"Mom","فرستادم برات عشقم","Tue",0,R.drawable.ic_baseline_done_all_24));
        list.add(new Chat(R.drawable.nani,"Nani Scarf","روسری کد 1035","14:53",R.drawable.unread17,0));
        list.add(new Chat(R.drawable.asi,"Aysan","Yes...","Feb 21",0,R.drawable.ic_baseline_done_all_24));
        list.add(new Chat(R.drawable.amir,"Amirrrr","Tnx","Mon",0,R.drawable.ic_baseline_done_24));
        return list;

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_search,menu);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}
