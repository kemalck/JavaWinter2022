package day17forloop;

public class C04_foorloop {
    public static void main(String[] args) {

        // 10 ile 30 arasındaki sayılar arasına virgul koyarak yazdır
        // 10 30 dahil

        for (int i =1; i<=30; i++){
            System.out.print(i +",");
        }
        System.out.println(30);

        int baslangıc=15;
        int bitis=20;
        for (int i= baslangıc; i <=bitis ;i++){
            if (i<bitis) {
                System.out.println(i + ",");
            } else{
            }
        }
    }
}
