package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DeputyChef {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r = null;
		String s;
		r = new BufferedReader (new InputStreamReader (System.in));
		if((s=r.readLine())!=null)
		{
			int test_cases=Integer.parseInt(s);
			for(int i=0;i<test_cases;i++)
			{
				int count=Integer.parseInt(r.readLine());
				int[] attack=Arrays.stream(r.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
				int[] defense=Arrays.stream(r.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
				int max=-1;
				for(int j=0;j<count;j++)
				{

					if(j==0)
					{
						if(attack[count-1]+attack[j+1]<defense[j])
						{
							max=Math.max(max, defense[j]);
						}
					}
					else if(j==count-1)
					{
						if(attack[j-1]+attack[0]<defense[j])
						{
							max=Math.max(max, defense[j]);
						}
					}
					else
					{
						if(attack[j-1]+attack[j+1]<defense[j])
						{
							max=Math.max(max, defense[j]);
						}
					}

				}
				System.out.println(max);

			}
			r.close();

		}
	}

}
