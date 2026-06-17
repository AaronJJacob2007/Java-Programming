public class BondActorSearch {

    public static void main(String[] args) {
        String bond[] = { "Sean_Connery", "David_Niven", "George_Lazenby", "Roger_Moore", "Timothy_Dalton", "Pierce_Brosnan", "Daniel Craig" };
        int year[] = { 1962, 1967, 1969, 1973, 1987, 1995, 2006 };

        int searchYear = 1995; // example search year

        int index = binarySearch(year, searchYear);
        if (index != -1) {
            System.out.println("The James Bond actor for the year " + searchYear + " is " + bond[index]);
        } else {
            System.out.println("Record does not exist.");
        }
    }

    public static int binarySearch(int[] year, int searchYear) {
        int start = 0;
        int end = year.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (year[mid] == searchYear) {
                return mid;
            } else if (year[mid] < searchYear) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}


