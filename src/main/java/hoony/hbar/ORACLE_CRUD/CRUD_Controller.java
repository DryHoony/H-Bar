package hoony.hbar.ORACLE_CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CRUD_Controller {

    final CRUD_Service crudService;

    @Autowired
    public CRUD_Controller(CRUD_Service crudService) {
        this.crudService = crudService;
    }

    @RequestMapping("/crud")
    public String crudPage() {
        // 전체 조회
        List<MENU_DTO> menus = crudService.readAll();


        return "crud/crudTestPage";
    }

}
