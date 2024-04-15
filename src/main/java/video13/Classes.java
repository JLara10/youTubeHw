package video13;

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

    }
}
