public class Cow extends Animal implements Pettable {

    @Override
    public void sound() {
        System.out.println("Moo");
    }

    public void milk() {
        System.out.println("Milk");
    }

    @Override
    public void pet() {
        System.out.println("Pet");
    }

    @Override
    public void feed() {
        System.out.println("Feed cow");
    }

}
