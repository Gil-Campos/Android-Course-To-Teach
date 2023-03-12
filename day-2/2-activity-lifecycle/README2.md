# Overriding lifecycle callbacks

To call the lifecycle callbacks your class needs to inherit from `AppCompatActivity()` because this is the lifecycle of an activity in later sections we are going to see how different components differ from each other.

`onCreate()` is an activity lifecycle and you can call the other ones in the same way to save you some time I will give the code to of the methods and the logcat messages but it's up to you to filter the messages in the LogCat, you already know how to do that from previous sections.

Type the code below in the project created in the `README` of this section, I know it looks tedious to type all of this and copy and paste would be more efficient but muscle memory is really important.

```
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MY_TAG", "This is my first logcat message")
        Log.d("lifecycle", "onCreate invoked")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle", "onStart invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "onStop invoked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "onRestart invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "onDestroy invoked")
    }
}
```

Great! Now run the app and you will not see anything well not anything useful at least... filter the messages in the logcat.

If you have the LogCat open and the app is running press the home button of your device. You will see the `onPause()` method is invoked and if you wait long enough the `onStop()` method is invoked.

Open your installed apps and open again the app (don't stop the app) after doing this you will that the `onRestart()`, `onStart()` and `onResume` methods are invoked.

In the application click the back button and the `onPause()` method will be invoked and after a while the `onStop()` and `onDestroy()` are invoked too.

The `onCreate()` and `onDestroy` methods are called only once throughout the activity lifecycle.

# END

Now you have a solid understading on how the lifecycle of an activity works, this lifecycle doesn't apply to all the components in android system but they're very similar.

Keep practicing and play with the lifecycle try to create simple apps and see how different UI elements react to different lifecycle stages, remember practice makes perfection and keep going.

Have a nice day coder.

