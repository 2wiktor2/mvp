package com.wiktor.demomvp;

public class Presenter {

    private MainContract.View myView;

    Presenter(MainContract.View myView) {
        this.myView = myView;
    }

    public void concatEditTexts(String s1, String s2) {
        String s3 = s1 + s2;
        myView.showInTextView(s3);

    }


}
