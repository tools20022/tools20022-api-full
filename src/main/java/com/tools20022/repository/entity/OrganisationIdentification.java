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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
 * Organisation.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmOrganisation
 * OrganisationName.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmOrganisationIdentification
 * CashClearingSystemMember.mmOrganisationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice#mmNameAndAddress
 * FinancialInstitutionIdentification3Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmOther
 * FinancialInstitutionIdentification8.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party2Choice#mmOrganisationIdentification
 * Party2Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party6Choice#mmOrganisationIdentification
 * Party6Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party11Choice#mmOrganisationIdentification
 * Party11Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#mmNameAndAddress
 * FinancialInstitutionIdentification5Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#mmCombinedIdentification
 * FinancialInstitutionIdentification5Choice.mmCombinedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#mmOther
 * FinancialInstitutionIdentification7.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party8Choice#mmOrganisationIdentification
 * Party8Choice.mmOrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent1#mmAgent
 * ProprietaryAgent1.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent2#mmAgent
 * ProprietaryAgent2.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent3#mmAgent
 * ProprietaryAgent3.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges2#mmAgent
 * Charges2.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party10Choice#mmOrganisationIdentification
 * Party10Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party9Choice#mmOrganisationIdentification
 * Party9Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party9Choice#mmFinancialInstitutionIdentification
 * Party9Choice.mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmLegalEntityIdentifier
 * PartyIdentification59.mmLegalEntityIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice#mmAnyBIC
 * PartyIdentification73Choice.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification60#mmLegalEntityIdentifier
 * PartyIdentification60.mmLegalEntityIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party1Choice#mmOrganisationIdentification
 * Party1Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice#mmNameAndAddress
 * FinancialInstitutionIdentification4Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#mmOther
 * FinancialInstitutionIdentification9.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party13Choice#mmOrganisationIdentification
 * Party13Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party13Choice#mmFinancialInstitutionIdentification
 * Party13Choice.mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmAccountServicer
 * CashAccountCharacteristics1.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyOrganisation1Choice#mmOrganisationIdentification
 * PartyOrganisation1Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party5Choice#mmOrganisationIdentification
 * Party5Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice#mmNameAndAddress
 * FinancialInstitutionIdentification6Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#mmOther
 * TradingVenueIdentification1Choice.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountServicer
 * CashAccountCharacteristics2.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party29Choice#mmOrganisationIdentification
 * Party29Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party29Choice#mmFinancialInstitutionIdentification
 * Party29Choice.mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Party1#mmOrganisationIdentification
 * Party1.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmNameAndAddress
 * FinancialInstitutionIdentification7Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10#mmParty
 * FinancialInstitutionIdentification10.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmNameAndAddress
 * FinancialInstitutionIdentification8Choice.mmNameAndAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
 * OrganisationIdentification.mmBICFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
 * OrganisationIdentification.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisationName
 * OrganisationIdentification.mmOrganisationName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
 * OrganisationIdentification.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICNonFI
 * OrganisationIdentification.mmBICNonFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmEANGLN
 * OrganisationIdentification.mmEANGLN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmCHIPSUniversalIdentifier
 * OrganisationIdentification.mmCHIPSUniversalIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmDUNS
 * OrganisationIdentification.mmDUNS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBankPartyIdentification
 * OrganisationIdentification.mmBankPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
 * OrganisationIdentification.mmMIC}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected BICFIIdentifier bICFI;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails1#mmIdentification
	 * ContactDetails1.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount15#mmServicer
	 * CashAccount15.mmServicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount14#mmServicer
	 * CashAccount14.mmServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmIdentification
	 * OrderDeskContactDetails.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount21#mmServicer
	 * CashAccount21.mmServicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount22#mmServicer
	 * CashAccount22.mmServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice#mmBIC
	 * FinancialInstitutionIdentification3Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentificationChoice#mmBIC
	 * MemberIdentificationChoice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#mmBICFI
	 * MemberIdentification2Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInstructingAgentIdentification
	 * PaymentInstructionReference1Details.mmInstructingAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInstructedAgentIdentification
	 * PaymentInstructionReference1Details.mmInstructedAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmInstructingAgentIdentification
	 * PaymentInstructionReference2Details.mmInstructingAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmInstructedAgentIdentification
	 * PaymentInstructionReference2Details.mmInstructedAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInstructingAgentIdentification
	 * PaymentInstructionReferenceDetails3.mmInstructingAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInstructedAgentIdentification
	 * PaymentInstructionReferenceDetails3.mmInstructedAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmInstructingAgentIdentification
	 * PaymentInstructionReferenceDetails4.mmInstructingAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmInstructedAgentIdentification
	 * PaymentInstructionReferenceDetails4.mmInstructedAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmBICFI
	 * FinancialInstitutionIdentification8.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#mmAccountOwner
	 * LimitIdentificationDetails1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2#mmAccountOwner
	 * LimitIdentificationDetails2.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmBIC
	 * OrganisationIdentification2.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmAccountOwner
	 * LimitSearchCriteria1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#mmAccountOwner
	 * LimitSearchCriteria2.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmAccountOwner
	 * LimitSearchCriteria3.mmAccountOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BICIdentification1#mmBIC
	 * BICIdentification1.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification1#mmAccountOwner
	 * StandingOrderIdentification1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmAccountServicer
	 * CashAccountDetails1.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmAccountServicer
	 * CashAccountDetails3.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#mmBIC
	 * FinancialInstitutionIdentification3.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#mmBIC
	 * FinancialInstitutionIdentification5Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#mmBIC
	 * FinancialInstitutionIdentification7.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification3Choice#mmBIC
	 * PartyIdentification3Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification30Choice#mmBIC
	 * PartyIdentification30Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification38Choice#mmBICFI
	 * PartyIdentification38Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification61Choice#mmBICFI
	 * PartyIdentification61Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification31Choice#mmBIC
	 * PartyIdentification31Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification42Choice#mmBICFI
	 * PartyIdentification42Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification55Choice#mmBICFI
	 * PartyIdentification55Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#mmBIC
	 * PartyIdentification32Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice#mmBIC
	 * PartyIdentification35Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#mmBIC
	 * PartyIdentification6Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BICOrCountryCodeChoice#mmBIC
	 * BICOrCountryCodeChoice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification54#mmBIC
	 * PartyIdentification54.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification68Choice#mmBIC
	 * PartyIdentification68Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6#mmBIC
	 * OrganisationIdentification6.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#mmBIC
	 * FinancialInstitutionIdentification1.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#mmBIC
	 * FinancialInstitutionIdentification6.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice#mmBIC
	 * FinancialInstitutionIdentification4Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission2#mmSubmitter
	 * RequiredSubmission2.mmSubmitter}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#mmBuyerSideSubmittingBank
	 * Baseline3.mmBuyerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#mmSellerSideSubmittingBank
	 * Baseline3.mmSellerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#mmBIC
	 * ContactIdentification3.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification29Choice#mmBIC
	 * PartyIdentification29Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice#mmBIC
	 * PartyIdentification34Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#mmBICFI
	 * FinancialInstitutionIdentification9.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification3#mmBIC
	 * OrganisationIdentification3.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification4#mmBIC
	 * FinancialInstitutionIdentification4.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice#mmBIC
	 * FinancialInstitutionIdentification6Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3#mmRelatedPartyIdentification
	 * SystemPartyIdentification3.mmRelatedPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3#mmResponsiblePartyIdentification
	 * SystemPartyIdentification3.mmResponsiblePartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5#mmResponsiblePartyIdentification
	 * SystemPartyIdentification5.mmResponsiblePartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TechnicalIdentification1Choice#mmBICFI
	 * TechnicalIdentification1Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification1#mmIdentification
	 * SystemPartyIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CSDOrNCB1Choice#mmCSDIdentification
	 * CSDOrNCB1Choice.mmCSDIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CSDOrNCB1Choice#mmNCBIdentification
	 * CSDOrNCB1Choice.mmNCBIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification2#mmIdentification
	 * SystemPartyIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification4#mmIdentification
	 * SystemPartyIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification4#mmResponsiblePartyIdentification
	 * SystemPartyIdentification4.mmResponsiblePartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification4#mmAccountOwner
	 * LimitIdentification4.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmBilledCustomerIdentification
	 * ServiceCategoryTotals1.mmBilledCustomerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmBilledCustomerIdentification
	 * BillingSearchCriteria1.mmBilledCustomerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmAccountOwner
	 * LimitUtilisationJournalSearchCriteria1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmBuyerSideSubmittingBank
	 * Baseline4.mmBuyerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmSellerSideSubmittingBank
	 * Baseline4.mmSellerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification13#mmBICFI
	 * FinancialInstitutionIdentification13.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#mmBuyerSideSubmittingBank
	 * Baseline5.mmBuyerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#mmSellerSideSubmittingBank
	 * Baseline5.mmSellerSideSubmittingBank}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification88Choice#mmBICFI
	 * PartyIdentification88Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#mmBICFI
	 * PartyIdentification94Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmBICFI
	 * FinancialInstitutionIdentification7Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice#mmAnyBIC
	 * PartyIdentification102Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#mmBIC
	 * PartyIdentification101Choice.mmBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification113Choice#mmBICFI
	 * PartyIdentification113Choice.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmBICFI
	 * FinancialInstitutionIdentification8Choice.mmBICFI}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBICFI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContactDetails1.mmIdentification, CashAccount15.mmServicer, CashAccount14.mmServicer, OrderDeskContactDetails.mmIdentification, CashAccount21.mmServicer, CashAccount22.mmServicer,
					FinancialInstitutionIdentification3Choice.mmBIC, MemberIdentificationChoice.mmBIC, MemberIdentification2Choice.mmBICFI, PaymentInstructionReference1Details.mmInstructingAgentIdentification,
					PaymentInstructionReference1Details.mmInstructedAgentIdentification, PaymentInstructionReference2Details.mmInstructingAgentIdentification, PaymentInstructionReference2Details.mmInstructedAgentIdentification,
					PaymentInstructionReferenceDetails3.mmInstructingAgentIdentification, PaymentInstructionReferenceDetails3.mmInstructedAgentIdentification, PaymentInstructionReferenceDetails4.mmInstructingAgentIdentification,
					PaymentInstructionReferenceDetails4.mmInstructedAgentIdentification, FinancialInstitutionIdentification8.mmBICFI, LimitIdentificationDetails1.mmAccountOwner, LimitIdentificationDetails2.mmAccountOwner,
					OrganisationIdentification2.mmBIC, LimitSearchCriteria1.mmAccountOwner, LimitSearchCriteria2.mmAccountOwner, LimitSearchCriteria3.mmAccountOwner, BICIdentification1.mmBIC, StandingOrderIdentification1.mmAccountOwner,
					CashAccountDetails1.mmAccountServicer, CashAccountDetails3.mmAccountServicer, FinancialInstitutionIdentification3.mmBIC, FinancialInstitutionIdentification5Choice.mmBIC, FinancialInstitutionIdentification7.mmBIC,
					PartyIdentification3Choice.mmBIC, PartyIdentification30Choice.mmBIC, PartyIdentification38Choice.mmBICFI, PartyIdentification61Choice.mmBICFI, PartyIdentification31Choice.mmBIC, PartyIdentification42Choice.mmBICFI,
					PartyIdentification55Choice.mmBICFI, PartyIdentification32Choice.mmBIC, PartyIdentification35Choice.mmBIC, PartyIdentification6Choice.mmBIC, BICOrCountryCodeChoice.mmBIC, PartyIdentification54.mmBIC,
					PartyIdentification68Choice.mmBIC, OrganisationIdentification6.mmBIC, FinancialInstitutionIdentification1.mmBIC, FinancialInstitutionIdentification6.mmBIC, FinancialInstitutionIdentification4Choice.mmBIC,
					RequiredSubmission2.mmSubmitter, Baseline3.mmBuyerSideSubmittingBank, Baseline3.mmSellerSideSubmittingBank, ContactIdentification3.mmBIC, PartyIdentification29Choice.mmBIC, PartyIdentification34Choice.mmBIC,
					FinancialInstitutionIdentification9.mmBICFI, OrganisationIdentification3.mmBIC, FinancialInstitutionIdentification4.mmBIC, FinancialInstitutionIdentification6Choice.mmBIC,
					SystemPartyIdentification3.mmRelatedPartyIdentification, SystemPartyIdentification3.mmResponsiblePartyIdentification, SystemPartyIdentification5.mmResponsiblePartyIdentification, TechnicalIdentification1Choice.mmBICFI,
					SystemPartyIdentification1.mmIdentification, CSDOrNCB1Choice.mmCSDIdentification, CSDOrNCB1Choice.mmNCBIdentification, SystemPartyIdentification2.mmIdentification, SystemPartyIdentification4.mmIdentification,
					SystemPartyIdentification4.mmResponsiblePartyIdentification, LimitIdentification4.mmAccountOwner, ServiceCategoryTotals1.mmBilledCustomerIdentification, BillingSearchCriteria1.mmBilledCustomerIdentification,
					LimitUtilisationJournalSearchCriteria1.mmAccountOwner, Baseline4.mmBuyerSideSubmittingBank, Baseline4.mmSellerSideSubmittingBank, FinancialInstitutionIdentification13.mmBICFI, Baseline5.mmBuyerSideSubmittingBank,
					Baseline5.mmSellerSideSubmittingBank, PartyIdentification88Choice.mmBICFI, PartyIdentification94Choice.mmBICFI, FinancialInstitutionIdentification7Choice.mmBICFI, PartyIdentification102Choice.mmAnyBIC,
					PartyIdentification101Choice.mmBIC, PartyIdentification113Choice.mmBICFI, FinancialInstitutionIdentification8Choice.mmBICFI);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	protected AnyBICIdentifier anyBIC;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#mmBICOrBEI
	 * PartyIdentification1Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#mmBICOrBEI
	 * PartyIdentification2Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification4Choice#mmBICOrBEI
	 * PartyIdentification4Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#mmBICOrBEI
	 * PartyIdentification5Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification4#mmBICOrBEI
	 * OrganisationIdentification4.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#mmAnyBIC
	 * OrganisationIdentification8.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmAccountOwner
	 * AccountCashEntrySearch2.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmAccountServicer
	 * AccountCashEntrySearch2.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmAccountOwner
	 * CashAccountDetails1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice#mmBICOrBEI
	 * PartyIdentification13Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice#mmAnyBIC
	 * PartyIdentification36Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#mmAnyBIC
	 * OrganisationIdentification7.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification51Choice#mmAnyBIC
	 * PartyIdentification51Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification9#mmAnyBIC
	 * OrganisationIdentification9.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification12Choice#mmBICOrBEI
	 * PartyIdentification12Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#mmBICOrBEI
	 * PartyIdentification10Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice#mmBICOrBEI
	 * PartyIdentification14Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification44Choice#mmAnyBIC
	 * PartyIdentification44Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification45Choice#mmAnyBIC
	 * PartyIdentification45Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice#mmAnyBIC
	 * PartyIdentification37Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmPlaceOfClearing
	 * SecuritiesTradeDetails25.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1#mmIdentification
	 * SafekeepingPlaceTypeAndAnyBICIdentifier1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice#mmAnyBIC
	 * PartyIdentification43Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmPlaceOfClearing
	 * SecuritiesTradeDetails26.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification58Choice#mmAnyBIC
	 * PartyIdentification58Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification62Choice#mmAnyBIC
	 * PartyIdentification62Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice#mmAnyBIC
	 * PartyIdentification60Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification65Choice#mmAnyBIC
	 * PartyIdentification65Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmPlaceOfClearing
	 * SecuritiesTradeDetails27.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmPlaceOfClearing
	 * SecuritiesTradeDetails28.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification18Choice#mmBICOrBEI
	 * PartyIdentification18Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification16Choice#mmBICOrBEI
	 * PartyIdentification16Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#mmAnyBIC
	 * PartyIdentification46Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification56Choice#mmAnyBIC
	 * PartyIdentification56Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification48Choice#mmAnyBIC
	 * PartyIdentification48Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification52Choice#mmAnyBIC
	 * PartyIdentification52Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification41Choice#mmAnyBIC
	 * PartyIdentification41Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification50Choice#mmAnyBIC
	 * PartyIdentification50Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification17Choice#mmBICOrBEI
	 * PartyIdentification17Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification39Choice#mmAnyBIC
	 * PartyIdentification39Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#mmAnyBIC
	 * PartyIdentification40Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification53Choice#mmAnyBIC
	 * PartyIdentification53Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification54Choice#mmAnyBIC
	 * PartyIdentification54Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#mmAnyBIC
	 * PartyIdentification47Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification57Choice#mmAnyBIC
	 * PartyIdentification57Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification3#mmBICOrBEI
	 * PartyIdentification3.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice#mmAnyBIC
	 * PartyIdentification49Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice#mmAnyBIC
	 * PartyIdentification59Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmPlaceOfClearing
	 * SecuritiesTradeDetails6.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmPlaceOfClearing
	 * SecuritiesTradeDetails13.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmPlaceOfClearing
	 * SecuritiesTradeDetails3.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmPlaceOfClearing
	 * SecuritiesTradeDetails11.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification64Choice#mmAnyBIC
	 * PartyIdentification64Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmPlaceOfClearing
	 * SecuritiesTradeDetails2.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmPlaceOfClearing
	 * SecuritiesTradeDetails16.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification63Choice#mmAnyBIC
	 * PartyIdentification63Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmPlaceOfClearing
	 * SecuritiesTradeDetails1.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmPlaceOfClearing
	 * SecuritiesTradeDetails15.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmPlaceOfClearing
	 * TransactionDetails5.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice#mmBICOrBEI
	 * PartyIdentification15Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmPlaceOfClearing
	 * TransactionDetails9.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmPlaceOfClearing
	 * TransactionDetails22.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmPlaceOfClearing
	 * TransactionDetails23.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmPlaceOfClearing
	 * TransactionDetails36.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmPlaceOfClearing
	 * TransactionDetails47.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmPlaceOfClearing
	 * TransactionDetails53.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmPlaceOfClearing
	 * TransactionDetails58.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmPlaceOfClearing
	 * TransactionDetails7.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmPlaceOfClearing
	 * TransactionDetails16.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmPlaceOfClearing
	 * TransactionDetails26.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmPlaceOfClearing
	 * TransactionDetails27.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmPlaceOfClearing
	 * TransactionDetails39.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmPlaceOfClearing
	 * TransactionDetails50.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmPlaceOfClearing
	 * TransactionDetails56.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmPlaceOfClearing
	 * TransactionDetails59.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmPlaceOfClearing
	 * TransactionDetails6.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmPlaceOfClearing
	 * TransactionDetails18.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmPlaceOfClearing
	 * TransactionDetails24.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmPlaceOfClearing
	 * TransactionDetails34.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmPlaceOfClearing
	 * TransactionDetails37.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmPlaceOfClearing
	 * TransactionDetails48.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmPlaceOfClearing
	 * TransactionDetails57.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmPlaceOfClearing
	 * TransactionDetails60.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#mmAnyBIC
	 * PartyIdentification70Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification23Choice#mmBICOrBEI
	 * PartyIdentification23Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification23#mmBICOrBEI
	 * PartyIdentification23.mmBICOrBEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Case#mmCreator
	 * Case.mmCreator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification7Choice#mmBICOrBEI
	 * PartyIdentification7Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification22#mmBICOrBEI
	 * PartyIdentification22.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice#mmBICOrBEI
	 * PartyIdentification8Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification44#mmAnyBIC
	 * PartyIdentification44.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification19Choice#mmAnyBIC
	 * PartyIdentification19Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmAnyBIC
	 * PartyIdentification59.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice#mmParty
	 * PlaceOfTradeIdentification1Choice.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice#mmBICOrBEI
	 * PartyIdentification9Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#mmCorrespondentBankIdentification
	 * CashAccount17.mmCorrespondentBankIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OffMarket1Choice#mmSystematicInternaliser
	 * OffMarket1Choice.mmSystematicInternaliser}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice#mmBICOrBEI
	 * PartyIdentification24Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification11Choice#mmBICOrBEI
	 * PartyIdentification11Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmPlaceOfClearing
	 * SecuritiesTradeDetails8.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmPlaceOfClearing
	 * SecuritiesTradeDetails18.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmPlaceOfClearing
	 * SecuritiesTradeDetails4.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmPlaceOfClearing
	 * SecuritiesTradeDetails17.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#mmAnyBIC
	 * PartyIdentification33Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmPlaceOfClearing
	 * SecuritiesTradeDetails9.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmPlaceOfClearing
	 * SecuritiesTradeDetails21.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmPlaceOfClearing
	 * SecuritiesTradeDetails10.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmPlaceOfClearing
	 * SecuritiesTradeDetails22.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmPlaceOfClearing
	 * SecuritiesTradeDetails23.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmPlaceOfClearing
	 * SecuritiesTradeDetails29.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification66Choice#mmAnyBIC
	 * PartyIdentification66Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice#mmAnyBIC
	 * PartyIdentification67Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification26Choice#mmBICOrBEI
	 * PartyIdentification26Choice.mmBICOrBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice#mmAnyBIC
	 * PartyIdentification72Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmAnyBIC
	 * PartyIdentification71Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmPlaceOfClearing
	 * TransactionDetails51.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmPlaceOfClearing
	 * TransactionDetails61.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmPlaceOfClearing
	 * TransactionDetails62.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmPlaceOfClearing
	 * TransactionDetails63.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmPlaceOfClearing
	 * SecuritiesTradeDetails31.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmPlaceOfClearing
	 * SecuritiesTradeDetails33.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmPlaceOfClearing
	 * SecuritiesTradeDetails35.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmPlaceOfClearing
	 * SecuritiesTradeDetails38.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmPlaceOfClearing
	 * SecuritiesTradeDetails37.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmPlaceOfClearing
	 * SecuritiesTradeDetails36.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmPlaceOfClearing
	 * SecuritiesTradeDetails34.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmPlaceOfClearing
	 * SecuritiesTradeDetails32.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#mmBICFI
	 * PartyIdentification62.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#mmAnyBIC
	 * PartyIdentification64.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification75Choice#mmAnyBIC
	 * PartyIdentification75Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmPlaceOfClearing
	 * SecuritiesTradeDetails44.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmPlaceOfClearing
	 * SecuritiesTradeDetails39.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmPlaceOfClearing
	 * SecuritiesTradeDetails43.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmPlaceOfClearing
	 * SecuritiesTradeDetails41.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmPlaceOfClearing
	 * SecuritiesTradeDetails40.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmPlaceOfClearing
	 * TransactionDetails66.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmPlaceOfClearing
	 * SecuritiesTradeDetails42.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmPlaceOfClearing
	 * TransactionDetails67.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmPlaceOfClearing
	 * TransactionDetails68.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmPlaceOfClearing
	 * SecuritiesTradeDetails46.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmPlaceOfClearing
	 * SecuritiesTradeDetails47.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmPlaceOfClearing
	 * TransactionDetails70.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmPlaceOfClearing
	 * TransactionDetails69.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#mmAnyBIC
	 * PartyIdentification83Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification89Choice#mmAnyBIC
	 * PartyIdentification89Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification87Choice#mmAnyBIC
	 * PartyIdentification87Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmPlaceOfClearing
	 * TransactionDetails71.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmPlaceOfClearing
	 * TransactionDetails72.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmAnyBIC
	 * PartyIdentification90Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice#mmAnyBIC
	 * PartyIdentification92Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmPlaceOfClearing
	 * SecuritiesTradeDetails49.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmPlaceOfClearing
	 * TransactionDetails79.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmPlaceOfClearing
	 * TransactionDetails75.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPlaceOfClearing
	 * TransactionDetails78.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmPlaceOfClearing
	 * SecuritiesTradeDetails51.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmPlaceOfClearing
	 * SecuritiesTradeDetails53.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmPlaceOfClearing
	 * SecuritiesTradeDetails55.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmPlaceOfClearing
	 * SecuritiesTradeDetails56.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmPlaceOfClearing
	 * SecuritiesTradeDetails54.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmPlaceOfClearing
	 * SecuritiesTradeDetails52.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#mmAnyBIC
	 * PartyIdentification93Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmPlaceOfClearing
	 * SecuritiesTradeDetails50.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification26#mmAnyBIC
	 * OrganisationIdentification26.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#mmAnyBIC
	 * PartyIdentification97Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmAnyBIC
	 * PartyIdentification96Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification99Choice#mmAnyBIC
	 * PartyIdentification99Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#mmAnyBIC
	 * PartyIdentification100Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#mmAnyBIC
	 * PartyIdentification104Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification111Choice#mmAnyBIC
	 * PartyIdentification111Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification103Choice#mmAnyBIC
	 * PartyIdentification103Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmPlaceOfClearing
	 * SecuritiesTradeDetails59.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmPlaceOfClearing
	 * SecuritiesTradeDetails58.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmPlaceOfClearing
	 * SecuritiesTradeDetails61.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmPlaceOfClearing
	 * SecuritiesTradeDetails63.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmPlaceOfClearing
	 * SecuritiesTradeDetails62.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmPlaceOfClearing
	 * TransactionDetails87.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmPlaceOfClearing
	 * SecuritiesTradeDetails60.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmPlaceOfClearing
	 * TransactionDetails91.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmPlaceOfClearing
	 * TransactionDetails90.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmPlaceOfClearing
	 * SecuritiesTradeDetails65.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmPlaceOfClearing
	 * SecuritiesTradeDetails66.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice#mmAnyBIC
	 * PartyIdentification115Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification114Choice#mmAnyBIC
	 * PartyIdentification114Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification95Choice#mmAnyBIC
	 * PartyIdentification95Choice.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmPlaceOfClearing
	 * SecuritiesTradeDetails67.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmPlaceOfClearing
	 * SecuritiesTradeDetails68.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmPlaceOfClearing
	 * TransactionDetails97.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPlaceOfClearing
	 * TransactionDetails96.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPlaceOfClearing
	 * TransactionDetails95.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmPlaceOfClearing
	 * SecuritiesTradeDetails69.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmPlaceOfClearing
	 * SecuritiesTradeDetails70.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmPlaceOfClearing
	 * TransactionDetails100.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmPlaceOfClearing
	 * TransactionDetails99.mmPlaceOfClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmPlaceOfClearing
	 * TransactionDetails98.mmPlaceOfClearing}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAnyBIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PartyIdentification1Choice.mmBICOrBEI, PartyIdentification2Choice.mmBICOrBEI, PartyIdentification4Choice.mmBICOrBEI, PartyIdentification5Choice.mmBICOrBEI,
					OrganisationIdentification4.mmBICOrBEI, OrganisationIdentification8.mmAnyBIC, AccountCashEntrySearch2.mmAccountOwner, AccountCashEntrySearch2.mmAccountServicer, CashAccountDetails1.mmAccountOwner,
					PartyIdentification13Choice.mmBICOrBEI, PartyIdentification36Choice.mmAnyBIC, OrganisationIdentification7.mmAnyBIC, PartyIdentification51Choice.mmAnyBIC, OrganisationIdentification9.mmAnyBIC,
					PartyIdentification12Choice.mmBICOrBEI, PartyIdentification10Choice.mmBICOrBEI, PartyIdentification14Choice.mmBICOrBEI, PartyIdentification44Choice.mmAnyBIC, PartyIdentification45Choice.mmAnyBIC,
					PartyIdentification37Choice.mmAnyBIC, SecuritiesTradeDetails25.mmPlaceOfClearing, SafekeepingPlaceTypeAndAnyBICIdentifier1.mmIdentification, PartyIdentification43Choice.mmAnyBIC,
					SecuritiesTradeDetails26.mmPlaceOfClearing, PartyIdentification58Choice.mmAnyBIC, PartyIdentification62Choice.mmAnyBIC, PartyIdentification60Choice.mmAnyBIC, PartyIdentification65Choice.mmAnyBIC,
					SecuritiesTradeDetails27.mmPlaceOfClearing, SecuritiesTradeDetails28.mmPlaceOfClearing, PartyIdentification18Choice.mmBICOrBEI, PartyIdentification16Choice.mmBICOrBEI, PartyIdentification46Choice.mmAnyBIC,
					PartyIdentification56Choice.mmAnyBIC, PartyIdentification48Choice.mmAnyBIC, PartyIdentification52Choice.mmAnyBIC, PartyIdentification41Choice.mmAnyBIC, PartyIdentification50Choice.mmAnyBIC,
					PartyIdentification17Choice.mmBICOrBEI, PartyIdentification39Choice.mmAnyBIC, PartyIdentification40Choice.mmAnyBIC, PartyIdentification53Choice.mmAnyBIC, PartyIdentification54Choice.mmAnyBIC,
					PartyIdentification47Choice.mmAnyBIC, PartyIdentification57Choice.mmAnyBIC, PartyIdentification3.mmBICOrBEI, PartyIdentification49Choice.mmAnyBIC, PartyIdentification59Choice.mmAnyBIC,
					SecuritiesTradeDetails6.mmPlaceOfClearing, SecuritiesTradeDetails13.mmPlaceOfClearing, SecuritiesTradeDetails3.mmPlaceOfClearing, SecuritiesTradeDetails11.mmPlaceOfClearing, PartyIdentification64Choice.mmAnyBIC,
					SecuritiesTradeDetails2.mmPlaceOfClearing, SecuritiesTradeDetails16.mmPlaceOfClearing, PartyIdentification63Choice.mmAnyBIC, SecuritiesTradeDetails1.mmPlaceOfClearing, SecuritiesTradeDetails15.mmPlaceOfClearing,
					TransactionDetails5.mmPlaceOfClearing, PartyIdentification15Choice.mmBICOrBEI, TransactionDetails9.mmPlaceOfClearing, TransactionDetails22.mmPlaceOfClearing, TransactionDetails23.mmPlaceOfClearing,
					TransactionDetails36.mmPlaceOfClearing, TransactionDetails47.mmPlaceOfClearing, TransactionDetails53.mmPlaceOfClearing, TransactionDetails58.mmPlaceOfClearing, TransactionDetails7.mmPlaceOfClearing,
					TransactionDetails16.mmPlaceOfClearing, TransactionDetails26.mmPlaceOfClearing, TransactionDetails27.mmPlaceOfClearing, TransactionDetails39.mmPlaceOfClearing, TransactionDetails50.mmPlaceOfClearing,
					TransactionDetails56.mmPlaceOfClearing, TransactionDetails59.mmPlaceOfClearing, TransactionDetails6.mmPlaceOfClearing, TransactionDetails18.mmPlaceOfClearing, TransactionDetails24.mmPlaceOfClearing,
					TransactionDetails34.mmPlaceOfClearing, TransactionDetails37.mmPlaceOfClearing, TransactionDetails48.mmPlaceOfClearing, TransactionDetails57.mmPlaceOfClearing, TransactionDetails60.mmPlaceOfClearing,
					PartyIdentification70Choice.mmAnyBIC, PartyIdentification23Choice.mmBICOrBEI, PartyIdentification23.mmBICOrBEI, Case.mmCreator, PartyIdentification7Choice.mmBICOrBEI, PartyIdentification22.mmBICOrBEI,
					PartyIdentification8Choice.mmBICOrBEI, PartyIdentification44.mmAnyBIC, PartyIdentification19Choice.mmAnyBIC, PartyIdentification59.mmAnyBIC, PlaceOfTradeIdentification1Choice.mmParty,
					PartyIdentification9Choice.mmBICOrBEI, CashAccount17.mmCorrespondentBankIdentification, OffMarket1Choice.mmSystematicInternaliser, PartyIdentification24Choice.mmBICOrBEI, PartyIdentification11Choice.mmBICOrBEI,
					SecuritiesTradeDetails8.mmPlaceOfClearing, SecuritiesTradeDetails18.mmPlaceOfClearing, SecuritiesTradeDetails4.mmPlaceOfClearing, SecuritiesTradeDetails17.mmPlaceOfClearing, PartyIdentification33Choice.mmAnyBIC,
					SecuritiesTradeDetails9.mmPlaceOfClearing, SecuritiesTradeDetails21.mmPlaceOfClearing, SecuritiesTradeDetails10.mmPlaceOfClearing, SecuritiesTradeDetails22.mmPlaceOfClearing, SecuritiesTradeDetails23.mmPlaceOfClearing,
					SecuritiesTradeDetails29.mmPlaceOfClearing, PartyIdentification66Choice.mmAnyBIC, PartyIdentification67Choice.mmAnyBIC, PartyIdentification26Choice.mmBICOrBEI, PartyIdentification72Choice.mmAnyBIC,
					PartyIdentification71Choice.mmAnyBIC, TransactionDetails51.mmPlaceOfClearing, TransactionDetails61.mmPlaceOfClearing, TransactionDetails62.mmPlaceOfClearing, TransactionDetails63.mmPlaceOfClearing,
					SecuritiesTradeDetails31.mmPlaceOfClearing, SecuritiesTradeDetails33.mmPlaceOfClearing, SecuritiesTradeDetails35.mmPlaceOfClearing, SecuritiesTradeDetails38.mmPlaceOfClearing, SecuritiesTradeDetails37.mmPlaceOfClearing,
					SecuritiesTradeDetails36.mmPlaceOfClearing, SecuritiesTradeDetails34.mmPlaceOfClearing, SecuritiesTradeDetails32.mmPlaceOfClearing, PartyIdentification62.mmBICFI, PartyIdentification64.mmAnyBIC,
					PartyIdentification75Choice.mmAnyBIC, SecuritiesTradeDetails44.mmPlaceOfClearing, SecuritiesTradeDetails39.mmPlaceOfClearing, SecuritiesTradeDetails43.mmPlaceOfClearing, SecuritiesTradeDetails41.mmPlaceOfClearing,
					SecuritiesTradeDetails40.mmPlaceOfClearing, TransactionDetails66.mmPlaceOfClearing, SecuritiesTradeDetails42.mmPlaceOfClearing, TransactionDetails67.mmPlaceOfClearing, TransactionDetails68.mmPlaceOfClearing,
					SecuritiesTradeDetails46.mmPlaceOfClearing, SecuritiesTradeDetails47.mmPlaceOfClearing, TransactionDetails70.mmPlaceOfClearing, TransactionDetails69.mmPlaceOfClearing, PartyIdentification83Choice.mmAnyBIC,
					PartyIdentification89Choice.mmAnyBIC, PartyIdentification87Choice.mmAnyBIC, TransactionDetails71.mmPlaceOfClearing, TransactionDetails72.mmPlaceOfClearing, PartyIdentification90Choice.mmAnyBIC,
					PartyIdentification92Choice.mmAnyBIC, SecuritiesTradeDetails49.mmPlaceOfClearing, TransactionDetails79.mmPlaceOfClearing, TransactionDetails75.mmPlaceOfClearing, TransactionDetails78.mmPlaceOfClearing,
					SecuritiesTradeDetails51.mmPlaceOfClearing, SecuritiesTradeDetails53.mmPlaceOfClearing, SecuritiesTradeDetails55.mmPlaceOfClearing, SecuritiesTradeDetails56.mmPlaceOfClearing, SecuritiesTradeDetails54.mmPlaceOfClearing,
					SecuritiesTradeDetails52.mmPlaceOfClearing, PartyIdentification93Choice.mmAnyBIC, SecuritiesTradeDetails50.mmPlaceOfClearing, OrganisationIdentification26.mmAnyBIC, PartyIdentification97Choice.mmAnyBIC,
					PartyIdentification96Choice.mmAnyBIC, PartyIdentification99Choice.mmAnyBIC, PartyIdentification100Choice.mmAnyBIC, PartyIdentification104Choice.mmAnyBIC, PartyIdentification111Choice.mmAnyBIC,
					PartyIdentification103Choice.mmAnyBIC, SecuritiesTradeDetails59.mmPlaceOfClearing, SecuritiesTradeDetails58.mmPlaceOfClearing, SecuritiesTradeDetails61.mmPlaceOfClearing, SecuritiesTradeDetails63.mmPlaceOfClearing,
					SecuritiesTradeDetails62.mmPlaceOfClearing, TransactionDetails87.mmPlaceOfClearing, SecuritiesTradeDetails60.mmPlaceOfClearing, TransactionDetails91.mmPlaceOfClearing, TransactionDetails90.mmPlaceOfClearing,
					SecuritiesTradeDetails65.mmPlaceOfClearing, SecuritiesTradeDetails66.mmPlaceOfClearing, PartyIdentification115Choice.mmAnyBIC, PartyIdentification114Choice.mmAnyBIC, PartyIdentification95Choice.mmAnyBIC,
					SecuritiesTradeDetails67.mmPlaceOfClearing, SecuritiesTradeDetails68.mmPlaceOfClearing, TransactionDetails97.mmPlaceOfClearing, TransactionDetails96.mmPlaceOfClearing, TransactionDetails95.mmPlaceOfClearing,
					SecuritiesTradeDetails69.mmPlaceOfClearing, SecuritiesTradeDetails70.mmPlaceOfClearing, TransactionDetails100.mmPlaceOfClearing, TransactionDetails99.mmPlaceOfClearing, TransactionDetails98.mmPlaceOfClearing);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.OrganisationName> organisationName;
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmOrganisation
	 * OrganisationName.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation2#mmName
	 * Organisation2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation4#mmName
	 * Organisation4.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation3#mmName
	 * Organisation3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#mmName
	 * Organisation21.mmName}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmOrganisationName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation2.mmName, Organisation4.mmName, Organisation3.mmName, Organisation21.mmName);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationName";
			definition = "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
		}
	};
	protected Organisation organisation;
	/**
	 * Organisation which is identified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmOrganisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation which is identified";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashClearingSystemMember> clearingSystemMemberIdentificationType;
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned
	 * by the system or system administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmOrganisationIdentification
	 * CashClearingSystemMember.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification3Choice.
	 * mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentificationChoice#mmClearingSystemMemberIdentification
	 * MemberIdentificationChoice.mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#mmClearingSystemMemberIdentification
	 * MemberIdentification2Choice.mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification3.mmClearingSystemMemberIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification5Choice.
	 * mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification7.mmClearingSystemMemberIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmClearingSystemIdentification
	 * PartyIdentification59.mmClearingSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification1.mmClearingSystemMemberIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification6.mmClearingSystemMemberIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification9.mmClearingSystemMemberIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification7Choice.
	 * mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification8Choice.
	 * mmClearingSystemMemberIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstitutionIdentification3Choice.mmClearingSystemMemberIdentification, MemberIdentificationChoice.mmClearingSystemMemberIdentification,
					MemberIdentification2Choice.mmClearingSystemMemberIdentification, FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification, FinancialInstitutionIdentification3.mmClearingSystemMemberIdentification,
					FinancialInstitutionIdentification5Choice.mmClearingSystemMemberIdentification, FinancialInstitutionIdentification7.mmClearingSystemMemberIdentification, PartyIdentification59.mmClearingSystemIdentification,
					FinancialInstitutionIdentification1.mmClearingSystemMemberIdentification, FinancialInstitutionIdentification6.mmClearingSystemMemberIdentification,
					FinancialInstitutionIdentification9.mmClearingSystemMemberIdentification, FinancialInstitutionIdentification7Choice.mmClearingSystemMemberIdentification,
					FinancialInstitutionIdentification8Choice.mmClearingSystemMemberIdentification);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmOrganisationIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
		}
	};
	protected BICNonFIIdentifier bICNonFI;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmIBEI
	 * OrganisationIdentification2.mmIBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmBEI
	 * OrganisationIdentification2.mmBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmIssuerIdentification
	 * FinancialInstrumentStipulations.mmIssuerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmIssuerIdentification
	 * FinancialInstrumentStipulations2.mmIssuerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmBEI
	 * NonFinancialInstitutionIdentification1.mmBEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification25#mmBEI
	 * PartyIdentification25.mmBEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification9#mmBEI
	 * PartyIdentification9.mmBEI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification5#mmBEI
	 * PartyIdentification5.mmBEI}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBICNonFI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrganisationIdentification2.mmIBEI, OrganisationIdentification2.mmBEI, FinancialInstrumentStipulations.mmIssuerIdentification, FinancialInstrumentStipulations2.mmIssuerIdentification,
					NonFinancialInstitutionIdentification1.mmBEI, PartyIdentification25.mmBEI, PartyIdentification9.mmBEI, PartyIdentification5.mmBEI);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BICNonFI";
			definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}
	};
	protected EANGLNIdentifier eANGLN;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmEANGLN
	 * OrganisationIdentification2.mmEANGLN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmEANGLN
	 * NonFinancialInstitutionIdentification1.mmEANGLN}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEANGLN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrganisationIdentification2.mmEANGLN, NonFinancialInstitutionIdentification1.mmEANGLN);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EANGLN";
			definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EANGLNIdentifier.mmObject();
		}
	};
	protected CHIPSUniversalIdentifier cHIPSUniversalIdentifier;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmCHIPSUniversalIdentification
	 * OrganisationIdentification2.mmCHIPSUniversalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmCHIPSUniversalIdentification
	 * NonFinancialInstitutionIdentification1.mmCHIPSUniversalIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCHIPSUniversalIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrganisationIdentification2.mmCHIPSUniversalIdentification, NonFinancialInstitutionIdentification1.mmCHIPSUniversalIdentification);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentifier";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.CHIPSUniversalIdentifier.mmObject();
		}
	};
	protected DunsIdentifier dUNS;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmDUNS
	 * OrganisationIdentification2.mmDUNS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmDUNS
	 * NonFinancialInstitutionIdentification1.mmDUNS}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDUNS = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrganisationIdentification2.mmDUNS, NonFinancialInstitutionIdentification1.mmDUNS);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DUNS";
			definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DunsIdentifier.mmObject();
		}
	};
	protected Max35Text bankPartyIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmBankPartyIdentification
	 * OrganisationIdentification2.mmBankPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmBankPartyIdentification
	 * NonFinancialInstitutionIdentification1.mmBankPartyIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBankPartyIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrganisationIdentification2.mmBankPartyIdentification, NonFinancialInstitutionIdentification1.mmBankPartyIdentification);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankPartyIdentification";
			definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected MICIdentifier mIC;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification1Choice#mmMarketIdentifierCode
	 * MarketIdentification1Choice.mmMarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice#mmMarketIdentifierCode
	 * MarketIdentification3Choice.mmMarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice#mmDescription
	 * MarketIdentification3Choice.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification2Choice#mmMarketIdentifierCode
	 * MarketIdentification2Choice.mmMarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification4Choice#mmMarketIdentifierCode
	 * MarketIdentification4Choice.mmMarketIdentifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification4Choice#mmDescription
	 * MarketIdentification4Choice.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice#mmLocalMarketPlace
	 * PriceSourceFormatChoice.mmLocalMarketPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#mmMIC
	 * PartyIdentification6Choice.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification1#mmIdentification
	 * MarketIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPlaceOfIssueIdentification
	 * FinancialInstrumentAttributes1.mmPlaceOfIssueIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification77#mmIdentification
	 * MarketIdentification77.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice#mmExchange
	 * PlaceOfTradeIdentification1Choice.mmExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson#mmPlaceOfListing
	 * MeetingContactPerson.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#mmPlaceOfListing
	 * MeetingContactPerson1.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice#mmMarketIdentification
	 * PlaceOfTradeIdentification2Choice.mmMarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#mmPlaceOfListing
	 * SecurityInstrumentDescription1.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice#mmMIC
	 * PartyIdentification24Choice.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification11Choice#mmCentralCounterparty
	 * PartyIdentification11Choice.mmCentralCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#mmPlaceOfListing
	 * SecurityInstrumentDescription2.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice#mmExchange
	 * PlaceOfTradeIdentification3Choice.mmExchange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssuePlace
	 * Issuance1.mmIssuePlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmMarketIdentification
	 * TradingParameters1.mmMarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#mmPlaceOfListing
	 * MeetingContactPerson2.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#mmMarketIdentificationCode
	 * TradingVenueIdentification1Choice.mmMarketIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#mmIdentification
	 * TradingVenueAttributes1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmMIC
	 * PersonOrOrganisation1Choice.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmPlaceOfListing
	 * Organisation30.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#mmPlaceOfListing
	 * Organisation29.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketDetail2#mmIdentification
	 * MarketDetail2.mmIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmMIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MarketIdentification1Choice.mmMarketIdentifierCode, MarketIdentification3Choice.mmMarketIdentifierCode, MarketIdentification3Choice.mmDescription,
					MarketIdentification2Choice.mmMarketIdentifierCode, MarketIdentification4Choice.mmMarketIdentifierCode, MarketIdentification4Choice.mmDescription, PriceSourceFormatChoice.mmLocalMarketPlace,
					PartyIdentification6Choice.mmMIC, MarketIdentification1.mmIdentification, FinancialInstrumentAttributes1.mmPlaceOfIssueIdentification, MarketIdentification77.mmIdentification,
					PlaceOfTradeIdentification1Choice.mmExchange, MeetingContactPerson.mmPlaceOfListing, MeetingContactPerson1.mmPlaceOfListing, PlaceOfTradeIdentification2Choice.mmMarketIdentification,
					SecurityInstrumentDescription1.mmPlaceOfListing, PartyIdentification24Choice.mmMIC, PartyIdentification11Choice.mmCentralCounterparty, SecurityInstrumentDescription2.mmPlaceOfListing,
					PlaceOfTradeIdentification3Choice.mmExchange, Issuance1.mmIssuePlace, TradingParameters1.mmMarketIdentification, MeetingContactPerson2.mmPlaceOfListing, TradingVenueIdentification1Choice.mmMarketIdentificationCode,
					TradingVenueAttributes1.mmIdentification, PersonOrOrganisation1Choice.mmMIC, Organisation30.mmPlaceOfListing, Organisation29.mmPlaceOfListing, MarketDetail2.mmIdentification);
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MIC";
			definition = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrganisationIdentification";
				definition = "Unique and unambiguous way to identify an organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmOrganisationIdentification, com.tools20022.repository.entity.OrganisationName.mmOrganisation,
						com.tools20022.repository.entity.CashClearingSystemMember.mmOrganisationIdentification);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstitutionIdentification3Choice.mmNameAndAddress, FinancialInstitutionIdentification8.mmOther, Party2Choice.mmOrganisationIdentification,
						Party6Choice.mmOrganisationIdentification, Party11Choice.mmOrganisationIdentification, FinancialInstitutionIdentification5Choice.mmNameAndAddress, FinancialInstitutionIdentification5Choice.mmCombinedIdentification,
						FinancialInstitutionIdentification7.mmOther, Party8Choice.mmOrganisationIdentification, ProprietaryAgent1.mmAgent, ProprietaryAgent2.mmAgent, ProprietaryAgent3.mmAgent, Charges2.mmAgent,
						Party10Choice.mmOrganisationIdentification, Party9Choice.mmOrganisationIdentification, Party9Choice.mmFinancialInstitutionIdentification, PartyIdentification59.mmLegalEntityIdentifier,
						PartyIdentification73Choice.mmAnyBIC, PartyIdentification60.mmLegalEntityIdentifier, Party1Choice.mmOrganisationIdentification, FinancialInstitutionIdentification4Choice.mmNameAndAddress,
						FinancialInstitutionIdentification9.mmOther, Party13Choice.mmOrganisationIdentification, Party13Choice.mmFinancialInstitutionIdentification, CashAccountCharacteristics1.mmAccountServicer,
						PartyOrganisation1Choice.mmOrganisationIdentification, Party5Choice.mmOrganisationIdentification, FinancialInstitutionIdentification6Choice.mmNameAndAddress, TradingVenueIdentification1Choice.mmOther,
						CashAccountCharacteristics2.mmAccountServicer, Party29Choice.mmOrganisationIdentification, Party29Choice.mmFinancialInstitutionIdentification, Party1.mmOrganisationIdentification,
						FinancialInstitutionIdentification7Choice.mmNameAndAddress, FinancialInstitutionIdentification10.mmParty, FinancialInstitutionIdentification8Choice.mmNameAndAddress);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(OrganisationIdentification.mmBICFI, OrganisationIdentification.mmAnyBIC, OrganisationIdentification.mmOrganisationName, OrganisationIdentification.mmOrganisation,
						OrganisationIdentification.mmClearingSystemMemberIdentificationType, OrganisationIdentification.mmBICNonFI, OrganisationIdentification.mmEANGLN, OrganisationIdentification.mmCHIPSUniversalIdentifier,
						OrganisationIdentification.mmDUNS, OrganisationIdentification.mmBankPartyIdentification, OrganisationIdentification.mmMIC);
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

	public BICFIIdentifier getBICFI() {
		return bICFI;
	}

	public void setBICFI(BICFIIdentifier bICFI) {
		this.bICFI = bICFI;
	}

	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public void setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = anyBIC;
	}

	public List<OrganisationName> getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(List<com.tools20022.repository.entity.OrganisationName> organisationName) {
		this.organisationName = organisationName;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(com.tools20022.repository.entity.Organisation organisation) {
		this.organisation = organisation;
	}

	public List<CashClearingSystemMember> getClearingSystemMemberIdentificationType() {
		return clearingSystemMemberIdentificationType;
	}

	public void setClearingSystemMemberIdentificationType(List<com.tools20022.repository.entity.CashClearingSystemMember> clearingSystemMemberIdentificationType) {
		this.clearingSystemMemberIdentificationType = clearingSystemMemberIdentificationType;
	}

	public BICNonFIIdentifier getBICNonFI() {
		return bICNonFI;
	}

	public void setBICNonFI(BICNonFIIdentifier bICNonFI) {
		this.bICNonFI = bICNonFI;
	}

	public EANGLNIdentifier getEANGLN() {
		return eANGLN;
	}

	public void setEANGLN(EANGLNIdentifier eANGLN) {
		this.eANGLN = eANGLN;
	}

	public CHIPSUniversalIdentifier getCHIPSUniversalIdentifier() {
		return cHIPSUniversalIdentifier;
	}

	public void setCHIPSUniversalIdentifier(com.tools20022.repository.datatype.CHIPSUniversalIdentifier cHIPSUniversalIdentifier) {
		this.cHIPSUniversalIdentifier = cHIPSUniversalIdentifier;
	}

	public DunsIdentifier getDUNS() {
		return dUNS;
	}

	public void setDUNS(DunsIdentifier dUNS) {
		this.dUNS = dUNS;
	}

	public Max35Text getBankPartyIdentification() {
		return bankPartyIdentification;
	}

	public void setBankPartyIdentification(Max35Text bankPartyIdentification) {
		this.bankPartyIdentification = bankPartyIdentification;
	}

	public MICIdentifier getMIC() {
		return mIC;
	}

	public void setMIC(MICIdentifier mIC) {
		this.mIC = mIC;
	}
}