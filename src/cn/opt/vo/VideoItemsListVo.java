package cn.opt.vo;

import java.util.List;

import cn.opt.po.CustomVideo;

public class VideoItemsListVo {

	private String bigTag;//视频大目录
	
	private List<CustomVideo> vioList;

	@Override
	public String toString() {
		return "VideoItemsListVo [bigTag=" + bigTag + ", vioList=" + vioList + "]";
	}

	public String getBigTag() {
		return bigTag;
	}

	public void setBigTag(String bigTag) {
		this.bigTag = bigTag;
	}

	public List<CustomVideo> getVioList() {
		return vioList;
	}

	public void setVioList(List<CustomVideo> vioList) {
		this.vioList = vioList;
	}

	
	
	
}
