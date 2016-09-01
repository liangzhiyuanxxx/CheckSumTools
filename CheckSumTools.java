import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class CheckSumTools{

	public static void main(String[] args) throws IOException{
		
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
		//String baowen10="01 02 03 04 05 06 07 09 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 03 02 02 01 3D 00 00 00 0A 00 00 00 02 00 00 00 DF 07 04 0A 0F 00 0B FF DF 07 04 0A 0F 01 2C FF";
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