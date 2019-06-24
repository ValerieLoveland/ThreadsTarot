package com.valerie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.valerie.LessonOfTheDay.randoNum;

public class Main {
    public static String[] words = new String[100];
    public static String lessonText;
    public static int result;

    public static void main(String[] args) {
       //randNum();

        Scanner s = null;
        try {
            s = new Scanner(new File("cards.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < 78; i++) {
            s.nextLine();
            //System.out.println(i);
            //System.out.println(s.nextLine());
            String cardLessonText = s.nextLine();
            words[i] = cardLessonText;
            //System.out.println(words[i]);

        }

        LessonOfTheDay lesson = new LessonOfTheDay();
        LessonOfTheDayThread court = new LessonOfTheDayThread(lesson);
        court.setName("Court "+ words[result]);
        LessonOfTheDayThread cups = new LessonOfTheDayThread(lesson);
        cups.setName("Cups "+ words[result]);
        LessonOfTheDayThread swords = new LessonOfTheDayThread(lesson);
        swords.setName("Swords "+ words[result]);
        LessonOfTheDayThread pentacles = new LessonOfTheDayThread(lesson);
        pentacles.setName("Pentacles "+ words[result]);
        LessonOfTheDayThread wands = new LessonOfTheDayThread(lesson);
        wands.setName("Wands "+ words[result]);
        //wands.setLesson

        court.start();
        cups.start();
        swords.start();
        pentacles.start();
        wands.start();



    }
}

class LessonOfTheDay {
    private static String kindOfCard;
    public int result;

    // private int i;
    public PartofArray doLessonOfTheDay(String lessonText) {
        switch (Thread.currentThread().getName()) {
            case "Court":
kindOfCard="court";
                result = (int) Math.floor((Math.random() * ((35 - 0) + 1)) + 0);
                System.out.println();
                break;
            case "Cups":
                kindOfCard="cups";

                break;
            case "Swords":
                kindOfCard="swords";

                randoNum();
                break;
            case "Pentacles":
                kindOfCard="pentacles";
                break;
            case "Wands":
                kindOfCard="wands";
                break;
            default:

        }

            System.out.println("Lesson of the day for "+Thread.currentThread().getName() );

        return null;
    }

    public static int randoNum() {
        //return 0;


        int result = 0;
        if (kindOfCard == "court") {
            result = (int) Math.floor((Math.random() * ((35 - 0) + 1)) + 0);
            //new ShowCardImage.start();
        } else if (kindOfCard == "cups") {
            result = (int) Math.floor((Math.random() * ((49 - 36) + 1)) + 36);
        } else if (kindOfCard == "swords") {
            result =  (int) Math.floor((Math.random() * ((63 - 50) + 1)) + 50);
        } else if (kindOfCard == "pentacles") {
            result = (int) Math.floor((Math.random() * ((77 - 64) + 1)) + 64);
        } else if (kindOfCard == "wands") {
            result = (int) Math.floor((Math.random() * ((49 - 36) + 1)) + 36);

        }

        return result;
    }

}

class LessonOfTheDayThread extends Thread {
    private LessonOfTheDay threadLessonOfTheDay;


    public LessonOfTheDayThread(LessonOfTheDay lesson) {
        threadLessonOfTheDay = lesson;
    }

    public void run() {
        threadLessonOfTheDay.doLessonOfTheDay("");
    }

}