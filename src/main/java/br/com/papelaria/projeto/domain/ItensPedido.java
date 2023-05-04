package br.com.papelaria.projeto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItensPedido {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(nullable=false)
		private Integer iditenspedido;
		
		@Column(nullable=false)
		private Integer idpedido;
		
		@Column(nullable=false)
		private Integer idproduto;
		
		@Column(nullable=false)
		private Integer desconto;
		
		@Column(nullable=false)
		private String quantidade;
		
		@Column(nullable = false)
		private Double precototal;

		public ItensPedido() {
		}

		public ItensPedido(Integer iditenspedido, Integer idpedido, Integer idproduto, Integer desconto,
				String quantidade, Double precototal) {
			this.iditenspedido = iditenspedido;
			this.idpedido = idpedido;
			this.idproduto = idproduto;
			this.desconto = desconto;
			this.quantidade = quantidade;
			this.precototal = precototal;
		}

		public Integer getIditenspedido() {
			return iditenspedido;
		}

		public void setIditenspedido(Integer iditenspedido) {
			this.iditenspedido = iditenspedido;
		}

		public Integer getIdpedido() {
			return idpedido;
		}

		public void setIdpedido(Integer idpedido) {
			this.idpedido = idpedido;
		}

		public Integer getIdproduto() {
			return idproduto;
		}

		public void setIdproduto(Integer idproduto) {
			this.idproduto = idproduto;
		}

		public Integer getDesconto() {
			return desconto;
		}

		public void setDesconto(Integer desconto) {
			this.desconto = desconto;
		}

		public String getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
		}

		public Double getPrecototal() {
			return precototal;
		}

		public void setPrecototal(Double precototal) {
			this.precototal = precototal;
		}
		
		
}
