public class TotuKush {
    private String name;
    private String colour;
    private int age;
    private double weigth;

    public void trySay(){
        System.out.println(name + " trying say Hello");
    }
    public void fly(){
        System.out.println(name + " is flying");
    }
    public void eat(){
        System.out.println(name + " is eating");
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
    public void setWeigth(double weigth){
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
    public double getWeigth(){
        return weigth;
    }
}
