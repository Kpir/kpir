package pl.kpir.kpir.kpir.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kpir.kpir.kpir.forms.CreateContractorForm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "invoices")
public class InvoiceEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "contractor_id")
    private ContractorEntity contractorEntity;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyEntity companyEntity;

    @Column (name = "number", nullable = false)
    private String ivoiceNumber;
    @Column (nullable = false)
    private Date date;
    @Column (name = "netto_value", nullable = false)
    private BigDecimal netValue;
    @Column (name = "vat_value", nullable = false)
    private int vatValue;
    @Column (name = "invoice_cost")
    private boolean isCostInvoice;
}