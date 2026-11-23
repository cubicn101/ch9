
public class Stats{
	
    public static void main (String []args){
     System.out.println("Count:" + args.length);
     System.out.println("Sum:" + sum(agrs));
     System.out.println("Min:" + min(args));
     System.out.println("Max:"+ max(args) );
     System.out.println("Average:"+ average(args) );
    }
    public static int sum(String []args){
		int SUM = 0;
		for(int i=0; i<agrs.length; i++){
		    int num=  Integer.parseInt(args[i]);
			SUM += num;
		} 
		return SUM;   
    }
    public static int min(String []args){
		int min;
		for(int i=0; i<agrs.length; i++){
			int num=  Integer.parseInt(args[i]);
			if(num<min)
			min = num;
		}
		return min;
	}
	public static int max (String[]args){
         int max = Integer.MIN_VALUE;
         for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
            max = value;
            }
         }
           return max;
    }
    
    public static double ave (String []args){
		double average = (double) sum(args)/ args.length;
	    return average;
	}
}

