class grandparent
{
	int a;
	grandparent(int a)
	{
		this.a=a;
	}
}
class parent extends grandparent
{
	int b;
	parent(int a,int b)
	{
	super(a);
	this.b=b;
	}
void show()
{
	System.out.println("grandparent's a="+a);
	System.out.println("parent's b="+b);
}}
class Child
{
	public static void main(String args[])
	{
		parent object=new parent(12,13);
		object.show();
	}
}