

public class BubbleSortTests extends SortTests {

	public BubbleSortTests(int[] input, int[] expectedOutput) {
		super(input, expectedOutput);
	}

	@Override
	protected Sort createSort() {
		return new BubbleSort();
	}


}
