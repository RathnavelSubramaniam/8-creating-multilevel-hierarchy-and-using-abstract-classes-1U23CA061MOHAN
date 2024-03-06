// Animal.java
class Animal {
// Basic attributes and methods including abstract sound method
String name;
int age;
public Animal(String name ,int age){
    this.name = name;
    this.age = age;
}
void eat(){
    System.out.println(name + " is eating.");
}

}

 class Mammal extends Animal {
// Additional attributes and methods
public Mammal(String name,int age){
    super(name,age);
    
}
void walk(){
    System.out.println(name + " is walking.");
}
}

// Bird.java
class Bird extends Animal {
// Additional attributes and methods
boolean canfly;
public Bird(String name,int age){
    super(name,age);
}
void fly(){
        System.out.println(name + " is flying.");
}
}

// Parrot.java
 class Parrot extends Bird {
// Additional characteristics specific to Parrot
String color;
public Parrot(String name ,int age,String color){
    super(name,age);
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
    return "Species: "+ name + ", Age: "+ age + ", Color: "+ color;
}
};

// Main.java
public class Practical8 {
public static void main(String[] args) {
// Instantiate and demonstrate object class methods
Parrot parrot = new Parrot("Talking Parrot",2,"Green");
Mammal lion1 = new Mammal("Lion",5);
Bird eagle = new Bird("Eagle",3);
Parrot lion2 = new Parrot("Lion",5,"Yellow");
System.out.println("Species: "+ lion1.name+ ", Age: "+ lion1.age);
System.out.println("Species: "+ eagle.name+ ", Age: "+ eagle.age);
System.out.println("Species: "+ parrot.name+ ", Age: "+ parrot.age);

System.out.println("Are lion and eagle equal? "+ lion1.equals(eagle));
System.out.println("Are lion and lion equal? "+ lion1.equals(lion1));
}
}
