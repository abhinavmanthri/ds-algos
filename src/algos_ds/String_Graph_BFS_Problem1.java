package algos_ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class String_Graph_BFS_Problem1 {

	public static boolean checkValidString(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				count++;
			else if(s.charAt(i)==')')
				count--;
		}

		return count==0?true:false;

	}

	public static HashSet<String> result(String s)
	{
		HashSet<String> al=new HashSet<>();
		HashMap<String, Boolean> map=new HashMap<>();
		LinkedList<String> queue=new LinkedList<>();
		queue.add(s);

		boolean flag=false;
		if(checkValidString(s))
		{
			al.add(s);
			return al;
		}
		while(queue.size()>0)
		{
			String temp=queue.poll();
			if(map.get(temp)!=null && map.get(temp))
				continue;
			map.put(temp, true);
			
			if(checkValidString(temp))
			{
				al.add(temp);
				flag=true;
				continue;
			}
			if(flag)
				continue;
			for(int i=0;i<temp.length();i++)
			{
				if(temp.charAt(i)=='(' ||temp.charAt(i)==')')
				{
					String temp1=temp.substring(0, i)+temp.substring(i+1,temp.length());
					//System.out.println(temp1);

					//System.out.println("adding to list :"+temp1);
					queue.add(temp1);
				}
			}
			//System.out.println("list-->"+queue);

		}
	

	return al;
}

public static void main(String[] args) {

	HashSet<String> al=String_Graph_BFS_Problem1.result("(a)())()");

	//System.out.println(al);
	al.forEach(s->System.out.println(s));
}

}
