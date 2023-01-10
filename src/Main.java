public class Main {
    public static void main(String[] args) {

        person person1 = new person("Evan", 5.5, 60);
        person person2 = new person("Siam", 6.1, 72);

        //person 1
        person1.print();
        person1.print(true);

        person1.setHeight(5.9);
        person1.setWeight(78);
        person1.print(true);
        System.out.println(person1.getHeight());
        System.out.println(person1.getWeight());


        //person 2

        person2.print();
        person2.print(true);

        person2.setHeight(6.3);
        person2.setWeight(75);
        person2.print(true);
        System.out.println(person1.getBMI());

    }
}