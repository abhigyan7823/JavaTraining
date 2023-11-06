package com.MultiDb.postgres.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="entities")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String proName;
}
