package wjh.xml;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Dom4jXML {
	public static void main(String[] args) throws Exception {
		//��ȡXML�ĵ�������Document����
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("xml/contact.xml"));
		//System.out.println(doc);
		//�õ�����ǩ
		Element rootElem=doc.getRootElement();
		System.out.println("����ǩ������ֵ��"+rootElem.getText());
		String rootName=rootElem.getName();
		System.out.println(rootName);
//		Element contactElem=rootElem.element("contact");
//		System.out.println(contactElem.getName());
		
/*		@SuppressWarnings("unchecked")
		Iterator<Element> it=rootElem.elementIterator("contact");
		while(it.hasNext()){
			Element elem=it.next();
			System.out.println(elem.getName());
		}*/
		//�õ�����ǩ�µ������ӱ�ǩ
		List<Element> list=rootElem.elements();
		for(Element e:list){
			System.out.println(e.getName()+" "+e.element("name").getText());
		}
//		String s=rootElem.element("contact").element("name").getText();
		String s=rootElem.element("contact").elementText("name");
		System.out.println(s);
		method1(rootElem);
	}
	/**
	 * ��ȡ��ǩ������ֵ(��֪������),eg<contact id="1"></contact>
	 * �����ʾ1
	 * @param elem ���ڵ�
	 */
	public static void method1(Element elem){
		Element contactElem=elem.element("contact");
//		String s=contactElem.attributeValue("id");
//		System.out.println(s);
		//
//		Attribute attribute = contactElem.attribute("id");
//		System.out.println(attribute.getName()+"="+attribute.getValue());
		//�õ���������
		@SuppressWarnings("unchecked")
		List<Attribute> attributes = contactElem.attributes();
		for(Attribute a:attributes){
			System.out.println(a.getName()+"="+a.getValue());
		}
		
	}
}
