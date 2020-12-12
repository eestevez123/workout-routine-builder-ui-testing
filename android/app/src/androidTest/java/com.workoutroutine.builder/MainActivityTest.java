package com.workoutroutine.builder;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.SmallTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import kotlin.jvm.JvmField;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;

import java.util.concurrent.TimeUnit;


import static org.hamcrest.Matchers.allOf;



@RunWith(AndroidJUnit4.class)

@SmallTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void loginButtonThere() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10); // wait for 10 seconds to get slash screen away
        ViewInteraction loginButtonTest = onView(
                allOf(withContentDescription("LoginButton"), isDisplayed()));
        loginButtonTest.perform(click());
    }
}