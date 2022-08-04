import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import ru.yandex.praktikum.Account;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PraktikumTest {

    String name = getZero();
    boolean expected = false;

    public String getZero() {
        String pusto = String.valueOf(Collections.EMPTY_LIST);
        return pusto;
    }

    @Test
    @DisplayName("PraktikumTest") // имя теста
    @Description("Account - check correct new Account without null") // описание теста
    public void praktikumTest() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}

