//Name: Prawal Pokharel
//Class: 21F 67727 - CSCI308-A-ADV DATA STRUCTURS,ALGORTHMS I
//Date: 10/18/2021

package Heap;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Driver
        Integer size = 0;
        HeapSort ob = new HeapSort();
        ArrayList<Integer> array = new ArrayList<Integer>();//Making a temporary arraylist for dynamic size.
        Integer[] arr = new Integer[array.size()];
        Integer choice = 0;
        Integer newelem = 0;
        while (choice != 4) {
            try {
                System.out.println("Hi, welcome to Heap sort, type 1 to insert, 2 to print, 3 to sort, 5 to clear and 4 to exit. ");
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();//Saving user choice
                if (choice == 1) {
                    System.out.println("What do you want the size to be?");
                    size = scanner.nextInt();//Size of our array
                    array = new ArrayList<Integer>();//Making a new temporary arraylist.
                    for (int i = 0; i < size; i++) {
                        System.out.println("What do you want to add?");
                        newelem = scanner.nextInt();
                        array.add(newelem);//Calling function to add new element
                    }
                    arr = new Integer[array.size()]; //Creating a new regular array.
                    arr = array.toArray(arr);//Converting our temporary Arraylist to regular array.
                    System.out.println("Our list is: ");
                    UserInterface.printArray(arr);//Printing array after user is done adding
                } else if (choice == 2) {
                    if (size == 0) {
                        System.out.println("Array is empty!!");//if user tries to print an empty array
                    } else {
                        UserInterface.printArray(arr);//Printing array after user is done adding
                    }
                } else if (choice == 3) {
                    ob.sort(arr);
                    System.out.println("Sorting completed!!");
                } else if (choice == 5) {
                    Arrays.fill(arr, null); //Java functionality to clear any array
                    System.out.println("Array Cleared !!!!");
                } else if (choice == 4) {
                    System.out.println("Good Bye!!");
                } else {
                    System.out.println("Valid input required.");//Error Checking
                }
            } catch (Exception e) { //Making sure input is integer.
                System.out.println(" VALUE ENTERED NOT INTEGER OR REACHED THE END OF THE LIST");
                System.out.println("");
            }
        }
    }}
