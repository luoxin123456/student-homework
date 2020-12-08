package 模拟学生作业处理;
import java.io.*;
public class Example{
 public static void main(String args[]){
   File file =new File("C:\\Users\\luoxin\\Desktop","A.text");
   File files =new File("C:\\Users\\luoxin\\Desktop","C.text");
   File targetFile =new File("A.text");
   File sourceFile =new File("C.text");
 char c[]=new char[7];
   try {
	   Writer out = new FileWriter(targetFile,true);
	   Reader in =new FileReader(sourceFile);
	   int n=-1;
	   while((n=in.read(c))!=-1) {
		   out.write(c,0,n);
	   }
		out.flush();
		out.close();
   }
   catch(IOException e) {
	   System.out.println("Error"+e);
       }
    }
   }