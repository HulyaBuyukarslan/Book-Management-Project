package kitapProjesi;

public class KitapPojo {

    private String kitapAdi;
    private String kitapYazari;
    private double kitapFiyati;

    static int kitapNumarasi=1000;

    public KitapPojo(String kitapAdi, String kitapYazari, double kitapFiyati) {
        this.kitapAdi = kitapAdi;
        this.kitapYazari = kitapYazari;
        this.kitapFiyati = kitapFiyati;
    }


    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitapYazari() {
        return kitapYazari;
    }

    public void setKitapYazari(String kitapYazari) {
        this.kitapYazari = kitapYazari;
    }

    public double getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(double kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
    }


    @Override
    public String toString() {
        return "Kitap Adi = " + kitapAdi + ",  " +
                "Kitap Yazari = " + kitapYazari + ",  " +
                "Kitap Fiyati = " + kitapFiyati ;

    }
}
