class EvenNumbers {
    public static void main(String[] args){
        for( int x = 1; x <= 20;  x++ ) {
                if ( x % 2 == 1 ) { continue;}
                System.out.println(x);
            }
    }
}
