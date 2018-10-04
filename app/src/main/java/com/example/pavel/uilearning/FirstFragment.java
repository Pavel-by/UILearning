package com.example.pavel.uilearning;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    )
    {
        int background = getActivity().getResources().getColor(R.color.colorPrimaryDark);
        if (getArguments() != null) background = getArguments().getInt("color");
        View root = inflater.inflate(R.layout.fragment_first, container, false);
        root.setBackgroundColor(background);
        return root;
    }
}
