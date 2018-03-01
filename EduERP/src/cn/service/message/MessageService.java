package cn.service.message;

import java.util.List;
import cn.pojo.Message;
/**
 * 新闻通知公告接口
 * @author cml、cql
 *
 */
public interface MessageService {
	public List<Message> findBy(Message message);
}
