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
import com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice;
import com.tools20022.repository.choice.ClearingSystemMemberIdentification3Choice;
import com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.ClearingSystemMemberIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous identifier for a clearing system member, as assigned
 * by the clearing system. In some clearing systems, the accounts of the
 * clearing system members are also assigned an identifier. The identifier can
 * be used when transmitting, reconciling and confirming payment orders or
 * security transfer instructions prior to settlement, and may include the
 * netting of instructions and the establishment of final positions for
 * settlement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashClearingSystemMember"
 * src="doc-files/CashClearingSystemMember.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmOrganisationIdentification
 * CashClearingSystemMember.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCHIPSUniversalIdentification
 * CashClearingSystemMember.mmCHIPSUniversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmNewZealandNCC
 * CashClearingSystemMember.mmNewZealandNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmIrishNSC
 * CashClearingSystemMember.mmIrishNSC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmUKSortCode
 * CashClearingSystemMember.mmUKSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCHIPSParticipantIdentification
 * CashClearingSystemMember.mmCHIPSParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSwissBC
 * CashClearingSystemMember.mmSwissBC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmFedwireRoutingNumber
 * CashClearingSystemMember.mmFedwireRoutingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmPortugueseNCC
 * CashClearingSystemMember.mmPortugueseNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmRussianCentralBankIdentificationCode
 * CashClearingSystemMember.mmRussianCentralBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmItalianDomesticIdentificationCode
 * CashClearingSystemMember.mmItalianDomesticIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmAustrianBankleitzahl
 * CashClearingSystemMember.mmAustrianBankleitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCanadianPaymentsAssociationRoutingNumber
 * CashClearingSystemMember.mmCanadianPaymentsAssociationRoutingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSwissSIC
 * CashClearingSystemMember.mmSwissSIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmGermanBankleitzahl
 * CashClearingSystemMember.mmGermanBankleitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSpanishDomesticInterbankingCode
 * CashClearingSystemMember.mmSpanishDomesticInterbankingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSouthAfricanNCC
 * CashClearingSystemMember.mmSouthAfricanNCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmHongKongBankCode
 * CashClearingSystemMember.mmHongKongBankCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmClearingMember
 * CashClearingSystemMember.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmIndianFinancialSystemCode
 * CashClearingSystemMember.mmIndianFinancialSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmHellenicBankIdentificationCode
 * CashClearingSystemMember.mmHellenicBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmPolishNationalClearingCode
 * CashClearingSystemMember.mmPolishNationalClearingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmAustralianBSBCode
 * CashClearingSystemMember.mmAustralianBSBCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmClearingSystemMemberIdentificationType
 * AustralianBSBIdentification.mmClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSystemMemberIdentification
 * ClearingMemberRole.mmClearingSystemMemberIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification3Choice#mmIdentification
 * ClearingSystemMemberIdentification3Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification3Choice#mmProprietary
 * ClearingSystemMemberIdentification3Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmOtherClearingCodeIdentification
 * ClearingSystemMemberIdentification2Choice.mmOtherClearingCodeIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
 * ClearingSystemMemberIdentificationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification3Choice
 * ClearingSystemMemberIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2
 * ClearingSystemMemberIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
 * ClearingSystemMemberIdentification2Choice}</li>
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
 * "CashClearingSystemMember"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement."
 * </li>
 * </ul>
 */
public class CashClearingSystemMember {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OrganisationIdentification organisationIdentification;
	/**
	 * Identification parameters which include clearing system member
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
	 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification parameters which include clearing system member identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identification parameters which include clearing system member identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmClearingSystemMemberIdentificationType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}
	};
	protected CHIPSUniversalIdentifier cHIPSUniversalIdentification;
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS)
	 * Universal Identification (UID) - identifies entities that own accounts at
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
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmCHIPSUniversalIdentification
	 * ClearingSystemMemberIdentificationChoice.mmCHIPSUniversalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmCHIPSUniversalIdentification
	 * ClearingSystemMemberIdentification2Choice.mmCHIPSUniversalIdentification}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCHIPSUniversalIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmCHIPSUniversalIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmCHIPSUniversalIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentification";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSUniversalIdentifier.mmObject();
		}
	};
	protected NewZealandNCCIdentifier newZealandNCC;
	/**
	 * New Zealand Bank/Branch Code - identifies New Zealand institutions on the
	 * New Zealand national clearing system. The code is assigned by the New
	 * Zealand Bankers' Association (NZBA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NewZealandNCCIdentifier
	 * NewZealandNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmNewZealandNCCIdentification
	 * ClearingSystemMemberIdentificationChoice.mmNewZealandNCCIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmNewZealandNCCIdentification
	 * ClearingSystemMemberIdentification2Choice.mmNewZealandNCCIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNewZealandNCC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmNewZealandNCCIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmNewZealandNCCIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewZealandNCC";
			definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NewZealandNCCIdentifier.mmObject();
		}
	};
	protected IrishNSCIdentifier irishNSC;
	/**
	 * Irish National Sorting Code - identifies Irish financial institutions on
	 * the Irish national clearing system. The code is assigned by the Irish
	 * Payments Services Organisation (IPSO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IrishNSCIdentifier
	 * IrishNSCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmIrishNSCIdentification
	 * ClearingSystemMemberIdentificationChoice.mmIrishNSCIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmIrishNSCIdentification
	 * ClearingSystemMemberIdentification2Choice.mmIrishNSCIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IrishNSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIrishNSC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmIrishNSCIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmIrishNSCIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IrishNSC";
			definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IrishNSCIdentifier.mmObject();
		}
	};
	protected UKDomesticSortCodeIdentifier uKSortCode;
	/**
	 * United Kingdom (UK) Sort Code - identifies British financial institutions
	 * on the British national clearing systems. The sort code is assigned by
	 * the Association for Payments and Clearing Services (APACS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UKDomesticSortCodeIdentifier
	 * UKDomesticSortCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmUKDomesticSortCode
	 * ClearingSystemMemberIdentificationChoice.mmUKDomesticSortCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount6#mmGBBankSortCode
	 * CashAccount6.mmGBBankSortCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmUKDomesticSortCode
	 * ClearingSystemMemberIdentification2Choice.mmUKDomesticSortCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKSortCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUKSortCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmUKDomesticSortCode, com.tools20022.repository.msg.CashAccount6.mmGBBankSortCode,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmUKDomesticSortCode);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UKSortCode";
			definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UKDomesticSortCodeIdentifier.mmObject();
		}
	};
	protected CHIPSParticipantIdentifier cHIPSParticipantIdentification;
	/**
	 * (United States) Clearing House Interbank Payment System (CHIPS)
	 * Participant Identifier (ID) - identifies financial institutions
	 * participating on CHIPS. The CHIPS Participant ID is assigned by the New
	 * York Clearing House.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSParticipantIdentifier
	 * CHIPSParticipantIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmCHIPSParticipantIdentification
	 * ClearingSystemMemberIdentificationChoice.mmCHIPSParticipantIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmCHIPSParticipantIdentification
	 * ClearingSystemMemberIdentification2Choice.
	 * mmCHIPSParticipantIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCHIPSParticipantIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmCHIPSParticipantIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmCHIPSParticipantIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CHIPSParticipantIdentification";
			definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSParticipantIdentifier.mmObject();
		}
	};
	protected SwissBCIdentifier swissBC;
	/**
	 * Swiss Bank Code - identifies Swiss institutions on the Swiss national
	 * clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissBCIdentifier
	 * SwissBCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmSwissBCIdentification
	 * ClearingSystemMemberIdentificationChoice.mmSwissBCIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmSwissBCIdentification
	 * ClearingSystemMemberIdentification2Choice.mmSwissBCIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSwissBC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmSwissBCIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmSwissBCIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwissBC";
			definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissBCIdentifier.mmObject();
		}
	};
	protected FedwireRoutingNumberIdentifier fedwireRoutingNumber;
	/**
	 * Fed wire Routing Number - identifies financial institutions, in the US,
	 * on the Fed wire system. The routing number is assigned by the American
	 * Bankers Association (ABA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.FedwireRoutingNumberIdentifier
	 * FedwireRoutingNumberIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmFedwireRoutingNumberIdentification
	 * ClearingSystemMemberIdentificationChoice.
	 * mmFedwireRoutingNumberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmFedwireRoutingNumberIdentification
	 * ClearingSystemMemberIdentification2Choice.
	 * mmFedwireRoutingNumberIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedwireRoutingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFedwireRoutingNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmFedwireRoutingNumberIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmFedwireRoutingNumberIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FedwireRoutingNumber";
			definition = "Fed wire Routing Number - identifies financial institutions, in the US, on the Fed wire system. The routing number is assigned by the American Bankers Association (ABA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FedwireRoutingNumberIdentifier.mmObject();
		}
	};
	protected PortugueseNCCIdentifier portugueseNCC;
	/**
	 * Portuguese National Clearing Code - identifies Portuguese financial
	 * institutions on the Portuguese national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PortugueseNCCIdentifier
	 * PortugueseNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmPortugueseNCCIdentification
	 * ClearingSystemMemberIdentificationChoice.mmPortugueseNCCIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmPortugueseNCCIdentification
	 * ClearingSystemMemberIdentification2Choice.mmPortugueseNCCIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortugueseNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPortugueseNCC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmPortugueseNCCIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmPortugueseNCCIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PortugueseNCC";
			definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PortugueseNCCIdentifier.mmObject();
		}
	};
	protected RussianCentralBankIdentificationCodeIdentifier russianCentralBankIdentificationCode;
	/**
	 * Russian Central Bank Identification Code - identifies Russian financial
	 * institutions on the Russian national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RussianCentralBankIdentificationCodeIdentifier
	 * RussianCentralBankIdentificationCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmRussianCentralBankIdentificationCode
	 * ClearingSystemMemberIdentificationChoice.
	 * mmRussianCentralBankIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmRussianCentralBankIdentificationCode
	 * ClearingSystemMemberIdentification2Choice.
	 * mmRussianCentralBankIdentificationCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RussianCentralBankIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRussianCentralBankIdentificationCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmRussianCentralBankIdentificationCode,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmRussianCentralBankIdentificationCode);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RussianCentralBankIdentificationCode";
			definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RussianCentralBankIdentificationCodeIdentifier.mmObject();
		}
	};
	protected ItalianDomesticIdentifier italianDomesticIdentificationCode;
	/**
	 * Italian Domestic Identification Code - identifies Italian financial
	 * institutions on the Italian national clearing system. The code is
	 * assigned by the Associazione Bancaria Italiana (ABI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ItalianDomesticIdentifier
	 * ItalianDomesticIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmItalianDomesticIdentificationCode
	 * ClearingSystemMemberIdentificationChoice.
	 * mmItalianDomesticIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmItalianDomesticIdentificationCode
	 * ClearingSystemMemberIdentification2Choice.
	 * mmItalianDomesticIdentificationCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItalianDomesticIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmItalianDomesticIdentificationCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmItalianDomesticIdentificationCode,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmItalianDomesticIdentificationCode);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ItalianDomesticIdentificationCode";
			definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ItalianDomesticIdentifier.mmObject();
		}
	};
	protected AustrianBankleitzahlIdentifier austrianBankleitzahl;
	/**
	 * Austrian Bankleitzahl - identifies Austrian financial institutions on the
	 * Austrian national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AustrianBankleitzahlIdentifier
	 * AustrianBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmAustrianBankleitzahlIdentification
	 * ClearingSystemMemberIdentificationChoice.
	 * mmAustrianBankleitzahlIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmAustrianBankleitzahlIdentification
	 * ClearingSystemMemberIdentification2Choice.
	 * mmAustrianBankleitzahlIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustrianBankleitzahl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAustrianBankleitzahl = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmAustrianBankleitzahlIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmAustrianBankleitzahlIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AustrianBankleitzahl";
			definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AustrianBankleitzahlIdentifier.mmObject();
		}
	};
	protected CanadianPaymentsARNIdentifier canadianPaymentsAssociationRoutingNumber;
	/**
	 * Canadian Payments Association Routing Number - identifies Canadian
	 * financial institutions on the Canadian national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CanadianPaymentsARNIdentifier
	 * CanadianPaymentsARNIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmCanadianPaymentsAssociationRoutingNumberIdentification
	 * ClearingSystemMemberIdentificationChoice.
	 * mmCanadianPaymentsAssociationRoutingNumberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmCanadianPaymentsAssociationRoutingNumberIdentification
	 * ClearingSystemMemberIdentification2Choice.
	 * mmCanadianPaymentsAssociationRoutingNumberIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianPaymentsAssociationRoutingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCanadianPaymentsAssociationRoutingNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmCanadianPaymentsAssociationRoutingNumberIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmCanadianPaymentsAssociationRoutingNumberIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CanadianPaymentsAssociationRoutingNumber";
			definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CanadianPaymentsARNIdentifier.mmObject();
		}
	};
	protected SwissSICIdentifier swissSIC;
	/**
	 * Swiss Interbank Clearing (SIC) Code - identifies Swiss financial
	 * institutions domestically, on the Swiss national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissSICIdentifier
	 * SwissSICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmSwissSICIdentification
	 * ClearingSystemMemberIdentificationChoice.mmSwissSICIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmSwissSICIdentification
	 * ClearingSystemMemberIdentification2Choice.mmSwissSICIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissSIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSwissSIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmSwissSICIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmSwissSICIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwissSIC";
			definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissSICIdentifier.mmObject();
		}
	};
	protected GermanBankleitzahlIdentifier germanBankleitzahl;
	/**
	 * German Bankleitzahl - identifies German financial institutions on the
	 * German national clearing systems.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.GermanBankleitzahlIdentifier
	 * GermanBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmGermanBankleitzahlIdentification
	 * ClearingSystemMemberIdentificationChoice.
	 * mmGermanBankleitzahlIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmGermanBankleitzahlIdentification
	 * ClearingSystemMemberIdentification2Choice.
	 * mmGermanBankleitzahlIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanBankleitzahl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "German Bankleitzahl - identifies German financial institutions on the German national clearing systems."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGermanBankleitzahl = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmGermanBankleitzahlIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmGermanBankleitzahlIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GermanBankleitzahl";
			definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GermanBankleitzahlIdentifier.mmObject();
		}
	};
	protected SpanishDomesticInterbankingIdentifier spanishDomesticInterbankingCode;
	/**
	 * Spanish Domestic Interbanking Code - identifies Spanish financial
	 * institutions on the Spanish national clearing system. The code is
	 * assigned by the Centro de Cooperacion Interbancaria (CCI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SpanishDomesticInterbankingIdentifier
	 * SpanishDomesticInterbankingIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmSpanishDomesticInterbankingIdentification
	 * ClearingSystemMemberIdentificationChoice.
	 * mmSpanishDomesticInterbankingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmSpanishDomesticInterbankingIdentification
	 * ClearingSystemMemberIdentification2Choice.
	 * mmSpanishDomesticInterbankingIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpanishDomesticInterbankingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSpanishDomesticInterbankingCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmSpanishDomesticInterbankingIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmSpanishDomesticInterbankingIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpanishDomesticInterbankingCode";
			definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SpanishDomesticInterbankingIdentifier.mmObject();
		}
	};
	protected SouthAfricanNCCIdentifier southAfricanNCC;
	/**
	 * South African National Clearing Code (NCC) - identifies South African
	 * financial institutions on the South African national clearing system. The
	 * code is assigned by the South African Bankers Services Company Ltd.
	 * (BankServ).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SouthAfricanNCCIdentifier
	 * SouthAfricanNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmSouthAfricanNCCIdentification
	 * ClearingSystemMemberIdentificationChoice.mmSouthAfricanNCCIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmSouthAfricanNCCIdentification
	 * ClearingSystemMemberIdentification2Choice.mmSouthAfricanNCCIdentification
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SouthAfricanNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSouthAfricanNCC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmSouthAfricanNCCIdentification,
					com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmSouthAfricanNCCIdentification);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SouthAfricanNCC";
			definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SouthAfricanNCCIdentifier.mmObject();
		}
	};
	protected HongKongBankIdentifier hongKongBankCode;
	/**
	 * Hong Kong Bank Code - identifies Hong Kong financial institutions on the
	 * Hong Kong local clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.HongKongBankIdentifier
	 * HongKongBankIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmHongKongBankCode
	 * ClearingSystemMemberIdentificationChoice.mmHongKongBankCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmHongKongBankCode
	 * ClearingSystemMemberIdentification2Choice.mmHongKongBankCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongBankCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHongKongBankCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.mmHongKongBankCode, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmHongKongBankCode);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HongKongBankCode";
			definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HongKongBankIdentifier.mmObject();
		}
	};
	protected ClearingMemberRole clearingMember;
	/**
	 * Clearing system member for which a clearing system member identification
	 * is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSystemMemberIdentification
	 * ClearingMemberRole.mmClearingSystemMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing system member for which a clearing system member identification is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingMember = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingMember";
			definition = "Clearing system member for which a clearing system member identification is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmClearingSystemMemberIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};
	protected IndianFinancialSystemCodeIdentifier indianFinancialSystemCode;
	/**
	 * Indian Financial System Code - identifies Indian financial institutions
	 * on the Indian local clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IndianFinancialSystemCodeIdentifier
	 * IndianFinancialSystemCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmIndianFinancialSystemCode
	 * ClearingSystemMemberIdentification2Choice.mmIndianFinancialSystemCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndianFinancialSystemCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndianFinancialSystemCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmIndianFinancialSystemCode);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndianFinancialSystemCode";
			definition = "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IndianFinancialSystemCodeIdentifier.mmObject();
		}
	};
	protected HellenicBankIdentificationCodeIdentifier hellenicBankIdentificationCode;
	/**
	 * Hellenic Bank Identification Code - identifies Hellenic financial
	 * institutions on the Hellenic national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.HellenicBankIdentificationCodeIdentifier
	 * HellenicBankIdentificationCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmHellenicBankIdentificationCode
	 * ClearingSystemMemberIdentification2Choice.
	 * mmHellenicBankIdentificationCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HellenicBankIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHellenicBankIdentificationCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmHellenicBankIdentificationCode);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HellenicBankIdentificationCode";
			definition = "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HellenicBankIdentificationCodeIdentifier.mmObject();
		}
	};
	protected PolishNationalClearingCodeIdentifier polishNationalClearingCode;
	/**
	 * Polish National Clearing Code - identifies Polish financial institutions
	 * on the Polish national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PolishNationalClearingCodeIdentifier
	 * PolishNationalClearingCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmPolishNationalClearingCode
	 * ClearingSystemMemberIdentification2Choice.mmPolishNationalClearingCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PolishNationalClearingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPolishNationalClearingCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmPolishNationalClearingCode);
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PolishNationalClearingCode";
			definition = "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PolishNationalClearingCodeIdentifier.mmObject();
		}
	};
	protected AustralianBSBIdentification australianBSBCode;
	/**
	 * Australian Bank State Branch (BSB) Code - identifies Australian financial
	 * institutions on the Australian national clearing system. The code is
	 * assigned by the Australian Payments Clearing Association (APCA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmClearingSystemMemberIdentificationType
	 * AustralianBSBIdentification.mmClearingSystemMemberIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification
	 * AustralianBSBIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianBSBCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAustralianBSBCode = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashClearingSystemMember.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AustralianBSBCode";
			definition = "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.mmClearingSystemMemberIdentificationType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystemMember";
				definition = "Unique and unambiguous identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier. The identifier can be used when transmitting, reconciling and confirming payment orders or security transfer instructions prior to settlement, and may include the netting of instructions and the establishment of final positions for settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.mmClearingSystemMemberIdentificationType,
						com.tools20022.repository.entity.AustralianBSBIdentification.mmClearingSystemMemberIdentificationType, com.tools20022.repository.entity.ClearingMemberRole.mmClearingSystemMemberIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentification3Choice.mmIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification3Choice.mmProprietary, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmOtherClearingCodeIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystemMember.mmOrganisationIdentification, com.tools20022.repository.entity.CashClearingSystemMember.mmCHIPSUniversalIdentification,
						com.tools20022.repository.entity.CashClearingSystemMember.mmNewZealandNCC, com.tools20022.repository.entity.CashClearingSystemMember.mmIrishNSC,
						com.tools20022.repository.entity.CashClearingSystemMember.mmUKSortCode, com.tools20022.repository.entity.CashClearingSystemMember.mmCHIPSParticipantIdentification,
						com.tools20022.repository.entity.CashClearingSystemMember.mmSwissBC, com.tools20022.repository.entity.CashClearingSystemMember.mmFedwireRoutingNumber,
						com.tools20022.repository.entity.CashClearingSystemMember.mmPortugueseNCC, com.tools20022.repository.entity.CashClearingSystemMember.mmRussianCentralBankIdentificationCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmItalianDomesticIdentificationCode, com.tools20022.repository.entity.CashClearingSystemMember.mmAustrianBankleitzahl,
						com.tools20022.repository.entity.CashClearingSystemMember.mmCanadianPaymentsAssociationRoutingNumber, com.tools20022.repository.entity.CashClearingSystemMember.mmSwissSIC,
						com.tools20022.repository.entity.CashClearingSystemMember.mmGermanBankleitzahl, com.tools20022.repository.entity.CashClearingSystemMember.mmSpanishDomesticInterbankingCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmSouthAfricanNCC, com.tools20022.repository.entity.CashClearingSystemMember.mmHongKongBankCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmClearingMember, com.tools20022.repository.entity.CashClearingSystemMember.mmIndianFinancialSystemCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmHellenicBankIdentificationCode, com.tools20022.repository.entity.CashClearingSystemMember.mmPolishNationalClearingCode,
						com.tools20022.repository.entity.CashClearingSystemMember.mmAustralianBSBCode);
				derivationComponent_lazy = () -> Arrays.asList(ClearingSystemMemberIdentificationChoice.mmObject(), ClearingSystemMemberIdentification3Choice.mmObject(), ClearingSystemMemberIdentification2.mmObject(),
						ClearingSystemMemberIdentification2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public OrganisationIdentification getOrganisationIdentification() {
		return organisationIdentification;
	}

	public void setOrganisationIdentification(com.tools20022.repository.entity.OrganisationIdentification organisationIdentification) {
		this.organisationIdentification = organisationIdentification;
	}

	public CHIPSUniversalIdentifier getCHIPSUniversalIdentification() {
		return cHIPSUniversalIdentification;
	}

	public void setCHIPSUniversalIdentification(CHIPSUniversalIdentifier cHIPSUniversalIdentification) {
		this.cHIPSUniversalIdentification = cHIPSUniversalIdentification;
	}

	public NewZealandNCCIdentifier getNewZealandNCC() {
		return newZealandNCC;
	}

	public void setNewZealandNCC(NewZealandNCCIdentifier newZealandNCC) {
		this.newZealandNCC = newZealandNCC;
	}

	public IrishNSCIdentifier getIrishNSC() {
		return irishNSC;
	}

	public void setIrishNSC(IrishNSCIdentifier irishNSC) {
		this.irishNSC = irishNSC;
	}

	public UKDomesticSortCodeIdentifier getUKSortCode() {
		return uKSortCode;
	}

	public void setUKSortCode(UKDomesticSortCodeIdentifier uKSortCode) {
		this.uKSortCode = uKSortCode;
	}

	public CHIPSParticipantIdentifier getCHIPSParticipantIdentification() {
		return cHIPSParticipantIdentification;
	}

	public void setCHIPSParticipantIdentification(CHIPSParticipantIdentifier cHIPSParticipantIdentification) {
		this.cHIPSParticipantIdentification = cHIPSParticipantIdentification;
	}

	public SwissBCIdentifier getSwissBC() {
		return swissBC;
	}

	public void setSwissBC(SwissBCIdentifier swissBC) {
		this.swissBC = swissBC;
	}

	public FedwireRoutingNumberIdentifier getFedwireRoutingNumber() {
		return fedwireRoutingNumber;
	}

	public void setFedwireRoutingNumber(FedwireRoutingNumberIdentifier fedwireRoutingNumber) {
		this.fedwireRoutingNumber = fedwireRoutingNumber;
	}

	public PortugueseNCCIdentifier getPortugueseNCC() {
		return portugueseNCC;
	}

	public void setPortugueseNCC(PortugueseNCCIdentifier portugueseNCC) {
		this.portugueseNCC = portugueseNCC;
	}

	public RussianCentralBankIdentificationCodeIdentifier getRussianCentralBankIdentificationCode() {
		return russianCentralBankIdentificationCode;
	}

	public void setRussianCentralBankIdentificationCode(RussianCentralBankIdentificationCodeIdentifier russianCentralBankIdentificationCode) {
		this.russianCentralBankIdentificationCode = russianCentralBankIdentificationCode;
	}

	public ItalianDomesticIdentifier getItalianDomesticIdentificationCode() {
		return italianDomesticIdentificationCode;
	}

	public void setItalianDomesticIdentificationCode(ItalianDomesticIdentifier italianDomesticIdentificationCode) {
		this.italianDomesticIdentificationCode = italianDomesticIdentificationCode;
	}

	public AustrianBankleitzahlIdentifier getAustrianBankleitzahl() {
		return austrianBankleitzahl;
	}

	public void setAustrianBankleitzahl(AustrianBankleitzahlIdentifier austrianBankleitzahl) {
		this.austrianBankleitzahl = austrianBankleitzahl;
	}

	public CanadianPaymentsARNIdentifier getCanadianPaymentsAssociationRoutingNumber() {
		return canadianPaymentsAssociationRoutingNumber;
	}

	public void setCanadianPaymentsAssociationRoutingNumber(CanadianPaymentsARNIdentifier canadianPaymentsAssociationRoutingNumber) {
		this.canadianPaymentsAssociationRoutingNumber = canadianPaymentsAssociationRoutingNumber;
	}

	public SwissSICIdentifier getSwissSIC() {
		return swissSIC;
	}

	public void setSwissSIC(SwissSICIdentifier swissSIC) {
		this.swissSIC = swissSIC;
	}

	public GermanBankleitzahlIdentifier getGermanBankleitzahl() {
		return germanBankleitzahl;
	}

	public void setGermanBankleitzahl(GermanBankleitzahlIdentifier germanBankleitzahl) {
		this.germanBankleitzahl = germanBankleitzahl;
	}

	public SpanishDomesticInterbankingIdentifier getSpanishDomesticInterbankingCode() {
		return spanishDomesticInterbankingCode;
	}

	public void setSpanishDomesticInterbankingCode(SpanishDomesticInterbankingIdentifier spanishDomesticInterbankingCode) {
		this.spanishDomesticInterbankingCode = spanishDomesticInterbankingCode;
	}

	public SouthAfricanNCCIdentifier getSouthAfricanNCC() {
		return southAfricanNCC;
	}

	public void setSouthAfricanNCC(SouthAfricanNCCIdentifier southAfricanNCC) {
		this.southAfricanNCC = southAfricanNCC;
	}

	public HongKongBankIdentifier getHongKongBankCode() {
		return hongKongBankCode;
	}

	public void setHongKongBankCode(HongKongBankIdentifier hongKongBankCode) {
		this.hongKongBankCode = hongKongBankCode;
	}

	public ClearingMemberRole getClearingMember() {
		return clearingMember;
	}

	public void setClearingMember(com.tools20022.repository.entity.ClearingMemberRole clearingMember) {
		this.clearingMember = clearingMember;
	}

	public IndianFinancialSystemCodeIdentifier getIndianFinancialSystemCode() {
		return indianFinancialSystemCode;
	}

	public void setIndianFinancialSystemCode(IndianFinancialSystemCodeIdentifier indianFinancialSystemCode) {
		this.indianFinancialSystemCode = indianFinancialSystemCode;
	}

	public HellenicBankIdentificationCodeIdentifier getHellenicBankIdentificationCode() {
		return hellenicBankIdentificationCode;
	}

	public void setHellenicBankIdentificationCode(HellenicBankIdentificationCodeIdentifier hellenicBankIdentificationCode) {
		this.hellenicBankIdentificationCode = hellenicBankIdentificationCode;
	}

	public PolishNationalClearingCodeIdentifier getPolishNationalClearingCode() {
		return polishNationalClearingCode;
	}

	public void setPolishNationalClearingCode(PolishNationalClearingCodeIdentifier polishNationalClearingCode) {
		this.polishNationalClearingCode = polishNationalClearingCode;
	}

	public AustralianBSBIdentification getAustralianBSBCode() {
		return australianBSBCode;
	}

	public void setAustralianBSBCode(com.tools20022.repository.entity.AustralianBSBIdentification australianBSBCode) {
		this.australianBSBCode = australianBSBCode;
	}
}