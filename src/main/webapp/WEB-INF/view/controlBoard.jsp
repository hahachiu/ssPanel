<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>DATABOARD</h1>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--12-col mdl-grid">
  	<h1>公告</h1>
  	<p>这是一条公告</p>
  </div>
</div>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--6-col mdl-grid">
  	<h1>更新日志</h1>
  	<s:action name="logs" executeResult="true"/>
  </div>
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--6-col mdl-grid">
  	<h1>签到</h1>
  	<p>22小时内可以签到一次</p>
  	<a class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect">
  		签到
  	</a>
  </div>
</div>