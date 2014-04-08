package org.idomac.training.wrms.question_006;

/**
 * Author : lihaoquan
 * Description :
 *
 * 给你 10 分钟时间，根据上排给出十个数，在其下排填出对应的十个数
 * 要求下排每个数都是先前上排那十个数在下排出现的次数。
 * 上排的十个数如下：
 * 【0，1，2，3，4，5，6，7，8，9】
 *
 * 举一个例子，
 * 数值: 0,1,2,3,4,5,6,7,8,9
 * 分配: 6,2,1,0,0,0,1,0,0,0
 * 0 在下排出现了 6 次，1 在下排出现了 2 次,2 在下排出现了 1 次，3 在下排出现了 0 次...
 *
 * *******************************************************8888
 * 参考:
 * 1.http://zhuiyi74.iteye.com/blog/839742
 * 2.http://blog.csdn.net/heaven13483/article/details/7925621
 * 3.http://blog.csdn.net/wcyoot/article/details/6428305
 *
 */
public class BottomArrGenerator {

    /**
     * 结构结果生成
     * @param n
     * @return
     */
    public static int[] generate(int n) {

        if(n<4) {
            System.out.println("请输入不小于4的整数");
            return null;
        }

        int[] top = new int[n];
        int[] buttom = new int[n];

        //把相关的数字设置进去
        for (int i = 0 ; i < top.length; i++) {
            top[i] = i;

            System.out.println(top[i]);
        }
        return null;
    }

    /**
     * 统计数字n在数组arr中出现的次数
     * @param num
     * @param arr
     * @return
     */
    public static int getCount(int num,int [] arr) {
        int count = 0;
        for(int i : arr) {
            if(num == i) {
                count++;
            }
        }
        return count;
    }
}
