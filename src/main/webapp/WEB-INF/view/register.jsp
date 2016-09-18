<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>用户注册</h2> 
<s:form theme="simple" action="register" method="post">
  <s:actionerror/>   
  <p><label>姓名:</label><s:textfield name="username"/></p>
  <p><label>邮箱:</label><s:textfield name="email"/></p>
  <p><label>密码:</label><s:password name="password"/></p>
  <p><label>确认密码:</label><s:password name="password2"/></p>
  <p><s:submit value="注册"/></p>
</s:form>