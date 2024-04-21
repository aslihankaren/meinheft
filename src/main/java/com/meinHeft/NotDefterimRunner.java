package com.meinHeft;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotDefterimRunner extends NotDefterim {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            boolean notDefterindeKal = true;
            System.out.println("Hosgeldiniz...");


            while (notDefterindeKal) {
                System.out.println("1. NOT EKLE");
                System.out.println("2. NOTLARI LISTELE");
                System.out.println("3: CIKIS");

                System.out.print("Seçiminiz: ");
                try {

                    int tercih = scanner.nextInt();
                    scanner.nextLine(); // Bu satır, int girdisinden sonra kalan newline karakterini temizler. DUMMY?
                    switch (tercih) {
                        case 1:
                            notEkle();
                            System.out.println("Not eklendi.");
                            break;
                        case 2:
                            notlariListele();
                            break;
                        case 3:
                            notDefterindeKal = false;
                            System.out.println("not defterinizden cikiyorsunuz");
                            break;
                        default:
                            System.out.println("GECERLI BIR ISLEM YAPINIZ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Lütfen geçerli bir sayı giriniz!");
                    scanner.nextLine(); // Bu satır, geçersiz girişi temizler.
                }
            }
            scanner.close();
        }

       /* //3. Ana Menüdeki Açıklamaları Geliştirme:
        Kullanıcıya sunulan seçenekler ve onların ne işe yaradığına dair açıklamaları daha net yapabilirsiniz.
        4. Kullanıcı Deneyimini Zenginleştirme:
        Kullanıcıya her işlem sonrasında bir mesaj göstermek, deneyimi daha interaktif ve anlaşılır hale getirebilir.*/

    }
}


