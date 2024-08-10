package shankar1;

class LengthvsLengthMethod 
{
	 
	/*
	 * public static void main(String[] args) { // Here str[0] pointing to String
	 * i.e. GEEKS String[] str = { "GEEKS", "FOR", "GEEKS","SHANKAR" };
	 * System.out.println(str[1].length()); }
	 */	

	public static void main(String[] args)
	{
		// Here str[0] pointing to a string i.e. GEEKS
		String str=  "GEEKS" ;
		System.out.println("To find string length::"+str.length());
		
		String arr[]= {"ram","siva","shanker"};
		System.out.println("To find string array length::"+arr[1].length());
	}
}



