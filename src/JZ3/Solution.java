package JZ3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qingjiusanliangsan
 * create 2022-02-19-20:17
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        // write code here
        Set<Integer> hset = new HashSet<Integer>();
        for(int e: numbers){
            if(hset.contains(e)){
                return e;
            }
            else{
                hset.add(e);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        int[] du = {1,2,3,4};
        System.out.println(so.duplicate(du));
    }
}