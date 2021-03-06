package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet underTest = new Organic("Noodles");
    }

    @Test
    public void shouldBeAbleToNamePet() {
        VirtualPet underTest = new Organic("Noodles");
        String expected = underTest.getName();
        assertEquals(expected, "Noodles");
    }


    @Test
    //write code to play with pet to lessen boredom level
    public void shouldHaveBoredom() {
        VirtualPet underTest = new Organic("Noodles");
        int boredom = underTest.getBoredom();
        assertEquals(20, boredom);
    }


    @Test
    //write code to clean cage and raise filth level
    public void cageShouldBeClean() {
        VirtualPet underTest = new Organic("Noodles");
        int cageCleanliness = underTest.getCageCleanliness();
        assertEquals(20, cageCleanliness);
    }

    @Test
    public void petCleanliness() {
        VirtualPet underTest = new Organic("Noodles");
        int filth = underTest.getFilth();
        assertEquals(20, filth);
    }

    @Test
    public void shouldHaveType() {
        VirtualPet underTest = new Organic("Noodles");
        assertTrue(underTest instanceof VirtualPet);
        assertTrue(underTest instanceof Organic);
    }



}



