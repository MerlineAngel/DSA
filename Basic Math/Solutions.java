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

//
