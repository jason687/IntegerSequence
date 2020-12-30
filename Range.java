import java.util.NoSuchElementException;

public class Range implements IntegerSequence {
  private int start, end, current;

  public Range (int start, int end) {
    if (start > end) {
      throw new IllegalArgumentException ("Start value is greater than end value!");
    }
    this.start = start;
    this.end = end;
    current = this.start;
  }

  public int length () {
    return (end - start) + 1;
  }

  public boolean hasNext () {
    return (current - start < length ());
  }

  public int next () {
    if (hasNext()) {
      current += 1;
      return (current - 1);
    }
    throw new NoSuchElementException ("no");
  }

  public void reset () {
    current = start;
  }
}
