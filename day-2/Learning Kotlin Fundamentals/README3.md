# Learning more about functions

In this section we are going to learn more about Kotlin functions and how to really unleash the power of functions in a beginner level.

Please go to [Kotlin Playground](https://play.kotlinlang.org/)

## Function Return Types

In this part I will teach you on how function can return values... Yep return values for this you have to assign a return value to the function and well return something of that category.

To create a function that returns something lets say an int you would have to do the following:

```
fun someFunction(parameter1: Int, parameter2: Int): Int {
    return parameter1+parameter2
}
```

After the parenthesis you put a colon and after that specify the data type you are returning from that function, inside the function body you need to use return keyword to specified what value from you the body your function is returning.

In the code below there is an example of a simple addition of how to return data from a function and store it in a variable o constant:

```
fun main() {
    val result = getAddition(2, 5)
    println("The addition of 2 + 5 is $result")
}

fun getAddition(num1: Int, num2: Int): Int {
    return num1+num2
}
```

As you saw we can store the return types of functions in variables, that is pretty neet! but to make this more "programmer style" you can save time by calling the function directly from the println function like this:

```
fun main() {
    println("The addition of 2 + 5 is ${getAddition(2, 5)}")
}

fun getAddition(num1: Int, num2: Int): Int {
    return num1+num2
}
```

This save time, space and is more efficient you can return every data type you want even the ones made by you... be careful storing the wrong data type in a variable can cause a lot of problems.

### One line functions

Kotlin lets us make our code more readable and save time so when you have functions like this in your code: 

```fun getAddition(num1: Int, num2: Int): Int {
    return num1+num2
}
```

You can declare them like this:

```
fun main() {
    println("The addition of 2 + 5 is ${getAddition(2, 5)}")
}

fun getAddition(num1: Int, num2: Int) = num1+num2
```

And is going to work like nothing has happened.

## Overloaded Functions

You can have functions with the same in Kotlin BUT! with different parameters each so that the language can se a difference in each of them for example lets say you need yo sum 2 numbers but someone says that they need to sum 3 numbers and maybe 4 sometimes, here comes handy the function overload.

```
fun main() {
    println("The addition of 2 + 5 is ${getAddition(2, 5)}")
    println("The addition of 2 + 5 + 1 is ${getAddition(2, 5, 1)}")
    println("The addition of 2 + 5 + 1 + 2 is ${getAddition(2, 5, 1, 2)}")
}

fun getAddition(num1: Int, num2: Int): Int {
    return num1+num2
}

fun getAddition(num1: Int, num2: Int, num3:  Int): Int {
    return num1+num2+num3
}

fun getAddition(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    return num1+num2+num3+num4
}
```

If you write this code on the [playground](https://play.kotlinlang.org/) you will see that everything will work fine this is because Kotlin can differentiate functions by the parameters define even if they have the same name, this is helpful because sometime you need to have different variations of the same function.

## Optional values in function parameters

This is a really helpful tool when you need to always have a value in your function, if not it might crash during runtime for example:

```
fun main() {
    println("The addition of 2 + 5 is ${getAddition(2, 5)}")
    println("The addition of 2 with a default parameter value is ${getAddition(2)}")
}

fun getAddition(num1: Int, num2: Int = 0): Int {
    return num1+num2
}
```

As you can see I'm calling the function and I'm not passing any argument there so the program checks if there is any default parameter in the function.

## Storing Values

Functions are a key part of becomming a developer of any kind to be honest but understanding how to store the values return from a function or any kind of value is important in Kotlin we have two main keywords to do that:

- `var` varName: dataType = data

- `val` varName: dataType = data

As you can see the declaration of them is really easy but they differ massively in how they store data the `var` keyword lets you perform runtime changes to the value store and even delete it but the `val` once declared cannot change in runtime and if you try to do it well... it will crash.

```
fun main() {

    // Declaring and initializing a var
    var num: Int = 1

    println("$num")
    
    num = 3 + 1

    println("$num")

    // Declaring a var
    var num2: Int

    // Initializing a var
    num2 = 3 + 1

    println("$num2")

    // Declaring and initializing a var
    var num3 = 1

    println("$num3")
}
```

You can declared and initialize var in different ways but never call a var without it's initialization because that will cause a lot of errors and lastly you can declared var and val without specifying the datatype becase Kotlin is smart enough to recognize what kind of value are you storing.

Using val doesn't let us do changes I will do a example but it's going to be in a comment, uncomment that to get the error

```
fun main() {

    // Declaring and initializing a var
    val num: Int = 1

    println("$num")
    
    // Uncomment the line below and see the error
    //num = 3 + 1

    println("$num")
}
```
## Using List

Lets say you want to save some data but it comes in the form of a collection like all the names of the students of some classroom, you can declared n var or val and store the name of each student there but that is really inefficient.

To solve this issue we use something called `list`, a list is a collection of items in a specific order in Kotlin we have two type of list:

- Read-only list: List cannot be modified after you create it.

- Mutable list: MutableList can be modified after you create it, meaning you can add, remove, or update its elements.

```
fun main() {

    // Creating a read-only list
    val countries = listOf("Germany", "India", "Japan", "Brazil", "Australia")

    // Creating a mutable list
    val cities = mutableListOf("Berlin", "Calcutta", "Seoul", "Sao Paulo", "Sydney")
}
```

List have a lot of methods to access like size, get an specific item and many more even converting one list to another or concatenate them to learn more about them refer to [Kotlin List](https://kotlinlang.org/docs/collections-overview.html#collection-types).

### Iterate over a list

To get all the items of a list you iterate the list using a forEach loop, list come with this function already and you can use it with dot notation:

```
fun main() {

    val countries = listOf("Germany", "India", "Japan", "Brazil", "Australia")

    countries.forEach { country ->
        println(country)
    }

    // You can give any name in the variable used to access the data in the list
    countries.forEach { it ->
        println(it)
    }
}
```

### Add data to a mutable list

Changing the values of a list is only possible in mutable list if you try that in a read-only list you program will crash.

To add data you need to the function `.add()`:

```
fun main() {

    // A mutable list
    val cities = mutableListOf("Berlin", "Calcutta", "Seoul", "Sao Paulo", "Sydney")

    cities.forEach { it ->
        println(it)
    }
    println("")

    cities.add("Cartagena")

    cities.forEach { it ->
        println(it)
    }
}
```

I strongly recommend that you give a little read to [Kotlin List](https://kotlinlang.org/docs/collections-overview.html#collection-types) because there are a lot of things that I can't cover in just one readme file and with that article you will succeed on understanding list in Kotlin.

## Loops

Lastly but very important you need to know about loops... you already know how to iterate list but how about on give a consecutive sum or a factorial well here comes handy the loops.

In Kotlin we have a lot of ways on how to define and use loops I will explain some of them:

### Iterate through a range

Here, the loop iterates through the range and prints individual item.

```
fun main() {

    for (i in 1..5) {
        println(i)
    }
}
```
Different Ways to Iterate Through a Range

```
fun main() {

    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
}
```

### Iterating Through a String

```
fun main(args: Array<String>) {

    var text= "Kotlin"

    for (letter in text) {
        println(letter)
    }
}
```

### While Loop

The syntax of while loop is:

while (testExpression) {
    // codes inside body of while loop
}

How while loop works?
The test expression inside the parenthesis is a Boolean expression.

If the test expression is evaluated to true,

- statements inside the while loop are executed.

- then, the test expression is evaluated again.

This process goes on until the test expression is evaluated to false.

If the test expression is evaluated to false,

- while loop is terminated.

Kotlin while Loop:

```
fun main() {
    
    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }
}
```

## END

Great now you have a good understanding on how things work in Kotlin well the basics because Kotlin has a lot of topics to cover but right now you are good with what you know.

Keep practicing what you have learned and if you want to continue with this pleas go to the folder `Activity Lifecycle` there we will continue to keep learning android.  