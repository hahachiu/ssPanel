<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--12-col mdl-grid">
  	<h1>节点！</h1>
  	<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
	  <thead>
	    <tr>
	      <th class="mdl-data-table__cell--non-numeric">节点</th>
	      <th>状态</th>
	      <th>地址</th>
	      <th>加密</th>
	      <th>倍率</th>
	      <th>说明</th>
	      <th>操作</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<s:iterator value="nodes">
		    <tr>
		      <td class="mdl-data-table__cell--non-numeric"><s:property value="nodeName"/></td>
		      <td><s:property value="state"/></td>
		      <td><s:property value="address"/></td>
		      <td><s:property value="encryption"/></td>
		      <td><s:property value="ratio"/></td>
		      <td><s:property value="detail"/>
		      	<a class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent">
				  二维码
				</a>
		      </td>
		    </tr>
		</s:iterator>
	  </tbody>
	</table>
  </div>
</div>