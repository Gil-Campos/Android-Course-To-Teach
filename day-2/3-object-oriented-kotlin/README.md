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