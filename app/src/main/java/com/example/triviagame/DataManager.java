package com.example.triviagame;

import java.util.ArrayList;

public class DataManager
{
    public static ArrayList<Animal> getAnimals()
    {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal()
                .setName("lion")
                .setScore(5)
                .setImageRes(R.drawable.lion)
                .setAnswers(new String[]{"lion", "bear", "bird", "cat"}));
        animals.add(new Animal()
                .setName("bear")
                .setScore(6)
                .setImageRes(R.drawable.bear)
                .setAnswers(new String[]{"dog", "pig", "bear", "fox"}));
        animals.add(new Animal()
                .setName("bird")
                .setScore(5)
                .setImageRes(R.drawable.bird)
                .setAnswers(new String[]{"monkey", "bear", "bird", "rabbit"}));
        animals.add(new Animal()
                .setName("cat")
                .setScore(5)
                .setImageRes(R.drawable.cat)
                .setAnswers(new String[]{"cat", "rabbit", "buffalo", "fox"}));
        animals.add(new Animal()
                .setName("cow")
                .setScore(7)
                .setImageRes(R.drawable.cow)
                .setAnswers(new String[]{"dog", "bear", "cow", "pig"}));
        animals.add(new Animal()
                .setName("dog")
                .setScore(5)
                .setImageRes(R.drawable.dog)
                .setAnswers(new String[]{"dog", "rabbit", "pig", "snake"}));
        animals.add(new Animal()
                .setName("fox")
                .setScore(5)
                .setImageRes(R.drawable.fox)
                .setAnswers(new String[]{"monkey", "bear", "snake", "fox"}));
        animals.add(new Animal()
                .setName("buffalo")
                .setScore(10)
                .setImageRes(R.drawable.buffalo)
                .setAnswers(new String[]{"snake", "bear", "buffalo", "fox"}));
        animals.add(new Animal()
                .setName("monkey")
                .setScore(5)
                .setImageRes(R.drawable.monkey)
                .setAnswers(new String[]{"dog", "monkey", "cow", "deer"}));
        animals.add(new Animal()
                .setName("pig")
                .setScore(5)
                .setImageRes(R.drawable.pig)
                .setAnswers(new String[]{"buffalo", "pig", "cow", "snake"}));
        animals.add(new Animal()
                .setName("rabbit")
                .setScore(5)
                .setImageRes(R.drawable.rabbit)
                .setAnswers(new String[]{"pig", "bear", "buffalo", "rabbit"}));
        animals.add(new Animal()
                .setName("deer")
                .setScore(5)
                .setImageRes(R.drawable.deer)
                .setAnswers(new String[]{"snake", "deer", "cow", "monkey"}));
        animals.add(new Animal()
                .setName("tiger")
                .setScore(7)
                .setImageRes(R.drawable.tiger)
                .setAnswers(new String[]{"tiger", "pig", "deer", "fox"}));
        animals.add(new Animal()
                .setName("giraffe")
                .setScore(5)
                .setImageRes(R.drawable.giraffe)
                .setAnswers(new String[]{"dog", "giraffe", "cow", "snake"}));
        animals.add(new Animal()
                .setName("snake")
                .setScore(8)
                .setImageRes(R.drawable.snake)
                .setAnswers(new String[]{"cow", "bear", "snake", "fox"}));
        return animals;
    }






























}
