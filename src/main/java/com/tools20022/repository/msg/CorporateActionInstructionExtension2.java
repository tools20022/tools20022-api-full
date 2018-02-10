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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code;
import com.tools20022.repository.codeset.DTCCSubEventType1Code;
import com.tools20022.repository.codeset.DTCServiceType1Code;
import com.tools20022.repository.codeset.ExtendedEventType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmPlaceAndName
 * CorporateActionInstructionExtension2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmInstructionType
 * CorporateActionInstructionExtension2.mmInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmServiceTypeIndicator
 * CorporateActionInstructionExtension2.mmServiceTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmEventType
 * CorporateActionInstructionExtension2.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmSubEventType
 * CorporateActionInstructionExtension2.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmDTCCOptionType
 * CorporateActionInstructionExtension2.mmDTCCOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmProtectIdentification
 * CorporateActionInstructionExtension2.mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmProtectDate
 * CorporateActionInstructionExtension2.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmAcknowledgementFlag
 * CorporateActionInstructionExtension2.mmAcknowledgementFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmSolicitationDealerFeeFlag
 * CorporateActionInstructionExtension2.mmSolicitationDealerFeeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmConditionsAcceptance
 * CorporateActionInstructionExtension2.mmConditionsAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmOddLotFlag
 * CorporateActionInstructionExtension2.mmOddLotFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmExemptFromInterestPenaltyFlag
 * CorporateActionInstructionExtension2.mmExemptFromInterestPenaltyFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmDeclaredPayableDate
 * CorporateActionInstructionExtension2.mmDeclaredPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmRecordDate
 * CorporateActionInstructionExtension2.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmForeignCurrencyPayment
 * CorporateActionInstructionExtension2.mmForeignCurrencyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmOptionalDividend
 * CorporateActionInstructionExtension2.mmOptionalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmTaxExempt
 * CorporateActionInstructionExtension2.mmTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmWireInstruction
 * CorporateActionInstructionExtension2.mmWireInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmDTCTaxRelief
 * CorporateActionInstructionExtension2.mmDTCTaxRelief}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmContactPerson
 * CorporateActionInstructionExtension2.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmAdditionalText
 * CorporateActionInstructionExtension2.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmContraCUSIP
 * CorporateActionInstructionExtension2.mmContraCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmConditionalQuantity
 * CorporateActionInstructionExtension2.mmConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmInstructedPrice
 * CorporateActionInstructionExtension2.mmInstructedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmCustomerIdentification
 * CorporateActionInstructionExtension2.mmCustomerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmCustomerComments
 * CorporateActionInstructionExtension2.mmCustomerComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmUSTaxWithholding
 * CorporateActionInstructionExtension2.mmUSTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2#mmCashInLieu
 * CorporateActionInstructionExtension2.mmCashInLieu}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionExtension2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructionExtension2", propOrder = {"placeAndName", "instructionType", "serviceTypeIndicator", "eventType", "subEventType", "dTCCOptionType", "protectIdentification", "protectDate", "acknowledgementFlag",
		"solicitationDealerFeeFlag", "conditionsAcceptance", "oddLotFlag", "exemptFromInterestPenaltyFlag", "declaredPayableDate", "recordDate", "foreignCurrencyPayment", "optionalDividend", "taxExempt", "wireInstruction", "dTCTaxRelief",
		"contactPerson", "additionalText", "contraCUSIP", "conditionalQuantity", "instructedPrice", "customerIdentification", "customerComments", "uSTaxWithholding", "cashInLieu"})
public class CorporateActionInstructionExtension2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "InstrTp")
	protected DTCCorporateActionInstructionType2Code instructionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code
	 * DTCCorporateActionInstructionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Instruction Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "InstrTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Instruction Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionType";
			definition = "Type of instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCorporateActionInstructionType2Code.mmObject();
		}
	};
	@XmlElement(name = "SvcTpInd")
	protected DTCServiceType1Code serviceTypeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code
	 * DTCServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Service Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of specific DTC service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "SvcTpInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Service Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceTypeIndicator";
			definition = "Type of specific DTC service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCServiceType1Code.mmObject();
		}
	};
	@XmlElement(name = "EvtTp")
	protected ExtendedEventType1Code eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType1Code.mmObject();
		}
	};
	@XmlElement(name = "SubEvtTp")
	protected DTCCSubEventType1Code subEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Sub Event Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Sub Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType1Code.mmObject();
		}
	};
	@XmlElement(name = "DTCCOptnTp")
	protected Max4AlphaNumericText dTCCOptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCCOptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Option Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for the option types that cannot be classified in ISO and marked as Option Type: OTHR. Options like convert and dividend reinvestment, or DTC (The Depository Trust Corporation)  special option types for the instances where the event and security are eligible for DTC (The Depository Trust Corporation) services like Foreign Tax, Foreign Currency Payments, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCCOptionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "DTCCOptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Option Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCOptionType";
			definition = "Used for the option types that cannot be classified in ISO and marked as Option Type: OTHR. Options like convert and dividend reinvestment, or DTC (The Depository Trust Corporation)  special option types for the instances where the event and security are eligible for DTC (The Depository Trust Corporation) services like Foreign Tax, Foreign Currency Payments, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "PrtctId")
	protected Max16Text protectIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Protect Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the protect that was submitted. Required when instruction type is Cover Protect. This identification is either from DTC system which was assigned upon the submission of the protect instruction or is an identification that pertains to a cover protect submitted directly to the agent (indicated by instruction type)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Identifies the protect that was submitted. Required when instruction type is Cover Protect. This identification is either from DTC system which was assigned upon the submission of the protect instruction or is an identification that pertains to a cover protect submitted directly to the agent (indicated by instruction type).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	@XmlElement(name = "PrtctDt")
	protected ISODate protectDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Protect Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the protect was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date at which the protect was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "AckFlg")
	protected YesNoIndicator acknowledgementFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Acknowledgement Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that submitter has agreed to all terms and conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcknowledgementFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "AckFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Acknowledgement Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementFlag";
			definition = "Indicates that submitter has agreed to all terms and conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SlctnDealrFeeFlg")
	protected YesNoIndicator solicitationDealerFeeFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnDealrFeeFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Solicitation Dealer Fee Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationDealerFeeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSolicitationDealerFeeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "SlctnDealrFeeFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Solicitation Dealer Fee Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationDealerFeeFlag";
			definition = "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "CondsAccptnc")
	protected List<com.tools20022.repository.msg.ConditionAcceptance1> conditionsAcceptance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ConditionAcceptance1
	 * ConditionAcceptance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondsAccptnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Conditions Acceptance</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionsAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides an acceptance flag for the identified conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConditionsAcceptance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CondsAccptnc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Conditions Acceptance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionsAcceptance";
			definition = "Provides an acceptance flag for the identified conditions.";
			maxOccurs = 9;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ConditionAcceptance1.mmObject();
		}
	};
	@XmlElement(name = "OddLotFlg")
	protected YesNoIndicator oddLotFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OddLotFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Off Lot Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the odd lot is accepted for tender offers."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOddLotFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "OddLotFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Off Lot Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotFlag";
			definition = "Indicates whether the odd lot is accepted for tender offers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "XmptFrIntrstPnltyFlg")
	protected YesNoIndicator exemptFromInterestPenaltyFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptFrIntrstPnltyFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Exempt From Interest Penalties Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptFromInterestPenaltyFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instruction is exempt from interest penalties."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptFromInterestPenaltyFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "XmptFrIntrstPnltyFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Exempt From Interest Penalties Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptFromInterestPenaltyFlag";
			definition = "Indicates whether the instruction is exempt from interest penalties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DclrdPyblDt")
	protected ISODate declaredPayableDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdPyblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Declared Payable Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredPayableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the movement has been declared payable by the issuer to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredPayableDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "DclrdPyblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Payable Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredPayableDate";
			definition = "Date at which the movement has been declared payable by the issuer to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "RcrdDt")
	protected ISODate recordDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Record Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which positions are stuck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date. DTC  (The Depository Trust Corporation) uses a reference match. This is why it is extended to general Information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecordDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Record Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date at which positions are stuck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date. DTC  (The Depository Trust Corporation) uses a reference match. This is why it is extended to general Information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "FrgnCcyPmt")
	protected List<com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1> foreignCurrencyPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1
	 * ForeignCurrencyPaymentAccountQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnCcyPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Foreign Currency Payment</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign currency payment information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignCurrencyPayment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "FrgnCcyPmt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Foreign Currency Payment"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPayment";
			definition = "Foreign currency payment information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1.mmObject();
		}
	};
	@XmlElement(name = "OptnlDvdd")
	protected List<com.tools20022.repository.msg.OptionalDividendAccountQuantitySD1> optionalDividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD1
	 * OptionalDividendAccountQuantitySD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnlDvdd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Optional Dividend</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Optional dividend payment information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionalDividend = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "OptnlDvdd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Optional Dividend"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividend";
			definition = "Optional dividend payment information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OptionalDividendAccountQuantitySD1.mmObject();
		}
	};
	@XmlElement(name = "TaxXmpt")
	protected List<com.tools20022.repository.msg.TaxExemptQuantitySD1> taxExempt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxExemptQuantitySD1
	 * TaxExemptQuantitySD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxXmpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Tax Exempt</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax exempt payment information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxExempt = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "TaxXmpt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Tax Exempt"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExempt";
			definition = "Tax exempt payment information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxExemptQuantitySD1.mmObject();
		}
	};
	@XmlElement(name = "WireInstr")
	protected List<com.tools20022.repository.msg.WireInstructionSD1> wireInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.WireInstructionSD1
	 * WireInstructionSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WireInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Wire Instruction</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WireInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details of the wire payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWireInstruction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "WireInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Wire Instruction"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WireInstruction";
			definition = "Provides details of the wire payment instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
		}
	};
	@XmlElement(name = "DTCTaxRlf")
	protected List<com.tools20022.repository.msg.DTCTaxReliefSD2> dTCTaxRelief;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DTCTaxReliefSD2
	 * DTCTaxReliefSD2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCTaxRlf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Tax Relief</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCTaxRelief"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on DTC (The Depository Trust Corporation) Tax Relief service instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDTCTaxRelief = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "DTCTaxRlf";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Tax Relief"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCTaxRelief";
			definition = "Provides details on DTC (The Depository Trust Corporation) Tax Relief service instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DTCTaxReliefSD2.mmObject();
		}
	};
	@XmlElement(name = "CtctPrsn")
	protected ContactIdentification1 contactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Information Contact</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a contact person by a name, a given name and an address."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContactPerson = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Information Contact"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Identifies a contact person by a name, a given name and an address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
		}
	};
	@XmlElement(name = "AddtlTxt")
	protected RestrictedFINXMax350Text additionalText;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Additional Text</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalText = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Additional Text"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	@XmlElement(name = "ContraCUSIP")
	protected CUSIPIdentification1 contraCUSIP;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CUSIPIdentification1
	 * CUSIPIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ContraCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Contra CUSIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the CUSIP identification of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContraCUSIP = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "ContraCUSIP";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra CUSIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraCUSIP";
			definition = "Provides the CUSIP identification of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CUSIPIdentification1.mmObject();
		}
	};
	@XmlElement(name = "CondlQty")
	protected RestrictedFINDecimalNumber conditionalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINDecimalNumber
	 * RestrictedFINDecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Conditional Quantity</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election).\nIn case of proration, if this minimum quantity is not reached then the instruction is void."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConditionalQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CondlQty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Conditional Quantity"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election).\nIn case of proration, if this minimum quantity is not reached then the instruction is void.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINDecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "InstdPric")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount instructedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Instructed Price</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price that is submitted. Must fall between max/min price"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "InstdPric";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Instructed Price"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedPrice";
			definition = "Price that is submitted. Must fall between max/min price";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	@XmlElement(name = "CstmrId")
	protected Max35Text customerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Customer ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer identification. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CstmrId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Customer ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentification";
			definition = "Customer identification. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CstmrCmnts")
	protected Max35Text customerComments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Customer Comments</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free form comments."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerComments = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CstmrCmnts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Customer Comments"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerComments";
			definition = "Free form comments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "USTaxWhldg")
	protected List<com.tools20022.repository.msg.USTaxWithholdingSD1> uSTaxWithholding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.USTaxWithholdingSD1
	 * USTaxWithholdingSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USTaxWhldg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: US Tax Withholding</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "U.S. Tax Withholding elections."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUSTaxWithholding = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "USTaxWhldg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "US Tax Withholding"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTaxWithholding";
			definition = "U.S. Tax Withholding elections.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.USTaxWithholdingSD1.mmObject();
		}
	};
	@XmlElement(name = "CshInLieu")
	protected List<com.tools20022.repository.msg.CashInLieuSD1> cashInLieu;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInLieuSD1
	 * CashInLieuSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension2
	 * CorporateActionInstructionExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Cash In Lieu</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash In Lieu election instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInLieu = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CshInLieu";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Cash In Lieu"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieu";
			definition = "Cash In Lieu election instructions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashInLieuSD1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmInstructionType,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmServiceTypeIndicator, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmEventType,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmSubEventType, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmDTCCOptionType,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmProtectIdentification, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmAcknowledgementFlag, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmSolicitationDealerFeeFlag,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmConditionsAcceptance, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmOddLotFlag,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmExemptFromInterestPenaltyFlag, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmDeclaredPayableDate,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmRecordDate, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmForeignCurrencyPayment,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmOptionalDividend, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmTaxExempt,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmWireInstruction, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmDTCTaxRelief,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmContactPerson, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmAdditionalText,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmContraCUSIP, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmConditionalQuantity,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmInstructedPrice, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmCustomerIdentification,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmCustomerComments, com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmUSTaxWithholding,
						com.tools20022.repository.msg.CorporateActionInstructionExtension2.mmCashInLieu);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructionExtension2";
				definition = "Provides additional information regarding corporate action instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionInstructionExtension2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<DTCCorporateActionInstructionType2Code> getInstructionType() {
		return instructionType == null ? Optional.empty() : Optional.of(instructionType);
	}

	public CorporateActionInstructionExtension2 setInstructionType(DTCCorporateActionInstructionType2Code instructionType) {
		this.instructionType = instructionType;
		return this;
	}

	public Optional<DTCServiceType1Code> getServiceTypeIndicator() {
		return serviceTypeIndicator == null ? Optional.empty() : Optional.of(serviceTypeIndicator);
	}

	public CorporateActionInstructionExtension2 setServiceTypeIndicator(DTCServiceType1Code serviceTypeIndicator) {
		this.serviceTypeIndicator = serviceTypeIndicator;
		return this;
	}

	public Optional<ExtendedEventType1Code> getEventType() {
		return eventType == null ? Optional.empty() : Optional.of(eventType);
	}

	public CorporateActionInstructionExtension2 setEventType(ExtendedEventType1Code eventType) {
		this.eventType = eventType;
		return this;
	}

	public Optional<DTCCSubEventType1Code> getSubEventType() {
		return subEventType == null ? Optional.empty() : Optional.of(subEventType);
	}

	public CorporateActionInstructionExtension2 setSubEventType(DTCCSubEventType1Code subEventType) {
		this.subEventType = subEventType;
		return this;
	}

	public Optional<Max4AlphaNumericText> getDTCCOptionType() {
		return dTCCOptionType == null ? Optional.empty() : Optional.of(dTCCOptionType);
	}

	public CorporateActionInstructionExtension2 setDTCCOptionType(Max4AlphaNumericText dTCCOptionType) {
		this.dTCCOptionType = dTCCOptionType;
		return this;
	}

	public Optional<Max16Text> getProtectIdentification() {
		return protectIdentification == null ? Optional.empty() : Optional.of(protectIdentification);
	}

	public CorporateActionInstructionExtension2 setProtectIdentification(Max16Text protectIdentification) {
		this.protectIdentification = protectIdentification;
		return this;
	}

	public Optional<ISODate> getProtectDate() {
		return protectDate == null ? Optional.empty() : Optional.of(protectDate);
	}

	public CorporateActionInstructionExtension2 setProtectDate(ISODate protectDate) {
		this.protectDate = protectDate;
		return this;
	}

	public Optional<YesNoIndicator> getAcknowledgementFlag() {
		return acknowledgementFlag == null ? Optional.empty() : Optional.of(acknowledgementFlag);
	}

	public CorporateActionInstructionExtension2 setAcknowledgementFlag(YesNoIndicator acknowledgementFlag) {
		this.acknowledgementFlag = acknowledgementFlag;
		return this;
	}

	public Optional<YesNoIndicator> getSolicitationDealerFeeFlag() {
		return solicitationDealerFeeFlag == null ? Optional.empty() : Optional.of(solicitationDealerFeeFlag);
	}

	public CorporateActionInstructionExtension2 setSolicitationDealerFeeFlag(YesNoIndicator solicitationDealerFeeFlag) {
		this.solicitationDealerFeeFlag = solicitationDealerFeeFlag;
		return this;
	}

	public List<ConditionAcceptance1> getConditionsAcceptance() {
		return conditionsAcceptance == null ? conditionsAcceptance = new ArrayList<>() : conditionsAcceptance;
	}

	public CorporateActionInstructionExtension2 setConditionsAcceptance(List<com.tools20022.repository.msg.ConditionAcceptance1> conditionsAcceptance) {
		this.conditionsAcceptance = Objects.requireNonNull(conditionsAcceptance);
		return this;
	}

	public Optional<YesNoIndicator> getOddLotFlag() {
		return oddLotFlag == null ? Optional.empty() : Optional.of(oddLotFlag);
	}

	public CorporateActionInstructionExtension2 setOddLotFlag(YesNoIndicator oddLotFlag) {
		this.oddLotFlag = oddLotFlag;
		return this;
	}

	public Optional<YesNoIndicator> getExemptFromInterestPenaltyFlag() {
		return exemptFromInterestPenaltyFlag == null ? Optional.empty() : Optional.of(exemptFromInterestPenaltyFlag);
	}

	public CorporateActionInstructionExtension2 setExemptFromInterestPenaltyFlag(YesNoIndicator exemptFromInterestPenaltyFlag) {
		this.exemptFromInterestPenaltyFlag = exemptFromInterestPenaltyFlag;
		return this;
	}

	public Optional<ISODate> getDeclaredPayableDate() {
		return declaredPayableDate == null ? Optional.empty() : Optional.of(declaredPayableDate);
	}

	public CorporateActionInstructionExtension2 setDeclaredPayableDate(ISODate declaredPayableDate) {
		this.declaredPayableDate = declaredPayableDate;
		return this;
	}

	public Optional<ISODate> getRecordDate() {
		return recordDate == null ? Optional.empty() : Optional.of(recordDate);
	}

	public CorporateActionInstructionExtension2 setRecordDate(ISODate recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public List<ForeignCurrencyPaymentAccountQuantity1> getForeignCurrencyPayment() {
		return foreignCurrencyPayment == null ? foreignCurrencyPayment = new ArrayList<>() : foreignCurrencyPayment;
	}

	public CorporateActionInstructionExtension2 setForeignCurrencyPayment(List<com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1> foreignCurrencyPayment) {
		this.foreignCurrencyPayment = Objects.requireNonNull(foreignCurrencyPayment);
		return this;
	}

	public List<OptionalDividendAccountQuantitySD1> getOptionalDividend() {
		return optionalDividend == null ? optionalDividend = new ArrayList<>() : optionalDividend;
	}

	public CorporateActionInstructionExtension2 setOptionalDividend(List<com.tools20022.repository.msg.OptionalDividendAccountQuantitySD1> optionalDividend) {
		this.optionalDividend = Objects.requireNonNull(optionalDividend);
		return this;
	}

	public List<TaxExemptQuantitySD1> getTaxExempt() {
		return taxExempt == null ? taxExempt = new ArrayList<>() : taxExempt;
	}

	public CorporateActionInstructionExtension2 setTaxExempt(List<com.tools20022.repository.msg.TaxExemptQuantitySD1> taxExempt) {
		this.taxExempt = Objects.requireNonNull(taxExempt);
		return this;
	}

	public List<WireInstructionSD1> getWireInstruction() {
		return wireInstruction == null ? wireInstruction = new ArrayList<>() : wireInstruction;
	}

	public CorporateActionInstructionExtension2 setWireInstruction(List<com.tools20022.repository.msg.WireInstructionSD1> wireInstruction) {
		this.wireInstruction = Objects.requireNonNull(wireInstruction);
		return this;
	}

	public List<DTCTaxReliefSD2> getDTCTaxRelief() {
		return dTCTaxRelief == null ? dTCTaxRelief = new ArrayList<>() : dTCTaxRelief;
	}

	public CorporateActionInstructionExtension2 setDTCTaxRelief(List<com.tools20022.repository.msg.DTCTaxReliefSD2> dTCTaxRelief) {
		this.dTCTaxRelief = Objects.requireNonNull(dTCTaxRelief);
		return this;
	}

	public Optional<ContactIdentification1> getContactPerson() {
		return contactPerson == null ? Optional.empty() : Optional.of(contactPerson);
	}

	public CorporateActionInstructionExtension2 setContactPerson(com.tools20022.repository.msg.ContactIdentification1 contactPerson) {
		this.contactPerson = contactPerson;
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getAdditionalText() {
		return additionalText == null ? Optional.empty() : Optional.of(additionalText);
	}

	public CorporateActionInstructionExtension2 setAdditionalText(RestrictedFINXMax350Text additionalText) {
		this.additionalText = additionalText;
		return this;
	}

	public Optional<CUSIPIdentification1> getContraCUSIP() {
		return contraCUSIP == null ? Optional.empty() : Optional.of(contraCUSIP);
	}

	public CorporateActionInstructionExtension2 setContraCUSIP(com.tools20022.repository.msg.CUSIPIdentification1 contraCUSIP) {
		this.contraCUSIP = contraCUSIP;
		return this;
	}

	public Optional<RestrictedFINDecimalNumber> getConditionalQuantity() {
		return conditionalQuantity == null ? Optional.empty() : Optional.of(conditionalQuantity);
	}

	public CorporateActionInstructionExtension2 setConditionalQuantity(RestrictedFINDecimalNumber conditionalQuantity) {
		this.conditionalQuantity = conditionalQuantity;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getInstructedPrice() {
		return instructedPrice == null ? Optional.empty() : Optional.of(instructedPrice);
	}

	public CorporateActionInstructionExtension2 setInstructedPrice(RestrictedFINActiveCurrencyAnd13DecimalAmount instructedPrice) {
		this.instructedPrice = instructedPrice;
		return this;
	}

	public Optional<Max35Text> getCustomerIdentification() {
		return customerIdentification == null ? Optional.empty() : Optional.of(customerIdentification);
	}

	public CorporateActionInstructionExtension2 setCustomerIdentification(Max35Text customerIdentification) {
		this.customerIdentification = customerIdentification;
		return this;
	}

	public Optional<Max35Text> getCustomerComments() {
		return customerComments == null ? Optional.empty() : Optional.of(customerComments);
	}

	public CorporateActionInstructionExtension2 setCustomerComments(Max35Text customerComments) {
		this.customerComments = customerComments;
		return this;
	}

	public List<USTaxWithholdingSD1> getUSTaxWithholding() {
		return uSTaxWithholding == null ? uSTaxWithholding = new ArrayList<>() : uSTaxWithholding;
	}

	public CorporateActionInstructionExtension2 setUSTaxWithholding(List<com.tools20022.repository.msg.USTaxWithholdingSD1> uSTaxWithholding) {
		this.uSTaxWithholding = Objects.requireNonNull(uSTaxWithholding);
		return this;
	}

	public List<CashInLieuSD1> getCashInLieu() {
		return cashInLieu == null ? cashInLieu = new ArrayList<>() : cashInLieu;
	}

	public CorporateActionInstructionExtension2 setCashInLieu(List<com.tools20022.repository.msg.CashInLieuSD1> cashInLieu) {
		this.cashInLieu = Objects.requireNonNull(cashInLieu);
		return this;
	}
}