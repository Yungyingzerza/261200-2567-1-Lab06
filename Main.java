public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sound();

        Owl owl = new Owl();
        owl.sound();

        Cow cow = new Cow();
        cow.sound();

        Pig pig = new Pig();
        pig.sound();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.beCrispy();

        duck.clean(cow);
        pekingDuck.clean(cow);
    }
}