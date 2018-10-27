package br.com.eldertec.cursospring.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.eldertec.cursospring.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
