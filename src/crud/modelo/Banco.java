package crud.modelo;

import crud.entidades.Cidade;
import crud.entidades.Estado;
import crud.entidades.ItensPedido;
import crud.entidades.Pedido;
import crud.entidades.Pessoa;
import crud.entidades.Produto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Banco {

    private static final SessionFactory factory;
    private static final ThreadLocal sessionThread = new ThreadLocal();
    private static final ThreadLocal transactionThread = new ThreadLocal();

    public static Session getSession() {
        Session session = (Session) sessionThread.get();
        if ((session == null) || (!(session.isOpen()))) {
            session = factory.openSession();
            sessionThread.set(session);
        }
        return ((Session) sessionThread.get());
    }

    public static void closeSession() {
        Session session = (Session) sessionThread.get();
        if ((session != null) && (session.isOpen())) {
            sessionThread.set(null);
            session.close();
        }
    }

    public static void beginTransaction() {
        Transaction transaction = getSession().beginTransaction();
        transactionThread.set(transaction);
    }

    public static void commitTransaction() {
        Transaction transaction = (Transaction) transactionThread.get();
        if ((transaction != null) && (!(transaction.wasCommitted())) && (!(transaction.wasRolledBack()))) {
            transaction.commit();
            transactionThread.set(null);
        }
    }

    public static void rollbackTransaction() {
        Transaction transaction = (Transaction) transactionThread.get();
        if ((transaction != null) && (!(transaction.wasCommitted())) && (!(transaction.wasRolledBack()))) {
            transaction.rollback();
            transactionThread.set(null);
        }
    }

    static {
        try {
            factory = new AnnotationConfiguration()
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect")
                    .setProperty("hibernate.connection.driver_class", "org.hsqldb.jdbc.JDBCDriver")
                    .setProperty("hibernate.connection.url", "jdbc:hsqldb:file:dsoo;shutdown=true;hsqldb.write_delay=false")
                    .setProperty("hibernate.connection.username", "SA")
                    .setProperty("hibernate.connection.password", "")
                    .setProperty("hibernate.hbm2ddl.auto", "update")
                    .setProperty("hibernate.c3p0.max_size", "10")
                    .setProperty("hibernate.c3p0.min_size", "2")
                    .setProperty("hibernate.c3p0.timeout", "5000")
                    .setProperty("hibernate.c3p0.max_statements", "10")
                    .setProperty("hibernate.c3p0.idle_test_period", "3000")
                    .setProperty("hibernate.c3p0.acquire_increment", "2")
                    .setProperty("show_sql", "true")
                    .setProperty("use_outer_join", "true")
                    .setProperty("hibernate.generate_statistics", "true")
                    .setProperty("hibernate.use_sql_comments", "true")
                    .setProperty("hibernate.format_sql", "true")
                    .addAnnotatedClass(Estado.class)
                    .addAnnotatedClass(Cidade.class)
                    .addAnnotatedClass(Pessoa.class)
                    .addAnnotatedClass(Produto.class)
                    .addAnnotatedClass(Pedido.class)
                    .addAnnotatedClass(ItensPedido.class)
                    .buildSessionFactory();
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

}

