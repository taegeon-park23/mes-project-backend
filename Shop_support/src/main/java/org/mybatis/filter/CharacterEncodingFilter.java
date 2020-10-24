package org.mybatis.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	private String encoding;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO : filter 초기화
		
		// web.xml에서 선언한 filter 태그 내의 init-param을 가져오는 코드.
		encoding = filterConfig.getInitParameter("encodingCode");
		if(encoding == null) {
			encoding = "utf-8";
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO : 서블릿 호출 직전 처리 공간
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		chain.doFilter(request, response);
		// TODO : 서블릿 호출 후 처리 공간
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
