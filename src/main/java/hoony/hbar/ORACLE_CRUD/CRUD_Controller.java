package hoony.hbar.ORACLE_CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CRUD_Controller {

    final CRUD_Service crudService;

    @Autowired
    public CRUD_Controller(CRUD_Service crudService) {
        this.crudService = crudService;
    }

    @RequestMapping("/crud")
    public String crudPage(Model model) {
        // 전체 조회
        List<MENU_DTO> menus = crudService.readAll();
        model.addAttribute("menus", menus);

        return "crud/crudTestPage";
    }



}
