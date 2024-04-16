package video26to27;

public class Tree {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getInfo(){
        String info = getName() + ": " + height();
        return info;
    }
    private int height(){
        return 100;
    }
}
