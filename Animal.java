
public class Animal {



String name;
int age;
String color;
//head method
public void eat() {
	//body method
    System.out.println(name + " is eating");
}

public void sound() {
    System.out.println(name + " makes sound");
}

public static void main(String[] args) {

    Animal a = new Animal();

    a.name = "Lion";
    a.age = 5;
    a.color = "Brown";

    a.eat();
    a.sound();
}
}