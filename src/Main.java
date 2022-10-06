public class Main {
    public static void main(String[] args) {
       It it1 = new It();
       it1.setKlichka("Bobik");
       it1.setColour("White");
       it1.setAge(3);
       it1.setWeigth(7);
        System.out.println("Klichka is "+it1.getKlichka());
        System.out.println("his colour is "+it1.getColour());
        System.out.println("He is "+it1.getAge());
        System.out.println(it1.getWeigth()+"kg");
         it1.bark();
         it1.kusat();
         it1.run();


        TotuKush totukush1 = new TotuKush();
        totukush1.setName("Yago");
        totukush1.setColour("red-yellow-blue");
        totukush1.setAge(2);
        totukush1.setWeigth(0.3d);
         System.out.println("His name is "+totukush1.getName());
         System.out.println("His colour is "+totukush1.getColour());
         System.out.println("He is "+totukush1.getAge());
         System.out.println(totukush1.getWeigth()+"kg");
          totukush1.eat();
          totukush1.fly();
          totukush1.trySay();


        Myshyk myshyk1 = new Myshyk();
        myshyk1.setKlichka("Tom");
        myshyk1.setColour("Black-White");
        myshyk1.setAge(1.6d);
        myshyk1.setWeigth(1.3d);
          System.out.println("His klichka is "+myshyk1.getKlichka());
          System.out.println("His colour is "+myshyk1.getColour());
          System.out.println("He is "+myshyk1.getAge());
          System.out.println(myshyk1.getWeigth()+"kg");
            myshyk1.golos();
            myshyk1.scratch();
            myshyk1.play();


        Balyk balyk1 = new Balyk();
        balyk1.setName("Nemo");
        balyk1.setColour("Grey");
        balyk1.setAge(0.6d);
        balyk1.setWeigth(0.3d);
         System.out.println("His name is "+balyk1.getName());
         System.out.println("His colour is "+balyk1.getColour());
         System.out.println("He is "+balyk1.getAge());
         System.out.println(balyk1.getWeigth()+"kg");
          balyk1.eat();
          balyk1.sleep();
          balyk1.swim();
    }
}