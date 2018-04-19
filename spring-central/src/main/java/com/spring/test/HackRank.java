package com.spring.test;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.*;

public class HackRank {


    public static void main(String[] args) {


        String[] str = new String[]{"str", "str", "str", "str1", "str1", "str2", "str2", "str3"};
        HashMap<String, Object> map = new HashMap<>();

        for(int i = 0; i < str.length; i++) {
            map.put(str[i], new Object());
        }


        for (String key : map.keySet()) {
            System.out.println("key = " + key);
        }
    }

    @Test
    public void test5() {

        String data = null;
        Gson gson = new Gson();

        HackRank hackRank = gson.fromJson(data, HackRank.class);
        System.out.println(hackRank);
    }


    @Test
    public void test4() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        } else{
            // Complete the code
            if(n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);

    }


    public void test3() {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();

        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;

        Long totalCostLong = Math.round(meal_cost + tip + tax);
        System.out.println("The total meal cost is " + totalCostLong + " dollars.");


    }


    @Test
    public void day02() {


        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        double d1 = scan.nextDouble();
        String str = scan.nextLine();
        String string = scan.nextLine();

        System.out.println(i + j);
        System.out.println(d + d1);
        System.out.println(s + string);
        scan.close();


    }

    /**
     * day07
     */
    @Test
    public void test1() {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        Collections.reverse(list);
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
