package cn.service.message;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.message.MessageMapper;
import cn.pojo.Message;

@Service
public class MessageServiceImpl implements MessageService {
	@Resource
	private MessageMapper messageMapper;
	public MessageMapper getMessageMapper() {
		return messageMapper;
	}
	public void setMessageMapper(MessageMapper messageMapper) {
		this.messageMapper = messageMapper;
	}
	@Override
	public List<Message> findBy(Message message) {
		return messageMapper.findBy(message);
	}

}
