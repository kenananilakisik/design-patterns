package question1b;

public class BitVectorIterator implements Iterator<Integer> {
	
	public BitVectorIterator(BitVector b)
	{
		this.b = b;
		bitPos = 0;
		pos = 0;
	}
	
	@Override
	public boolean hasAnotherElement()
	{
		if (pos == b.size())
		{
			return false;
		}
		else
			return true;
	}
	
	@Override
	public Integer nextElement()
	{
		int ret = 0;
		int[] array = b.getArray();
		
		while(bitPos < array.length*32)
		{
			if( b.get(bitPos) == true)
			{
				ret = bitPos;
				bitPos++;
				pos ++;
				break;
			}
			bitPos++;
		}
		
		return ret;
		
	}
	private BitVector b;
	private int bitPos;
	private int pos;

}
