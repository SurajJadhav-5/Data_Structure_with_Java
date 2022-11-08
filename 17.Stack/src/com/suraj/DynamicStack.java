package com.suraj;

import java.lang.reflect.Array;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int value){

        // it will be of infinite size now
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

//            System.arraycopy(data, 0, temp, 0, data.length);
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(value);


    }

}
