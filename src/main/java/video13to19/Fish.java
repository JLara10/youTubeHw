package video13to19;
//video 19 static and final
public class Fish {
    public final static String WATER_TYPE = "Fresh water!";
    public String type;
    public static String color;
    public static int id = 0;
    public int uniqueID;
    public Fish(){
        uniqueID = id;
        id++;
    }
    public void fishType(){
        System.out.println(type );
    }
    public static void fishColor(){
        System.out.println(color);
    }
    public void fishInfo(){
        System.out.println("Fish id: " + id + " : " + type + " : " + color);
    }
}
