package test01;
/*
1、按要求在main方法中完成以下功能：

        定义一个长度为5的int型数组arr，提示用户输入5个1-60之间的数字作为数组元素

        生成2-10（范围包含2和10）之间的随机数num


        遍历数组arr,筛选出数组中不是num倍数的元素并输出
*/

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        int arr[] = new int[5];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            System.out.println("输入"+(i+1)+"个1-60之间的数字");
             arr[i] = s.nextInt();
        }


        Random r = new Random();
        int  num  =r.nextInt(9)+2;
        System.out.println(" 生成2-10（范围包含2和10）之间的随机数为"+num);

                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]%num!=0){

                        System.out.print( arr[i]+"\t");
                    }


                }
        }
        }




