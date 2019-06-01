import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LamdbaTest {
	
	interface LambdaFunction
	{
		public String getList(int obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LambdaFunction fun=request->"added-"+request*request;
		
		List<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(6);
		al.forEach(in->{System.out.println(in);});
		
		
		List<String> response=al.parallelStream().map(obj -> fun.getList(obj)).collect(Collectors.toList());
		System.out.println();
		response.forEach(res->System.out.println(res));
		
	}

}
