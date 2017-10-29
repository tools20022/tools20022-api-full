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
import com.tools20022.repository.choice.DerivativePartyIdentification1Choice;
import com.tools20022.repository.choice.NameOrSector1Choice;
import com.tools20022.repository.codeset.LegalStructureCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Organisation" src="doc-files/Organisation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Purpose
 * Organisation.Purpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#RegistrationDate
 * Organisation.RegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
 * Organisation.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#ParentOrganisation
 * Organisation.ParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Branch
 * Organisation.Branch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#SecuritiesModification
 * Organisation.SecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#PlaceOfOperation
 * Organisation.PlaceOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#PlaceOfRegistration
 * Organisation.PlaceOfRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Description
 * Organisation.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#LegalStructure
 * Organisation.LegalStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Sector
 * Organisation.Sector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#RelatedIndicationOfInterest
 * Organisation.RelatedIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Strategy
 * Organisation.Strategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationHierarchy
 * Organisation.OrganisationHierarchy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#RepresentativeOfficer
 * Organisation.RepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#EstablishmentDate
 * Organisation.EstablishmentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#ParentOrganisation
 * Organisation.ParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#Branch
 * Organisation.Branch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#Organisation
 * OrganisationIdentification.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#OperatingOrganisation
 * Location.OperatingOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#RegisteredOrganisation
 * Location.RegisteredOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewOrganisationInformation
 * SecuritiesModification.NewOrganisationInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#Organisation
 * Sector.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#Organisation
 * RepresentativeOfficer.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#Organisations
 * BuyOrSellIndicationOfInterest.Organisations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#Organisation
 * OrganisationStrategy.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#Organisation
 * OrganisationHierarchy.Organisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#Organisation
 * InvestmentAccountOwnershipInformation5.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#Organisation
 * InvestmentAccountOwnershipInformation2.Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party14Choice#Organisation
 * Party14Choice.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#Organisation
 * InvestmentAccountOwnershipInformation3.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#Organisation
 * InvestmentAccountOwnershipInformation4.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#InstructingAgent
 * LongPaymentIdentification1.InstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#InstructedAgent
 * LongPaymentIdentification1.InstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#Creditor
 * LiquidityCreditTransfer1.Creditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#Debtor
 * LiquidityCreditTransfer1.Debtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1#Creditor
 * LiquidityDebitTransfer1.Creditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1#Debtor
 * LiquidityDebitTransfer1.Debtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#PrimaryCorporateInvestor
 * PEPISATransfer7.PrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#SecondaryCorporateInvestor
 * PEPISATransfer7.SecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#OtherCorporateInvestor
 * PEPISATransfer7.OtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#PrimaryCorporateInvestor
 * PEPISATransfer11.PrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#SecondaryCorporateInvestor
 * PEPISATransfer11.SecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#OtherCorporateInvestor
 * PEPISATransfer11.OtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#PrimaryCorporateInvestor
 * ISATransfer9.PrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#SecondaryCorporateInvestor
 * ISATransfer9.SecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#OtherCorporateInvestor
 * ISATransfer9.OtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#Merchant
 * CardPaymentEnvironment1.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#DebtorAgent
 * OriginalItemReference1.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#IntermediaryAgent
 * OriginalItemReference1.IntermediaryAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty1#LegalOrganisation
 * TradeParty1.LegalOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#DebtorAgent
 * OriginalItemReference2.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#IntermediaryAgent
 * OriginalItemReference2.IntermediaryAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Routing1#Firm Routing1.Firm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#WarrantAgent
 * Warrant2.WarrantAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssuerOrganisation
 * Issuance1.IssuerOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#RelatedParties
 * QuoteStatus2.RelatedParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#RelatedParties
 * SingleQuote1.RelatedParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg3#TradingParties
 * InstrumentLeg3.TradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#TradingParties
 * QuoteRequest1.TradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestForQuote#TradingParties
 * RequestForQuote.TradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party15Choice#Organisation
 * Party15Choice.Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party16Choice#Organisation
 * Party16Choice.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#PrimaryCorporateInvestor
 * ISATransfer12.PrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#SecondaryCorporateInvestor
 * ISATransfer12.SecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#OtherCorporateInvestor
 * ISATransfer12.OtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#DebtorAgent
 * OriginalPaymentInformation6.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#CreditorAgent
 * OriginalPaymentInformation6.CreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#PrimaryCorporateInvestor
 * ISATransfer19.PrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#SecondaryCorporateInvestor
 * ISATransfer19.SecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#OtherCorporateInvestor
 * ISATransfer19.OtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#DebtorAgent
 * OriginalItemReference3.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#IntermediaryAgent
 * OriginalItemReference3.IntermediaryAgent}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party24Choice#Organisation
 * Party24Choice.Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party23Choice#Organisation
 * Party23Choice.Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty2#LegalOrganisation
 * TradeParty2.LegalOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#DebtorAgent
 * OriginalItemReference4.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#IntermediaryAgent
 * OriginalItemReference4.IntermediaryAgent}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party30Choice#Organisation
 * Party30Choice.Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party31Choice#Organisation
 * Party31Choice.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#PrimaryCorporateInvestor
 * ISATransfer24.PrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#SecondaryCorporateInvestor
 * ISATransfer24.SecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#OtherCorporateInvestor
 * ISATransfer24.OtherCorporateInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty3#LegalOrganisation
 * TradeParty3.LegalOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#Name
 * OrganisationIdentification28.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#PostalAddress
 * OrganisationIdentification28.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party33Choice#Organisation
 * Party33Choice.Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party32Choice#Organisation
 * Party32Choice.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#DebtorAgent
 * OriginalPaymentInformation7.DebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#CreditorAgent
 * OriginalPaymentInformation7.CreditorAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialInstitution
 * FinancialInstitution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.NonFinancialInstitution
 * NonFinancialInstitution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails1
 * ContactDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation2 Organisation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation13 Organisation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation3 Organisation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
 * BranchAndFinancialInstitutionIdentification5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
 * BranchAndFinancialInstitutionIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
 * BranchAndFinancialInstitutionIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12 Organisation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation14 Organisation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationModification1
 * OrganisationModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation5 Organisation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation8 Organisation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9 Organisation9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification
 * BranchAndFinancialInstitutionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation1
 * LegalOrganisation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstitution2
 * FinancialInstitution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstitution3
 * FinancialInstitution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation15 Organisation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation16 Organisation16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation17 Organisation17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SectorAndLocation1
 * SectorAndLocation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation18 Organisation18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation19 Organisation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation2
 * LegalOrganisation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice
 * DerivativePartyIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation22 Organisation22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation23 Organisation23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NameOrSector1Choice
 * NameOrSector1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportedPartyIdentification1
 * ReportedPartyIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation25 Organisation25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation26 Organisation26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification28
 * OrganisationIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation29 Organisation29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndLocation1
 * NameAndLocation1}</li>
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
 * "Organisation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution."
 * </li>
 * </ul>
 */
public class Organisation extends Party {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Purpose of the organisation, eg, charity.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation2#Purpose
	 * Organisation2.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation13#Purpose
	 * Organisation13.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation4#Purpose
	 * Organisation4.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation3#Purpose
	 * Organisation3.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation15#Purpose
	 * Organisation15.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation16#Purpose
	 * Organisation16.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation17#Purpose
	 * Organisation17.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#Purpose
	 * Organisation21.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#Purpose
	 * Organisation22.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#Purpose
	 * Organisation24.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#Purpose
	 * Organisation30.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation29#Purpose
	 * Organisation29.Purpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the organisation, eg, charity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation2.Purpose, com.tools20022.repository.msg.Organisation13.Purpose, com.tools20022.repository.msg.Organisation4.Purpose,
					com.tools20022.repository.msg.Organisation3.Purpose, com.tools20022.repository.msg.Organisation15.Purpose, com.tools20022.repository.msg.Organisation16.Purpose, com.tools20022.repository.msg.Organisation17.Purpose,
					com.tools20022.repository.msg.Organisation21.Purpose, com.tools20022.repository.msg.Organisation22.Purpose, com.tools20022.repository.msg.Organisation24.Purpose, com.tools20022.repository.msg.Organisation30.Purpose,
					com.tools20022.repository.msg.Organisation29.Purpose);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, eg, charity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date and time at which a given organisation was officially registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#RegistrationDate
	 * Organisation2.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#RegistrationDate
	 * Organisation13.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#RegistrationDate
	 * Organisation4.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#RegistrationDate
	 * Organisation3.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation6#RegistrationDate
	 * Organisation6.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#RegistrationDate
	 * Organisation12.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#RegistrationDate
	 * OrganisationModification1.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation7#RegistrationDate
	 * Organisation7.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#RegistrationDate
	 * Organisation15.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#RegistrationDate
	 * Organisation16.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#RegistrationDate
	 * Organisation17.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#RegistrationDate
	 * LegalOrganisation2.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#RegistrationDate
	 * Organisation21.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#RegistrationDate
	 * Organisation22.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation24#RegistrationDate
	 * Organisation24.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#RegistrationDate
	 * Organisation30.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#RegistrationDate
	 * Organisation29.RegistrationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation2.RegistrationDate, com.tools20022.repository.msg.Organisation13.RegistrationDate, com.tools20022.repository.msg.Organisation4.RegistrationDate,
					com.tools20022.repository.msg.Organisation3.RegistrationDate, com.tools20022.repository.msg.Organisation6.RegistrationDate, com.tools20022.repository.msg.Organisation12.RegistrationDate,
					com.tools20022.repository.msg.OrganisationModification1.RegistrationDate, com.tools20022.repository.msg.Organisation7.RegistrationDate, com.tools20022.repository.msg.Organisation15.RegistrationDate,
					com.tools20022.repository.msg.Organisation16.RegistrationDate, com.tools20022.repository.msg.Organisation17.RegistrationDate, com.tools20022.repository.msg.LegalOrganisation2.RegistrationDate,
					com.tools20022.repository.msg.Organisation21.RegistrationDate, com.tools20022.repository.msg.Organisation22.RegistrationDate, com.tools20022.repository.msg.Organisation24.RegistrationDate,
					com.tools20022.repository.msg.Organisation30.RegistrationDate, com.tools20022.repository.msg.Organisation29.RegistrationDate);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specific identification assigned to an organisation. It is derived from
	 * the association between Party and PartyIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#Organisation
	 * OrganisationIdentification.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 774 elements</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> ListBuilderForOrganisation_00.addElems(new ArrayList<>());
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Organisation which is divided in branches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#Branch
	 * Organisation.Branch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which is divided in branches."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ParentOrganisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentOrganisation";
			definition = "Organisation which is divided in branches.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.Branch;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies an organisation which is not a head office.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#ParentOrganisation
	 * Organisation.ParentOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount4#AccountServicerBranch
	 * CashAccount4.AccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#DebtorAgentBranch
	 * DirectDebitMandate4.DebtorAgentBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#AccountServicerBranch
	 * CashAccount26.AccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#DebtorAgentBranch
	 * DirectDebitMandate5.DebtorAgentBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount32#AccountServicerBranch
	 * CashAccount32.AccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#AccountServicerBranch
	 * CashAccount33.AccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#DebtorAgentBranch
	 * DirectDebitMandate6.DebtorAgentBranch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Branch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies an organisation which is not a head office."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Branch = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount4.AccountServicerBranch, com.tools20022.repository.msg.DirectDebitMandate4.DebtorAgentBranch,
					com.tools20022.repository.msg.CashAccount26.AccountServicerBranch, com.tools20022.repository.msg.DirectDebitMandate5.DebtorAgentBranch, com.tools20022.repository.msg.CashAccount32.AccountServicerBranch,
					com.tools20022.repository.msg.CashAccount33.AccountServicerBranch, com.tools20022.repository.msg.DirectDebitMandate6.DebtorAgentBranch);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Branch";
			definition = "Specifies an organisation which is not a head office.";
			minOccurs = 0;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.ParentOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the process which originates the changes to an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewOrganisationInformation
	 * SecuritiesModification.NewOrganisationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which originates the changes to an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesModification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Specifies the process which originates the changes to an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place (including country) in which the organisation has its business
	 * activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#OperatingOrganisation
	 * Location.OperatingOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation6#CountryOfOperation
	 * Organisation6.CountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation7#CountryOfOperation
	 * Organisation7.CountryOfOperation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (including country) in which the organisation has its business activity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfOperation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation6.CountryOfOperation, com.tools20022.repository.msg.Organisation7.CountryOfOperation);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfOperation";
			definition = "Place (including country) in which the organisation has its business activity.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.OperatingOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place (including country) in which the organisation is registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#RegisteredOrganisation
	 * Location.RegisteredOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#CountryOfResidence
	 * OrganisationIdentification28.CountryOfResidence}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (including country) in which the organisation is registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfRegistration = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationIdentification28.CountryOfResidence);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfRegistration";
			definition = "Place (including country) in which the organisation is registered.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RegisteredOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Description of an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Legal standing of the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal standing of the organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LegalStructure = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalStructure";
			definition = "Legal standing of the organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LegalStructureCode.mmObject();
		}
	};
	/**
	 * Sector of business of the organisation, for example, pharmaceutical.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Sector#Organisation
	 * Sector.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4#Sector
	 * CollateralValuation4.Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#Sector
	 * CollateralValuation7.Sector}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sector of business of the organisation, for example, pharmaceutical."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValuation4.Sector, com.tools20022.repository.msg.CollateralValuation7.Sector);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Sector of business of the organisation, for example, pharmaceutical.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of interest process for which a list of organisations is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#Organisations
	 * BuyOrSellIndicationOfInterest.Organisations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process for which a list of organisations is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a list of organisations is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Organisations;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Strategy related to an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#Organisation
	 * OrganisationStrategy.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy
	 * OrganisationStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy related to an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to an organisation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OrganisationStrategy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Description of the structure of a company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#Organisation
	 * OrganisationHierarchy.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy
	 * OrganisationHierarchy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationHierarchy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the structure of a company."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrganisationHierarchy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationHierarchy";
			definition = "Description of the structure of a company.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Officer who has some rights to represent a given organisation. In account
	 * management, it is the person to be contacted by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#Organisation
	 * RepresentativeOfficer.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer
	 * RepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepresentativeOfficer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RepresentativeOfficer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date when the organisation was established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#EstablishmentDate
	 * LegalOrganisation2.EstablishmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the organisation was established."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EstablishmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LegalOrganisation2.EstablishmentDate);
			elementContext_lazy = () -> Organisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstablishmentDate";
			definition = "Date when the organisation was established.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Organisation";
				definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.ParentOrganisation, com.tools20022.repository.entity.Organisation.Branch,
						com.tools20022.repository.entity.OrganisationIdentification.Organisation, com.tools20022.repository.entity.Location.OperatingOrganisation, com.tools20022.repository.entity.Location.RegisteredOrganisation,
						com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation, com.tools20022.repository.entity.Sector.Organisation, com.tools20022.repository.entity.RepresentativeOfficer.Organisation,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Organisations, com.tools20022.repository.entity.OrganisationStrategy.Organisation, com.tools20022.repository.entity.OrganisationHierarchy.Organisation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.Organisation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.Organisation,
						com.tools20022.repository.choice.Party14Choice.Organisation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.Organisation,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.Organisation, com.tools20022.repository.msg.LongPaymentIdentification1.InstructingAgent,
						com.tools20022.repository.msg.LongPaymentIdentification1.InstructedAgent, com.tools20022.repository.msg.LiquidityCreditTransfer1.Creditor, com.tools20022.repository.msg.LiquidityCreditTransfer1.Debtor,
						com.tools20022.repository.msg.LiquidityDebitTransfer1.Creditor, com.tools20022.repository.msg.LiquidityDebitTransfer1.Debtor, com.tools20022.repository.msg.PEPISATransfer7.PrimaryCorporateInvestor,
						com.tools20022.repository.msg.PEPISATransfer7.SecondaryCorporateInvestor, com.tools20022.repository.msg.PEPISATransfer7.OtherCorporateInvestor,
						com.tools20022.repository.msg.PEPISATransfer11.PrimaryCorporateInvestor, com.tools20022.repository.msg.PEPISATransfer11.SecondaryCorporateInvestor,
						com.tools20022.repository.msg.PEPISATransfer11.OtherCorporateInvestor, com.tools20022.repository.msg.ISATransfer9.PrimaryCorporateInvestor, com.tools20022.repository.msg.ISATransfer9.SecondaryCorporateInvestor,
						com.tools20022.repository.msg.ISATransfer9.OtherCorporateInvestor, com.tools20022.repository.msg.CardPaymentEnvironment1.Merchant, com.tools20022.repository.msg.OriginalItemReference1.DebtorAgent,
						com.tools20022.repository.msg.OriginalItemReference1.IntermediaryAgent, com.tools20022.repository.msg.TradeParty1.LegalOrganisation, com.tools20022.repository.msg.OriginalItemReference2.DebtorAgent,
						com.tools20022.repository.msg.OriginalItemReference2.IntermediaryAgent, com.tools20022.repository.msg.Routing1.Firm, com.tools20022.repository.msg.Warrant2.WarrantAgent,
						com.tools20022.repository.msg.Issuance1.IssuerOrganisation, com.tools20022.repository.msg.QuoteStatus2.RelatedParties, com.tools20022.repository.msg.SingleQuote1.RelatedParties,
						com.tools20022.repository.msg.InstrumentLeg3.TradingParties, com.tools20022.repository.msg.QuoteRequest1.TradingParties, com.tools20022.repository.msg.RequestForQuote.TradingParties,
						com.tools20022.repository.choice.Party15Choice.Organisation, com.tools20022.repository.choice.Party16Choice.Organisation, com.tools20022.repository.msg.ISATransfer12.PrimaryCorporateInvestor,
						com.tools20022.repository.msg.ISATransfer12.SecondaryCorporateInvestor, com.tools20022.repository.msg.ISATransfer12.OtherCorporateInvestor, com.tools20022.repository.msg.OriginalPaymentInformation6.DebtorAgent,
						com.tools20022.repository.msg.OriginalPaymentInformation6.CreditorAgent, com.tools20022.repository.msg.ISATransfer19.PrimaryCorporateInvestor, com.tools20022.repository.msg.ISATransfer19.SecondaryCorporateInvestor,
						com.tools20022.repository.msg.ISATransfer19.OtherCorporateInvestor, com.tools20022.repository.msg.OriginalItemReference3.DebtorAgent, com.tools20022.repository.msg.OriginalItemReference3.IntermediaryAgent,
						com.tools20022.repository.choice.Party24Choice.Organisation, com.tools20022.repository.choice.Party23Choice.Organisation, com.tools20022.repository.msg.TradeParty2.LegalOrganisation,
						com.tools20022.repository.msg.OriginalItemReference4.DebtorAgent, com.tools20022.repository.msg.OriginalItemReference4.IntermediaryAgent, com.tools20022.repository.choice.Party30Choice.Organisation,
						com.tools20022.repository.choice.Party31Choice.Organisation, com.tools20022.repository.msg.ISATransfer24.PrimaryCorporateInvestor, com.tools20022.repository.msg.ISATransfer24.SecondaryCorporateInvestor,
						com.tools20022.repository.msg.ISATransfer24.OtherCorporateInvestor, com.tools20022.repository.msg.TradeParty3.LegalOrganisation, com.tools20022.repository.msg.OrganisationIdentification28.Name,
						com.tools20022.repository.msg.OrganisationIdentification28.PostalAddress, com.tools20022.repository.choice.Party33Choice.Organisation, com.tools20022.repository.choice.Party32Choice.Organisation,
						com.tools20022.repository.msg.OriginalPaymentInformation7.DebtorAgent, com.tools20022.repository.msg.OriginalPaymentInformation7.CreditorAgent);
				subType_lazy = () -> Arrays.asList(FinancialInstitution.mmObject(), NonFinancialInstitution.mmObject());
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.Purpose, com.tools20022.repository.entity.Organisation.RegistrationDate,
						com.tools20022.repository.entity.Organisation.OrganisationIdentification, com.tools20022.repository.entity.Organisation.ParentOrganisation, com.tools20022.repository.entity.Organisation.Branch,
						com.tools20022.repository.entity.Organisation.SecuritiesModification, com.tools20022.repository.entity.Organisation.PlaceOfOperation, com.tools20022.repository.entity.Organisation.PlaceOfRegistration,
						com.tools20022.repository.entity.Organisation.Description, com.tools20022.repository.entity.Organisation.LegalStructure, com.tools20022.repository.entity.Organisation.Sector,
						com.tools20022.repository.entity.Organisation.RelatedIndicationOfInterest, com.tools20022.repository.entity.Organisation.Strategy, com.tools20022.repository.entity.Organisation.OrganisationHierarchy,
						com.tools20022.repository.entity.Organisation.RepresentativeOfficer, com.tools20022.repository.entity.Organisation.EstablishmentDate);
				derivationComponent_lazy = () -> Arrays.asList(ContactDetails1.mmObject(), Organisation2.mmObject(), Organisation13.mmObject(), Organisation4.mmObject(), Organisation3.mmObject(),
						BranchAndFinancialInstitutionIdentification5.mmObject(), BranchAndFinancialInstitutionIdentification3.mmObject(), BranchAndFinancialInstitutionIdentification4.mmObject(), Organisation6.mmObject(),
						Organisation12.mmObject(), Organisation14.mmObject(), OrganisationModification1.mmObject(), Organisation7.mmObject(), Organisation5.mmObject(), Organisation8.mmObject(), Organisation9.mmObject(),
						BranchAndFinancialInstitutionIdentification.mmObject(), LegalOrganisation1.mmObject(), FinancialInstitution2.mmObject(), FinancialInstitution3.mmObject(), Organisation15.mmObject(), Organisation16.mmObject(),
						Organisation17.mmObject(), SectorAndLocation1.mmObject(), Organisation18.mmObject(), Organisation19.mmObject(), LegalOrganisation2.mmObject(), DerivativePartyIdentification1Choice.mmObject(),
						Organisation21.mmObject(), Organisation22.mmObject(), Organisation23.mmObject(), Organisation24.mmObject(), NameOrSector1Choice.mmObject(), ReportedPartyIdentification1.mmObject(), Organisation25.mmObject(),
						Organisation26.mmObject(), OrganisationIdentification28.mmObject(), Organisation30.mmObject(), Organisation29.mmObject(), NameAndLocation1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}