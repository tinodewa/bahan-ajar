package illiyin.co.malang.konsepdasarbahasa.ui.home;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.widget.Toolbar;

import java.util.Objects;

import illiyin.co.malang.konsepdasarbahasa.R;
import illiyin.co.malang.konsepdasarbahasa.Viewpager_Adapter;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    Viewpager_Adapter viewpager_Adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        Objects.requireNonNull(getActivity()).setTitle("Konsep Dasar Bahasa");

        viewpager_Adapter = new Viewpager_Adapter(this.getChildFragmentManager());
        viewPager = (ViewPager) view.findViewById(R.id.Main_Viewpager);
        viewPager.setAdapter(viewpager_Adapter);
        viewPager.setPadding(50,0,225,0);

    }
}