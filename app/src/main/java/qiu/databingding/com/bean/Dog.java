package qiu.databingding.com.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import qiu.databingding.com.BR;

/**
 * Created by Administrator on 2016-6-27.
 */
public class Dog extends BaseObservable
{
    private String name;
    private float weight;

    public Dog ()
    {
    }

    public Dog (String name, float weight)
    {
        this.name = name;
        this.weight = weight;
    }

    @Bindable
    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
        notifyPropertyChanged (BR.name);
    }

    public float getWeight ()
    {
        return weight;
    }

    public void setWeight (float weight)
    {
        this.weight = weight;
    }
}
