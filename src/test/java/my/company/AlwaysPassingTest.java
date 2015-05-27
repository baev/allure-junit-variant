package my.company;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import static org.junit.Assert.assertTrue;

/**
 * @author Boris Serdyuk just-boris@yandex-team.ru
 *         Date: 12/12/13
 */
@Features(Behaviors.SimpleStories.title)
@Stories(Behaviors.SimpleStories.SUCCESS_STORY)
public class AlwaysPassingTest {

    @TestCaseId("1")
    @Test
    public void testOne() throws Exception {
        assertTrue(true);
    }

    @TestCaseId("2")
    @Test
    public void testTwo() throws Exception {
        assertTrue(true);
    }

    @TestCaseId("3")
    @Test
    public void testThree() throws Exception {
        assertTrue(true);
    }

    @TestCaseId("4")
    @Test
    public void testFour() throws Exception {
        assertTrue(true);
    }

}
