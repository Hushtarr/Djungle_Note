The difference between `addViewControllers()` configuration view controller and ordinary controller class:
**Using `addViewControllers()`:**

advantage:
- Simple and direct, no need to write controller classes and methods
- Suitable for static resource mapping and simple redirection scenarios
- Mapping priority is higher than normal controller methods
- Centralized management of view mapping for easy maintenance

disadvantages:
- Unable to process complex business logic
- Limited to simple view rendering or redirection

example:
```java
public void addViewControllers(ViewControllerRegistry registry)
    {
    registry.addViewController("/welcome").setViewName("welcome");
    registry.addViewController("/login").setViewName("login");
    registry.addViewController("/").setViewName("login");
    }
```

**normal controller classes and methods:**

advantage:
- Can perform complex business logic processing
- Support various HTTP methods (GET, POST, PUT, DELETE, etc.)
- You can use model objects to pass data to the view
- More flexible and powerful

disadvantages:
- Need to write more code (controller classes and methods)
- Relatively more complex to maintain
- Mapping priority is lower than view controller

example:
```java
@GetMapping("/welcome")
public String welcome(Model model) 
    {
    model.addAttribute("message", "Welcome to our application!");
    return "welcome";
    }
```

Usually in actual projects, the two methods are used in combination, 
which not only takes advantage of the simplicity of the view controller, 
but also implements complex business logic processing through ordinary controllers


