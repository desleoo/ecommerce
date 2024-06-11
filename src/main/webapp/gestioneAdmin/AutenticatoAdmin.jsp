<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
  <div class="card card-body blur shadow-blur mx-3 mx-md-4 mt-n6 mb-4">

<section class="py-7">
<div class="container">
 <div class="row">
          <div class="col-md-8 text-start mb-5 mt-5">
            <h3 class="text-black z-index-1 position-relative" >Gestione Amministrazione</h3>
          </div>
        </div>
        <div class="row align-items-center">
          <div class="col-lg-6">
            <div class="row justify-content-start">
              <div class="col-md-6" >
                <div class="info" style="cursor:pointer" 
                onclick="window.location.href='<s:url action='gestioneP'/>'">
                   <i class="material-icons text-3xl text-gradient text-info mb-3">storefront</i>
                  <h5>Prodotti</h5>
                  <p>Gestione Prodotti </p>
                </div>
              </div>
              <div class="col-md-6"  >
                <div class="info" style="cursor:pointer" 
                	onclick="window.location.href='<s:url action='gestioneC'/>'" >
                  <i class="material-icons text-3xl text-gradient text-info mb-3">people_alt</i>
                  <h5>Clienti</h5>
                  <p>Gestione Clienti</p>
                </div>
              </div>
              <div class="col-md-6"  >
                <div class="info" style="cursor:pointer" 
                	onclick="window.location.href='<s:url action='gestioneOr'/>'" >
                  <i class="material-icons text-3xl text-gradient text-info mb-3">euro</i>
                  <h5>Ordini & Spedizioni</h5>
                  <p>Gestione Ordini e spedizioni</p>
                </div>
              </div>
             
            </div>
          </div>
        </div>
      </div>
      </section>
      </div>
