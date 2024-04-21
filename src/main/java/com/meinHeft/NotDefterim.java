package com.meinHeft;

import java.util.LinkedList;
import java.util.Scanner;

public class NotDefterim {



    private static StringBuilder not; //kisa not icin => bunlar modern javada daha cok yayginmis=>çünkü tek iş parçacığı kontekstinde daha performanslıdır.
    private static StringBuilder baslik; //baslik icin
    //StringBuffer'i coklu is parcasi ve güvenirlilik icin tercih ettim ayrica mutable oldugu icin.

    private static LinkedList<NotDefterim> notlar = new LinkedList<>();  //uzun notlar icin
                                                                         //??? neden linkedlist variable seklinde yapmadim?

    //CONSTRUCTOR

    public NotDefterim() {  //default?
    }


//GETTER AND SETTER

    public StringBuilder getNot() {
        return not;
    }

    public void setNot(StringBuilder not) {
        this.not = not;
    }

    public StringBuilder getBaslik() {
        return baslik;
    }

    public void setBaslik(StringBuilder baslik) {
        this.baslik = baslik;
    }


    //TOSTRING ?




    //METHODLARIM
    public static void notEkle() { //hoca static kismini silmis
        Scanner scanner = new Scanner(System.in); //kullanicidan not alacagim icin scanner olusturdum
        System.out.println("Lütfen notunuzu giriniz");
        String kullaniciNotu = scanner.nextLine();  //?  burda neden s.buffer giremiyorum? cünkü scanner sinifi string ile calisiyor burda istersem dönüsüm yapabilirim
        not.append(kullaniciNotu); // Kullanıcı notunu doğrudan not StringBuffer'ına ekler, son iki satir Serkan hocadan
        scanner.close();
    }
    //burda this. keywordunu staicten dolayi kabul etmedi, static i silersem runner da method calismiyor. dolayisiyla sildim.



 /*   public  void notSil(int index) {
     if (index >= 0 && index < not.length()) { //StringBuffer da index belirtilerek sildigi icin ve bilmedigim icin length aldim
        not.deleteCharAt(index);
     } else {
        System.out.println(" Lütfen yazili bir alan deneyin!");
     }
    } ILK OLUSTURDUGUM NOTSIL METHODU
*/

    public static void notSil(int index) {
        if (index >= 0 && index < notlar.size()) {
            notlar.remove(index); // LinkedList'ten not siler
        } else {
            System.out.println("Geçerli bir indeks giriniz!");
        }
    }


  /*  public static void notlariListele() {
        if (baslik.length() == 0) {
            System.out.println("not defteriniz bos görünüyor");
        }

        System.out.println("notlariniz: ");
        for (int i = 0; i < baslik.length(); i++) {
            System.out.println((i + 1) + ". " + baslik.charAt(i));  //i+1 yapmamin nedeni kullaniciya gosterirken 1 baslik, 2 baslik diye gitmek icin , eklemezsem 0dan baslar
        }
    }ILK OLUSTURDUGUM  NOTLARI LISTELE METHODU
*/
    public static void notlariListele() {
        if (notlar.isEmpty()) {
            System.out.println("Not defteriniz boş görünüyor.");
        } else {
            System.out.println("Notlarınız:");
            for (int i = 0; i < notlar.size(); i++) {
                System.out.println((i + 1) + ". Not: " + notlar.get(i).getNot());
                System.out.println("   Başlık: " + notlar.get(i).getBaslik());
            }
        }
    }
    //Bu metod, LinkedList'teki her NotDefterim nesnesinin not ve baslik bilgilerini yazdırır.







}
