＃计191罗鑫2019311215
＃实验目的
1个。掌握弦弦及其用法
2。掌握文件的读取，写入方法
＃实验过tg程
通过建立输入输出流，将c中的长恨歌经过java的处理，进行标点符号等的变化，通过利用FileOutputStream类的运用编写文本A
每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
允许提供输入参数，统计古诗中某个字或词出现的次数
输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
考虑操作中可能出现的异常，在程序中设计异常处理程序
＃核心代码
```
public class Example{
 public static void main(String args[]){
   File file =new File("C:\\Users\\luoxin\\Desktop","A.text");
   File files =new File("C:\\Users\\luoxin\\Desktop","C.text");
   File targetFile =new File("A.text");
   File sourceFile =new File("C.text");
 char c[]=new char[7];
 ```
 
