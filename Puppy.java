public class Puppy extends Dog {
    public void barkAt(Animal a) {
        System.out.println("Puppy::barkAt(Animal)");
    }

    public void barkAt(Dog d) {
        System.out.println("Puppy::barkAt(Dog)");
    }

    public void barkAt(Puppy d) {
        System.out.println("Puppy::barkAt(Puppy)");
    }
}

