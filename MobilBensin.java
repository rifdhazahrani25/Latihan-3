public class MobilBensin implements EngineVehicle, FuelVehicle {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar bensin...");
    }
}