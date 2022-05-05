/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aabidh.insertionsort;

/**
 *
 * @author Home
 */
public class InsertionSortTest {
    
    public void Insertionsort(int array[]){
        int n =array.length;
        int temp =0;
        
        for(int x =1;x<n;x++){
            int key = array[x];
            int y =x - 1;
            
            while(y >=0 && array[y] > key){
                array[y+1] = array[y];
                y = y -1;
                
            }
            array[y+1]=key;
        }
        
    }

    public static void main(String[] args) {
       InsertionSortTest obj = new InsertionSortTest();
        int myarray[] = {11, 35, 24, 16, 41, 78, 39, 62, 58, 29};
        System.out.println("Array elements before sorting: ");

        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }

        obj.Insertionsort(myarray);
        System.out.println("\nArray elements after sorting: ");

        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }
    }
    
}
