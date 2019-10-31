package arraylistPrograms;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList a1 = new ArrayList();
//        heterogeneous insertion
        a1.add(10); // integers insertion
        a1.add(10.5); // double insertion
        a1.add("test data"); // string insertion
        a1.add("a"); // character insertion
        a1.add(null); // null allowed
        a1.add(10); // duplicate integer insertion
        System.out.println(a1);

    }
}
