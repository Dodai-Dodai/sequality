package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  private final Calculate calculator = new Calculate();

  // sum

  @Test
  public void sum_shouldAddTwoPositives() {
    // 2 + 3 = 5
    assertEquals(5, calculator.sum(2, 3));
  }

  // average

  @Test
  public void average_shouldComputeDoubleAverage() {
    // 通常ケース
    assertEquals(2.5, calculator.average(2, 3), 0.001);
  }

  // sumOdd

  @Test
  public void sumOdd_shouldReturnSumOfOddNumbersInRange() {
    // 1,3,5 が足される（true 分岐）
    assertEquals(9, calculator.sumOdd(1, 5));
  }

  @Test
  public void sumOdd_shouldReturnZeroWhenNoOddNumbers() {
    // 偶数のみで if が一度も true にならない（false 分岐）
    assertEquals(0, calculator.sumOdd(2, 2));
  }

  // sumEven

  @Test
  public void sumEven_shouldReturnSumOfEvenNumbersInRange() {
    // 2,4,6 が足される（true 分岐）
    assertEquals(12, calculator.sumEven(1, 6));
  }

  @Test
  public void sumEven_shouldReturnZeroWhenNoEvenNumbers() {
    // 奇数のみで if が一度も true にならない（false 分岐）
    assertEquals(0, calculator.sumEven(1, 1));
  }
}
