import java.io.*;
public class J2{

	public static void main(String[] args) throws IOException
	   {
	      FileWriter fw=new FileWriter("c:\\java\\rand.txt");
	      FileReader fr=new FileReader("c:\\java\\rand.txt");
	      BufferedWriter bfw=new BufferedWriter(fw);
	      BufferedReader bfr=new BufferedReader(fr);
	      String str;
	      int i =new int (1000);
	      for(i=1;i<=1000;i++)
	      {
	         Double num=new Double(Math.random()*100000);
	         str=Integer.toString(num.intValue());
	         bfw.write(str);
	         bfw.newLine();
	      }
	      bfw.flush();
	      fw.close();
	 } 
}
