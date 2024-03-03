package java101;

import java.util.Scanner;

public class LoginSystemTc {
    public static void main(String[] args) {

        String[][] kisiler = {
                {"Burcu KAMACI" , "12345678901"},
                {"Ulas Gultekin" , "23456789012"},
                {"Eren Yardan" , "34567890123"}
        };

        Scanner input = new Scanner(System.in);

        for(;;) {
            System.out.println("Isim Soyisim (Cikis icin lutfen q/Q basiniz...)");
            String isimSoyisim = input.nextLine();
            if(isimSoyisim.equalsIgnoreCase("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }

            boolean bulundu = false;

            for (String[] kisi : kisiler) {
                if(kisi[0].equalsIgnoreCase(isimSoyisim)) {
                    bulundu = true;
                    String tcNoKisi = kisi[1].substring(0,8);
                    String sonuc = tcNoKisi + "***";
                    System.out.println("TC Kimlik No: " + sonuc);
                    System.out.println("Son 3 rakami girin ve onaylamak icin enter tusuna basin!");
                    String onay = input.nextLine();
                    if(onay.equals(kisi[1].substring(8))){
                        System.out.println("Correct");
                    } else {
                        System.out.println("Hata: TC Kimlik No uyusmuyor!");
                    }
                    break;
                }

            }
            if(!bulundu){
                System.out.println("Hata: Kisi bulunamadi!");
            }

        }



    }
}
