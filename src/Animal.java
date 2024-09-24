public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
}
class Dog extends Mammal{
    private String breed;
    public Dog(String name,int numLegs, String breed) {
        super(name, numLegs);
        this.breed = breed;
    }
    public void bark(){
        System.out.println(name + " the " + breed +" is barking.");
    }
}
class Mammal extends Animal{
    protected int numLegs;
    public Mammal(String name, int numLegs) {
        super(name);
        this.numLegs = numLegs;
    }
    public void walk(){
        System.out.println(name + " is walking "+ numLegs + " Legs.");
    }
}



