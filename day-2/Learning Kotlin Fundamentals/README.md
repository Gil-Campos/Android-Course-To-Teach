# Kotlin Fundamentals

If you have following the course you have already learn how to build your first simple android application but that is not enough,
you need to learn about the programming language used to build those apps in more depth.

Kotlin is the new industry standard that Google recommends to build Android Apps... Kotlin is the son of the ancient and very feared Java programming language but don't worry Kotlin is easier and the concepts to learn are more easy to digest so if you practice and  try to be constant on learning and building good foundations the app development (android) is going to get really easy in no time.

At this moment we are not going to touch Android Studio, the tool that fit this section is [Kotlin Playground](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS44LjEwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS5cbiAqIHBsYXkua290bGlubGFuZy5vcmdcbiAqL1xuZnVuIG1haW4oKSB7XG4gICAgcHJpbnRsbihcIkhlbGxvLCB3b3JsZCEhIVwiKVxufSJ9) here we are going to test and learn about the kotlin language. You don't need to install anything this a tool that runs in browser is an interactive online tool.

This tool handles compilation in a separate server so that your computar doesn't do the hard work but... what is compilation? GREATE QUESTION! compilation is the process that translates the program written in a programming language into byte codes that the system can run.

## Your First Program

What is a program?

A program is a set of instructions we provide to a system to get a task done. The Kotlin Playground already comes with the simpliest program you can think of and that is printing something in console.

```
fun main() {
    println("Hello, world!!!")
}
```

This program provides instructions on writting "Hello World" in the console of the playground, the `println` is a kotlin keyword, a keyword is a reserve word that has an specific purpose inside the programming language, println prints a text in console in new line.

To learn more about keywords check [Keywords and operators](https://kotlinlang.org/docs/keyword-reference.html) you don't have to learn them all now eventually you are going to learn them with practice.

Lets explain this code more in depth

1. the `fun` keyword is used to declared function so everytime we declared a function we need to put the fun keyboard before the function name, a function is a set of instructions that do an specific task and can call other functions event itself.

2. Function name `main` this is the name used to call the function in other places in this case is main but the name of the function needs to be descriptive of what it does and needs to be written in camel casing.

