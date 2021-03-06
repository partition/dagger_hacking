package com.github.partition.common;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SingletonGreeter implements Greeter {

  @Inject
  public SingletonGreeter() {
  }

  @Override
  public String greet(String name) {
    return "Hi, i'm Singleton. Nice to meet you " + name;
  }
}
