package team22;

import java.util.Random;
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

public class team22 {

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
        System.out.print("\nEnter your choice: ");
        Scanner coi = new Scanner(System.in);
        int choice = coi.nextInt();
        switch (choice) {
            case 1: //most repeated value
                mostFrequent();
                break;

            case 2: //sort
                sort_array();
                break;

            case 3: //shuffle
                ShuffleArray();    //20160011
                break;

            case 4: //find largest prime
                Max_Prime();
                break;

            case 5: //find smallest prime
                leastPrime();
                break;

            case 6: //check palindrome
                palindrome();
                break;

            case 7: //check sorted
                checkSorted();
                break;

            case 8: //count primes

                countPrimes();
                break;

            case 9: //reverse array
                reversearray();
                break;

            case 10: //shift array

                shiftArray();
                break;

            case 11: //distinct array

                distinctValues();
                break;

            case 12: //get the max 3 numbers

                Greatest();
                break;

            case 13: //get the min 3 numbers
                smallest();
                break;

            case 14: //get the average
                avg();
                break;

            case 15: //get median
                getMedian();
                break;

            case 16: //return only primes
                primeOnly();
                break;

            case 17: //zero if less than zero
                Set_Zero();
                break;

            case 18: //execute all
                executeAll();
                break;
        }
    }

    private static void executeAll() {
        mostFrequent();
        sort_array();
        ShuffleArray();
        Max_Prime();
        leastPrime();
        palindrome();
        checkSorted();
        countPrimes();
        reversearray();
        shiftArray();
        distinctValues();
        Greatest();
        smallest();
        avg();
        getMedian();
        primeOnly();
        Set_Zero();
    }

    private static int mostFrequent() {
        int max_count = 1, res = Integer.parseInt(arr[0]);
        int curr_count = 1;

        for (int i = 1; i < arr.length; i++) {
            char x = arr[i].charAt(i);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
            if (arr[i] == arr[i - 1]) {
                curr_count++;
            } else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = Integer.parseInt(arr[i - 1]);
                }
                curr_count = 1;
            }
        }
        if (curr_count > max_count) {
            max_count = curr_count;
            res = Integer.parseInt(arr[arr.length - 1]);
        }

        return res;
    }

    private static void palindrome() {
        int reminder, sum = 0, temp;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Please enter your numbers: "));
        temp = n;
        while (n > 0) {
            reminder = n % 10;
            sum = (sum * 10) + reminder;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
    }

    private static void Set_Zero() {
        int[] num = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            char x = arr[k].charAt(k);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                num[i] = 0;
            }
        }
        System.out.println("Array after function : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "   ");
        }
    }

    private static String getMedian() {
        for (int i = 0; i < arr.length; i++) {
            char x = arr[i].charAt(i);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
        }
        sort_array();
        if (arr.length % 2 != 0) {
            return arr[(int) Math.ceil(arr.length / 2.0)];
        } else {
            return "" + ((Integer.parseInt(arr[arr.length / 2]) + Integer.parseInt(arr[(arr.length / 2) - 1])) / 2.0);
        }
    }

    private static void sort_array() {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size :");
        int sz = scan.nextInt();
        int[] input_array = new int[sz];
        System.out.println("enter the array :");
        for (int i = 0; i < sz; i++) {
            input_array[i] = scan.nextInt();
        }*/
        Arrays.sort(arr);
        System.out.println("the array after sort :");
        for (int i = 0; i < arr.length; i++) {
            char x = arr[i].charAt(i);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static int[] ShuffleArray() {
        Random rgen = new Random();  // Random number generator

        for (int i = 0; i < arr.length; i++) {
            int randomPosition = rgen.nextInt(arr.length);
            int temp = Integer.parseInt(arr[i]);
            arr[i] = arr[randomPosition];
            arr[randomPosition] = String.valueOf(temp);
        }

        return null;
        //return array;
    }

    private static void leastPrime() {
        int lp = Integer.MAX_VALUE;
        for (int l = 0; l < arr.length; ++l) {

            char x = arr[l].charAt(l);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }

            if (Integer.parseInt(arr[l]) == 2) {
                lp = Integer.parseInt(arr[l]);
                break;
            }
            if (Integer.parseInt(arr[l]) == 3) {
                lp = Integer.parseInt(arr[l]);
            }
            if (Integer.parseInt(arr[l]) % 2 == 0) {
                continue;
            }
            for (int i = 3; i <= (int) Math.sqrt(Integer.parseInt(arr[l])) + 1; i += 2) {
                if (Integer.parseInt(arr[l]) % i == 0 && Integer.parseInt(arr[l]) != 3) {
                    break;
                }
                if (lp >= Integer.parseInt(arr[l])) {
                    lp = Integer.parseInt(arr[l]);
                }
            }
        }
        if (lp == Integer.MAX_VALUE) {
            System.out.println("No primes");
        } else {
            System.out.print(lp);
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

    private static void reversearray() {
        int j = 0;
        String ar[] = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--)//do reverse
        {

            ar[j] = arr[i];
            j++;
        }
        for (int i = 0; i < ar.length; i++)//print reverse arr
        {
            if (i == ar.length - 1) {
                System.out.println(ar[i]);
            } else {
                System.out.print(ar[i] + ",");
            }
        }
    }

    private static void countPrimes() {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            char x = arr[i].charAt(i);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
            if ((arr[i].toCharArray()[0] >= 'a' && arr[i].toCharArray()[0] <= 'z')
                    || (arr[i].toCharArray()[0] >= 'A' && arr[i].toCharArray()[0] <= 'Z')) {
                System.out.println("Function is applied on numbers only!");
                break;

            } else {
                if (isprime(Integer.parseInt(arr[i]))) {
                    counter++;
                } else {
                    counter += 0;
                }

            }

            //System.out.println(counter);
        }
        if (counter != 0) {
            System.out.println(counter);
        }
    }

    private static boolean isprime(int n) {
        int remainder;
        for (int i = 2; i <= n / 2; i++) {
            char x = arr[i].charAt(i);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
            remainder = n % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }

    private static void checkSorted() {
        for (int i = 0; i < arr.length - 1; i++) {
            char x = arr[i].charAt(i);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
            if (arr[i].charAt(0) > arr[i + 1].charAt(0)) {
                System.out.println("Array is not Sorted");
                return;
            }
        }
        System.out.println("Array is Sorted");
    }

    private static void shiftArray() {
        String newArray = "", array = "";

        for (int i = 0; i < arr.length; i++) {
            array += arr[i];
        }
        System.out.println("Old Array is: ");
        System.out.println(array);
        char temp;
        temp = array.charAt(0);
        for (int i = 1; i < array.length(); i++) {
            newArray += array.charAt(i);

        }
        newArray += temp;

        System.out.println(newArray);

    }

    private static void smallest() {
        int x, y, z;
        System.out.println("Enter three integers");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x < y && x < z) {
            System.out.println("First number is smallest.");
        } else if (y < x && y < z) {
            System.out.println("Second number is smallest.");
        } else if (z < x && z < y) {
            System.out.println("Third number is smallest.");
        } else {
            System.out.println("The numbers are not distinct.");
        }

    }

    private static void Greatest() {
        int x, y, z;
        System.out.println("Enter three integers");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest.");
        } else if (y > x && y > z) {
            System.out.println("Second number is largest.");
        } else if (z > x && z > y) {
            System.out.println("Third number is largest.");
        } else {
            System.out.println("The numbers are not distinct.");
        }

    }

    private static void Max_Prime() {
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char x = arr[i].charAt(i);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
            num[i] = Integer.parseInt(arr[i]);
        }
        int Max = -1, temp = 0;

        for (int i = 0; i < num.length; i++) {
            boolean isPrime = true;
            if (num[i] < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num[i] / 2; j++) {
                    temp = num[i] % j;
                    if (temp == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                if (Max < num[i]) {
                    Max = num[i];
                }
            }
        }
        if (Max == -1) {
            System.out.println("There's no prime numbers in the array ");
        } else {
            System.out.println("Largest prime = " + Max);
        }

    }

    private static void avg() {
        double total = 0.0;
        for (int a = 0; a < arr.length; a++) {
            char x = arr[a].charAt(a);
            if (Character.isLetter(x)) {
                System.out.println("Function is applied on numbers only!");
                break;
            }
            total += Integer.parseInt(arr[a]);
        }
        total /= arr.length;
        System.out.println("the average is " + total);
    }

    private static void primeOnly() {
        String primeNumbersFound = "";
        boolean isPrime = true;
        for (int i = 1; i <= arr.length; i++) {
            isPrime = isprime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println(primeNumbersFound);
    }

    private static void distinctValues() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Array is not distinct");
                }
            }
        }
        System.out.println("Array is distinct");
    }
}
