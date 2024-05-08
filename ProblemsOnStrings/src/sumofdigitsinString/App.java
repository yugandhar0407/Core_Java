package sumofdigitsinString;

public class App {

	public static void main(String[] args) {
		
		String s = "Yug2and5har77";
		String s1="";
		int sum =0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=1 && ch<=9)
			{
				s1=s1+s.charAt(i);
				if(!s1.equals(""))
				{
					sum=sum+Integer.parseInt(s1);
					s1="";
				}
			}
			
		}
		System.out.println(sum);
		

	}

}
