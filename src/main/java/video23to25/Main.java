package video23to25;

import safari.Lion;
import safari.animal.Zebra;

public class Main {
    public static void main(String[] args) {
        //video 23 interfaces
        Vehicle vehicle1 = new Vehicle();
        vehicle1.start();
        vehicle1.printInfo();//interface method

        Person person1 = new Person("Billy");
        person1.gretting();
        person1.printInfo();//interface method
        System.out.println("===========");

        //Video 24 packages
        Lion lion1 = new Lion();//Lion class is in safari package
        lion1.speak();
        Zebra zebra1 = new Zebra();//calls subpackage animal that's in package safari
        zebra1.food();
        System.out.println("===========");
        //Video 25 private,public, protected
        Candy candy1 = new Candy("chocolate", "milk","twix", 2);
        candy1.setType("milk");
        System.out.println(candy1.name + " : " + candy1.chocolate + " : " + candy1.getType() + " : " + candy1.amount);
        System.out.println("===========");
        //video 26 polymorphism



    }
}
