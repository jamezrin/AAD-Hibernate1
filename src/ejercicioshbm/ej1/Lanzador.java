package ejercicioshbm.ej1;

import java.io.File;
import java.time.Instant;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import ejercicioshbm.SessionFactoryUtil;

public class Lanzador {
	public static void main(String[] args) {
		System.out.println("Ejercicio 1");
		File cfgPath = new File("resources/ej1/hibernate.cfg.xml");
		SessionFactory factory = SessionFactoryUtil.initSessionFactory(cfgPath);
		
		Seguro seguro1 = new Seguro();
		seguro1.setNif("07328379V");
		seguro1.setNombre("Jaime");
		seguro1.setApe1("Martinez");
		seguro1.setApe2("Rincon");
		seguro1.setCasado('n');
		seguro1.setEdad(20);
		seguro1.setFechaCreacion(Date.from(Instant.now()));
		seguro1.setNumHijos(0);
		seguro1.setTipoSeguro("hogar");
		
		System.out.println("\nProbando inserción");
		probarInsercion(factory, seguro1);
		
		System.out.println("\nProbando lectura");
		probarLectura(factory, seguro1.getIdSeguro());
		
		System.out.println("\nProbando actualización");
		seguro1.setNombre("Jaime Hibernando");
		probarActualizacion(factory, seguro1);
		
		System.out.println("\nProbando lectura despues de actualizar");
		probarLectura(factory, seguro1.getIdSeguro());
		
		System.out.println("\nProbando borrado");
		probarBorrado(factory, seguro1);
	}

	private static void probarInsercion(SessionFactory factory, Seguro seguro) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(seguro);
			tx.commit();
			System.out.println("Inserción correcta");
		} catch (ConstraintViolationException e) {
			if (tx != null) {
				System.err.println("Inserción incorrecta, ya existe un seguro con ese NIF");
				tx.rollback();
			}
		}
		
		session.close();
	}
	
	private static void probarLectura(SessionFactory factory, int id) {
		Session session = factory.openSession();
		Seguro seguro = session.load(Seguro.class, id);
		System.out.printf("Lectura correcta, objeto: %s\n", seguro);
		session.close();
	}
	
	private static void probarActualizacion(SessionFactory factory, Seguro seguro) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(seguro);
			tx.commit();
			System.out.println("Actualización correcta");
		} catch (ConstraintViolationException e) {
			if (tx != null) {
				System.err.println("Actualización incorrecta");
				tx.rollback();
			}
		}
		session.close();
	}
	
	private static void probarBorrado(SessionFactory factory, Seguro seguro) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(seguro);
			tx.commit();
			System.out.println("Borrado correcto");
		} catch (ConstraintViolationException e) {
			if (tx != null) {
				System.err.println("Borrado incorrecto");
				tx.rollback();
			}
		}
		session.close();
	}
}
