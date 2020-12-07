import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  int currentIndex;
  int [] data;

  public ArraySequence (int [] other) {
    data = new int [other.length];
    for (int i = 0; i < length(); i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public int length () {
    return data.length;
  }

  public boolean hasNext () {
    return (currentIndex < length());
  }

  public int next () {
    if (hasNext()) {
      currentIndex += 1;
      return (data[currentIndex - 1]);
    }
    throw new NoSuchElementException ("no");
  }

  public void reset () {
    currentIndex = 0;
  }

  public ArraySequence (IntegerSequence otherseq) {
    data = new int [otherseq.length()];
    int counter = 0;
    while (otherseq.hasNext()) {
      data[counter] = otherseq.next();
      counter += 1;
    }
    otherseq.reset();
  }

}
