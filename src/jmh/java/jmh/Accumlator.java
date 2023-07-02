package jmh;

public class Accumlator {

  public long total = 0;

  public void add(long value) {
    total += value;
  }

}
