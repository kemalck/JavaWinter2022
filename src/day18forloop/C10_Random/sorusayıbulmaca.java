package day18forloop.C10_Random;

import java.util.Random;
import java.util.Scanner;

public class sorusayıbulmaca {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan=new Scanner(System.in);
        Random random =new Random();

        int rand=rnd.nextInt(100);
        int num=0;
        int tahmin=0;
        while(num!=rand) {
            System.out.println("1-100 arasindaki tahmininizi giriniz");
            num=scan.nextInt();
            //System.out.println(rand); kopya çekmek isteyenler için
            tahmin++;
            if(3-tahmin!=0) {
                System.out.println((3-tahmin)+" " + "tahmin hakkiniz kaldi");
            }else {
                System.out.println("hakkınız bitmistir");
                break;
            }
            if(num<rand) {
                System.out.println("sayiyi büyüt");
                //continue;
            }else if(num>rand) {
                System.out.println("sayiyi kücült");
                //continue;
            }else{
                System.out.println("aferin köfte ");
            }
            System.out.println("tahmin=" + tahmin);
        }



    }
}

