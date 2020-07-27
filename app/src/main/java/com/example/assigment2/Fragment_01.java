package com.example.assigment2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment_01 extends Fragment {

    View v;
    ListView l;
    String str[]={"Bhopal","Gwalior","Indore","Mumbai","Kolkata"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.activity_fragment_01,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        l=v.findViewById(R.id.list1);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_selectable_list_item,str);
        l.setAdapter(ad);
       l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       if(position==0) {
                           FragmentManager fm1 = getChildFragmentManager();
                           FragmentTransaction ft1 = fm1.beginTransaction();
                           Fragment_05 fragment_05= new Fragment_05();
                           ft1.replace(R.id.ll,fragment_05);
                           ft1.commit();
                       }
                       else  if(position==1)
                       {  FragmentManager fm2=  getChildFragmentManager();
                           FragmentTransaction ft2 = fm2.beginTransaction();
                           Fragment_06 fragment_06= new Fragment_06();
                           ft2.replace(R.id.ll,fragment_06);
                           ft2.commit();

                       } else if(position==2)
                       {
                           FragmentManager fm3 =  getChildFragmentManager();
                           FragmentTransaction ft3 = fm3.beginTransaction();
                           Fragment_07 fragment_07= new Fragment_07();
                           ft3.replace(R.id.ll,fragment_07);
                           ft3.commit();

                       } else if(position==3)
                       {
                           FragmentManager fm4 = getChildFragmentManager();
                           FragmentTransaction ft4 = fm4.beginTransaction();
                           Fragment_08 fragment_08= new Fragment_08();
                           ft4.replace(R.id.ll,fragment_08);
                           ft4.commit();

                       } else
                       {
                           FragmentManager fm5=  getChildFragmentManager();
                           FragmentTransaction ft5 = fm5.beginTransaction();
                           Fragment_09 fragment_09= new Fragment_09();
                           ft5.replace(R.id.ll,fragment_09);
                           ft5.commit();

                       }
                   }
               });

    }
}