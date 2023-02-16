package org.telran.lessons.com;

public class Anime {
    private String name;
    private int age;
    private String genre;
    private String author;
    private double grade;

    public Anime(String name, int age, String genre, String author){
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.author = author;
    }


    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", grade=" + grade +
                '}';
    }
}
