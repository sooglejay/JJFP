package jzfp.com.precisionpoverty.fragment.me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.activity.me.MyFriendActivity;
import jzfp.com.precisionpoverty.activity.me.MyMessageActivity;
import jzfp.com.precisionpoverty.fragment.main.BaseFragment;
import jzfp.com.precisionpoverty.widgets.TitleBar;

/**
 * 我的-主框架-tab3
 */
public class MeFragment extends BaseFragment {

    private Activity context;


    private TitleBar titleBar;
    private LinearLayout me;
    private LinearLayout message;
    private LinearLayout friend;
    private LinearLayout requirement;
    private LinearLayout serve;
    private LinearLayout group;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-06-04 04:43:47 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews(View view) {
        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        me = (LinearLayout) view.findViewById(R.id.me);
        message = (LinearLayout) view.findViewById(R.id.message);
        friend = (LinearLayout) view.findViewById(R.id.friend);
        requirement = (LinearLayout) view.findViewById(R.id.requirement);
        serve = (LinearLayout) view.findViewById(R.id.serve);
        group = (LinearLayout) view.findViewById(R.id.group);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_5, container, false);
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        findViews(view);
        setUp(view, savedInstanceState);
        setUpListener();

    }


    private void setUp(View view, Bundle savedInstanceState) {
        context = this.getActivity();
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onSearch(View v) {

            }

            @Override
            public void onPlus(View v) {

            }
        });

    }


    private void setUpListener() {
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MyMessageActivity.class));
            }

        });
        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MyFriendActivity.class));
            }

        });

    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
