<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="mdl-layout__drawer">
    <span class="mdl-layout-title">
		<s:if test="#session.user==null">
	      <p><a href="index.jsp?page=login">[登录]</a>
	    </s:if>
	    <s:else>
	      <p>
	      hello,<s:property value="#session.user.username"/>
	      </p>
	    </s:else>
	</span>
    <nav class="mdl-navigation">
      <a class="mdl-navigation__link" href="index.jsp?page=controlBoard">
      <i class="material-icons">home</i>控制面板</a>
      <a class="mdl-navigation__link" href="plans.action">
      <i class="material-icons">layers</i>订购</a>
      <a class="mdl-navigation__link" href="showCart.action">
      <i class="material-icons">shopping_cart</i>购物车</a>
      <a class="mdl-navigation__link" href="index.jsp?page=orders">
      <i class="material-icons">list</i>我的ShadowSocks</a>
      <a class="mdl-navigation__link" href="index.jsp?page=user">
      <i class="material-icons">account_circle</i>个人资料</a>
      <a class="mdl-navigation__link" href="index.jsp?page=charge">
      <i class="material-icons">local_atm</i>在线充值</a>
      <a class="mdl-navigation__link" href="index.jsp?page=chargeCode">
      <i class="material-icons">label</i>充值码</a>
      <a class="mdl-navigation__link" href="index.jsp?page=contact">
      <i class="material-icons">email</i>联系我们</a>
      <a class="mdl-navigation__link" href="index.jsp?page=talk">
      <i class="material-icons">people</i>水区</a>
    </nav>
</div>