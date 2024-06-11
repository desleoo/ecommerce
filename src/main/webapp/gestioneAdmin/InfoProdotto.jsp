<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!--
=========================================================
* Material Kit 2 - v3.0.0
=========================================================

* Product Page:  https://www.creative-tim.com/product/material-kit 
* Copyright 2021 Creative Tim (https://www.creative-tim.com)
* Coded by www.creative-tim.com

 =========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. -->
<!DOCTYPE html>
<html lang="en" itemscope itemtype="http://schema.org/WebPage">

<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="apple-touch-icon" sizes="76x76" href="../../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../../assets/img/favicon.png">
  <title>
ECOMMERCECORSODELEO  </title>
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900|Roboto+Slab:400,700" />
  <!-- Nucleo Icons -->
  <link href="../../assets/css/nucleo-icons.css" rel="stylesheet" />
  <link href="../../assets/css/nucleo-svg.css" rel="stylesheet" />
  <!-- Font Awesome Icons -->
  <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
  <!-- Material Icons -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Round" rel="stylesheet">
  <!-- CSS Files -->
  <link id="pagestyle" href="../../assets/css/material-kit.css?v=3.0.0" rel="stylesheet" />
</head>

<body class="blog-author bg-gray-200">
  <!-- Navbar  -->
  	<s:if  test="#session.admin!=null" > 
		<jsp:include page="/navbar/NavPrAd.jsp" />
	</s:if>
	<s:elseif test="#session.account!=null">
    	<jsp:include page="/navbar/NavPrAc.jsp" />
	</s:elseif>
  <!-- End Navbar -->
  <!-- -------- START HEADER 4 w/ search book a ticket form ------- -->
 
  <!-- -------- END HEADER 4 w/ search book a ticket form ------- -->
  <div class="card card-body blur shadow-blur mx-3 mx-md-4 mt-n6 mb-4">
    <!-- START Testimonials w/ user image & text & info -->
    
    <section>
  <div class="container py-4">
    <div class="row">
      <div class="col-lg-7 mx-auto d-flex justify-content-center flex-column">
        <h3 class="text-center">Gestione Prodotto </h3>
        
        <s:url var="myUrl" action="SalvaModificaP.action" >
      <s:param value="%{p.idprodotto}" name="p.idprodotto">%idprodotto</s:param>
   </s:url>
        
        <s:fielderror/>
        
        <s:form action="SalvaModificaP" role="form" >
          <div class="card-body">
            <div class="row"> 
            
 			<div hidden class="col-md-6" >
                <div class="input-group input-group-dynamic mb-4 hidden">
                  <label class="form-label"><s:property value="p.idprodotto"/></label>
                    <s:textfield name="p.idprodotto"  class="form-control" theme="simple" />
                </div>
              </div>              
            
              
              <div class="col-md-6">
                <div class="input-group input-group-dynamic mb-4">
                  <label class="form-label"><s:property value="p.nomep"/></label>
                    <s:textfield name="p.nomep"  class="form-control" theme="simple" />
                </div>
              </div>
              <div class="col-md-6 ps-2">
                <div class="input-group input-group-dynamic">
                  <label class="form-label">Descrizione: <s:property value="p.descrizionep"/> </label>
                  <s:textfield name="p.descrizionep"  class="form-control" theme="simple"/>
                </div>
              </div>
               <div class="col-md-6 ps-2">
                <div class="input-group input-group-dynamic">
                  <label class="form-label">Prezzo: &euro; <s:property value="p.prezzo"/> </label>
                  <s:textfield name="p.prezzo"  class="form-control" theme="simple"/>
                </div>
              </div>
            </div>
           <div class="row text-center">
           	<div class="col-md-12 text-center">
              <s:submit  type="button"  class="btn bg-gradient-dark w-100">salva</s:submit>
              </div>
            </div>
          </div>
        </s:form>
        
      </div>
    </div>
  </div>
</section>
    
    
    
    
    
  </div>
  
  <footer class="footer py-5">
    <div class="container z-index-1 position-relative">
      <div class="row">
        <div class="col-lg-4 me-auto mb-lg-0 mb-4 text-lg-start text-center">
          <h6 class="text-dark font-weight-bolder text-uppercase mb-lg-4 mb-3">Material Design</h6>
          <ul class="nav flex-row ms-n3 justify-content-lg-start justify-content-center mb-4 mt-sm-0">
            <li class="nav-item">
              <a class="nav-link text-dark opacity-8" href="https://www.creative-tim.com" target="_blank">
                Home
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-dark opacity-8" href="https://www.creative-tim.com/presentation" target="_blank">
                About
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-dark opacity-8" href="https://www.creative-tim.com/blog" target="_blank">
                Blog
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-dark opacity-8" href="https://www.creative-tim.com" target="_blank">
                Services
              </a>
            </li>
          </ul>
          <p class="text-sm text-dark opacity-8 mb-0">
            Copyright © <script>
              document.write(new Date().getFullYear())
            </script> Material Design by Creative Tim.
          </p>
        </div>
        <div class="col-lg-6 ms-auto text-lg-end text-center">
          <p class="mb-5 text-lg text-dark font-weight-bold">
            The reward for getting on the stage is fame. The price of fame is you can’t get off the stage.
          </p>
          <a href="javascript:;" target="_blank" class="text-dark me-xl-4 me-4 opacity-5">
            <span class="fab fa-dribbble"></span>
          </a>
          <a href="javascript:;" target="_blank" class="text-dark me-xl-4 me-4 opacity-5">
            <span class="fab fa-twitter"></span>
          </a>
          <a href="javascript:;" target="_blank" class="text-dark me-xl-4 me-4 opacity-5">
            <span class="fab fa-pinterest"></span>
          </a>
          <a href="javascript:;" target="_blank" class="text-dark opacity-5">
            <span class="fab fa-github"></span>
          </a>
        </div>
      </div>
    </div>
  </footer>
  <!-- -------- END FOOTER 5 w/ DARK BACKGROUND ------- -->
  <!--   Core JS Files   -->
  <script src="../../assets/js/core/popper.min.js" type="text/javascript"></script>
  <script src="../../assets/js/core/bootstrap.min.js" type="text/javascript"></script>
  <script src="../../assets/js/plugins/perfect-scrollbar.min.js"></script>
  <!--  Plugin for Parallax, full documentation here: https://github.com/wagerfield/parallax  -->
  <script src="../../assets/js/plugins/parallax.min.js"></script>
  <!-- Control Center for Material UI Kit: parallax effects, scripts for the example pages etc -->
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDTTfWur0PDbZWPr7Pmq8K3jiDp0_xUziI"></script>
  <script src="../../assets/js/material-kit.min.js?v=3.0.0" type="text/javascript"></script>
</body>

</html>

