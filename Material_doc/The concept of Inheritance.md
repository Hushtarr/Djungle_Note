# What is Inheritance?

Inheritance in Java allows a class to inherit properties and behaviors from another class. It establishes a "is-a" relationship, where a subclass inherits from a superclass  for better organization.

## Why do we use Inheritance?

We use inheritance in programming to achieve code reuse and create a hierarchy of classes. It allows promoting a modular code structure.

## What are Inheritance Types?

### 1. Single Inheritance:

```java
class Animal {
  //...
}

class Dog extends Animal {
  //...  
}
```

### 2. Multiple Inheritance(through interfaces):

```java
interface CanFly {
  void fly();
}

interface CanSwim {
  void swim();
}

class Penguin implements CanFly, CanSwim {
  //...
}
```

### 3. Multilevel Inheritance:

```java
class Vehicle {
  //...
}

class Car extends Vehicle {
  //...
}

class SportCar extends Car {
  //...
}
```

### 4. Hierarchical Inheritance:

```java
class Shape {
  //...
}

class Circle extends Shape {
  //...
}

class Square extends Shape {
  //...
}
```

# What is Abstraction?

Abstraction in Java means simplifying complex things by focusing on what's essential and ignoring unnecessary details. It helps in hiding the implementation complexity and providing a clear interface for using the functionality. In Java, abstraction is achieved through abstract classes and interfaces.

# What's the use of 'super' and 'this' keyword?

super keyword: Refers to the immediate parent class. Used to call methods or constructors of the superclass.

this keyword: Refers to the current instance of the class. Used to differentiate between instance variables and parameters.

(ps: In an interview setting, you can simply say that super is for the superclass, and this is for the current instance.)
