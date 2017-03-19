package ua.edu.uzhnu.practice2;

/**
 * Created by Таня on 16.03.2017.
 */
public class Female extends Person {

    public static final Female DEFAULT = new Female();

    public Female(String name, @NotNull Male father, @NotNull Female mother) {
        super(name, father, mother);
    }

    private Female(){
        super("Невідомий");
        this.mother=Female.DEFAULT;
        this.father=Male.DEFAULT
    }
}
