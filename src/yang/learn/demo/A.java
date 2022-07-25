package yang.learn.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XYHG
 * @version 1.0.0
 * @ClassName A.java
 * @Description TODO
 * @createTime 2022年07月20日 16:00:00
 */
public class A {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
        System.out.println("版本2.1");


    }
    private static void updateList(List list) {
        list.remove(1);
    }
}
