package com.rhonstratos.vreilnchess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.rhonstratos.vreilnchess.Fragments.StartFragment;

public class MainActivity extends AppCompatActivity {
    private FrameLayout main_Frame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        main_Frame = findViewById(R.id.mainFrame);
        FragmentTransaction transc = getSupportFragmentManager().beginTransaction();
        transc.replace(R.id.mainFrame, new StartFragment());
        transc.commit();
    }
}