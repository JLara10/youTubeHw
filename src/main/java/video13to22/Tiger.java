package video13to22;

public class Tiger {
    //video21
    private int weight;
    private String name;
    public Tiger (int weight, String name){
        this.weight = weight;
        this.name = name;
    }
    public String toString(){
        StringBuilder animal = new StringBuilder();
        animal.append(weight).append(": ").append(name);
        return animal.toString();
    }
}
