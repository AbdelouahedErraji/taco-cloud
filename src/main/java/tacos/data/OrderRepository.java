package tacos.data;

import org.springframework.data.repository.CrudRepository;

import tacos.entity.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
	/* List<TacoOrder> findByDeliveryZip(String deliveryZip); */
}
