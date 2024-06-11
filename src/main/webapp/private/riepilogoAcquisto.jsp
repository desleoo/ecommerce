<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

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
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="apple-touch-icon" sizes="76x76"
	href="../../assets/img/apple-icon.png">
<link rel="icon" type="image/png" href="../../assets/img/favicon.png">
<title>ECOMMERCECORSODELEO</title>
<!--     Fonts and icons     -->
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900|Roboto+Slab:400,700" />
<!-- Nucleo Icons -->
<link href="../../assets/css/nucleo-icons.css" rel="stylesheet" />
<link href="../../assets/css/nucleo-svg.css" rel="stylesheet" />
<!-- Font Awesome Icons -->
<script src="https://kit.fontawesome.com/42d5adcbca.js"
	crossorigin="anonymous"></script>
<!-- Material Icons -->
<link
	href="https://fonts.googleapis.com/icon?family=Material+Icons+Round"
	rel="stylesheet">
<!-- CSS Files -->
<link id="pagestyle" href="../../assets/css/material-kit.css?v=3.0.0"
	rel="stylesheet" />
	<!-- Bootstrap core CSS -->
<link href="../../assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="../../assets/css/form-validation.css" rel="stylesheet">
     <style type="text/css">
            
  			label[for="selectId"] {color: black;}
			</style>
</head>

<body class="blog-author bg-gray-200">
	<!-- Navbar  -->
	<s:if test="#session.admin!=null">
		<jsp:include page="/navbar/NavPrAd.jsp" />
	</s:if>
	<s:elseif test="#session.account!=null">
		<jsp:include page="/navbar/NavPrAc.jsp" />
	</s:elseif>
	<div class="container">
	
  <main>
    <div class="py-5 text-center">
      <h2>Checkout</h2>
      <p class="lead"></p>
    </div>



    <div class="row g-5">
      
      <div class="col-md-7 col-lg-8">
        <form method="post" action="ordineConfermato">
          
        
          <div class="row g-3">
          
            <h4 class="mb-3">Informazioni Personali</h4>
          
          
            <div class="col-12">
              <s:hidden value="%{#session.account.cliente.nome}"></s:hidden>
               <label class="form-label">Nome</label>
               <s:textarea readonly = "true" name="c.nome"  class="form-control" theme="simple" value="%{#session.account.cliente.nome}" />
               
              
            </div>

            <div class="col-12">
              <label for="name" class="form-label">Cognome</label>
               <s:textarea name="c.cognome" readonly = "true" class="form-control" theme="simple" value="%{#session.account.cliente.cognome}" />
            </div>


            <div class="col-12">
              <label for="email" class="form-label">Email</label>
               <s:textarea name="c.email" readonly = "true" class="form-control" theme="simple" value="%{#session.account.cliente.email}" />
            </div>

			<div class="col-12">
              <label for="" class="form-label">Telefono <span class="text-muted"></span></label>
               <s:textarea name="c.telefono" readonly = "true" class="form-control" theme="simple" value="%{#session.account.cliente.telefono}" />
            </div>

            </div>

          <hr class="my-4">
 		<s:if  test="#session.account.cliente.indirizzoCitta!=null" > 
		<div class="row g-3">
          <div class="row g-3">
          
            <h4 class="mb-3">Conferma indirizzo di spedizione</h4>
            
             <div class="col-12">
              <label for="name" class="form-label">Città</label>
               <s:textarea name="c.indirizzoCitta" readonly = "true" class="form-control" theme="simple" value="%{#session.account.cliente.indirizzoCitta}" />
            </div>
            
            <div class="col-12">
              <label for="name" class="form-label">Via</label>
               <s:textarea name="c.indirizzoVia" readonly = "true" class="form-control" theme="simple" value="%{#session.account.cliente.indirizzoVia}" />
            </div>
			 <div class="col-12">
              <label for="email" class="form-label">civico</label>
               <s:textarea name="c.indirizzoCivico" readonly = "true" class="form-control" theme="simple" value="%{#session.account.cliente.indirizzoCivico}" />
            </div>
            
            <div class="col-12">
              <label for="email" class="form-label">CAP</label>
               <s:textarea name="c.indirizzoCap" readonly = "true" class="form-control" theme="simple" value="%{#session.account.cliente.indirizzoCap}" />
            </div>
            
			<div class="col-12">
              <label for="" class="form-label">Informazioni aggiuntive <span class="text-muted"></span></label>
               <s:textarea name="c.indirizzoDescrizione" readonly = "true" class="form-control" theme="simple" value="%{#session.account.cliente.indirizzoDescrizione}" />
            </div>
            </div>
            </div>
            
                    <hr class="my-4">
          
       
		<br>
		
		</s:if>
		<s:else>
			<div class="row g-3">
          	<div class="row g-3">
            <h4 class="mb-3">Inserisci indirizzo di spedizione</h4>
              <label for="name" class="form-label">Città</label>
              <input type="text" class="form-control"  >
            </div>
            <div class="col-12">
              <label for="name" class="form-label">Via</label>
              <input type="text" class="form-control" >
            </div>
			 <div class="col-12">
              <label for="email" class="form-label">civico</label>
              <input type="text" class="form-control" >
            </div>
			<div class="col-12">
              <label for="" class="form-label">Informazioni aggiuntive <span class="text-muted"></span></label>
              <input type="text" class="form-control">
            </div>
            
			
            
            </div>
		</s:else>
		          
		   
            

			<s:select onclick="cardform()" id="selectId"
			label="Seleziona Pagamento" 
			list="pagamenti" 
			name="SelectedPag"/>
			
			 <hr class="my-4">
			
			
			

		<!-- INIZIO FORM CARTA DI CREDITO -->
		
			<div class="row g-3" id="credit_card" style="display:none;" >
          	<div class="row g-3">
            <h4 class="mb-3">Inserisci Le informazioni della tua carta di credito</h4>
            
            <div class="col-12">
              <label for="name" class="form-label">Nome intestatario:</label>
               <s:textarea name="nomeInt"  class="form-control" theme="simple"/>
            </div>
            
            <div class="col-12">
              <label for="name" class="form-label">Cognome intestatario:</label>
               <s:textarea name="cognomeInt"  class="form-control" theme="simple"/>
            </div>
            
			 <div class="col-12">
              <label for="email" class="form-label">Numero Carta:</label>
               <s:textarea name="numCart"  class="form-control" theme="simple"/>
            </div>
			<div class="col-12">
              <label for="" class="form-label">Data Scadenza: <span class="text-muted"></span></label>
               <s:textarea name="scadenza"  class="form-control" theme="simple"/>
            </div>
            <div class="col-12">
              <label for="" class="form-label">cvv: <span class="text-muted"></span></label>
               <s:textarea name="cvv"  class="form-control" theme="simple"/>
            </div>
            </div>
            </div>
            
            <hr class="my-4">
			
			
			<s:select id="selectId"
			label="Seleziona Spedizione"
			list="spedizioni" 
			name="SelectedSped"/>
            
		<!-- FINE FORM CARTA DI CREDITO -->
		
<script type="text/javascript">
    function cardform(){

    	var pag=document.getElementsByName('SelectedPag')[0].value;
    	console.log(pag);

    	var cardForm=document.getElementById('credit_card');
        
    	if (pag == "Contrassegno") {
        	cardForm.style.display = "none"; //non lo vedo
        } else{
        	cardForm.style.display = "block"; //lo vedo
        }        
    }
</script>

          <hr class="my-4">

 				<div class="col-md-12 text-center">
              	<s:submit  type="button"  class="btn bg-gradient-dark w-100">Continua</s:submit>
              </div>        
         </form>
      </div>
    </div>
  </main>

 
</div>
				



		<footer class="footer py-5">
			<div class="container z-index-1 position-relative">
				<div class="row">
					<div
						class="col-lg-4 me-auto mb-lg-0 mb-4 text-lg-start text-center">
						<h6
							class="text-dark font-weight-bolder text-uppercase mb-lg-4 mb-3">Material
							Design</h6>
						<ul
							class="nav flex-row ms-n3 justify-content-lg-start justify-content-center mb-4 mt-sm-0">
							<li class="nav-item"><a class="nav-link text-dark opacity-8"
								href="https://www.creative-tim.com" target="_blank"> Home </a></li>
							<li class="nav-item"><a class="nav-link text-dark opacity-8"
								href="https://www.creative-tim.com/presentation" target="_blank">
									About </a></li>
							<li class="nav-item"><a class="nav-link text-dark opacity-8"
								href="https://www.creative-tim.com/blog" target="_blank">
									Blog </a></li>
							<li class="nav-item"><a class="nav-link text-dark opacity-8"
								href="https://www.creative-tim.com" target="_blank">
									Services </a></li>
						</ul>
						<p class="text-sm text-dark opacity-8 mb-0">
							Copyright ©
							<script>
              document.write(new Date().getFullYear())
            </script>
							Material Design by Creative Tim.
						</p>
					</div>
					<div class="col-lg-6 ms-auto text-lg-end text-center">
						<p class="mb-5 text-lg text-dark font-weight-bold">The reward
							for getting on the stage is fame. The price of fame is you can’t
							get off the stage.</p>
						<a href="javascript:;" target="_blank"
							class="text-dark me-xl-4 me-4 opacity-5"> <span
							class="fab fa-dribbble"></span>
						</a> <a href="javascript:;" target="_blank"
							class="text-dark me-xl-4 me-4 opacity-5"> <span
							class="fab fa-twitter"></span>
						</a> <a href="javascript:;" target="_blank"
							class="text-dark me-xl-4 me-4 opacity-5"> <span
							class="fab fa-pinterest"></span>
						</a> <a href="javascript:;" target="_blank"
							class="text-dark opacity-5"> <span class="fab fa-github"></span>
						</a>
					</div>
				</div>
			</div>
		</footer>
		<!-- -------- END FOOTER 5 w/ DARK BACKGROUND ------- -->
		<!--   Core JS Files   -->
		<script src="../../assets/js/core/popper.min.js"
			type="text/javascript"></script>
		<script src="../../assets/js/core/bootstrap.min.js"
			type="text/javascript"></script>
		<script src="../../assets/js/plugins/perfect-scrollbar.min.js"></script>
		<!--  Plugin for Parallax, full documentation here: https://github.com/wagerfield/parallax  -->
		<script src="../../assets/js/plugins/parallax.min.js"></script>
		<!-- Control Center for Material UI Kit: parallax effects, scripts for the example pages etc -->
		<!--  Google Maps Plugin    -->
		<script
			src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDTTfWur0PDbZWPr7Pmq8K3jiDp0_xUziI"></script>
		<script src="../../assets/js/material-kit.min.js?v=3.0.0"
			type="text/javascript"></script>
			    
			    <script src="../../assets/js/core/bootstrap.bundle.min.js"></script>
			      <script src="../../assets/js/plugins/form-validation.js"></script>
			
</body>

</html>

    