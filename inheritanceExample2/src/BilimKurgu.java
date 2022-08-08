import com.sun.security.jgss.GSSUtil;

public class BilimKurgu implements Kitap{
    int fiyat = 50;
    String tur = "Bilim Kurgu";
    String yazar = "Ray Bradbury";
    @Override
    public void kitapTur() {
        System.out.println("Türü: " + tur);
    }

    @Override
    public void kitapYazar() {
        System.out.println("Yazarı: " + yazar);
    }

    @Override
    public void fiyat() {
        int kitapFiyat = fiyat;
        System.out.println("Fiyatı: "+ fiyat + "₺");
    }

    @Override
    public void yazdir() {
        this.kitapTur();
        this.kitapYazar();
        this.fiyat();
    }
}
