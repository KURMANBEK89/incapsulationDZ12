public class Myshyk {
    private String klichka;
    private String colour;
    private int age;
    private int weigth;

    public void golos(){
        System.out.println("Myau");
    }
    public void play(){
        System.out.println(klichka + " is playing with small ball");
    }
    public void scratch(){
        System.out.println(klichka + " is scratching a sofa");
    }

    public void setKlichka(String klichka){
        this.klichka = klichka;
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

    public String getKlichka(){
        return klichka;
    }
    public String getColour(){
        return colour;
    }
    public int getAge(){
        return age;
    }
    public int getWeigth(){
        return weigth;
    }

}
