import java.util.*;
class pattern{
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int i;
        int j;
        int n;
        System.out.println("Enter character");
        char ch=in.next().charAt(0);
        System.out.println("Enter n");
        n=in.nextInt();
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(ch+" ");
        }
        System.out.println();
}}}
