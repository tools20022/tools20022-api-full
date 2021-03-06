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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherIdentification2;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmPlaceAndName
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmOptionNumber
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentification
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionSequenceNumber
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationDate
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionIdentificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionContraCUSIP
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionContraCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationQuantity
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionIdentificationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionIdentificationOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationStatus
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionIdentificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationProtectDate
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionIdentificationProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionIdentificationCoverProtectDate
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionIdentificationCoverProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionConditionalQuantity
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmTransactionTenderBidPrice
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmTransactionTenderBidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmCustomerReferenceIdentification
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmCustomerReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmInstructionComments
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
 * mmInstructionComments}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructedBalanceOptionInstructionDetailsSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instructed balance details at option level."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1
 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructedBalanceOptionInstructionDetailsSD2", propOrder = {"placeAndName", "optionNumber", "transactionIdentification", "transactionSequenceNumber", "transactionIdentificationDate",
		"transactionContraCUSIP", "transactionIdentificationQuantity", "transactionIdentificationOversubscriptionQuantity", "transactionIdentificationStatus", "transactionIdentificationProtectDate",
		"transactionIdentificationCoverProtectDate", "transactionConditionalQuantity", "transactionTenderBidPrice", "customerReferenceIdentification", "instructionComments"})
public class CorporateActionInstructedBalanceOptionInstructionDetailsSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmPlaceAndName
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmOptionNumber
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmOptionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, OptionNumber1Choice> mmOptionNumber = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, OptionNumber1Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmOptionNumber;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}

		@Override
		public OptionNumber1Choice getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, OptionNumber1Choice value) {
			obj.setOptionNumber(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number assigned by the depository. Transaction identification will be either the DTC instruction reference number for reorganisation instructions (VOI) or the DAM reference number for custody / reorganisation deposits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentification
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Max15Text> mmTransactionIdentification = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Max15Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique number assigned by the depository. Transaction identification will be either the DTC instruction reference number for reorganisation instructions (VOI) or the DAM reference number for custody / reorganisation deposits.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
		}

		@Override
		public Max15Text getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Max15Text value) {
			obj.setTransactionIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number which further identifies DTC instruction reference number. Not applicable to reorganisation / custody deposits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionSequenceNumber
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<Max3NumericText>> mmTransactionSequenceNumber = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<Max3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumber";
			definition = "Number which further identifies DTC instruction reference number. Not applicable to reorganisation / custody deposits.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionSequenceNumber();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<Max3NumericText> value) {
			obj.setTransactionSequenceNumber(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationDate
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionIdentificationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, ISODateTime> mmTransactionIdentificationDate = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDate";
			definition = "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentificationDate();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, ISODateTime value) {
			obj.setTransactionIdentificationDate(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxContraCUSIP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionContraCUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contra CUSIP Identification of the option instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionContraCUSIP
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionContraCUSIP}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<OtherIdentification2>> mmTransactionContraCUSIP = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<OtherIdentification2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxContraCUSIP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionContraCUSIP";
			definition = "Contra CUSIP Identification of the option instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionContraCUSIP;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherIdentification2.mmObject();
		}

		@Override
		public Optional<OtherIdentification2> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionContraCUSIP();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<OtherIdentification2> value) {
			obj.setTransactionContraCUSIP(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationQuantity
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionIdentificationQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, FinancialInstrumentQuantity15Choice> mmTransactionIdentificationQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, FinancialInstrumentQuantity15Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationQuantity";
			definition = "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity15Choice getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentificationQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, FinancialInstrumentQuantity15Choice value) {
			obj.setTransactionIdentificationQuantity(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdOvrsbcptQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity relating only to the oversubscription."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationOversubscriptionQuantity
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionIdentificationOversubscriptionQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<FinancialInstrumentQuantity15Choice>> mmTransactionIdentificationOversubscriptionQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationOversubscriptionQuantity";
			definition = "Quantity relating only to the oversubscription.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationOversubscriptionQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentificationOversubscriptionQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setTransactionIdentificationOversubscriptionQuantity(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationStatus
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionIdentificationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, DTCInstructionStatus2Code> mmTransactionIdentificationStatus = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, DTCInstructionStatus2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationStatus";
			definition = "Status of the instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCInstructionStatus2Code.mmObject();
		}

		@Override
		public DTCInstructionStatus2Code getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentificationStatus();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, DTCInstructionStatus2Code value) {
			obj.setTransactionIdentificationStatus(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdPrtctDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationProtectDate
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionIdentificationProtectDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<ISODateTime>> mmTransactionIdentificationProtectDate = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationProtectDate";
			definition = "Date and time of the protect instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationProtectDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentificationProtectDate();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<ISODateTime> value) {
			obj.setTransactionIdentificationProtectDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdCoverPrtctDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationCoverProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the cover protect."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionIdentificationCoverProtectDate
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionIdentificationCoverProtectDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<ISODateTime>> mmTransactionIdentificationCoverProtectDate = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdCoverPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationCoverProtectDate";
			definition = "Date and time of the cover protect.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionIdentificationCoverProtectDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentificationCoverProtectDate();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<ISODateTime> value) {
			obj.setTransactionIdentificationCoverProtectDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCondlQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional quantity on the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionConditionalQuantity
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionConditionalQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<FinancialInstrumentQuantity15Choice>> mmTransactionConditionalQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxCondlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionConditionalQuantity";
			definition = "Conditional quantity on the instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionConditionalQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionConditionalQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setTransactionConditionalQuantity(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTndrBidPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTenderBidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender bid price of the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmTransactionTenderBidPrice
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmTransactionTenderBidPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<PriceFormat57Choice>> mmTransactionTenderBidPrice = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<PriceFormat57Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxTndrBidPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTenderBidPrice";
			definition = "Tender bid price of the instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmTransactionTenderBidPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat57Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat57Choice> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getTransactionTenderBidPrice();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<PriceFormat57Choice> value) {
			obj.setTransactionTenderBidPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrRefId")
	protected Max30Text customerReferenceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrRefId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer identification entered by client upon instruction submission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmCustomerReferenceIdentification
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmCustomerReferenceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<Max30Text>> mmCustomerReferenceIdentification = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<Max30Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmCustomerReferenceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Optional<Max30Text> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getCustomerReferenceIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<Max30Text> value) {
			obj.setCustomerReferenceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrCmnts")
	protected Max210Text instructionComments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCmnts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Client free format instruction narrative information. Will be 80 characters for tender instructions, 150 characters for rights instructions and 20 characters for put instructions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<Max210Text>> mmInstructionComments = new MMMessageAttribute<CorporateActionInstructedBalanceOptionInstructionDetailsSD2, Optional<Max210Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "InstrCmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionComments";
			definition = "Client free format instruction narrative information. Will be 80 characters for tender instructions, 150 characters for rights instructions and 20 characters for put instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj) {
			return obj.getInstructionComments();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionInstructionDetailsSD2 obj, Optional<Max210Text> value) {
			obj.setInstructionComments(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmOptionNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentification,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionSequenceNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionContraCUSIP,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationOversubscriptionQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationStatus,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionIdentificationCoverProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionConditionalQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmTransactionTenderBidPrice,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmCustomerReferenceIdentification,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmInstructionComments);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructedBalanceOptionInstructionDetailsSD2";
				definition = "Provides additional information regarding corporate action instructed balance details at option level.";
				previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public Max15Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionIdentification(Max15Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Max3NumericText> getTransactionSequenceNumber() {
		return transactionSequenceNumber == null ? Optional.empty() : Optional.of(transactionSequenceNumber);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionSequenceNumber(Max3NumericText transactionSequenceNumber) {
		this.transactionSequenceNumber = transactionSequenceNumber;
		return this;
	}

	public ISODateTime getTransactionIdentificationDate() {
		return transactionIdentificationDate;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionIdentificationDate(ISODateTime transactionIdentificationDate) {
		this.transactionIdentificationDate = Objects.requireNonNull(transactionIdentificationDate);
		return this;
	}

	public Optional<OtherIdentification2> getTransactionContraCUSIP() {
		return transactionContraCUSIP == null ? Optional.empty() : Optional.of(transactionContraCUSIP);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionContraCUSIP(OtherIdentification2 transactionContraCUSIP) {
		this.transactionContraCUSIP = transactionContraCUSIP;
		return this;
	}

	public FinancialInstrumentQuantity15Choice getTransactionIdentificationQuantity() {
		return transactionIdentificationQuantity;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionIdentificationQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationQuantity) {
		this.transactionIdentificationQuantity = Objects.requireNonNull(transactionIdentificationQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getTransactionIdentificationOversubscriptionQuantity() {
		return transactionIdentificationOversubscriptionQuantity == null ? Optional.empty() : Optional.of(transactionIdentificationOversubscriptionQuantity);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionIdentificationOversubscriptionQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity) {
		this.transactionIdentificationOversubscriptionQuantity = transactionIdentificationOversubscriptionQuantity;
		return this;
	}

	public DTCInstructionStatus2Code getTransactionIdentificationStatus() {
		return transactionIdentificationStatus;
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionIdentificationStatus(DTCInstructionStatus2Code transactionIdentificationStatus) {
		this.transactionIdentificationStatus = Objects.requireNonNull(transactionIdentificationStatus);
		return this;
	}

	public Optional<ISODateTime> getTransactionIdentificationProtectDate() {
		return transactionIdentificationProtectDate == null ? Optional.empty() : Optional.of(transactionIdentificationProtectDate);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionIdentificationProtectDate(ISODateTime transactionIdentificationProtectDate) {
		this.transactionIdentificationProtectDate = transactionIdentificationProtectDate;
		return this;
	}

	public Optional<ISODateTime> getTransactionIdentificationCoverProtectDate() {
		return transactionIdentificationCoverProtectDate == null ? Optional.empty() : Optional.of(transactionIdentificationCoverProtectDate);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionIdentificationCoverProtectDate(ISODateTime transactionIdentificationCoverProtectDate) {
		this.transactionIdentificationCoverProtectDate = transactionIdentificationCoverProtectDate;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getTransactionConditionalQuantity() {
		return transactionConditionalQuantity == null ? Optional.empty() : Optional.of(transactionConditionalQuantity);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionConditionalQuantity(FinancialInstrumentQuantity15Choice transactionConditionalQuantity) {
		this.transactionConditionalQuantity = transactionConditionalQuantity;
		return this;
	}

	public Optional<PriceFormat57Choice> getTransactionTenderBidPrice() {
		return transactionTenderBidPrice == null ? Optional.empty() : Optional.of(transactionTenderBidPrice);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setTransactionTenderBidPrice(PriceFormat57Choice transactionTenderBidPrice) {
		this.transactionTenderBidPrice = transactionTenderBidPrice;
		return this;
	}

	public Optional<Max30Text> getCustomerReferenceIdentification() {
		return customerReferenceIdentification == null ? Optional.empty() : Optional.of(customerReferenceIdentification);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setCustomerReferenceIdentification(Max30Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
		return this;
	}

	public Optional<Max210Text> getInstructionComments() {
		return instructionComments == null ? Optional.empty() : Optional.of(instructionComments);
	}

	public CorporateActionInstructedBalanceOptionInstructionDetailsSD2 setInstructionComments(Max210Text instructionComments) {
		this.instructionComments = instructionComments;
		return this;
	}
}