public class Main {
    public static void main(String[] args) {
       It it1 = new It();
       it1.setKlichka("Bobik");
       it1.setColour("White");
       it1.setAge(3);
       it1.setWeigth(7);
        System.out.println(it1.getKlichka());
        System.out.println(it1.getColour());
        System.out.println(it1.getAge());
        System.out.println(it1.getWeigth());
         it1.bark();
         it1.kusat();
         it1.run();

        TotuKush totukush1 = new TotuKush();
        totukush1.setName("Yago");
        totukush1.setColour("red-yellow-blue");
        totukush1.setAge(2);
        totukush1.setWeigth(0.3d);
         System.out.println();
    }
}