package ru.gb.java_Sergey.lection2GB;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
       // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);

        //SimpleFormatter sFormat = new SimpleFormatter();
       XMLFormatter xml = new XMLFormatter();
       // ch.setFormatter(sFormat);
       fh.setFormatter(xml);

        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}
