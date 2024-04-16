package video23to25;

public class Vehicle implements Info{
    private int year = 2024;
    public void start(){
        System.out.println("Vehicle started!!");
    }

    @Override
    public void printInfo() {
        System.out.println("Vehicle year is " + year);
    }
}
