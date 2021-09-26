
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	
	Scanner sc = new Scanner(System.in);
	public void displayStockPrices(boolean isAscending, double[] stockPrice, int left, int right)
	{
		if(isAscending)
		{
			//SortData mySort = new SortData();
			Arrays.sort(stockPrice, left, right);
			for(int i=stockPrice.length-1;i>=0;i--)
			System.out.println(stockPrice[i]+" ");
		}
		else
		{
			Arrays.sort(stockPrice, left, right);
			for(int i=0;i<stockPrice.length;i++)
			System.out.println(stockPrice[i]+" ");
		} 
	}
	
	
	public int companiesWithPriceRoseToday(boolean[] isUpOrDown)
	{
		int count=0;
		for(int i=0;i<isUpOrDown.length;i++)
		{
			if(isUpOrDown[i])
			{
				count++;
			}
		}
		return count;
	}
	

	public int companiesWithPriceDeclinedToday(boolean[] isUpOrDown)
	{
		int count=0;
		for(int i=0;i<isUpOrDown.length;i++)
		{
			if(!isUpOrDown[i])
			{
				count++;
			}
		}
		return count;
	}
	

	public String searchSpecificStockPrice(double[] stockPrice)
	{
		Arrays.sort(stockPrice, 0, stockPrice.length-1);
		System.out.println("enter the key value");	
		double searchPrice = sc.nextDouble();
		for(int i=0;i<stockPrice.length;i++)
		{
			if(stockPrice[i]==searchPrice) return "Stock of value "+searchPrice+" is present";
		}
		return "Value not found";
	}
	
	

}