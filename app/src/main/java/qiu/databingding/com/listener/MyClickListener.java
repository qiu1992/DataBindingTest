package qiu.databingding.com.listener;

import android.view.View;
import android.widget.Toast;

import qiu.databingding.com.bean.User;

/**
 * Created by Administrator on 2016-6-27.
 */
public interface MyClickListener
{
//    public void onTestBtnClick (View view)
//    {
//        Toast.makeText(view.getContext (), "onTestBtnClick", Toast.LENGTH_SHORT).show();
//    }
//
//    public void onTestBtnLongClick (View view)
//    {
//        Toast.makeText(view.getContext (), "onTestBtnLongClick", Toast.LENGTH_SHORT).show();
//    }
//
//    public void onNameClick (View view)
//    {
//        Toast.makeText(view.getContext (), "onNameClick", Toast.LENGTH_SHORT).show();
//    }

    void onTestBtnClick (View view);
    void onNameClick (View view);
    boolean onTestBtnLongClick (View view);
    void onParamClick (View view, User User);
}
