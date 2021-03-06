package com.xkzhangsan.time.constants;

import java.util.Locale;
import java.util.regex.Pattern;

/**
 * 常量
 *
 * @author xkzhangsan
 * @date 2020年02月29日
 */
public class Constant {
	
	//===========================数值定义============================
	/**
	 * 每天小时数
	 */
	public static final int HOURS_PER_DAY = 24;
	
	/**
	 * 每小时分钟数
	 */
	public static final int MINUTES_PER_HOUR = 60;
	
	/**
	 * 每分钟秒数
	 */
	public static final int SECONDS_PER_MINUTE = 60;
	
	/**
	 * 每秒毫秒数
	 */
	public static final int MILLISECOND_PER_SECONDS = 1000;
	
	/**
	 * 每天秒数
	 */
	public static final int SECONDS_PER_DAY = HOURS_PER_DAY * MINUTES_PER_HOUR * SECONDS_PER_MINUTE;
	
	/**
	 * 每天毫秒数
	 */
	public static final int MILLISECOND_PER_DAY = SECONDS_PER_DAY * MILLISECOND_PER_SECONDS;
	
	//===========================异常定义============================
	/**
	 * 解析日期时异常
	 */
	public static final String PARSE_LOCAL_DATE_EXCEPTION = "Unable to obtain";
	
	//===========================正则定义============================
	
	/**
	 * 纯数字
	 */
	public static final Pattern NUMERIC_REGEX = Pattern.compile("[0-9]+");
	
	/**
	 * 字母开头
	 */
	public static final Pattern START_WITH_WORD_REGEX = Pattern.compile("^[A-Za-z].*");
	
	/**
	 * 中文
	 */
	public static final Pattern CHINESE_REGEX = Pattern.compile("[\u4E00-\u9FFF]");
	//===========================其他定义============================
	
	/**
	 * MonthDay 默认解析前缀
	 * 解析字符串需要加前缀，如"--12-03"
	 * @see java.time.MonthDay.parse(CharSequence)
	 */
	public static final String MONTHDAY_FORMAT_PRE = "--";
	
	/**
	 * 中文
	 */
	public static final String ZH = "zh";
	
	/**
	 * 除夕，节日处理使用
	 */
	public static final String CHUXI = "CHUXI";
	
	/**
	 * 春节，节日处理使用
	 */
	public static final String CHUNJIE = "0101";
	
	private static volatile Constant constant;
	
	private Constant(){
	}

	public static Constant getInstance(){
		if(constant == null){
			synchronized(Constant.class){
				if(constant == null){
					constant = new Constant();
				}
			}
		}
		return constant;
	}
	
	//===========================常用方法============================
	
	/**
	 * 是否为中文语言环境
	 * @return boolean
	 */
	public static boolean isChineseLanguage(){
		return Locale.getDefault().getLanguage().equals(ZH);
	}
	


}
