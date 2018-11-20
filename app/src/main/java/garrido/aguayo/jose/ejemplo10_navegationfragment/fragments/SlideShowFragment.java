package garrido.aguayo.jose.ejemplo10_navegationfragment.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import garrido.aguayo.jose.ejemplo10_navegationfragment.R;

public class SlideShowFragment extends Fragment {


    public SlideShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_slide_show, container, false);
        Toast.makeText(getActivity(), "HOLA MUNDO", Toast.LENGTH_SHORT).show();

        return rootView;
    }

}
