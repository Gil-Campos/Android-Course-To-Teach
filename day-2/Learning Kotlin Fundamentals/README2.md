# Simple Kotlin Program

Here we are going to build a calculator, a really simple calculator but this will create a solid foundations about what is functions, variables, strings, data types and operators... it looks like a lot of topics to cover in just a little program but its actually just the tip of the iceberg.

Here we cover just the fundamentals or the essentials for you to be an Android Developer but bear with me because practice makes perfection!

## Building the program

Please go to the [Kotlin Playground](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS44LjEwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS5cbiAqIHBsYXkua290bGlubGFuZy5vcmdcbiAqL1xuZnVuIG1haW4oKSB7XG4gICAgcHJpbnRsbihcIkhlbGxvLCB3b3JsZCEhIVwiKVxufSJ9) and write the code below, don't just copy and paste it because writting it will create muscle memory in your fingers and han this will help you learn faster and better.

```
fun main() {
    println("First number is 12")
    println("Second number is 12")
    println("Addition of them is 20")
    println("Substraction of them is 4")
}
```

Lets run the program and see the results you should see something like this:

```
First number is 12
Second number is 12
Addition of them is 20
Substraction of them is 4
```

But if we change something small like this:

```
fun main() {
    println("First number is 12")
    print("Second number is 12")
    println("Addition of them is 20")
    println("Substraction of them is 4")
}
```

Tha output will be:

```
First number is 12
Second number is 12Addition of them is 20
Substraction of them is 4
```

So this is to demonstrate that code is fragile basically deleting two letters can result in a totally different result and even the senior make this type of mistakes and is really hard to debbug them, revert the mistake to the first code that you typed.

Lets say you want to do another calculation in that code one solution would be doing the following:

```
fun main() {
    println("First number is 12")
    println("Second number is 12")
    println("Addition of them is 20")
    println("Substraction of them is 4")

    println("Third number is 20")
    println("Fourth number is 8")
    println("Addition of them is 28")
    println("Substraction of them is 12")
}
```

This solution is ok but it is not dynamic meaning that if you want to do a third calculation you would have to change the code everytime and if you want to n calculations you would have to n changes and the changes are basically writting the same every time, that is not efficient and as programmers we love efficiency.

What you have just done is called "hard-coded" and according to google that is "fix (data or parameters) in a program in such a way that they cannot be altered without modifying the program" so this statistic doesn't matter how many times you run the code the output will the same every time.

## Marking the program dynamic

To do this program dynamic we are going to use set of tools that every programmer needs to know and uses every day such as variables, not repeating code and refactoring.

### Variables

In Kotlin you are going to use two keywords for defining a variable well one is a variable and the other is a constant we'll explain their differences in a bit.

- var: multiple values during runtime, the value of this can be change during runtime.

- val: single value during runtime, this means they're inmutable and if you try to change you might get an exception and your app will crash.

Lets add variables to our previous code and it will look something like this:

```
fun main() {
    var firstNumber = 12
    val secondNumber = 8
    println("First number is $firstNumber")
    println("Second number is $secondNumber")
    println("Addition of them is 20")
    println("Substraction of them is 4")
    println("")
    firstNumber = 20
    println("First number is $firstNumber")
    println("Second number is $secondNumber")
    println("Addition of them is 28")
    println("Substraction of them is 12")
}
```

As you might notice I ditch the third and fourth number because that would create extensive, hard and repetitive code.

So lets begin explaining the code above this code is useful but not very practive because we are still having hardcoded values for example if you change the values of the firstNumber and secondNumber the answers to the operation will not change.

To solve the hardcoded values in the operations we have to use strings templates and use logical operators like this one below:

```
fun main() {
    var firstNumber = 12
    val secondNumber = 8
    println("First number is $firstNumber")
    println("Second number is $secondNumber")
    println("Addition of them is ${firstNumber+secondNumber}")
    println("Substraction of them is ${firstNumber-secondNumber}")
    println("")
    firstNumber = 20
    println("First number is $firstNumber")
    println("Second number is $secondNumber")
    println("Addition of them is ${firstNumber+secondNumber}")
    println("Substraction of them is ${firstNumber-secondNumber}")
}
```

Run the code and and you will see that the code works really good and this more scalable than having hardcoded numerical solutions but still we are repeating a lot of code, we could use functions and reuse it to make the program more efficient.

### Functions

```
fun main() {
    printStringAndCalculation(12, 8)
    printStringAndCalculation(20, 8)
}

fun printStringAndCalculation(firstNumber: Int, secondNumber: Int) {
    println("First number is $firstNumber")
    println("Second number is $secondNumber")
    println("Addition of them is ${firstNumber+secondNumber}")
    println("Substraction of them is ${firstNumber-secondNumber}")
    println("")
}
```
Ok the code changed a lot... I know it looks daunting because from the big chunk of code the we've working on we have so little left of it.

This wouldn't be possible without the help of functions, functions give us the opportunity to separate code and reuse it the code above is a great example, if we want to do 5 calculations we would have to write 5 times the same exact chunk of code but with functions we only need to call a single function 5 times and that contains the necessary code to perform the 5 calculations needed.

This function is new to you because it has parameters when its declared, parameters are the firstNumber and secondNumber inside the parenthesis after the function name to add parameters to a function you would do it in the following way:

```
fun name(parameter1: dataType, parameter2: dataType) {
    // function body
}
```

You can call a function from other functions and even the same function can call itself and that is recursion but we won't see that here, don't worry.

When calling a function that has parameters that data that you pass is called arguments and needs to be from the same type as previously declared in the function if not it will crash.

### End

Great you have finish you calculator... you can add more things like a multiply function or divide, I encourage you to do it because practice makes perfection or if you wan to rest its ok.

To continue learning Kotlin you can go to `README3` here we are going to learn more about functions and other thins in more depth. 