package com.ricky.java.filedownloader;

import java.io.File;

import com.ricky.java.filedownloader.config.FileDownloaderConfiguration;

public class FileDownloaderTest {

	public static void main(String[] args) {
		String temp = System.getProperty("user.dir") + File.separator + "temp" + File.separator;
		
		FileDownloader fileDownloader = FileDownloader.getInstance();
		FileDownloaderConfiguration configuration = FileDownloaderConfiguration
				.custom()
				.coreThreadNum(5)
				.downloadDestinationDir(new File(temp))
				.build();
		fileDownloader.init(configuration);
		
		String url = "http://quotes.money.163.com/service/chddata.html?code=0600789&start=19970226&end=20161028&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP";
		//"http://apache.fayea.com/tomcat/tomcat-9/v9.0.0.M11/bin/apache-tomcat-9.0.0.M11.zip";
		String filename = "a.txt";//"tomcat.zip";
		
		boolean result = fileDownloader.download(url, filename);
		
		System.out.println("download result:"+result);
		
		fileDownloader.destroy();
	}
}
