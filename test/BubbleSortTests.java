

public class BubbleSortTests extends SortTests {

	public BubbleSortTests(int[] input, int[] expectedOutput) {
		super(input, expectedOutput);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Sort createSort() {
		// TODO Auto-generated method stub
		return new BubbleSort();
	}


}
