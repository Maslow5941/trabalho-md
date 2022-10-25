package sort;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortingAlgorithmsTest {
	
	  @Test
	  public void testInsertionSort() {
	    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
	    InsertionSort.insertionSort(data);
	    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
	  }

	  
	  @Test
	  public void testMergeSort() {
	    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
	    MergeSort.mergeSort(data);
	    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
	  }
}
