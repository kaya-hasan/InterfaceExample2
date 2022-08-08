public class Main {
    public static void main(String[] args) {
        BilimKurgu bilimKurgu = new BilimKurgu();
        bilimKurgu.yazdir();
        System.out.println("------------------");

        Polisiye polisiye = new Polisiye();
        polisiye.yazdir();
        System.out.println("------------------");

        Macera macera = new Macera();
        macera.yazdir();

    }
}