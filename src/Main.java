public class Main {
    public static void main(String[] args) {
        String sayHello = "Hej";
        System.out.println(sayHello);

        Animal horse1 = new Animal(4,"Åke", "Häst");
        Animal horse2 = new Animal(3);
        Animal horse3 = new Animal("Häst");


        System.out.println(horse1.getAge());
    }
}
