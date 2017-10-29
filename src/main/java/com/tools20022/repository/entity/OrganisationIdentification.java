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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify an organisation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="OrganisationIdentification"
 * src="doc-files/OrganisationIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#BICFI
 * OrganisationIdentification.BICFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#AnyBIC
 * OrganisationIdentification.AnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#OrganisationName
 * OrganisationIdentification.OrganisationName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#Organisation
 * OrganisationIdentification.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#ClearingSystemMemberIdentificationType
 * OrganisationIdentification.ClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#BICNonFI
 * OrganisationIdentification.BICNonFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#EANGLN
 * OrganisationIdentification.EANGLN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#CHIPSUniversalIdentifier
 * OrganisationIdentification.CHIPSUniversalIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#DUNS
 * OrganisationIdentification.DUNS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#BankPartyIdentification
 * OrganisationIdentification.BankPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#MIC
 * OrganisationIdentification.MIC}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
 * Organisation.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#Organisation
 * OrganisationName.Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#OrganisationIdentification
 * CashClearingSystemMember.OrganisationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice#NameAndAddress
 * FinancialInstitutionIdentification3Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#Other
 * FinancialInstitutionIdentification8.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party2Choice#OrganisationIdentification
 * Party2Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party6Choice#OrganisationIdentification
 * Party6Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party11Choice#OrganisationIdentification
 * Party11Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#NameAndAddress
 * FinancialInstitutionIdentification5Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#CombinedIdentification
 * FinancialInstitutionIdentification5Choice.CombinedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#Other
 * FinancialInstitutionIdentification7.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party8Choice#OrganisationIdentification
 * Party8Choice.OrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent1#Agent
 * ProprietaryAgent1.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent2#Agent
 * ProprietaryAgent2.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent3#Agent
 * ProprietaryAgent3.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges2#Agent Charges2.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party10Choice#OrganisationIdentification
 * Party10Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party9Choice#OrganisationIdentification
 * Party9Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party9Choice#FinancialInstitutionIdentification
 * Party9Choice.FinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#LegalEntityIdentifier
 * PartyIdentification59.LegalEntityIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice#AnyBIC
 * PartyIdentification73Choice.AnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification60#LegalEntityIdentifier
 * PartyIdentification60.LegalEntityIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party1Choice#OrganisationIdentification
 * Party1Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice#NameAndAddress
 * FinancialInstitutionIdentification4Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#Other
 * FinancialInstitutionIdentification9.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party13Choice#OrganisationIdentification
 * Party13Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party13Choice#FinancialInstitutionIdentification
 * Party13Choice.FinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#AccountServicer
 * CashAccountCharacteristics1.AccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyOrganisation1Choice#OrganisationIdentification
 * PartyOrganisation1Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party5Choice#OrganisationIdentification
 * Party5Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice#NameAndAddress
 * FinancialInstitutionIdentification6Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#Other
 * TradingVenueIdentification1Choice.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountServicer
 * CashAccountCharacteristics2.AccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party29Choice#OrganisationIdentification
 * Party29Choice.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party29Choice#FinancialInstitutionIdentification
 * Party29Choice.FinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Party1#OrganisationIdentification
 * Party1.OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#NameAndAddress
 * FinancialInstitutionIdentification7Choice.NameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10#Party
 * FinancialInstitutionIdentification10.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#NameAndAddress
 * FinancialInstitutionIdentification8Choice.NameAndAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData BranchData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice
 * FinancialInstitutionIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1
 * GenericFinancialIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8
 * FinancialInstitutionIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData2 BranchData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification2
 * OrganisationIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice
 * OrganisationIdentificationSchemeName1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1
 * GenericOrganisationIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification4
 * OrganisationIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification8
 * OrganisationIdentification8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3
 * FinancialInstitutionIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice
 * FinancialInstitutionIdentification5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7
 * FinancialInstitutionIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification7
 * OrganisationIdentification7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName2Choice
 * OrganisationIdentificationSchemeName2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification2
 * GenericOrganisationIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification9
 * OrganisationIdentification9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BICOrCountryCodeChoice
 * BICOrCountryCodeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification6
 * OrganisationIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent1
 * ProprietaryAgent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent2
 * ProprietaryAgent2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent3
 * ProprietaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1
 * FinancialInstitutionIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification5
 * OrganisationIdentification5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
 * FinancialInstitutionIdentification6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice
 * FinancialInstitutionIdentification4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9
 * FinancialInstitutionIdentification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification3
 * OrganisationIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification4
 * FinancialInstitutionIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification5
 * FinancialInstitutionIdentification5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice
 * FinancialInstitutionIdentification6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentificationSD1
 * OrganisationIdentificationSD1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification13
 * FinancialInstitutionIdentification13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
 * TradingVenueIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2
 * SecuritiesTransactionTransmission2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Party1 Party1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification26
 * OrganisationIdentification26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
 * FinancialInstitutionIdentification7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingVenueIdentification2
 * TradingVenueIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxOrganisationIdentification1
 * TaxOrganisationIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
 * FinancialInstitutionIdentification10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice
 * FinancialInstitutionIdentification8Choice}</li>
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
 * "OrganisationIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify an organisation."</li>
 * </ul>
 */
public class OrganisationIdentification extends PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code allocated to a financial institution by the ISO 9362 Registration
	 * Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails1#Identification
	 * ContactDetails1.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount15#Servicer
	 * CashAccount15.Servicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount14#Servicer
	 * CashAccount14.Servicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#Identification
	 * OrderDeskContactDetails.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount21#Servicer
	 * CashAccount21.Servicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount22#Servicer
	 * CashAccount22.Servicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice#BIC
	 * FinancialInstitutionIdentification3Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentificationChoice#BIC
	 * MemberIdentificationChoice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#BICFI
	 * MemberIdentification2Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#InstructingAgentIdentification
	 * PaymentInstructionReference1Details.InstructingAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#InstructedAgentIdentification
	 * PaymentInstructionReference1Details.InstructedAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#InstructingAgentIdentification
	 * PaymentInstructionReference2Details.InstructingAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#InstructedAgentIdentification
	 * PaymentInstructionReference2Details.InstructedAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#InstructingAgentIdentification
	 * PaymentInstructionReferenceDetails3.InstructingAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#InstructedAgentIdentification
	 * PaymentInstructionReferenceDetails3.InstructedAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#InstructingAgentIdentification
	 * PaymentInstructionReferenceDetails4.InstructingAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#InstructedAgentIdentification
	 * PaymentInstructionReferenceDetails4.InstructedAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#BICFI
	 * FinancialInstitutionIdentification8.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#AccountOwner
	 * LimitIdentificationDetails1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2#AccountOwner
	 * LimitIdentificationDetails2.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#BIC
	 * OrganisationIdentification2.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#AccountOwner
	 * LimitSearchCriteria1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#AccountOwner
	 * LimitSearchCriteria2.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#AccountOwner
	 * LimitSearchCriteria3.AccountOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BICIdentification1#BIC
	 * BICIdentification1.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification1#AccountOwner
	 * StandingOrderIdentification1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#AccountServicer
	 * CashAccountDetails1.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#AccountServicer
	 * CashAccountDetails3.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#BIC
	 * FinancialInstitutionIdentification3.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#BIC
	 * FinancialInstitutionIdentification5Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#BIC
	 * FinancialInstitutionIdentification7.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification3Choice#BIC
	 * PartyIdentification3Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification30Choice#BIC
	 * PartyIdentification30Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification38Choice#BICFI
	 * PartyIdentification38Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification61Choice#BICFI
	 * PartyIdentification61Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification31Choice#BIC
	 * PartyIdentification31Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification42Choice#BICFI
	 * PartyIdentification42Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification55Choice#BICFI
	 * PartyIdentification55Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#BIC
	 * PartyIdentification32Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice#BIC
	 * PartyIdentification35Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#BIC
	 * PartyIdentification6Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BICOrCountryCodeChoice#BIC
	 * BICOrCountryCodeChoice.BIC}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification54#BIC
	 * PartyIdentification54.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification68Choice#BIC
	 * PartyIdentification68Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6#BIC
	 * OrganisationIdentification6.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#BIC
	 * FinancialInstitutionIdentification1.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#BIC
	 * FinancialInstitutionIdentification6.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice#BIC
	 * FinancialInstitutionIdentification4Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission2#Submitter
	 * RequiredSubmission2.Submitter}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#BuyerSideSubmittingBank
	 * Baseline3.BuyerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#SellerSideSubmittingBank
	 * Baseline3.SellerSideSubmittingBank}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification3#BIC
	 * ContactIdentification3.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification29Choice#BIC
	 * PartyIdentification29Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice#BIC
	 * PartyIdentification34Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#BICFI
	 * FinancialInstitutionIdentification9.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification3#BIC
	 * OrganisationIdentification3.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification4#BIC
	 * FinancialInstitutionIdentification4.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice#BIC
	 * FinancialInstitutionIdentification6Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3#RelatedPartyIdentification
	 * SystemPartyIdentification3.RelatedPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3#ResponsiblePartyIdentification
	 * SystemPartyIdentification3.ResponsiblePartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5#ResponsiblePartyIdentification
	 * SystemPartyIdentification5.ResponsiblePartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TechnicalIdentification1Choice#BICFI
	 * TechnicalIdentification1Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification1#Identification
	 * SystemPartyIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CSDOrNCB1Choice#CSDIdentification
	 * CSDOrNCB1Choice.CSDIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CSDOrNCB1Choice#NCBIdentification
	 * CSDOrNCB1Choice.NCBIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification2#Identification
	 * SystemPartyIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification4#Identification
	 * SystemPartyIdentification4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification4#ResponsiblePartyIdentification
	 * SystemPartyIdentification4.ResponsiblePartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification4#AccountOwner
	 * LimitIdentification4.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#BilledCustomerIdentification
	 * ServiceCategoryTotals1.BilledCustomerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#BilledCustomerIdentification
	 * BillingSearchCriteria1.BilledCustomerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#AccountOwner
	 * LimitUtilisationJournalSearchCriteria1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#BuyerSideSubmittingBank
	 * Baseline4.BuyerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#SellerSideSubmittingBank
	 * Baseline4.SellerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification13#BICFI
	 * FinancialInstitutionIdentification13.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#BuyerSideSubmittingBank
	 * Baseline5.BuyerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#SellerSideSubmittingBank
	 * Baseline5.SellerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification88Choice#BICFI
	 * PartyIdentification88Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#BICFI
	 * PartyIdentification94Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#BICFI
	 * FinancialInstitutionIdentification7Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice#AnyBIC
	 * PartyIdentification102Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#BIC
	 * PartyIdentification101Choice.BIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification113Choice#BICFI
	 * PartyIdentification113Choice.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#BICFI
	 * FinancialInstitutionIdentification8Choice.BICFI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BICFI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails1.Identification, com.tools20022.repository.msg.CashAccount15.Servicer, com.tools20022.repository.msg.CashAccount14.Servicer,
					com.tools20022.repository.msg.OrderDeskContactDetails.Identification, com.tools20022.repository.msg.CashAccount21.Servicer, com.tools20022.repository.msg.CashAccount22.Servicer,
					com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice.BIC, com.tools20022.repository.choice.MemberIdentificationChoice.BIC, com.tools20022.repository.choice.MemberIdentification2Choice.BICFI,
					com.tools20022.repository.msg.PaymentInstructionReference1Details.InstructingAgentIdentification, com.tools20022.repository.msg.PaymentInstructionReference1Details.InstructedAgentIdentification,
					com.tools20022.repository.msg.PaymentInstructionReference2Details.InstructingAgentIdentification, com.tools20022.repository.msg.PaymentInstructionReference2Details.InstructedAgentIdentification,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.InstructingAgentIdentification, com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.InstructedAgentIdentification,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.InstructingAgentIdentification, com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.InstructedAgentIdentification,
					com.tools20022.repository.msg.FinancialInstitutionIdentification8.BICFI, com.tools20022.repository.msg.LimitIdentificationDetails1.AccountOwner, com.tools20022.repository.msg.LimitIdentificationDetails2.AccountOwner,
					com.tools20022.repository.msg.OrganisationIdentification2.BIC, com.tools20022.repository.msg.LimitSearchCriteria1.AccountOwner, com.tools20022.repository.msg.LimitSearchCriteria2.AccountOwner,
					com.tools20022.repository.msg.LimitSearchCriteria3.AccountOwner, com.tools20022.repository.msg.BICIdentification1.BIC, com.tools20022.repository.msg.StandingOrderIdentification1.AccountOwner,
					com.tools20022.repository.msg.CashAccountDetails1.AccountServicer, com.tools20022.repository.msg.CashAccountDetails3.AccountServicer, com.tools20022.repository.msg.FinancialInstitutionIdentification3.BIC,
					com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice.BIC, com.tools20022.repository.msg.FinancialInstitutionIdentification7.BIC, com.tools20022.repository.choice.PartyIdentification3Choice.BIC,
					com.tools20022.repository.choice.PartyIdentification30Choice.BIC, com.tools20022.repository.choice.PartyIdentification38Choice.BICFI, com.tools20022.repository.choice.PartyIdentification61Choice.BICFI,
					com.tools20022.repository.choice.PartyIdentification31Choice.BIC, com.tools20022.repository.choice.PartyIdentification42Choice.BICFI, com.tools20022.repository.choice.PartyIdentification55Choice.BICFI,
					com.tools20022.repository.choice.PartyIdentification32Choice.BIC, com.tools20022.repository.choice.PartyIdentification35Choice.BIC, com.tools20022.repository.msg.PartyIdentification6Choice.BIC,
					com.tools20022.repository.choice.BICOrCountryCodeChoice.BIC, com.tools20022.repository.msg.PartyIdentification54.BIC, com.tools20022.repository.choice.PartyIdentification68Choice.BIC,
					com.tools20022.repository.msg.OrganisationIdentification6.BIC, com.tools20022.repository.msg.FinancialInstitutionIdentification1.BIC, com.tools20022.repository.msg.FinancialInstitutionIdentification6.BIC,
					com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice.BIC, com.tools20022.repository.msg.RequiredSubmission2.Submitter, com.tools20022.repository.msg.Baseline3.BuyerSideSubmittingBank,
					com.tools20022.repository.msg.Baseline3.SellerSideSubmittingBank, com.tools20022.repository.msg.ContactIdentification3.BIC, com.tools20022.repository.choice.PartyIdentification29Choice.BIC,
					com.tools20022.repository.choice.PartyIdentification34Choice.BIC, com.tools20022.repository.msg.FinancialInstitutionIdentification9.BICFI, com.tools20022.repository.msg.OrganisationIdentification3.BIC,
					com.tools20022.repository.msg.FinancialInstitutionIdentification4.BIC, com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice.BIC,
					com.tools20022.repository.msg.SystemPartyIdentification3.RelatedPartyIdentification, com.tools20022.repository.msg.SystemPartyIdentification3.ResponsiblePartyIdentification,
					com.tools20022.repository.msg.SystemPartyIdentification5.ResponsiblePartyIdentification, com.tools20022.repository.choice.TechnicalIdentification1Choice.BICFI,
					com.tools20022.repository.msg.SystemPartyIdentification1.Identification, com.tools20022.repository.choice.CSDOrNCB1Choice.CSDIdentification, com.tools20022.repository.choice.CSDOrNCB1Choice.NCBIdentification,
					com.tools20022.repository.msg.SystemPartyIdentification2.Identification, com.tools20022.repository.msg.SystemPartyIdentification4.Identification,
					com.tools20022.repository.msg.SystemPartyIdentification4.ResponsiblePartyIdentification, com.tools20022.repository.msg.LimitIdentification4.AccountOwner,
					com.tools20022.repository.msg.ServiceCategoryTotals1.BilledCustomerIdentification, com.tools20022.repository.msg.BillingSearchCriteria1.BilledCustomerIdentification,
					com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.AccountOwner, com.tools20022.repository.msg.Baseline4.BuyerSideSubmittingBank, com.tools20022.repository.msg.Baseline4.SellerSideSubmittingBank,
					com.tools20022.repository.msg.FinancialInstitutionIdentification13.BICFI, com.tools20022.repository.msg.Baseline5.BuyerSideSubmittingBank, com.tools20022.repository.msg.Baseline5.SellerSideSubmittingBank,
					com.tools20022.repository.choice.PartyIdentification88Choice.BICFI, com.tools20022.repository.choice.PartyIdentification94Choice.BICFI, com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.BICFI,
					com.tools20022.repository.choice.PartyIdentification102Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification101Choice.BIC, com.tools20022.repository.choice.PartyIdentification113Choice.BICFI,
					com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice.BICFI);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	/**
	 * Code allocated to a financial or non-financial institution by the ISO
	 * 9362 Registration Authority, as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#BICOrBEI
	 * PartyIdentification1Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#BICOrBEI
	 * PartyIdentification2Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification4Choice#BICOrBEI
	 * PartyIdentification4Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#BICOrBEI
	 * PartyIdentification5Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification4#BICOrBEI
	 * OrganisationIdentification4.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#AnyBIC
	 * OrganisationIdentification8.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#AccountOwner
	 * AccountCashEntrySearch2.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#AccountServicer
	 * AccountCashEntrySearch2.AccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#AccountOwner
	 * CashAccountDetails1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice#BICOrBEI
	 * PartyIdentification13Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice#AnyBIC
	 * PartyIdentification36Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#AnyBIC
	 * OrganisationIdentification7.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification51Choice#AnyBIC
	 * PartyIdentification51Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification9#AnyBIC
	 * OrganisationIdentification9.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification12Choice#BICOrBEI
	 * PartyIdentification12Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#BICOrBEI
	 * PartyIdentification10Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice#BICOrBEI
	 * PartyIdentification14Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification44Choice#AnyBIC
	 * PartyIdentification44Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification45Choice#AnyBIC
	 * PartyIdentification45Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice#AnyBIC
	 * PartyIdentification37Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#PlaceOfClearing
	 * SecuritiesTradeDetails25.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1#Identification
	 * SafekeepingPlaceTypeAndAnyBICIdentifier1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice#AnyBIC
	 * PartyIdentification43Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#PlaceOfClearing
	 * SecuritiesTradeDetails26.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification58Choice#AnyBIC
	 * PartyIdentification58Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification62Choice#AnyBIC
	 * PartyIdentification62Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice#AnyBIC
	 * PartyIdentification60Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification65Choice#AnyBIC
	 * PartyIdentification65Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#PlaceOfClearing
	 * SecuritiesTradeDetails27.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#PlaceOfClearing
	 * SecuritiesTradeDetails28.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification18Choice#BICOrBEI
	 * PartyIdentification18Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification16Choice#BICOrBEI
	 * PartyIdentification16Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#AnyBIC
	 * PartyIdentification46Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification56Choice#AnyBIC
	 * PartyIdentification56Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification48Choice#AnyBIC
	 * PartyIdentification48Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification52Choice#AnyBIC
	 * PartyIdentification52Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification41Choice#AnyBIC
	 * PartyIdentification41Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification50Choice#AnyBIC
	 * PartyIdentification50Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification17Choice#BICOrBEI
	 * PartyIdentification17Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification39Choice#AnyBIC
	 * PartyIdentification39Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#AnyBIC
	 * PartyIdentification40Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification53Choice#AnyBIC
	 * PartyIdentification53Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification54Choice#AnyBIC
	 * PartyIdentification54Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#AnyBIC
	 * PartyIdentification47Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification57Choice#AnyBIC
	 * PartyIdentification57Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification3#BICOrBEI
	 * PartyIdentification3.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice#AnyBIC
	 * PartyIdentification49Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice#AnyBIC
	 * PartyIdentification59Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#PlaceOfClearing
	 * SecuritiesTradeDetails6.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#PlaceOfClearing
	 * SecuritiesTradeDetails13.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#PlaceOfClearing
	 * SecuritiesTradeDetails3.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#PlaceOfClearing
	 * SecuritiesTradeDetails11.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification64Choice#AnyBIC
	 * PartyIdentification64Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#PlaceOfClearing
	 * SecuritiesTradeDetails2.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#PlaceOfClearing
	 * SecuritiesTradeDetails16.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification63Choice#AnyBIC
	 * PartyIdentification63Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#PlaceOfClearing
	 * SecuritiesTradeDetails1.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#PlaceOfClearing
	 * SecuritiesTradeDetails15.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#PlaceOfClearing
	 * TransactionDetails5.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice#BICOrBEI
	 * PartyIdentification15Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#PlaceOfClearing
	 * TransactionDetails9.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#PlaceOfClearing
	 * TransactionDetails22.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#PlaceOfClearing
	 * TransactionDetails23.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#PlaceOfClearing
	 * TransactionDetails36.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#PlaceOfClearing
	 * TransactionDetails47.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#PlaceOfClearing
	 * TransactionDetails53.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#PlaceOfClearing
	 * TransactionDetails58.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#PlaceOfClearing
	 * TransactionDetails7.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#PlaceOfClearing
	 * TransactionDetails16.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#PlaceOfClearing
	 * TransactionDetails26.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#PlaceOfClearing
	 * TransactionDetails27.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#PlaceOfClearing
	 * TransactionDetails39.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#PlaceOfClearing
	 * TransactionDetails50.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#PlaceOfClearing
	 * TransactionDetails56.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#PlaceOfClearing
	 * TransactionDetails59.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#PlaceOfClearing
	 * TransactionDetails6.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#PlaceOfClearing
	 * TransactionDetails18.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#PlaceOfClearing
	 * TransactionDetails24.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#PlaceOfClearing
	 * TransactionDetails34.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#PlaceOfClearing
	 * TransactionDetails37.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#PlaceOfClearing
	 * TransactionDetails48.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#PlaceOfClearing
	 * TransactionDetails57.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#PlaceOfClearing
	 * TransactionDetails60.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#AnyBIC
	 * PartyIdentification70Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification23Choice#BICOrBEI
	 * PartyIdentification23Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification23#BICOrBEI
	 * PartyIdentification23.BICOrBEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Case#Creator Case.Creator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification7Choice#BICOrBEI
	 * PartyIdentification7Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification22#BICOrBEI
	 * PartyIdentification22.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice#BICOrBEI
	 * PartyIdentification8Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification44#AnyBIC
	 * PartyIdentification44.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification19Choice#AnyBIC
	 * PartyIdentification19Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#AnyBIC
	 * PartyIdentification59.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice#Party
	 * PlaceOfTradeIdentification1Choice.Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice#BICOrBEI
	 * PartyIdentification9Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#CorrespondentBankIdentification
	 * CashAccount17.CorrespondentBankIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OffMarket1Choice#SystematicInternaliser
	 * OffMarket1Choice.SystematicInternaliser}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice#BICOrBEI
	 * PartyIdentification24Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification11Choice#BICOrBEI
	 * PartyIdentification11Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#PlaceOfClearing
	 * SecuritiesTradeDetails8.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#PlaceOfClearing
	 * SecuritiesTradeDetails18.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#PlaceOfClearing
	 * SecuritiesTradeDetails4.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#PlaceOfClearing
	 * SecuritiesTradeDetails17.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#AnyBIC
	 * PartyIdentification33Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#PlaceOfClearing
	 * SecuritiesTradeDetails9.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#PlaceOfClearing
	 * SecuritiesTradeDetails21.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#PlaceOfClearing
	 * SecuritiesTradeDetails10.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#PlaceOfClearing
	 * SecuritiesTradeDetails22.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#PlaceOfClearing
	 * SecuritiesTradeDetails23.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#PlaceOfClearing
	 * SecuritiesTradeDetails29.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification66Choice#AnyBIC
	 * PartyIdentification66Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice#AnyBIC
	 * PartyIdentification67Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification26Choice#BICOrBEI
	 * PartyIdentification26Choice.BICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice#AnyBIC
	 * PartyIdentification72Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#AnyBIC
	 * PartyIdentification71Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#PlaceOfClearing
	 * TransactionDetails51.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#PlaceOfClearing
	 * TransactionDetails61.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#PlaceOfClearing
	 * TransactionDetails62.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#PlaceOfClearing
	 * TransactionDetails63.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#PlaceOfClearing
	 * SecuritiesTradeDetails31.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#PlaceOfClearing
	 * SecuritiesTradeDetails33.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#PlaceOfClearing
	 * SecuritiesTradeDetails35.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#PlaceOfClearing
	 * SecuritiesTradeDetails38.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#PlaceOfClearing
	 * SecuritiesTradeDetails37.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#PlaceOfClearing
	 * SecuritiesTradeDetails36.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#PlaceOfClearing
	 * SecuritiesTradeDetails34.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#PlaceOfClearing
	 * SecuritiesTradeDetails32.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#BICFI
	 * PartyIdentification62.BICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#AnyBIC
	 * PartyIdentification64.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification75Choice#AnyBIC
	 * PartyIdentification75Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#PlaceOfClearing
	 * SecuritiesTradeDetails44.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#PlaceOfClearing
	 * SecuritiesTradeDetails39.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#PlaceOfClearing
	 * SecuritiesTradeDetails43.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#PlaceOfClearing
	 * SecuritiesTradeDetails41.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#PlaceOfClearing
	 * SecuritiesTradeDetails40.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#PlaceOfClearing
	 * TransactionDetails66.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#PlaceOfClearing
	 * SecuritiesTradeDetails42.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#PlaceOfClearing
	 * TransactionDetails67.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#PlaceOfClearing
	 * TransactionDetails68.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#PlaceOfClearing
	 * SecuritiesTradeDetails46.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#PlaceOfClearing
	 * SecuritiesTradeDetails47.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#PlaceOfClearing
	 * TransactionDetails70.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#PlaceOfClearing
	 * TransactionDetails69.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#AnyBIC
	 * PartyIdentification83Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification89Choice#AnyBIC
	 * PartyIdentification89Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification87Choice#AnyBIC
	 * PartyIdentification87Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#PlaceOfClearing
	 * TransactionDetails71.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#PlaceOfClearing
	 * TransactionDetails72.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#AnyBIC
	 * PartyIdentification90Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice#AnyBIC
	 * PartyIdentification92Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#PlaceOfClearing
	 * SecuritiesTradeDetails49.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#PlaceOfClearing
	 * TransactionDetails79.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#PlaceOfClearing
	 * TransactionDetails75.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#PlaceOfClearing
	 * TransactionDetails78.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#PlaceOfClearing
	 * SecuritiesTradeDetails51.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#PlaceOfClearing
	 * SecuritiesTradeDetails53.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#PlaceOfClearing
	 * SecuritiesTradeDetails55.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#PlaceOfClearing
	 * SecuritiesTradeDetails56.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#PlaceOfClearing
	 * SecuritiesTradeDetails54.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#PlaceOfClearing
	 * SecuritiesTradeDetails52.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#AnyBIC
	 * PartyIdentification93Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#PlaceOfClearing
	 * SecuritiesTradeDetails50.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification26#AnyBIC
	 * OrganisationIdentification26.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#AnyBIC
	 * PartyIdentification97Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#AnyBIC
	 * PartyIdentification96Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification99Choice#AnyBIC
	 * PartyIdentification99Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#AnyBIC
	 * PartyIdentification100Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#AnyBIC
	 * PartyIdentification104Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification111Choice#AnyBIC
	 * PartyIdentification111Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification103Choice#AnyBIC
	 * PartyIdentification103Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#PlaceOfClearing
	 * SecuritiesTradeDetails59.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#PlaceOfClearing
	 * SecuritiesTradeDetails58.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#PlaceOfClearing
	 * SecuritiesTradeDetails61.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#PlaceOfClearing
	 * SecuritiesTradeDetails63.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#PlaceOfClearing
	 * SecuritiesTradeDetails62.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#PlaceOfClearing
	 * TransactionDetails87.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#PlaceOfClearing
	 * SecuritiesTradeDetails60.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#PlaceOfClearing
	 * TransactionDetails91.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#PlaceOfClearing
	 * TransactionDetails90.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#PlaceOfClearing
	 * SecuritiesTradeDetails65.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#PlaceOfClearing
	 * SecuritiesTradeDetails66.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice#AnyBIC
	 * PartyIdentification115Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification114Choice#AnyBIC
	 * PartyIdentification114Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification95Choice#AnyBIC
	 * PartyIdentification95Choice.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#PlaceOfClearing
	 * SecuritiesTradeDetails67.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#PlaceOfClearing
	 * SecuritiesTradeDetails68.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#PlaceOfClearing
	 * TransactionDetails97.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#PlaceOfClearing
	 * TransactionDetails96.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#PlaceOfClearing
	 * TransactionDetails95.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#PlaceOfClearing
	 * SecuritiesTradeDetails69.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#PlaceOfClearing
	 * SecuritiesTradeDetails70.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#PlaceOfClearing
	 * TransactionDetails100.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#PlaceOfClearing
	 * TransactionDetails99.PlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#PlaceOfClearing
	 * TransactionDetails98.PlaceOfClearing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AnyBIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification1Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification2Choice.BICOrBEI,
					com.tools20022.repository.choice.PartyIdentification4Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification5Choice.BICOrBEI, com.tools20022.repository.msg.OrganisationIdentification4.BICOrBEI,
					com.tools20022.repository.msg.OrganisationIdentification8.AnyBIC, com.tools20022.repository.msg.AccountCashEntrySearch2.AccountOwner, com.tools20022.repository.msg.AccountCashEntrySearch2.AccountServicer,
					com.tools20022.repository.msg.CashAccountDetails1.AccountOwner, com.tools20022.repository.choice.PartyIdentification13Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification36Choice.AnyBIC,
					com.tools20022.repository.msg.OrganisationIdentification7.AnyBIC, com.tools20022.repository.choice.PartyIdentification51Choice.AnyBIC, com.tools20022.repository.msg.OrganisationIdentification9.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification12Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification10Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification14Choice.BICOrBEI,
					com.tools20022.repository.choice.PartyIdentification44Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification45Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification37Choice.AnyBIC,
					com.tools20022.repository.msg.SecuritiesTradeDetails25.PlaceOfClearing, com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1.Identification,
					com.tools20022.repository.choice.PartyIdentification43Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails26.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification58Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification62Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification60Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification65Choice.AnyBIC,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails28.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification18Choice.BICOrBEI,
					com.tools20022.repository.choice.PartyIdentification16Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification46Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification56Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification48Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification52Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification41Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification50Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification17Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification39Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification40Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification53Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification54Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification47Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification57Choice.AnyBIC, com.tools20022.repository.msg.PartyIdentification3.BICOrBEI,
					com.tools20022.repository.choice.PartyIdentification49Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification59Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails6.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails13.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails3.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails11.PlaceOfClearing,
					com.tools20022.repository.choice.PartyIdentification64Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails2.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails16.PlaceOfClearing,
					com.tools20022.repository.choice.PartyIdentification63Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails1.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails15.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails5.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification15Choice.BICOrBEI, com.tools20022.repository.msg.TransactionDetails9.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails22.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails23.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails36.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails47.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails53.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails58.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails7.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails16.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails26.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails27.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails39.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails50.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails56.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails59.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails6.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails18.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails24.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails34.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails37.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails48.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails57.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails60.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification70Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification23Choice.BICOrBEI,
					com.tools20022.repository.msg.PartyIdentification23.BICOrBEI, com.tools20022.repository.msg.Case.Creator, com.tools20022.repository.choice.PartyIdentification7Choice.BICOrBEI,
					com.tools20022.repository.msg.PartyIdentification22.BICOrBEI, com.tools20022.repository.choice.PartyIdentification8Choice.BICOrBEI, com.tools20022.repository.msg.PartyIdentification44.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification19Choice.AnyBIC, com.tools20022.repository.msg.PartyIdentification59.AnyBIC, com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice.Party,
					com.tools20022.repository.choice.PartyIdentification9Choice.BICOrBEI, com.tools20022.repository.msg.CashAccount17.CorrespondentBankIdentification,
					com.tools20022.repository.choice.OffMarket1Choice.SystematicInternaliser, com.tools20022.repository.choice.PartyIdentification24Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification11Choice.BICOrBEI,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails18.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails4.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification33Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails9.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails21.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails10.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails22.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails29.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification66Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification67Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification26Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification72Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification71Choice.AnyBIC, com.tools20022.repository.msg.TransactionDetails51.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails61.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails62.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails63.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails31.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails33.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails35.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails38.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails37.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails36.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails34.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails32.PlaceOfClearing, com.tools20022.repository.msg.PartyIdentification62.BICFI, com.tools20022.repository.msg.PartyIdentification64.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification75Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails44.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails39.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails41.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails40.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails66.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails42.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails67.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails68.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails46.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails47.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails70.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails69.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification83Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification89Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification87Choice.AnyBIC, com.tools20022.repository.msg.TransactionDetails71.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails72.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification90Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification92Choice.AnyBIC,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails79.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails75.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails78.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails51.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails53.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails55.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails56.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails54.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification93Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails50.PlaceOfClearing,
					com.tools20022.repository.msg.OrganisationIdentification26.AnyBIC, com.tools20022.repository.choice.PartyIdentification97Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification96Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification99Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification100Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification104Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification111Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification103Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails59.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails58.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails61.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails63.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails87.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails60.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails91.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails90.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails65.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails66.PlaceOfClearing, com.tools20022.repository.choice.PartyIdentification115Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification114Choice.AnyBIC,
					com.tools20022.repository.choice.PartyIdentification95Choice.AnyBIC, com.tools20022.repository.msg.SecuritiesTradeDetails67.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails68.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails97.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails96.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails95.PlaceOfClearing,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.PlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails70.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails100.PlaceOfClearing,
					com.tools20022.repository.msg.TransactionDetails99.PlaceOfClearing, com.tools20022.repository.msg.TransactionDetails98.PlaceOfClearing);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	/**
	 * Name by which an organisation is known and which is usually used to
	 * identify that organisation. It is derived from the association between
	 * PartyIdentificationInformation and PartyName.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#Organisation
	 * OrganisationName.Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation2#Name
	 * Organisation2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation4#Name
	 * Organisation4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation3#Name
	 * Organisation3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#Name
	 * Organisation21.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrganisationName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation2.Name, com.tools20022.repository.msg.Organisation4.Name, com.tools20022.repository.msg.Organisation3.Name,
					com.tools20022.repository.msg.Organisation21.Name);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationName";
			definition = "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationName.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Organisation which is identified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
	 * Organisation.OrganisationIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which is identified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Organisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation which is identified";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned
	 * by the system or system administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#OrganisationIdentification
	 * CashClearingSystemMember.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification3Choice.
	 * ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentificationChoice#ClearingSystemMemberIdentification
	 * MemberIdentificationChoice.ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#ClearingSystemMemberIdentification
	 * MemberIdentification2Choice.ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification8.ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification3.ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification5Choice.
	 * ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification7.ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#ClearingSystemIdentification
	 * PartyIdentification59.ClearingSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification1.ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification6.ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification9.ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification7Choice.
	 * ClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#ClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification8Choice.
	 * ClearingSystemMemberIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice.ClearingSystemMemberIdentification,
					com.tools20022.repository.choice.MemberIdentificationChoice.ClearingSystemMemberIdentification, com.tools20022.repository.choice.MemberIdentification2Choice.ClearingSystemMemberIdentification,
					com.tools20022.repository.msg.FinancialInstitutionIdentification8.ClearingSystemMemberIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification3.ClearingSystemMemberIdentification,
					com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice.ClearingSystemMemberIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification7.ClearingSystemMemberIdentification,
					com.tools20022.repository.msg.PartyIdentification59.ClearingSystemIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification1.ClearingSystemMemberIdentification,
					com.tools20022.repository.msg.FinancialInstitutionIdentification6.ClearingSystemMemberIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification9.ClearingSystemMemberIdentification,
					com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.ClearingSystemMemberIdentification,
					com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice.ClearingSystemMemberIdentification);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			minOccurs = 0;
			type_lazy = () -> CashClearingSystemMember.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.OrganisationIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Code allocated to a non-financial institution by the ISO 9362
	 * Registration Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICNonFIIdentifier
	 * BICNonFIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#IBEI
	 * OrganisationIdentification2.IBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#BEI
	 * OrganisationIdentification2.BEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#IssuerIdentification
	 * FinancialInstrumentStipulations.IssuerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#IssuerIdentification
	 * FinancialInstrumentStipulations2.IssuerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#BEI
	 * NonFinancialInstitutionIdentification1.BEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification25#BEI
	 * PartyIdentification25.BEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification9#BEI
	 * PartyIdentification9.BEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification5#BEI
	 * PartyIdentification5.BEI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICNonFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BICNonFI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationIdentification2.IBEI, com.tools20022.repository.msg.OrganisationIdentification2.BEI,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.IssuerIdentification, com.tools20022.repository.msg.FinancialInstrumentStipulations2.IssuerIdentification,
					com.tools20022.repository.msg.NonFinancialInstitutionIdentification1.BEI, com.tools20022.repository.msg.PartyIdentification25.BEI, com.tools20022.repository.msg.PartyIdentification9.BEI,
					com.tools20022.repository.msg.PartyIdentification5.BEI);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BICNonFI";
			definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}
	};
	/**
	 * Global Location Number. A non-significant reference number used to
	 * identify legal entities, functional entities, or physical entities
	 * according to the European Association for Numbering (EAN) numbering
	 * scheme rules. The number is used to retrieve detailed information that is
	 * linked to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EANGLNIdentifier
	 * EANGLNIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#EANGLN
	 * OrganisationIdentification2.EANGLN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#EANGLN
	 * NonFinancialInstitutionIdentification1.EANGLN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EANGLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EANGLN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationIdentification2.EANGLN, com.tools20022.repository.msg.NonFinancialInstitutionIdentification1.EANGLN);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EANGLN";
			definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EANGLNIdentifier.mmObject();
		}
	};
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS)
	 * Universal Identification (UID). Identifies entities that own accounts at
	 * CHIPS participating financial institutions, through which CHIPS payments
	 * are effected. The CHIPS UID is assigned by the New York Clearing House.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSUniversalIdentifier
	 * CHIPSUniversalIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#CHIPSUniversalIdentification
	 * OrganisationIdentification2.CHIPSUniversalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#CHIPSUniversalIdentification
	 * NonFinancialInstitutionIdentification1.CHIPSUniversalIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CHIPSUniversalIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationIdentification2.CHIPSUniversalIdentification, com.tools20022.repository.msg.NonFinancialInstitutionIdentification1.CHIPSUniversalIdentification);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentifier";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.CHIPSUniversalIdentifier.mmObject();
		}
	};
	/**
	 * Data Universal Numbering System. A unique identification number provided
	 * by Dun &amp; Bradstreet to identify an organization.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DunsIdentifier
	 * DunsIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#DUNS
	 * OrganisationIdentification2.DUNS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#DUNS
	 * NonFinancialInstitutionIdentification1.DUNS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data Universal Numbering System. A unique identification number provided by Dun &amp; Bradstreet to identify an organization."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DUNS = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationIdentification2.DUNS, com.tools20022.repository.msg.NonFinancialInstitutionIdentification1.DUNS);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DUNS";
			definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DunsIdentifier.mmObject();
		}
	};
	/**
	 * Unique and unambiguous assignment made by a specific bank to identify a
	 * relationship as defined between the bank and its client.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#BankPartyIdentification
	 * OrganisationIdentification2.BankPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#BankPartyIdentification
	 * NonFinancialInstitutionIdentification1.BankPartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BankPartyIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationIdentification2.BankPartyIdentification, com.tools20022.repository.msg.NonFinancialInstitutionIdentification1.BankPartyIdentification);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankPartyIdentification";
			definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Market Identifier Code. Identification of a financial market, as
	 * stipulated in the norm ISO 10383
	 * "Codes for exchanges and market identifications".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification1Choice#MarketIdentifierCode
	 * MarketIdentification1Choice.MarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice#MarketIdentifierCode
	 * MarketIdentification3Choice.MarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice#Description
	 * MarketIdentification3Choice.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification2Choice#MarketIdentifierCode
	 * MarketIdentification2Choice.MarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification4Choice#MarketIdentifierCode
	 * MarketIdentification4Choice.MarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification4Choice#Description
	 * MarketIdentification4Choice.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice#LocalMarketPlace
	 * PriceSourceFormatChoice.LocalMarketPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#MIC
	 * PartyIdentification6Choice.MIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification1#Identification
	 * MarketIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#PlaceOfIssueIdentification
	 * FinancialInstrumentAttributes1.PlaceOfIssueIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification77#Identification
	 * MarketIdentification77.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice#Exchange
	 * PlaceOfTradeIdentification1Choice.Exchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson#PlaceOfListing
	 * MeetingContactPerson.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#PlaceOfListing
	 * MeetingContactPerson1.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice#MarketIdentification
	 * PlaceOfTradeIdentification2Choice.MarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#PlaceOfListing
	 * SecurityInstrumentDescription1.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice#MIC
	 * PartyIdentification24Choice.MIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification11Choice#CentralCounterparty
	 * PartyIdentification11Choice.CentralCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#PlaceOfListing
	 * SecurityInstrumentDescription2.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice#Exchange
	 * PlaceOfTradeIdentification3Choice.Exchange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssuePlace
	 * Issuance1.IssuePlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#MarketIdentification
	 * TradingParameters1.MarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#PlaceOfListing
	 * MeetingContactPerson2.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#MarketIdentificationCode
	 * TradingVenueIdentification1Choice.MarketIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#Identification
	 * TradingVenueAttributes1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#MIC
	 * PersonOrOrganisation1Choice.MIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#PlaceOfListing
	 * Organisation30.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#PlaceOfListing
	 * Organisation29.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketDetail2#Identification
	 * MarketDetail2.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarketIdentification1Choice.MarketIdentifierCode, com.tools20022.repository.choice.MarketIdentification3Choice.MarketIdentifierCode,
					com.tools20022.repository.choice.MarketIdentification3Choice.Description, com.tools20022.repository.choice.MarketIdentification2Choice.MarketIdentifierCode,
					com.tools20022.repository.choice.MarketIdentification4Choice.MarketIdentifierCode, com.tools20022.repository.choice.MarketIdentification4Choice.Description,
					com.tools20022.repository.choice.PriceSourceFormatChoice.LocalMarketPlace, com.tools20022.repository.msg.PartyIdentification6Choice.MIC, com.tools20022.repository.msg.MarketIdentification1.Identification,
					com.tools20022.repository.msg.FinancialInstrumentAttributes1.PlaceOfIssueIdentification, com.tools20022.repository.msg.MarketIdentification77.Identification,
					com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice.Exchange, com.tools20022.repository.msg.MeetingContactPerson.PlaceOfListing, com.tools20022.repository.msg.MeetingContactPerson1.PlaceOfListing,
					com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice.MarketIdentification, com.tools20022.repository.msg.SecurityInstrumentDescription1.PlaceOfListing,
					com.tools20022.repository.choice.PartyIdentification24Choice.MIC, com.tools20022.repository.choice.PartyIdentification11Choice.CentralCounterparty,
					com.tools20022.repository.msg.SecurityInstrumentDescription2.PlaceOfListing, com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice.Exchange, com.tools20022.repository.msg.Issuance1.IssuePlace,
					com.tools20022.repository.msg.TradingParameters1.MarketIdentification, com.tools20022.repository.msg.MeetingContactPerson2.PlaceOfListing,
					com.tools20022.repository.choice.TradingVenueIdentification1Choice.MarketIdentificationCode, com.tools20022.repository.msg.TradingVenueAttributes1.Identification,
					com.tools20022.repository.choice.PersonOrOrganisation1Choice.MIC, com.tools20022.repository.msg.Organisation30.PlaceOfListing, com.tools20022.repository.msg.Organisation29.PlaceOfListing,
					com.tools20022.repository.msg.MarketDetail2.Identification);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MIC";
			definition = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrganisationIdentification";
				definition = "Unique and unambiguous way to identify an organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.OrganisationIdentification, com.tools20022.repository.entity.OrganisationName.Organisation,
						com.tools20022.repository.entity.CashClearingSystemMember.OrganisationIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice.NameAndAddress, com.tools20022.repository.msg.FinancialInstitutionIdentification8.Other,
						com.tools20022.repository.choice.Party2Choice.OrganisationIdentification, com.tools20022.repository.choice.Party6Choice.OrganisationIdentification,
						com.tools20022.repository.choice.Party11Choice.OrganisationIdentification, com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice.NameAndAddress,
						com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice.CombinedIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification7.Other,
						com.tools20022.repository.choice.Party8Choice.OrganisationIdentification, com.tools20022.repository.msg.ProprietaryAgent1.Agent, com.tools20022.repository.msg.ProprietaryAgent2.Agent,
						com.tools20022.repository.msg.ProprietaryAgent3.Agent, com.tools20022.repository.msg.Charges2.Agent, com.tools20022.repository.choice.Party10Choice.OrganisationIdentification,
						com.tools20022.repository.choice.Party9Choice.OrganisationIdentification, com.tools20022.repository.choice.Party9Choice.FinancialInstitutionIdentification,
						com.tools20022.repository.msg.PartyIdentification59.LegalEntityIdentifier, com.tools20022.repository.choice.PartyIdentification73Choice.AnyBIC,
						com.tools20022.repository.msg.PartyIdentification60.LegalEntityIdentifier, com.tools20022.repository.choice.Party1Choice.OrganisationIdentification,
						com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice.NameAndAddress, com.tools20022.repository.msg.FinancialInstitutionIdentification9.Other,
						com.tools20022.repository.choice.Party13Choice.OrganisationIdentification, com.tools20022.repository.choice.Party13Choice.FinancialInstitutionIdentification,
						com.tools20022.repository.msg.CashAccountCharacteristics1.AccountServicer, com.tools20022.repository.choice.PartyOrganisation1Choice.OrganisationIdentification,
						com.tools20022.repository.choice.Party5Choice.OrganisationIdentification, com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice.NameAndAddress,
						com.tools20022.repository.choice.TradingVenueIdentification1Choice.Other, com.tools20022.repository.msg.CashAccountCharacteristics2.AccountServicer,
						com.tools20022.repository.choice.Party29Choice.OrganisationIdentification, com.tools20022.repository.choice.Party29Choice.FinancialInstitutionIdentification,
						com.tools20022.repository.msg.Party1.OrganisationIdentification, com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.NameAndAddress,
						com.tools20022.repository.msg.FinancialInstitutionIdentification10.Party, com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice.NameAndAddress);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.BICFI, com.tools20022.repository.entity.OrganisationIdentification.AnyBIC,
						com.tools20022.repository.entity.OrganisationIdentification.OrganisationName, com.tools20022.repository.entity.OrganisationIdentification.Organisation,
						com.tools20022.repository.entity.OrganisationIdentification.ClearingSystemMemberIdentificationType, com.tools20022.repository.entity.OrganisationIdentification.BICNonFI,
						com.tools20022.repository.entity.OrganisationIdentification.EANGLN, com.tools20022.repository.entity.OrganisationIdentification.CHIPSUniversalIdentifier,
						com.tools20022.repository.entity.OrganisationIdentification.DUNS, com.tools20022.repository.entity.OrganisationIdentification.BankPartyIdentification, com.tools20022.repository.entity.OrganisationIdentification.MIC);
				derivationComponent_lazy = () -> Arrays.asList(BranchData.mmObject(), FinancialInstitutionIdentification3Choice.mmObject(), GenericFinancialIdentification1.mmObject(), FinancialInstitutionIdentification8.mmObject(),
						BranchData2.mmObject(), OrganisationIdentification2.mmObject(), OrganisationIdentificationSchemeName1Choice.mmObject(), GenericOrganisationIdentification1.mmObject(), OrganisationIdentification4.mmObject(),
						OrganisationIdentification8.mmObject(), FinancialInstitutionIdentification3.mmObject(), FinancialInstitutionIdentification5Choice.mmObject(), FinancialInstitutionIdentification7.mmObject(),
						OrganisationIdentification7.mmObject(), OrganisationIdentificationSchemeName2Choice.mmObject(), GenericOrganisationIdentification2.mmObject(), OrganisationIdentification9.mmObject(),
						BICOrCountryCodeChoice.mmObject(), OrganisationIdentification6.mmObject(), ProprietaryAgent1.mmObject(), ProprietaryAgent2.mmObject(), ProprietaryAgent3.mmObject(), FinancialInstitutionIdentification1.mmObject(),
						OrganisationIdentification5.mmObject(), FinancialInstitutionIdentification6.mmObject(), FinancialInstitutionIdentification4Choice.mmObject(), FinancialInstitutionIdentification9.mmObject(),
						OrganisationIdentification3.mmObject(), FinancialInstitutionIdentification4.mmObject(), FinancialInstitutionIdentification5.mmObject(), FinancialInstitutionIdentification6Choice.mmObject(),
						OrganisationIdentificationSD1.mmObject(), FinancialInstitutionIdentification13.mmObject(), TradingVenueIdentification1Choice.mmObject(), SecuritiesTransactionTransmission2.mmObject(), Party1.mmObject(),
						OrganisationIdentification26.mmObject(), FinancialInstitutionIdentification7Choice.mmObject(), TradingVenueIdentification2.mmObject(), TaxOrganisationIdentification1.mmObject(),
						FinancialInstitutionIdentification10.mmObject(), FinancialInstitutionIdentification8Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}