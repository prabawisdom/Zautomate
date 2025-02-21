package zautomate.zadoqa.writers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.FileImageOutputStream;

import zautomate.zadoqa.utils.Directory;

public class HTMLDesignFilesWriter {

	public static void writeCSS()  {
		copyFile("styles/design.css", Directory.CSSDir);
		copyFile("styles/jquery.jqplot.css", Directory.CSSDir);
		copyFile("styles/jquery-ui.min.css", Directory.CSSDir);
	}

	public static void writeJS()  {
		copyFile("js/excanvas.js", Directory.JSDir);
		copyFile("js/jqplot.barRenderer.min.js", Directory.JSDir);
		copyFile("js/jqplot.categoryAxisRenderer.min.js", Directory.JSDir);
		copyFile("js/jqplot.highlighter.min.js", Directory.JSDir);
		copyFile("js/jqplot.pieRenderer.min.js", Directory.JSDir);
		copyFile("js/jqplot.pointLabels.min.js", Directory.JSDir);
		copyFile("js/jquery.jqplot.min.js", Directory.JSDir);
		copyFile("js/jquery.min.js", Directory.JSDir);
		copyFile("js/jquery-ui.min.js", Directory.JSDir);
	}

	public static void writeIMG()  {
		copyImage("images/fail.png", Directory.IMGDir);
		copyImage("images/pass.png", Directory.IMGDir);
		copyImage("images/skip.png", Directory.IMGDir);
		copyImage("images/zado.png", Directory.IMGDir);
		copyImage("images/loginfo.png", Directory.IMGDir);
		copyImage("images/logpass.png", Directory.IMGDir);
		copyImage("images/logfail.png", Directory.IMGDir);
		copyImage("images/logwarning.png", Directory.IMGDir);
	}

	private static void copyImage(String paramString1, String paramString2)  {
		File localFile = new File(paramString1);
		InputStream localInputStream = HTMLDesignFilesWriter.class.getClassLoader().getResourceAsStream(paramString1);
		FileImageOutputStream localFileImageOutputStream = null;
		try
		{
			localFileImageOutputStream = new FileImageOutputStream(new File(paramString2 + Directory.SEP + localFile.getName()));
			int i = 0;
			while ((i = localInputStream.read()) >= 0) {
				localFileImageOutputStream.write(i);
			}
			localFileImageOutputStream.close();
			return;
		}
		catch (Exception localException2) {}finally
		{
			try
			{
				localInputStream.close();
				localFileImageOutputStream.close();
				localFile = null;
			}
			catch (Exception localException4)
			{
				localInputStream = null;
				localFileImageOutputStream = null;
				localFile = null;
			}
		}
	}

	private static void copyFile(String copyFrom, String copyTo)  {
		File localFile = new File(copyFrom);
		InputStream localInputStream = HTMLDesignFilesWriter.class.getClassLoader().getResourceAsStream(copyFrom);
		FileOutputStream localFileOutputStream = null;
		try
		{
			localFileOutputStream = new FileOutputStream(copyTo + Directory.SEP + localFile.getName());
			int i = 0;
			while ((i = localInputStream.read()) >= 0) {
				localFileOutputStream.write(i);
			}
			return;
		}
		catch (FileNotFoundException localFileNotFoundException) {}catch (IOException localIOException) {}finally
		{
			try
			{
				localInputStream.close();
				localFileOutputStream.close();
				localFile = null;
			}
			catch (Exception localException4)
			{
				localInputStream = null;
				localFileOutputStream = null;
				localFile = null;
			}
		}
	}
}

