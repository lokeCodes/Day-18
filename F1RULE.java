// https://www.codechef.com/problems/F1RULE
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-- > 0){
	        double x = 1.07*(s.nextInt());
	        double y = s.nextInt();
	        String res = (y<=x) ? "YES" : "NO";
	        System.out.println(res);
	    }
	}
}
