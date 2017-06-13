
package insertion;

public class Insertion {

    public static void main(String[] args) {

        int [] arr = new int [100];
        int nElements = 0;
        int j;
        
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        
        nElements = 7;
        arr[nElements] = 33;
        nElements++;
        
        for (j=0; j<nElements; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

    }
    
}