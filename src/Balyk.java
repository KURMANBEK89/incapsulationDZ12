public class Balyk {
    private String name;
    private String colour;
    private double age;
    private double weigth;

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
    public void setAge(double age){
        this.age = age;
    }
    public void setWeigth(double weigth){
        this.weigth = weigth;
    }
    public String getName(){
        return name;
    }
    public String getColour(){
        return colour;
    }
    public double getAge(){
        return age;
    }
    public double getWeigth() {
        return weigth;
    }
}
