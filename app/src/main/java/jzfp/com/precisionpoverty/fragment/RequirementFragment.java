package jzfp.com.precisionpoverty.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.adapter.AreaSpinnerAdapter;
import jzfp.com.precisionpoverty.adapter.KindSpinnerAdapter;
import jzfp.com.precisionpoverty.adapter.RequirementAdapter;
import jzfp.com.precisionpoverty.widgets.TitleBar;


public class RequirementFragment extends BaseFragment {

    private TitleBar titleBar;

    private Activity context;
    private ListView listView;
    private RequirementAdapter adapter;


    private View headerOfListView;
    private Spinner spinnerArea;
    private Spinner spinnerKind;
    private KindSpinnerAdapter kindSpinnerAdapter;
    private AreaSpinnerAdapter areaSpinnerAdapter;
    private List<String> kindListDatas = new ArrayList<>();
    private List<String> areaListDatas = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1, container, false);
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
        context = this.getActivity();
        setUpView(view, savedInstanceState);
        setDatas();
        setUpListener();
    }

    private void setDatas() {
        kindListDatas.add("刷股");
        kindListDatas.add("啊说");
        kindListDatas.add("阿斯顿");
        kindListDatas.add("叨逼叨");
        kindListDatas.add("是的");
        kindListDatas.add("阿萨");
        kindListDatas.add("仿佛好");
        kindListDatas.add("仿佛好");

        areaListDatas.add("刷股");
        areaListDatas.add("啊说");
        areaListDatas.add("阿斯顿");
        areaListDatas.add("叨逼叨");
        areaListDatas.add("是的");
        areaListDatas.add("阿萨");
        areaListDatas.add("仿佛好");
        areaListDatas.add("仿佛好");

        kindSpinnerAdapter.notifyDataSetChanged();
        areaSpinnerAdapter.notifyDataSetChanged();

    }

    private void setUpListener() {

        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onSearch(View v) {

            }

            @Override
            public void onPlus(View v) {

            }
        });
        listView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float y = event.getY();
                float x= event.getX();
                Log.e("jwjw", event.getAction()+"   y="+y+"    x="+x);
                return false;
            }
        });
    }


    private void setUpView(View view, Bundle savedInstanceState) {
        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        listView = (ListView) view.findViewById(R.id.list_view);
        headerOfListView = View.inflate(getActivity(), R.layout.header_of_list_view_in_requirement_fragment, null);

        spinnerKind = (Spinner) headerOfListView.findViewById(R.id.spinner_kind);
        spinnerArea = (Spinner) headerOfListView.findViewById(R.id.spinner_area);
        listView.addHeaderView(headerOfListView);

        adapter = new RequirementAdapter(context);
        kindSpinnerAdapter = new KindSpinnerAdapter(getActivity(), kindListDatas);
        areaSpinnerAdapter = new AreaSpinnerAdapter(getActivity(), areaListDatas);

        listView.setAdapter(adapter);
        spinnerArea.setAdapter(areaSpinnerAdapter);
        spinnerKind.setAdapter(kindSpinnerAdapter);

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
