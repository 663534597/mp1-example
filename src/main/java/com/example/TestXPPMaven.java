/**
 * 
 */
package com.example;

import java.io.StringWriter;
import org.apache.commons.lang.time.StopWatch;
import com.example.io.Model;
import com.example.io.xpp3.MavenXpp3Reader;
import com.example.io.xpp3.MavenXpp3Writer;

/**
 * @ClassName: TestXPPMaven
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chengj@justep.com
 * @date 2017-06-09 13:39:48
 */
public class TestXPPMaven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch watch = new StopWatch();
		watch.start();
		MavenXpp3Reader reader = new MavenXpp3Reader();
		MavenXpp3Writer writer = new MavenXpp3Writer();
		try {
			Model model = reader.read(TestXPPMaven.class.getResourceAsStream("/pom.xml"));
			watch.stop();
			System.out.println(model.toString());
			System.out.println(watch.toString());

			watch.reset();
			watch.start();
			StringWriter buffer = new StringWriter();
			writer.write(buffer, model);
			watch.stop();
			System.out.println(watch.toString());
			System.out.println(buffer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
