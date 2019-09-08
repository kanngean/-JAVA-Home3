class a {
	public static void main(String args[]){
		int a[]={3,10,39,42,60};
		int max = 0;
		int min = 99;
		int tot=0;
			for(int i=0;i<a.length;i++){
		    	   if(max<a[i])max=a[i];
		           if(min>a[i])min=a[i];
		          tot+=a[i];
		}
	System.out.println("max="+max);
	System.out.println("max="+min);
	System.out.println("tot="+tot);
    }
}
