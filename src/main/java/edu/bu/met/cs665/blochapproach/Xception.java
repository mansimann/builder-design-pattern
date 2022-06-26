package edu.bu.met.cs665.blochapproach;

import java.nio.ByteBuffer;
import org.javatuples.Triplet;
import org.tensorflow.Tensor;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This class represents a product in Bloch's builder design pattern.
 * Xception is a deep learning neural network model.
 */
public class Xception {

  // optional fields
  private final Boolean includeTop;
  private final String weights;
  private final Tensor<?> inputTensor;
  private final Triplet<Integer, Integer, Integer> inputShape;
  private final String pooling;
  private final int classes;
  private final String classifierActivation;

  /**
   * Class constructor specifying the Builder used to initialize object.
   *
   * @param builder builder used to initialize object
   */
  private Xception(Builder builder) {
    this.includeTop = builder.includeTop;
    this.weights = builder.weights;
    this.inputTensor = builder.inputTensor;
    this.inputShape = builder.inputShape;
    this.pooling = builder.pooling;
    this.classes = builder.classes;
    this.classifierActivation = builder.classifierActivation;
  }

  /**
   * Gets whether to include the fully-connected layer at the top.
   *
   * @return whether to include the fully-connected layer at the top
   */
  public Boolean getIncludeTop() {
    return includeTop;
  }

  /**
   * Gets the weights: either "imagenet" or path to weights file.
   *
   * @return the weights: either "imagenet" or path to weights file
   */
  public String getWeights() {
    return weights;
  }

  /**
   * Gets the tensor to use as image input for the model.
   *
   * @return the tensor to use as image input for the model
   */
  public Tensor<?> getInputTensor() {
    if (inputTensor != null) {
      return Tensor.create(inputTensor.getClass(), inputTensor.shape(),
              ByteBuffer.wrap(inputTensor.bytesValue()));
    }
    return null;
  }

  /**
   * Gets the input shape tuple (width, height, channels).
   *
   * @return the input shape tuple (width, height, channels)
   */
  public Triplet<Integer, Integer, Integer> getInputShape() {
    return new Triplet<>(inputShape.getValue0(), inputShape.getValue1(), inputShape.getValue2());
  }

  /**
   * Gets the pooling mode for feature extraction.
   *
   * @return the pooling mode for feature extraction
   */
  public String getPooling() {
    return pooling;
  }

  /**
   * Gets the number of classes to classify images into.
   *
   * @return the number of classes to classify images into
   */
  public int getClasses() {
    return classes;
  }

  /**
   * Gets the activation function to use on the top layer.
   *
   * @return the activation function to use on the top layer
   */
  public String getClassifierActivation() {
    return classifierActivation;
  }

  /**
   * Gets the string representation of Xception object.
   *
   * @return the string representation of Xception object.
   */
  @Override
  public String toString() {
    return ("\n------------ Model Description ------------"
            + "\ninclude top: " + includeTop
            + "\nweights: " + weights
            + "\ninput tensor: " + inputTensor
            + "\ninput shape: " + inputShape
            + "\npooling: " + pooling
            + "\nclasses: " + classes
            + "\nclassifier activation: " + classifierActivation);
  }

  /**
   * Name: Mansi Mann.
   * Date: 05/05/2022
   * Course: CS-665
   * Assignment: Term Project
   * Description: This class represents a concrete builder in Bloch's builder design pattern.
   */
  public static class Builder {

    // optional fields
    private Boolean includeTop = Boolean.TRUE;
    private String weights = "imagenet";
    private Tensor<?> inputTensor = null;
    private Triplet<Integer, Integer, Integer> inputShape = new Triplet<>(299, 299, 3);
    private String pooling = null;
    private int classes = 1000;
    private String classifierActivation = "softmax";

    /**
     * Sets whether to include the fully-connected layer at the top.
     *
     * @param includeTop whether to include the fully-connected layer at the top
     * @return the current Builder instance
     */
    public Builder setIncludeTop(Boolean includeTop) {
      this.includeTop = includeTop;
      return this;
    }

    /**
     * Sets the weights: either "imagenet" or path to weights file.
     *
     * @param weights the weights: either "imagenet" or path to weights file
     * @return the current Builder instance
     */
    public Builder setWeights(String weights) {
      this.weights = weights;
      return this;
    }

    /**
     * Sets the tensor to use as image input for the model.
     *
     * @param inputTensor the tensor to use as image input for the model
     * @return the current Builder instance
     */
    public Builder setInputTensor(Tensor<?> inputTensor) {
      if (inputTensor != null) {
        this.inputTensor = Tensor.create(inputTensor.getClass(), inputTensor.shape(),
                ByteBuffer.wrap(inputTensor.bytesValue()));
      }
      return this;
    }

    /**
     * Sets the input shape tuple (width, height, channels).
     *
     * @param inputShape the input shape tuple (width, height, channels)
     * @return the current Builder instance
     */
    public Builder setInputShape(Triplet<Integer, Integer, Integer> inputShape) {
      this.inputShape = new Triplet<>(inputShape.getValue0(), inputShape.getValue1(),
              inputShape.getValue2());
      return this;
    }

    /**
     * Sets the pooling mode for feature extraction.
     *
     * @param pooling the pooling mode for feature extraction
     * @return the current Builder instance
     */
    public Builder setPooling(String pooling) {
      this.pooling = pooling;
      return this;
    }

    /**
     * Sets the number of classes to classify images into.
     *
     * @param classes the number of classes to classify images into
     * @return the current Builder instance
     */
    public Builder setClasses(int classes) {
      this.classes = classes;
      return this;
    }

    /**
     * Sets the activation function to use on the top layer.
     *
     * @param classifierActivation the activation function to use on the top layer
     * @return the current Builder instance
     */
    public Builder setClassifierActivation(String classifierActivation) {
      this.classifierActivation = classifierActivation;
      return this;
    }

    /**
     * Builds the Xception model instance.
     *
     * @return the Xception model instance
     */
    public Xception build() {
      return new Xception(this);
    }

  }

}
