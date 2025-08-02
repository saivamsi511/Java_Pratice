package com.vamsi.exceptionhandling;

import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4j {
	public static void main(String[] args)
    {
        Layout layout = new PatternLayout(
            "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
        ConsoleAppender consoleAppender
            = new ConsoleAppender(layout);
        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.INFO);
        rootLogger.addAppender(consoleAppender);
    }
}