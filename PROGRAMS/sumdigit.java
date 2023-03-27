class SumDigit {
    public static void main(String[] args) {
        int sum=0,digit,num=2435;
        while(num>0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
        
    }
}