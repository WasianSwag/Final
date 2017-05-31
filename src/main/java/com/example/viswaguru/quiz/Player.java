package com.example.viswaguru.quiz;

/**
 * Created by Viswaguru on 5/18/2017.
 */
import java.util.* ;

public class Player {
    private double antigon ;
    public Player (double j ){
      antigon = j ;
            }
    public void setFactor(double a){
        antigon = a ;
    }
    public double getFactor(){
        return this.antigon ;
    }
}
