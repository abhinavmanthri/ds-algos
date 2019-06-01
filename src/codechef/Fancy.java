package codechef;

import java.io.*;

public class Fancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		
		
		String s;
		try {
			r.readLine();
			//int t_count=Integer.parseInt(r.readLine());
			while ((s=r.readLine())!=null)
			{
				if(s.equals("not"))
					System.out.println("Real Fancy");
				else if(s.contains(" not "))
					System.out.println("Real Fancy");
				else if(s.contains("not "))
					if(s.indexOf("not")==0)
						System.out.println("Real Fancy");
					else
						System.out.println("regularly fancy");
				else if(s.contains(" not"))
					if(s.indexOf("not")==s.length()-3)
						System.out.println("Real Fancy");
					else
						System.out.println("regularly fancy");
				
				else
					System.out.println("regularly fancy");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;


	}

}
