public class It {
    private String klichka;
    private String colour;
    private int age;
    private int weigth;

    public void bark(){
        System.out.println("gav-gav");
    }
    public void run(){
        System.out.println(klichka + " is running");
    }
    public void kusat(){
        System.out.println(klichka + " kusaet");
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
