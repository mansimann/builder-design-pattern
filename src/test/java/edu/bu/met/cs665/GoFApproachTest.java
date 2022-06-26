package edu.bu.met.cs665;

import edu.bu.met.cs665.gofapproach.builder.ModelBuilder;
import edu.bu.met.cs665.gofapproach.builder.XceptionModelBuilder;
import edu.bu.met.cs665.gofapproach.director.Director;
import edu.bu.met.cs665.gofapproach.director.XceptionModelDirector;
import edu.bu.met.cs665.gofapproach.product.Model;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This is a JUnit Test for the Gang of Four's builder design pattern approach.
 */
public class GoFApproachTest {

  @Test
  public void testGoFApproach() {

    // create a builder
    ModelBuilder xceptionModelBuilder = new XceptionModelBuilder();

    // create a director
    Director xceptionModelDirector = new XceptionModelDirector();

    // invoke the director's construction method and pass in the builder
    xceptionModelDirector.construct(xceptionModelBuilder);

    // get the built product from the builder
    Model xceptionModel = xceptionModelBuilder.getModel();

    /*------------------------ CHECKS ------------------------*/

    // check that includeTop is the default value: TRUE
    assertEquals(true, xceptionModel.getIncludeTop());

    // check that pooling is the default value: null
    assertNull(xceptionModel.getPooling());

    // check that classes is the default value: 1000
    assertEquals(1000, xceptionModel.getClasses());

    // check that classifierActivation is the default value: softmax
    assertEquals("softmax", xceptionModel.getClassifierActivation());

  }

}
