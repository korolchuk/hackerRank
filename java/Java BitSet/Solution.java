import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        Map<Integer, BitSet> map = new HashMap<>();
        map.put(1, b1);
        map.put(2, b2);

        for(int i = 0; i < m; i++) {
            String op = sc.next();
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            switch(op) {
                case "AND" : map.get(val1).and(map.get(val2));
                    break;
                case "OR" : map.get(val1).or(map.get(val2));
                    break;
                case "XOR" : map.get(val1).xor(map.get(val2));
                    break;
                case "SET" : map.get(val1).set(val2);
                    break;
                case "FLIP" : map.get(val1).flip(val2);
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}

