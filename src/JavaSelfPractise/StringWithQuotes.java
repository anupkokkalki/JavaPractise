package JavaSelfPractise;

public class StringWithQuotes {

	public static void main(String[] args) {
 String str="I love \"Java\"";
 System.out.println(str);

 String username="admin";
 String Password="Password";
 String URL="Https//:"+username+":"+Password+"@abc.com/login.html";
 System.out.println(URL);
 
 String XpathUname="Anup";
 String xpath="//a[text()='"+XpathUname+"']";
 String xpathNew="//a[text()='"+XpathUname+"']";
 System.out.println(xpath);
 System.out.println(xpathNew);
 
 
 
	}

}
