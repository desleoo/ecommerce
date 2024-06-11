<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
  
  

  
  <nav class="navbar navbar-expand-lg  blur border-radius-xl top-0 z-index-fixed shadow position-absolute my-3 py-2 start-0 end-0 mx-4">
  <div class="container-fluid px-0">
    <a class="navbar-brand font-weight-bolder ms-sm-3" target="_self" href="<s:url action='LoginForm'/>" rel="tooltip" data-placement="bottom" target="_blank">
     ECOMMERCECORSODELEO
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
		
		<li class="nav-item dropdown dropdown-hover mx-2" >
				<a onclick="window.location.href='<s:url action='LoginForm'/>'" class="cursor-pointer align-items-center btn btn-sm  bg-gradient-primary  mb-0 me-1 mt-2 mt-md-0" id="dropdownMenuDocs" data-bs-toggle="dropdown" aria-expanded="false">
					<i class="material-icons opacity-6 me-2 text-md"></i>
						Vai al tuo account
				</a>
       		 </li>
       		 </ul>
       		  </div>
  </div>
</nav>
  