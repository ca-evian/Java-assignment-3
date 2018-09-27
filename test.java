import java.util.*;
public class test{
 public static void main(String[] args){
    List<Integer> list = new ArrayList<>(1);
    
    Integer init = new Integer(100);

    list.add(init);

    Integer test = list.get(0);

    System.out.println("第一次输出为: "+test);

    list.remove(0);

    list.add(new Integer(50));

    System.out.println("第二次输出为: "+test);
     
    init = 10;

    System.out.println(init+"第三次输出为: "+test);

//运行结果：
//第一次输出为: 100
//第二次输出为: 100
//10第三次输出为: 100
    
// list.get()获取的是当前元素的字面值，即为一个拷贝过程，之后改变list
// 中对应位置的元素或改变调用list.get()时获取元素的值均无影响 


 }
}
