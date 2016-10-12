package wjh.xml;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class Dom4jDemo{

	@Test
	public void test1() throws Exception{
		SAXReader reader=new SAXReader();
		Document doc = reader.read(new File("xml/contact.xml"));
		//获得根标签
		Element rootElem=doc.getRootElement();
		//获得跟标签的所有子标签
		getChildElement(rootElem);
	}
	
	/**
	 * 获取当前标签的子标签名、属性值、文本
	 * @param e 输入的标签
	 * @return 
	 */
	public void getChildElement(Element elem){
		System.out.print(elem.getName());
		//打印文本
		String content=elem.getText();
		System.out.println(":"+content);   //文本显示有点小问题
		//打印属性名字和属性值
		List<Attribute> attributes = elem.attributes();
		for(Attribute a:attributes){
			System.out.println(a.getName()+"="+a.getValue());
		}
		//
		List<Element> list=elem.elements();
		for(Element e:list){
			getChildElement(e);
		}
	}
}
