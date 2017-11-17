package question1b;


public class BitVector implements IBitVector
{
	/**
	 * intArray -> integer array
	 * Example: let the bits that BitVector will represent be S = {2,33,67}
	 * then intArray = {4,2,8}. Note that S and intArray is in the form E0,E1,E2...,En
	 * where E is the elements of the sets.
	 */
	private int[] intArray;
	
	/**
	 * Constructor, initializes a zero size integer array 
	 */
	public BitVector()
	{
		intArray = new int[0];
	}
	
	@Override
	public boolean get(int i)
	{
		/**
		 * intArrayPos -> represents which element of the integer array that input argument corresponds to
		 * Example: for i = 34, intArrayPos = 1(second element in the array) which represents 32-64 bits
		 * bitPos -> position of the bit in intArrayPos
		 * Example: for i = 34, bitPos = 2
		 */
		int intArrayPos = i / 32;
		int bitPos = i % 32;
		return (intArray[intArrayPos] & (1 << bitPos)) != 0;
	}
	
	@Override
	public void set(int i)
	{
		int intArrayPos = i / 32;
		int bitPos = i % 32;
		/**
		 * If intArray is empty make a new intArray with size = intArrayPos + 1 and set bitPos to 1
		 */
		if(intArray.length == 0)
		{
			intArray = new int[intArrayPos + 1];
			intArray[intArrayPos] |= 1 << bitPos;
		}
		/**
		 * If input argument i resides in the range of current intArray, simply set it
		 */
		else if (intArray.length >= intArrayPos + 1)
		{
			intArray[intArrayPos] |= 1 << bitPos;
		}
		/**
		 * If input argument i is out of range of current intArray, increase the size of the array
		 */
		else
		{
			int[] tempArray = new int [intArrayPos + 1];
			for(int m = 0; m < intArray.length; m++)
			{
				tempArray[m] = intArray[m];
			}
			tempArray[intArrayPos] |= 1 << bitPos;
			intArray = tempArray;			
		}	
	}
	
	@Override
	public void clear(int i)
	{
		int intArrayPos = i / 32;
		int bitPos = i % 32;
		if (intArray.length >= intArrayPos + 1)
		{
			/**
			 * Set bitPos to 0.
			 */
			intArray[intArrayPos] &= ~(1 << bitPos);
		}
	}
	
	@Override
	public void copy(BitVector b)
	{
		int copyArray[] = b.getArray();
		
		/**
		 * If this BitVector is at least the size of BitVector to be copied, simply copy all the bits
		 * from b to this BitVector
		 */
		if(intArray.length >= copyArray.length)
		{
			for(int i = 0; i < copyArray.length; i++)
			{
				int temp = copyArray[i];
				
				for(int l = 0; l < 32; l++)
				{
					/**
					 * (32 *i) provides a way to move through the elements of the intArray
					 */
					if( (temp&1) == 1)
					{
						this.set(l  + (32 *i));
					}
					temp = temp >>> 1;
				}
			}
		}
		else
		{
			/**
			 * If this BitVector is smaller than BitVector to be copied, make a temporary BitVector, copy this BitVector to
			 * temporary one then copy input BitVector to temporary BitVector.Make this BitVector, temporary BitVector.
			 * with the size of this BitVector then increase 
			 */
			BitVector tempVector = new BitVector();
			for(int i = 0; i < intArray.length; i++)
			{
				int temp = intArray[i];
				for(int l = 0; l < 32; l++)
				{
					if( (temp&1) == 1)
					{
						tempVector.set(l + (32 * i));
					}
					temp = temp >>> 1;
				}
			}
			for(int i = 0; i < copyArray.length; i++)
			{
				int temp = copyArray[i];
				for(int l = 0; l < 32; l++)
				{
					if( (temp&1) == 1)
					{
						tempVector.set(l + (32 * i));
					}
					temp = temp >>> 1;
				}
			}
			this.setArray(tempVector.getArray());	
		}		
	}
	
	@Override
	public int size()
	{
		/**
		 * Inspects every element of bitArray one by one, checks the least significant bit of
		 * the element and shift bits to right direction till it cover 32 bits.
		 */
		int size = 0;
		for(int i = 0; i < intArray.length; i++)
		{
			int temp = intArray[i];
			for(int l = 0; l < 32; l++)
			{
				if( (temp&1) == 1)
				{
					size ++;
				}
				temp = temp >>> 1;
			}
		}
		return size;
	}
	
	@Override
	public Iterator<Integer> iterator()
	{
		return new BitVectorIterator(this);
	}
	
	/**
	 * Helper Methods
	 */
	public int[] getArray()
	{
		return intArray;
	}
	public void setArray(int[] array)
	{
		this.intArray = array;
	}
	

}
