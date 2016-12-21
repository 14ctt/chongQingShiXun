package com.jero.motelmalltest.common.utils;


import java.util.*;

import com.alibaba.fastjson.JSON;

/**
 * @Description <将对象转换成json>
 * @author  郑启阳
 * @date  2016年5月27日 下午10:12:50
 * @version   1.0
 */
public class JsonObjectUtil {
	public static String printByJSON(Object obj) {
		String jsonStr = "";
		Map<String,Object> map = new HashMap<String,Object>();
		if (obj != null && !"".equals(obj)) {
			map.put("rows", obj);
			jsonStr = JSON.toJSONString(map);
			
		}
		return jsonStr;
	}
}
