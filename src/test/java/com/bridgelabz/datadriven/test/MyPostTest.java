package com.bridgelabz.datadriven.test;

import com.bridgelabz.datadriven.base.BaseClass;
import com.bridgelabz.datadriven.pages.Login;
import com.bridgelabz.datadriven.pages.MyPost;
import com.bridgelabz.datadriven.utility.listener.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;

@Listeners(CustomListener.class)
public class MyPostTest extends BaseClass{

    @Test
    public void ToCheck_MyPost_IsWorking_OrNot() throws InterruptedException, AWTException {
        Login login = new Login (driver);
        login.login ("abc@gmail.com","JayHindJayBharat");

        MyPost myPost = new MyPost (driver);
        myPost.sharePost ();
        myPost.sharePhoto ();

        myPost.setClipboardData ("");
        myPost.likePost ();

    }
}
