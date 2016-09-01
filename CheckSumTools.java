import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class CheckSumTools{

	public static void main(String[] args) throws IOException{
		
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try {
					System.out.println("please input:");
					String baowen10 = strin.readLine();
					if(baowen10.equalsIgnoreCase("q")){
						return;
					}
					String[] baowen= baowen10.split(" ");
					long sum = 0 ;
					for (int i = 0; i < baowen.length; i++) {
						sum= sum+Long.parseLong(baowen[i], 16);
					}
					String result=String.valueOf(sum);
					System.out.println(result.substring(result.length()-2, result.length()));

				} catch (Exception e) {
					System.out.println("args is no right");
			}
		}
	}
}