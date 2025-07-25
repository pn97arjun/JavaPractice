package com.java.practiceDaywise;

public class factotialpg_23july2025 {
    static int fcatorial(int n)
    {
        return (n==0)?1:n*fcatorial(n-1);
    }

    public static void main(String[] args) {
        System.out.print(fcatorial(3));
    }
}
