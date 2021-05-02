import java.util.ArrayList;
import java.util.List;

/**
 * Applications that use large part of the heap to increase garbage collection activity.
 */
public class GcHogger {

  /**
   * Create a number of "Number" objects, and adds a 1/5 to a list. The recently created objects
   * will be located in the young generation and the ones added to the list will eventually be moved
   * to the old generation. For more information about the heap read memory.md.
   *
   * @param maxIterations The number of objects to create.
   */
  public static void run(long maxIterations) {
    List<Number> someNums = new ArrayList<>();
    for (long i = 0; i < maxIterations; i++) {
      //noinspection UnnecessaryBoxing
      Long value = Long.valueOf(i);
      String hex = Long.toHexString(i);
      String binary = Long.toBinaryString(i);
      Number num = new Number(value, hex, binary);
      if (i % 5 == 0) {
        someNums.add(num);
      }
    }
  }

  /**
   * Create 300 000 000 Number objects.
   *
   * @param args The arguments provided to the application.
   */
  public static void main(String[] args) {
    long maxForLoop = 300_000_000;
    run(maxForLoop);
  }

  /**
   * Number object. Used for populating the heap.
   */
  private static class Number {

    /**
     * Decimal value.
     */
    Long valueNumeric;

    /**
     * Hexadecimal value.
     */
    String valueHex;

    /**
     * Binary value.
     */
    String valueBinary;

    /**
     * Constructor for Number object.
     *
     * @param numericValue The value in decimal.
     * @param valueHex     The value in hexadecimal.
     * @param valueBinary  The value in binary.
     */
    public Number(long numericValue, String valueHex, String valueBinary) {
      this.valueNumeric = numericValue;
      this.valueHex = valueHex;
      this.valueBinary = valueBinary;
    }
  }
}
