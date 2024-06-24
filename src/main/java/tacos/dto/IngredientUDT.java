package tacos.dto;

//import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import tacos.entity.Ingredient;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
//@UserDefinedType("ingredient")
public class IngredientUDT {
	private final String name;
	private final Ingredient.Type type;
}
