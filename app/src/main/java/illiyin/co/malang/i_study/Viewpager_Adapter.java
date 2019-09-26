package illiyin.co.malang.i_study;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import butterknife.BindView;

public class Viewpager_Adapter extends FragmentPagerAdapter {

    public Viewpager_Adapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
            return new Viewpager_Item_1();
            case 1:
            return new Viewpager_Item_2();
            case 2:
            return new Viewpager_Item_3();
            case 3:
            return new Viewpager_Item_4();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
