public class Dog extends Animal {
    public void barkAt(Animal a) {
        System.out.println("Dog::barkAt(Animal)");
    }

    public void barkAt(Dog d) {
        System.out.println("Dog::barkAt(Dog)");
    }

    public void barkAt(Puppy p) {
        System.out.println("Dog::barkAt(Puppy)");
    }
}
