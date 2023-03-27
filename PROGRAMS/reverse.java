class Reverse {
    public static void main(String[] args) {
        int rev=0,num=4567,temp;
        while(num!=0)
        {
            temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        System.out.print(rev);
    }
}