package EvenArray;

public class ass8 {
public static int countEvenOdd(int array[])
{
	int e=0;
	
	for(int i=0;i<array.length;i++)
	{
		if(array[i]%2==0)
		{
			e++;
		}
	}
	return e;
}
}
