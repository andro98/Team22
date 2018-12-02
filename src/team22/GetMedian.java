/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team22;

/**
 *
 * @author Khloud
 */
public class GetMedian {
    public void insertionSort(String [] arr, int size)
    {
        int i, j;
        String key = "";
        for (i = 1; i < size; i++) 
        { 
            key = arr[i]; 
            j = i-1; 
            while (j >= 0 && arr[j].compareTo(key) > 0) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    }
    public String getMedian(String[] arr, int size)
    {
        insertionSort(arr, size);
        if (size %2 != 0)   
        {
            return arr[(int)Math.ceil(size/2.0)];
        }
        else
        {
            return ""+ ((Integer.parseInt(arr[size/2]) + Integer.parseInt(arr[(size/2)-1]))/2.0);
        }
        
    }
    
}
