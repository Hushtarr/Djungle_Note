# IoC - Dependency Injection (WIRING)

- **Dependency Injection** - this is a fundamental functionality in the Spring Framework, which basically allows the Spring Container to inject objects into objects (beans into beans) or “dependencies”
- Why is it called **“DEPENDENCY”** injection - Lets take our example of “Person” and “Car” again. Our “Person” bean is dependent on the “Car” bean - so by following the Wiring principle, we will connect “Person” with “Car” - in other words we will **INJECT** our “Car” object into the “Person” object.
- So we say that “Person” bean **DEPENDS** on the “Car” bean. So “Car” is a “Person” beans **DEPENDENCY** - So in order to fill in this dependency, we perform a **DEPENDENCY INJECTION** - Spring Container INJECTS the “Car” bean dependency into “Person” bean using Wiring.

(Spring Container actually does all the Wiring and Injecting, we just describe it in our config what needs to be wired).

![Untitled](IoC%20-%20Dependency%20Injection%20(WIRING)%20737aff5f1c024918b1168dc655ea40fc/Untitled.png)