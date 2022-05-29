package com.viewmodel.ViewModel;
import java.util.Random;

public class MainActivityViewModel   {
    private String randomNumber;

    public String getMyrandomNumber(){

        if (randomNumber==null){
            createRandomNumber();
        }
        return randomNumber;
    }

    private void createRandomNumber() {
        Random random=new Random();
        randomNumber= "Random Number : "+(random.nextInt((10-1))+1);
    }

}
