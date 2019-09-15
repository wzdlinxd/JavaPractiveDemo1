package com.linxd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void test1() {
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        int k = input1.nextInt();
        int[] values = new int[n];
        String valueStr = "";
        valueStr = input1.nextLine();

        input1.close();
    }

    public static void main(String[] args) {
       /* Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        int k = input1.nextInt();
        char[] values = new char[n];
        String valueStr = "";
        valueStr = input1.nextLine();
        input1.close();
        values = valueStr.toCharArray();
        TreeMap map = new TreeMap();
        for (char value : values) {
            boolean flag = map.containsKey(value);
            if (flag) {
                 o = map.get(value);
            }
        }*/
    }
    class KV {
        private char key;
        private int count;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            KV kv = (KV) o;
            return key == kv.key;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }
    }


    
}
