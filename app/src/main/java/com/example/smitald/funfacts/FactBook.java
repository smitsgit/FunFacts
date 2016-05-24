package com.example.smitald.funfacts;

import java.util.Random;

/**
 * Created by smitald on 4/27/2015.
 */
public class FactBook {
    String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."};
    public String getFact() {

        // Button was clicked , lets add new fact
        String fact = "";
        Random rand = new Random();
        int rno = rand.nextInt(mFacts.length);
        fact = mFacts[rno];
        return fact;
    }
}
