package test02;
/*定义方法filter
        要求如下：
        形参：String [] arr，String  str
        返回值类型：String []

        实现：遍历arr，将数组中以参数str开头的元素存入另一个String 数组中并返回
        PS：返回的数组长度需要用代码获取
        ②在main方法中完成以下要求：
        定义一个String数组arr，数组元素有："itcast","itheima","baitdu","weixin","zhifubao"

        调用filter方法传入arr数组和字符串”it”，输出返回的String数组中所有元素

        示例如下：*/


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String arr[] = {"itcast", "itheima", "baitdu", "weixin", "zhifubao"};
        String newarr[] = filter(arr, "it");
        System.out.println(Arrays.toString(newarr));
    }

    public static String[] filter(String[] arr, String str) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(str)) {


                count++;
            }
        }
        String newarr[] = new String[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(str)) {
                newarr[j] = arr[i];
                j++;
            }
        }
        return newarr;
    }
}
