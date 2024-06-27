package hoony.hbar.ORACLE_CRUD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok annotation to create all the getters, setters, equals, hash, and toString methods
@NoArgsConstructor
@AllArgsConstructor
public class CRUD_DTO_MENU {

    private String name;
    private String base1;
    private String base2;
    private String juice1;
    private String juice2;
    private String juice3;
    private String juice4;
    private String ingredients;
    private Integer capacityBase1;
    private Integer capacityBase2;
    private Integer capacityJuice1;
    private Integer capacityJuice2;
    private Integer capacityJuice3;
    private Integer capacityJuice4;
    private String capacityIngredients;
    private String method;
    private Integer proof;
    private String comments;



}
