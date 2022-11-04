package week1.day2;

public class fibanocciSeries {
	public static void main(String[] args) {
		int range=8,firstnum=0,secnum=1,sum;
		System.out.println(firstnum+"\n"+secnum);
		for(int i=1;i<=(range-2);i++) {
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum =sum;
			System.out.println("fibonnaci Series are "+sum);
		}
	}

}
