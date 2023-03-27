class fibo {
    public static void main(String[] args) {
         while(true){
            int n=10;
            int x=0;
            int y=1;
            int z=0;
            System.out.println(x);
            System.out.println(y);
            while(z<=n){
               z=x+y;
                System.out.println(z);
               x=y;
               y=z;
            
            }
            break;
        }
    }
}