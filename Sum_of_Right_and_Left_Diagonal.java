
 import java.util.*;  
 public class Sum_of_Right_and_Left_Diagonal  
 {  
   public static void main()  
   {  
     int sumofleft=0, sumofright=0;  
     Scanner sc=new Scanner(System.in);  
     System.out.println("Enter the number of Rows");  
     int r=sc.nextInt();  
     System.out.println("Enter the number of Columns");  
     int c=sc.nextInt();  
     int arr[][]=new int[r][c];  
     System.out.println("Enter the elements of Matrix");  
     for(int i=0;i<r;i++)  
     {  
       for(int j=0;j<c;j++)  
       {  
         arr[i][j]=sc.nextInt();  
       }  
     }  
     for(int i=0;i<r;i++)  
     {  
       for(int j=0;j<c;j++)  
       {  
         System.out.print(arr[i][j]+" ");   
       }  
       System.out.println("");  
     }  
     for(int i=0;i<r;i++)  
     {  
       for(int j=0;j<c;j++)  
       {  
        if(i+j==r-1 ) 
         sumofleft=sumofleft+arr[i][j]; 
          if( i==j)
         sumofright=sumofright+arr[i][j];
        
       }  
     }  
       System.out.println("Sum of Left Diagonal Elements="+sumofleft);
       
System.out.println("Sum of Right Diagonal Elements="+sumofright);
  
     }  
   }  