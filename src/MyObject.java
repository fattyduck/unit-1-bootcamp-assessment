/**
 * Created by fattyduck on 5/28/15.
 */
public class MyObject
{
    String s = "s";
    int i = (int) 'i';

    public MyObject(String s, int i){
        this.s = s;
        this.i = i;
    }

    public void setName(String s){
        this.s = s;

    }
    public String getName(){
        return s;
    }

    public void setAge(int i){
        this.i = i;
    }

    public int getAge(){
        return i;
    }
}
