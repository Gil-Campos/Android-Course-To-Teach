# Add User Interaction 

This section continues the first part of "Building Your First Android App" so if you run the app... it only displays some text and that is all that it does, a lil bit boring in my opinion.

Lets make this app more dynamic by adding some user interaction by allowing the user to type the name and click on a submit button and then the app will display a welcome message with the name that the user entered.

## Add a Text Input Field

This is a component that enables the user to enter text to the app go to the layout of the main activity and switch to `design` in the left there is a pane called "Palette" go to the Text section as you can see there android provides us with a bunch of different types of text input fields and other components related to display and handle text.

Click the `plainText` and add it to the layout, we are going to constraint it later, the different types of text related components are used in specific cases like the password input field has some features to protect the user passwords and phone input fields just displays numbers and special characters used in phone numbers this makes our life easier when handling with validations of the text.

Ok now that you hace the EditText in your layout you can see it has four dots in each side with those dots you add constraints, to the position of a component at leat you need one vertical constraint and one horizontal contraint.

Our TextView above the EditText has four constraints (two vertical and two horizontal), change to split mode and you will see that the EditText has none of the constraint properties that the TextView has, lets add them:

- Click the dot of the left side in the EditText while you do that drag it to the left side of the layout a constriant must be created and the EditText has move to that side, repeat this with the right side.

- Click the dot of the up side in the EditText while you do that drag it to the up side of the layout a constriant must be created and the EditText has move to that side, repeat this with the bottom side.

Great now the EditText has centered, click the EditText and drag it up, close to the TextView but leave some room between them don't squish together.

Select the EditText and change the following attributes:

- id: Change the id of the EditText to `tvName`.

- textSize: Change it to 24sp.

### Pause

Run the app right now... as you can see if you try to write something you have to first delete "Name" from the EditText, this is a bad practice and it could cause a problem when validating the input.

### Proceed

- name: Delete the text in the name attribute because that is a default text.

- hint: Add a hint `Type your name hare` this is going to disappear when the user writes something and it would not causes any problem when handling the text.

## Coding Challenge

Now with all the knowledge that you have and it is time for you to practice what learn so follow the instructions and change the UI of the app:

- Grab a button from the palette.

- Drop the button below the EditText.

- Set the constraint in the exact way we did it in the EditText and TextView, set them just to the view (constraintLayout) but not to any other view.

- Add an ID to the button called "submitBtn".

- Change the text of the button to "Submit", make the text bold and change the text size to 24sp.

If you finish the challenge great! You have made your first changes as an android developer run the app and see them, we have more to learn... don't give up.

## Handling User Interaction

To handle how the user interacts with the different components of the app we need to WRITE CODE! This is the momento a lot of you have been wating, don't worry we are no going to use Java instead we are going to use Kotlin which is a better version of Java and easier yo learn.

In later sections you will learno more in deph the Kotlin language, this is just to show you some syntax and add your first lines of code.

Open the file named `MainActivity`, this is called the MainActivity and is the layput controller class of the `activity_main.xml` that we just design.

```
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
```

The way the MainActivity is connected to the activity_main file is via the line of code `setContentView(R.layout.activity_main)` in Android the onCreate function is called when the activity is first created, this function is where we should do all the normal setup codes and binding data.

There are more lines of code in the previous block but at the moment the setContentView is the only important.

To handle the interactions and change the text of the textview we need to access to them via its id to do that we use a function called `findViewById` and especify the type of view in the `<>`,

After the `setContentView(R.layout.activity_main)` and before the closing bracket of the `onCreate` function add this lines:

```
...
setContentView(R.layout.activity_main)
    val greetingTextView = findViewById<TextView>(R.id.textView)
    val inputField = findViewById<EditText>(R.id.tvName)
}
...
```

The val keyword is a Kotlin special word to declared constants, values that are not going to change in run time.

---

## Coding Challenge

- Connect the button just like we connect the textView and the EditText

---

Great now we have a reference of our components of the layout file but we need to add a `onClickListener` to the button so that they can trigger a function o some block of code to alter the other components, you can add clickListeners to almost all view components but here we only need one for the button.

```
...
val submitButton = findViewById<Button>(R.id.submitBtn)
    submitButton.setOnClickListener {

    }
}
...
```

Now whenever the user clicks on the button it will trigger the code that is inside of the brackets in the clickListener.

But there is no code to trigger... add the following code inside the clickListener and we'll explained it later:

```
submitButton.setOnClickListener {
    val enteredName = inputField.text.toString()
    val message = "Welcome $enteredName"
    greetingTextView.text = message
}
```

The logic of the above above is the following:

1. When the user clicks the button a constant is created name "enteredName" and extracts the text inside the EditText but we have to use a function to convert it to String because the return type of the EditText is an Editable, I know this sounds like gibberish to you this will make sense the more you practice.

2. After the constante enteredName is created and has the text of the EditText we create a message and we use a dollar sign to call variables in text this is called string interpolation to save us time and not using concatenation.

3. The message is set in the TextView by accessing its text property just like xml but with Kotlin code.

Run the app and test it... everything should work, type your name or your pets name, whatever you want.

Well if everything went ok CONGRTULATIONSSSS you have basically develop a fully android app, I mean its really small and maybe not that useful but! You did it and thats what matters, keep going and practice.

## Good User-Friendly Practice

Always think in your users and how they are going to be more comfortable using your app... if you run the app every time you click on the submit button the text in the EditText stays there.

We are going to add that every time that the user submits the name the text inside the EditText will be cleared.

```
submitButton.setOnClickListener {
    val enteredName = inputField.text.toString()
    val message = "Welcome $enteredName"
    greetingTextView.text = message
    inputField.text.clear()
}
```

Run the app and you are going to see that submitting a new name clears the EditText field. 

## Data validation

Data handling and validation is a really importante topic in software development, this is how you ensure that the data that your user provides it's in the correct format and many things more.

Right now we are going to use conditionals statements to check if the user doesn't submit empty strings, an empty string would be if the user taps the submit button and there is no text in the EditText.

Using if-else statements add the next code block to the clickListener, we'll explain it in a short time:

```
submitButton.setOnClickListener {
    val enteredName = inputField.text.toString()
    if (enteredName == "") {
        Toast.makeText(this, "Enter a valid text", Toast.LENGTH_SHORT).show()
    } else {
        val message = "Welcome $enteredName"
        greetingTextView.text = message
        inputField.text.clear()
    }
}
```

The logic behind this code is the following:

1. Whe you click the button the enteredName constant gets whatever text is in the EditText or it could be empty.

2. The if statement checks the enteredName constant and if it is an empty string it will display a Toast, a Toast is a message that appears for a short period or long period of time in the bottom of your screen with a message.

3. But if the enteredName constant is not empty the app will work like is supposed too.

If you want to learn more about Kotlin operators you can go to [Kotlin Operators](https://www.programiz.com/kotlin-programming/operators).

Run the app and if everything is good you should have your first validation code working good... but we need something else if the user submits an empty EditText the TextView should display no text, add the following code to solve that problem.

```
submitButton.setOnClickListener {
    val enteredName = inputField.text.toString()
    if (enteredName == "") {
        greetingTextView.text = ""
        Toast.makeText(this, "Enter a valid text", Toast.LENGTH_SHORT).show()
    } else {
        val message = "Welcome $enteredName"
        greetingTextView.text = message
        inputField.text.clear()
    }
}
```

Great you have come this far... you have made most of the difficult parts but there is a `README3` that one handles the navigation between activities, it would simple and easy navigation but our app is really plain and I think that another activity is going to make it more vibrant.

Go to the `README3` to continue this journey.