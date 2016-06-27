package qiu.databingding.com;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import qiu.databingding.com.bean.User;
import qiu.databingding.com.databinding.ActivityMainBinding;
import qiu.databingding.com.listener.MyClickListener;

public class MainActivity extends AppCompatActivity implements MyClickListener
{
    private User user;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        activityMainBinding =  DataBindingUtil.setContentView (this,R.layout.activity_main);
        user = new User ("qiu",24.5f,173.1f);
        activityMainBinding.setUser (user);
        activityMainBinding.setMyListener (this);
    }

    @Override
    public void onTestBtnClick (View view)
    {
        Toast.makeText (this, "onTestBtnClicksss", Toast.LENGTH_SHORT).show ();
        user.setName ("qiuqiu");
        user.setAge (13);
        activityMainBinding.setUser (user);
    }

    @Override
    public void onNameClick (View view)
    {
        Toast.makeText (this, "onNameClickddd", Toast.LENGTH_SHORT).show ();
    }

    @Override
    public boolean onTestBtnLongClick (View view)
    {
        Toast.makeText (this, "onTestBtnLongClick_" + System.currentTimeMillis (), Toast.LENGTH_SHORT).show ();
        return true;
    }

    @Override
    public void onParamClick (View view, User user)
    {
        Toast.makeText (this, "onParamClick:" + user.getName () + user.getAge (), Toast.LENGTH_SHORT).show ();
    }
}
