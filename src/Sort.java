public abstract class Sort {

	public Sort() {
		super();
	}

	public abstract int[] sortAsc(int[] input);

	protected void swap(int[] input, int index1, int index2) {
		int first = input[index1];
		int second = input[index2];
		input[index1] = second;
		input[index2] = first;
	}

}