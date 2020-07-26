package gittasks.TDDandjunit;

import org.junit.Test;

class tddjunit
{
@Test
public void test1() {
check ch = new check();
String a = ch.method("ABCD");
assertEquals("BCD",a);
}
private void assertEquals(String string, String a) {
	
}
@Test
public void test2() {
check ch = new check();
String a = ch.method("AACD");
assertEquals("CD",a);
}
@Test
public void test3() {
check ch = new check();
String a = ch.method("BACD");
assertEquals("BCD",a);
}
@Test
public void test4() {
check ch = new check();
String a = ch.method("BBAA");
assertEquals("BBAA",a);
}
@Test
public void test5() {
check ch = new check();
String a = ch.method("AABAA");
assertEquals("BAA",a);
}
@Test
public void test6() {
check ch = new check();
String a = ch.method("");
assertEquals("",a);
}
@Test
public void test7() {
check ch = new check();
String a = ch.method("A");
assertEquals("",a);
}
@Test
public void test8() {
check ch = new check();
String a = ch.method("B");
assertEquals("B",a);
}
@Test
public void test9() {
check ch = new check();
String a = ch.method("AB");
assertEquals("B",a);
}
@Test
public void test10() {
check ch = new check();
String a = ch.method("BA");
assertEquals("B",a);
}
@Test
public void test11() {
check ch = new check();
String a = ch.method("AA");
assertEquals("",a);
}
@Test
public void test12() {
check ch = new check();
String a = ch.method("BB");
assertEquals("BB",a);
}
}
