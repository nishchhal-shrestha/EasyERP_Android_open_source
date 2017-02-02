package com.thinkmobiles.easyerp.data.services;

import com.thinkmobiles.easyerp.data.model.crm.dashboard.detail.order.OrderItem;
import com.thinkmobiles.easyerp.data.model.crm.invoice.Invoice;
import com.thinkmobiles.easyerp.data.model.crm.invoice.ResponseGetInvoice;
import com.thinkmobiles.easyerp.presentation.utils.Constants;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Lynx on 1/16/2017.
 */

public interface InvoiceService {

    @GET(Constants.GET_INVOICE)
    Observable<ResponseGetInvoice> getInvoice(
            @Query("filter[date][value][0]") final String filterDateValueFrom,
            @Query("filter[date][value][1]") final String filterDateValueTo,
            @Query("forSales") final boolean forSales,
            @Query("viewType") final String viewType,
            @Query("count") final int count,
            @Query("sort[invoiceDate]") final Integer sort,
            @Query("contentType") final String contentType);

    @GET(Constants.GET_INVOICE_BY_WORKFLOWS)
    Observable<List<OrderItem>> getInvoiceByWorkflows(
            @Query("filter[date][value][0]") final String filterDateValueFrom,
            @Query("filter[date][value][1]") final String filterDateValueTo,
            @Query("forSales") final boolean forSales,
            @Query("viewType") final String viewType,
            @Query("count") final int count,
            @Query("sort[invoiceDate]") final int sort,
            @Query("contentType") final String contentType);

    @GET(Constants.GET_REVENUE_BY_SALES)
    Observable<List<Invoice>> getInvoiceBySales(
            @Query("filter[date][value][0]") final String filterDateValueFrom,
            @Query("filter[date][value][1]") final String filterDateValueTo,
            @Query("forSales") final boolean forSales);

    @GET(Constants.GET_REVENUE_BY_CUSTOMER)
    Observable<List<Invoice>> getInvoiceByCustomer(
            @Query("filter[date][value][0]") final String filterDateValueFrom,
            @Query("filter[date][value][1]") final String filterDateValueTo,
            @Query("forSales") final boolean forSales);

    @GET(Constants.GET_REVENUE_BY_COUNTRY)
    Observable<List<Invoice>> getInvoiceByCountry(
            @Query("filter[date][value][0]") final String filterDateValueFrom,
            @Query("filter[date][value][1]") final String filterDateValueTo,
            @Query("forSales") final boolean forSales);

}
