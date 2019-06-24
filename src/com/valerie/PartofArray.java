package com.valerie;

import static com.valerie.Main.result;
import static com.valerie.Main.words;

public class PartofArray {
    public static PartofArray getLesson;
    public String lessonText;
    public PartofArray(String lessonText){
        this.lessonText = words[result];
    }
    public String getLesson(){
    return this.lessonText;

    }
}

class MakingLesson extends PartofArray {
    public MakingLesson() {
        super(words[result]);

    }
}

//public static MakingLesson PrintLesson(){
//
//    cupLesson
//}


//    public AboutText(String Biography2) {
//        super(Biography2);
//    }
//
//    @Override
//    public String biography(){//constructor
//        return "Valerie Loveland is a Computer Science student and tarot card enthusiast. This is her first tarot app. ";
//    }
//
//
//    public static class Biography2 extends AboutText {
//        public Biography2(){
//            super("\"Valerie Loveland is a Computer Science student and tarot card enthusiast. This is her first tarot app. \"");
//        }
//    }