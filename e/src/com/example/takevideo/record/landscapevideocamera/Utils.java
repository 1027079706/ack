package com.example.takevideo.record.landscapevideocamera;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	/** ����¼�������� **/
	public static String setRecordFileName() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd_HHmmss");
		return dateFormat.format(date)+".wav";
	}
	
	//����¼���ļ�������
		public static String setRecordVideoFileName() {
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd_HHmmss");
			return dateFormat.format(date)+".mp4";
		}

}
