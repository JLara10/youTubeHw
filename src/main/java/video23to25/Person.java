package video23to25;

public class Person implements Info{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void gretting(){
        System.out.println("Wasabi!");
    }

    @Override
    public void printInfo() {
        System.out.println("My name is " + name);
    }
}
