package spring.el.parser;

//import java.util.Iterator;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Tester {
	@Value("#{list}")
	private LinkedList<Object> numbers;
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/el/parser/config.xml");
		ExpressionParser parser = new SpelExpressionParser();
//		Expression expression = parser.parseExpression("12+23");
//		Expression expression = parser.parseExpression("T(java.lang.Math).sqrt(100)");
//		Expression expression = parser.parseExpression("T(java.lang.Math).PI");
//		Expression expression = parser.parseExpression("new java.lang.StringBuffer('sleeping nekoxj')");
//		Expression expression = parser.parseExpression("list");
	}
}
