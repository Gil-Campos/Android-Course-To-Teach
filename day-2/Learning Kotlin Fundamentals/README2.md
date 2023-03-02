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

