import UpperMenuPages.CreateAccountPage;
import Util.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CreateAccountPageTest extends UseCaseBase {
    private static CreateAccountPage createAccountPage;

    @BeforeAll
    public static void pageSetup() {
        createAccountPage = new CreateAccountPage();
    }
    @BeforeEach
    public void beforeTest(){
        createAccountPage.navigateToCreatePage();
    }

//    @ParameterizedTest
//    @ValueSource(strings = {CreateAccountPage.IncompleteMail_Field_Text,CreateAccountPage.NameRussian_Field_Text,CreateAccountPage.specialChar_Field_Text})
//       если у меня тест состоит тоько с параметразд то что я не смогу ничего сделать?потому что он мнпе выдает ошибку что нельзя анноттировать тут
}
