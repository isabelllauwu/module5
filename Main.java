public class Main
{
public static int fibonaccir(int n) { //function use in order to find  fibonacci using recursive 


if(n<=1)
{
return 1;
}
else {
return fibonaccir(n-1)+fibonaccir(n-2);
}
}


public static int fibonaccii(int n) { //funnction useed in order to find fibonacci using iterative 
if(n<=1)
{
return 1;
}
int r=0,p=1,pp=1,i;
for(i=2;i<=n;i++)
{
r = p + pp;
pp =p;
p =r;
}
return r;
}

public static void main(String[] args) {


int i,n=50,f1,f2;
System.out.print("n\tIterative\tRecursive\n");
System.out.print("==\t=========\t=========\n");
long start_time,end_time;
int difference,difference2;
for(i=20;i<=n;i++) //loop  20 to 50
{
start_time = System.nanoTime(); // this is used fro initial time
f1 = fibonaccii(i); //iterative method
end_time = System.nanoTime(); //for end time
difference = (int)((end_time - start_time) / 1e6); //difference in cal
start_time = System.nanoTime(); //for initial time
f2= fibonaccir(i); //recursive method
end_time = System.nanoTime(); //for end time
difference2 = (int)((end_time - start_time) / 1e6); //diff calc
System.out.print(i+"\t\t"+difference+"\t\t\t"+difference2 +"\t\n"); //outputting thee result
}
}
}
