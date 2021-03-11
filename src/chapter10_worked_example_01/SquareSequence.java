package chapter10_worked_example_01;

public class SquareSequence implements Sequence
{
	private int n;

	public int next()
	{
		n++;
		return n * n; 
	}
}