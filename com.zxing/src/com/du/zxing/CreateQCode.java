package com.du.zxing;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
public class CreateQCode { 

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int width=300;
		int height=300;
		String format="png";
		String content="http://appupdate.yanxiu.com/storage/upload/release/yyxyl_3.1.1-others-20171113_.apk";
		//定义二维码参数
		HashMap hints=new HashMap();
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		hints.put(EncodeHintType.MARGIN,2);
		
		try {
			BitMatrix bitMatrix =new MultiFormatWriter().encode(content,BarcodeFormat.QR_CODE, width, height,hints);
			
			Path file =new File("F:/code/image.png").toPath();
			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
