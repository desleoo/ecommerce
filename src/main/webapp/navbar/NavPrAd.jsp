<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   
   
   
   <nav class="navbar navbar-expand-lg  blur border-radius-xl top-0 z-index-fixed shadow position-absolute my-3 py-2 start-0 end-0 mx-4">
  <div class="container-fluid px-0">
    <a class="navbar-brand font-weight-bolder ms-sm-3"target="_self" href="<s:url action='homepage'/>" rel="tooltip"  data-placement="bottom" target="_blank">
     ECOMMERCECORSODELEO - ADMIN
    </a>
    <button class="navbar-toggler shadow-none ms-2" type="button" data-bs-toggle="collapse" data-bs-target="#navigation" aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon mt-2">
        <span class="navbar-toggler-bar bar1"></span>
        <span class="navbar-toggler-bar bar2"></span>
        <span class="navbar-toggler-bar bar3"></span>
      </span>
    </button>
    <div class="collapse navbar-collapse pt-3 pb-2 py-lg-0 w-100" id="navigation">
		<ul class="navbar-nav navbar-nav-hover ms-auto"  >
		
		
       		 
       		 
     <li class="nav-item dropdown dropdown-hover mx-2">
          <a onclick="window.location.href='<s:url action='/profile'/>'"  class="nav-link ps-2 d-flex cursor-pointer align-items-center" id="dropdownMenuPages" data-bs-toggle="dropdown" aria-expanded="false">
            <i class="material-icons opacity-6 me-2 text-md">account_circle</i>
            <s:property value="#session.account.username"/>
          </a>
        </li>
		
		
			<li class="nav-item dropdown dropdown-hover mx-2" >
				<a onclick="window.location.href='<s:url action='Logout'/>'" class="cursor-pointer align-items-center btn btn-sm  bg-gradient-primary  mb-0 me-1 mt-2 mt-md-0" id="dropdownMenuDocs" data-bs-toggle="dropdown" aria-expanded="false">
					<i class="material-icons opacity-6 me-2 text-md">logout</i>
						Logout
				</a>
       		 </li>
       	</ul>
    </div>
  </div>
</nav>