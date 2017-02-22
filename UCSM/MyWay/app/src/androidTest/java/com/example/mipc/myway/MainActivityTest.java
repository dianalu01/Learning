package com.example.mipc.myway;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

/**
 * Created by Mi Pc on 12/11/2015.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity=getActivity();
    }
    @SmallTest
    public  void TextTextViewNotNull(){
       // TextView textView=(TextView)activity.findViewById(R.id.fab);
       // assertNotNull(textView);
    }
}
