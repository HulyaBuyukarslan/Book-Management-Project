package kitapProjesi;

import java.util.*;

    public class Kitap_Methodlar {

        static Scanner input = new Scanner(System.in);
        static Scanner scan = new Scanner(System.in);
        static Map<Integer, KitapPojo> kitapListesi = new HashMap<>();

        //  static Set<Integer> kitapNumaralari = kitapListesi.keySet();
        static Set<Map.Entry<Integer, KitapPojo>> kitapListesiSet = kitapListesi.entrySet();


        public static void kitapEkle() throws InterruptedException {


            System.out.println("----------<<<<< KİTAP BİLGİLERİ EKLEME SAYFASI >>>>>----------");
            System.out.println("Eklemek istediğiniz kitabın ismini giriniz");
            String kitapAdi = scan.nextLine().toUpperCase();
            System.out.println("Eklemek istediğiniz kitabın yazarını giriniz");
            String kitapYazari = scan.nextLine().toUpperCase();
            System.out.println("Eklemek istediğiniz kitabın fiyatını giriniz");
            double kitapFiyati = input.nextDouble();
            int kitapNumarasi = KitapPojo.kitapNumarasi;
            KitapPojo.kitapNumarasi++;


            KitapPojo kitapObje = new KitapPojo(kitapAdi, kitapYazari, kitapFiyati);
            kitapListesi.put(kitapNumarasi, kitapObje);

            System.out.println("Bilgilerini verdiğiniz kitap başarıyla eklenmiştir.");
            kitapListesi.get(1000).getKitapAdi();


            for (Map.Entry<Integer, KitapPojo> w : kitapListesiSet) {
                System.out.println(w.getKey() + "--->" + w.getValue().getKitapAdi() + "--->" +
                        w.getValue().getKitapYazari() + "--->" +
                        w.getValue().getKitapFiyati());
            }
            System.out.println();

            System.out.println("Kitap eklemeye devam etmek için 1'e basiniz\n" +
                    "Anasayfaya dönmek için 2'e basiniz\n" +
                    "Cikmak için herhangi bir tuşa basınız");

            String secim = scan.nextLine();
            if (secim.equals("1")) {
                kitapEkle();
            } else if (secim.equals("2")) {
                KitapAnasayfa.menu();
            } else {
                cikis();
            }

        }

        public static void kitapGoruntuleNo() throws InterruptedException {
            System.out.println("----------<<<<< KİTAP BİLGİLERİ GÖRÜNTÜLEME SAYFASI >>>>>----------");
            System.out.println("Görüntülemek istediğiniz kitabin numarasini giriniz");
            int kitapNo = input.nextInt();

            if (kitapListesi.containsKey(kitapNo)) {
                KitapPojo kitapObje = kitapListesi.get(kitapNo);
                System.out.println(kitapNo + "--->" + kitapObje);

                System.out.println();

                System.out.println("Kitap görüntülemeye devam etmek icin 1'e basiniz\n" +
                        "Anasayfaya dönmek icin 2'e basiniz\n" +
                        "Cikmak icin herhangi bir tusa basiniz");

                String secim = scan.nextLine();
                if (secim.equals("1")) {
                    kitapGoruntuleNo();
                } else if (secim.equals("2")) {
                    KitapAnasayfa.menu();
                } else {
                    cikis();
                }

            } else {
                System.out.println("Böyle bir kitap numarasi yoktur. Lutfen tekrar deneyiniz");
                kitapGoruntuleNo();
            }

        }


        public static void kitapGoruntuleBilgi() throws InterruptedException {
            System.out.println("----------<<<<< KİTAP BİLGİLERİ GÖRÜNTÜLEME SAYFASI 2 >>>>>----------");
            System.out.println("Aradiginiz kitabin adını giriniz");
            String kitapAdi = scan.nextLine().toUpperCase();

            boolean kitapVarMi= false;

            for (Map.Entry<Integer, KitapPojo> w : kitapListesiSet) {

                if (w.getValue().getKitapAdi().contains(kitapAdi)) {
                    int key = w.getKey();

                    System.out.println(key + "--->" + w.getValue().getKitapAdi() + "--->"
                            + w.getValue().getKitapYazari() + "--->"
                            + w.getValue().getKitapFiyati());
                    kitapVarMi=true;

                    System.out.println();
                    System.out.println("Kitap görüntülemeye devam etmek icin 1'e basiniz\n" +
                            "Anasayfaya dönmek icin 2'e basiniz\n" +
                            "Cikmak icin herhangi bir tusa basiniz");

                    String secim = scan.nextLine();
                    if (secim.equals("1")) {
                        kitapGoruntuleBilgi();
                    } else if (secim.equals("2")) {
                        KitapAnasayfa.menu();
                    } else {
                        cikis();
                    }
                }
            }
            if (!kitapVarMi) {
                System.out.println("Boyle bir  kitap yoktur. Bir daha deneyiniz");
                kitapGoruntuleBilgi();
            }



        }

        public static void kitapSil() throws InterruptedException {

            System.out.println("----------<<<<< KİTAP BİLGİLERİ SİLME SAYFASI >>>>>----------");
            System.out.println("Silmek istediğiniz kitabin numarasini giriniz");
            int kitapNo = input.nextInt();

            if (kitapListesi.containsKey(kitapNo)) {
                System.out.println(kitapListesi.get(kitapNo));
                kitapListesi.remove(kitapNo);
                System.out.println("Bilgilerini verdiğiniz kitap basariyla silinmiştir.");

                System.out.println();


                System.out.println("Kitap silmeye devam etmek icin 1'e basiniz\n" +
                        "Anasayfaya dönmek icin 2'e basiniz\n" +
                        "Cikmak için herhangi bir tusa basiniz");

                String secim = scan.nextLine();
                if (secim.equals("1")) {
                    kitapSil();
                } else if (secim.equals("2")) {
                    KitapAnasayfa.menu();
                } else {
                    cikis();
                }

            } else {
                System.out.println("Böyle bir kitap numarası yoktur.Lutfen tekrar deneyiniz");
                kitapSil();
            }

        }


        public static void kitapListele() throws InterruptedException {

            System.out.println("----------<<<<< KİTAP LİSTESİ >>>>>----------");
            System.out.println("Kitap No             Kitabin Adi               Kitabin Yazari      Kitabin Fiyati ");


            for (Map.Entry<Integer, KitapPojo> w : kitapListesiSet) {
                Integer key = w.getKey();

                System.out.printf("%-20s %-25s %-19s %-15s\n", key, kitapListesi.get(key).getKitapAdi(),
                        kitapListesi.get(key).getKitapYazari(), kitapListesi.get(key).getKitapFiyati());
            }

            System.out.println();
            System.out.println("Anasayfaya dönmek icin 1'e basınız\n" +
                    "Çıkmak için herhangi bir tusa basiniz");

            String secim = scan.nextLine();
            if (secim.equals("1")) {
                KitapAnasayfa.menu();
            } else {
                cikis();
            }

        }


        public static void cikis() throws InterruptedException {

            System.out.println("Sayfamizi ziyaret ettiginiz icin tesekkur ederiz...");

        }

    }
