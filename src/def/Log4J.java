package def;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.SimpleLayout;
public class Log4J {

	private static final Logger Log;
	static {
		Log = Logger.getRootLogger();
	}
	public static void main(String[] args) {
		//Appender consoleAppender = new RollingFileAppender();
		//Appender consoleAppender = new ConsoleAppender();
Log.trace("traceS");
Log.fatal("Fatal");
	}

}
