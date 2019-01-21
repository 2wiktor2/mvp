package com.wiktor.demomvp;

public class Info {

/*

1 Создать интерфейс interface MainContract
2 прописать в интерфейсе методы для view (Main Activity) showInTextView
3 Создать презентер  class Presenter
4 получить экземпляр класса в презентере private MainContract.View myView;
5 создать конструктор презентера и передать в него myView в качестве параметра Presenter (MainContract.View myView){}
6 создать экземпляр класса Presenter в MainActivity используя конструктор из п.5  Presenter presenter = new Presenter(this);
  ( экземпляр класса Presenter будет видеть только методы из интерфейса MainContract.View)
7 переопределить метод showInTextView ,
        textView.setText(s) - в  textView будет вставляться какая-то строка s
8 создаем метод concatEditTexts в презентере который буде принимать две строки из EditText
    в MainActivity (String s1, String s2).
9 объявляем String  которая конкатинирует две строки из EditText.
10 В методе concatEditTexts обращается к myView и вызываем метод showInTextView myView.showInTextView() и
        передаем в качестве параметра String s3   (  myView.showInTextView(s3);  )
11 В  onClick в MainActivity получаем строки из editText1 и editText2:
              String stringA = editText1.getText().toString();
              String stringB = editText1.getText().toString();
12 Там же, в  onClick, обращаемся к презенттеру, вызываем его метод concatEditTexts
 и передаем туда stringA и stringB






            */

}
