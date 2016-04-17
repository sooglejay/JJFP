package jzfp.com.precisionpoverty.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import jzfp.com.precisionpoverty.Constants.StringConstant;
import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.adapter.RequirementAdapter;
import jzfp.com.precisionpoverty.widgets.TitleBar;

/**
 * 我的-主框架-tab3
 */
public class MeFragment extends BaseFragment {

    private TitleBar titleBar;
    private Activity context;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_5, container, false);
    }

    public void onResume() {
        super.onResume();
//        MobclickAgent.onPageStart("MainScreen"); //统计页面
    }

    public void onPause() {
        super.onPause();
//        MobclickAgent.onPageEnd("MainScreen");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        setUp(view, savedInstanceState);

    }


    private void setUp(View view, Bundle savedInstanceState) {
        context = this.getActivity();
        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        titleBar.initTitleBarInfo(StringConstant.title_me, -1, -1, "", "");

    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void onStop() {
        super.onStop();
//        mPopWindow.dismiss();
    }

}
