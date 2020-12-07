import java.util.NoSuchElementException;

interface IntegerSequence {
  boolean hasNext();
  int next();
  int length();
  void reset();
}

public class Range implements IntegerSequence {
  private int start, end, current;
  public Range (int start, int end) {
    if (start > end) {
      throw new IllegalArgumentException ("Start value is greater than end value!");
    }
    this.start = start;
    this.end = end;
  }

  public int length () {
    return (end - start) + 1;
  }

  public boolean hasNext () {
    return !(current + 1 == length());
  }

  public int next () {
    current += 1;
    return (current - 1);
  }

  public void reset () {
    current = 0;
  }
}
