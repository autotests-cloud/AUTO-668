package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("FESB")
    void generatedTest() {
        step("open(\"http://192.168.194.69:8181/manager", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#login\").setValue(\"root\");/login/?logout\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#password\").setValue(\"fesb1!\").pressEnter();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"[class*=main_sidebar ]\").should(visible);", () -> {
            step("// todo: just add selenium action");
        });

        step("$(byText(\"Общая информация\")).should(appear);", () -> {
            step("// todo: just add selenium action");
        });
    }
}