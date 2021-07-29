package com.example.lib;

public class myJavClass {
    public static void main(String[] args) {
    int [] ar = {1,2,3,4,5,6,7,8,9};
    int sum = 0;

    for (int i =0; i <= 8; i+=2){
        sum+= ar[i];
    }
        System.out.println(sum);
    }
}
