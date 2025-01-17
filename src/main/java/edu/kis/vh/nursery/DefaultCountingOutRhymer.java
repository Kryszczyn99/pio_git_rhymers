package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int FULLSIZE = 11;
	private final int ENDVALUE = 12;
	private int[] numbers = new int[ENDVALUE];
	private int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public int getTotal() { return total; }
	public boolean callCheck() { return total == -1; }

	public boolean isFull() {
				return total == FULLSIZE;
			}

	protected int getLast()
	{
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut()
	{
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
