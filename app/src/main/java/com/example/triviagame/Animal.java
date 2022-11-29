package com.example.triviagame;

public class Animal
{
    private String name;
    private int imageRes;
    private int score;
    private String[] answers;

    public Animal() {}
    public Animal(int score) { this.score = score; }

    public Animal setImageRes(int imageRes) {this.imageRes = imageRes; return this;}
    public Animal setName(String name) { this.name =name; return this;}
    public Animal setScore(int score) { this.score =score; return this;}
    public Animal setAnswers(String[] answers){ this.answers = answers; return this; }
    public String getName() { return name; }
    public int getImageRes() { return imageRes; }
    public int getScore() { return score; }
    public String[] getAnswers() {return answers;}
}
