<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>我的SHADOWSOCKS</h1>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--6-col mdl-grid">
  	<h1>订单详情</h1>
  	<p><label>订单编号：</label><s:property value="id"/></p>
	<p><label>期限：</label><s:property value="month"/></p>
	<p><label>端口：</label><s:property value="port"/></p>
	<p><label>密码：</label><s:property value="password"/></p>
	<p>
  		<a class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent" href="index.jsp">
		续费
	 	</a>
	</p>
  </div>
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--6-col mdl-grid">
  	<h1>说明/密码修改</h1>
  	<p>有任何问题请通过邮箱ss@orx.me 联系我们</p>
  	<p>部分节点使用的流量会按照百分比折算，请注意查看说明。</p>
  	<s:form theme="simple" action="updatePassword" method="post">
	  <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
	    <s:password name="password" cssClass="mdl-textfield__input"/>
	  	<label class="mdl-textfield__label" for="sample4">更新密码</label>
	    <p>
	    	<s:submit value="确认" cssClass="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent"/>
	    </p>
	  </div>
	</s:form>
  </div>
</div>
<s:action name="nodes" executeResult="true"/>