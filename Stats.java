
public class Stats{
	
    public static void main (String []args){
     System.out.println("Count:" + args.length);
     System.out.println("Sum:" + sum(args[]));
     System.out.println("Min:" + sum(args[]));
     System.out.println("Max:" + sum(args[]));
     System.out.println("Average:" + sum(args[]));
    }
    public static int sum(String []args){
		int SUM = 0;
		int num=  Integer.parseInt(args[i]);
		for(int i=0; i<agrs.length; i++){
			SUM += num;
		} 
		return SUM;   
    }
    public static int min(String []args){
		int min = args[0];
		for(int i=1; i<agrs.length; i++){
			
			if(args[i]<min)
			min = args[i];
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
		double average = (double) sum(args[])/ args.length;
		//??? 
	}
}

