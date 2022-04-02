package com.example.fragment_demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Detail_Fragment extends Fragment {
    TextView tvName,tvDesc;
    ImageView tvImg;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.detail_fragment,container,false);
        tvName=view.findViewById(R.id.tvName);
        tvDesc=view.findViewById(R.id.tvDesc);
        tvImg=view.findViewById(R.id.imgView);

        return view;
    }
}
