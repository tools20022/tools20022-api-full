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
import com.tools20022.repository.codeset.DTCInstructionStatus2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * </ul>
 */
public class CorporateActionInstructedBalanceOptionInstructionDetailsSD1 {

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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
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
	protected OptionNumber1Choice optionNumber;
	/**
	 * Number identifying the available corporate action options.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
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
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}
	};
	protected Max15Text transactionIdentification;
	/**
	 * Unique number assigned by the Depository. Transaction identification will
	 * be either the DTC Instruction Reference Number for reorganisation
	 * instructions (VOI) or the DAM Reference Number for custody /
	 * reorganisation deposits.
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
	 * "Unique number assigned by the Depository.  Transaction identification will be either the DTC Instruction Reference Number for reorganisation instructions (VOI) or the DAM Reference Number for custody / reorganisation deposits. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique number assigned by the Depository.  Transaction identification will be either the DTC Instruction Reference Number for reorganisation instructions (VOI) or the DAM Reference Number for custody / reorganisation deposits. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
		}
	};
	protected Max3NumericText transactionSequenceNumber;
	/**
	 * Number which further identifies DTC intsruction reference number. Not
	 * applicable to reorganisation / custody deposits.
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
	 * "Number which further identifies DTC intsruction reference number.  Not applicable to reorganisation / custody deposits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumber";
			definition = "Number which further identifies DTC intsruction reference number.  Not applicable to reorganisation / custody deposits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected ISODateTime transactionIdentificationDate;
	/**
	 * Instruction date and time for reorganisation instructions or the deposit
	 * date for reorganisation / custody deposits.
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDate";
			definition = "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected OtherIdentification2 transactionContraCUSIP;
	/**
	 * Contra CUSIP Identification of the option instruction.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionContraCUSIP = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxContraCUSIP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionContraCUSIP";
			definition = "Contra CUSIP Identification of the option instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherIdentification2.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice transactionIdentificationQuantity;
	/**
	 * Instructed quantity for reorganisation instructions or the deposit
	 * quantity for reorganisation / custody deposits.
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentificationQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationQuantity";
			definition = "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity;
	/**
	 * Quantity relating only to the oversubscription.
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
	 * definition} = "Quantity relating only to the oversubscription.  "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentificationOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationOversubscriptionQuantity";
			definition = "Quantity relating only to the oversubscription.  ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected DTCInstructionStatus2Code transactionIdentificationStatus;
	/**
	 * Status of the instruction.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationStatus";
			definition = "Status of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCInstructionStatus2Code.mmObject();
		}
	};
	protected ISODateTime transactionIdentificationProtectDate;
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationProtectDate";
			definition = "Date and time of the protect instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime transactionIdentificationCoverProtectDate;
	/**
	 * Date and time of the cover protect.
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationCoverProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxIdCoverPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationCoverProtectDate";
			definition = "Date and time of the cover protect.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice transactionConditionalQuantity;
	/**
	 * Conditional quantity on the instruction.
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionConditionalQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxCondlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionConditionalQuantity";
			definition = "Conditional quantity on the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected PriceFormat57Choice transactionTenderBidPrice;
	/**
	 * Tender bid price of the instruction.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionTenderBidPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxTndrBidPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTenderBidPrice";
			definition = "Tender bid price of the instruction.";
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmPlaceAndName, CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmOptionNumber,
						CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentification, CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionSequenceNumber,
						CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationDate, CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionContraCUSIP,
						CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationQuantity, CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationOversubscriptionQuantity,
						CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationStatus, CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationProtectDate,
						CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationCoverProtectDate, CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionConditionalQuantity,
						CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionTenderBidPrice, CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmCustomerReferenceIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructedBalanceOptionInstructionDetailsSD1";
				definition = "Provides additional information regarding corporate action instructed balance details at option level.";
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

	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = optionNumber;
	}

	public Max15Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max15Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public Max3NumericText getTransactionSequenceNumber() {
		return transactionSequenceNumber;
	}

	public void setTransactionSequenceNumber(Max3NumericText transactionSequenceNumber) {
		this.transactionSequenceNumber = transactionSequenceNumber;
	}

	public ISODateTime getTransactionIdentificationDate() {
		return transactionIdentificationDate;
	}

	public void setTransactionIdentificationDate(ISODateTime transactionIdentificationDate) {
		this.transactionIdentificationDate = transactionIdentificationDate;
	}

	public OtherIdentification2 getTransactionContraCUSIP() {
		return transactionContraCUSIP;
	}

	public void setTransactionContraCUSIP(com.tools20022.repository.msg.OtherIdentification2 transactionContraCUSIP) {
		this.transactionContraCUSIP = transactionContraCUSIP;
	}

	public FinancialInstrumentQuantity15Choice getTransactionIdentificationQuantity() {
		return transactionIdentificationQuantity;
	}

	public void setTransactionIdentificationQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationQuantity) {
		this.transactionIdentificationQuantity = transactionIdentificationQuantity;
	}

	public FinancialInstrumentQuantity15Choice getTransactionIdentificationOversubscriptionQuantity() {
		return transactionIdentificationOversubscriptionQuantity;
	}

	public void setTransactionIdentificationOversubscriptionQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity) {
		this.transactionIdentificationOversubscriptionQuantity = transactionIdentificationOversubscriptionQuantity;
	}

	public DTCInstructionStatus2Code getTransactionIdentificationStatus() {
		return transactionIdentificationStatus;
	}

	public void setTransactionIdentificationStatus(DTCInstructionStatus2Code transactionIdentificationStatus) {
		this.transactionIdentificationStatus = transactionIdentificationStatus;
	}

	public ISODateTime getTransactionIdentificationProtectDate() {
		return transactionIdentificationProtectDate;
	}

	public void setTransactionIdentificationProtectDate(ISODateTime transactionIdentificationProtectDate) {
		this.transactionIdentificationProtectDate = transactionIdentificationProtectDate;
	}

	public ISODateTime getTransactionIdentificationCoverProtectDate() {
		return transactionIdentificationCoverProtectDate;
	}

	public void setTransactionIdentificationCoverProtectDate(ISODateTime transactionIdentificationCoverProtectDate) {
		this.transactionIdentificationCoverProtectDate = transactionIdentificationCoverProtectDate;
	}

	public FinancialInstrumentQuantity15Choice getTransactionConditionalQuantity() {
		return transactionConditionalQuantity;
	}

	public void setTransactionConditionalQuantity(FinancialInstrumentQuantity15Choice transactionConditionalQuantity) {
		this.transactionConditionalQuantity = transactionConditionalQuantity;
	}

	public PriceFormat57Choice getTransactionTenderBidPrice() {
		return transactionTenderBidPrice;
	}

	public void setTransactionTenderBidPrice(PriceFormat57Choice transactionTenderBidPrice) {
		this.transactionTenderBidPrice = transactionTenderBidPrice;
	}

	public Max15Text getCustomerReferenceIdentification() {
		return customerReferenceIdentification;
	}

	public void setCustomerReferenceIdentification(Max15Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
	}
}