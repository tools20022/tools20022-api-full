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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CorporateActionInstructionExtension2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
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
	protected DTCCorporateActionInstructionType2Code instructionType;
	/**
	 * Type of instruction.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "InstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionType";
			definition = "Type of instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCorporateActionInstructionType2Code.mmObject();
		}
	};
	protected DTCServiceType1Code serviceTypeIndicator;
	/**
	 * Type of specific DTC service.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "SvcTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceTypeIndicator";
			definition = "Type of specific DTC service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCServiceType1Code.mmObject();
		}
	};
	protected ExtendedEventType1Code eventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action event type name. Used in place for the events that cannot be
	 * classified by ISO Code and are marked as OTHR. Can be used in combination
	 * with DTCC sub event type (when provided) to identify the event. For an
	 * example: a distribution based on recapitalisation event will be presented
	 * as event type: OTHR in standard message. DTCC native event type would be
	 * Distribution (DIST) and DTCC sub event type would be Recapitalisation.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType1Code.mmObject();
		}
	};
	protected DTCCSubEventType1Code subEventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action sub event type name further defines the event type. For an
	 * example: a cash dividend event with currency election will be noted as
	 * event type: Cash Dividend (DVCA) and DTCC sub event type: Currency
	 * Election(CURR).
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType1Code.mmObject();
		}
	};
	protected Max4AlphaNumericText dTCCOptionType;
	/**
	 * Used for the option types that cannot be classified in ISO and marked as
	 * Option Type: OTHR. Options like convert and dividend reinvestment, or DTC
	 * (The Depository Trust Corporation) special option types for the instances
	 * where the event and security are eligible for DTC (The Depository Trust
	 * Corporation) services like Foreign Tax, Foreign Currency Payments, etc.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "DTCCOptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCOptionType";
			definition = "Used for the option types that cannot be classified in ISO and marked as Option Type: OTHR. Options like convert and dividend reinvestment, or DTC (The Depository Trust Corporation)  special option types for the instances where the event and security are eligible for DTC (The Depository Trust Corporation) services like Foreign Tax, Foreign Currency Payments, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected Max16Text protectIdentification;
	/**
	 * Identifies the protect that was submitted. Required when instruction type
	 * is Cover Protect. This identification is either from DTC system which was
	 * assigned upon the submission of the protect instruction or is an
	 * identification that pertains to a cover protect submitted directly to the
	 * agent (indicated by instruction type).
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Identifies the protect that was submitted. Required when instruction type is Cover Protect. This identification is either from DTC system which was assigned upon the submission of the protect instruction or is an identification that pertains to a cover protect submitted directly to the agent (indicated by instruction type).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected ISODate protectDate;
	/**
	 * Date at which the protect was created.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date at which the protect was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected YesNoIndicator acknowledgementFlag;
	/**
	 * Indicates that submitter has agreed to all terms and conditions.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "AckFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementFlag";
			definition = "Indicates that submitter has agreed to all terms and conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator solicitationDealerFeeFlag;
	/**
	 * Indicates whether there is a solicitation fee on the event. This fee is
	 * paid by the soliciting dealer.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "SlctnDealrFeeFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationDealerFeeFlag";
			definition = "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ConditionAcceptance1> conditionsAcceptance;
	/**
	 * Provides an acceptance flag for the identified conditions.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CondsAccptnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionsAcceptance";
			definition = "Provides an acceptance flag for the identified conditions.";
			maxOccurs = 9;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ConditionAcceptance1.mmObject();
		}
	};
	protected YesNoIndicator oddLotFlag;
	/**
	 * Indicates whether the odd lot is accepted for tender offers.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "OddLotFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotFlag";
			definition = "Indicates whether the odd lot is accepted for tender offers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator exemptFromInterestPenaltyFlag;
	/**
	 * Indicates whether the instruction is exempt from interest penalties.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "XmptFrIntrstPnltyFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptFromInterestPenaltyFlag";
			definition = "Indicates whether the instruction is exempt from interest penalties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODate declaredPayableDate;
	/**
	 * Date at which the movement has been declared payable by the issuer to
	 * take place (cash and/or securities).
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "DclrdPyblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredPayableDate";
			definition = "Date at which the movement has been declared payable by the issuer to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate recordDate;
	/**
	 * Date at which positions are stuck at the end of the day to note which
	 * parties will receive the relevant amount of entitlement, due to be
	 * distributed on payment date. DTC (The Depository Trust Corporation) uses
	 * a reference match. This is why it is extended to general Information.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date at which positions are stuck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date. DTC  (The Depository Trust Corporation) uses a reference match. This is why it is extended to general Information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1> foreignCurrencyPayment;
	/**
	 * Foreign currency payment information.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "FrgnCcyPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPayment";
			definition = "Foreign currency payment information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.OptionalDividendAccountQuantitySD1> optionalDividend;
	/**
	 * Optional dividend payment information.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "OptnlDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividend";
			definition = "Optional dividend payment information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OptionalDividendAccountQuantitySD1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TaxExemptQuantitySD1> taxExempt;
	/**
	 * Tax exempt payment information.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "TaxXmpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExempt";
			definition = "Tax exempt payment information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxExemptQuantitySD1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.WireInstructionSD1> wireInstruction;
	/**
	 * Provides details of the wire payment instruction.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "WireInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WireInstruction";
			definition = "Provides details of the wire payment instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.WireInstructionSD1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DTCTaxReliefSD2> dTCTaxRelief;
	/**
	 * Provides details on DTC (The Depository Trust Corporation) Tax Relief
	 * service instruction.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "DTCTaxRlf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCTaxRelief";
			definition = "Provides details on DTC (The Depository Trust Corporation) Tax Relief service instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DTCTaxReliefSD2.mmObject();
		}
	};
	protected ContactIdentification1 contactPerson;
	/**
	 * Identifies a contact person by a name, a given name and an address.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Identifies a contact person by a name, a given name and an address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
		}
	};
	protected RestrictedFINXMax350Text additionalText;
	/**
	 * Provides additional information or specifies in more detail the content
	 * of a message. This field may only be used when the information to be
	 * transmitted, cannot be coded.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected CUSIPIdentification1 contraCUSIP;
	/**
	 * Provides the CUSIP identification of a security.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "ContraCUSIP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraCUSIP";
			definition = "Provides the CUSIP identification of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CUSIPIdentification1.mmObject();
		}
	};
	protected RestrictedFINDecimalNumber conditionalQuantity;
	/**
	 * Minimum quantity of securities to be accepted (used in the framework of
	 * conditional privilege on election). In case of proration, if this minimum
	 * quantity is not reached then the instruction is void.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CondlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election).\nIn case of proration, if this minimum quantity is not reached then the instruction is void.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINDecimalNumber.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount instructedPrice;
	/**
	 * Price that is submitted. Must fall between max/min price
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "InstdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedPrice";
			definition = "Price that is submitted. Must fall between max/min price";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected Max35Text customerIdentification;
	/**
	 * Customer identification.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CstmrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentification";
			definition = "Customer identification. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text customerComments;
	/**
	 * Free form comments.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CstmrCmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerComments";
			definition = "Free form comments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.USTaxWithholdingSD1> uSTaxWithholding;
	/**
	 * U.S. Tax Withholding elections.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "USTaxWhldg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTaxWithholding";
			definition = "U.S. Tax Withholding elections.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.USTaxWithholdingSD1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashInLieuSD1> cashInLieu;
	/**
	 * Cash In Lieu election instructions.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension2.mmObject();
			isDerived = false;
			xmlTag = "CshInLieu";
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
				messageElement_lazy = () -> Arrays.asList(CorporateActionInstructionExtension2.mmPlaceAndName, CorporateActionInstructionExtension2.mmInstructionType, CorporateActionInstructionExtension2.mmServiceTypeIndicator,
						CorporateActionInstructionExtension2.mmEventType, CorporateActionInstructionExtension2.mmSubEventType, CorporateActionInstructionExtension2.mmDTCCOptionType,
						CorporateActionInstructionExtension2.mmProtectIdentification, CorporateActionInstructionExtension2.mmProtectDate, CorporateActionInstructionExtension2.mmAcknowledgementFlag,
						CorporateActionInstructionExtension2.mmSolicitationDealerFeeFlag, CorporateActionInstructionExtension2.mmConditionsAcceptance, CorporateActionInstructionExtension2.mmOddLotFlag,
						CorporateActionInstructionExtension2.mmExemptFromInterestPenaltyFlag, CorporateActionInstructionExtension2.mmDeclaredPayableDate, CorporateActionInstructionExtension2.mmRecordDate,
						CorporateActionInstructionExtension2.mmForeignCurrencyPayment, CorporateActionInstructionExtension2.mmOptionalDividend, CorporateActionInstructionExtension2.mmTaxExempt,
						CorporateActionInstructionExtension2.mmWireInstruction, CorporateActionInstructionExtension2.mmDTCTaxRelief, CorporateActionInstructionExtension2.mmContactPerson,
						CorporateActionInstructionExtension2.mmAdditionalText, CorporateActionInstructionExtension2.mmContraCUSIP, CorporateActionInstructionExtension2.mmConditionalQuantity,
						CorporateActionInstructionExtension2.mmInstructedPrice, CorporateActionInstructionExtension2.mmCustomerIdentification, CorporateActionInstructionExtension2.mmCustomerComments,
						CorporateActionInstructionExtension2.mmUSTaxWithholding, CorporateActionInstructionExtension2.mmCashInLieu);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public DTCCorporateActionInstructionType2Code getInstructionType() {
		return instructionType;
	}

	public void setInstructionType(DTCCorporateActionInstructionType2Code instructionType) {
		this.instructionType = instructionType;
	}

	public DTCServiceType1Code getServiceTypeIndicator() {
		return serviceTypeIndicator;
	}

	public void setServiceTypeIndicator(DTCServiceType1Code serviceTypeIndicator) {
		this.serviceTypeIndicator = serviceTypeIndicator;
	}

	public ExtendedEventType1Code getEventType() {
		return eventType;
	}

	public void setEventType(ExtendedEventType1Code eventType) {
		this.eventType = eventType;
	}

	public DTCCSubEventType1Code getSubEventType() {
		return subEventType;
	}

	public void setSubEventType(DTCCSubEventType1Code subEventType) {
		this.subEventType = subEventType;
	}

	public Max4AlphaNumericText getDTCCOptionType() {
		return dTCCOptionType;
	}

	public void setDTCCOptionType(Max4AlphaNumericText dTCCOptionType) {
		this.dTCCOptionType = dTCCOptionType;
	}

	public Max16Text getProtectIdentification() {
		return protectIdentification;
	}

	public void setProtectIdentification(Max16Text protectIdentification) {
		this.protectIdentification = protectIdentification;
	}

	public ISODate getProtectDate() {
		return protectDate;
	}

	public void setProtectDate(ISODate protectDate) {
		this.protectDate = protectDate;
	}

	public YesNoIndicator getAcknowledgementFlag() {
		return acknowledgementFlag;
	}

	public void setAcknowledgementFlag(YesNoIndicator acknowledgementFlag) {
		this.acknowledgementFlag = acknowledgementFlag;
	}

	public YesNoIndicator getSolicitationDealerFeeFlag() {
		return solicitationDealerFeeFlag;
	}

	public void setSolicitationDealerFeeFlag(YesNoIndicator solicitationDealerFeeFlag) {
		this.solicitationDealerFeeFlag = solicitationDealerFeeFlag;
	}

	public List<ConditionAcceptance1> getConditionsAcceptance() {
		return conditionsAcceptance;
	}

	public void setConditionsAcceptance(List<com.tools20022.repository.msg.ConditionAcceptance1> conditionsAcceptance) {
		this.conditionsAcceptance = conditionsAcceptance;
	}

	public YesNoIndicator getOddLotFlag() {
		return oddLotFlag;
	}

	public void setOddLotFlag(YesNoIndicator oddLotFlag) {
		this.oddLotFlag = oddLotFlag;
	}

	public YesNoIndicator getExemptFromInterestPenaltyFlag() {
		return exemptFromInterestPenaltyFlag;
	}

	public void setExemptFromInterestPenaltyFlag(YesNoIndicator exemptFromInterestPenaltyFlag) {
		this.exemptFromInterestPenaltyFlag = exemptFromInterestPenaltyFlag;
	}

	public ISODate getDeclaredPayableDate() {
		return declaredPayableDate;
	}

	public void setDeclaredPayableDate(ISODate declaredPayableDate) {
		this.declaredPayableDate = declaredPayableDate;
	}

	public ISODate getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(ISODate recordDate) {
		this.recordDate = recordDate;
	}

	public List<ForeignCurrencyPaymentAccountQuantity1> getForeignCurrencyPayment() {
		return foreignCurrencyPayment;
	}

	public void setForeignCurrencyPayment(List<com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1> foreignCurrencyPayment) {
		this.foreignCurrencyPayment = foreignCurrencyPayment;
	}

	public List<OptionalDividendAccountQuantitySD1> getOptionalDividend() {
		return optionalDividend;
	}

	public void setOptionalDividend(List<com.tools20022.repository.msg.OptionalDividendAccountQuantitySD1> optionalDividend) {
		this.optionalDividend = optionalDividend;
	}

	public List<TaxExemptQuantitySD1> getTaxExempt() {
		return taxExempt;
	}

	public void setTaxExempt(List<com.tools20022.repository.msg.TaxExemptQuantitySD1> taxExempt) {
		this.taxExempt = taxExempt;
	}

	public List<WireInstructionSD1> getWireInstruction() {
		return wireInstruction;
	}

	public void setWireInstruction(List<com.tools20022.repository.msg.WireInstructionSD1> wireInstruction) {
		this.wireInstruction = wireInstruction;
	}

	public List<DTCTaxReliefSD2> getDTCTaxRelief() {
		return dTCTaxRelief;
	}

	public void setDTCTaxRelief(List<com.tools20022.repository.msg.DTCTaxReliefSD2> dTCTaxRelief) {
		this.dTCTaxRelief = dTCTaxRelief;
	}

	public ContactIdentification1 getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(com.tools20022.repository.msg.ContactIdentification1 contactPerson) {
		this.contactPerson = contactPerson;
	}

	public RestrictedFINXMax350Text getAdditionalText() {
		return additionalText;
	}

	public void setAdditionalText(RestrictedFINXMax350Text additionalText) {
		this.additionalText = additionalText;
	}

	public CUSIPIdentification1 getContraCUSIP() {
		return contraCUSIP;
	}

	public void setContraCUSIP(com.tools20022.repository.msg.CUSIPIdentification1 contraCUSIP) {
		this.contraCUSIP = contraCUSIP;
	}

	public RestrictedFINDecimalNumber getConditionalQuantity() {
		return conditionalQuantity;
	}

	public void setConditionalQuantity(RestrictedFINDecimalNumber conditionalQuantity) {
		this.conditionalQuantity = conditionalQuantity;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getInstructedPrice() {
		return instructedPrice;
	}

	public void setInstructedPrice(RestrictedFINActiveCurrencyAnd13DecimalAmount instructedPrice) {
		this.instructedPrice = instructedPrice;
	}

	public Max35Text getCustomerIdentification() {
		return customerIdentification;
	}

	public void setCustomerIdentification(Max35Text customerIdentification) {
		this.customerIdentification = customerIdentification;
	}

	public Max35Text getCustomerComments() {
		return customerComments;
	}

	public void setCustomerComments(Max35Text customerComments) {
		this.customerComments = customerComments;
	}

	public List<USTaxWithholdingSD1> getUSTaxWithholding() {
		return uSTaxWithholding;
	}

	public void setUSTaxWithholding(List<com.tools20022.repository.msg.USTaxWithholdingSD1> uSTaxWithholding) {
		this.uSTaxWithholding = uSTaxWithholding;
	}

	public List<CashInLieuSD1> getCashInLieu() {
		return cashInLieu;
	}

	public void setCashInLieu(List<com.tools20022.repository.msg.CashInLieuSD1> cashInLieu) {
		this.cashInLieu = cashInLieu;
	}
}