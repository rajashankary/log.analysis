package etl.engine.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;

import etl.engine.ETLLog;
import etl.engine.EngineUtil;
import etl.util.ScriptEngineUtil;
import etl.util.VarType;

public class TestEngineUtil {
	public static final Logger logger = Logger.getLogger(TestEngineUtil.class);
	private ETLLog getETLLog(){
		ETLLog etllog = new ETLLog();
		etllog.setActionName("test");
		etllog.setStart(new Date());
		etllog.setEnd(new Date());
		return etllog;
	}
	
	@Test
	public void testNormalSend(){
		EngineUtil.setConfFile("etlengine_enable_kafka.properties");
		EngineUtil.getInstance().sendLog(getETLLog());
		EngineUtil.getInstance().getProducer().flush();
	}
	
	@Test
	public void testNotSend(){
		EngineUtil.setConfFile("etlengine.properties");
		EngineUtil.getInstance().sendLog(getETLLog());
	}
	
	@Test
	public void testAbnormalSend(){
		EngineUtil.setConfFile("etlengine_bad_kafka.properties");
		EngineUtil.getInstance().sendLog(getETLLog());
	}
	
	@Test
	public void testJsEngineInvokeJava(){
		Map<String, Object> vars = new HashMap<String, Object>();
		String exp = "var telecomUtil = Java.type(\"etl.telecom.TelecomUtil\"); telecomUtil.processE164('1234');";
		String output = (String) ScriptEngineUtil.eval(exp, VarType.STRING, vars);
		logger.info(output);
	}
	
	@Test
	public void testJsEnginePassingMap(){
		Map<String, Object> vars = new HashMap<String, Object>();
		Map<String, String> fields = new HashMap<String, String>();
		fields.put("abc", "abcValue");
		vars.put("fields", fields);
		String exp = "fields['abc'];";
		String output = (String) ScriptEngineUtil.eval(exp, VarType.STRING, vars);
		logger.info(output);
	}
}