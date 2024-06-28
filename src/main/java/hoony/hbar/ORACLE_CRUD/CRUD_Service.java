package hoony.hbar.ORACLE_CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRUD_Service {

    private final CRUD_Repository2 crudRepository;

    @Autowired
    public CRUD_Service(CRUD_Repository2 crudRepository) {
        this.crudRepository = crudRepository;
    }



    // Create
    public void create(MENU_DTO menu){
        // proof 연산
        crudRepository.save(menu);
    }

    // Read - 다양한 조회(검색)

    // ReadAll
    public List<MENU_DTO> readAll(){
//        return crudRepository.findAll();

        List<MENU_DTO> menus = crudRepository.findAll();
        // 출력
        System.out.println("Service -> readAll() -> menus = " + menus);
        System.out.println("Service -> readAll() -> menu 갯수 = " + menus.size());

        return menus;
    }


    // Update
    public void update(MENU_DTO menu){
        // proof 연산
        crudRepository.update(menu);
    }

    // Delete
    public void delete(MENU_DTO menu){
        crudRepository.delete(menu);
    }


}
