package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatricesTest {


  private static final int[][] InputA = {{-1}};
  private static final int[][] InputB = {{1,2},{4,3}};
  private static final int[][] InputC = {{2,4,6},{8,10,12},{14,16,18}};
  private static final int[][] ExpectedA = {{-1}};
  private static final int[][] ExpectedB = {{4,1},{3,2}};
  private static final int[][] ExpectedC = {{14,8,2},{16,10,4},{18,12,6}};

  @Test
  void rotate() {

    assertArrayEquals(ExpectedA, Matrices.rotate(InputA));
    assertArrayEquals(ExpectedB, Matrices.rotate(InputB));
    assertArrayEquals(ExpectedC, Matrices.rotate(InputC));

  }
}