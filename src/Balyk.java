public class Balyk {
    private String name;
    private String colour;
    private int age;
    private int weigth;

    public void swim(){
        System.out.println(name + " is swimming");
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void setName(String name){
        this.name = name;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeigth(int weigth){
        this.weigth = weigth;
    }
    public String getName(){
        return name;
    }
    public String getColour(){
        return colour;
    }
    public int getAge(){
        return age;
    }
    public int getWeigth() {
        return weigth;
    }
}
