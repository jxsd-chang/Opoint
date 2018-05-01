package cn.opt.controller;

import cn.opt.po.Message;
import cn.opt.service.MessageService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/MessageController" })
public class MessageController {

	@Autowired
	private MessageService messageService;

	@RequestMapping({ "/getMessage.action" })
	public String getMessage(String info) {
		Message message = new Message();
		message.setMesInfo(info);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		String format = dateFormat.format(new Date());
		message.setMesTime(format);
		this.messageService.addMes(message);
		return "reback";
	}

	@RequestMapping({ "/getAllMes.action" })
	@ResponseBody
	public List<Message> getAllMes() {
		return this.messageService.getAllMes();
	}
}