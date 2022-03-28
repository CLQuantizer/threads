package com.threads.app;
import java.util.concurrent.*;
import java.util.*;
import java.util.stream.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[]x ={1,4,5,66,7,8};
        bubbleSort(x);
        for(int i=0;i<x.length;i++)System.out.println(x[i]);
    }
    // new baby
    //master version
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
