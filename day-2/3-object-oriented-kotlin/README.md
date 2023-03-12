# Object Oriented Programming

OOP (Object Oriented Programming) is a must in Android development because all the system is based in that paradigm and is a fundamental in your carerr as a programmer almost every programmer has used at some point OOP.

## Getting started

Please create a new android project, call it "Object Oriented Kotlin" and save it. We are going to be learning the concepts of OOP but at the same time we are going to be coding in android studio the concepts that we learn on the way.

## What is OOP?

Means creating a template which is not going to occupy space if not called only when it's needed. This template stores the attributes and data when you create an instance of the template.

For example suppose you want to build a car but for that before creating the actual car you have to do a blueprint of it because how are you going to build something without having the foundations of it right?.

### -Classes

A class is a template definition of the methods and variables in a particular kind of object (in our case the car). The class is one of the defining ideas od OOP.

Create a class called "Car" in the project, to do that follow the next steps:

1. Right click on the pacakge "objectorientedkotlin".

2. Select new -> Kotlin Class/File

3. Inside the form create a class called "Car" and check that "class" is selected.

When creating a class always you have to use a keyword `class` before the class name and the class names are written in PascalCase that means that the words doesn't contain spaces and every new word starts with a capital letter.

Inside the curly braces is what is known as class body inside the class body define a function called start and inside the function create a log message of type information, tag "MY_TAG" and message "Car is starting...".

### Creating new instances and objects

In OOP there are instances and objects they refer to the same thing but they have different meaning, I know it sounds weird and confusing. 

An instance of a class (blue-print) means allocating the memory space and object means initializing the variables inside that instance, the object is an actual thing that is built based on the 'blue-print'(the car). You can have various instances of a single class and by that having different objects.

You can use instance and object interchangeably programmers will understand you.

Please go the the MainActivity and inside the `onCreate()` method create and instance of the `Car` class, to do that you have to store your instance inside a variable or constant whatever suits your needs, name of the variable needs to be "car".

It should look something like this `val car = Car` but as you can see android studio is complaining because we forgot something really important! Constructors.

To get rid of the issue add parenthis at the end of the class name when creating the instante variable `val car = Car()`

### Methods of a class

To access the method we previously declared `start()` in the `Car` class we use dot notation.

Below our instance of the class in `MainActivity` call our variable and put a dot in front this will display the method we previously created `car.start()`.

### Constructors

To show what a constructor is please create another class named "Driver" in the same level as the class car.

To define a constructor in a class we need to add parenthesis at the end of the name declaration and to add parameters in the constructor we have to do it inside the parenthesis in the following way:

```
class className(parameter1: String, parameter2: Int) {
    // Class body
}
```

In the driver class please add a constructor with one parameter, the name of the parameter is "name" and the type `String`.

```
class Driver(name: String) {}
```

The way we work with constructors in Kotlin is very different from Java, Kotlin embeddes the primary constructor in the class definition and in Java is different and takes more lines of code.

### Init blocks

init is a type of constructor which is called it-self while we create an instance of a class. Let us understand by using a init block to set the name of the driver.

Define a var called "driverName" and assign it an empty string after that put the keyword `init {}`, inside the init block assign the constructor parameter `name` to the variable `driverName`.

After the init block define a function with a name "showDetails" and inside the body of the function add a log message of type information with a tag of "MY_TAG" and a message of "Name of the driver is $driverName".

The result should be the following:

```
class Driver(name: String) {
    var driverName = ""

    init {
        driverName = name
    }

    fun showDetails() {
        Log.i("MY_TAG", "Name of the driver is $driverName")
    }
}
```

Go to the `MainActivity` and create an instance of the drive class just like the class car `Car()` name "driver"... great but as you can see this time the error doesn't go away to get rid of it you have to provide a value to the name parameter, provide whatever name you want.

After the declaration call the `showDetails()` method. Your code should look something like this:

```
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car()
        car.start()

        val driver = Driver("Lewis")
        driver.showDetails()
    }
}
```

Run the app (physical or emulated) and filter the log messages, as you see everything is working good and the init block assign the value of the parameter to the variable declared in the driver class.

### Constructor parameters as field variables

There is a more efficient way on how to access parameters of primary constructors inside our class.

When creating the parameters add a val before the parameter name and with that we can access the values from everywhere inside the class, this only applies to the primary constructor if you want to add a secondary constructor it is different.

We are not going to cover secondary constructors in this course.

The code should look something like this:

```
class Driver(val name: String) {
    fun showDetails() {
        Log.i("MY_TAG", "Name of the driver is $name")
    }
}
```

As you can see we save a lot of lines of code and we didn't have to define another variables, run the app and everything should be working as expected.


### Visibility modifiers

In Kotlin, visibility modifiers are used to control the visibility of a class, its members (properties, functions, and nested classes), and its constructors. The following are the visibility modifiers available in Kotlin:

1. private: The private modifier restricts the visibility of a member to the containing class only. A private member cannot be accessed from outside the class.

2. internal: The internal modifier restricts the visibility of a member to the same module. A module is a set of Kotlin files compiled together.

3. protected: The protected modifier restricts the visibility of a member to the containing class and its subclasses.

4. public: The public modifier makes a member visible to any code. This is the default visibility for members in Kotlin.

In Kotlin, visibility modifiers are used to restrict the accessibility of classes, objects, interfaces, constructors, functions, properties, and their setters to a certain level. No need to set the visibility of getters because they have the same visibility as the property.

The most used visibility modifier is `private` and `public`.

Go to the Driver class and add two new properties `private val limitSpeed = 150` and `var currentSpeed = 0` as you can see one of them has a visibility modifier and in the `showDetails()` and an if-else statement to check if the driver pass the speed limit.

In the `MainActivity` use dot notation to change the value of the currentSpeed var and run the app, because of the visibility modifier you can't access the private val, filter the message and see what message is out. 

### Inheritance

Suppose, in the application, you have three cars - a ferrari, a mercedes benz and a McLaren.

Since, all of the cars share the same attributes like a motor, who's the driver, if its stick or automatic. However, they also have some special attributes. The ferrari is faster than the other two but the Mercedes it has more horse power and so on.

You can create individually three classes with a motor, speed limit and their special attribute.

It would be a lot easier if we had a Car class with basic features like motor, door count, fuel, speed limit, and add special attributes to those features as per our cars. This is done using inheritance.

Using inheritance, now you don't implement the same code for isOn(), hasFuel() and showDetails() for each class. You just need to inherit them.

Create another class in the same level as the `class Driver` and `class Car` but the name of this class is going to be "MyCar".

To make our class child of the `class Car` we need to extend MyCar class from the Car class, after the class name declaration add a colon and write the class name with its constructor.

```
class MyCar: Car() {
}
```

If an error pops up please add the keyword `open` before the `class Car` this enables inheritance in a class, by default all the classes are final that means that inheritance is not possible.

```
open class Car {
    fun start() {
        Log.i("MY_TAG", "Car is starting...")
    }
}
```
Now you have the methods from the parent class Car.

### Overriding methods

If the base class and the derived class contains a member function (or property) with the same name, you can need to override the member function of the derived class using `override` keyword, and use `open` keyword for the member function of the base class.

In the Car class add the `open` keyword to the `fun start()` and in the MyCar class override the method in the following way:

```
class MyCar: Car() {

    override fun start() {
        super.start()
        Log.i("MY_TAG", "MyCar is starting...")
    }
}
```

If you don't add the `super.start()` the functionality created in the parent class will not be executed only our new code.

In `MainActivity` after the other instances create and instance of of MyCar class and see the results, try doing it again without the `super.start()` and see how things change.

```
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car()
        car.start()

        val driver = Driver("Lewis")
        driver.currentSpeed = 120
        driver.showDetails()

        val myCar = MyCar()
        myCar.start()
    }
}
```

### Interfaces

They can contain definitions of abstract methods as well as implementations of non-abstract methods. However, they cannot contain any state.

Meaning, interface may have property but it needs to be abstract or has to provide accessor implementations.

Keyword `interface` is used to define interfaces in Kotlin. For example:

```
interface MyInterface {

    var test: String   // abstract property

    fun foo()          // abstract method
    fun hello() = "Hello there" // method with default implementation
}
```

Create an interface in the same level as the other classes, to create it do it in the same way as the way you created the other classes but this time change the class type to interface and name it "SpeedController".

To add the interface to MyCar class do the same step as if we are inheriting a class but don't add a constructor.

An error migh pop, hover your pointer over the red underlined text and click it, a red ligh bulb appears click on it and click "implement members" this way you add the two methods from the interface.

Here you need to add the implementation code for the methods, add a log message in each of them, its up to you what tag and message will display.

```
class MyCar : Car(), SpeedController {

    override fun start() {
        super.start()
        Log.i("MY_TAG", "MyCar is starting...")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}
```

Kotlin does not allow true multiple inheritance. However, it's possible to implement two or more interfaces in a single class.

### Method vs Function

Function — a set of instructions that perform a task. Method — a set of instructions that are associated with an object.

## END

This is the end of the section... great now you know about OOP this is awesome you're basically a programmer now, not just an android developer but a programmer you have the foundations for almost all programming languages.

Keep going and practice. Don't copy and paste the code try to write it by yourself this will build your muscle memory and sink all the concepts in your head.

Have a nice day and don't give up, you can do it.