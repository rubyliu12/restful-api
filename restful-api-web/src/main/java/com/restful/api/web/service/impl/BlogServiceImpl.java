package com.restful.api.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.restful.api.web.entity.Blog;
import com.restful.api.web.mapper.BlogMapper;
import com.restful.api.web.service.IBlogService;

/**
 *
 * Blog 表数据服务层接口实现类
 *
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

	@Autowired private BlogMapper blogMapper;
	
	@Override
	public Page<Map<Object, Object>> selectBlogPage(Page<Map<Object, Object>> page) {
		// TODO Auto-generated method stub
		
		List<Map<Object, Object>> list = blogMapper.selectMap(page);
		page.setRecords(list);
		return page;
	}
	
}