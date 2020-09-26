import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test
{
    public Test() {System.out.println("SAU");};
    public static void gfg(String s)
    {
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }

    public static void main(String args[])
    {
        gfg(null);
        HashSet<String> ff = new HashSet<String>();
        ff.add("Apple");
        ff.add("Mango");
        ff.add("Apple");
        ff.add("AppleMango");
        System.out.println(ff);
        ArrayList< Integer > arraylist = new ArrayList < Integer > ();

        arraylist.add(10010);
        arraylist.add(5);
        arraylist.add(4);
        arraylist.add(2);

        for (int i = 0; i < arraylist.size(); i++) {

            for (int j = arraylist.size() - 1; j > i; j--) {
                if (arraylist.get(i) > arraylist.get(j)) {

                    int tmp = arraylist.get(i);
                    arraylist.set(i,arraylist.get(j));
                    arraylist.set(j,tmp);

                }

            }

        }
        for (int i: arraylist) {
            System.out.print(i + " ");
        }
    }

    class Test1 extends Test{
        public  Test1(){

        }
    }
}