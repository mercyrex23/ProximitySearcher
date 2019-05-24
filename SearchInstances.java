package ProximitySearchPackage;

public class SearchInstances {
	
	public static void ProximitySearcher(String input, String searchValue1, String searchValue2, int inputrange) {
	
		if(input.length() < 0 || searchValue1 == null || searchValue2 == null)
		{
			System.out.println("Invalid input");
		    return;
		}
		
		int counter = 0;
		
		String [] wordsList = input.split(" ");
		
		for(int i=0; i<=wordsList.length-1; i++)
		{
			if(wordsList[i].equalsIgnoreCase(searchValue1)) 
			{				
				for(int j=0,k=i+1; j<=inputrange-2 && k<=wordsList.length-1; j++) 
				{
					{
						if(wordsList[k].equalsIgnoreCase(searchValue2))
							{						
							counter = counter+1;	
							System.out.println("match found at " + i + " , "+ k );
										
							}
					k++;
					}
			 	}	
			}	
			else if(wordsList[i].equalsIgnoreCase(searchValue2)) 
			{				
				for(int j=0,k=i+1;j<=inputrange-2 && k<=wordsList.length-1;j++) 
				{		
				 
					{
						if(wordsList[k].equalsIgnoreCase(searchValue1))
							{						
							counter=counter+1;	
							System.out.println("match found at " + i + " , "+ k );
										
							}
					k++;
					}
			 	}	
			}	
			
	  }
		
		
		System.out.println("Total occurrence using Proximity Search is  " + counter);}
	
}
