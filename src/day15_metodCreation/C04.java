package day15_metodCreation;

public class C04 {

    // 1- method olusturmak icin methodun adını yazarız
    // 2- methoda giderken goturmem gereken variable varsa bunu methoda eklemeliyim.
    private static void besharfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 5");
        System.out.println("kelimenin tersten yazilisi: "+ tersKelime  );
    }
    private static void dortharfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi: "+ tersKelime  );    }
    private static void ucharfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi: "+ tersKelime  );}

    public static void ucHarfiTersineCevir(String str) {
    }

    public static void dortHarfiTersineCevir(String kelime) {
    }

    // calışmaz cünkü main metod burada yok depolama yapıyor
    //  başka claslardan buradaki bilgiler kullanılabilir
    // ÇOK ÖNEMLİ NOTTTTTTTT
    // BAŞKA CLASLARDAN KULLANILABİLECEK METOD VEYA VERİABLE BARINDIRIR

}
