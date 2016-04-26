package org.academia.bootcamp.userInput;

import org.academia.bootcamp.Game.Answer;

/**
 * Created by dora on 24-04-2016.
 */
public class AnswerInput {


    /**
     * Each answer has 5 lines. The user needs to add input as strings to update the answers.
     * To add a new answer, the user needs to add a question as well.
     * Adding a new answer is easy, copy-paste a block of code with static final strings like these above.
     * Then add them to the array of strings with lines at Answer Class.
     */

    //Answer 1 Lines:
    public static final String A1LINE1 = "Visibility.";
    public static final String A1LINE2 = "Atomicity.";
    public static final String A1LINE3 = "Ordering.";
    public static final String A1LINE4 = "";
    public static final String A1LINE5 = "";


    //Answer 2 Lines:
    public static final String A2LINE1 = "Visibility. In multi-threading programming, it is possible that in if " +
            "one thread updates a value, another";
    public static final String A2LINE2 = " thread doesn't see the update when it need, or doesn't see it at all.";
    public static final String A2LINE3 = "";
    public static final String A2LINE4 = "Remember the glass of water example... sort of...";
    public static final String A2LINE5 = "";

    //Answer 3 Lines:
    public static final String A3LINE1 = "Atomicity. An operation, or a set of operations, is atomic if it appears" +
            " to the rest of the system to occur";
    public static final String A3LINE2 = "instantaneously. If an operation is non-atomic, it can cause " +
            "sporadic and extraneous behaviour,";
    public static final String A3LINE3 = "which by nature will be hard to reproduce, understand and debug.";
    public static final String A3LINE4 = "";
    public static final String A3LINE5 = "";

    //Answer 4 Lines:
    public static final String A4LINE1 = "Ordering. Java Compiler can change the order of execution if it" +
            " believes that the outcome will not";
    public static final String A4LINE2 = "change, which may mess up your code if you're multi-threading-the" +
            "-shit-out-of-it";
    public static final String A4LINE3 = "";
    public static final String A4LINE4 = "";
    public static final String A4LINE5 = "";

    //Answer 5 Lines:
    public static final String A5LINE1 = "Locks. By using locks, you are blocking the access to a specific " +
            "part of your code to the other threads";
    public static final String A5LINE2 = "while one of the threads is running through it... the bathroom " +
            "example is a perfect fit. If someone";
    public static final String A5LINE3 = "is using the toilet, one simple does not enter the bathroom. Wait" +
            " until the other person is finished";
    public static final String A5LINE4 = "Let it breath for some seconds (minutes if it was a vegan) and then" +
            "go for it. The same thing occurs with";
    public static final String A5LINE5 = "Multi-threading. Without the smelly feeling, hopefully.";

    //Answer 6 Lines:
    public static final String A6LINE1 = "Add 'synchronized' to the method and don't forget to 'notifyAll' " +
            "when exiting the code.";
    public static final String A6LINE2 = "";
    public static final String A6LINE3 = "";
    public static final String A6LINE4 = "";
    public static final String A6LINE5 = "";

}
