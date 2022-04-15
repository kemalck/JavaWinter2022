package day17forloop;

public class C02_calışmayanloopbody {

    public static void main(String[] args) {

       // başlamadan çalışmayacak çünkü başlarken false YANLIŞ
        // BAŞLANGIÇ DEĞERİ BİTİŞ KOSULUNU SAĞLAMADIĞINDAN LOOP BODYSİ
        // LOOP BAŞLAMADAN SONA ERDİ


        for (int i =0; i>=10; i++){
            System.out.println(i);


        }

        System.out.println("başlamadan çalışmayacak çünkü başlarken false YANLIŞ");
    }
}
