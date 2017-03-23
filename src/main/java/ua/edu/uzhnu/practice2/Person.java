package ua.edu.uzhnu.practice2;

import com.sun.istack.internal.NotNull;

import java.util.List;
import java.util.TreeSet;

/**
 * Created by Таня on 16.03.2017.
 */
public  abstract  class Person {

    String name;
    Male father;
    Female mother;
    List <Person> children;

    public Person(String name, @NotNull Male father, @NotNull Female mother){
        if ( father == null || mother == null){
            throw new IllegalArgumentException("Повинні бути батьки");
        }
        this.name=name;
        this.father=father;
        this.mother=mother;
        father.children.add(this);
        mother.children.add(this);
    }

    public Person (String name){
        this.name = name;
        this.father = Male.DEFAULT;
        this.mother = Female.DEFAULT;
    }

    public static final Person DEFAULT = new Person() {
        @Override
        public Male getFather() {
            return Male.DEFAULT;
        }

        @Override
        public Female getMother() {
            return Female.DEFAULT;
        }

    };


    public Person() {
        this.name="Невідомий";
        this.mother=Female.DEFAULT;
        this.father=Male.DEFAULT;
    }

    public Male getFather() {
        return father;
    }

    public Female getMother() {
        return mother;
    }

    public String getName() {
        return name;
    }

    public int getChildren( Person child){
        return children.indexOf(child);
    }
}
