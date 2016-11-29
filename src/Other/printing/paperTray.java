package Other.printing;
public class paperTray 
{

	private int paperCount = 0;
	
	public void addPaper(int count) 
	{
		paperCount += count;
	}
	
	public void usePaper() 
	{
		paperCount--;
	}
	
	public boolean isEmpty() 
	{ 
		return paperCount > 0; 
	}
}
