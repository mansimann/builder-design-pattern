package edu.bu.met.cs665.gofapproach.product;

import java.nio.ByteBuffer;
import org.javatuples.Triplet;
import org.tensorflow.Tensor;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This class represents a product in GoF's builder design pattern.
 */
public class XceptionModel implements Model {
  private Boolean includeTop;
  private String weights;
  private Tensor<?> inputTensor;
  private Triplet<Integer, Integer, Integer> inputShape;
  private String pooling;
  private int classes;
  private String classifierActivation;

  @Override
  public void setIncludeTop(Boolean includeTop) {
    this.includeTop = includeTop;
  }

  @Override
  public void setWeights(String weights) {
    this.weights = weights;
  }

  @Override
  public void setInputTensor(Tensor<?> inputTensor) {
    if (inputTensor != null) {
      this.inputTensor = Tensor.create(inputTensor.getClass(),
              inputTensor.shape(),
              ByteBuffer.wrap(inputTensor.bytesValue()));
    }
  }

  @Override
  public void setInputShape(Triplet<Integer, Integer, Integer> inputShape) {
    this.inputShape = new Triplet<>(inputShape.getValue0(), inputShape.getValue1(),
            inputShape.getValue2());
  }

  @Override
  public void setPooling(String pooling) {
    this.pooling = pooling;
  }

  @Override
  public void setClasses(int classes) {
    this.classes = classes;
  }

  @Override
  public void setClassifierActivation(String classifierActivation) {
    this.classifierActivation = classifierActivation;
  }

  @Override
  public Boolean getIncludeTop() {
    return includeTop;
  }

  @Override
  public String getWeights() {
    return weights;
  }

  @Override
  public Tensor<?> getInputTensor() {
    if (inputTensor != null) {
      return Tensor.create(inputTensor.getClass(), inputTensor.shape(),
              ByteBuffer.wrap(inputTensor.bytesValue()));
    }
    return null;
  }

  @Override
  public Triplet<Integer, Integer, Integer> getInputShape() {
    if (inputShape != null) {
      return new Triplet<>(inputShape.getValue0(), inputShape.getValue1(), inputShape.getValue2());
    }
    return null;
  }

  @Override
  public String getPooling() {
    return pooling;
  }

  @Override
  public int getClasses() {
    return classes;
  }

  @Override
  public String getClassifierActivation() {
    return classifierActivation;
  }

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

}
