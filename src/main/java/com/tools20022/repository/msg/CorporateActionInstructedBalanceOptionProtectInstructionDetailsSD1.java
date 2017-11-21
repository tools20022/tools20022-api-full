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
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.OptionNumber1Choice;
import com.tools20022.repository.choice.PriceFormat57Choice;
import com.tools20022.repository.codeset.DTCProtectInstructionStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action instructed balance
 * details at option protect level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmPlaceAndName
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentification
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectSequenceNumber
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmOptionNumber
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectDate
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmCoverProtectDate
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmCoverProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentificationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationUncoveredQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentificationUncoveredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentificationOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationStatus
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectConditionalQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectTenderBidPrice
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectTenderBidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmCustomerReferenceIdentification
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmCustomerReferenceIdentification}</li>
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
 * "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instructed balance details at option protect level."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1", propOrder = {"placeAndName", "protectIdentification", "protectSequenceNumber", "optionNumber", "protectDate", "coverProtectDate",
		"protectIdentificationQuantity", "protectIdentificationUncoveredQuantity", "protectIdentificationOversubscriptionQuantity", "protectIdentificationStatus", "protectConditionalQuantity", "protectTenderBidPrice",
		"customerReferenceIdentification"})
public class CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
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
	protected Max15Text protectIdentification;
	/**
	 * Instruction reference number assigned by DTC to the uncovered protect
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
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
	 * "Instruction reference number assigned by DTC to the uncovered protect instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Instruction reference number assigned by DTC to the uncovered protect instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
		}
	};
	protected Max3NumericText protectSequenceNumber;
	/**
	 * Additional Reference number used to uniquely identify uncovered protect
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional Reference number used to uniquely identify uncovered protect instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectSequenceNumber";
			definition = "Additional Reference number used to uniquely identify uncovered protect instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected OptionNumber1Choice optionNumber;
	/**
	 * Option number of the protect instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionNumber1Choice
	 * OptionNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option number of the protect instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Option number of the protect instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}
	};
	protected ISODateTime protectDate;
	/**
	 * Date and time of the protect instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
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
	 * definition} = "Date and time of the protect instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date and time of the protect instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime coverProtectDate;
	/**
	 * Date and time of the cover protect. Will be the latest cover date if
	 * partial cover transaction occurs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverPrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the cover protect.  Will be the latest cover date if partial cover transaction occurs."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCoverProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CoverPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectDate";
			definition = "Date and time of the cover protect.  Will be the latest cover date if partial cover transaction occurs.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice protectIdentificationQuantity;
	/**
	 * Quantity of the protect instruction. For protects which are partially
	 * covered, the quanitity will be reduced by the amount partially covered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the protect instruction.  For protects which are partially covered, the quanitity will be reduced by the amount partially covered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectIdentificationQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationQuantity";
			definition = "Quantity of the protect instruction.  For protects which are partially covered, the quanitity will be reduced by the amount partially covered.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice protectIdentificationUncoveredQuantity;
	/**
	 * Quantity of the Protect instruction which has not been covered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdUcvrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationUncoveredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the Protect instruction which has not been covered."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectIdentificationUncoveredQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdUcvrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationUncoveredQuantity";
			definition = "Quantity of the Protect instruction which has not been covered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice protectIdentificationOversubscriptionQuantity;
	/**
	 * Protect oversubscription quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect oversubscription quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectIdentificationOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationOversubscriptionQuantity";
			definition = "Protect oversubscription quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected DTCProtectInstructionStatus1Code protectIdentificationStatus;
	/**
	 * Status of the Protect Instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCProtectInstructionStatus1Code
	 * DTCProtectInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the Protect Instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectIdentificationStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationStatus";
			definition = "Status of the Protect Instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCProtectInstructionStatus1Code.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice protectConditionalQuantity;
	/**
	 * Conditional Quantity for the Protect Instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctCondlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional Quantity for the Protect Instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectConditionalQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctCondlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectConditionalQuantity";
			definition = "Conditional Quantity for the Protect Instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected PriceFormat57Choice protectTenderBidPrice;
	/**
	 * Tender bid price of the protect instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat57Choice
	 * PriceFormat57Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctTndrBidPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectTenderBidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender bid price of the protect instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectTenderBidPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctTndrBidPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectTenderBidPrice";
			definition = "Tender bid price of the protect instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat57Choice.mmObject();
		}
	};
	protected Max15Text customerReferenceIdentification;
	/**
	 * Customer identification entered by client upon instruction submission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer identification entered by client upon instruction submission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmPlaceAndName, CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentification,
						CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectSequenceNumber, CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmOptionNumber,
						CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectDate, CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmCoverProtectDate,
						CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationQuantity, CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationUncoveredQuantity,
						CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationOversubscriptionQuantity, CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationStatus,
						CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectConditionalQuantity, CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectTenderBidPrice,
						CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmCustomerReferenceIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1";
				definition = "Provides additional information regarding corporate action instructed balance details at option protect level.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "PrtctId", required = true)
	public Max15Text getProtectIdentification() {
		return protectIdentification;
	}

	public void setProtectIdentification(Max15Text protectIdentification) {
		this.protectIdentification = protectIdentification;
	}

	@XmlElement(name = "PrtctSeqNb")
	public Max3NumericText getProtectSequenceNumber() {
		return protectSequenceNumber;
	}

	public void setProtectSequenceNumber(Max3NumericText protectSequenceNumber) {
		this.protectSequenceNumber = protectSequenceNumber;
	}

	@XmlElement(name = "OptnNb", required = true)
	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = optionNumber;
	}

	@XmlElement(name = "PrtctDt", required = true)
	public ISODateTime getProtectDate() {
		return protectDate;
	}

	public void setProtectDate(ISODateTime protectDate) {
		this.protectDate = protectDate;
	}

	@XmlElement(name = "CoverPrtctDt")
	public ISODateTime getCoverProtectDate() {
		return coverProtectDate;
	}

	public void setCoverProtectDate(ISODateTime coverProtectDate) {
		this.coverProtectDate = coverProtectDate;
	}

	@XmlElement(name = "PrtctIdQty", required = true)
	public FinancialInstrumentQuantity15Choice getProtectIdentificationQuantity() {
		return protectIdentificationQuantity;
	}

	public void setProtectIdentificationQuantity(FinancialInstrumentQuantity15Choice protectIdentificationQuantity) {
		this.protectIdentificationQuantity = protectIdentificationQuantity;
	}

	@XmlElement(name = "PrtctIdUcvrdQty")
	public FinancialInstrumentQuantity15Choice getProtectIdentificationUncoveredQuantity() {
		return protectIdentificationUncoveredQuantity;
	}

	public void setProtectIdentificationUncoveredQuantity(FinancialInstrumentQuantity15Choice protectIdentificationUncoveredQuantity) {
		this.protectIdentificationUncoveredQuantity = protectIdentificationUncoveredQuantity;
	}

	@XmlElement(name = "PrtctIdOvrsbcptQty")
	public FinancialInstrumentQuantity15Choice getProtectIdentificationOversubscriptionQuantity() {
		return protectIdentificationOversubscriptionQuantity;
	}

	public void setProtectIdentificationOversubscriptionQuantity(FinancialInstrumentQuantity15Choice protectIdentificationOversubscriptionQuantity) {
		this.protectIdentificationOversubscriptionQuantity = protectIdentificationOversubscriptionQuantity;
	}

	@XmlElement(name = "PrtctIdSts")
	public DTCProtectInstructionStatus1Code getProtectIdentificationStatus() {
		return protectIdentificationStatus;
	}

	public void setProtectIdentificationStatus(DTCProtectInstructionStatus1Code protectIdentificationStatus) {
		this.protectIdentificationStatus = protectIdentificationStatus;
	}

	@XmlElement(name = "PrtctCondlQty")
	public FinancialInstrumentQuantity15Choice getProtectConditionalQuantity() {
		return protectConditionalQuantity;
	}

	public void setProtectConditionalQuantity(FinancialInstrumentQuantity15Choice protectConditionalQuantity) {
		this.protectConditionalQuantity = protectConditionalQuantity;
	}

	@XmlElement(name = "PrtctTndrBidPric")
	public PriceFormat57Choice getProtectTenderBidPrice() {
		return protectTenderBidPrice;
	}

	public void setProtectTenderBidPrice(PriceFormat57Choice protectTenderBidPrice) {
		this.protectTenderBidPrice = protectTenderBidPrice;
	}

	@XmlElement(name = "CstmrRefId")
	public Max15Text getCustomerReferenceIdentification() {
		return customerReferenceIdentification;
	}

	public void setCustomerReferenceIdentification(Max15Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
	}
}