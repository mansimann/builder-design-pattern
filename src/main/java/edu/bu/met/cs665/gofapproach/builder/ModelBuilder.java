package edu.bu.met.cs665.gofapproach.builder;

import edu.bu.met.cs665.gofapproach.product.Model;
import org.javatuples.Triplet;
import org.tensorflow.Tensor;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This interface represents a builder in GoF's builder design pattern.
 */
public interface ModelBuilder {
  /**
   * Sets whether to include the fully-connected layer at the top.
   *
   * @param includeTop whether to include the fully-connected layer at the top
   */
  void setIncludeTop(Boolean includeTop);

  /**
   * Sets the weights: either "imagenet" or path to weights file.
   *
   * @param weights the weights: either "imagenet" or path to weights file
   */
  void setWeights(String weights);

  /**
   * Sets the tensor to use as image input for the model.
   *
   * @param inputTensor the tensor to use as image input for the model
   */
  void setInputTensor(Tensor<?> inputTensor);

  /**
   * Sets the input shape tuple (width, height, channels).
   *
   * @param inputShape the input shape tuple (width, height, channels)
   */
  void setInputShape(Triplet<Integer, Integer, Integer> inputShape);

  /**
   * Sets the pooling mode for feature extraction.
   *
   * @param pooling the pooling mode for feature extraction
   */
  void setPooling(String pooling);

  /**
   * Sets the number of classes to classify images into.
   *
   * @param classes the number of classes to classify images into
   */
  void setClasses(int classes);

  /**
   * Sets the activation function to use on the top layer.
   *
   * @param classifierActivation the activation function to use on the top layer
   */
  void setClassifierActivation(String classifierActivation);

  /**
   * Gets the built XceptionModel object.
   *
   * @return the built XceptionModel object
   */
  Model getModel();

}
