//Odd or Even:

int isEven(int n) {
    return (n % 2 == 0);
}

// Find Last Digit Of a^b for Large Numbers

class Solution {
  public:
    int getLastDigit(string a, string b) {
        if((a.size()==1 && a[0]=='0') && (b.size()==1 && b[0]=='0'))
        return 1;
        if(a.size()==1 && a[0]=='0')
        return 0;
        if(b.size()==1 && b[0]=='0')
        return 1;
        int numa=a[a.size()-1]-'0';
        int numb=0;
        for(int i=0;i<b.size();i++)
        {
            numb=numb*10+(b[i]-'0');
            numb%=4;
        }
        if(numb==0)
        numb=4;
        int res=pow(numa,numb);
        return res%10;
    }

};

//Count Digits

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int temp=n;
        int ud;
        int c=0;
        while(n>0){
            ud=n%10;
            if(ud!=0){
            if(temp%ud==0)  c++;
            
            }n/=10;
        }
        return c;
    }
}

//Reverse Digits

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}

//Power of numbers

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev=0;
        int rem;
        int temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        int ans=(int)Math.pow(temp,rev);
        return ans;
        }
    }

//GCD

class Solution {
    public static int gcd(int a, int b) {
        // code here
        int temp;
       while(b!=0){
           temp=b;
           b=a%b;
           a=temp;
       }
        return a;
    }
}

//All divisors of a Number
class Solution {
    public static void print_divisors(int n) {
        ArrayList<Integer> divisors=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
            divisors.add(i);
            if(i!=n/i)
            divisors.add(n/i);
            }
        }
            Collections.sort(divisors);
            for(int j:divisors)
            System.out.print(j+" ");
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    print_divisors(n);
}
}

//Prime Number

class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

//Armstrong Number 

class Solution {
    static boolean armstrongNumber(int n) {
        int c=0;
        int temp=n,sum=0;
        while(n>0){
            n/=10;
            c++;
        }
        n=temp;
        while(temp>0){
            int r=temp%10;
            sum=sum+(int)Math.pow(r,c);
            temp/=10;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
}

//Palindrome

class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp=n,rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev==temp;
        }
       
}

//Square Root of a Number

class Solution {
    int floorSqrt(int n) {
        // code here
        int low=1,high=n,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid<n){
            low=mid+1;
            ans=mid;
            }
            else
            high=mid-1;
        }
        return ans;
    }
}

//Perfect Number

class Solution {
    static boolean isPerfect(int n) {
        if(n<=1)
        return false;
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
            sum+=i;
            if(i!= n/i && n/i!=n)
            sum+=n/i;
            }
        }
        if(sum==n)
        return true;
        
    return false;    
        }
}
