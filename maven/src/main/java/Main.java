import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args){
        UserDetails user = new UserDetails(1, "user1");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(user);
//        session.getTransaction().commit();
    }
}
