package jzfp.com.precisionpoverty.fragment.requirement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.activity.requirement.RequirementDetailActivity;
import jzfp.com.precisionpoverty.adapter.requirement.AreaSpinnerAdapter;
import jzfp.com.precisionpoverty.adapter.requirement.KindSpinnerAdapter;
import jzfp.com.precisionpoverty.adapter.requirement.RequirementAdapter;
import jzfp.com.precisionpoverty.fragment.main.BaseFragment;
import jzfp.com.precisionpoverty.widgets.TitleBar;


public class RequirementFragment extends BaseFragment {

    private TitleBar titleBar;

    private ListView listView;
    private RequirementAdapter requirementMainListViewAdapter;


    private Spinner spinnerArea;
    private Spinner spinnerKind;
    private KindSpinnerAdapter kindSpinnerAdapter;
    private AreaSpinnerAdapter areaSpinnerAdapter;
    private List<String> kindListDatas = new ArrayList<>();
    private List<String> areaListDatas = new ArrayList<>();


    private Activity activity;

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
        activity = this.getActivity();
        setUpView(view, savedInstanceState);
        setDatas();
        setUpListener();
    }

    private void setDatas() {
        kindListDatas.add("北京");
        kindListDatas.add("四川");
        kindListDatas.add("广西");
        kindListDatas.add("湖南");
        kindListDatas.add("甘肃");
        kindListDatas.add("云南");
        kindListDatas.add("贵州");

        areaListDatas.add("农产");
        areaListDatas.add("培训");
        areaListDatas.add("文化宣传");

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(activity, RequirementDetailActivity.class);
                activity.startActivity(intent);
            }
        });

    }

    private void setUpView(View view, Bundle savedInstanceState) {
        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        listView = (ListView) view.findViewById(R.id.list_view);
        spinnerKind = (Spinner) view.findViewById(R.id.spinner_kind);
        spinnerArea = (Spinner) view.findViewById(R.id.spinner_area);

        requirementMainListViewAdapter = new RequirementAdapter(activity);
        kindSpinnerAdapter = new KindSpinnerAdapter(getActivity(), kindListDatas);
        areaSpinnerAdapter = new AreaSpinnerAdapter(getActivity(), areaListDatas);

        listView.setAdapter(requirementMainListViewAdapter);
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
