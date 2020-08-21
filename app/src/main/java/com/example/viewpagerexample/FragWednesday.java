package com.example.viewpagerexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragWednesday extends Fragment {

    private View view;

    // view pager 이기 때문에 상태 저장 필요
    public static FragWednesday newInstance() {
        FragWednesday fragWednesday = new FragWednesday();
        return fragWednesday;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_wednesday, container, false);

        return view;
    }
}
