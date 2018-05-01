package cn.opt.serviceimpl;

import cn.opt.mapper.MessageMapper;
import cn.opt.po.Message;
import cn.opt.service.MessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	public MessageMapper messageMaaper;

	public void addMes(Message mes) {
		this.messageMaaper.insert(mes);
	}

	public List<Message> getAllMes() {
		List list = this.messageMaaper.selectByExample(null);
		return list;
	}
}