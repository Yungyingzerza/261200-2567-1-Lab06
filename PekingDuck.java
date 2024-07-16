public class PekingDuck extends Duck {
    public void beCrispy(){
        System.out.println("Crispy");
    }

    @Override
    public void clean(Animal animal){
        System.out.println("I cannot clean ");
    }


}
