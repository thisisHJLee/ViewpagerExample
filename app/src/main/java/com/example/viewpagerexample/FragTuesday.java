package com.example.viewpagerexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragTuesday extends Fragment {

    private View view;

    // view pager 이기 때문에 상태 저장 필요
    public static FragTuesday newInstance() {
        FragTuesday fragTuesday = new FragTuesday();
        return fragTuesday;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_tuesday, container, false);

        return view;
    }
}
