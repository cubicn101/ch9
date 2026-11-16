import Scanner.till

public class Stats{
	
    public static void main (String []args){
     System.out.println("Count:" + args.length);
     System.out.println("Sum:" + ??? );
    }
    public static int sum(String []args){
		int SUM = 0;
		for(int i=0; i<agrs.length; i++){
			SUM += args[i];
		} 
		return SUM;   
    }
    public static int min(){
		int min = args[0];
		//???
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
    System.out.println("The max is " + max);
    }
    
    public static double ave (String []args){
		double average = (double) sum/ args.length;
		//??? 
	}
}

