//David Dorneau
//Z23281302
//Data structures and Algorithms
//Assignment #2 TwoLargest
import java.util.Scanner;
import java.util.*;
public class TwoLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner myVar= new Scanner(System.in);
System.out.println("Enter the size of the list");
int length= myVar.nextInt();
Vector<Integer> V =new Vector<>(length);
System.out.println("Enter the list with which you want to find the two larger values");

for(int j=0;j<length;j++)
{
int i=myVar.nextInt();
V.add(i);
}
System.out.println(V);
TwoLargest(V);

	}
 static void TwoLargest(Vector<Integer> Vec)
 {
	 int large_1=0,large_2=0;
	 
	 for(int i=0;i<(Vec.size());i++)
	 {
		 if (Vec.get(i)>large_1)
		 {
		 large_2=large_1;
		 large_1=Vec.get(i);
		 }
		 else if(large_2<Vec.get(i))
		 {
			 large_2=Vec.get(i);
		 }
	 }
	 
	 System.out.println(" the two larger values are: "+large_1+" "+large_2);
	
 }
}
