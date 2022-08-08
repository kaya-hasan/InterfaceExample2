public class Macera implements Kitap{
    int fiyat = 75;
    String tur = "Macera";
    String yazar = "Dan Brown";
    @Override
    public void kitapTur() {
        System.out.println("Türü: " + tur);
    }

    @Override
    public void kitapYazar() {
        System.out.println("Yazarı: " +yazar);
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
