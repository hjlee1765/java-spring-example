package examples.boot.myshop.security;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class MemberInfoArgumentResolver implements HandlerMethodArgumentResolver {
    @Override   //컨트롤러의 파라미터가 5개면 이 매서드가 5번호출된다. true리턴하면?
    public boolean supportsParameter(MethodParameter parameter) {
        if(parameter.getParameterType() == MemberInfo.class){
            return true;
        }
        return false;
    }

    //argument resolver가 컨트롤러에 파라미터를 넣어준거다.
    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        MemberInfo memberInfo = new MemberInfo(5L, "urstory@gmail.com");
        return memberInfo;
    }
}
