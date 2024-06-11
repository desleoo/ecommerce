<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
            
<h3 class="text-center">Aggiungi Indirizzo di residenza</h3>

  <div style="background-color: #ff0000;">
		<s:fielderror></s:fielderror>
		</div>
		<div style="background-color: #ffaacc;">
			<s:actionerror />
		</div> 
<s:form action="SalvaModificaIndirizzo" role="form" >
	<div class="card-body">
		<div class="row">
		
			<div class="col-md-6">
                <div class="input-group input-group-dynamic mb-4">
                  <label class="form-label">Città: <s:property value="#session.account.cliente.indirizzoCitta"/></label>
                   <s:textfield name="indirizzoCitta"  class="form-control" theme="simple" />
                </div>
			</div>
			
			<div class="col-md-6 ps-2">
                <div class="input-group input-group-dynamic">
                  <label class="form-label">Via: <s:property value="#session.account.cliente.indirizzoVia"/></label>
                  <s:textfield name="indirizzoVia"  class="form-control" theme="simple"/>
                </div>
			</div>
			
			<div class="col-md-6">
                <div class="input-group input-group-dynamic mb-4">
                  <label class="form-label">Civico: <s:property value="#session.account.cliente.indirizzoCivico"/></label>
                   <s:textfield name="indirizzoCivico"  class="form-control" theme="simple" />
                </div>
			</div>
			
			<div class="col-md-6">
                <div class="input-group input-group-dynamic mb-4">
                  <label class="form-label">CAP: <s:property value="#session.account.cliente.indirizzoCap"/></label>
                   <s:textfield name="indirizzoCap"  class="form-control" theme="simple" />
                </div>
			</div>
			
			<div class="col-md-6">
                <div class="input-group input-group-dynamic mb-4">
                  <label class="form-label">Descrizione: <s:property value="#session.account.cliente.indirizzoDescrizione"/></label>
                   <s:textfield name="indirizzoDescrizione"  class="form-control" theme="simple" />
                </div>
			</div>
			
		</div>
		
		<div class="row text-center">
           	<div class="col-md-12 text-center">
              <s:submit  type="button"  class="btn bg-gradient-dark w-100">Salva</s:submit>
            </div>
              
		
	</div>
	</div>
</s:form>