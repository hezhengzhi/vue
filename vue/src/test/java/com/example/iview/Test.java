package com.example.iview;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by pc on 2018/12/6 15:43
 **/
public class Test extends Base {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            System.err.println(it.next());
        }


    }
}

class Base{

}