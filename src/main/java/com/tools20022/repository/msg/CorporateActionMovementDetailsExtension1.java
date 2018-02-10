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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmPlaceAndName
 * CorporateActionMovementDetailsExtension1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmDTCCOptionType
 * CorporateActionMovementDetailsExtension1.mmDTCCOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmDTCPositionCaptureDate
 * CorporateActionMovementDetailsExtension1.mmDTCPositionCaptureDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmDepositDate
 * CorporateActionMovementDetailsExtension1.mmDepositDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmDTCGeneratedDepositReferenceIdentification
 * CorporateActionMovementDetailsExtension1.
 * mmDTCGeneratedDepositReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmParticipantDepositReferenceIdentification
 * CorporateActionMovementDetailsExtension1.
 * mmParticipantDepositReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmParticipantCrossReferenceIdentification
 * CorporateActionMovementDetailsExtension1.
 * mmParticipantCrossReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmCustodyCustomerIdentification
 * CorporateActionMovementDetailsExtension1.mmCustodyCustomerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmContraParticipantNumber
 * CorporateActionMovementDetailsExtension1.mmContraParticipantNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmPayoutNumber
 * CorporateActionMovementDetailsExtension1.mmPayoutNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmDTCSecurityRate
 * CorporateActionMovementDetailsExtension1.mmDTCSecurityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmProjectedCashValue
 * CorporateActionMovementDetailsExtension1.mmProjectedCashValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1#mmDTCCashRate
 * CorporateActionMovementDetailsExtension1.mmDTCCashRate}</li>
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
 * "CorporateActionMovementDetailsExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action movement details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementDetailsExtension1", propOrder = {"placeAndName", "dTCCOptionType", "dTCPositionCaptureDate", "depositDate", "dTCGeneratedDepositReferenceIdentification", "participantDepositReferenceIdentification",
		"participantCrossReferenceIdentification", "custodyCustomerIdentification", "contraParticipantNumber", "payoutNumber", "dTCSecurityRate", "projectedCashValue", "dTCCashRate"})
public class CorporateActionMovementDetailsExtension1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
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
	@XmlElement(name = "DTCPosCaptrDt")
	protected ISODate dTCPositionCaptureDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPosCaptrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Position Capture Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPositionCaptureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when DTC positions are captured and entitlements are calculated in the system at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPositionCaptureDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCPosCaptrDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Position Capture Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPositionCaptureDate";
			definition = "Date when DTC positions are captured and entitlements are calculated in the system at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "DpstDt")
	protected ISODate depositDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Deposit Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the reorganisation deposit was made."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepositDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DpstDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Deposit Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositDate";
			definition = "Date at which the reorganisation deposit was made.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "DTCGnrtdDpstRefId")
	protected Max16Text dTCGeneratedDepositReferenceIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCGnrtdDpstRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Generated Deposit Reference
	 * Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCGeneratedDepositReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification issued by DTC (The Depository Trust Corporation) for reorganisation deposit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCGeneratedDepositReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCGnrtdDpstRefId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Generated Deposit Reference Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCGeneratedDepositReferenceIdentification";
			definition = "Unique identification issued by DTC (The Depository Trust Corporation) for reorganisation deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	@XmlElement(name = "PtcptDpstRefId")
	protected Max16Text participantDepositReferenceIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptDpstRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Participant Deposit Reference
	 * Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantDepositReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier issued by a participant for the reorganisation deposit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParticipantDepositReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PtcptDpstRefId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Participant Deposit Reference Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantDepositReferenceIdentification";
			definition = "Unique identifier issued by a participant for the reorganisation deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	@XmlElement(name = "PtcptCrossRefId")
	protected Max16Text participantCrossReferenceIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptCrossRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Participant Cross Reference Identification
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantCrossReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction identification that the participant provides on the reorganisation deposit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParticipantCrossReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PtcptCrossRefId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Participant Cross Reference Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantCrossReferenceIdentification";
			definition = "Transaction identification that the participant provides on the reorganisation deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	@XmlElement(name = "CtdyCstmrId")
	protected Max35Text custodyCustomerIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdyCstmrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Custody Customer Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyCustomerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participant generated account number for custody deposits."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustodyCustomerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "CtdyCstmrId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Custody Customer Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyCustomerIdentification";
			definition = "Participant generated account number for custody deposits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ContraPtcptNb")
	protected Max8Text contraParticipantNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ContraPtcptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Contra Participant Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraParticipantNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction contra participant identification when shares are distributed to another participant."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContraParticipantNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed to another participant.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	@XmlElement(name = "PyoutNb", required = true)
	protected Exact3NumericText payoutNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique number associated with a payout within an option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayoutNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PyoutNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutNumber";
			definition = "Unique number associated with a payout within an option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	@XmlElement(name = "DTCSctyRate")
	protected DecimalNumber dTCSecurityRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCSctyRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Security Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCSecurityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the dividend payable in stock rather than in cash at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCSecurityRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCSctyRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Security Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCSecurityRate";
			definition = "Rate of the dividend payable in stock rather than in cash at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "PrjctdCshVal")
	protected DecimalNumber projectedCashValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrjctdCshVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Projected Cash Value</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProjectedCashValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Projected cash value based on entitlement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProjectedCashValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PrjctdCshVal";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Projected Cash Value"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProjectedCashValue";
			definition = "Projected cash value based on entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "DTCCshRate")
	protected DecimalNumber dTCCashRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCCshRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Cash Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCashRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the dividend payable in cash at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCCashRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCCshRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Cash Rate "));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCashRate";
			definition = "Rate of the dividend payable in cash at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmDTCCOptionType,
						com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmDTCPositionCaptureDate, com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmDepositDate,
						com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmDTCGeneratedDepositReferenceIdentification,
						com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmParticipantDepositReferenceIdentification,
						com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmParticipantCrossReferenceIdentification,
						com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmCustodyCustomerIdentification, com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmContraParticipantNumber,
						com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmPayoutNumber, com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmDTCSecurityRate,
						com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmProjectedCashValue, com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1.mmDTCCashRate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionMovementDetailsExtension1";
				definition = "Provides additional information regarding corporate action movement details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionMovementDetailsExtension1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<Max4AlphaNumericText> getDTCCOptionType() {
		return dTCCOptionType == null ? Optional.empty() : Optional.of(dTCCOptionType);
	}

	public CorporateActionMovementDetailsExtension1 setDTCCOptionType(Max4AlphaNumericText dTCCOptionType) {
		this.dTCCOptionType = dTCCOptionType;
		return this;
	}

	public Optional<ISODate> getDTCPositionCaptureDate() {
		return dTCPositionCaptureDate == null ? Optional.empty() : Optional.of(dTCPositionCaptureDate);
	}

	public CorporateActionMovementDetailsExtension1 setDTCPositionCaptureDate(ISODate dTCPositionCaptureDate) {
		this.dTCPositionCaptureDate = dTCPositionCaptureDate;
		return this;
	}

	public Optional<ISODate> getDepositDate() {
		return depositDate == null ? Optional.empty() : Optional.of(depositDate);
	}

	public CorporateActionMovementDetailsExtension1 setDepositDate(ISODate depositDate) {
		this.depositDate = depositDate;
		return this;
	}

	public Optional<Max16Text> getDTCGeneratedDepositReferenceIdentification() {
		return dTCGeneratedDepositReferenceIdentification == null ? Optional.empty() : Optional.of(dTCGeneratedDepositReferenceIdentification);
	}

	public CorporateActionMovementDetailsExtension1 setDTCGeneratedDepositReferenceIdentification(Max16Text dTCGeneratedDepositReferenceIdentification) {
		this.dTCGeneratedDepositReferenceIdentification = dTCGeneratedDepositReferenceIdentification;
		return this;
	}

	public Optional<Max16Text> getParticipantDepositReferenceIdentification() {
		return participantDepositReferenceIdentification == null ? Optional.empty() : Optional.of(participantDepositReferenceIdentification);
	}

	public CorporateActionMovementDetailsExtension1 setParticipantDepositReferenceIdentification(Max16Text participantDepositReferenceIdentification) {
		this.participantDepositReferenceIdentification = participantDepositReferenceIdentification;
		return this;
	}

	public Optional<Max16Text> getParticipantCrossReferenceIdentification() {
		return participantCrossReferenceIdentification == null ? Optional.empty() : Optional.of(participantCrossReferenceIdentification);
	}

	public CorporateActionMovementDetailsExtension1 setParticipantCrossReferenceIdentification(Max16Text participantCrossReferenceIdentification) {
		this.participantCrossReferenceIdentification = participantCrossReferenceIdentification;
		return this;
	}

	public Optional<Max35Text> getCustodyCustomerIdentification() {
		return custodyCustomerIdentification == null ? Optional.empty() : Optional.of(custodyCustomerIdentification);
	}

	public CorporateActionMovementDetailsExtension1 setCustodyCustomerIdentification(Max35Text custodyCustomerIdentification) {
		this.custodyCustomerIdentification = custodyCustomerIdentification;
		return this;
	}

	public Optional<Max8Text> getContraParticipantNumber() {
		return contraParticipantNumber == null ? Optional.empty() : Optional.of(contraParticipantNumber);
	}

	public CorporateActionMovementDetailsExtension1 setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
		return this;
	}

	public Exact3NumericText getPayoutNumber() {
		return payoutNumber;
	}

	public CorporateActionMovementDetailsExtension1 setPayoutNumber(Exact3NumericText payoutNumber) {
		this.payoutNumber = Objects.requireNonNull(payoutNumber);
		return this;
	}

	public Optional<DecimalNumber> getDTCSecurityRate() {
		return dTCSecurityRate == null ? Optional.empty() : Optional.of(dTCSecurityRate);
	}

	public CorporateActionMovementDetailsExtension1 setDTCSecurityRate(DecimalNumber dTCSecurityRate) {
		this.dTCSecurityRate = dTCSecurityRate;
		return this;
	}

	public Optional<DecimalNumber> getProjectedCashValue() {
		return projectedCashValue == null ? Optional.empty() : Optional.of(projectedCashValue);
	}

	public CorporateActionMovementDetailsExtension1 setProjectedCashValue(DecimalNumber projectedCashValue) {
		this.projectedCashValue = projectedCashValue;
		return this;
	}

	public Optional<DecimalNumber> getDTCCashRate() {
		return dTCCashRate == null ? Optional.empty() : Optional.of(dTCCashRate);
	}

	public CorporateActionMovementDetailsExtension1 setDTCCashRate(DecimalNumber dTCCashRate) {
		this.dTCCashRate = dTCCashRate;
		return this;
	}
}