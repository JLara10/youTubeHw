package video26to27;

public class Main {
    public static void main(String[] args) {
//video 26
        Chips chip1 = new Chips("bbq");
        System.out.println(chip1.flavor);
        Chips chip2 = new Doritos("Nacho Cheese");//poly
        System.out.println(chip2.flavor);
        System.out.println("=============");

        //Video 27 encapsulation
    Tree tree1 = new Tree();
    tree1.setName("oak");
        System.out.println(tree1.getInfo());

    }
}
