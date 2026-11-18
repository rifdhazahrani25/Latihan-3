public class Main {
    public static void main(String[] args) {
        // Menguji Mobil Listrik
        MobilListrik mobilListrik = new MobilListrik();
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();

        System.out.println("-------------------");

        // Menguji Mobil Bensin
        MobilBensin mobilBensin = new MobilBensin();
        mobilBensin.startEngine();
        mobilBensin.isiBahanBakar();

        System.out.println("-------------------");

        // Menguji Sepeda (Aman dari error runtime karena tidak dipaksa memiliki mesin)
        Sepeda sepeda = new Sepeda();
        sepeda.gowes();
    }
}