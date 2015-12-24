package org.gaurav.restws.service;

import org.gaurav.restws.vo.TempVO;
import org.springframework.transaction.annotation.Transactional;

public class TempService {
	
	private TempVO tmp = new TempVO();

	@Transactional
	public TempVO getTmp() {
		return tmp;
	}

	public void setTmp(TempVO tmp) {
		this.tmp = tmp;
	}
	

}
