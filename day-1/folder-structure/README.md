# FOLDER ESTRUCTURE

## manifests

We are going to start with the manifest that is under the manifest folder. This is a very important file because the first thing that your android app see is the manifest file to know which activity launch first.

To show this open the AndroidManifest.xml and you are going to see two activities one with the name `.MainActivity` and the second with name `.SecondActivity` if you run the app now the first activity will be launched but if you cut and paste the ```intent-filter``` code to the second activity the second activity will appear first and not the first one, everytime you create a new activity will be add to the manifest file.

It also contains the package name of the app and if you need to ask for permissions for example to write or read a DB or use the internet here you put it.

It acts as an intermediate between android os and out application basically.

## java

Inside the java folder there are 3 directories 

- The first one contains the code for your activities, fragments and other things related to the UI. Here you add code to handle API calls or create new packages to have a better code structure.

- The androidTest is for testing the UI using instrumentedTesting this type of test need an emulator or a physical device to work.

- The test is for testing code this can be done without an emulator or physical device because they run in the JVM.

- java (generated) this is the place where all the classes that makes our life easier are created for example when we use viewBinding or Retrofit.

Here we are not going to learn how tu use unitTesting or instrumentedTesting because is a really extensive topic and you need some foundations to start with testing.

## res

This folder continas non-code files here you are not going to see kotlin files or code just resource files like:

- xml layout files which dictates how the UI is going to look, the xml files are the views and the .kt files the view controllers.

-  string resources (inside values) this is really importante because it helps our app to be more inclusive and if we need to ever translate it this is the place to look for first or reuse text in the app this keeps us away from hardcoding the same text which is very error prone.

- colors resources (inside values) here are all the hex code colors that your app needs, it already comes populated with default color but tu can change them or add new ones.

- themes (inside values) how your app handles the ripples of the buttons, the primary color and secondary color of the text is defined here and also the way it handles the change of light mode to dark mode.

- drawables this place is where you put all the png, jpeg, jpg and related images files to use in the app also you can add xml files to draw the icons or use special vector ones to keep the quality of the image.

- mipmap this folder contains the icon files used to display in your phone, notifications and many more places that is why there are many sizes.

## Gradle Scripts

This is a really important part of the android development system because it is an automated build system that really helps us a lot when building and compiling the app, if there was no gradle we would have to this all manually downloading all by ourselfs and write our own configuration files there two importante files that we are goint to use:

- build.gradle (Project: MyApplication) this is the rules that are applied to all the modules, most projects have only module. A module is an isolated piece of the bigger project.

- build.gradle (Module: app) this settins applied to one specific module if there is another module or multiple ones they would have their rules this enables us to have additional build types and product flavors, and override settings in the main/ app manifest or top-level build.gradle or build.gradle.kts file.

In a basic project, almost everything you need to edit will be in the app module's build.gradle file.
