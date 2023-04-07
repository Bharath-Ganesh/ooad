package com.ooad.chapter05.ricksGuitarsCohesive;

public enum Style {

  A, F;

  public String toString() {
    switch(this) {
      case A:   return "A style";
      case F:   return "F style";
      default:  return "Unspecified";
    }
  }
}
