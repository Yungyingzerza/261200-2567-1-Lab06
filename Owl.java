public class Owl extends Animal implements Flyable {

    @Override
    public void sound() {
        System.out.println("Hoot");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void glide() {
        System.out.println("Glide");
    }

    @Override
    public void land() {
        System.out.println("Land");
    }

}
