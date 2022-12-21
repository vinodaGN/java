 class LineEquation {
    public static void main(String []args){
        int n=7;
        for(int i=0; i<=n-1; ++i){
            // FOR Character J
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==n/2|| i-j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR Character A
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR Character V
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(i==j && j<=n/2 || i+j==n-1 && j>=n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR Character A
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR Character I
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i==n-1|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR Character S
               System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR Character A
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character M
            for(int j=0; j<=n-1; ++j){
               if(j==0|| j==n-1|| i==j && i<=n/2|| i+j==n-1 && i<=n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character A
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character Z
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i+j==n-1|| i==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character I
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i==n-1|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character N
            for(int j=0; j<=n-1; ++j){
               if(j==0|| i==j|| j==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character G
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
               System.out.println();
        }
        System.out.println();
        for(int i=0; i<=n-1; ++i){
            System.out.print(" ");
            // FOR Charater P
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character R
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2|| i-j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character O
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n-1)&& j!=n-1 && j!=0|| (j==0|| j==n-1)&& i!=0 && i!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character U
            for(int j=0; j<=n-1; ++j){
               if((j==0|| j==n-1)&& i!=n-1|| i==n-1 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character D
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n-1)&& j!=n-1|| j==0|| j==n-1 && i!=0 && i!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR Character G
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character Q
            for(int j=0; j<=n-1; ++j){
               if((i==0 && j!=0 && j<=n/2)|| (j==0 && i!=0 && i<=n/2) || (i==j && i>=n/2)||(i==n/2+1 && j!=0 && j<=n/2)||(j==n/2+1 && i!=0 && i<=n/2)){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character T
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character I
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i==n-1|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR  Character A
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character N
            for(int j=0; j<=n-1; ++j){
               if(j==0|| i==j|| j==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character S
            for(int j=0; j<=n-1; ++j){
               if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.println( );
        }
        System.out.println();
        for(int i=0; i<=n-1; ++i){
            System.out.print(" ");
            // FOR Character T
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character H
            for(int j=0; j<=n-1; ++j){
               if(j==0|| j==n-1|| i==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character A
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character N
            for(int j=0; j<=n-1; ++j){
               if(j==0|| i==j|| j==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character K
            for(int j=0; j<=n-1; ++j){
               if(j==0|| i-j==n/2|| i+j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR Character Y
            for(int j=0; j<=n-1; ++j){
               if(i==j && i<=n/2|| i+j==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character O
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n-1)&& j!=n-1 && j!=0|| (j==0|| j==n-1)&& i!=0 && i!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character U
            for(int j=0; j<=n-1; ++j){
               if((j==0|| j==n-1)&& i!=n-1|| i==n-1 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR Character G
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character R
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2|| i-j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR Character S
            for(int j=0; j<=n-1; ++j){
               if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character I
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i==n-1|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Character R
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2|| i-j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.println( );
        }
        }
}
