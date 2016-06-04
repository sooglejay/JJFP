package jzfp.com.precisionpoverty.fragment.individual;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.adapter.individual.IndividualAdapter;
import jzfp.com.precisionpoverty.fragment.main.BaseFragment;
import jzfp.com.precisionpoverty.widgets.TitleBar;

public class IndividualFragment extends BaseFragment {

    private TitleBar titleBar;

    private Activity context;

    private ListView listView;
    private IndividualAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_3, container, false);
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
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onSearch(View v) {

            }

            @Override
            public void onPlus(View v) {

            }
        });

        listView = (ListView) view.findViewById(R.id.list_view);
        adapter = new IndividualAdapter(context);
        listView.setAdapter(adapter);
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
