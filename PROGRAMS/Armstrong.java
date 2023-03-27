class Armstrong {
    public static void main(String[] args) {
        int total=0,temp,num=137,arm;
        while(num!=0)
        {
           temp=num%10;
           total=total+temp*temp*temp;
           num=num/10;
        }
        System.out.println(total);
        
    }
}