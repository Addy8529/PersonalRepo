package Blatt9;

import java.util.Objects;

//Gruppenarbeit von Muhammad Ahad (Gr.5), Gurpreet Singh Chandi(Gr.4) und Shashank Shorya(Gr.5)

public class Food {
    //---------------------------------------------------------------//
    // TODO: attributes and constructor
    public String Name;
    String Category;

    public Food(String name, String category) {
        Name = name;
        Category = category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Category);
    }

    @Override
    public String toString() {
        return "Food{" + "Name='" + Name + '\'' + ", Category='" + Category + '\'' + '}';
    }
}