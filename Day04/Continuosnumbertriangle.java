public class Continuosnumbertriangle{
    public static void main(String[] args) {
        int i=1;
        for (int row =0;row<=4;row++){
            for(int col =0;col<=row;col++){
                System.out.print(i +" ");
                i++;
            }
            System.out.println("");
        }
    }
}