import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public abstract class SortTests {
	
	private int[] input;
	private int[] expectedOutput;
	
	public SortTests(int[] input, int[] expectedOutput){
		this.input = input;
		this.expectedOutput = expectedOutput;
		
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{1}, new int[]{1}},
				{new int[]{2,1}, new int[]{1,2}},
				{new int[]{3,2,1}, new int[]{1,2,3}},
				{new int[]{2,3,1}, new int[]{1,2,3}},
				{new int[]{5,2,3,4,1}, new int[]{1,2,3,4,5}},
				{new int[]{2,1,2,3}, new int[]{1,2,2,3}}
		});
	}

	@Test
	public void arrayIsSortedInAscendingOrder() {
		int[] output = createSort().sortAsc(input);
		assertThat(output, is(equalTo(expectedOutput)));
	}

	protected abstract Sort createSort();
	
}
