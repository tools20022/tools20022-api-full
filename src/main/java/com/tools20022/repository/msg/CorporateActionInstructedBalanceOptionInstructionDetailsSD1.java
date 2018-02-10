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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.OptionNumber1Choice;
import com.tools20022.repository.choice.PriceFormat57Choice;
import com.tools20022.repository.codeset.DTCInstructionStatus2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.entity.CorporateActionOption;
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
 * Provides additional information regarding corporate action instructed balance
 * details at option level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmPlaceAndName
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmOptionNumber
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentification
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionSequenceNumber
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationDate
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionIdentificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionContraCUSIP
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionContraCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationQuantity
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionIdentificationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionIdentificationOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationStatus
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionIdentificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationProtectDate
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionIdentificationProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationCoverProtectDate
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionIdentificationCoverProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionConditionalQuantity
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionTenderBidPrice
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmTransactionTenderBidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmCustomerReferenceIdentification
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
 * mmCustomerReferenceIdentification}</li>
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
 * "CorporateActionInstructedBalanceOptionInstructionDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instructed balance details at option level."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructedBalanceOptionInstructionDetailsSD1", propOrder = {"placeAndName", "optionNumber", "transactionIdentification", "transactionSequenceNumber", "transactionIdentificationDate",
		"transactionContraCUSIP", "transactionIdentificationQuantity", "transactionIdentificationOversubscriptionQuantity", "transactionIdentificationStatus", "transactionIdentificationProtectDate",
		"transactionIdentificationCoverProtectDate", "transactionConditionalQuantity", "transactionTenderBidPrice", "customerReferenceIdentification"})
public class CorporateActionInstructedBalanceOptionInstructionDetailsSD1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmPlaceAndName
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "OptnNb", required = true)
	protected OptionNumber1Choice optionNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmOptionNumber
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmOptionNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmOptionNumber);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}
	};
	@XmlElement(name = "TxId", required = true)
	protected Max15Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number assigned by the Depository. Transaction identification will be either the DTC Instruction Reference Number for reorganisation instructions (VOI) or the DAM Reference Number for custody / reorganisation deposits."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentification
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique number assigned by the Depository. Transaction identification will be either the DTC Instruction Reference Number for reorganisation instructions (VOI) or the DAM Reference Number for custody / reorganisation deposits.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
		}
	};
	@XmlElement(name = "TxSeqNb")
	protected Max3NumericText transactionSequenceNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number which further identifies DTC intsruction reference number. Not applicable to reorganisation / custody deposits."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionSequenceNumber
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumber";
			definition = "Number which further identifies DTC intsruction reference number. Not applicable to reorganisation / custody deposits.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "TxIdDt", required = true)
	protected ISODateTime transactionIdentificationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationDate
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionIdentificationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDate";
			definition = "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "TxContraCUSIP")
	protected OtherIdentification2 transactionContraCUSIP;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification2
	 * OtherIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxContraCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionContraCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contra CUSIP Identification of the option instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionContraCUSIP
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionContraCUSIP}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionContraCUSIP = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxContraCUSIP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionContraCUSIP";
			definition = "Contra CUSIP Identification of the option instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionContraCUSIP);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherIdentification2.mmObject();
		}
	};
	@XmlElement(name = "TxIdQty", required = true)
	protected FinancialInstrumentQuantity15Choice transactionIdentificationQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationQuantity
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionIdentificationQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentificationQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationQuantity";
			definition = "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "TxIdOvrsbcptQty")
	protected FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity relating only to the oversubscription."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationOversubscriptionQuantity
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionIdentificationOversubscriptionQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentificationOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationOversubscriptionQuantity";
			definition = "Quantity relating only to the oversubscription.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationOversubscriptionQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "TxIdSts", required = true)
	protected DTCInstructionStatus2Code transactionIdentificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationStatus
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionIdentificationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationStatus";
			definition = "Status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCInstructionStatus2Code.mmObject();
		}
	};
	@XmlElement(name = "TxIdPrtctDt")
	protected ISODateTime transactionIdentificationProtectDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdPrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the protect instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationProtectDate
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionIdentificationProtectDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationProtectDate";
			definition = "Date and time of the protect instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationProtectDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "TxIdCoverPrtctDt")
	protected ISODateTime transactionIdentificationCoverProtectDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdCoverPrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationCoverProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the cover protect."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationCoverProtectDate
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionIdentificationCoverProtectDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationCoverProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdCoverPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationCoverProtectDate";
			definition = "Date and time of the cover protect.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationCoverProtectDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "TxCondlQty")
	protected FinancialInstrumentQuantity15Choice transactionConditionalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCondlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional quantity on the instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionConditionalQuantity
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionConditionalQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionConditionalQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxCondlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionConditionalQuantity";
			definition = "Conditional quantity on the instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionConditionalQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "TxTndrBidPric")
	protected PriceFormat57Choice transactionTenderBidPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat57Choice
	 * PriceFormat57Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTndrBidPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTenderBidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender bid price of the instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionTenderBidPrice
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmTransactionTenderBidPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionTenderBidPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxTndrBidPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTenderBidPrice";
			definition = "Tender bid price of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionTenderBidPrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat57Choice.mmObject();
		}
	};
	@XmlElement(name = "CstmrRefId")
	protected Max15Text customerReferenceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmCustomerReferenceIdentification
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmCustomerReferenceIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmCustomerReferenceIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmOptionNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentification,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionSequenceNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionContraCUSIP,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationOversubscriptionQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationStatus,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationCoverProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionConditionalQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionTenderBidPrice,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmCustomerReferenceIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructedBalanceOptionInstructionDetailsSD1";
				definition = "Provides additional information regarding corporate action instructed balance details at option level.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public Max15Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionIdentification(Max15Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Max3NumericText> getTransactionSequenceNumber() {
		return transactionSequenceNumber == null ? Optional.empty() : Optional.of(transactionSequenceNumber);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionSequenceNumber(Max3NumericText transactionSequenceNumber) {
		this.transactionSequenceNumber = transactionSequenceNumber;
		return this;
	}

	public ISODateTime getTransactionIdentificationDate() {
		return transactionIdentificationDate;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionIdentificationDate(ISODateTime transactionIdentificationDate) {
		this.transactionIdentificationDate = Objects.requireNonNull(transactionIdentificationDate);
		return this;
	}

	public Optional<OtherIdentification2> getTransactionContraCUSIP() {
		return transactionContraCUSIP == null ? Optional.empty() : Optional.of(transactionContraCUSIP);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionContraCUSIP(com.tools20022.repository.msg.OtherIdentification2 transactionContraCUSIP) {
		this.transactionContraCUSIP = transactionContraCUSIP;
		return this;
	}

	public FinancialInstrumentQuantity15Choice getTransactionIdentificationQuantity() {
		return transactionIdentificationQuantity;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionIdentificationQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationQuantity) {
		this.transactionIdentificationQuantity = Objects.requireNonNull(transactionIdentificationQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getTransactionIdentificationOversubscriptionQuantity() {
		return transactionIdentificationOversubscriptionQuantity == null ? Optional.empty() : Optional.of(transactionIdentificationOversubscriptionQuantity);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionIdentificationOversubscriptionQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity) {
		this.transactionIdentificationOversubscriptionQuantity = transactionIdentificationOversubscriptionQuantity;
		return this;
	}

	public DTCInstructionStatus2Code getTransactionIdentificationStatus() {
		return transactionIdentificationStatus;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionIdentificationStatus(DTCInstructionStatus2Code transactionIdentificationStatus) {
		this.transactionIdentificationStatus = Objects.requireNonNull(transactionIdentificationStatus);
		return this;
	}

	public Optional<ISODateTime> getTransactionIdentificationProtectDate() {
		return transactionIdentificationProtectDate == null ? Optional.empty() : Optional.of(transactionIdentificationProtectDate);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionIdentificationProtectDate(ISODateTime transactionIdentificationProtectDate) {
		this.transactionIdentificationProtectDate = transactionIdentificationProtectDate;
		return this;
	}

	public Optional<ISODateTime> getTransactionIdentificationCoverProtectDate() {
		return transactionIdentificationCoverProtectDate == null ? Optional.empty() : Optional.of(transactionIdentificationCoverProtectDate);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionIdentificationCoverProtectDate(ISODateTime transactionIdentificationCoverProtectDate) {
		this.transactionIdentificationCoverProtectDate = transactionIdentificationCoverProtectDate;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getTransactionConditionalQuantity() {
		return transactionConditionalQuantity == null ? Optional.empty() : Optional.of(transactionConditionalQuantity);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionConditionalQuantity(FinancialInstrumentQuantity15Choice transactionConditionalQuantity) {
		this.transactionConditionalQuantity = transactionConditionalQuantity;
		return this;
	}

	public Optional<PriceFormat57Choice> getTransactionTenderBidPrice() {
		return transactionTenderBidPrice == null ? Optional.empty() : Optional.of(transactionTenderBidPrice);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setTransactionTenderBidPrice(PriceFormat57Choice transactionTenderBidPrice) {
		this.transactionTenderBidPrice = transactionTenderBidPrice;
		return this;
	}

	public Optional<Max15Text> getCustomerReferenceIdentification() {
		return customerReferenceIdentification == null ? Optional.empty() : Optional.of(customerReferenceIdentification);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD1 setCustomerReferenceIdentification(Max15Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
		return this;
	}
}