package qiu.databingding.com;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import qiu.databingding.com.bean.User;
import qiu.databingding.com.databinding.ActivityMainBinding;
import qiu.databingding.com.listener.MyClickListener;

public class MainActivity extends AppCompatActivity implements MyClickListener
{
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        final ActivityMainBinding binding =  DataBindingUtil.setContentView (this,R.layout.activity_main);
        final User user = new User ("qiu",24.5f,173.1f);
        binding.setUser (user);
        binding.setMyListener (this);
    }

    @Override
    public void onTestBtnClick (View view)
    {
        Toast.makeText (this, "onTestBtnClicksss", Toast.LENGTH_SHORT).show ();
    }

    @Override
    public void onNameClick (View view)
    {
        Toast.makeText (this, "onNameClickddd", Toast.LENGTH_SHORT).show ();
    }
}
