package ua.edu.uzhnu.practice2;

import com.sun.istack.internal.NotNull;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.TreeSet;

/**
 * Created by Таня on 16.03.2017.
 */
public class Male extends Person {

    public static final Male DEFAULT = new Male() {
        @Override
        public Male getFather() {
            return Male.DEFAULT;
        }

        @Override
        public Female getMother() {
            return Female.DEFAULT;
        }

    };


    public Male(String name, @NotNull Male father, @NotNull Female mother) {
        super(name, father, mother);
        children = new TreeSet<Person>();
    }

    public Male(String name) {
        this.name = name;
        this.father = Male.DEFAULT;
        this.mother = Female.DEFAULT;
        this.children = new TreeSet();
    }


    private Male(){
        super("Невідомий");
    }
}
