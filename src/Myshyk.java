public class Myshyk {
    private String klichka;
    private String colour;
    private double age;
    private double weigth;

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
    public void setAge(double age){
        this.age = age;
    }
    public void setWeigth(double weigth){
        this.weigth = weigth;
    }

    public String getKlichka(){
        return klichka;
    }
    public String getColour(){
        return colour;
    }
    public double getAge(){
        return age;
    }
    public double getWeigth(){
        return weigth;
    }

}
