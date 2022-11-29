package com.example.triviagame;

import java.util.ArrayList;

public class GameManager
{
    private int score;
    private int index;

    private ArrayList<Animal> animals;

    public GameManager() { animals = DataManager.getAnimals(); }

    public int getScore() { return score; }
    public int getCurrentAnimal() { return current().getImageRes(); }
    public String getCurrentName() { return current().getName(); }
    public String[] getCurrentAnswers() {return current().getAnswers();}
    public boolean isEndGame() {return index == animals.size(); };
    public void checkScore(String answer)
    {
        if(current().getName().equalsIgnoreCase(answer))
            score += current().getScore();
        index++;
    }

    private Animal current() { return animals.get(index); }







































}
