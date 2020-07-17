package com.das.dynamicarray;

import java.util.Arrays;

public class DynamicArray {



        int[] data;
        int size;

        public DynamicArray(){
            //initalize val
            size=0;
            data=new int[1]; //array have one elemnet
        }

        public int getSize(){
            return data.length;
        }

        public int get(int index){ // fun to get element by index
            return data[index];
        }

        public void put(int element){
            ensureCapicity(size+1);
            data[size++]=element;
        }

        //take the low capicity in array
        private void ensureCapicity(int minCapicity){
            int oldCapicity=data.length;
            if (minCapicity>oldCapicity){
                int newCapicity=oldCapicity*2; //ضاعف حجم المصفوفة
                if(newCapicity<minCapicity)
                    //if item delete
                    newCapicity=minCapicity;
                data= Arrays.copyOf(data,newCapicity);//(array ,new Size of array
            }

        }


    }

