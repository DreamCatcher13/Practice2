package ua.edu.uzhnu.practice2;

import com.sun.istack.internal.NotNull;

import java.util.TreeSet;

/**
 * Created by Таня on 16.03.2017.
 */
public class Female extends Person {

    public static final Female DEFAULT = new Female() {
        @Override
        public Male getFather() {
            return Male.DEFAULT;
        }

        @Override
        public Female getMother() {
            return Female.DEFAULT;
        }

    };

    public Female(String name, @NotNull Male father, @NotNull Female mother) {
        super(name, father, mother);
    }

    public Female(String name) {
        this.name = name;
        this.father = Male.DEFAULT;
        this.mother = Female.DEFAULT;
        father.children.add(this);
        mother.children.add(this);
    }

    private Female(){
        super("Невідома");
    }
}
