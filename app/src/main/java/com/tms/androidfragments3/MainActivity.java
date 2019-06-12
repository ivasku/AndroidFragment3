package com.tms.androidfragments3;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment_1.OnFragmentInteractionListener, Fragment_2.OnFragmentInteractionListener{

    private Fragment_1 frag_1;
    private Fragment_2 frag_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag_1 = new Fragment_1();
        frag_2 = new Fragment_2();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame1, frag_1)
                .replace(R.id.fram2, frag_2)
                .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
