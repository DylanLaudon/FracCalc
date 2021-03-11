package chapter10_worked_example_01;

public class RandomSequence implements Sequence
{
	public int next()
	{
		return (int) (Integer.MAX_VALUE * Math.random());
	}
}