package com.knight.mall.constant;

/**
 * 常量类
 * 
 * @author Administrator
 *
 */
public interface Constant {

	public interface REGION {
		public interface REGIONTYPE {
			// 地区类型，1：国家，2： 省份/直辖市，3：市，4：县/区
			// 地区类型，1：国家，
			public static final Integer COUNTRY = 1;
			// 2： 省份/直辖市
			public static final Integer PROVINCE = 2;
			// 3：市
			public static final Integer CITY = 3;
			// 4：县/区
			public static final Integer AREA = 4;
		}
	}

}
