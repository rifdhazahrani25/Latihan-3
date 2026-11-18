public class MobilListrik implements EngineVehicle, ElectricVehicle {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil listrik...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai kendaraan listrik...");
    }
}