import java.util.*;
import java.io.*;
class aoc_1
{
    public static void main(String[] args)throws IOException
    {
		File file = new File("C:\\Users\\2001s\\OneDrive\\Desktop\\aoc_1.txt");
		Scanner in = new Scanner(file);
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		while(in.hasNext()) {
			list.add(in.nextInt());
		}
		for(int i = 0; i < list.size()-2; i++) 
		{
		    list2.add(list.get(i) + list.get(i+1) + list.get(i+2));
		}
		//part 1
		for(int i = 1; i < list.size(); i++) 
		{
		    if(list.get(i) > list.get(i-1)) 
		    {
			answer+=1;
		    }
		}
                //part 2
                answer = 0;
		for(int i = 1; i < list2.size(); i++) 
		{
		     if(list2.get(i) > list2.get(i-1)) 
			{
			   answer+=1;
			}
		}
		System.out.println(answer);
    }
}