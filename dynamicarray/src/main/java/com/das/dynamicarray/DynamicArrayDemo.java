package com.das.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");

        DynamicArray dArray=new DynamicArray();
        dArray.put(4);

        System.out.println(dArray.getSize());


        dArray.put(88);

        System.out.println(dArray.getSize());


        dArray.put(99);

        System.out.println(dArray.getSize());


        dArray.put(10);

        System.out.println(dArray.getSize());

      for (int i=0;i<dArray.size;i++){
          System.out.println(i+1 +" : "+dArray.get(i));
      }
    }
}
