package com.knight.mall.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class WholeInterceptor extends HandlerInterceptorAdapter {

	private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(WholeInterceptor.class);

	// 在控制器方法调用前执行
	// 返回值为是否中断，true,表示继续执行（下一个拦截器或处理器）
	// false则会中断后续的所有操作，所以我们需要使用response来响应请求
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		return true;
	}

	// 在控制器方法调用后，解析视图前调用，我们可以对视图和模型做进一步渲染或修改
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		String requestPath = request.getRequestURI();
		
		if (requestPath != null && !"".equals(requestPath) && !requestPath.contains(".")) {
			String requestUrl = request.getScheme() // 当前链接使用的协议
					+ "://" + request.getServerName()// 服务器地址
					+ ":" + request.getServerPort() // 端口号
					+ request.getContextPath();

			//request.setAttribute("appPath", requestUrl);
			modelAndView.addObject("appUrl", requestUrl);
			logger.debug("appUrl:{}", requestUrl);
		}
	}

	// 整个请求完成，即视图渲染结束后调用，这个时候可以做些资源清理工作，或日志记录等
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
