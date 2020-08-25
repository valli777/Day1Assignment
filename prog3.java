//question no-6
class Program{
public static void main(String args[]){

for(int row=0;row<4;row++)
{
for(int col=0;col<5;col++)
{
System.out.print("*");
}
System.out.println();
}
for(int row=0;row<4;row++)
{
for(int col=4-row;col>1;col--)
{
System.out.print(" ");
}
for(int col=0;col<=row;col++)
{
System.out.print("* ");
}
System.out.println();
}
System.out.println();

for(int row=0;row<4;row++)
{
for(int col=0;col<5;col++)
{
System.out.print("*");
}
System.out.print("            ");
for(int col=4-row;col>1;col--)
{
System.out.print(" ");
}
for(int col=0;col<=row;col++)
{
System.out.print("* ");
}
System.out.println();
}
for(int row=0;row<4;row++)
{

System.out.println();
}
}}