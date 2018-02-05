public class Animal {
    public void barkAt(Animal a) {
        System.out.println("Animal::barkAt(Animal)");
    }

    public void barkAt(Dog d) {
        System.out.println("Animal::barkAt(Dog)");
    }

    public void barkAt(Puppy d) {
        System.out.println("Animal::barkAt(Puppy)");
    }
}
