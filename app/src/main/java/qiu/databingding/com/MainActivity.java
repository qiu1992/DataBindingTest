package qiu.databingding.com;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import qiu.databingding.com.bean.Dog;
import qiu.databingding.com.bean.User;
//import qiu.databingding.com.databinding.ActivityMainBinding;
import qiu.databingding.com.databinding.TestClass;
import qiu.databingding.com.listener.MyClickListener;

public class MainActivity extends AppCompatActivity implements MyClickListener
{
    private User user;
    private TestClass activityMainBinding;

    private Dog dog;


    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        activityMainBinding =  DataBindingUtil.setContentView (this,R.layout.activity_main);
        user = new User ("qiu",24.5f,173.1f);
        activityMainBinding.setUser (user);
        activityMainBinding.setMyListener (this);

        dog = new Dog ("小黑",30.89f);
        activityMainBinding.setDog (dog);

        findViewById (R.id.databingding_btn).setOnClickListener (new View.OnClickListener ()
        {
            @Override
            public void onClick (View v)
            {
                if (dog.getName ().equals ("小白"))
                {
                    dog.setName ("小黑");
                }
                else if (dog.getName ().equals ("小黑"))
                {
                    dog.setName ("小红");
                }
                else
                {
                    dog.setName ("小白");
                }
            }
        });
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

    @Override
    public void onSaveClick (User user)
    {
        Toast.makeText (this, "onSaveClick:" + user.getName () + "/" + user.getAge (), Toast.LENGTH_SHORT).show ();
        activityMainBinding.setNote ("this is my note");
        Log.d ("meme",activityMainBinding.getNote () +"");
        activityMainBinding.getRoot ();
    }
}
