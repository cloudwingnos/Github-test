package learn;


import java.io.FileInputStream;
import java.io.IOException;
    
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        show1();
   }
  /**show1():从文件中读取单个字节
   * 1.创建FileInputStream对象,构造方法中绑定要读取的数据源
   * 2.使用FileInputStream对象中的方法read,读取文件
   * 3.释放资源
   */
   public static void show1() throws IOException {  
        //1.
        /* 构造方法的作用:
            1.会创建一个FileInputStream对象
            2.会把FileInputStream对象指向构造方法中要读取的文件的第一个字节
         */
        FileInputStream fis = new FileInputStream("09_IOAndProperties\\c.txt"); //文件内容为abc
        //FileInputStream fis = new FileInputStream(new File("09_IOAndProperties\\c.txt"));
        
        //2.int read()通过JVM，再通过OS，读取文件中的指针指向的字节并提升到int返回,连续读取时指针依次向后移，读取到文件的末尾返回-1
       /* len = fis.read();
        System.out.println(len);//97 a
        len = fis.read();
        System.out.println(len);// 98 b
        len = fis.read();
        System.out.println(len);//99 c
        len = fis.read();
        System.out.println(len);//-1
       */
       /*
        int len = 0; //记录读取到的字节
        while((len = fis.read())!=-1){
            System.out.print((char)len);//abc
        }
        */
 
        //3.
        fis.close();
    }
 
   /**show2():从文件中读取字节数组
    *1.创建FileInputStream对象,构造方法中绑定要读取的数据源
    *2.使用FileInputStream对象中的方法read读取文件
    *3.关闭资源
    */
    public void show2() throws IOException {
        //1.
        FileInputStream fis = new FileInputStream("09_IOAndProperties\\b.txt");//文件内容为ABCDE
        
        //2.
        //int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
        byte[] bytes = new byte[2]; // byte[]起到缓冲作用,存储每次读取到的多个字节,数组的长度一把定义为1024(1kb)或者1024的整数倍
        //
        //不同于读取单个字节int len记录每次读取的有效字节个数
        int len = fis.read(bytes); 
        System.out.println(len);//2
        //System.out.println(Arrays.toString(bytes));//[65, 66]
        //
        //String(byte[] bytes) :把字节数组转换为字符串
        System.out.println(new String(bytes));//AB
        len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(new String(bytes));//CD
        len = fis.read(bytes);
        System.out.println(len);//1
        //
        //String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
        System.out.println(new String(bytes,0,len));
        //System.out.println(new String(bytes)); ED 错于当数组容量大于剩余字节时，上次读取的数据没有被完全替换而重复读取，所以要通过 len ，获取有效的字节.
        len = fis.read(bytes);
        System.out.println(len);//-1       
        /*
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            //
            //当数组容量大于读取内容时，直接转换成字符串会生成大量空格，所以只转换有效字节
            System.out.println(new String(bytes,0,len));
        }
        */
 
        //3.
        fis.close();
    }
}
————————————————
