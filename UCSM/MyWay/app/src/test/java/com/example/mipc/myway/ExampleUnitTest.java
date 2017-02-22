package com.example.mipc.myway;

import com.example.mipc.myway.Core.Constracts.Repository;
import com.example.mipc.myway.Core.Fakes.RepositoryExpresionFake;
import com.example.mipc.myway.Core.Models.ExpresionModel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 1);
    }

    @Test
    public void scoreExpresion_isCorrect() throws Exception {
        //arrange
        Repository<ExpresionModel> repositoryFake=new RepositoryExpresionFake();

        ExpresionModel expresionExpected=new ExpresionModel("E01","Gracias","T02");
        ExpresionModel expresionReality;
        //act
        expresionReality=repositoryFake.getByID("E01");

        //assert
        assertEquals(expresionExpected,expresionExpected);
    }
}