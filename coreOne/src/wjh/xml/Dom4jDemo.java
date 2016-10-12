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
		//��ø���ǩ
		Element rootElem=doc.getRootElement();
		//��ø���ǩ�������ӱ�ǩ
		getChildElement(rootElem);
	}
	
	/**
	 * ��ȡ��ǰ��ǩ���ӱ�ǩ��������ֵ���ı�
	 * @param e ����ı�ǩ
	 * @return 
	 */
	public void getChildElement(Element elem){
		System.out.print(elem.getName());
		//��ӡ�ı�
		String content=elem.getText();
		System.out.println(":"+content);   //�ı���ʾ�е�С����
		//��ӡ�������ֺ�����ֵ
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
