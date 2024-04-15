package video13to19;

public class Classes {
    public static void main(String[] args) {
        People ppl1 = new People();
        ppl1.age = 23;
        ppl1.name = "Jordan";
        System.out.println(ppl1.name + ": " + ppl1.age);
        ppl1.yell();
        ppl1.saySomething();
        ppl1.calculateYearsToFifty();


        People ppl2 = new People();
        ppl2.name = "Brady";
        ppl2.age = 44;
        ppl2.sport = "Football";//video 15
        System.out.println(ppl2.name + ": " + ppl2.age);
        ppl2.yell();
        ppl2.saySomething();
        ppl2.calculateYearsToFifty();
        String sport = ppl2.getSport();//video 15
        System.out.println(sport);//video 15
        System.out.println("==========");

        //video 16
        Dog dog1 = new Dog();
        dog1.bark("Woof Woof!");
        dog1.run(10);
        dog1.info("Itachi", 3);
        System.out.println("==========");

        //Video 17
        Cat cat1 = new Cat();
        cat1.setName("garfield");
        cat1.setAge(5);
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println("==========");
        //video 18
        Bird bird1 = new Bird("Chirp", 2);
        bird1.setSound("chirp chirp");
        bird1.setWeight(2);
        System.out.println(bird1.getSound() + " : " + bird1.getWeight());
        System.out.println("==========");
        //video19
        Fish.color = "green";
        Fish fish1 = new Fish();
        fish1.type = "bass";
        fish1.fishInfo();
        System.out.println("The fish lives in " + Fish.WATER_TYPE);
    }
}
