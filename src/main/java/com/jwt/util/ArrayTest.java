package com.jwt.util;

import java.util.List;

/**
 * @author Administrator
 */
public class ArrayTest {
    /**
     * 集合的判断 为null的时候返回false
     * @param list 集合
     * @return
     */
    public static boolean listIsNotEmpty(List list){
        if(list != null){
            if(list.size() != 0){
                return true;
            }
        }
        return false;
    }
}
