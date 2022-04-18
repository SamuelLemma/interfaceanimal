package com.company;

abstract class Animal {
    private String name;
    private int age;
    private int Weight;

    public Animal(){
        age = Weight  =0;
        name = "SS";
    }
    public Animal (int age) { this.age = age;}
    public abstract void eat(String foodname);

    public abstract void getVoice();

    public String getName(){return name;}
    public void setName(String name) {this.name = name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}
    public int getWeight(){ return Weight;}
    public void setWeight(int weight) {this.Weight = weight;}

}

abstract class Mammal extends Animal{
    private String order;

    public Mammal(){
        super();
        order = "SS";
    }
    public Mammal(String name, int age, int weight,String order){
        super(name, age, weight);
        this.order = order;

    }
    public Mammal (int age, String order){
        super(age);
        this.order = order;

    }
    public void drinkMilk(){ System.out.println("slup slup");}

    @Override
    public void getVoice() { System.out.println("Mamma; is making sound");}
    @Override
    public void eat(String foodname){System.out.println("Mammal is eating"+ foodname);}

    public String getOrder() { return order;}
    public void setOrder(String order){this.order = order;}
    @Override
    public String toString(){
        return "Mammal{" + "order" + order +'\'' + '}';
    }
}

class Dog extends Mammal implements AnimalBehavior, AnimalMove{
    private String breed;

    Dog() {
        super();
        breed = "SS";

    }
    public Dog(String name, int age, int weight, String rzad,String breed){
        super(name, age, weight, rzad );
        this.breed = breed;
    }
    public Dog(int age, String rzad, String breed){
        super(age, rzad);
        this.breed = breed;

    }
    public void aport(){ System.out.println("The is retrieving.");}
    @Override
    public void drinkMilk(){System.out.println("The dog is eating" );}
    @Override
    public void getvoice(){System.out.println("the dog i barking");}
    @Override
    public void eat(String foodname){System.out.println("The Dog is eating" + foodname);}

    public String getBreed(){return breed;}
    public void setBreed(String breed){this.breed = breed;}
    @Override
    public String toString(){
        return "Dog{" + "breed ='" + breed + '\''+ '}';
    }
}
class bird extends Mammal{
    private String breed;

    bird() {
        super();
        breed = "SS";

    }
    public bird(String name, int age, int weight, String rzad,String breed){
        super(name, age, weight, rzad );
        this.breed = breed;
    }
    public bird(int age, String rzad, String breed){
        super(age, rzad);
        this.breed = breed;

    }
    public void aport(){ System.out.println("The is retrieving.");}
    @Override
    public void getfood(){System.out.println("The bird is eating" );}
    @Override
    public void getvoice(){System.out.println("the bird is singing");}
    @Override
    public void eat(String foodname){System.out.println("The bird is eating" + foodname);}

    public String getBreed(){return breed;}
    public void setBreed(String breed){this.breed = breed;}
    @Override
    public String toString(){
        return "bird{" + "breed ='" + breed + '\''+ '}';
    }
}
class Pigeon extends Mammal{
    private String breed;

    Pigeon() {
        super();
        breed = "SS";

    }
    public Pigeon(String name, int age, int weight, String rzad,String breed){
        super(name, age, weight, rzad );
        this.breed = breed;
    }
    public Pigeon(int age, String rzad, String breed){
        super(age, rzad);
        this.breed = breed;

    }
    public void aport(){ System.out.println("The is retrieving.");}
    @Override
    public void getfood(){System.out.println("The Pigeon is eating" );}
    @Override
    public void getvoice(){System.out.println("the Pigeon is singing");}
    @Override
    public void eat(String foodname){System.out.println("The Pigeon is eating" + foodname);}

    public String getBreed(){return breed;}
    public void setBreed(String breed){this.breed = breed;}
    @Override
    public String toString(){
        return "Pigeon{" + "breed ='" + breed + '\''+ '}';
    }
}
class fish extends Mammal{
    private String breed;

    fish() {
        super();
        breed = "SS";

    }
    public fish(String name, int age, int weight, String rzad,String breed){
        super(name, age, weight, rzad );
        this.breed = breed;
    }
    public fish(int age, String rzad, String breed){
        super(age, rzad);
        this.breed = breed;

    }
    public void aport(){ System.out.println("The is retrieving.");}
    @Override
    public void swim(){System.out.println("The fish is swimming" );}
    @Override
    public void getvoice(){System.out.println("the fish is making sound");}
    @Override
    public void eat(String foodname){System.out.println("The fish is eating" + foodname);}

    public String getBreed(){return breed;}
    public void setBreed(String breed){this.breed = breed;}
    @Override
    public String toString(){
        return "fish{" + "breed ='" + breed + '\''+ '}';
    }
}
class Blowfish extends Mammal{
    private String breed;

    Blowfish() {
        super();
        breed = "SS";

    }
    public Blowfish(String name, int age, int weight, String rzad,String breed){
        super(name, age, weight, rzad );
        this.breed = breed;
    }
    public Blowfish(int age, String rzad, String breed){
        super(age, rzad);
        this.breed = breed;

    }
    public void aport(){ System.out.println("The is retrieving.");}
    @Override
    public void drinkMilk(){System.out.println("The Blowfish is eating" );}
    @Override
    public void getvoice(){System.out.println("the Blowfish i barking");}
    @Override
    public void eat(String foodname){System.out.println("The Blowfish is eating" + foodname);}

    public String getBreed(){return breed;}
    public void setBreed(String breed){this.breed = breed;}
    @Override
    public String toString(){
        return "Blowfish{" + "breed ='" + breed + '\''+ '}';
    }
}

interface AnimalBehavior{
    default void move (Object ob){System.out.println(ob.getClass().getsimpleName()+ "move" );}
}
interface AnimalName{
    default void move (Object ob){System.out.println();}
}
interface AnimalMove{
    default void move (Object ob){System.out.println();}
}
public class Main{

    private static String name;
    private static int age;
    private static int weight;
    private static String rzad;
    private static String breed;


    public static void main(String[]args){
        Animal animal[] = new Animal[6];
        Mammal[0]=  new Mammal(name"little brown", age 2, weight 12,rzad "Carnivora",  breed"mastiff");
        animal[1] = new Dog(name"butkus", age 5, weight 15,rzad "Carnivora");
        animal[2] = new bird(name"platypus", age 2, weight 15,rzad "Carnivora",  breed"mastiff");
        animal[3] = new fish(name"blowfish", weight 15,rzad "Carnivora");
        animal[4] = new Blowfish(name"nemo", age 1, weight 15,rzad "Carnivora");
        animal[5] = new Pigeon(name"pablo", age 5, weight 15,rzad "Carnivora",  breed"spain");

        AnimalBehavior AnimalBehavior[] = new AnimalBehavior[3];
        AnimalBehavior[0] = new Dog(name "Butkus", age"5", weight"15",);
        AnimalBehavior[1] = new Pigeon(name "Pablo", age"10", weight"2",);
        AnimalBehavior[2] = new Blowfish(name "blowfish", age"5", weight"2",);
        for (Animal a: animal){
            a.move(a);
        }
        for (Animal a: animal){
            AnimalName.name(a.getName());
        }
    }
}

