package pl.kpir.kpir.kpir.forms;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter

public class CreateSalesInvoiceForm {


    private String invoiceNumber;
    private String date;
    private String netValue;
    private String vatValue;
    private Long contractorId;

}
