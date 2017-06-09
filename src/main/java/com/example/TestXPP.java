/**
 * 
 */
package com.example;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 * @ClassName: TestXPP
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chengj@justep.com
 * @date 2017-06-08 17:44:00
 */
public class TestXPP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		XmlPullParserFactory factory;
		try {
			factory = XmlPullParserFactory.newInstance();
			factory.setNamespaceAware(true);
			XmlPullParser xpp = factory.newPullParser();
			long start = System.currentTimeMillis();
			xpp.setInput(TestXPP.class.getResourceAsStream("/compile-config.xml"), "utf-8");
			int eventType = xpp.getEventType();
			while (true) {
				switch (eventType) {
					case XmlPullParser.START_DOCUMENT:
						System.out.println("Start of Document");
						break;
					case XmlPullParser.START_TAG:
						System.out.println("Start of Tag: " + xpp.getName());
						if (xpp.getAttributeCount() > 0) {
							for (int i = 0; i < xpp.getAttributeCount(); i++) {
								System.out.println(xpp.getAttributeName(i) + " = " + xpp.getAttributeValue(i));
							}
						}
						break;
					case XmlPullParser.END_TAG:
						System.out.println("END_TAG: " + xpp.getName());
						break;
					case XmlPullParser.TEXT:
						System.out.println("Text: " + xpp.getText());
						break;
					case XmlPullParser.COMMENT:
						break;
				}
				if (eventType == XmlPullParser.END_DOCUMENT)
					break;
				eventType = xpp.next();
//				eventType = xpp.nextTag();
//				eventType = xpp.nextToken();
			}
			System.out.println("XPP3耗时：" + (System.currentTimeMillis() - start) + " ms");
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
