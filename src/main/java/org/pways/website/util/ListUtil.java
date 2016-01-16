package org.pways.website.util;

import java.util.List;

/**
 * @author hlj
 */
public class ListUtil {

	public static boolean isEmpty(List list){
		return null==list||list.size()==0;
	}
	public static boolean isNotEmpty(List list){
		return null!=list&&list.size()>0;
	}
}
