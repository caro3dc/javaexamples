class ifElse {
    public static void main(String[] args){
        int number = 5;
        if (number > 0) {
            System.out.println("The supplied number is positive.");
        } else if (number == 0) {
            System.out.println("The supplied number is zero, and is neither negative nor positive.");
        } else {
            System.out.println("The supplied number is *not* positive.");
        }
    }
}