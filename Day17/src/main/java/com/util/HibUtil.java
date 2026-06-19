package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {

    private static SessionFactory sf;

    static {
        Configuration conf = new Configuration().configure();
        sf = conf.buildSessionFactory();
    }

    public static SessionFactory getSf() {
        return sf;
    }

    public static void closeFactory() {
        if (sf != null) {
            sf.close();
        }
    }
}