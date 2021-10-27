package com.rhonstratos.vreilnchess.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.rhonstratos.vreilnchess.R;

public class StartFragment extends Fragment {
    private Button start;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_start, container, false);
        start= view.findViewById(R.id.playbtn);

        start.setOnClickListener(n->{
            FragmentTransaction transc = getActivity().getSupportFragmentManager().beginTransaction();
            transc.replace(R.id.mainFrame, new GameFragment());
            transc.commit();
        });

        // Inflate the layout for this fragment

        return view;
    }

}