package com.company;

public class QuickSort {
    int partition(int arr[], int left, int right)
    {
        int pivot = arr[right];
        int i = (left-1);
        for (int j=left; j<right; j++)
        {

            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i+1;
    }

    void sort(int arr[], int left, int right)
    {
        if (left < right)
        {
            int pi = partition(arr, left, right);
            sort(arr, left, pi-1);
            sort(arr, pi+1, right);
        }
    }
}
