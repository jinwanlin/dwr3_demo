package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.directwebremoting.ScriptSession;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;

import pojo.MessageInfo;


/**
 * 服务端处理线程
 *
 */
public class Deal implements Runnable {
	
	private String keywords;
	
	public Deal(String keywords){
		this.keywords = keywords;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//返回的数据
		List<MessageInfo> messageList = new ArrayList<MessageInfo>();
		MessageInfo messageInfo = new MessageInfo(keywords);
		messageList.add(messageInfo);
		
		//要返回的页面
		Collection<ScriptSession> scriptSessions = new ArrayList<ScriptSession>();
		Collection sessionsByPage = WebContextFactory.get().getScriptSessionsByPage("/dwr3_demo/b.jsp");
		scriptSessions.addAll(sessionsByPage);

		//调用util方法，往页面推送数据
		Util receiverUtil = new Util(scriptSessions);
		receiverUtil.addOptions("messageList", messageList, "msg");
	}

	

}
