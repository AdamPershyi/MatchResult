public class MatchResult {
    public static void main(String[] args) {
        System.out.println(matchResult(2, 2, 1, 1));

    }


    public static int matchResult(int result1, int result2, int bet1, int bet){

        if (result1 == bet1 && result2 == bet){
            return  2;}

            int win = (result1 > result2 && bet1 > bet || result2 > result1 && bet > bet1 || result1 == result2 && bet1 == bet) ? 1 : 0;
return  win;
        }



    }

