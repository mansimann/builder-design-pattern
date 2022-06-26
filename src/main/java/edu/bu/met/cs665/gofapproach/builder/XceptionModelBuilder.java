package edu.bu.met.cs665.gofapproach.builder;

import edu.bu.met.cs665.gofapproach.product.Model;
import edu.bu.met.cs665.gofapproach.product.XceptionModel;
import org.javatuples.Triplet;
import org.tensorflow.Tensor;

/**
 * Name: Mansi Mann.
 * Date: 05/05/2022
 * Course: CS-665
 * Assignment: Term Project
 * Description: This class represents a concrete builder in GoF's builder design pattern.
 */
public class XceptionModelBuilder implements ModelBuilder {
  private final XceptionModel xceptionModel;

  /**
   * Sole constructor.
   */
  public XceptionModelBuilder() {
    this.xceptionModel = new XceptionModel();
  }

  @Override
  public void setIncludeTop(Boolean includeTop) {
    xceptionModel.setIncludeTop(includeTop);
  }

  @Override
  public void setWeights(String weights) {
    xceptionModel.setWeights(weights);
  }

  @Override
  public void setInputTensor(Tensor<?> inputTensor) {
    xceptionModel.setInputTensor(inputTensor);
  }

  @Override
  public void setInputShape(Triplet<Integer, Integer, Integer> inputShape) {
    xceptionModel.setInputShape(inputShape);
  }

  @Override
  public void setPooling(String pooling) {
    xceptionModel.setPooling(pooling);
  }

  @Override
  public void setClasses(int classes) {
    xceptionModel.setClasses(classes);
  }

  @Override
  public void setClassifierActivation(String classifierActivation) {
    xceptionModel.setClassifierActivation(classifierActivation);
  }

  @Override
  public Model getModel() {
    Model deepCopy = new XceptionModel();
    deepCopy.setIncludeTop(xceptionModel.getIncludeTop());
    deepCopy.setWeights(xceptionModel.getWeights());
    deepCopy.setInputTensor(xceptionModel.getInputTensor());
    deepCopy.setInputShape(xceptionModel.getInputShape());
    deepCopy.setPooling(xceptionModel.getPooling());
    deepCopy.setClasses(xceptionModel.getClasses());
    deepCopy.setClassifierActivation(xceptionModel.getClassifierActivation());
    return deepCopy;
  }

}

