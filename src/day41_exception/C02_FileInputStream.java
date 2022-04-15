package day41_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) throws  {

       String dosyaYolu= "src/day41_exception/dosya.txt";
        FileInputStream fis=new FileInputStream(dosyaYolu);


}
