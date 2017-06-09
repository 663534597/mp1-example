package com.example;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 * An example of an application that uses XMLPULL V1 API.
 * @author <a href="http://www.extreme.indiana.edu/~aslom/">Aleksander Slominski</a>
 */
public class XmlPullApp {

	public static void main(String args[]) throws XmlPullParserException, IOException {
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);
		XmlPullParser xpp = factory.newPullParser();
		xpp.setInput(XmlPullApp.class.getResourceAsStream("/compile-config.xml"), "UTF-8");

		XmlPullApp app = new XmlPullApp();
		app.processDocument(xpp);
	}

	public void processDocument(XmlPullParser xpp) throws XmlPullParserException, IOException {
		int eventType = xpp.getEventType();
		do {
			if (eventType == XmlPullParser.START_DOCUMENT) {
				System.out.println("Start document");
			} else if (eventType == XmlPullParser.END_DOCUMENT) {
				System.out.println("End document");
				break;
			} else if (eventType == XmlPullParser.START_TAG) {
				processStartElement(xpp);
			} else if (eventType == XmlPullParser.END_TAG) {
				processEndElement(xpp);
			} else if (eventType == XmlPullParser.TEXT) {
				processText(xpp);
			}
			eventType = xpp.next();
		} while (true);
	}

	public void processStartElement(XmlPullParser xpp) {
		String name = xpp.getName();
		String uri = xpp.getNamespace();
		if ("".equals(uri)) {
			System.out.println("Start element: " + name);
		} else {
			System.out.println("Start element: {" + uri + "}" + name);
		}

		if (xpp.getAttributeCount() > 0) {
			for (int i = 0; i < xpp.getAttributeCount(); i++) {
				System.out.println(xpp.getAttributeName(i) + " = " + xpp.getAttributeValue(i));
			}
		}
	}

	public void processEndElement(XmlPullParser xpp) {
		String name = xpp.getName();
		String uri = xpp.getNamespace();
		if ("".equals(uri))
			System.out.println("End element: " + name);
		else
			System.out.println("End element:   {" + uri + "}" + name);
	}

	int holderForStartAndLength[] = new int[2];

	public void processText(XmlPullParser xpp) throws XmlPullParserException {
		char ch[] = xpp.getTextCharacters(holderForStartAndLength);
		int start = holderForStartAndLength[0];
		int length = holderForStartAndLength[1];
		System.out.print("Characters:    \"");
		for (int i = start; i < start + length; i++) {
			switch (ch[i]) {
				case '\\':
					System.out.print("\\\\");
					break;
				case '"':
					System.out.print("\\\"");
					break;
				case '\n':
					System.out.print("\\n");
					break;
				case '\r':
					System.out.print("\\r");
					break;
				case '\t':
					System.out.print("\\t");
					break;
				default:
					System.out.print(ch[i]);
					break;
			}
		}
		System.out.print("\"\n");
	}
}
