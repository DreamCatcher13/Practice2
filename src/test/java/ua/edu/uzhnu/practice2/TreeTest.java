package ua.edu.uzhnu.practice2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Таня on 19.03.2017.
 */
public class TreeTest {

    @Test
    public void test_SanityTest_JUnitWorks(){
        Assert.assertEquals(2, 1+1);
    }

    @Test
    public void test_Person (){
        Assert.assertEquals ("Юрій", new SampleFamilyProvider().makeFamilyTree().getName());
    }

    @Test
    public void test_Father(){
        Assert.assertEquals ("Остап",new SampleFamilyProvider().makeFamilyTree().getFather().getName());
    }

    @Test
    public void test_FirstGrandFather (){
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getName());
    }

    @Test
    public void tesr_FirstGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getName());
    }

    @Test
    public void tesr_FirstGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getFather().getName());
    }

    @Test
    public void tesr_FirstGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getMother().getName());
    }

    @Test
    public void tesr_SecondGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getFather().getName());
    }

    @Test
    public void tesr_SecondGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getMother().getName());
    }

    @Test
    public void tesr_Mother () {
        Assert.assertEquals("Катя", new SampleFamilyProvider().makeFamilyTree().getMother().getName());
    }

    @Test
    public void tesr_SecondGrandMother () {
        Assert.assertEquals("Марина", new SampleFamilyProvider().makeFamilyTree().getMother(). getMother().getName());
    }

    @Test
    public void tesr_SecondGrandFather () {
        Assert.assertEquals("Іван", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getName());
    }

    @Test
    public void tesr_ThirdGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getMother().getMother().getMother().getName());
    }

    @Test
    public void tesr_ThirdGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getMother().getMother().getFather().getName());
    }

    @Test
    public void tesr_FourthGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getMother().getName());
    }

    @Test
    public void tesr_FourthGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getFather().getName());
    }


}
