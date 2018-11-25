/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team22;
java.lang.NumberFormatException;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author AndrOoO
 */
public class Team22 {

    private static String[] arr;

    public static void main(String[] args) {
        System.out.println("Team 22");
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        arr = new String[siz];

        System.out.println("Enter array elements:");
        for (int i = 0; i < siz; i++) {
            arr[i] = sc.next();
        }

        printMenu();
        int choice = sc.nextInt();
        switch (choice) {
            case 1: //most repeated value

                break;

            case 2: //sort

                break;

            case 3: //shuffle

                break;

            case 4: //find largest prime

                break;

            case 5: //find smallest prime
				leastPrime(arr,siz);
                break;

            case 6: //check palindrome

                break;

            case 7: //check sorted

                break;

            case 8: //count primes

                break;

            case 9: //reverse array

                break;

            case 10: //shift array

                break;

            case 11: //distinct array

                break;

            case 12: //get the max 3 numbers

                break;

            case 13: //get the min 3 numbers

                break;

            case 14: //get the average

                break;

            case 15: //get median

                break;

            case 16: //return only primes

                break;

            case 17: //zero if less than zero

                break;

            case 18: //execute all

                break;
        }

    }

    private static void printMenu() {
        System.out.println("Choose the number of operation you want to execute:");
        System.out.println("1-\tMost repeated value");
        System.out.println("2-\tSort");
        System.out.println("3-\tShuffle");
        System.out.println("4-\tFind the largest prime");
        System.out.println("5-\tFind the smallest prime");
        System.out.println("6-\tCheck palindrome");
        System.out.println("7-\tCheck sorted");
        System.out.println("8-\tCount primes");
        System.out.println("9-\tReverse array");
        System.out.println("10-\tShift array");
        System.out.println("11-\tDistinct array");
        System.out.println("12-\tGet the maximum 3 numbers");
        System.out.println("13-\tGet the minimum 3 numbers");
        System.out.println("14-\tGet average");
        System.out.println("15-\tGet median");
        System.out.println("16-\tReturn only primes");
        System.out.println("17-\tZero if less than zero");
        System.out.println("18-\tExecute All");

    }
	private static void leastPrime(string[] a,int size)
	{	int lp = Integer.MAX_VALUE;
		for (int l = 0; l < size; ++l) 
	{
      if (Integer.parseInt(numbers[l]) == 2) 
	  {
        lp = Integer.parseInt(numbers[l]);
        break;
      }
      if (Integer.parseInt(numbers[l]) == 3)
        lp = Integer.parseInt(numbers[l]);
      if (Integer.parseInt(numbers[l]) % 2 == 0)
        continue;
      for (int i = 3; i <= (int) Math.sqrt(Integer.parseInt(numbers[l])) + 1; i += 2) 
	  {
        if (Integer.parseInt(numbers[l]) % i == 0 && Integer.parseInt(numbers[l]) != 3)
          break;
        if (lp >= Integer.parseInt(numbers[l]))
          lp = Integer.parseInt(numbers[l]);
      }
    }
    if (lp == Integer.MAX_VALUE)
      System.out.println("No primes");
    else
      System.out.print(lp);	
	}
}
