package com.mzb.myblog.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzb.myblog.domain.AccessRecord;
import com.mzb.myblog.mapper.AccessRecordMapper;
import com.mzb.myblog.service.AccessRecordService;

@Service("accessRecordService")
public class AccessRecordServiceImpl extends BaseServiceImpl<AccessRecord, Long> implements AccessRecordService {

	@Autowired
	private AccessRecordMapper accessRecordMapper;
	
	@Override
	protected void initMapper() {
		mapper = this.accessRecordMapper;
	}

}
