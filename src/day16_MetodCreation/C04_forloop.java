package day16_MetodCreation;

import javax.swing.*;

public class C04_forloop {
    public static void main(String[] args) {

        // verilen stringi tersten yazdıran bir kod yazınız

        String str = "Java cok zevkli";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }
    }

}


