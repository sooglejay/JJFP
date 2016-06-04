package jzfp.com.precisionpoverty.activity.me;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import jzfp.com.precisionpoverty.R;
import jzfp.com.precisionpoverty.adapter.me.MyMessageAdapter;
import jzfp.com.precisionpoverty.widgets.TitleBarWithoutSearch;

/**
 * Created by Jerry on 16/6/4.
 */
public class MyMessageActivity extends Activity {
    private TitleBarWithoutSearch titleBar;
    private ListView listView;

    private MyMessageAdapter myMessageAdapter ;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-06-04 04:49:41 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        titleBar = (TitleBarWithoutSearch)findViewById( R.id.title_bar );
        listView = (ListView)findViewById( R.id.list_view );
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_message_detail);
        findViews();
        setUpViews();
        setUpListener();
    }

    private void setUpListener() {
        titleBar.initTitleBarInfo("我的消息",R.drawable.arrow_left,-1,"","");
        titleBar.setOnTitleBarClickListener(new TitleBarWithoutSearch.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });
    }

    private void setUpViews() {
        myMessageAdapter = new MyMessageAdapter(this);
        listView.setAdapter(myMessageAdapter);
    }
}
