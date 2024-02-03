/**
 * isPalindrom
 */
public class isPalindrom {

    public static void main(String[] args)
    {
        System.out.println(isPalindromS("geeg geeg"));
    }
    //String palindrom
    public static boolean isPalindromS(String n)
    {
        for(int i=0; i<n.length()/2;i++)
        {
            if(n.charAt(i)!=n.charAt(n.length()-i-1))   
                return false;
        }
        return true;
    }
    //Int pallindrom
    public static boolean isPalindromI(int n)
    {
        int len = 0; // length of the integer
        int c=n; 
        int i = 0; // index 
        while(c%10!=c/10) // check length of integer
        {
            c/=10;
            len+=1;
        }
        int[] arr = new int[len]; //declare array which will contain the digits of the number
        while(n%10!=n/10)
        {
            arr[len-i-1] = n%10; //arr[len-i-1] becouse  i want the arr to have the n umber and not the reverse number
            n/=10;
            i+=1;
        }
        for(int k=0; k<(arr.length/2);k++) //check if the numeber is palindrom
        {
            if(arr[k]!=arr[arr.length-k-1])
                return false;
        }
        return true;
    }
}
