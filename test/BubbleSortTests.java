

public class BubbleSortTests extends SortTests {

<<<<<<< HEAD
=======
	public BubbleSortTests(int[] input, int[] expectedOutput) {
		super(input, expectedOutput);
	}

>>>>>>> origin/master
	@Override
	protected Sort createSort() {
		return new BubbleSort();
	}


}
