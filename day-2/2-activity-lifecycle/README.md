# Activity Lifecycle

In this section we are going to learn about how Android manages the activities lifecycle and how we can implement different methods and override them so that our apps work in the most efficient way.

This section includes a complete project but I really recommend that you do everything from scratch so that you start building that muscle memory and all this steps on how to create a project sink in your mind.

## Gettin Started

Please open Android Studio and create a new project, call it "Activity Lifecycle" and let the IDE decided what min version of API is the best.

If you don't remember how to do that go to the day one section and check the instructions on how to create a project in that section I explain in more detail what is everything well not everything but the necessary.

Now that you have everything setup and running let's get going.

## LogCat

In this section we are going to use LogCat but what is it... or what it does? Well LogCat is a command-line tool that dumps a log of system messages including messages that you have written from your app using the `Log` class.

This helps us to understand better our code and to other people as well. The LogCat can be found in the bottom part of the IDE and you can access to it by clicking the section that says `LogCat`, click on it please.

You filter log messages by its type, there are 6 types of log messages, ordered from lowest to highest priority:

- Verbose: Verbose

- Debug: Debug

- I: Information

- W: Warning

- E: Error

- F: Fatal

- S: Silent

To filter messages in the logcat you click inside the text bar that is up next to the icon of a lamp and perfom the following command `Ctrl+space` to check the available options the android provide us to filter messages.

If you want to learn more about what is LogCat and how it works refer to [LogCat](https://developer.android.com/studio/command-line/logcat) this tools is really important to debug code, we are going to look it up in mode depth in later sections but if you can go one step ahead that will be great.

## Creating our first log message

To add a Log message to your app you need to write it in the following way:

`Log.i("TAG", "INFORMATION TEXT")`

You need to call the Log class to add a LogCat message and then call the type of the logcat after that you pass 2 arguments always:

1. TAG: tag es an string used as identifier in the logcat so that you can see from the rest of it.

2. MESSAGE: This is the text that your logcat will display when it's triggered.

Now that we know the syntax lets add a log message to our current project, open the `MainActivity` and in the `onCreate` method after the `setContentView()` method add a log message of type "information" with a tag of "MY_TAG" and a message of "This is my first logcat message".

Open the logcat and run (emulated or physical device) the application you might see a lot of messages that look like gibberish but here comes useful that fact that we can filter the messages, to filter our message write `level:info tag:MY_TAG` here we are just getting info messages from MY_TAG.

If everything went good you should see your message right away by filtering it.

I really encourage you to read the article above about the LogCat and play with the differente types of messages and filters that you can apply.

## Activity Lifecycle

Now that we have a some understanding about LogCat we can start studying the activity lifecycle, this a really important topic because based in this the apps are displayed, run and even cause some bugs if wen don't understand how apps come to life for real come to life in the system.