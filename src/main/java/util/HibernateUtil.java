package util;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	private static StandardServiceRegistry registry = null;
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			try {
				
				registry = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources sources = new MetadataSources(registry);
				Metadata metadata = sources.getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return sessionFactory;
	}

}
