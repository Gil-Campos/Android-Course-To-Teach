# Building Your First Android App

Here we are going to create your first Android app, will be a little app but you know rome wasn't built in a day... and in the later sections we are going to build more complex apps with more complex topics.

This part is just to explain tha basics of the Android Studio and for you to play a little and get familiarize with android development.

## Create Project

If you don't have Android Studio open please opened it and when its already launched, click the button in the top that says `New Project`.

Android Studio provides you with a lot of starter templates some of them we are going to use them but some don't because they go beyond the scope of this course, please select the template with the name of `Empty Activity`.

The `Empty Activity` template is one of the most used templates in Android Development because it provides us with the basic foundation files for us to tweak and create our app without an excessive amount of unnecesary files.

If you  click the button that saya `Next` in the bottom you will be taken to another screen that displays fields that you are going to populate with information necessary for the creation of the project.

- Name: The name as it implies dictates the name of the app and how it will be recognized in your phone or tablet when it's installed.

- Package name: This uniquely identifies your Android App in the places where is uploaded, distributed and installed, to ensure that is unique some developers use domain names related to them or owner of the app, if you don't have its ok just uses your name in the middle where it says example and leave the other things as they are.

- Save location: you can decide whatever place to store your app but please store them in a place easy to access to them.

- Language: You have two options to build Android Apps `Kotlin` or `Java` the current industry standard is Kotlin so choose that one.

- Minimum SDK: That app needs a minimum software version to run so basically if you choose Android 5.0 (Lollipop) your app will from that version or higher but not below it.

Click `Finish` and Android Studio and the Gradle will build the app, if this is your first time it might take some time because Android Studio has to download all the important files after this the other projects are not going to take much time when creating them.

## Change The Layout File

Go to the `res` folder and open the package with the name of `layout` here are all the layouts that are app and future apps need, sometimes we would have to create them ourselfs but Android Studio helps us creating the layout file related to every activity.

Open the one that says `activity_main.xml` here you got three options int the top right corner on how to change the layout:

- Code: this is only xml code and you add each component and constraint to the layout using only xml.

- Split: you can use xml code and design where you can use features like drag and drop to add components inside the layout and if you add one component of constraint in the xml it will be reflected in the design too.

- Design: here there is no xml code you use only you mouse to drag and drop components inside the layout and to change properties there is a pane, you don't have to manually add them.

Please choose the `code` option, you should see something like this:

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

The most important parts you should right now are the lines that says `androidx.constraintlayout.widget.ConstraintLayout` and `TextView` used to define a layout by assigning constraints for every child view/widget relative to other views present, there are many layout types but constraintLayout is one of the most used if you want to learn more about this you can go to [Constraints overview](https://developer.android.com/develop/ui/views/layout/constraint-layout#constraints-overview) and Textiview is an android component one used every day for every Android Developer.

That things inside the `<TextView />` are called attributes, you don't need to learn them all with practice and time you are to learn their name and usage,  please change from code to design in the design mode you waste less time writting and you can just drag and drop components and add constraints to them.

Click in the textView inside the layout and move it up as much as you want, as you might see when you click or moved your textView blue zigzag lines those are constraint and are necessary because your app needs to know where to put the components when rendering the layout in your app.

After you clicked the TextView a pane in the right call `attributes` must appear, this pane contains the attributes you can set to your TextView, I know it looks daunting at first because there is a lot but you don't need to learn them all.

Look for the attributes mentioned here and follow this instructions to alter the layout and have something different:

1. id: change the id of the textView to `tvHello` this id is used in the Kotlin Files related to your layout to handle actions or the view of your textView.

2. text (inside Common Attributes): here you change the text of the TextView, change it to `Hello! My First App... :)`.

3. textColor: you can click in the squared and change the color of the text inside the textView, this are HEX values, choose whatever color you like.

4. textSize: Change the size to 34sp, sp is a relative unit what that means is that based on the phone pixel density it scales up or down and tries to look good on most devices this type of relative things help us to focus more on other things of Android Development.

5. textStyle: choose bold.
 
Great now lets run the app, you can run it in a physical device connected to your computer or an emulator:

- Physical Device: connect the device to your computer via USB and if you don't have developer mode on please do activate and enable USB debugging.

- Emulator: create an android emulator if you don't have one and don't know how to create it refer to [Create an Android Virtual Device](https://developer.android.com/studio/run/emulator#avd).

If you have everything set up, click in the green play button in the top of Android Studio and the app will be builded and installed on the device (physical or virtual), if everything went ok you should see all of the changes we made.

Now stop tha app from running you can do this by click the red stop button in the same line that you clicked the green play button.

Go to the `àctivity_main.xml` and choose code mode, if you see closely all the attributes we change in the design mode appear in the xml code, this saves us a lot of time and the ones where already there change it's values.

The attribute `text` is underlined in yellow, hover your mouse in the yellow line and a yellow lightbulb appers in the left, click it and select extract string resource, extract the resource (click ok).

Extracting resource is a must in app development because it help us to reuse strings and not type the same text all the time and when you if you need to translate the app it makes it easier.

To continue this section go to the file name `README2.md`
