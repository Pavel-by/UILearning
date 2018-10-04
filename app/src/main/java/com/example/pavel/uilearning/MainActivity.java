package com.example.pavel.uilearning;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity
{
    TextView button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        FirstFragment fragment1 = new FirstFragment(), fragment2 = new FirstFragment();
        Bundle args = new Bundle();
        args.putInt("color", getResources().getColor(R.color.colorAccent));
        fragment1.setArguments(args);
        getFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.animator.fragment_in, R.animator.fragment_out)
                .add(R.id.fragmentRoot, fragment1)
                .add(R.id.fragmentRoot, fragment2)
                .addToBackStack("stack")
                .commit();

    }

}
