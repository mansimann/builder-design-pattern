package edu.bu.met.cs665.gofapproach.product;

import org.javatuples.Triplet;
import org.tensorflow.Tensor;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This interface is implemented by a product in GoF's builder design pattern.
 */
public interface Model {

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
   * @param classes the number of classes to classify images into.
   */
  void setClasses(int classes);

  /**
   * Sets the activation function to use on the top layer.
   *
   * @param classifierActivation the activation function to use on the top layer
   */
  void setClassifierActivation(String classifierActivation);

  /**
   * Gets whether to include the fully-connected layer at the top.
   *
   * @return whether to include the fully-connected layer at the top
   */
  Boolean getIncludeTop();

  /**
   * Gets the weights: either "imagenet" or path to weights file.
   *
   * @return the weights: either "imagenet" or path to weights file
   */
  String getWeights();

  /**
   * Gets the tensor to use as image input for the model.
   *
   * @return the tensor to use as image input for the model
   */
  Tensor<?> getInputTensor();

  /**
   * Gets the input shape tuple (width, height, channels).
   *
   * @return the input shape tuple (width, height, channels)
   */
  Triplet<Integer, Integer, Integer> getInputShape();

  /**
   * Gets the pooling mode for feature extraction.
   *
   * @return the pooling mode for feature extraction
   */
  String getPooling();

  /**
   * Gets the number of classes to classify images into.
   *
   * @return the number of classes to classify images into.
   */
  int getClasses();

  /**
   * Gets the activation function to use on the top layer.
   *
   * @return the activation function to use on the top layer
   */
  String getClassifierActivation();

}
