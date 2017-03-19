package ua.edu.uzhnu.practice2;

/**
 * Created by Таня on 19.03.2017.
 */
public class SampleFamilyProvider {

    Male ivan = new Male ("Іван");
    Female marina = new Female("Марина") ;
    Female katia = new Female("Катя", ivan, marina);
    Female ira = new Female("Іра", ivan, marina);
    Male ostap = new Male("Остап");
    Male igor = new Male ("Ігор");
    Male vasul = new Male("Василь",igor,ira );
    Female olesia = new Female("Олеся", ostap, katia);
    Female vika = new Female("Віка", ostap, katia);
    Male yuri = new Male ("Юрій", ostap, katia);


   public Male makeFamilyTree (){
        return yuri;
    }
}
