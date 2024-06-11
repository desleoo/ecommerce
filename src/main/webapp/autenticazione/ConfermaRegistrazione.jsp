<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
 <!DOCTYPE html>
<html lang="en" itemscope itemtype="http://schema.org/WebPage">
 <!--
=========================================================
* Material Kit 2 - v3.0.0
=========================================================

* Product Page:  https://www.creative-tim.com/product/material-kit 
* Copyright 2021 Creative Tim (https://www.creative-tim.com)
* Coded by www.creative-tim.com

 =========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. -->
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <title>
  ECOMMERCECORSODELEO
  </title>
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900|Roboto+Slab:400,700" />
  <!-- Nucleo Icons -->
  <link href="../assets/css/nucleo-icons.css" rel="stylesheet" />
  <link href="../assets/css/nucleo-svg.css" rel="stylesheet" />
  <!-- Font Awesome Icons -->
  <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
  <!-- Material Icons -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Round" rel="stylesheet">
  <!-- CSS Files -->
  <link id="pagestyle" href="../assets/css/material-kit.css?v=3.0.0" rel="stylesheet" />
</head>
 <body class="about-us bg-gray-200">
  
 <div class="page-header align-items-start min-vh-100" style="background-image: url('../assets/imgp/backgroundHP.jpeg');" loading="lazy">
    <span class="mask bg-gradient-dark opacity-6"></span>
    <div class="container my-auto">
 <!-- Navbar Transparent -->
     <jsp:include page="/navbar/NavR.jsp" />
  <!-- End Navbar -->
<div class="card card-body shadow-xl mx-3 mx-md-4 mt-n6">
  <!-- -------- START Features w/ pattern background & stats & rocket
    <section class="pb-5 position-relative bg-gradient-dark mx-n3">
      <div class="container">
        <div class="row">
          <div class="col-md-8 text-start mb-5 mt-5">
            <h3 class="text-white z-index-1 position-relative"> Benvenuto <s:property value="account.username"/></h3>
            <p class="text-white opacity-8 mb-0">Registrazione avvenuta con successo!</p>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-6 col-12">
            <div class="card card-profile mt-4">
              <div class="row">
               
                <div class="col-lg-8 col-md-6 col-12 my-auto">
                  <div class="card-body ps-lg-0">
                    <h5 class="mb-0"><s:property value="cliente.nome"/></h5>
                    <h6 class="text-info">Stai provando a registrarti con la seguente password: <i><s:property value="account.password" /></i>.</h6>
                    <p class="mb-0">I tuoi dati sono:   <br />
		-Nome: <s:property value="cliente.nome"/>.  <br />
        -Cognome: <i><s:property value="cliente.cognome" /></i>.  <br /> 
        -Data di nascita: <i><s:property value="cliente.datanascita" />.  <br /> </i>
        -Telefono: <i><s:property value="cliente.telefono" /></i>.  <br />
        -Email:<i><s:property value="cliente.email" /></i>.</p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="row mt-4">
          <div class="col-lg-6 col-12">
            <div class="card card-profile mt-4 z-index-2">
              <div class="row">
              </div>
            </div>
          </div>
          <div class="col-lg-6 col-12">
            <div class="card card-profile mt-lg-4 mt-5 z-index-2">
              <div class="row">
                <div class="col-lg-4 col-md-6 col-12 mt-n5">
                  <a href="javascript:;">
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
     END Features w/ pattern background & stats & rocket -------- --> 
     
     
     
     <!--  
     <section class="py-8">
  <div class="container">
    <div class="row justify-space-between py-2">
      <div class="card card-plain card-blog mt-5">
        <div class="row">
         
          <div class="col-md-7 my-auto ms-md-3 mt-md-auto mt-4">
            <h3 class="text-dark cursor-pointer">Benvenuto <s:property value="account.username"/></h3>
            <p>
		I tuoi dati sono:   <br />
		-Nome: <s:property value="cliente.nome"/>.  <br />
        -Cognome: <i><s:property value="cliente.cognome" /></i>.  <br /> 
        -Data di nascita: <i><s:property value="cliente.datanascita" />.  <br /> </i>
        -Telefono: <i><s:property value="cliente.telefono" /></i>.  <br />
        -Email:<i><s:property value="cliente.email" /></i>.            </p>
    				<div class="author">
    				</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
-->

<!-- -------- START HEADER 3 w/ image on background ------- -->
<header>
  
  <div class="page-header min-vh-100" style="background-image: url(../../assets/img/bg0.jpg);" loading="lazy">
    <span class="mask bg-gradient-dark opacity-4"></span>
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-lg-6 col-sm-9 text-center mx-auto">
          <h1 class="text-white mb-4">Benvenuto <s:property value="account.username"/></h1>
          <p class="lead text-white mb-sm-6 mb-4">
          I tuoi dati sono:   <br />
		-Nome: <s:property value="cliente.nome"/>.  <br />
        -Cognome: <i><s:property value="cliente.cognome" /></i>.  <br /> 
        -Data di nascita: <i><s:property value="cliente.datanascita" />.  <br /> </i>
        -Telefono: <i><s:property value="cliente.telefono" /></i>.  <br />
        -Email:<i><s:property value="cliente.email" /></i>.            </p>
    				<div class="author">
    				</div>
          
          </p>

         
        </div>
      </div>
    </div>
  </div>
</header>
<!-- -------- END HEADER 3 w/ image on background ------- -->
     
     
  </div>
   </div>
    <footer class="footer position-absolute bottom-2 py-2 w-100">
      <div class="container">
        <div class="row align-items-center justify-content-lg-between">
          <div class="col-12 col-md-6 my-auto">
            <div class="copyright text-center text-sm text-white text-lg-start">
              © <script>
                document.write(new Date().getFullYear())
              </script>,
              made with <i class="fa fa-heart" aria-hidden="true"></i> by
              <a href="https://www.creative-tim.com" class="font-weight-bold text-white" target="_blank">Creative Tim</a>
              for a better web.
            </div>
          </div>
          <div class="col-12 col-md-6">
            <ul class="nav nav-footer justify-content-center justify-content-lg-end">
              <li class="nav-item">
                <a href="https://www.creative-tim.com" class="nav-link text-white" target="_blank">Creative Tim</a>
              </li>
              <li class="nav-item">
                <a href="https://www.creative-tim.com/presentation" class="nav-link text-white" target="_blank">About Us</a>
              </li>
              <li class="nav-item">
                <a href="https://www.creative-tim.com/blog" class="nav-link text-white" target="_blank">Blog</a>
              </li>
              <li class="nav-item">
                <a href="https://www.creative-tim.com/license" class="nav-link pe-0 text-white" target="_blank">License</a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </footer>
   </div>
  
  <!--   Core JS Files   -->
  <script src="../assets/js/core/popper.min.js" type="text/javascript"></script>
  <script src="../assets/js/core/bootstrap.min.js" type="text/javascript"></script>
  <script src="../assets/js/plugins/perfect-scrollbar.min.js"></script>
  <!--  Plugin for TypedJS, full documentation here: https://github.com/inorganik/CountUp.js -->
  <script src="../assets/js/plugins/countup.min.js"></script>
  <!--  Plugin for Parallax, full documentation here: https://github.com/wagerfield/parallax  -->
  <script src="../assets/js/plugins/parallax.min.js"></script>
  <!-- Control Center for Material UI Kit: parallax effects, scripts for the example pages etc -->
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDTTfWur0PDbZWPr7Pmq8K3jiDp0_xUziI"></script>
  <script src="../assets/js/material-kit.min.js?v=3.0.0" type="text/javascript"></script>
  <script>
    // get the element to animate
    var element = document.getElementById('count-stats');
    var elementHeight = element.clientHeight;

    // listen for scroll event and call animate function

    document.addEventListener('scroll', animate);

    // check if element is in view
    function inView() {
      // get window height
      var windowHeight = window.innerHeight;
      // get number of pixels that the document is scrolled
      var scrollY = window.scrollY || window.pageYOffset;
      // get current scroll position (distance from the top of the page to the bottom of the current viewport)
      var scrollPosition = scrollY + windowHeight;
      // get element position (distance from the top of the page to the bottom of the element)
      var elementPosition = element.getBoundingClientRect().top + scrollY + elementHeight;

      // is scroll position greater than element position? (is element in view?)
      if (scrollPosition > elementPosition) {
        return true;
      }

      return false;
    }

    var animateComplete = true;
    // animate element when it is in view
    function animate() {

      // is element in view?
      if (inView()) {
        if (animateComplete) {
          if (document.getElementById('state1')) {
            const countUp = new CountUp('state1', document.getElementById("state1").getAttribute("countTo"));
            if (!countUp.error) {
              countUp.start();
            } else {
              console.error(countUp.error);
            }
          }
          if (document.getElementById('state2')) {
            const countUp1 = new CountUp('state2', document.getElementById("state2").getAttribute("countTo"));
            if (!countUp1.error) {
              countUp1.start();
            } else {
              console.error(countUp1.error);
            }
          }
          if (document.getElementById('state3')) {
            const countUp2 = new CountUp('state3', document.getElementById("state3").getAttribute("countTo"));
            if (!countUp2.error) {
              countUp2.start();
            } else {
              console.error(countUp2.error);
            };
          }
          animateComplete = false;
        }
      }
    }

    if (document.getElementById('typed')) {
      var typed = new Typed("#typed", {
        stringsElement: '#typed-strings',
        typeSpeed: 90,
        backSpeed: 90,
        backDelay: 200,
        startDelay: 500,
        loop: true
      });
    }
  </script>
  <script>
    if (document.getElementsByClassName('page-header')) {
      window.onscroll = debounce(function() {
        var scrollPosition = window.pageYOffset;
        var bgParallax = document.querySelector('.page-header');
        var oVal = (window.scrollY / 3);
        bgParallax.style.transform = 'translate3d(0,' + oVal + 'px,0)';
      }, 6);
    }
  </script>
</body>

</html>