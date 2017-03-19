package ua.edu.uzhnu.practice2;

/**
 * Created by Таня on 19.03.2017.
 */
public class SampleFamilyProvider {

    Male ivan = Male.DEFAULT;
    Female marina = Female.DEFAULT;
    Female katia = new Female("Катя", ivan, marina);
    Female ira = new Female("Іра", ivan, marina);
    Male ostap = Male.DEFAULT;
    Male igor = Male.DEFAULT;
    Male vasul = new Male("Василь",igor,ira );
    Female olesia = new Female("Олеся", ostap, katia);
    Female vika = new Female("Віка", ostap, katia);
    Male yuri = new Male ("Юрій", ostap, katia);


  / public Male makeFamilyTree (){
        return yuri;
    }
}
