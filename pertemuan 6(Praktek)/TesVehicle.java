public class TesVehicle {
    public static void main(String[] args) {


        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle kend = new MotorVehicle();
        MotorVehicle kend2 = new MotorVehicle(2.0, "Black", 2, "H 1316 ARM");
        Car mobil = new Car();
        MotorVehicle motor = new MotorCycle(0.0, "Yellow", 2, "H 6402 EN");

        
        System.out.println("Kendaraan (Vehicle) tanpa parameter :");
        System.out.println(kendaraan.speed);
        System.out.println(kendaraan.color);
        System.out.println("Sepeda (Bicycle) tanpa parameter");
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        System.out.println("Kendaraan Bermotor (MotorVehicle) dengan parameter");
        System.out.println(kend2.speed);
        System.out.println(kend2.color);
        System.out.println(kend2.getSizeOfEngine());
        System.out.println(kend2.getLicensePlate());

        
        
        System.out.println("Melajukan Kendaraan: ");
        KendaraanMelaju(kendaraan);

        System.out.println("Melajukan Sepeda: ");
        KendaraanMelaju(sepeda);

        System.out.println("Melajukan Kendaraan Bermotor 1: ");
        KendaraanMelaju(kend);

        System.out.println("Melajukan Kendaraan Bermotor 2: ");
        KendaraanMelaju(kend2);

        System.out.println("Melajukan Mobil: ");
        KendaraanMelaju(mobil);

        System.out.println("Melajukan Motor: ");
        KendaraanMelaju(motor);

    }

    public static void KendaraanMelaju(Vehicle kendaraan){
        kendaraan.goStraight();
        System.out.println("Kecepatan baru : " +kendaraan.speed+" km / jam");
    }
}