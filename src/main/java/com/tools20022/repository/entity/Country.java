/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.CountryCodeAndName1;
import com.tools20022.repository.msg.CountryCodeAndName3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Nation with its own government.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Country" src="doc-files/Country.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#DomiciledFunds
 * Country.DomiciledFunds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Code Country.Code}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Citizen
 * Country.Citizen}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Tax Country.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryForSafekeepingPlace
 * Country.CountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryForBeneficialOwner
 * Country.CountryForBeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#ProducedProducts
 * Country.ProducedProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#NationalRegulatoryAuthority
 * Country.NationalRegulatoryAuthority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#RelatedCardPayment
 * Country.RelatedCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Name Country.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#PostalAddressSpecification
 * Country.PostalAddressSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryRelatedInvestmentFundProcessing
 * Country.CountryRelatedInvestmentFundProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Market
 * Country.Market}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#RelatedPaymentCard
 * Country.RelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#DomicileCountry
 * InvestmentFund.DomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#Country
 * InvestmentFundClassProcessingCharacteristics.Country}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Country
 * PostalAddress.Country}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Origin
 * Product.Origin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Country Tax.Country}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Nationality
 * Person.Nationality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#CardCountryCode
 * PaymentCard.CardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#Country
 * SafekeepingPlace.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#NonDomicileCountry
 * BeneficialOwner.NonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Country
 * CardPaymentAcquiring.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#Country
 * RegulatoryAuthorityRole.Country}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Country
 * Market.Country}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#CorrespondentCountry
 * ReportSpecification3.CorrespondentCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#CorrespondentCountry
 * ReportSpecification4.CorrespondentCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification2#CorrespondentCountry
 * ReportSpecification2.CorrespondentCountry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName1
 * CountryCodeAndName1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName3
 * CountryCodeAndName3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Country"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Nation with its own government."</li>
 * </ul>
 */
public class Country {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment funds which are domiciled in a specific country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#DomicileCountry
	 * InvestmentFund.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomiciledFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment funds which are domiciled in a specific country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DomiciledFunds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomiciledFunds";
			definition = "Investment funds which are domiciled in a specific country.";
			minOccurs = 0;
			type_lazy = () -> InvestmentFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.DomicileCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies a nation with its own government (ISO 3166).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1#Country
	 * PostalAddress1.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LocalMarketAnnex#Country
	 * LocalMarketAnnex.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#Country
	 * LocalMarketAnnex2.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#Country
	 * StructuredLongPostalAddress1.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#TaxationCountry
	 * Organisation2.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#RegistrationCountry
	 * Organisation2.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1#Country
	 * CountryAndResidentialStatusType1.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#TaxationCountry
	 * IndividualPerson5.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#TaxationCountry
	 * IndividualPerson10.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#RegistrationCountry
	 * Organisation13.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#TaxationCountry
	 * Organisation4.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#RegistrationCountry
	 * Organisation4.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#TaxationCountry
	 * Organisation3.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#RegistrationCountry
	 * Organisation3.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#TaxationCountry
	 * IndividualPerson6.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#TaxationCountry
	 * IndividualPerson11.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice#Country
	 * SystemIdentificationChoice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemIdentification2Choice#Country
	 * SystemIdentification2Choice.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#Country
	 * PostalAddress6.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#CountryOfBirth
	 * DateAndPlaceOfBirth.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification8#CountryOfResidence
	 * PartyIdentification8.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#CountryOfResidence
	 * PartyIdentification32.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#CountryOfResidence
	 * PartyIdentification43.CountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemSearch3#Country
	 * SystemSearch3.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemDetails2#Country
	 * SystemDetails2.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.System1#Country
	 * System1.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification12Choice#Country
	 * PartyIdentification12Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice#Country
	 * PartyIdentification14Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification44Choice#Country
	 * PartyIdentification44Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice#Country
	 * PartyIdentification37Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification1#Country
	 * AlternatePartyIdentification1.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2#Country
	 * AlternatePartyIdentification2.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19#CountryOfResidence
	 * PartyIdentificationAndAccount19.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40#CountryOfResidence
	 * PartyIdentificationAndAccount40.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount81#Nationality
	 * PartyIdentificationAndAccount81.Nationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification58Choice#Country
	 * PartyIdentification58Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice#Country
	 * PartyIdentification60Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3#Country
	 * AlternatePartyIdentification3.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount88#Nationality
	 * PartyIdentificationAndAccount88.Nationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#DomicileCountry
	 * PartyIdentification33.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#NonDomicileCountry
	 * PartyIdentification33.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#DomicileCountry
	 * PartyIdentification34.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#NonDomicileCountry
	 * PartyIdentification34.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#DomicileCountry
	 * PartyIdentification50.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#NonDomicileCountry
	 * PartyIdentification50.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#DomicileCountry
	 * PartyIdentification51.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#NonDomicileCountry
	 * PartyIdentification51.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#DomicileCountry
	 * PartyIdentification56.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#NonDomicileCountry
	 * PartyIdentification56.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#DomicileCountry
	 * PartyIdentification57.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#NonDomicileCountry
	 * PartyIdentification57.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification17Choice#Country
	 * PartyIdentification17Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification39Choice#Country
	 * PartyIdentification39Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification53Choice#Country
	 * PartyIdentification53Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#IdentificationAsCountry
	 * SafekeepingPlaceFormatChoice.IdentificationAsCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification15#Country
	 * PartyIdentification15.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28#CountryOfResidence
	 * PartyIdentificationAndAccount28.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36#CountryOfResidence
	 * PartyIdentificationAndAccount36.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61#CountryOfResidence
	 * PartyIdentificationAndAccount61.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65#CountryOfResidence
	 * PartyIdentificationAndAccount65.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice#Country
	 * PartyIdentification15Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#CountryOfResidence
	 * PartyIdentificationAndAccount9.CountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8#Country
	 * PostalAddress8.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5#Country
	 * AlternatePartyIdentification5.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#CountryOfResidence
	 * PartyIdentificationAndAccount79.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6#Country
	 * AlternatePartyIdentification6.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BICOrCountryCodeChoice#Country
	 * BICOrCountryCodeChoice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#CountryOfIssue
	 * FinancialInstrumentAttributes1.CountryOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification68Choice#Country
	 * PartyIdentification68Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#CountryOfResidence
	 * PartyIdentification41.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#CountryOfResidence
	 * PartyIdentification40.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#CountryOfOperation
	 * Organisation12.CountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#CountryOfOperation
	 * OrganisationModification1.CountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority#AuthorityCountry
	 * RegulatoryAuthority.AuthorityCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority2#Country
	 * RegulatoryAuthority2.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#Country
	 * StructuredRegulatoryReporting3.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#CountryOfResidence
	 * PartyIdentification42.CountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Location1#Country
	 * Location1.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress12#Country
	 * PostalAddress12.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlaceOfPresentation1#Country
	 * PlaceOfPresentation1.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation5#CountryCode
	 * Organisation5.CountryCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation8#CountryCode
	 * Organisation8.CountryCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#CountryCode
	 * Organisation9.CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#PlaceOfTrade
	 * RedemptionBulkOrder2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice#Country
	 * PlaceOfTradeIdentification1Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#PlaceOfTrade
	 * RedemptionBulkExecution2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#PlaceOfTrade
	 * RedemptionBulkExecution3.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#PlaceOfTrade
	 * RedemptionMultipleOrder2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#PlaceOfTrade
	 * RedemptionMultipleOrder3.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#PlaceOfTrade
	 * RedemptionMultipleExecution2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#PlaceOfTrade
	 * SubscriptionBulkOrder2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#PlaceOfTrade
	 * SubscriptionBulkExecution2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#PlaceOfTrade
	 * SubscriptionMultipleOrder2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#PlaceOfTrade
	 * SubscriptionMultipleExecution2.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#Nationality
	 * BeneficialOwner1.Nationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46#CountryOfResidence
	 * PartyIdentificationAndAccount46.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#CountryOfResidence
	 * PartyIdentification45.CountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName1#Code
	 * CountryCodeAndName1.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress2#Country
	 * PostalAddress2.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#ProductOrigin
	 * LineItemDetails4.ProductOrigin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress5#Country
	 * PostalAddress5.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#ProductOrigin
	 * LineItemDetails7.ProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification27#Country
	 * PartyIdentification27.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#ProductOrigin
	 * LineItemDetails6.ProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#ProductOrigin
	 * LineItemDetails9.ProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73#CountryOfResidence
	 * PartyIdentificationAndAccount73.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice#Country
	 * PartyIdentification67Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4#Country
	 * AlternatePartyIdentification4.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice#Country
	 * PartyIdentification34Choice.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#Country
	 * PostalAddress11.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#CountryOfResidence
	 * PartyIdentification58.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice#Country
	 * ResidenceLocation1Choice.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress4#Country
	 * PostalAddress4.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification18#CountryOfResidence
	 * PartyIdentification18.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification20#CountryOfResidence
	 * PartyIdentification20.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification31#CountryOfResidence
	 * PartyIdentification31.CountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification16#CountryOfResidence
	 * PartyIdentification16.CountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress7#Country
	 * PostalAddress7.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice#Country
	 * PlaceOfTradeIdentification3Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#CountryOfIssue
	 * TransactionDetails51.CountryOfIssue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#CountryOfIssue
	 * Issuance1.CountryOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#CountryOfIssue
	 * IntraPositionQueryCriteria1.CountryOfIssue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress10#Country
	 * PostalAddress10.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9#Country
	 * PostalAddress9.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice1#Country
	 * BidResponsePrice1.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#RegistrationCountry
	 * Organisation15.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#RailCarrierCountry
	 * TransportByRail4.RailCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#CarrierAgentCountry
	 * TransportByRail4.CarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#AirCarrierCountry
	 * TransportByAir4.AirCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#CarrierAgentCountry
	 * TransportByAir4.CarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#RoadCarrierCountry
	 * TransportByRoad4.RoadCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#CarrierAgentCountry
	 * TransportByRoad4.CarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#ProductOrigin
	 * LineItemDetails10.ProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#SeaCarrierCountry
	 * TransportBySea5.SeaCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#CarrierAgentCountry
	 * TransportBySea5.CarrierAgentCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Location2#Country
	 * Location2.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#AirCarrierCountry
	 * TransportByAir5.AirCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#CarrierAgentCountry
	 * TransportByAir5.CarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#SeaCarrierCountry
	 * TransportBySea6.SeaCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#CarrierAgentCountry
	 * TransportBySea6.CarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#ProductOrigin
	 * LineItemDetails11.ProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification75Choice#Country
	 * PartyIdentification75Choice.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress13#Country
	 * PostalAddress13.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#RailCarrierCountry
	 * TransportByRail5.RailCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#CarrierAgentCountry
	 * TransportByRail5.CarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#RoadCarrierCountry
	 * TransportByRoad5.RoadCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#CarrierAgentCountry
	 * TransportByRoad5.CarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#RegistrationCountry
	 * Organisation16.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#RegistrationCountry
	 * Organisation17.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#ProductOrigin
	 * LineItemDetails13.ProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#ProductOrigin
	 * LineItemDetails14.ProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#Nationality
	 * BeneficialOwner2.Nationality}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#Country
	 * PostalAddress17.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7#Country
	 * AlternatePartyIdentification7.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#Nationality
	 * PartyIdentificationAndAccount108.Nationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#CountryOfResidence
	 * PartyIdentification77.CountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#Country
	 * PostalAddress19.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#Country
	 * PartyIdentification93Choice.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#Country
	 * PostalAddress18.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#DomicileCountry
	 * PartyIdentification93.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#NonDomicileCountry
	 * PartyIdentification93.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#TaxationCountry
	 * Organisation21.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#RegistrationCountry
	 * Organisation21.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#RegistrationCountry
	 * Organisation22.RegistrationCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#Country
	 * PostalAddress21.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation24#RegistrationCountry
	 * Organisation24.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2#Country
	 * CountryAndResidentialStatusType2.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice#Country
	 * PartyIdentification102Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8#Country
	 * AlternatePartyIdentification8.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#DomicileCountry
	 * PartyIdentification101.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#NonDomicileCountry
	 * PartyIdentification101.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification111Choice#Country
	 * PartyIdentification111Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification9#Country
	 * AlternatePartyIdentification9.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135#Nationality
	 * PartyIdentificationAndAccount135.Nationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice#Country
	 * PartyIdentification115Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#CountryOfResidence
	 * PartyIdentification112.CountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName3#Code
	 * CountryCodeAndName3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification12#CountryOfBranch
	 * PersonIdentification12.CountryOfBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#PlaceOfTrade
	 * RedemptionBulkExecution5.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#RegistrationCountry
	 * Organisation30.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#RegistrationCountry
	 * Organisation29.RegistrationCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a nation with its own government (ISO 3166)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.Country, com.tools20022.repository.msg.LocalMarketAnnex.Country, com.tools20022.repository.msg.LocalMarketAnnex2.Country,
					com.tools20022.repository.msg.StructuredLongPostalAddress1.Country, com.tools20022.repository.msg.Organisation2.TaxationCountry, com.tools20022.repository.msg.Organisation2.RegistrationCountry,
					com.tools20022.repository.msg.CountryAndResidentialStatusType1.Country, com.tools20022.repository.msg.IndividualPerson5.TaxationCountry, com.tools20022.repository.msg.IndividualPerson10.TaxationCountry,
					com.tools20022.repository.msg.Organisation13.RegistrationCountry, com.tools20022.repository.msg.Organisation4.TaxationCountry, com.tools20022.repository.msg.Organisation4.RegistrationCountry,
					com.tools20022.repository.msg.Organisation3.TaxationCountry, com.tools20022.repository.msg.Organisation3.RegistrationCountry, com.tools20022.repository.msg.IndividualPerson6.TaxationCountry,
					com.tools20022.repository.msg.IndividualPerson11.TaxationCountry, com.tools20022.repository.choice.SystemIdentificationChoice.Country, com.tools20022.repository.choice.SystemIdentification2Choice.Country,
					com.tools20022.repository.msg.PostalAddress6.Country, com.tools20022.repository.msg.DateAndPlaceOfBirth.CountryOfBirth, com.tools20022.repository.msg.PartyIdentification8.CountryOfResidence,
					com.tools20022.repository.msg.PartyIdentification32.CountryOfResidence, com.tools20022.repository.msg.PartyIdentification43.CountryOfResidence, com.tools20022.repository.msg.SystemSearch3.Country,
					com.tools20022.repository.msg.SystemDetails2.Country, com.tools20022.repository.msg.System1.Country, com.tools20022.repository.choice.PartyIdentification12Choice.Country,
					com.tools20022.repository.choice.PartyIdentification14Choice.Country, com.tools20022.repository.choice.PartyIdentification44Choice.Country, com.tools20022.repository.choice.PartyIdentification37Choice.Country,
					com.tools20022.repository.msg.AlternatePartyIdentification1.Country, com.tools20022.repository.msg.AlternatePartyIdentification2.Country, com.tools20022.repository.msg.PartyIdentificationAndAccount19.CountryOfResidence,
					com.tools20022.repository.msg.PartyIdentificationAndAccount40.CountryOfResidence, com.tools20022.repository.msg.PartyIdentificationAndAccount81.Nationality,
					com.tools20022.repository.choice.PartyIdentification58Choice.Country, com.tools20022.repository.choice.PartyIdentification60Choice.Country, com.tools20022.repository.msg.AlternatePartyIdentification3.Country,
					com.tools20022.repository.msg.PartyIdentificationAndAccount88.Nationality, com.tools20022.repository.msg.PartyIdentification33.DomicileCountry, com.tools20022.repository.msg.PartyIdentification33.NonDomicileCountry,
					com.tools20022.repository.msg.PartyIdentification34.DomicileCountry, com.tools20022.repository.msg.PartyIdentification34.NonDomicileCountry, com.tools20022.repository.msg.PartyIdentification50.DomicileCountry,
					com.tools20022.repository.msg.PartyIdentification50.NonDomicileCountry, com.tools20022.repository.msg.PartyIdentification51.DomicileCountry, com.tools20022.repository.msg.PartyIdentification51.NonDomicileCountry,
					com.tools20022.repository.msg.PartyIdentification56.DomicileCountry, com.tools20022.repository.msg.PartyIdentification56.NonDomicileCountry, com.tools20022.repository.msg.PartyIdentification57.DomicileCountry,
					com.tools20022.repository.msg.PartyIdentification57.NonDomicileCountry, com.tools20022.repository.choice.PartyIdentification17Choice.Country, com.tools20022.repository.choice.PartyIdentification39Choice.Country,
					com.tools20022.repository.choice.PartyIdentification53Choice.Country, com.tools20022.repository.choice.SafekeepingPlaceFormatChoice.IdentificationAsCountry, com.tools20022.repository.msg.PartyIdentification15.Country,
					com.tools20022.repository.msg.PartyIdentificationAndAccount28.CountryOfResidence, com.tools20022.repository.msg.PartyIdentificationAndAccount36.CountryOfResidence,
					com.tools20022.repository.msg.PartyIdentificationAndAccount61.CountryOfResidence, com.tools20022.repository.msg.PartyIdentificationAndAccount65.CountryOfResidence,
					com.tools20022.repository.choice.PartyIdentification15Choice.Country, com.tools20022.repository.msg.PartyIdentificationAndAccount9.CountryOfResidence, com.tools20022.repository.msg.PostalAddress8.Country,
					com.tools20022.repository.msg.AlternatePartyIdentification5.Country, com.tools20022.repository.msg.PartyIdentificationAndAccount79.CountryOfResidence, com.tools20022.repository.msg.AlternatePartyIdentification6.Country,
					com.tools20022.repository.choice.BICOrCountryCodeChoice.Country, com.tools20022.repository.msg.FinancialInstrumentAttributes1.CountryOfIssue, com.tools20022.repository.choice.PartyIdentification68Choice.Country,
					com.tools20022.repository.msg.PartyIdentification41.CountryOfResidence, com.tools20022.repository.msg.PartyIdentification40.CountryOfResidence, com.tools20022.repository.msg.Organisation12.CountryOfOperation,
					com.tools20022.repository.msg.OrganisationModification1.CountryOfOperation, com.tools20022.repository.msg.RegulatoryAuthority.AuthorityCountry, com.tools20022.repository.msg.RegulatoryAuthority2.Country,
					com.tools20022.repository.msg.StructuredRegulatoryReporting3.Country, com.tools20022.repository.msg.PartyIdentification42.CountryOfResidence, com.tools20022.repository.msg.Location1.Country,
					com.tools20022.repository.msg.PostalAddress12.Country, com.tools20022.repository.msg.PlaceOfPresentation1.Country, com.tools20022.repository.msg.Organisation5.CountryCode,
					com.tools20022.repository.msg.Organisation8.CountryCode, com.tools20022.repository.msg.Organisation9.CountryCode, com.tools20022.repository.msg.RedemptionBulkOrder2.PlaceOfTrade,
					com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice.Country, com.tools20022.repository.msg.RedemptionBulkExecution2.PlaceOfTrade, com.tools20022.repository.msg.RedemptionBulkExecution3.PlaceOfTrade,
					com.tools20022.repository.msg.RedemptionMultipleOrder2.PlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleOrder3.PlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleExecution2.PlaceOfTrade,
					com.tools20022.repository.msg.SubscriptionBulkOrder2.PlaceOfTrade, com.tools20022.repository.msg.SubscriptionBulkExecution2.PlaceOfTrade, com.tools20022.repository.msg.SubscriptionMultipleOrder2.PlaceOfTrade,
					com.tools20022.repository.msg.SubscriptionMultipleExecution2.PlaceOfTrade, com.tools20022.repository.msg.BeneficialOwner1.Nationality, com.tools20022.repository.msg.PartyIdentificationAndAccount46.CountryOfResidence,
					com.tools20022.repository.msg.PartyIdentification45.CountryOfResidence, com.tools20022.repository.msg.CountryCodeAndName1.Code, com.tools20022.repository.msg.PostalAddress2.Country,
					com.tools20022.repository.msg.LineItemDetails4.ProductOrigin, com.tools20022.repository.msg.PostalAddress5.Country, com.tools20022.repository.msg.LineItemDetails7.ProductOrigin,
					com.tools20022.repository.msg.PartyIdentification27.Country, com.tools20022.repository.msg.LineItemDetails6.ProductOrigin, com.tools20022.repository.msg.LineItemDetails9.ProductOrigin,
					com.tools20022.repository.msg.PartyIdentificationAndAccount73.CountryOfResidence, com.tools20022.repository.choice.PartyIdentification67Choice.Country,
					com.tools20022.repository.msg.AlternatePartyIdentification4.Country, com.tools20022.repository.choice.PartyIdentification34Choice.Country, com.tools20022.repository.msg.PostalAddress11.Country,
					com.tools20022.repository.msg.PartyIdentification58.CountryOfResidence, com.tools20022.repository.choice.ResidenceLocation1Choice.Country, com.tools20022.repository.msg.PostalAddress4.Country,
					com.tools20022.repository.msg.PartyIdentification18.CountryOfResidence, com.tools20022.repository.msg.PartyIdentification20.CountryOfResidence, com.tools20022.repository.msg.PartyIdentification31.CountryOfResidence,
					com.tools20022.repository.msg.PartyIdentification16.CountryOfResidence, com.tools20022.repository.msg.PostalAddress7.Country, com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice.Country,
					com.tools20022.repository.msg.TransactionDetails51.CountryOfIssue, com.tools20022.repository.msg.Issuance1.CountryOfIssue, com.tools20022.repository.msg.IntraPositionQueryCriteria1.CountryOfIssue,
					com.tools20022.repository.msg.PostalAddress10.Country, com.tools20022.repository.msg.PostalAddress9.Country, com.tools20022.repository.msg.BidResponsePrice1.Country,
					com.tools20022.repository.msg.Organisation15.RegistrationCountry, com.tools20022.repository.msg.TransportByRail4.RailCarrierCountry, com.tools20022.repository.msg.TransportByRail4.CarrierAgentCountry,
					com.tools20022.repository.msg.TransportByAir4.AirCarrierCountry, com.tools20022.repository.msg.TransportByAir4.CarrierAgentCountry, com.tools20022.repository.msg.TransportByRoad4.RoadCarrierCountry,
					com.tools20022.repository.msg.TransportByRoad4.CarrierAgentCountry, com.tools20022.repository.msg.LineItemDetails10.ProductOrigin, com.tools20022.repository.msg.TransportBySea5.SeaCarrierCountry,
					com.tools20022.repository.msg.TransportBySea5.CarrierAgentCountry, com.tools20022.repository.msg.Location2.Country, com.tools20022.repository.msg.TransportByAir5.AirCarrierCountry,
					com.tools20022.repository.msg.TransportByAir5.CarrierAgentCountry, com.tools20022.repository.msg.TransportBySea6.SeaCarrierCountry, com.tools20022.repository.msg.TransportBySea6.CarrierAgentCountry,
					com.tools20022.repository.msg.LineItemDetails11.ProductOrigin, com.tools20022.repository.choice.PartyIdentification75Choice.Country, com.tools20022.repository.msg.PostalAddress13.Country,
					com.tools20022.repository.msg.TransportByRail5.RailCarrierCountry, com.tools20022.repository.msg.TransportByRail5.CarrierAgentCountry, com.tools20022.repository.msg.TransportByRoad5.RoadCarrierCountry,
					com.tools20022.repository.msg.TransportByRoad5.CarrierAgentCountry, com.tools20022.repository.msg.Organisation16.RegistrationCountry, com.tools20022.repository.msg.Organisation17.RegistrationCountry,
					com.tools20022.repository.msg.LineItemDetails13.ProductOrigin, com.tools20022.repository.msg.LineItemDetails14.ProductOrigin, com.tools20022.repository.msg.BeneficialOwner2.Nationality,
					com.tools20022.repository.msg.PostalAddress17.Country, com.tools20022.repository.msg.AlternatePartyIdentification7.Country, com.tools20022.repository.msg.PartyIdentificationAndAccount108.Nationality,
					com.tools20022.repository.msg.PartyIdentification77.CountryOfResidence, com.tools20022.repository.msg.PostalAddress19.Country, com.tools20022.repository.choice.PartyIdentification93Choice.Country,
					com.tools20022.repository.msg.PostalAddress18.Country, com.tools20022.repository.msg.PartyIdentification93.DomicileCountry, com.tools20022.repository.msg.PartyIdentification93.NonDomicileCountry,
					com.tools20022.repository.msg.Organisation21.TaxationCountry, com.tools20022.repository.msg.Organisation21.RegistrationCountry, com.tools20022.repository.msg.Organisation22.RegistrationCountry,
					com.tools20022.repository.msg.PostalAddress21.Country, com.tools20022.repository.msg.Organisation24.RegistrationCountry, com.tools20022.repository.msg.CountryAndResidentialStatusType2.Country,
					com.tools20022.repository.choice.PartyIdentification102Choice.Country, com.tools20022.repository.msg.AlternatePartyIdentification8.Country, com.tools20022.repository.msg.PartyIdentification101.DomicileCountry,
					com.tools20022.repository.msg.PartyIdentification101.NonDomicileCountry, com.tools20022.repository.choice.PartyIdentification111Choice.Country, com.tools20022.repository.msg.AlternatePartyIdentification9.Country,
					com.tools20022.repository.msg.PartyIdentificationAndAccount135.Nationality, com.tools20022.repository.choice.PartyIdentification115Choice.Country, com.tools20022.repository.msg.PartyIdentification112.CountryOfResidence,
					com.tools20022.repository.msg.CountryCodeAndName3.Code, com.tools20022.repository.msg.PersonIdentification12.CountryOfBranch, com.tools20022.repository.msg.RedemptionBulkExecution5.PlaceOfTrade,
					com.tools20022.repository.msg.Organisation30.RegistrationCountry, com.tools20022.repository.msg.Organisation29.RegistrationCountry);
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identifies a nation with its own government (ISO 3166).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Specifies a person which is a citizen of a country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#Nationality
	 * Person.Nationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Citizen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a person which is a citizen of a country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Citizen = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Citizen";
			definition = "Specifies a person which is a citizen of a country.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Person.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Person.Nationality;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax parameters applicable in a country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Country
	 * Tax.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax parameters applicable in a country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax parameters applicable in a country.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the safekeeping places located in a specific country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#Country
	 * SafekeepingPlace.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryForSafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the safekeeping places located in a specific country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CountryForSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryForSafekeepingPlace";
			definition = "Specifies the safekeeping places located in a specific country.";
			minOccurs = 0;
			type_lazy = () -> SafekeepingPlace.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the beneficial owner which has certified that it is not
	 * domiciled in the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#NonDomicileCountry
	 * BeneficialOwner.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryForBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the beneficial owner which has certified that it is not domiciled in the country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CountryForBeneficialOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryForBeneficialOwner";
			definition = "Specifies the beneficial owner which has certified that it is not domiciled in the country.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BeneficialOwner.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the product for which an origin is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Product#Origin
	 * Product.Origin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProducedProducts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the product for which an origin is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProducedProducts = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProducedProducts";
			definition = "Specifies the product for which an origin is specified.";
			minOccurs = 0;
			type_lazy = () -> Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Origin;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Regulatory authority of the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#Country
	 * RegulatoryAuthorityRole.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
	 * RegulatoryAuthorityRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegulatoryAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory authority of the country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NationalRegulatoryAuthority = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalRegulatoryAuthority";
			definition = "Regulatory authority of the country.";
			minOccurs = 0;
			type_lazy = () -> RegulatoryAuthorityRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Card payment which took place in the specified country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Country
	 * CardPaymentAcquiring.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment which took place in the specified country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which took place in the specified country.";
			minOccurs = 0;
			type_lazy = () -> CardPaymentAcquiring.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Name by which a country is known. It is normally the name attached to the
	 * ISO country code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName1#Name
	 * CountryCodeAndName1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName3#Name
	 * CountryCodeAndName3.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a country is known. It is normally the name attached to the ISO country code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CountryCodeAndName1.Name, com.tools20022.repository.msg.CountryCodeAndName3.Name);
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a country is known. It is normally the name attached to the ISO country code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the representation of a postal address per country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#Country
	 * PostalAddress.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddressSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the representation of a postal address per country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PostalAddressSpecification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalAddressSpecification";
			definition = "Specifies the representation of a postal address per country.";
			minOccurs = 0;
			type_lazy = () -> PostalAddress.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the other parameters of the investment fund class which apply
	 * in that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#Country
	 * InvestmentFundClassProcessingCharacteristics.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryRelatedInvestmentFundProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the other parameters of the investment fund class which apply in that country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CountryRelatedInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryRelatedInvestmentFundProcessing";
			definition = "Specifies the other parameters of the investment fund class which apply in that country.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which a country is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Market#Country
	 * Market.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a country is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Market = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which a country is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment card for which a country code is attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#CardCountryCode
	 * PaymentCard.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which a country code is attached."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a country code is attached.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.CardCountryCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Country";
				definition = "Nation with its own government.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.DomicileCountry, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Country,
						com.tools20022.repository.entity.PostalAddress.Country, com.tools20022.repository.entity.Product.Origin, com.tools20022.repository.entity.Tax.Country, com.tools20022.repository.entity.Person.Nationality,
						com.tools20022.repository.entity.PaymentCard.CardCountryCode, com.tools20022.repository.entity.SafekeepingPlace.Country, com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry,
						com.tools20022.repository.entity.CardPaymentAcquiring.Country, com.tools20022.repository.entity.RegulatoryAuthorityRole.Country, com.tools20022.repository.entity.Market.Country);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportSpecification3.CorrespondentCountry, com.tools20022.repository.msg.ReportSpecification4.CorrespondentCountry,
						com.tools20022.repository.msg.ReportSpecification2.CorrespondentCountry);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.DomiciledFunds, com.tools20022.repository.entity.Country.Code, com.tools20022.repository.entity.Country.Citizen,
						com.tools20022.repository.entity.Country.Tax, com.tools20022.repository.entity.Country.CountryForSafekeepingPlace, com.tools20022.repository.entity.Country.CountryForBeneficialOwner,
						com.tools20022.repository.entity.Country.ProducedProducts, com.tools20022.repository.entity.Country.NationalRegulatoryAuthority, com.tools20022.repository.entity.Country.RelatedCardPayment,
						com.tools20022.repository.entity.Country.Name, com.tools20022.repository.entity.Country.PostalAddressSpecification, com.tools20022.repository.entity.Country.CountryRelatedInvestmentFundProcessing,
						com.tools20022.repository.entity.Country.Market, com.tools20022.repository.entity.Country.RelatedPaymentCard);
				derivationComponent_lazy = () -> Arrays.asList(CountryCodeAndName1.mmObject(), CountryCodeAndName3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}