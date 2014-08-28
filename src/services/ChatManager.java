package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.directwebremoting.ScriptSession;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;

import pojo.MessageInfo;

public class ChatManager {

	public void sendMessage(String msg) {

		Collection<ScriptSession> scriptSessions = new ArrayList<ScriptSession>();
		Collection sessionsByPage = WebContextFactory.get().getScriptSessionsByPage("/dwr3_demo/a.jsp");
		scriptSessions.addAll(sessionsByPage);

		List<MessageInfo> messageList = new ArrayList<MessageInfo>();
		MessageInfo messageInfo = new MessageInfo(msg);
		messageList.add(messageInfo);
		
		Util receiverUtil = new Util(scriptSessions);
		receiverUtil.addOptions("messageList", messageList, "msg");
		
		new Deal(msg).run();
	}
}
