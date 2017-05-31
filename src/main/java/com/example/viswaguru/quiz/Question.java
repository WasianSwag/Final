package com.example.viswaguru.quiz;

/**
 * Created by Viswaguru on 5/18/2017.
 */
import java.util.ArrayList ;
public class Question {

    //BODY OF QUESTION
    private String text;
    //WORD AT WHICH IT IS NO LONGER POWER
    private int powerPoint;
    //ANSWER OF QUESTION
    private String answer;
    //STUFF THEYD PROMPT ON
    private String prompt;
    private double difficultyFactor;
    private boolean buzz;
    private boolean lockout;
    private boolean opponentLockout;

    public Question(String _text, String _answer, String _prompt, int _powerPoint) {
        text = _text;
        answer = _answer;
        prompt = _prompt;
        powerPoint = _powerPoint;
        buzz = false;
        lockout = false;
        opponentLockout = false;
        difficultyFactor = 0;
    }
    //FOR EASY IT SHOUDL BE 15, MEDIUM 9.8, AND HARD 7
    public void setFactor(double a) {
        difficultyFactor = a;
    }
    private ArrayList<String> toWords(String text) {
        ArrayList<String> a = new ArrayList<String>();
        String b = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i,i+1).equals(" ")){
                a.add(b);
                b = "";
            }
            else {
                b += text.substring(i,i+1);
            }
        }
        a.add(b);
        return a;
    }
    private boolean protobowlCompare(String in, String aorp) {
        boolean result = true;
        ArrayList<String> stuff = toWords(aorp);
        for (String i : stuff) {
            if (in.toLowerCase().indexOf(i.toLowerCase()) == -1) {
                result = false;
            }
        }
        return result;
    }
    public int totalLength() {
        return toWords(text).size();
    }
    public boolean check(String in) {
        if (protobowlCompare(in, answer)) {
            return true;
        }
        else if (protobowlCompare(in, prompt)) {
            //ASK USER FOR MORE INFO AND CALL IT IN2
            return check(in + in);
        }
        else {
            return false;
        }
    }
    public int qCheck(String in, int a) {
        lockout = false;
        if (check(in) && a < powerPoint) {
            opponentLockout = true;
            return 15;
        }
        else if (check(answer)) {
            opponentLockout = true;
            return 10;
        }
        else if (!check(answer) && a < totalLength()) {
            return -5;
        }
        else {
            return 0;
        }

    }
    public boolean tierneybuzz  (double a){
       double g =  Math.random()  ;
       if (g> a)
           return false ;
        else
            return true;



    }
    //checks if opponent buzzed
    private boolean opponentBuzz(int turn, double factor, int length) {
        double chance = Math.pow(((double)(turn) / (double) (length)), factor);
        if (Math.random() < chance) {
            return true;
        }
        return false;
    }
    public String getQ(){
        return this.text ;
    }
    public String getAnswer(){
        return this.answer ;
    }


    public void read2() {
        long a = 0;
        for (int i = 0; i < totalLength(); i++) {
            //SET A EQUAL TO CURRENT SYSTEM TIME IN MILLISECONDS
            while(//** CURRENT TIME IN MILLISECONDS
                    - a < 500) {
                //buzz only becomes true if they push the buzz button which changes buzz to true
                if (buzz && !lockout) {
                    //SET PLAYERS SCORE TO qCheck(input, i);
                }
            }
            if (opponentBuzz(i, difficultyFactor, totalLength()) && !opponentLockout) {
                lockout = true;
                opponentLockout = true;
                if (i < powerPoint) {
                    //ADD 15 TO OPPONENTS SCORE
                }
                else {
                    //ADD 10 TO OPPONENTS SCORE
                }
            }
        }
    }







}
