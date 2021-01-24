Junit4和Junit5的注解区别
Junit5	    Junit4	        说明
@Test	    @Test	        被注解的方法是一个测试方法。与 JUnit 4 相同。
@BeforeAll	@BeforeClass	被注解的（静态）方法将在当前类中的所有 @Test 方法前执行一次。
@BeforeEach	@Before	        被注解的方法将在当前类中的每个 @Test 方法前执行。
@AfterEach	@After	        被注解的方法将在当前类中的每个 @Test 方法后执行。
@AfterAll	@AfterClass	    被注解的（静态）方法将在当前类中的所有 @Test 方法后执行一次。
@Disabled	@Ignore	        被注解的方法不会执行（将被跳过），但会报告为已执行
Junit4中的@Test是import org.junit.Test;
Jupiter中的@Test是import org.junit.jupiter.api.Test
