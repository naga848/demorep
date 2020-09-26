import java.util.ArrayList;

public class ThreadTest {
    public static void  main(String[] args){
        Thread t = new MyThread(){
            public void run(){
                System.out.print("foo ");
            }
        };
        t.start();
        String s1 = "abc";
        String s2 = s1;
        s1+= "d";
        System.out.println(s1 +" "+ s2 + " "+ (s1==s2));
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 +" "+ sb2 + " "+ (sb1==sb2));
    }

}
class Business{}
class Hotel extends Business{}
class Inn extends Hotel{};
class MyThread extends Thread{
    MyThread(){
        System.out.print("MyThread ");
    }
    public void run(){
        System.out.print("bar ");
    }

    public void run(String s){
        System.out.print("baz ");
    }
}
