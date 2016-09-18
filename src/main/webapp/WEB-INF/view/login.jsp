<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>用户登录</h2>
<s:form theme="simple" action="login" method="post">
  <s:actionerror/>
  <p><label>邮箱:</label><s:textfield name="email"/></p>
  <p><label>密码:</label><s:password name="password"/></p>
  <p><s:submit value="登录" cssClass=""/></p>
  <p><a href="index.jsp?page=register">注册</a></p>
</s:form>