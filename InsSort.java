
import java.util.*;
public class InsSort{
    int arr[];
    int size;
   
    InsSort(int s){
        size=s;
        arr=new int[size];
    }
   
  void getArray(){
      Scanner sc = new Scanner(System.in);
      int i=0;
      System.out.println("Enter the elements of the array : ");
      for(i=0; i<size; i++){
          arr[i]=sc.nextInt();
        }
    }
 
  void insertionSort(){
      int j=0;
      int key=0;
     for(int i=1; i<size; i++){
      key=arr[i];
    j=i-1;
    while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j=j-1;
    }
    arr[j+1]=key;
}
}

double find(){
    int sum=0;
    int count =0;
    for(int i=0; i<size; i++){
        if(arr[i]%2!=0){
            sum+=arr[i];
            count++;
            }
           
        }
        return(sum/count);
    }

    void display(){
        System.out.println("The sorted array is : " ) ;
        insertionSort();
        for(int i=0; i<size; i++)
            System.out.print(" " + arr[i]);
        System.out.println("\nThe average of all the odd numbers in the array is : " + find());
   
}

public static void main(String args[]){

InsSort obj = new InsSort(8);
obj.getArray();

obj.display();
}
}
