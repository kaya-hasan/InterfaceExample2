public class Polisiye implements Kitap{
    int fiyat = 60;
    String tur = "Polisiye";
    String yazar = "Agatha Christie";
    @Override
    public void kitapTur() {
        String kitapTuru = tur;
        System.out.println("Türü: " + tur);
    }

    @Override
    public void kitapYazar() {
        System.out.println("Yazarı: " + yazar);
    }

    @Override
    public void fiyat() {
        int kitapFiyat = fiyat;
        System.out.println("Fiyatı: " + fiyat + "₺");
    }

    @Override
    public void yazdir() {
        this.kitapTur();
        this.kitapYazar();
        this.fiyat();
    }
}
