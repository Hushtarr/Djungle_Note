# Controller.class

**@Controller** -> 
*Responsible for handling user requests with the interaction between models and views.* 

**@RequestMapping**("/Main") ->
is used to send HTTP requests to specific methods in the controller class. It is used to define the URL path and the HTTP request method (GET, POST,PUT, DELETE, etc.)It can be applied to class-level and/or method-level. 

The default HTTP method for @RequestMapping is GET. This means that if we don't specify a method attribute in the @RequestMapping annotation, it will assume that the method is GET,In this example.

## Dependency injection
```java
private final AService aService;  
private final BService bService;  
private final CService cService;

public its Constructor(){

}
```
it's for obtain other components, services, or dependent objects.
**final key** -> Can ensure that dependencies are not overwritten after initialization, therefore avoiding unexpected changes and errors.

## Model model

simple way:
Model is an interface for passing data to the view in controller methods. It allows controller methods to set data into the model and pass that data to the view for display.

official define:
for managing the application's data and business logic, such as data
validation, database interactions, and calculations.


```java
public String methodName (Model model) {

	model.addAttribute("object", new obj());
	
	};
```

view holding "object" as *attribute name*

controller giving "new obj" as *attribute value* to the view

attribute value --giveData--> attribute name


# Entity.class

### @Entity ->
It tells JPA that this class should be mapped to a table in the database. Each instance of this entity class represents a row of data in the table.

### @Id ->
The primary key field used to mark the entity. Every entity must have a primary key.

@GeneratedValue ->
Is an annotation in JPA (Java Persistence API), used to specify the generation strategy of the primary key field of the entity class. It is usually used with @Id annotation. ***The main function of @GeneratedValue is to tell JPA how to automatically generate and manage the value of the primary key***, instead of having the developer manually set the primary key.
```java
@GeneratedValue(strategy = GenerationType.AUTO)
@GeneratedValue(strategy = GenerationType.IDENTITY)
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@GeneratedValue(strategy = GenerationType.TABLE)
```

### @Table ->
Specify the database table corresponding to the entity class.
Position: used on classes.
Common properties:
name: The name of the table.

### @Column ->
Specify the field of the entity class into DataBase.
Position: used on fields of a class.
Common properties:
name: The name of the column.
nullable: whether it can be NULL.
unique: whether it is unique

### @ManyToOne ->
Definition: one entity can be associated with another entity multiple times, but the other entity is associated with it only once.

	Example: Suppose a customer can have multiple orders, and each order can only belong to one customer. In this case, the customer entity class uses the @ManyToOne annotation to represent the many-to-one relationship with the order entity class.

### @OneToOne ->
Definition: one entity is associated with another entity once.

	Example: If a user account is associated with a password, the relationship between the user account entity class and the password entity class can be expressed using the @OneToOne annotation.

### @ManyToMany ->
Definition: one entity can be associated with another entity multiple times, and another entity can also be associated with it multiple times.

	Example: If a student can participate in multiple courses, and a course can also have multiple students, then the relationship between the student entity class and the course entity class can be expressed using the @ManyToMany annotation.