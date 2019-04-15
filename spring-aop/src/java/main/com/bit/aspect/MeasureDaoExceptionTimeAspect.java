package com.bit.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class MeasureDaoExceptionTimeAspect {
	// ex) com.bit.site.repository.BoardDao.insert()
	@Around("execution( * *..repository.*.*(..) ) || execution( * *..service.*.*(..) ) || execution( * *..controller.*.*(..) )")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();	 // 측정 시작

		// Dao Method 수행
		Object result = pjp.proceed();

		stopWatch.stop(); 	// 측정 중지

		String className = pjp.getTarget().getClass().getName();
		String methodName = pjp.getSignature().getName();
		String taskName = className + " : " + methodName;

		System.out.println("[ExecutionTime]["
						+ taskName + "]"
						+ stopWatch.getTotalTimeMillis()
						+ "millis");
		return result;

	}
}
