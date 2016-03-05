import java.util.*;
public class StringDemo
{
	int i,count=0;
    public int countWords(String str)
    { 
        char alphaN[]= new char[str.length()];  
        for(i=0;i<str.length();i++)
        {
            alphaN[i]= str.charAt(i);
            if( ((i>0)&&(alphaN[i]!=' ')&&(alphaN[i-1]==' ')) || ((i==0)&&(alphaN[0]!=' ')) )
            count++;
        }
        return count;
    
    }
    public static void main (String args[])
    {
    	int result;
    	StringDemo std = new StringDemo();
        result= std.countWords("jaymehta xyz abc pqr lmn ");
        System.out.println("This String contains "+ result + " " + "words");
    }     
}


