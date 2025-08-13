class A{
void aDetails(){
System.out.println("A");
}
}
class B extends A{
void bDetails(){
System.out.println("B");
}
}
class C extends A{
void cDetails(){
System.out.println("C");
}
}
class Inheritance{
public static void main(String args[]){
A a=new A();
B b=new B();
C c=new C();
a.aDetails();
b.bDetails();
c.cDetails();
b.aDetails();
//c.bDetails();
c.aDetails();
}
}
