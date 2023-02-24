// https://www.codechef.com/problems/DOMINANT
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
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int z = s.nextInt();
		    if(x+y < z || y+z < x || x+z < y){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
