// Animal.java
class Animal {
// Basic attributes and methods including abstract sound method
String name;
public Animal(String name ){
    this.name = name;
}
void eat(){
    System.out.println(name + " is eating.");
}

}
abstract class AnimalSound{
    abstract void makeSound();
}
 class Mammal extends Animal {
// Additional attributes and methods
int legs;
public Mammal(String name,int legs){
    super(name);
    this.legs = legs;
}
void walk(){
    System.out.println(name + " is walking on "+ " legs.");
}
}

// Bird.java
class Bird extends Animal {
// Additional attributes and methods
boolean canfly;
public Bird(String name,boolean canfly){
    super(name);
    this.canfly = canfly;
}
void fly(){
    if(canfly){
        System.out.println(name + " is flying.");
    }
    else{
        System.out.println(name + " is canotfly.");
    }
}
}

// Parrot.java
 class Parrot extends Bird {
// Additional characteristics specific to Parrot
String color;
public Parrot(String name ,boolean canfly,String color){
    super(name,canfly);
    this.color = color;
}
void mimic(){
    System.out.println(name + " is mimicing.");
}
final void sleep(){
    System.out.println(name + " is sleeping.");
}
@Override
public String toString(){
    return "parrot: "+ name + ", Can Fly: "+ canfly + ", Color: "+ color;
}
};

// Main.java
public class Practical8 {
public static void main(String[] args) {
// Instantiate and demonstrate object class methods
Parrot parrot = new Parrot("colorful Parrot",true,"Green");
parrot.eat();
parrot.fly();
parrot.mimic();

parrot.sleep();

System.out.println(parrot.toString());
}
}
