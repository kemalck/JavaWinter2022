package day14_stringManipulation;

public class C02_terstenyazdırma {
    public static void main(String[] args) {

        // kullanıcıdan 4 harfli bir
        // kelime isteyin ve tersten yazırın

        // Scanner scan yazdır veri isteniyor

        String input="Mavi";

        String tersStr= input.substring(3)+
                        input.substring(2,3)+
                        input.substring(1,2)+
                        input.substring(0,1);
        System.out.println(tersStr);
    }
}
