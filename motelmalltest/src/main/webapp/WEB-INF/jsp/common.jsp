<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="webtxc" value="${pageContext.request.contextPath}" />
<c:set var="logUser" value="${sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.user}" />