public class Cat {

    private String name;
    private boolean wool;

    public Cat(String name, boolean wool){
        this.name=name;
        this.wool=wool;
    }

    public Cat(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWool() {
        return wool;
    }

    public void setWool(boolean wool) {
        this.wool = wool;
    }

    public void say(){
        System.out.println(name + " say: Mew");
    }

    public void sleep(){
        System.out.println(name+ " Sleeping");
    }
}
