package com.example.assigment2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment_04 extends Fragment  {

    View v;
   EditText t1,t2;
   TextView t3;
   Button b1,b2,b3,b4;
   int num1,num2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.activity_fragment_04,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1=v.findViewById(R.id.editText1);
        t2=v.findViewById(R.id.editText2);
        t3=v.findViewById(R.id.textView);
        b1=v.findViewById(R.id.button);
        b2=v.findViewById(R.id.button2);
        b3=v.findViewById(R.id.button3);
        b4=v.findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(t1.getText().toString());
                num2=Integer.parseInt(t2.getText().toString());
                int result=num1+num2;
                t3.setText(Integer.toString(result));
            }
        });
         b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(t1.getText().toString());
                num2=Integer.parseInt(t2.getText().toString());
                int result=num1-num2;
                t3.setText(Integer.toString(result));
            }
        });
         b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(t1.getText().toString());
                num2=Integer.parseInt(t2.getText().toString());
                int result=num1*num2;
                t3.setText(Integer.toString(result));
            }
        });
         b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double num3=Integer.parseInt(t1.getText().toString());
                num2=Integer.parseInt(t2.getText().toString());
                if (num2 != 0) {
                    double result = num3 / num2;
                    t3.setText(Double.toString(result));
                } else {
                    t3.setText("Zero division Error");
                }
            }
        });



    }
}