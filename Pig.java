public class Pig extends Animal implements Pettable {

    @Override
    public void sound() {
        System.out.println("Ood Oink");
    }

    public void rollInMud() {
        System.out.println("Roll in mud");
    }

    @Override
    public void pet() {
        System.out.println("Pet");
    }

    @Override
    public void feed() {
        System.out.println("Feed pig");
    }

}
