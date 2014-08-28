function init() {
	dwr.engine.setActiveReverseAjax(true);
}

function send(){
	var msg=dwr.util.getValue("msg");
	chatManager.sendMessage(msg);
	dwr.util.setValue("msg","");
}