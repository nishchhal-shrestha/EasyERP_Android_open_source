package com.thinkmobiles.easyerp.presentation.screens.crm.persons.details;

import com.thinkmobiles.easyerp.data.model.crm.persons.details.ResponseGetPersonDetails;
import com.thinkmobiles.easyerp.presentation.base.BaseModel;
import com.thinkmobiles.easyerp.presentation.base.BaseView;
import com.thinkmobiles.easyerp.presentation.base.rules.content.ContentPresenter;
import com.thinkmobiles.easyerp.presentation.base.rules.content.ContentView;
import com.thinkmobiles.easyerp.presentation.holders.data.crm.AttachmentDH;
import com.thinkmobiles.easyerp.presentation.holders.data.crm.HistoryDH;
import com.thinkmobiles.easyerp.presentation.holders.data.crm.LeadAndOpportunityDH;

import java.util.ArrayList;

import rx.Observable;

/**
 * Created by Lynx on 1/24/2017.
 */

public interface PersonDetailsContract {
    interface PersonDetailsView extends BaseView<PersonDetailsPresenter>, ContentView {
        void showHistory(boolean isShow);

        void showCompanyInfo(boolean isShow);
        void showSalesPurchasesInfo(boolean isShow);
        void showLeadsAndOpportunities(boolean isShown);
        void showAttachments(boolean isShown);

        void showJobPosition(boolean isShown);
        void showCompany(boolean isShown);

        void displayPersonAvatar(String base64Avatar);
        void displayPersonName(String personName);
        void displayJobPosition(String jobPosition);
        void displayEmail(String email);
        void displaySkype(String skype);
        void displayLinkedIn(String linkedIn);
        void displayFacebook(String facebook);
        void displayPhone(String phone);
        void displayMobile(String mobile);
        void displayDateOfBirth(String dateOfBirth);

        void enableSkypeIcon(final String uriPath);
        void enableLinkedInIcon(final String uriPath);
        void enableFacebookIcon(final String uriPath);
        void enableEmailIcon(final String email);
        void enableCompanyEmailActionClick(final String email);
        void enableCompanyPhoneActionClick(final String phone);
        void enablePhoneActionClick(final String phone);
        void enableMobileActionClick(final String mobilePhone);

        void displayBillingStreet(String billingStreet);
        void displayBillingCity(String billingCity);
        void displayBillingState(String billingState);
        void displayBillingZipcode(String billingZipcode);
        void displayBillingCountry(String billingCountry);

        void displayShippingFullName(String shippingFullname);
        void displayShippingStreet(String shippingStreet);
        void displayShippingCity(String shippingCity);
        void displayShippingState(String shippingState);
        void displayShippingZipcode(String shippingZipcode);
        void displayShippingCountry(String shippingCountry);

        void displayIsCustomer(boolean isCustomer);
        void displayIsSupplier(boolean isSupplier);
        void displaySalesTeam(String salesTeam);
        void displaySalesPerson(String salesPerson);
        void displaySalesImplementedBy(String implementedBy);
        void displaySalesReference(String reference);
        void displaySalesLanguage(String language);

        void displayCompanyImage(String base64CompanyImage);
        void displayCompanyUrl(String companyUrl);
        void displayCompanyName(String companyName);
        void displayCompanyStreet(String companyStreet);
        void displayCompanyCity(String companyCity);
        void displayCompanyState(String companyState);
        void displayCompanyZipcode(String companyZipcode);
        void displayCompanyCountry(String companyCountry);
        void displayCompanyPhone(String companyPhone);
        void displayCompanyEmail(String companyEmail);

        void displayLeadAndOpportunity(ArrayList<LeadAndOpportunityDH> leadAndOpportunityDHs);
        void displayAttachments(ArrayList<AttachmentDH> attachmentDHs);
        void displayHistory(ArrayList<HistoryDH> historyDHs);
        void startUrlIntent(String url);

        void openOpportunityDetails(String id, String title);
        void openCompanyDetails(String id, String title);
    }
    interface PersonDetailsPresenter extends ContentPresenter {
        void changeNotesVisibility();
        void startAttachment(int pos);
        void showOpportunityDetails(int pos);
        void showCompanyDetails();
    }
    interface PersonDetailsModel extends BaseModel {
        Observable<ResponseGetPersonDetails> getPersonDetails(String personID);
    }
}
