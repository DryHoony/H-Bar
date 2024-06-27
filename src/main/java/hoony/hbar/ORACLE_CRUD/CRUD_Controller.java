package hoony.hbar.ORACLE_CRUD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CRUD_Controller {

    @RequestMapping("/crud")
    public String crudPage() {
        // static/crud/crudTestPage.html
        return "crud/crudTestPage";
    }

}
