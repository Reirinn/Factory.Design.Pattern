# What is Factory Design Pattern?
Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

Read more at : https://www.tutorialspoint.com/design_pattern/factory_pattern.htm 

# What are the advantages of Factory Pattern?

1. Factory design pattern provides approach to code for interface rather than implementation.
2. Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
3. Factory pattern provides abstraction between implementation and client classes through inheritance.

Read more at : https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java 

# Sample Problem 
Implement factory design pattern using Pet as the factory interface.  
- The interface implements two methods: makeSound() and play().
- Dog and Cat are concrete objects that implements Pet interface.
- PetRecord holds attributes such as petId, petName, and Pet.
- Clinic would be the client object.


# Class Diagram
![image](https://github.com/JerryEsperanza/factoryPattern/assets/142370600/0506f134-a5f6-4d98-a817-cd6f7a8466c7)

# Output
![image](https://github.com/Reirinn/factoryPattern/assets/142465054/a56072bb-5be6-4fb5-b743-66eaa4e7d71e)
