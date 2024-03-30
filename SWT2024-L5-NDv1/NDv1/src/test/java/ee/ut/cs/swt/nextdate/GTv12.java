package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {
	//test 1
	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 31, 1913);
	    assertEquals("2/1/1913", string0);
	}
	//test 2
	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 1943, 1943);
	    assertEquals("invalid Input Date", string0);
	}
	//test 3
	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 31, 1974);
	    assertEquals("Invalid Input Date", string0);
	}
	//test 4
	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1968);
	    assertEquals("3/4/1968", string0);
	}
	//test 5
	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1961, 12, 12);
	    String string0 = nextDate0.run(12, 12, 1961);
	    assertEquals("12/13/1961", string0);
	}
	//test 6
	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 30, 1974);
	    assertEquals("7/1/1974", string0);
	}
	//test 7
	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 30, 1946);
	    assertEquals("Invalid Input Date", string0);
	}
	//test 8
	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}
	//test 9
	@Test(timeout = 4000)
	public void testRunWithZeroAndZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 331);
	    String string0 = nextDate0.run(0, 331, 0);
	    assertEquals("invalid Input Date", string0);
	}
	//test 10
	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 11);
	    assertEquals("invalid Input Date", string0);
	}
	//test 11
	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1967);
	    assertEquals("10/11/1967", string0);
	}
	//test 12
	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(49, 49, 49);
	    String string0 = nextDate0.run(49, 49, 49);
	    assertEquals("invalid Input Date", string0);
	}
	//test 13
	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 1989);
	    assertEquals("8/9/1989", string0);
	}
	//test 14
	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 1805);
	    assertEquals("9/10/1805", string0);
	}
	//test 15
	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 2766, 2766);
	    String string0 = nextDate0.run(1, 2766, 2766);
	    assertEquals("invalid Input Date", string0);
	}
	//test 16
	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 1805);
	    assertEquals("4/5/1805", string0);
	}
	//test 17
	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1908);
	    assertEquals("11/12/1908", string0);
	}
	//test 18
	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1380), (-1380), (-1380));
	    String string0 = nextDate0.run(12, 31, 2015);
	    assertEquals("1/1/2016", string0);
	}
	//test 19
	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2164), (-2164), (-2164));
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}
	//test 20
	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1974);
	    assertEquals("3/1/1974", string0);
	}
	//test 21
	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1977, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1977);
	    assertEquals("2/3/1977", string0);
	}
	//test 22
	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1985);
	    assertEquals("Invalid Input Date", string0);
	}
	//test 23
	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1965);
	    assertEquals("7/8/1965", string0);
	}
	//test 24
	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1968);
	    assertEquals("5/6/1968", string0);
	}

}