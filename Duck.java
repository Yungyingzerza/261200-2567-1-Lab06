public class Duck extends Animal implements Flyable,Pettable {

    @Override
    public void sound() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void clean(Animal animal){
        System.out.println(this + " is cleaning " + animal);
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

    @Override
    public void pet() {
        System.out.println("Pet");
    }

    @Override
    public void feed() {
        System.out.println("Feed duck");
    }

}
