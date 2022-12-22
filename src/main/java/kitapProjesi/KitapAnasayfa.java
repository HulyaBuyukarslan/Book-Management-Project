package kitapProjesi;

import java.util.Scanner;
import static kitapProjesi.Kitap_Methodlar.*;

    public class KitapAnasayfa {



        public static void menu() throws InterruptedException {

            Scanner input = new Scanner(System.in);


            System.out.println("************ KİTABEVİMİZE HOŞGELDİNİZ ************\n" +
                    "----------<<<<< KİTAP MENÜSÜ >>>>>----------\n" +
                    "1-Kitap Ekle\n" +
                    "2-Numara İle Kitap Görüntüle\n" +
                    "3-Bilgi İle Kitap Görüntüle\n" +
                    "4-Numara İle Kitap Sil\n" +
                    "5-Tüm Kitapları Listele\n" +
                    "6-Çıkış");
            System.out.println("Yapmak istediğiniz islemi seciniz");
            String islem = input.nextLine();


            switch (islem) {
                case "1":
                    kitapEkle();
                    break;
                case "2":
                    kitapGoruntuleNo();
                    break;
                case "3":
                    kitapGoruntuleBilgi();
                    break;
                case "4":
                    kitapSil();
                    break;
                case "5":
                    kitapListele();
                    break;
                case "6":
                    cikis();
                    break;
                default:
                    System.out.println("Yanlıs bir secim yaptınız. Tekrar deneyiniz");
                    menu();

            }
        }



    }
