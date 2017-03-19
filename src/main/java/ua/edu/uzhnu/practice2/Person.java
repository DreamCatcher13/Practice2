package ua.edu.uzhnu.practice2;

import com.sun.istack.internal.NotNull;

/**
 * Created by Таня on 16.03.2017.
 */
public  abstract  class Person {

    private String name;
    Male father;
    Female mother;

    public Person(String name, @NotNull Male father, @NotNull Female mother){
        if ( father == null || mother == null){
            throw new IllegalArgumentException("hjhj");
        }
        this.name=name;
        this.father=father;
        this.mother=mother;
    }

    protected Person(String name) {
        this.name = name;
    }

    public Male getFather() {
        return father;
    }

    public Female getMother() {
        return mother;
    }
}
