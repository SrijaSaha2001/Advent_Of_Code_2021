import java.util.*;
import java.io.*;
class aoc_2
{
    public static void main(String[] args)throws IOException
    {
        File file = new File("C:\\Users\\2001s\\OneDrive\\Desktop\\aoc_2.txt");
        Scanner sc = new Scanner(file);
        int depth = 0;
        int pos = 0;
        int aim = 0;
        while(sc.hasNext()) {
            String s = sc.nextLine();
            String[] str = s.split("\\s+");
            System.out.println(str[0]);
            if(str[0].equals("forward"))
            {
                pos += Integer.parseInt(str[1]);
                depth += Integer.parseInt(str[1])*aim;
            }
            if(str[0].equals("down"))
            {
                aim += Integer.parseInt(str[1]);
            }
            if(str[0].equals("up"))
            {
                aim -= Integer.parseInt(str[1]);
            }
        }
        System.out.println(pos * depth);
    }
}
