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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LegalStructureCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmPurpose
 * Organisation.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRegistrationDate
 * Organisation.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
 * Organisation.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
 * Organisation.mmParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmBranch
 * Organisation.mmBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmSecuritiesModification
 * Organisation.mmSecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfOperation
 * Organisation.mmPlaceOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfRegistration
 * Organisation.mmPlaceOfRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmDescription
 * Organisation.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmLegalStructure
 * Organisation.mmLegalStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmSector
 * Organisation.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRelatedIndicationOfInterest
 * Organisation.mmRelatedIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmStrategy
 * Organisation.mmStrategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationHierarchy
 * Organisation.mmOrganisationHierarchy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRepresentativeOfficer
 * Organisation.mmRepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmEstablishmentDate
 * Organisation.mmEstablishmentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
 * Organisation.mmParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmBranch
 * Organisation.mmBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
 * OrganisationIdentification.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmOperatingOrganisation
 * Location.mmOperatingOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmRegisteredOrganisation
 * Location.mmRegisteredOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
 * SecuritiesModification.mmNewOrganisationInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmOrganisation
 * Sector.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#mmOrganisation
 * RepresentativeOfficer.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmOrganisations
 * BuyOrSellIndicationOfInterest.mmOrganisations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#mmOrganisation
 * OrganisationStrategy.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#mmOrganisation
 * OrganisationHierarchy.mmOrganisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmOrganisation
 * InvestmentAccountOwnershipInformation5.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmOrganisation
 * InvestmentAccountOwnershipInformation2.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party14Choice#mmOrganisation
 * Party14Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmOrganisation
 * InvestmentAccountOwnershipInformation3.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmOrganisation
 * InvestmentAccountOwnershipInformation4.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmInstructingAgent
 * LongPaymentIdentification1.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmInstructedAgent
 * LongPaymentIdentification1.mmInstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmCreditor
 * LiquidityCreditTransfer1.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmDebtor
 * LiquidityCreditTransfer1.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1#mmCreditor
 * LiquidityDebitTransfer1.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1#mmDebtor
 * LiquidityDebitTransfer1.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmPrimaryCorporateInvestor
 * PEPISATransfer7.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmSecondaryCorporateInvestor
 * PEPISATransfer7.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmOtherCorporateInvestor
 * PEPISATransfer7.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmPrimaryCorporateInvestor
 * PEPISATransfer11.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmSecondaryCorporateInvestor
 * PEPISATransfer11.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmOtherCorporateInvestor
 * PEPISATransfer11.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmPrimaryCorporateInvestor
 * ISATransfer9.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmSecondaryCorporateInvestor
 * ISATransfer9.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmOtherCorporateInvestor
 * ISATransfer9.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#mmMerchant
 * CardPaymentEnvironment1.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmDebtorAgent
 * OriginalItemReference1.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmIntermediaryAgent
 * OriginalItemReference1.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty1#mmLegalOrganisation
 * TradeParty1.mmLegalOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmDebtorAgent
 * OriginalItemReference2.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmIntermediaryAgent
 * OriginalItemReference2.mmIntermediaryAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Routing1#mmFirm
 * Routing1.mmFirm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#mmWarrantAgent
 * Warrant2.mmWarrantAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssuerOrganisation
 * Issuance1.mmIssuerOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmRelatedParties
 * QuoteStatus2.mmRelatedParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmRelatedParties
 * SingleQuote1.mmRelatedParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmTradingParties
 * InstrumentLeg3.mmTradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmTradingParties
 * QuoteRequest1.mmTradingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmTradingParties
 * RequestForQuote.mmTradingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party15Choice#mmOrganisation
 * Party15Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party16Choice#mmOrganisation
 * Party16Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmPrimaryCorporateInvestor
 * ISATransfer12.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmSecondaryCorporateInvestor
 * ISATransfer12.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmOtherCorporateInvestor
 * ISATransfer12.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#mmDebtorAgent
 * OriginalPaymentInformation6.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#mmCreditorAgent
 * OriginalPaymentInformation6.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmPrimaryCorporateInvestor
 * ISATransfer19.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmSecondaryCorporateInvestor
 * ISATransfer19.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmOtherCorporateInvestor
 * ISATransfer19.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmDebtorAgent
 * OriginalItemReference3.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmIntermediaryAgent
 * OriginalItemReference3.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party24Choice#mmOrganisation
 * Party24Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party23Choice#mmOrganisation
 * Party23Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty2#mmLegalOrganisation
 * TradeParty2.mmLegalOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmDebtorAgent
 * OriginalItemReference4.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmIntermediaryAgent
 * OriginalItemReference4.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party30Choice#mmOrganisation
 * Party30Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party31Choice#mmOrganisation
 * Party31Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmPrimaryCorporateInvestor
 * ISATransfer24.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmSecondaryCorporateInvestor
 * ISATransfer24.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmOtherCorporateInvestor
 * ISATransfer24.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty3#mmLegalOrganisation
 * TradeParty3.mmLegalOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssuerOrganisation
 * Issuance3.mmIssuerOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant3#mmWarrantAgent
 * Warrant3.mmWarrantAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#mmName
 * OrganisationIdentification28.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#mmPostalAddress
 * OrganisationIdentification28.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party33Choice#mmOrganisation
 * Party33Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party32Choice#mmOrganisation
 * Party32Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmDebtorAgent
 * OriginalPaymentInformation7.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmCreditorAgent
 * OriginalPaymentInformation7.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty4#mmLegalOrganisation
 * TradeParty4.mmLegalOrganisation}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.Counterparty2 Counterparty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation2
 * LegalOrganisation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice
 * DerivativePartyIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Counterparty3 Counterparty3}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification27
 * OrganisationIdentification27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation27 Organisation27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification28
 * OrganisationIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation29 Organisation29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Counterparty15 Counterparty15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Counterparty17 Counterparty17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Counterparty16 Counterparty16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndLocation1
 * NameAndLocation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation31 Organisation31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation32 Organisation32}</li>
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
	protected Max35Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation2#mmPurpose
	 * Organisation2.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation13#mmPurpose
	 * Organisation13.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation4#mmPurpose
	 * Organisation4.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation3#mmPurpose
	 * Organisation3.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation15#mmPurpose
	 * Organisation15.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation16#mmPurpose
	 * Organisation16.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation17#mmPurpose
	 * Organisation17.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#mmPurpose
	 * Organisation21.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#mmPurpose
	 * Organisation22.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#mmPurpose
	 * Organisation24.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation27#mmPurpose
	 * Organisation27.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmPurpose
	 * Organisation30.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation29#mmPurpose
	 * Organisation29.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation31#mmPurpose
	 * Organisation31.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
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
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation2.mmPurpose, Organisation13.mmPurpose, Organisation4.mmPurpose, Organisation3.mmPurpose, Organisation15.mmPurpose, Organisation16.mmPurpose, Organisation17.mmPurpose,
					Organisation21.mmPurpose, Organisation22.mmPurpose, Organisation24.mmPurpose, Organisation27.mmPurpose, Organisation30.mmPurpose, Organisation29.mmPurpose, Organisation31.mmPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, eg, charity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime registrationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmRegistrationDate
	 * Organisation2.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#mmRegistrationDate
	 * Organisation13.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmRegistrationDate
	 * Organisation4.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmRegistrationDate
	 * Organisation3.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation6#mmRegistrationDate
	 * Organisation6.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmRegistrationDate
	 * Organisation12.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmRegistrationDate
	 * OrganisationModification1.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation7#mmRegistrationDate
	 * Organisation7.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#mmRegistrationDate
	 * Organisation15.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmRegistrationDate
	 * Organisation16.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#mmRegistrationDate
	 * Organisation17.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#mmRegistrationDate
	 * LegalOrganisation2.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmRegistrationDate
	 * Organisation21.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#mmRegistrationDate
	 * Organisation22.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmRegistrationDate
	 * Organisation24.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation27#mmRegistrationDate
	 * Organisation27.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmRegistrationDate
	 * Organisation30.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#mmRegistrationDate
	 * Organisation29.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation31#mmRegistrationDate
	 * Organisation31.mmRegistrationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
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
	public static final MMBusinessAttribute mmRegistrationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation2.mmRegistrationDate, Organisation13.mmRegistrationDate, Organisation4.mmRegistrationDate, Organisation3.mmRegistrationDate, Organisation6.mmRegistrationDate,
					Organisation12.mmRegistrationDate, OrganisationModification1.mmRegistrationDate, Organisation7.mmRegistrationDate, Organisation15.mmRegistrationDate, Organisation16.mmRegistrationDate, Organisation17.mmRegistrationDate,
					LegalOrganisation2.mmRegistrationDate, Organisation21.mmRegistrationDate, Organisation22.mmRegistrationDate, Organisation24.mmRegistrationDate, Organisation27.mmRegistrationDate, Organisation30.mmRegistrationDate,
					Organisation29.mmRegistrationDate, Organisation31.mmRegistrationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getRegistrationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.OrganisationIdentification> organisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
	 * OrganisationIdentification.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 861 elements</li>
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
	public static final MMBusinessAssociationEnd mmOrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> ListBuilderForOrganisation_00.addElems(new ArrayList<>());
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}
	};
	protected Organisation parentOrganisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmBranch
	 * Organisation.mmBranch}</li>
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
	public static final MMBusinessAssociationEnd mmParentOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentOrganisation";
			definition = "Organisation which is divided in branches.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmBranch;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Organisation> branch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
	 * Organisation.mmParentOrganisation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccount4#mmAccountServicerBranch
	 * CashAccount4.mmAccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorAgentBranch
	 * DirectDebitMandate4.mmDebtorAgentBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountServicerBranch
	 * CashAccount26.mmAccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAgentBranch
	 * DirectDebitMandate5.mmDebtorAgentBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount32#mmAccountServicerBranch
	 * CashAccount32.mmAccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountServicerBranch
	 * CashAccount33.mmAccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorAgentBranch
	 * DirectDebitMandate6.mmDebtorAgentBranch}</li>
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
	public static final MMBusinessAssociationEnd mmBranch = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount4.mmAccountServicerBranch, DirectDebitMandate4.mmDebtorAgentBranch, CashAccount26.mmAccountServicerBranch, DirectDebitMandate5.mmDebtorAgentBranch,
					CashAccount32.mmAccountServicerBranch, CashAccount33.mmAccountServicerBranch, DirectDebitMandate6.mmDebtorAgentBranch);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Branch";
			definition = "Specifies an organisation which is not a head office.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmParentOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected SecuritiesModification securitiesModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
	 * SecuritiesModification.mmNewOrganisationInformation}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesModification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Specifies the process which originates the changes to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Location> placeOfOperation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmOperatingOrganisation
	 * Location.mmOperatingOrganisation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Organisation6#mmCountryOfOperation
	 * Organisation6.mmCountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation7#mmCountryOfOperation
	 * Organisation7.mmCountryOfOperation}</li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfOperation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation6.mmCountryOfOperation, Organisation7.mmCountryOfOperation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfOperation";
			definition = "Place (including country) in which the organisation has its business activity.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmOperatingOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Location placeOfRegistration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmRegisteredOrganisation
	 * Location.mmRegisteredOrganisation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#mmCountryOfResidence
	 * OrganisationIdentification28.mmCountryOfResidence}</li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfRegistration = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OrganisationIdentification28.mmCountryOfResidence);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfRegistration";
			definition = "Place (including country) in which the organisation is registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmRegisteredOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Max350Text description;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
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
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LegalStructureCode legalStructure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation20#mmOrganisationLegalStatus
	 * Organisation20.mmOrganisationLegalStatus}</li>
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
	 * name} = "LegalStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal standing of the organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLegalStructure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation20.mmOrganisationLegalStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalStructure";
			definition = "Legal standing of the organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalStructureCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getLegalStructure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Sector sector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Sector#mmOrganisation
	 * Sector.mmOrganisation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4#mmSector
	 * CollateralValuation4.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#mmSector
	 * CollateralValuation7.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector1#mmSector
	 * NonFinancialInstitutionSector1.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector2#mmSector
	 * NonFinancialInstitutionSector2.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmCorporateSector
	 * TradeAdditionalQueryCriteria3.mmCorporateSector}</li>
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
	public static final MMBusinessAssociationEnd mmSector = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralValuation4.mmSector, CollateralValuation7.mmSector, NonFinancialInstitutionSector1.mmSector, NonFinancialInstitutionSector2.mmSector,
					TradeAdditionalQueryCriteria3.mmCorporateSector);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Sector of business of the organisation, for example, pharmaceutical.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	protected BuyOrSellIndicationOfInterest relatedIndicationOfInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmOrganisations
	 * BuyOrSellIndicationOfInterest.mmOrganisations}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a list of organisations is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmOrganisations;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	protected OrganisationStrategy strategy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#mmOrganisation
	 * OrganisationStrategy.mmOrganisation}</li>
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
	public static final MMBusinessAssociationEnd mmStrategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.mmObject();
		}
	};
	protected OrganisationHierarchy organisationHierarchy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#mmOrganisation
	 * OrganisationHierarchy.mmOrganisation}</li>
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
	public static final MMBusinessAssociationEnd mmOrganisationHierarchy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationHierarchy";
			definition = "Description of the structure of a company.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmObject();
		}
	};
	protected RepresentativeOfficer representativeOfficer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#mmOrganisation
	 * RepresentativeOfficer.mmOrganisation}</li>
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
	public static final MMBusinessAssociationEnd mmRepresentativeOfficer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmObject();
		}
	};
	protected ISODate establishmentDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#mmEstablishmentDate
	 * LegalOrganisation2.mmEstablishmentDate}</li>
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
	public static final MMBusinessAttribute mmEstablishmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LegalOrganisation2.mmEstablishmentDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstablishmentDate";
			definition = "Date when the organisation was established.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getEstablishmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation";
				definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmParentOrganisation, com.tools20022.repository.entity.Organisation.mmBranch,
						com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation, com.tools20022.repository.entity.Location.mmOperatingOrganisation, com.tools20022.repository.entity.Location.mmRegisteredOrganisation,
						com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation, com.tools20022.repository.entity.Sector.mmOrganisation, com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmOrganisations, com.tools20022.repository.entity.OrganisationStrategy.mmOrganisation,
						com.tools20022.repository.entity.OrganisationHierarchy.mmOrganisation);
				derivationElement_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation5.mmOrganisation, InvestmentAccountOwnershipInformation2.mmOrganisation, Party14Choice.mmOrganisation,
						InvestmentAccountOwnershipInformation3.mmOrganisation, InvestmentAccountOwnershipInformation4.mmOrganisation, LongPaymentIdentification1.mmInstructingAgent, LongPaymentIdentification1.mmInstructedAgent,
						LiquidityCreditTransfer1.mmCreditor, LiquidityCreditTransfer1.mmDebtor, LiquidityDebitTransfer1.mmCreditor, LiquidityDebitTransfer1.mmDebtor, PEPISATransfer7.mmPrimaryCorporateInvestor,
						PEPISATransfer7.mmSecondaryCorporateInvestor, PEPISATransfer7.mmOtherCorporateInvestor, PEPISATransfer11.mmPrimaryCorporateInvestor, PEPISATransfer11.mmSecondaryCorporateInvestor,
						PEPISATransfer11.mmOtherCorporateInvestor, ISATransfer9.mmPrimaryCorporateInvestor, ISATransfer9.mmSecondaryCorporateInvestor, ISATransfer9.mmOtherCorporateInvestor, CardPaymentEnvironment1.mmMerchant,
						OriginalItemReference1.mmDebtorAgent, OriginalItemReference1.mmIntermediaryAgent, TradeParty1.mmLegalOrganisation, OriginalItemReference2.mmDebtorAgent, OriginalItemReference2.mmIntermediaryAgent, Routing1.mmFirm,
						Warrant2.mmWarrantAgent, Issuance1.mmIssuerOrganisation, QuoteStatus2.mmRelatedParties, SingleQuote1.mmRelatedParties, InstrumentLeg3.mmTradingParties, QuoteRequest1.mmTradingParties,
						RequestForQuote.mmTradingParties, Party15Choice.mmOrganisation, Party16Choice.mmOrganisation, ISATransfer12.mmPrimaryCorporateInvestor, ISATransfer12.mmSecondaryCorporateInvestor,
						ISATransfer12.mmOtherCorporateInvestor, OriginalPaymentInformation6.mmDebtorAgent, OriginalPaymentInformation6.mmCreditorAgent, ISATransfer19.mmPrimaryCorporateInvestor, ISATransfer19.mmSecondaryCorporateInvestor,
						ISATransfer19.mmOtherCorporateInvestor, OriginalItemReference3.mmDebtorAgent, OriginalItemReference3.mmIntermediaryAgent, Party24Choice.mmOrganisation, Party23Choice.mmOrganisation, TradeParty2.mmLegalOrganisation,
						OriginalItemReference4.mmDebtorAgent, OriginalItemReference4.mmIntermediaryAgent, Party30Choice.mmOrganisation, Party31Choice.mmOrganisation, ISATransfer24.mmPrimaryCorporateInvestor,
						ISATransfer24.mmSecondaryCorporateInvestor, ISATransfer24.mmOtherCorporateInvestor, TradeParty3.mmLegalOrganisation, Issuance3.mmIssuerOrganisation, Warrant3.mmWarrantAgent, OrganisationIdentification28.mmName,
						OrganisationIdentification28.mmPostalAddress, Party33Choice.mmOrganisation, Party32Choice.mmOrganisation, OriginalPaymentInformation7.mmDebtorAgent, OriginalPaymentInformation7.mmCreditorAgent,
						TradeParty4.mmLegalOrganisation);
				subType_lazy = () -> Arrays.asList(FinancialInstitution.mmObject(), NonFinancialInstitution.mmObject());
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmPurpose, com.tools20022.repository.entity.Organisation.mmRegistrationDate,
						com.tools20022.repository.entity.Organisation.mmOrganisationIdentification, com.tools20022.repository.entity.Organisation.mmParentOrganisation, com.tools20022.repository.entity.Organisation.mmBranch,
						com.tools20022.repository.entity.Organisation.mmSecuritiesModification, com.tools20022.repository.entity.Organisation.mmPlaceOfOperation, com.tools20022.repository.entity.Organisation.mmPlaceOfRegistration,
						com.tools20022.repository.entity.Organisation.mmDescription, com.tools20022.repository.entity.Organisation.mmLegalStructure, com.tools20022.repository.entity.Organisation.mmSector,
						com.tools20022.repository.entity.Organisation.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.Organisation.mmStrategy, com.tools20022.repository.entity.Organisation.mmOrganisationHierarchy,
						com.tools20022.repository.entity.Organisation.mmRepresentativeOfficer, com.tools20022.repository.entity.Organisation.mmEstablishmentDate);
				derivationComponent_lazy = () -> Arrays.asList(ContactDetails1.mmObject(), Organisation2.mmObject(), Organisation13.mmObject(), Organisation4.mmObject(), Organisation3.mmObject(),
						BranchAndFinancialInstitutionIdentification5.mmObject(), BranchAndFinancialInstitutionIdentification3.mmObject(), BranchAndFinancialInstitutionIdentification4.mmObject(), Organisation6.mmObject(),
						Organisation12.mmObject(), Organisation14.mmObject(), OrganisationModification1.mmObject(), Organisation7.mmObject(), Organisation5.mmObject(), Organisation8.mmObject(), Organisation9.mmObject(),
						BranchAndFinancialInstitutionIdentification.mmObject(), LegalOrganisation1.mmObject(), FinancialInstitution2.mmObject(), FinancialInstitution3.mmObject(), Organisation15.mmObject(), Organisation16.mmObject(),
						Organisation17.mmObject(), SectorAndLocation1.mmObject(), Organisation18.mmObject(), Organisation19.mmObject(), Counterparty2.mmObject(), LegalOrganisation2.mmObject(),
						DerivativePartyIdentification1Choice.mmObject(), Counterparty3.mmObject(), Organisation21.mmObject(), Organisation22.mmObject(), Organisation23.mmObject(), Organisation24.mmObject(), NameOrSector1Choice.mmObject(),
						ReportedPartyIdentification1.mmObject(), Organisation25.mmObject(), Organisation26.mmObject(), OrganisationIdentification27.mmObject(), Organisation27.mmObject(), OrganisationIdentification28.mmObject(),
						Organisation30.mmObject(), Organisation29.mmObject(), Counterparty15.mmObject(), Counterparty17.mmObject(), Counterparty16.mmObject(), NameAndLocation1.mmObject(), Organisation31.mmObject(),
						Organisation32.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Organisation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public Organisation setPurpose(Max35Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public ISODateTime getRegistrationDate() {
		return registrationDate;
	}

	public Organisation setRegistrationDate(ISODateTime registrationDate) {
		this.registrationDate = Objects.requireNonNull(registrationDate);
		return this;
	}

	public List<OrganisationIdentification> getOrganisationIdentification() {
		return organisationIdentification == null ? organisationIdentification = new ArrayList<>() : organisationIdentification;
	}

	public Organisation setOrganisationIdentification(List<com.tools20022.repository.entity.OrganisationIdentification> organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public Organisation getParentOrganisation() {
		return parentOrganisation;
	}

	public Organisation setParentOrganisation(com.tools20022.repository.entity.Organisation parentOrganisation) {
		this.parentOrganisation = Objects.requireNonNull(parentOrganisation);
		return this;
	}

	public List<Organisation> getBranch() {
		return branch == null ? branch = new ArrayList<>() : branch;
	}

	public Organisation setBranch(List<com.tools20022.repository.entity.Organisation> branch) {
		this.branch = Objects.requireNonNull(branch);
		return this;
	}

	public SecuritiesModification getSecuritiesModification() {
		return securitiesModification;
	}

	public Organisation setSecuritiesModification(com.tools20022.repository.entity.SecuritiesModification securitiesModification) {
		this.securitiesModification = Objects.requireNonNull(securitiesModification);
		return this;
	}

	public List<Location> getPlaceOfOperation() {
		return placeOfOperation == null ? placeOfOperation = new ArrayList<>() : placeOfOperation;
	}

	public Organisation setPlaceOfOperation(List<com.tools20022.repository.entity.Location> placeOfOperation) {
		this.placeOfOperation = Objects.requireNonNull(placeOfOperation);
		return this;
	}

	public Optional<Location> getPlaceOfRegistration() {
		return placeOfRegistration == null ? Optional.empty() : Optional.of(placeOfRegistration);
	}

	public Organisation setPlaceOfRegistration(com.tools20022.repository.entity.Location placeOfRegistration) {
		this.placeOfRegistration = placeOfRegistration;
		return this;
	}

	public Max350Text getDescription() {
		return description;
	}

	public Organisation setDescription(Max350Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public LegalStructureCode getLegalStructure() {
		return legalStructure;
	}

	public Organisation setLegalStructure(LegalStructureCode legalStructure) {
		this.legalStructure = Objects.requireNonNull(legalStructure);
		return this;
	}

	public Sector getSector() {
		return sector;
	}

	public Organisation setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = Objects.requireNonNull(sector);
		return this;
	}

	public Optional<BuyOrSellIndicationOfInterest> getRelatedIndicationOfInterest() {
		return relatedIndicationOfInterest == null ? Optional.empty() : Optional.of(relatedIndicationOfInterest);
	}

	public Organisation setRelatedIndicationOfInterest(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest relatedIndicationOfInterest) {
		this.relatedIndicationOfInterest = relatedIndicationOfInterest;
		return this;
	}

	public Optional<OrganisationStrategy> getStrategy() {
		return strategy == null ? Optional.empty() : Optional.of(strategy);
	}

	public Organisation setStrategy(com.tools20022.repository.entity.OrganisationStrategy strategy) {
		this.strategy = strategy;
		return this;
	}

	public OrganisationHierarchy getOrganisationHierarchy() {
		return organisationHierarchy;
	}

	public Organisation setOrganisationHierarchy(com.tools20022.repository.entity.OrganisationHierarchy organisationHierarchy) {
		this.organisationHierarchy = Objects.requireNonNull(organisationHierarchy);
		return this;
	}

	public RepresentativeOfficer getRepresentativeOfficer() {
		return representativeOfficer;
	}

	public Organisation setRepresentativeOfficer(com.tools20022.repository.entity.RepresentativeOfficer representativeOfficer) {
		this.representativeOfficer = Objects.requireNonNull(representativeOfficer);
		return this;
	}

	public ISODate getEstablishmentDate() {
		return establishmentDate;
	}

	public Organisation setEstablishmentDate(ISODate establishmentDate) {
		this.establishmentDate = Objects.requireNonNull(establishmentDate);
		return this;
	}
}