

public class InsertionSortTests extends SortTests {

	public InsertionSortTests(int[] input, int[] expectedOutput) {
		super(input, expectedOutput);
	}

	@Override
	protected Sort createSort() {
		return new InsertionSort();
	}


}
