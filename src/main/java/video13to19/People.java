package video13to19;

public class People {
   //classes can contain
    //1. data
    //2. subroutines (methods)
    //Instance variables (data or "state")
    String name;
    int age;
    String sport;
// method yell part of video 14
    void yell(){
        for(int i = 0; i < 2; i++) {
            System.out.println("WASABI my name is " + name + " and im " + age + "!");
        }
    }
    void saySomething(){
        System.out.println("This is video 14");
    }
    //Video 15 getters and returns
    int calculateYearsToFifty(){
        int years = 50 - age;
        System.out.println("I'll be fifty in " + years + " years!");
        return years;
    }
    public String getSport() {
        return sport;
    }

}
