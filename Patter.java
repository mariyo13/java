package Manu;

public class Patter {
    public static void main(String[] args) {
pattern6(5,5);
        patern8(5);
        diamond(5);

    }
    public static  void pattern1(int n ,int m){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==n|| j==m){
                    System.out.print("#");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        return;
    }
    public  static  void pattern2(int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public  static  void pattern3(int n, int m){
        int count =1;
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count++);
            }
            System.out.println();
        }
    }
    public  static  void pattern4(int n ,int m){
        int j;
        for(int i=0; i<n; i++){
            for(j=0; j<+m-i; j++){
                System.out.print(" ");
            }
            for(int k=j; k<=m; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public  static  void patter5(int n ,int m){
        int count=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m-i; j++){
                System.out.print(count++);
            }
            System.out.println();
            count=1;
        }

    }
    public  static  void pattern6(int n, int m){
        int num=0;
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                num=i+j;
                if(num%2 ==0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public  static  void patern8(int m){
        for(int i=0; i<m; i++){
            for(int j=0; j<m-i; j++){
                System.out.print("  ");
            }
            for (int j=0; j<=m; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
        }
        public  static  void diamond(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=n-i; j<n; j++){
                System.out.print(i );
            }
            for (int j =1; j<i; j++
                        ){
                System.out.print(i);
            }
            System.out.println();
        }
        }
    }

