import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.kimschool.manage.entity.User_Info;

public class App {

	public static void main(String[] args) {

		// JPA 사용에 필요한 필수 객체
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
		EntityManager em = emf.createEntityManager();

		// select * from user_info where no = 1;
		User_Info result1 = em.find(User_Info.class, 1);

		System.out.println(result1);

	}

}
