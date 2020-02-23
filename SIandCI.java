public class SIandCI{
	public static double simpleInterest(double pri,double t,double rate){
		return (pri*t*rate)/100;
}
	public static double compoundInterest(double pri,double t,double rate){
		return pr * Math.pow(1.0+rate/100.0,t) - pri;
}
}
