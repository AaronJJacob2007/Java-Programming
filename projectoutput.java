class projectoutput

   { public static void main(String args[])
    {
    String m[][]={{"o","o","o","o"}, {"o","o","o","o"},{ "o","o","o","o"}, {"o","o","o","o"}};
    int i;
    int j;
    System.out.println("* * * * * * *");
    for(i=0;i<4;i++)
    {
        for(j=0;j<4;j++){
             if(j<=0)
             System.out.print("*");
             System.out.print("|"+m[i][j]+"|");
             if(j==3)
             System.out.print("*");
            
        }   System.out.println( ); }
        System.out.println("* * * * * * *");
}}