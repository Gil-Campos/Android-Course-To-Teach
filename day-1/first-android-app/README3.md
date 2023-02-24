# More Activities

Great you've come this far! Now I'm going to teach you on how to add new activities and how android studio helps us with templates.

If android studio didn't help us with the templates, creating and linking the files when creating activities it would be really difficult and error prone plus we would need to download everything ourselfs.

## Adding New Activities

Open android studio and in the package that is located `MainActivity` right click and select "New -> Activity -> Empty Activity".

When you have done that you would need to provied information about the new activity, put "SecondActivity" as the activity name as you can the layout name is based on the activity name.

Click on finish.

I supposed that everything went ok... as you saw android studio created all that we need to use the activity it even already add it to the manifest file, the layout and the controller are already linked, remember the kotlin files are the view controller and xml files are the views.

## Adding Button to Change Screen

In the activity_main.xml file add a button in the bottom right corner and constrint it to the parent view (constraintLayout) and change the following attributes:

- id to "btnNextActivity"

- textSize to 24sp

- text to  "Next"

Run the app and see the new button being added to the design.

Right now I will introduce a property called "visibility" this is a very useful property because it let us hide component in the screen, there three type of visibility:

1. visibile: the component is visible to the user and can interact with it.

2. invisible: the component is not visible and the user can't interact with it but it keeps consuming the same ammount of space in the screen.

3. gone: this hides the component and the user can't interact with it and it will not consume any space in the screen when rendering the UI.

Now change the visibility propertie of the button to "invisible" if you run the app now the button will not be visible.

## Going to the next Activity

The logic is going to be that only when the user enters a valid text to the EditText it will be able to click the "Next" button, if the text is not valid the button needs to go invisible and only be visible when the text is valid.

Create a reference of the next button in the onCreate of the MainActivity called "nextButton"

```
...
val submitButton = findViewById<Button>(R.id.submitBtn)
val nextButton = findViewById<Button>(R.id.btnNextActivity)
submitButton.setOnClickListener {
...
```

Now that we have a reference to the button we need to handle the logic of show it when the text is valid and when its not so we are going to use the visibility property in Kotlin inside the if-else statement.

```
submitButton.setOnClickListener {
    val enteredName = inputField.text.toString()
    if (enteredName == "") {
        nextButton.visibility = INVISIBLE
        ...
    } else {
        ...
        nextButton.visibility = VISIBLE
    }
}
```

Run the app and test the visibility of the button when adding valid text and when not, if everything is good and running now we only need to add the code that will present us the new activity.

### Intents and Data

To trigger the code that will get us the new activity we need to add an onClickListener to the nextButton, this will get us to the new activity every time we tap on it add this line after the submitButton clickListener `nextButton.setOnClickListener { }`.

To navigate from one activity to another we use an android object called `Intent` to create one and trigger it add the following code and I will explain it later:

```
nextButton.setOnClickListener {
    val intent = Intent(this, SecondActivity::class.java)
    startActivity(intent)
}
```
The logic behind this code is:

1. intent is an object from the class Intent we need to provide a context with the this keyword you can use "this" or "applicationContext" in this little app both work fine but in bigger projects you need to know which works the best and the name of the class activity we want to go.

2. To perform the intent we call startActivity and pass our custom intent.

This type of intent is called explicit intent because we are specifying a direct destination inside our app.

Run the app and test it... if all is working fine you should see a white screen, that is the SecondActivity but it looks plain and boring so lets pass some data to the new activity to display.

Lets pass that the user entered but we have an issue right now that constant is only visible inside the code block where its define and the ones inside of it, that is an issue because the nextButton needs that value to sent it.

To solve the problem we can put the constant in the onCreate level so that anything created inside the onCreate can access to it.

```
...
val nextButton = findViewById<Button>(R.id.btnNextActivity)
var enteredName = ""
submitButton.setOnClickListener {
    enteredName = inputField.text.toString()
    if (enteredName == "") {
        nextButton.visibility = INVISIBLE
...
```

Using putExtra object to pass the data between activities add the folling code to share the name to the SecondActivity:

```
nextButton.setOnClickListener {
    val intent = Intent(this, SecondActivity::class.java)
    intent.putExtra("USER", enteredName)
    startActivity(intent)
}
```

But before we pass the name to the SecondActivity we need a TextView to display the data:

- Add a textView to the SecondActivity

- Constraint it just like the other one in the MainActivity.

- Change its id to "tvSecondActivity"

- Change the textSize to 20sp and the textStyle to bold.

Now that we have that we can extract the data pass from the first activity using the getStringExtra function from intent class, we need to provide that name that we assign it from the place that is comming from.

```
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userMessage = intent.getStringExtra("USER")
    }
}
```

Great now we only need a reference of that textView in our SecondActivity kt file, add it on the onCreate `val name = findViewById<TextView>(R.id.tvSecondActivity)` and set the userMessage as the text of the textView.

```
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userMessage = intent.getStringExtra("USER")
        val name = findViewById<TextView>(R.id.tvSecondActivity)
        name.text = userMessage
    }
}
```

Run the app and test it! If all is working good, I have to se congratulations because tou have made your first android app all from scratch.

This app is really simple but it shows you the very basics you need to know on how to start your own projects, try to this app better or add more validations to it as a challenge or practice.

Don't give up and do another apps similar to this one so that the knowledge you gain from here gets solid in your mind.




