package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class ChefAndSecretIngredients {

	static int res=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r = null;


		String s;

		r = new BufferedReader (new InputStreamReader (System.in));
		if ((s=r.readLine())!=null)
		{
			int test_cases=Integer.parseInt(s);

			for(int i=0;i<test_cases;i++)
			{
				s=r.readLine();

				int count=Integer.parseInt(s);

				s=r.readLine();
				HashMap<Character, Integer> map=new HashMap<>();
				for(int j=0;j<s.length();j++)
					map.put(s.charAt(j), 1);

				for(int k=0;k<count-1;k++)
				{

					s=r.readLine();
					HashSet<Character> set=new HashSet<>();

					for(int l=0;l<s.length();l++)
						set.add(s.charAt(l));

					for(Character c : set)
					{
						if(map.containsKey(c))
							map.put(c,map.get(c)+1);
					}
				}

				map.values().forEach(temp->{
					if(temp==count)
						res++;
				});
				System.out.println(res);
				res=0;


			}

		}



	}

}
