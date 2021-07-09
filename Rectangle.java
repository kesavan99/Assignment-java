import java.io.*;
import java.util.*;

public class Rectangle{
    int lenght;
    int breath;

    Rectangle(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4,5);
        Rectangle obj1 = new Rectangle(5,8);

        System.out.println(obj.area());
        System.out.println(obj1.area());





    }


}