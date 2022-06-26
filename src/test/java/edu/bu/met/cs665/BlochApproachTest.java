package edu.bu.met.cs665;

import edu.bu.met.cs665.blochapproach.Xception;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This is a JUnit Test for the Bloch's builder design pattern approach.
 */
public class BlochApproachTest {

  @Test
  public void testBlochApproach() {

    // create a product by calling its static nested class
    Xception xception = new Xception.Builder()
            .setIncludeTop(Boolean.FALSE)
            .setPooling("avg")
            .setClasses(50)
            .setClassifierActivation("relu")
            .build();

    /*------------------------ CHECKS ------------------------*/

    // check that includeTop is no longer the default value: TRUE
    assertEquals(false, xception.getIncludeTop());

    // check that pooling is no longer the default value: null
    assertEquals("avg", xception.getPooling());

    // check that classes is no longer the default value: 1000
    assertEquals(50, xception.getClasses());

    // check that classifierActivation is no longer the default value: softmax
    assertEquals("relu", xception.getClassifierActivation());

  }

}
