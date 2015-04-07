import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InserirProduto{
	public static void main(String[] args) {

			EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("lojavirtualDB");
					EntityManager em = factory.createEntityManager();
					Produto p = new Produto();
					p.setNome("calça");
					p.setPreco(15.00);
					Produto p1 = new Produto();
					p1.setNome("shorts");
					p1.setPreco(25.00);
					em.getTransaction().begin();
					em.persist(p);
					em.persist(p1);
					em.getTransaction().commit();
				}
}