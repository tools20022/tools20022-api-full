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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CorporateActionMovementDetailsExtension1 {

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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
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
	protected ISODate dTCPositionCaptureDate;
	/**
	 * Date when DTC positions are captured and entitlements are calculated in
	 * the system at DTC (The Depository Trust Corporation).
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPosCaptrDt"</li>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCPosCaptrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPositionCaptureDate";
			definition = "Date when DTC positions are captured and entitlements are calculated in the system at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate depositDate;
	/**
	 * Date at which the reorganisation deposit was made.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstDt"</li>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DpstDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositDate";
			definition = "Date at which the reorganisation deposit was made.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max16Text dTCGeneratedDepositReferenceIdentification;
	/**
	 * Unique identification issued by DTC (The Depository Trust Corporation)
	 * for reorganisation deposit.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCGnrtdDpstRefId"</li>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCGnrtdDpstRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCGeneratedDepositReferenceIdentification";
			definition = "Unique identification issued by DTC (The Depository Trust Corporation) for reorganisation deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max16Text participantDepositReferenceIdentification;
	/**
	 * Unique identifier issued by a participant for the reorganisation deposit.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptDpstRefId"</li>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PtcptDpstRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantDepositReferenceIdentification";
			definition = "Unique identifier issued by a participant for the reorganisation deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max16Text participantCrossReferenceIdentification;
	/**
	 * Transaction identification that the participant provides on the
	 * reorganisation deposit.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptCrossRefId"</li>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PtcptCrossRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantCrossReferenceIdentification";
			definition = "Transaction identification that the participant provides on the reorganisation deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max35Text custodyCustomerIdentification;
	/**
	 * Participant generated account number for custody deposits.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementDetailsExtension1
	 * CorporateActionMovementDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdyCstmrId"</li>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "CtdyCstmrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyCustomerIdentification";
			definition = "Participant generated account number for custody deposits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max8Text contraParticipantNumber;
	/**
	 * Transaction contra participant identification when shares are distributed
	 * to another participant.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed to another participant.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	protected Exact3NumericText payoutNumber;
	/**
	 * Unique number associated with a payout within an option.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PyoutNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutNumber";
			definition = "Unique number associated with a payout within an option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected DecimalNumber dTCSecurityRate;
	/**
	 * Rate of the dividend payable in stock rather than in cash at DTC (The
	 * Depository Trust Corporation).
	 * <p>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCSctyRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCSecurityRate";
			definition = "Rate of the dividend payable in stock rather than in cash at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber projectedCashValue;
	/**
	 * Projected cash value based on entitlement.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PrjctdCshVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProjectedCashValue";
			definition = "Projected cash value based on entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber dTCCashRate;
	/**
	 * Rate of the dividend payable in cash at DTC (The Depository Trust
	 * Corporation).
	 * <p>
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
			componentContext_lazy = () -> CorporateActionMovementDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCCshRate";
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
				messageElement_lazy = () -> Arrays.asList(CorporateActionMovementDetailsExtension1.mmPlaceAndName, CorporateActionMovementDetailsExtension1.mmDTCCOptionType,
						CorporateActionMovementDetailsExtension1.mmDTCPositionCaptureDate, CorporateActionMovementDetailsExtension1.mmDepositDate, CorporateActionMovementDetailsExtension1.mmDTCGeneratedDepositReferenceIdentification,
						CorporateActionMovementDetailsExtension1.mmParticipantDepositReferenceIdentification, CorporateActionMovementDetailsExtension1.mmParticipantCrossReferenceIdentification,
						CorporateActionMovementDetailsExtension1.mmCustodyCustomerIdentification, CorporateActionMovementDetailsExtension1.mmContraParticipantNumber, CorporateActionMovementDetailsExtension1.mmPayoutNumber,
						CorporateActionMovementDetailsExtension1.mmDTCSecurityRate, CorporateActionMovementDetailsExtension1.mmProjectedCashValue, CorporateActionMovementDetailsExtension1.mmDTCCashRate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public Max4AlphaNumericText getDTCCOptionType() {
		return dTCCOptionType;
	}

	public void setDTCCOptionType(Max4AlphaNumericText dTCCOptionType) {
		this.dTCCOptionType = dTCCOptionType;
	}

	public ISODate getDTCPositionCaptureDate() {
		return dTCPositionCaptureDate;
	}

	public void setDTCPositionCaptureDate(ISODate dTCPositionCaptureDate) {
		this.dTCPositionCaptureDate = dTCPositionCaptureDate;
	}

	public ISODate getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(ISODate depositDate) {
		this.depositDate = depositDate;
	}

	public Max16Text getDTCGeneratedDepositReferenceIdentification() {
		return dTCGeneratedDepositReferenceIdentification;
	}

	public void setDTCGeneratedDepositReferenceIdentification(Max16Text dTCGeneratedDepositReferenceIdentification) {
		this.dTCGeneratedDepositReferenceIdentification = dTCGeneratedDepositReferenceIdentification;
	}

	public Max16Text getParticipantDepositReferenceIdentification() {
		return participantDepositReferenceIdentification;
	}

	public void setParticipantDepositReferenceIdentification(Max16Text participantDepositReferenceIdentification) {
		this.participantDepositReferenceIdentification = participantDepositReferenceIdentification;
	}

	public Max16Text getParticipantCrossReferenceIdentification() {
		return participantCrossReferenceIdentification;
	}

	public void setParticipantCrossReferenceIdentification(Max16Text participantCrossReferenceIdentification) {
		this.participantCrossReferenceIdentification = participantCrossReferenceIdentification;
	}

	public Max35Text getCustodyCustomerIdentification() {
		return custodyCustomerIdentification;
	}

	public void setCustodyCustomerIdentification(Max35Text custodyCustomerIdentification) {
		this.custodyCustomerIdentification = custodyCustomerIdentification;
	}

	public Max8Text getContraParticipantNumber() {
		return contraParticipantNumber;
	}

	public void setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
	}

	public Exact3NumericText getPayoutNumber() {
		return payoutNumber;
	}

	public void setPayoutNumber(Exact3NumericText payoutNumber) {
		this.payoutNumber = payoutNumber;
	}

	public DecimalNumber getDTCSecurityRate() {
		return dTCSecurityRate;
	}

	public void setDTCSecurityRate(DecimalNumber dTCSecurityRate) {
		this.dTCSecurityRate = dTCSecurityRate;
	}

	public DecimalNumber getProjectedCashValue() {
		return projectedCashValue;
	}

	public void setProjectedCashValue(DecimalNumber projectedCashValue) {
		this.projectedCashValue = projectedCashValue;
	}

	public DecimalNumber getDTCCashRate() {
		return dTCCashRate;
	}

	public void setDTCCashRate(DecimalNumber dTCCashRate) {
		this.dTCCashRate = dTCCashRate;
	}
}