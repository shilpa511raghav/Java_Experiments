package ArraysDemo;

public class ArrayDemo {

    public static void main (String [] args){
//    declaration of array means simply tells the complier that what type of data to be stored in declared array
        int[] arr;
//    instantiation of array means allocate a memory to an array using new keyword
        arr = new int[4];
//    Initialization of array means assign some value to array elements
        arr[0] = 12;
        arr[1] = 34;
        arr[2] = 45;
        arr[3] = 56;
//Accessing java array elements using loop
        for(int i=0;i<arr.length;i++){
            System.out.println("arr index "+"__"+ i +"_value_"+arr[i]);
        }
    }
}
