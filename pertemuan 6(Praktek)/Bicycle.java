public class Bicycle extends Vehicle{
    public Bicycle(){
        super();
    }

    public void ringBell(){
        System.out.println("Kring....Kring....");
    }

    @Override
    public void goStraight(){
        System.out.println("Sepeda yook Majuuu");
        speed = speed + 15;
    }
}
