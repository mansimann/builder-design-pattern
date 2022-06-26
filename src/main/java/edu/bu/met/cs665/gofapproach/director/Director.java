package edu.bu.met.cs665.gofapproach.director;

import edu.bu.met.cs665.gofapproach.builder.ModelBuilder;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This interface is implemented by a director in GoF's builder design pattern.
 */
public interface Director {
  /**
   * Constructs a model.
   *
   * @param modelBuilder the model builder passed in by the client.
   */
  void construct(ModelBuilder modelBuilder);
}
