<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<header class="mdl-layout__header">
    <div class="mdl-layout__header-row">
      <!-- Title -->
      <span class="mdl-layout-title">SS-PANEL</span>
      <!-- Add spacer, to align navigation to the right -->
      <div class="mdl-layout-spacer"></div>
      <!-- Navigation. We hide it in small screens. -->
      <button id="demo-menu-lower-right"
	            class="mdl-button mdl-js-button mdl-button--icon">
	      <i class="material-icons">more_vert</i>
	  </button>
	    
	  <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect" for="hdrbtn">
	      <li class="mdl-menu__item"><i class="material-icons">fullscreen</i>全屏</li>
	      <li class="mdl-menu__item">Another Action</li>
	      <li class="mdl-menu__item"><i class="material-icons">delete</i>退出</li>
	  </ul>
    </div>
</header>