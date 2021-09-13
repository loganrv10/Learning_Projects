package com.example.fragmentWithRecycleView;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class ItemDetailFragment extends Fragment {
    ImageView image2;
    TextView textView1, textView2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        image2 = view.findViewById(R.id.image2);
        textView1 = view.findViewById(R.id.text12);
        textView2 = view.findViewById(R.id.text22);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String title = bundle.getString("title1");
            textView1.setText(title);
            String subtitle = bundle.getString("subtitle1");
            textView2.setText(subtitle);
            Glide.with(image2).load(bundle.getString("pic1")).into(image2);

        }

    }
}