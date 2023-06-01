package day1;

class Prog45 
{
	public static void main(String[] args) 
	{
		int no=34326;
		int sume=0;
		int summ=0;
		for(int i=no; i!=no; i/=10){
			if(i==no || i<10){
				sume+=i%10;;
			}
			else{
				summ+=i%10;
			}
			if (summ=sume)
			{
				System.out.println("Xylem Number");
			}else{
				System.out.println("Not Xylem Number");
			}
		}
}
}
