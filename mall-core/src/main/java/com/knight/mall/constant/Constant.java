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
			// 地区类型，0：国家，1： 省份/直辖市，2：市，3：县/区
			// 地区类型，0：国家，
			public static final Integer COUNTRY = 1;

			// 1： 省份/直辖市
			public static final Integer PROVINCE = 2;
			// 2：市
			public static final Integer CITY = 3;
			// 3：县/区
			public static final Integer AREA = 4;
		}
	}

}