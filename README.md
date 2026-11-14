# Java Class and Object Example (Animal)

A small Java program that defines an `Animal` class with fields and methods, creates an object, and calls its methods.

## What It Demonstrates

- Fields (states): `name`, `age`, `color`
- Methods (behaviors): `eat()` and `sound()`
- Creating an object with `new Animal()`
- Setting fields with the dot operator and calling methods on the object

```java
Animal a = new Animal();

a.name = "Lion";
a.age = 5;
a.color = "Brown";

a.eat();
a.sound();
```

## Output

```
Lion is eating
Lion makes sound
```

The methods use the `name` field, so they print `Lion`. The `age` and `color` fields are set but not used by any method yet.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac Animal.java
java Animal
```

## Project Structure

```
.
├── Animal.java
└── README.md
```

## Next Steps

- Print `age` and `color` in a new `display()` method
- Add a constructor to set all fields when the object is created
- Make the fields `private` and add getters and setters
- Create child classes such as `Lion` or `Cat` that extend `Animal`
