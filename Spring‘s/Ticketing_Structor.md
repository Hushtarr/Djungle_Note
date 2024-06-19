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