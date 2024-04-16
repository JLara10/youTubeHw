package video23to25;
//video 25 protected, public , private
public class Candy {
    //not good to make variables public
    public String chocolate;//can always be accesses but not recommended
    private String type;// cannot be accessed must create getter/setter
    protected String name;//can be accessed within same class or package
        int amount;// no access modifier only same package


    public Candy(String chocolate, String type, String name, int amount) {
        this.chocolate = chocolate;
        this.type = type;
        this.name = name;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
