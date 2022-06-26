package edu.bu.met.cs665.gofapproach.director;

import edu.bu.met.cs665.gofapproach.builder.ModelBuilder;
import org.javatuples.Triplet;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This class represents a director in GoF's builder design pattern.
 */
public class XceptionModelDirector implements Director {
  @Override
  public void construct(ModelBuilder modelBuilder) {
    modelBuilder.setIncludeTop(Boolean.TRUE);
    modelBuilder.setWeights("imagenet");
    modelBuilder.setInputTensor(null);
    modelBuilder.setInputShape(new Triplet<>(299, 299, 3));
    modelBuilder.setPooling(null);
    modelBuilder.setClasses(1000);
    modelBuilder.setClassifierActivation("softmax");
  }

}




