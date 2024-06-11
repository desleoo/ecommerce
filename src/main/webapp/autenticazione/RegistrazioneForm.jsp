<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>

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
   <body class="sign-in-basic">
  
  <div class="page-header align-items-start min-vh-100" style="background-image: url('https://images.unsplash.com/photo-1497294815431-9365093b7331?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1950&q=80');" loading="lazy">
    <span class="mask bg-gradient-dark opacity-6"></span>
    <div class="container my-auto">
     <!-- Navbar Transparent -->
     <jsp:include page="/navbar/NavAuth.jsp" />
  <!-- End Navbar -->
      <div class="row">
        <div class="col-lg-4 col-md-8 col-12 mx-auto">
          <div class="card z-index-0 fadeIn3 fadeInBottom">
            <div class="card-body">
            
           <div style="background-color: #ff0000;">
			<s:fielderror/>
		</div>
		
		<div style="background-color: #ffaacc;">
			<s:actionerror />
		</div>
	
		
              <s:form action="ConfermaRegistrazione" role="form" class="text-start">
              
              	<div class="input-group input-group-outline my-3">
              		<label class="form-label">Scegli username</label>
                  	<s:textfield name="account.username"  class="form-control" theme="simple"/>
                </div>
                <div class="input-group input-group-outline my-3">
                	<label class="form-label">Scegli Password</label>
                  	<s:textfield name="account.password" type="password" class="form-control" theme="simple"/>
                </div>
                <div class="input-group input-group-outline my-3">
                	<label class="form-label">Nome</label>
                  	<s:textfield name="cliente.nome"  class="form-control" theme="simple"/>
                </div>
                <div class="input-group input-group-outline my-3">
                	<label class="form-label">Cognome</label>
                  	<s:textfield name="cliente.cognome"  class="form-control" theme="simple"/>
                </div>
                
           <!--      style="color: white;" --> 
                
                <div class="input-group input-group-outline my-3">
                	<label class="date form-label label-control" >Data di nascita</label>
                  	<s:textfield type="date" name="cliente.datanascita"  class="form-control datetimepicker" theme="simple" />
                </div>
                
                
                
                <div class="input-group input-group-outline my-3">
                	<label class="form-label">Cellulare</label>
                  	<s:textfield name="cliente.telefono"  class="form-control" theme="simple"/>
                </div>
                <div class="input-group input-group-outline my-3">
                	 <label class="form-label">E-mail</label> 
                  	<s:textfield name="cliente.email"  class="form-control" theme="simple"/>
                </div>
                <div class="text-center">
                	<s:submit  type="button" class="btn bg-gradient-primary w-100 my-4 mb-2" theme="simple">
						Registrati
                    </s:submit>
                </div>
                
                
                
                
                
                
                
                
                
             </s:form>
            </div>
          </div>
        </div>
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
  <!--  Plugin for Parallax, full documentation here: https://github.com/wagerfield/parallax  -->
  <script src="../assets/js/plugins/parallax.min.js"></script>
  <!-- Control Center for Material UI Kit: parallax effects, scripts for the example pages etc -->
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDTTfWur0PDbZWPr7Pmq8K3jiDp0_xUziI"></script>
  <script src="../assets/js/material-kit.min.js?v=3.0.0" type="text/javascript"></script>
  <script > $('.datetimepicker').datetimepicker({
	  icons: {
		    time: "fa fa-clock-o",
		    date: "fa fa-calendar",
		    up: "fa fa-chevron-up",
		    down: "fa fa-chevron-down",
		    previous: 'fa fa-chevron-left',
		    next: 'fa fa-chevron-right',
		    today: 'fa fa-screenshot',
		    clear: 'fa fa-trash',
		    close: 'fa fa-remove'
		  }
		});</script>
</body>

</html>
    
    
    

    
    
    
    
    

    

 
   
    
    
    

    
    
    
    
    
