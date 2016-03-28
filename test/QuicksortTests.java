import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class QuicksortTests extends SortTests{
	
	@Test
	@junitparams.Parameters(method="partitionData")
	public void partitionPutsElementsInCorrectHalfOfArray(int[] array, int[] expectedOutput) throws Exception {
		new Quicksort().partition(array, 0, array.length - 1);
		assertThat(array, is(expectedOutput));
	}
	
	private Object[] partitionData(){
		return new Object[][]{
				{new int[]{1}, new int[]{1}},
				{new int[]{3,2,1}, new int[]{1,2,3}},
				{new int[]{1,2,3}, new int[]{1,2,3}},
				{new int[]{5,4,3,2,1}, new int[]{1,2,3,4,5}},
				{new int[]{7,1,5,2,8}, new int[]{2,1,5,7,8}}
		};		
	}

	@Override
	protected Sort createSort() {
		return new Quicksort();
	}

}
