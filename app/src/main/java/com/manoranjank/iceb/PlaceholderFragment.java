package com.manoranjank.iceb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Manoranjan K on 04-01-2018.
 */

public class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     *
     *
     *
     */

    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public int[] mano={R.layout.fragment_main,
                       R.layout.fragment_main2,
                       R.layout.fragment_main3,
                       R.layout.fragment_main4,
                       R.layout.fragment_main5



    };
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(mano[getArguments().getInt(ARG_SECTION_NUMBER) - 1], container, false);
        //  ImageView img=(ImageView) rootView.findViewById(R.id.img);
        // img.setImageResource(mano[getArguments().getInt(ARG_SECTION_NUMBER)-1]);
        //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        //textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));



        return rootView;
    }
}