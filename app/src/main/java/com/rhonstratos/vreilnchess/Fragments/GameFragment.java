package com.rhonstratos.vreilnchess.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.rhonstratos.vreilnchess.R;

public class GameFragment extends Fragment {
    private Button restart,quit;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        restart=view.findViewById(R.id.restartGame);
        quit=view.findViewById(R.id.quit);

        restart.setOnClickListener(n->{

        });
        quit.setOnClickListener(n->{
            FragmentTransaction transc = getActivity().getSupportFragmentManager().beginTransaction();
            transc.replace(R.id.mainFrame, new StartFragment());
            transc.commit();
        });
        return view;
    }
}