package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.NoteMapper;
import cn.opt.po.Note;
import cn.opt.po.NoteExample;
import cn.opt.po.NoteExample.Criteria;
import cn.opt.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteMapper noteMapper;
	
	@Override
	public void writeNote(Integer noteUser, Integer brushId, String noteInfo, String noteTime) {
		Note note = new Note();
		note.setNoteUser(noteUser);
		note.setBrushId(brushId);
		note.setNoteInfo(noteInfo);
		note.setNoteTime(noteTime);
		noteMapper.insertSelective(note);
	}

	@Override
	public List<Note> getAllNote(Integer noteUser,Integer brushid) {
		NoteExample example = new NoteExample();
		Criteria criteria = example.createCriteria();
		criteria.andNoteUserEqualTo(noteUser);
		criteria.andBrushIdEqualTo(brushid);
		List<Note> list = noteMapper.selectByExample(example);
		return list;
	}

}
