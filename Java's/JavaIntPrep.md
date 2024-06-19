# General
---
## What is Platform Independence?

**Platform Independence** is the concept often summarized by the phrase “write once, run anywhere.” Java is one of the most popular platform
independent languages which the developer develops the program

Once we compile a Java program and create a JAR file (compiled Java program), we can run this JAR on any operating system that has a Java Virtual Machine (JVM) installed.

Java achieves platform independence through an elegant process:
1.
    **Compiling Java Code**: When you compile a Java file, the output is a class file which contains byte code, it is an intermediate representation of the code.


2.
    **Role of the JVM**: The JVM (Java Virtual Machine) converts this byte code into executable instructions specific to the operating system it's running on. These executable instructions vary between operating systems.

3.
    **Different JVMs for Different Systems**: Each operating system has its own JVM version. but all JVMs understand and process the same Byte code, converting it into the appropriate executable code for their respective operating systems.
## What is Byte code?

Java byte code is an intermediate language between Java and the machine language. When a Java program is compiled, the output is a .class file which contains byte codes. JVM loads the Java classes through the class
loader and executes them.
## What is JVM?

The Java Virtual machine (JVM) is the virtual machine that runs on actual machine (your computer) and executes Java byte code. The JVM doesn’t understand Java source code, that’s why *.class that contain the byte codes understood by the JVM. 

JVM makes java portable.Each operating system has a different JVM, however the output they produce same execution of byte code across all operating systems.

JVM is divided into several components like the stack, the garbage-collected heap, the registers, and the method area.
## Compare JDK, JVM and JRE.

Java has three main components: JDK, JRE and JVM.

`JDK stands for Java Development Kit:`
JDK is a kit, and this kit provides the environment to develop and run any Java program. 

JDK includes two things:
**Development Tools (compiler, debugger, etc.).**
**JRE.** 
<img src="https://static.tildacdn.com/tild6563-3739-4565-a361-323339393332/jvm1.png">
`JRE stands for Java Runtime Environment`.
JRE has a set of software tools which are used for executing java code. JRE contains class libraries, other supporting files, and JVM.

`JVM stands for Java Virtual Machine`. 
It is called a virtual machine because it does not exist physically.
JVM is a part of JRE. It converts Java bytecode into machine language. JVM is responsible for executing the java program line by line.
JVM makes Java language platform independent.
## Why is Java so popular?
**Simple to use**

**Built-in Security**(It includes high-level concurrency tools and packages also take care of security. The Java classes and related tools create highly scalable solutions for the enterprise.)

**Open Source** (It is open-source, which implies that it is free to use. Any developer with a working knowledge of Java can use this free platform to create apps.)

**Robust API** (The Java API has methods to accomplish all types of tasks, such as networking, connecting to databases, processing XML, handling input-output, etc. The open-source libraries can be easily integrated with Java. )

**Strong community** (The main reason for Java's popularity is its active and supportive community. It claims to be the second-largest Stack Overflow community.)

**Excellent documentation** (Its documentation is well defined that provides complete guide to help and solve any problems we may encounter when coding in Java.)

**Powerful set of Programming Tools** (The Integrated Development Environment (IDE) is one of Java's most intriguing features (IDE).)

**Versatility** (Java is interoperable with nearly all languages. Java developers write Java code once and use it in several places. Java's application programming interface is fully integrated with another desktop and web programmer. Java is adaptive and accommodating to a programmer's diverse coding approaches.)



## What are the different kinds of variables defined in Java?

**Local Variable** -> declared within a method body.

**Class (Static) Variable** -> Static variables are essentially global variables. the static variable is created and shared among all objects at class level. All instances of the class share the same static variable.

**Instance Variable (and Parameter)** -> within the class body, outside of any method or block, and declared without 'static' keyword.
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240307140133/data-types-768.png">








# OOP
---

## What is class?

A class is a template, blueprint of an object. A class defines the state and/or behavior that an object can exhibit.
## What is object?

An instance of a class. An entity that has a state and behavior is known as an object. Java objects are
very similar to the objects we can observe in the real world. A cat, a lighter, a pen, or a car are all objects.
We can create an object using the new keyword. We can create multiple objects of the same class. The
terms instance and object are interchangeable.
## What is the state and behavior of an object?

Each object has a state, a behavior, and an identity.

The **state** of an object is stored in fields (variables), while methods (functions) display the object's **behavior**. 

**Identity** is a characteristic used to uniquely identify that object.
## What is object-oriented programming?

Object-oriented programming (OOP) is a programming paradigm based on the concept of "objects," which can contain data in the form of fields (attributes or properties), and code in the form of procedures (methods or functions).
## What are the key principles (main features) of object-oriented programming?

● Inheritance
● Encapsulation
● Polymorphism
● Abstraction
## What is Encapsulation?

Hiding the data by giving private access modifier.

• How do we perform encapsulation?
“private variables, public getter, public setter”
1. Make all class fields private to cut access and to be able to add conditions/filtering the usage.

2. Create public setter method to write data, has parameter(s), not returns any value (void).

3. Create public getter method to read data , has no parameters but has return type other than void.
## What is Inheritance?

● Inheritance refers to the ability for one class to get all visible fields and methods of another class & interface.

● With the use of inheritance, the information is made manageable in a  order.

● Implements the DRY (Don’t Repeat Yourself) programming principle.

● Builds IS-A relationships between classes (super / sub relation).