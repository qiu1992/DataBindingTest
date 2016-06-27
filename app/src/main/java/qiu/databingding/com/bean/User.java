package qiu.databingding.com.bean;

/**
 * Created by Administrator on 2016-6-27.
 */
public class User
{
    private String name;
    private float age;
    private float height;

    public User ()
    {
    }

    public User (String name, float age, float height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public float getAge ()
    {
        return age;
    }

    public void setAge (float age)
    {
        this.age = age;
    }

    public float getHeight ()
    {
        return height;
    }

    public void setHeight (float height)
    {
        this.height = height;
    }
}
