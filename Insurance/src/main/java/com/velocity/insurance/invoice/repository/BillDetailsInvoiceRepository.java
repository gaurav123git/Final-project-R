package com.velocity.insurance.invoice.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.invoice.model.Bill;

@Repository
public interface BillDetailsInvoiceRepository extends CrudRepository<Bill, Serializable>{

}
