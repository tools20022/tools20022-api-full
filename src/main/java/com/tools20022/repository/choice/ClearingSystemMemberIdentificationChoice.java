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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.AustralianBSBIdentification;
import com.tools20022.repository.entity.CashClearingSystemMember;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of identifiers for a clearing system member, as assigned by the
 * clearing system. In some clearing systems, the accounts of the clearing
 * system members are also assigned an identifier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmCHIPSUniversalIdentification
 * ClearingSystemMemberIdentificationChoice.mmCHIPSUniversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmNewZealandNCCIdentification
 * ClearingSystemMemberIdentificationChoice.mmNewZealandNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmIrishNSCIdentification
 * ClearingSystemMemberIdentificationChoice.mmIrishNSCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmUKDomesticSortCode
 * ClearingSystemMemberIdentificationChoice.mmUKDomesticSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmCHIPSParticipantIdentification
 * ClearingSystemMemberIdentificationChoice.mmCHIPSParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmSwissBCIdentification
 * ClearingSystemMemberIdentificationChoice.mmSwissBCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmFedwireRoutingNumberIdentification
 * ClearingSystemMemberIdentificationChoice.mmFedwireRoutingNumberIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmPortugueseNCCIdentification
 * ClearingSystemMemberIdentificationChoice.mmPortugueseNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmRussianCentralBankIdentificationCode
 * ClearingSystemMemberIdentificationChoice.
 * mmRussianCentralBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmItalianDomesticIdentificationCode
 * ClearingSystemMemberIdentificationChoice.mmItalianDomesticIdentificationCode}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmAustrianBankleitzahlIdentification
 * ClearingSystemMemberIdentificationChoice.mmAustrianBankleitzahlIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmCanadianPaymentsAssociationRoutingNumberIdentification
 * ClearingSystemMemberIdentificationChoice.
 * mmCanadianPaymentsAssociationRoutingNumberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmSwissSICIdentification
 * ClearingSystemMemberIdentificationChoice.mmSwissSICIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmGermanBankleitzahlIdentification
 * ClearingSystemMemberIdentificationChoice.mmGermanBankleitzahlIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmSpanishDomesticInterbankingIdentification
 * ClearingSystemMemberIdentificationChoice.
 * mmSpanishDomesticInterbankingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmSouthAfricanNCCIdentification
 * ClearingSystemMemberIdentificationChoice.mmSouthAfricanNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmHongKongBankCode
 * ClearingSystemMemberIdentificationChoice.mmHongKongBankCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmAustralianExtensiveBranchNetworkIdentification
 * ClearingSystemMemberIdentificationChoice.
 * mmAustralianExtensiveBranchNetworkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#mmAustralianSmallNetworkIdentification
 * ClearingSystemMemberIdentificationChoice.
 * mmAustralianSmallNetworkIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
 * CashClearingSystemMember}</li>
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
 * "ClearingSystemMemberIdentificationChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of identifiers for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ClearingSystemMemberIdentificationChoice", propOrder = {"CHIPSUniversalIdentification", "newZealandNCCIdentification", "irishNSCIdentification", "UKDomesticSortCode", "CHIPSParticipantIdentification",
		"swissBCIdentification", "fedwireRoutingNumberIdentification", "portugueseNCCIdentification", "russianCentralBankIdentificationCode", "italianDomesticIdentificationCode", "austrianBankleitzahlIdentification",
		"canadianPaymentsAssociationRoutingNumberIdentification", "swissSICIdentification", "germanBankleitzahlIdentification", "spanishDomesticInterbankingIdentification", "southAfricanNCCIdentification", "hongKongBankCode",
		"australianExtensiveBranchNetworkIdentification", "australianSmallNetworkIdentification"})
public class ClearingSystemMemberIdentificationChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSUniversalIdentifier
	 * CHIPSUniversalIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCHIPSUniversalIdentification
	 * CashClearingSystemMember.mmCHIPSUniversalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USCHU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCHIPSUniversalIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmCHIPSUniversalIdentification;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "USCHU";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSUniversalIdentification";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSUniversalIdentifier.mmObject();
		}
	};
	protected NewZealandNCCIdentifier newZealandNCCIdentification;
	/**
	 * New Zealand Bank/Branch Code - identifies New Zealand institutions on the
	 * New Zealand national clearing system. The code is assigned by the New
	 * Zealand Bankers' Association (NZBA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NewZealandNCCIdentifier
	 * NewZealandNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmNewZealandNCC
	 * CashClearingSystemMember.mmNewZealandNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NZNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewZealandNCCIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmNewZealandNCC;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "NZNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandNCCIdentification";
			definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NewZealandNCCIdentifier.mmObject();
		}
	};
	protected IrishNSCIdentifier irishNSCIdentification;
	/**
	 * Irish National Sorting Code - identifies Irish financial institutions on
	 * the Irish national clearing system. The code is assigned by the Irish
	 * Payments Services Organisation (IPSO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IrishNSCIdentifier
	 * IrishNSCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmIrishNSC
	 * CashClearingSystemMember.mmIrishNSC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IENSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IrishNSCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIrishNSCIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmIrishNSC;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "IENSC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IrishNSCIdentification";
			definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IrishNSCIdentifier.mmObject();
		}
	};
	protected UKDomesticSortCodeIdentifier uKDomesticSortCode;
	/**
	 * United Kingdom (UK) Sort Code - identifies British financial institutions
	 * on the British national clearing systems. The sort code is assigned by
	 * the Association for Payments and Clearing Services (APACS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UKDomesticSortCodeIdentifier
	 * UKDomesticSortCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmUKSortCode
	 * CashClearingSystemMember.mmUKSortCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GBSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKDomesticSortCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUKDomesticSortCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmUKSortCode;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "GBSC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomesticSortCode";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSParticipantIdentifier
	 * CHIPSParticipantIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCHIPSParticipantIdentification
	 * CashClearingSystemMember.mmCHIPSParticipantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCHIPSParticipantIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmCHIPSParticipantIdentification;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "USCH";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSParticipantIdentification";
			definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSParticipantIdentifier.mmObject();
		}
	};
	protected SwissBCIdentifier swissBCIdentification;
	/**
	 * Swiss Bank Code - identifies Swiss institutions on the Swiss national
	 * clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissBCIdentifier
	 * SwissBCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSwissBC
	 * CashClearingSystemMember.mmSwissBC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CHBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissBCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSwissBCIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmSwissBC;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "CHBC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissBCIdentification";
			definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissBCIdentifier.mmObject();
		}
	};
	protected FedwireRoutingNumberIdentifier fedwireRoutingNumberIdentification;
	/**
	 * Fedwire Routing Number - identifies financial institutions, in the US, on
	 * the FedWire system. The routing number is assigned by the American
	 * Bankers Association (ABA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.FedwireRoutingNumberIdentifier
	 * FedwireRoutingNumberIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmFedwireRoutingNumber
	 * CashClearingSystemMember.mmFedwireRoutingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedwireRoutingNumberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fedwire Routing Number - identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFedwireRoutingNumberIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmFedwireRoutingNumber;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "USFW";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedwireRoutingNumberIdentification";
			definition = "Fedwire Routing Number - identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FedwireRoutingNumberIdentifier.mmObject();
		}
	};
	protected PortugueseNCCIdentifier portugueseNCCIdentification;
	/**
	 * Portuguese National Clearing Code - identifies Portuguese financial
	 * institutions on the Portuguese national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PortugueseNCCIdentifier
	 * PortugueseNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmPortugueseNCC
	 * CashClearingSystemMember.mmPortugueseNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PTNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortugueseNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortugueseNCCIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmPortugueseNCC;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "PTNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortugueseNCCIdentification";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RussianCentralBankIdentificationCodeIdentifier
	 * RussianCentralBankIdentificationCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmRussianCentralBankIdentificationCode
	 * CashClearingSystemMember.mmRussianCentralBankIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RUCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RussianCentralBankIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRussianCentralBankIdentificationCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmRussianCentralBankIdentificationCode;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "RUCB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ItalianDomesticIdentifier
	 * ItalianDomesticIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmItalianDomesticIdentificationCode
	 * CashClearingSystemMember.mmItalianDomesticIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ITNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItalianDomesticIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmItalianDomesticIdentificationCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmItalianDomesticIdentificationCode;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "ITNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItalianDomesticIdentificationCode";
			definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ItalianDomesticIdentifier.mmObject();
		}
	};
	protected AustrianBankleitzahlIdentifier austrianBankleitzahlIdentification;
	/**
	 * Austrian Bankleitzahl - identifies Austrian financial institutions on the
	 * Austrian national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AustrianBankleitzahlIdentifier
	 * AustrianBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmAustrianBankleitzahl
	 * CashClearingSystemMember.mmAustrianBankleitzahl}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATBLZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustrianBankleitzahlIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAustrianBankleitzahlIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmAustrianBankleitzahl;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "ATBLZ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustrianBankleitzahlIdentification";
			definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AustrianBankleitzahlIdentifier.mmObject();
		}
	};
	protected CanadianPaymentsARNIdentifier canadianPaymentsAssociationRoutingNumberIdentification;
	/**
	 * Canadian Payments Association Routing Number - identifies Canadian
	 * financial institutions on the Canadian national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CanadianPaymentsARNIdentifier
	 * CanadianPaymentsARNIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCanadianPaymentsAssociationRoutingNumber
	 * CashClearingSystemMember.mmCanadianPaymentsAssociationRoutingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CACPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianPaymentsAssociationRoutingNumberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCanadianPaymentsAssociationRoutingNumberIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmCanadianPaymentsAssociationRoutingNumber;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "CACPA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianPaymentsAssociationRoutingNumberIdentification";
			definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CanadianPaymentsARNIdentifier.mmObject();
		}
	};
	protected SwissSICIdentifier swissSICIdentification;
	/**
	 * Swiss Interbank Clearing (SIC) Code - identifies Swiss financial
	 * institutions domestically, on the Swiss national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissSICIdentifier
	 * SwissSICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSwissSIC
	 * CashClearingSystemMember.mmSwissSIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CHSIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissSICIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSwissSICIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmSwissSIC;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "CHSIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissSICIdentification";
			definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissSICIdentifier.mmObject();
		}
	};
	protected GermanBankleitzahlIdentifier germanBankleitzahlIdentification;
	/**
	 * German Bankleitzahl - identifies German financial institutions on the
	 * German national clearing systems.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.GermanBankleitzahlIdentifier
	 * GermanBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmGermanBankleitzahl
	 * CashClearingSystemMember.mmGermanBankleitzahl}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DEBLZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanBankleitzahlIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "German Bankleitzahl - identifies German financial institutions on the German national clearing systems."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGermanBankleitzahlIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmGermanBankleitzahl;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "DEBLZ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanBankleitzahlIdentification";
			definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GermanBankleitzahlIdentifier.mmObject();
		}
	};
	protected SpanishDomesticInterbankingIdentifier spanishDomesticInterbankingIdentification;
	/**
	 * Spanish Domestic Interbanking Code - identifies Spanish financial
	 * institutions on the Spanish national clearing system. The code is
	 * assigned by the Centro de Cooperacion Interbancaria (CCI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SpanishDomesticInterbankingIdentifier
	 * SpanishDomesticInterbankingIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSpanishDomesticInterbankingCode
	 * CashClearingSystemMember.mmSpanishDomesticInterbankingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ESNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpanishDomesticInterbankingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpanishDomesticInterbankingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmSpanishDomesticInterbankingCode;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "ESNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpanishDomesticInterbankingIdentification";
			definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SpanishDomesticInterbankingIdentifier.mmObject();
		}
	};
	protected SouthAfricanNCCIdentifier southAfricanNCCIdentification;
	/**
	 * South African National Clearing Code (NCC) - identifies South African
	 * financial institutions on the South African national clearing system. The
	 * code is assigned by the South African Bankers Services Company Ltd.
	 * (BankServ).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SouthAfricanNCCIdentifier
	 * SouthAfricanNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSouthAfricanNCC
	 * CashClearingSystemMember.mmSouthAfricanNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ZANCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SouthAfricanNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSouthAfricanNCCIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmSouthAfricanNCC;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "ZANCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SouthAfricanNCCIdentification";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.HongKongBankIdentifier
	 * HongKongBankIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmHongKongBankCode
	 * CashClearingSystemMember.mmHongKongBankCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HKNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongBankCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHongKongBankCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmHongKongBankCode;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "HKNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongBankCode";
			definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HongKongBankIdentifier.mmObject();
		}
	};
	protected ExtensiveBranchNetworkIdentifier australianExtensiveBranchNetworkIdentification;
	/**
	 * Extensive branch network list of the Australian Bank State Branch (BSB)
	 * Code. The codes are used for identifying Australian financial
	 * institutions, as assigned by the Australian Payments Clearing Association
	 * (APCA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ExtensiveBranchNetworkIdentifier
	 * ExtensiveBranchNetworkIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmExtensiveBranchNetworkIdentification
	 * AustralianBSBIdentification.mmExtensiveBranchNetworkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AUBSBx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianExtensiveBranchNetworkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAustralianExtensiveBranchNetworkIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AustralianBSBIdentification.mmExtensiveBranchNetworkIdentification;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "AUBSBx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianExtensiveBranchNetworkIdentification";
			definition = "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExtensiveBranchNetworkIdentifier.mmObject();
		}
	};
	protected SmallNetworkIdentifier australianSmallNetworkIdentification;
	/**
	 * Small network list of the Australian Bank State Branch (BSB) Code. The
	 * codes are used for identifying Australian financial institutions , as
	 * assigned by the Australian Payments Clearing Association (APCA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SmallNetworkIdentifier
	 * SmallNetworkIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmSmallNetworkIdentification
	 * AustralianBSBIdentification.mmSmallNetworkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AUBSBs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianSmallNetworkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions , as assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAustralianSmallNetworkIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AustralianBSBIdentification.mmSmallNetworkIdentification;
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "AUBSBs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianSmallNetworkIdentification";
			definition = "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions , as assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SmallNetworkIdentifier.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ClearingSystemMemberIdentificationChoice.mmCHIPSUniversalIdentification, ClearingSystemMemberIdentificationChoice.mmNewZealandNCCIdentification,
						ClearingSystemMemberIdentificationChoice.mmIrishNSCIdentification, ClearingSystemMemberIdentificationChoice.mmUKDomesticSortCode, ClearingSystemMemberIdentificationChoice.mmCHIPSParticipantIdentification,
						ClearingSystemMemberIdentificationChoice.mmSwissBCIdentification, ClearingSystemMemberIdentificationChoice.mmFedwireRoutingNumberIdentification,
						ClearingSystemMemberIdentificationChoice.mmPortugueseNCCIdentification, ClearingSystemMemberIdentificationChoice.mmRussianCentralBankIdentificationCode,
						ClearingSystemMemberIdentificationChoice.mmItalianDomesticIdentificationCode, ClearingSystemMemberIdentificationChoice.mmAustrianBankleitzahlIdentification,
						ClearingSystemMemberIdentificationChoice.mmCanadianPaymentsAssociationRoutingNumberIdentification, ClearingSystemMemberIdentificationChoice.mmSwissSICIdentification,
						ClearingSystemMemberIdentificationChoice.mmGermanBankleitzahlIdentification, ClearingSystemMemberIdentificationChoice.mmSpanishDomesticInterbankingIdentification,
						ClearingSystemMemberIdentificationChoice.mmSouthAfricanNCCIdentification, ClearingSystemMemberIdentificationChoice.mmHongKongBankCode,
						ClearingSystemMemberIdentificationChoice.mmAustralianExtensiveBranchNetworkIdentification, ClearingSystemMemberIdentificationChoice.mmAustralianSmallNetworkIdentification);
				trace_lazy = () -> CashClearingSystemMember.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingSystemMemberIdentificationChoice";
				definition = "Choice of identifiers for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "USCHU", required = true)
	public CHIPSUniversalIdentifier getCHIPSUniversalIdentification() {
		return cHIPSUniversalIdentification;
	}

	public void setCHIPSUniversalIdentification(CHIPSUniversalIdentifier cHIPSUniversalIdentification) {
		this.cHIPSUniversalIdentification = cHIPSUniversalIdentification;
	}

	@XmlElement(name = "NZNCC", required = true)
	public NewZealandNCCIdentifier getNewZealandNCCIdentification() {
		return newZealandNCCIdentification;
	}

	public void setNewZealandNCCIdentification(NewZealandNCCIdentifier newZealandNCCIdentification) {
		this.newZealandNCCIdentification = newZealandNCCIdentification;
	}

	@XmlElement(name = "IENSC", required = true)
	public IrishNSCIdentifier getIrishNSCIdentification() {
		return irishNSCIdentification;
	}

	public void setIrishNSCIdentification(IrishNSCIdentifier irishNSCIdentification) {
		this.irishNSCIdentification = irishNSCIdentification;
	}

	@XmlElement(name = "GBSC", required = true)
	public UKDomesticSortCodeIdentifier getUKDomesticSortCode() {
		return uKDomesticSortCode;
	}

	public void setUKDomesticSortCode(UKDomesticSortCodeIdentifier uKDomesticSortCode) {
		this.uKDomesticSortCode = uKDomesticSortCode;
	}

	@XmlElement(name = "USCH", required = true)
	public CHIPSParticipantIdentifier getCHIPSParticipantIdentification() {
		return cHIPSParticipantIdentification;
	}

	public void setCHIPSParticipantIdentification(CHIPSParticipantIdentifier cHIPSParticipantIdentification) {
		this.cHIPSParticipantIdentification = cHIPSParticipantIdentification;
	}

	@XmlElement(name = "CHBC", required = true)
	public SwissBCIdentifier getSwissBCIdentification() {
		return swissBCIdentification;
	}

	public void setSwissBCIdentification(SwissBCIdentifier swissBCIdentification) {
		this.swissBCIdentification = swissBCIdentification;
	}

	@XmlElement(name = "USFW", required = true)
	public FedwireRoutingNumberIdentifier getFedwireRoutingNumberIdentification() {
		return fedwireRoutingNumberIdentification;
	}

	public void setFedwireRoutingNumberIdentification(FedwireRoutingNumberIdentifier fedwireRoutingNumberIdentification) {
		this.fedwireRoutingNumberIdentification = fedwireRoutingNumberIdentification;
	}

	@XmlElement(name = "PTNCC", required = true)
	public PortugueseNCCIdentifier getPortugueseNCCIdentification() {
		return portugueseNCCIdentification;
	}

	public void setPortugueseNCCIdentification(PortugueseNCCIdentifier portugueseNCCIdentification) {
		this.portugueseNCCIdentification = portugueseNCCIdentification;
	}

	@XmlElement(name = "RUCB", required = true)
	public RussianCentralBankIdentificationCodeIdentifier getRussianCentralBankIdentificationCode() {
		return russianCentralBankIdentificationCode;
	}

	public void setRussianCentralBankIdentificationCode(RussianCentralBankIdentificationCodeIdentifier russianCentralBankIdentificationCode) {
		this.russianCentralBankIdentificationCode = russianCentralBankIdentificationCode;
	}

	@XmlElement(name = "ITNCC", required = true)
	public ItalianDomesticIdentifier getItalianDomesticIdentificationCode() {
		return italianDomesticIdentificationCode;
	}

	public void setItalianDomesticIdentificationCode(ItalianDomesticIdentifier italianDomesticIdentificationCode) {
		this.italianDomesticIdentificationCode = italianDomesticIdentificationCode;
	}

	@XmlElement(name = "ATBLZ", required = true)
	public AustrianBankleitzahlIdentifier getAustrianBankleitzahlIdentification() {
		return austrianBankleitzahlIdentification;
	}

	public void setAustrianBankleitzahlIdentification(AustrianBankleitzahlIdentifier austrianBankleitzahlIdentification) {
		this.austrianBankleitzahlIdentification = austrianBankleitzahlIdentification;
	}

	@XmlElement(name = "CACPA", required = true)
	public CanadianPaymentsARNIdentifier getCanadianPaymentsAssociationRoutingNumberIdentification() {
		return canadianPaymentsAssociationRoutingNumberIdentification;
	}

	public void setCanadianPaymentsAssociationRoutingNumberIdentification(CanadianPaymentsARNIdentifier canadianPaymentsAssociationRoutingNumberIdentification) {
		this.canadianPaymentsAssociationRoutingNumberIdentification = canadianPaymentsAssociationRoutingNumberIdentification;
	}

	@XmlElement(name = "CHSIC", required = true)
	public SwissSICIdentifier getSwissSICIdentification() {
		return swissSICIdentification;
	}

	public void setSwissSICIdentification(SwissSICIdentifier swissSICIdentification) {
		this.swissSICIdentification = swissSICIdentification;
	}

	@XmlElement(name = "DEBLZ", required = true)
	public GermanBankleitzahlIdentifier getGermanBankleitzahlIdentification() {
		return germanBankleitzahlIdentification;
	}

	public void setGermanBankleitzahlIdentification(GermanBankleitzahlIdentifier germanBankleitzahlIdentification) {
		this.germanBankleitzahlIdentification = germanBankleitzahlIdentification;
	}

	@XmlElement(name = "ESNCC", required = true)
	public SpanishDomesticInterbankingIdentifier getSpanishDomesticInterbankingIdentification() {
		return spanishDomesticInterbankingIdentification;
	}

	public void setSpanishDomesticInterbankingIdentification(SpanishDomesticInterbankingIdentifier spanishDomesticInterbankingIdentification) {
		this.spanishDomesticInterbankingIdentification = spanishDomesticInterbankingIdentification;
	}

	@XmlElement(name = "ZANCC", required = true)
	public SouthAfricanNCCIdentifier getSouthAfricanNCCIdentification() {
		return southAfricanNCCIdentification;
	}

	public void setSouthAfricanNCCIdentification(SouthAfricanNCCIdentifier southAfricanNCCIdentification) {
		this.southAfricanNCCIdentification = southAfricanNCCIdentification;
	}

	@XmlElement(name = "HKNCC", required = true)
	public HongKongBankIdentifier getHongKongBankCode() {
		return hongKongBankCode;
	}

	public void setHongKongBankCode(HongKongBankIdentifier hongKongBankCode) {
		this.hongKongBankCode = hongKongBankCode;
	}

	@XmlElement(name = "AUBSBx", required = true)
	public ExtensiveBranchNetworkIdentifier getAustralianExtensiveBranchNetworkIdentification() {
		return australianExtensiveBranchNetworkIdentification;
	}

	public void setAustralianExtensiveBranchNetworkIdentification(ExtensiveBranchNetworkIdentifier australianExtensiveBranchNetworkIdentification) {
		this.australianExtensiveBranchNetworkIdentification = australianExtensiveBranchNetworkIdentification;
	}

	@XmlElement(name = "AUBSBs", required = true)
	public SmallNetworkIdentifier getAustralianSmallNetworkIdentification() {
		return australianSmallNetworkIdentification;
	}

	public void setAustralianSmallNetworkIdentification(SmallNetworkIdentifier australianSmallNetworkIdentification) {
		this.australianSmallNetworkIdentification = australianSmallNetworkIdentification;
	}
}