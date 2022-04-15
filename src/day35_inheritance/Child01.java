package day35_inheritance;

import static day35_inheritance.Parent.*;

public class Child01 extends Parent{
    public static void main(String[] args) {
        /*
        Child class hic bir objeye ihtiyac duymadan
        parent class'daki variable ve method'lara ulasabilir
         */
        System.out.println(isim); // Neval
        System.out.println(fabrika); // Yildiz Tekstil
        method1();
        method2();
    }
}