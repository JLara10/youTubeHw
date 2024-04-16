package video13to22;

//Video 18 constructors
public class Bird {
    private String sound;
    private int weight;

    public Bird(String sound, int weight) {
        System.out.println("constructor");
        this.sound = sound;
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
