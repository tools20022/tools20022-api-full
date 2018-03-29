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
import com.tools20022.repository.codeset.CardPaymentServiceType1Code;
import com.tools20022.repository.codeset.CardPaymentServiceType2Code;
import com.tools20022.repository.codeset.CardPaymentServiceType3Code;
import com.tools20022.repository.codeset.FailureReason1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Min3Max4Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transaction information in the completion advice message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionCapture
 * CardPaymentTransaction3.mmTransactionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionType
 * CardPaymentTransaction3.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmAdditionalService
 * CardPaymentTransaction3.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmServiceAttribute
 * CardPaymentTransaction3.mmServiceAttribute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmMerchantCategoryCode
 * CardPaymentTransaction3.mmMerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionIdentification
 * CardPaymentTransaction3.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmOriginalTransaction
 * CardPaymentTransaction3.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionSuccess
 * CardPaymentTransaction3.mmTransactionSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmReversal
 * CardPaymentTransaction3.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmMerchantOverride
 * CardPaymentTransaction3.mmMerchantOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmFailureReason
 * CardPaymentTransaction3.mmFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmInitiatorTransactionIdentification
 * CardPaymentTransaction3.mmInitiatorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmRecipientTransactionIdentification
 * CardPaymentTransaction3.mmRecipientTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmReconciliationIdentification
 * CardPaymentTransaction3.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmInterchangeData
 * CardPaymentTransaction3.mmInterchangeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionDetails
 * CardPaymentTransaction3.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmAuthorisationResult
 * CardPaymentTransaction3.mmAuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionVerificationResult
 * CardPaymentTransaction3.mmTransactionVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmAdditionalTransactionData
 * CardPaymentTransaction3.mmAdditionalTransactionData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentTransaction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transaction information in the completion advice message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction13
 * CardPaymentTransaction13}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentTransaction3", propOrder = {"transactionCapture", "transactionType", "additionalService", "serviceAttribute", "merchantCategoryCode", "transactionIdentification", "originalTransaction", "transactionSuccess",
		"reversal", "merchantOverride", "failureReason", "initiatorTransactionIdentification", "recipientTransactionIdentification", "reconciliationIdentification", "interchangeData", "transactionDetails", "authorisationResult",
		"transactionVerificationResult", "additionalTransactionData"})
public class CardPaymentTransaction3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxCaptr")
	protected TrueFalseIndicator transactionCapture;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCaptr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag indicating whether the transaction data must be captured or not in addition to the message process."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<TrueFalseIndicator>> mmTransactionCapture = new MMMessageAttribute<CardPaymentTransaction3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxCaptr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCapture";
			definition = "Flag indicating whether the transaction data must be captured or not in addition to the message process.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(CardPaymentTransaction3 obj) {
			return obj.getTransactionCapture();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<TrueFalseIndicator> value) {
			obj.setTransactionCapture(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTp")
	protected CardPaymentServiceType1Code transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of transaction being undertaken for the main service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<CardPaymentServiceType1Code>> mmTransactionType = new MMMessageAttribute<CardPaymentTransaction3, Optional<CardPaymentServiceType1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction being undertaken for the main service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType1Code.mmObject();
		}

		@Override
		public Optional<CardPaymentServiceType1Code> getValue(CardPaymentTransaction3 obj) {
			return obj.getTransactionType();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<CardPaymentServiceType1Code> value) {
			obj.setTransactionType(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlSvc")
	protected List<CardPaymentServiceType2Code> additionalService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service in addition to the main service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, List<CardPaymentServiceType2Code>> mmAdditionalService = new MMMessageAttribute<CardPaymentTransaction3, List<CardPaymentServiceType2Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}

		@Override
		public List<CardPaymentServiceType2Code> getValue(CardPaymentTransaction3 obj) {
			return obj.getAdditionalService();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, List<CardPaymentServiceType2Code> value) {
			obj.setAdditionalService(value);
		}
	};
	@XmlElement(name = "SvcAttr")
	protected CardPaymentServiceType3Code serviceAttribute;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType3Code
	 * CardPaymentServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcAttr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceAttribute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional attribute of the service type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<CardPaymentServiceType3Code>> mmServiceAttribute = new MMMessageAttribute<CardPaymentTransaction3, Optional<CardPaymentServiceType3Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "SvcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAttribute";
			definition = "Additional attribute of the service type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType3Code.mmObject();
		}

		@Override
		public Optional<CardPaymentServiceType3Code> getValue(CardPaymentTransaction3 obj) {
			return obj.getServiceAttribute();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<CardPaymentServiceType3Code> value) {
			obj.setServiceAttribute(value.orElse(null));
		}
	};
	@XmlElement(name = "MrchntCtgyCd", required = true)
	protected Min3Max4Text merchantCategoryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min3Max4Text Min3Max4Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole#mmMerchantCategoryCode
	 * MerchantRole.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntCtgyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantCategoryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Min3Max4Text> mmMerchantCategoryCode = new MMMessageAttribute<CardPaymentTransaction3, Min3Max4Text>() {
		{
			businessElementTrace_lazy = () -> MerchantRole.mmMerchantCategoryCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "MrchntCtgyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}

		@Override
		public Min3Max4Text getValue(CardPaymentTransaction3 obj) {
			return obj.getMerchantCategoryCode();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Min3Max4Text value) {
			obj.setMerchantCategoryCode(value);
		}
	};
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
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
	 * "Unique identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction3, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<CardPaymentTransaction3, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(CardPaymentTransaction3 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlTx")
	protected CardPaymentTransaction8 originalTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8
	 * CardPaymentTransaction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the original transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction3, Optional<CardPaymentTransaction8>> mmOriginalTransaction = new MMMessageAssociationEnd<CardPaymentTransaction3, Optional<CardPaymentTransaction8>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransaction";
			definition = "Identification of the original transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction8.mmObject();
		}

		@Override
		public Optional<CardPaymentTransaction8> getValue(CardPaymentTransaction3 obj) {
			return obj.getOriginalTransaction();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<CardPaymentTransaction8> value) {
			obj.setOriginalTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "TxSucss", required = true)
	protected TrueFalseIndicator transactionSuccess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmTransactionSuccess
	 * CardPaymentValidation.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSucss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSuccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the transaction at the acceptor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, TrueFalseIndicator> mmTransactionSuccess = new MMMessageAttribute<CardPaymentTransaction3, TrueFalseIndicator>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmTransactionSuccess;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxSucss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSuccess";
			definition = "Outcome of the transaction at the acceptor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentTransaction3 obj) {
			return obj.getTransactionSuccess();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, TrueFalseIndicator value) {
			obj.setTransactionSuccess(value);
		}
	};
	@XmlElement(name = "Rvsl")
	protected TrueFalseIndicator reversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmReversal
	 * CardPaymentAcquiring.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notify that a previous transaction has to be reversed if this original transaction has been appoved by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<TrueFalseIndicator>> mmReversal = new MMMessageAttribute<CardPaymentTransaction3, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmReversal;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "Rvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Notify that a previous transaction has to be reversed if this original transaction has been appoved by the acquirer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(CardPaymentTransaction3 obj) {
			return obj.getReversal();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<TrueFalseIndicator> value) {
			obj.setReversal(value.orElse(null));
		}
	};
	@XmlElement(name = "MrchntOvrrd")
	protected TrueFalseIndicator merchantOverride;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmMerchantOverride
	 * CardPaymentValidation.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntOvrrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantOverride"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<TrueFalseIndicator>> mmMerchantOverride = new MMMessageAttribute<CardPaymentTransaction3, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmMerchantOverride;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "MrchntOvrrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantOverride";
			definition = "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(CardPaymentTransaction3 obj) {
			return obj.getMerchantOverride();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<TrueFalseIndicator> value) {
			obj.setMerchantOverride(value.orElse(null));
		}
	};
	@XmlElement(name = "FailrRsn")
	protected List<FailureReason1Code> failureReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason1Code
	 * FailureReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmFailureReason
	 * CardPaymentStatus.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FailrRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of incidents during the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, List<FailureReason1Code>> mmFailureReason = new MMMessageAttribute<CardPaymentTransaction3, List<FailureReason1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentStatus.mmFailureReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "FailrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailureReason";
			definition = "List of incidents during the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason1Code.mmObject();
		}

		@Override
		public List<FailureReason1Code> getValue(CardPaymentTransaction3 obj) {
			return obj.getFailureReason();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, List<FailureReason1Code> value) {
			obj.setFailureReason(value);
		}
	};
	@XmlElement(name = "InitrTxId")
	protected Max35Text initiatorTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInitiatorTransactionIdentifier
	 * CardPaymentAcquiring.mmInitiatorTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the initiating party for the recipient party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<Max35Text>> mmInitiatorTransactionIdentification = new MMMessageAttribute<CardPaymentTransaction3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmInitiatorTransactionIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransaction3 obj) {
			return obj.getInitiatorTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<Max35Text> value) {
			obj.setInitiatorTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RcptTxId")
	protected Max35Text recipientTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the recipient party for the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<Max35Text>> mmRecipientTransactionIdentification = new MMMessageAttribute<CardPaymentTransaction3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "RcptTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientTransactionIdentification";
			definition = "Identification of the transaction assigned by the recipient party for the initiating party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransaction3 obj) {
			return obj.getRecipientTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<Max35Text> value) {
			obj.setRecipientTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RcncltnId")
	protected Max35Text reconciliationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<Max35Text>> mmReconciliationIdentification = new MMMessageAttribute<CardPaymentTransaction3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransaction3 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<Max35Text> value) {
			obj.setReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrchngData")
	protected Max35Text interchangeData;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInterchangeData
	 * CardPaymentAcquiring.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrchngData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterchangeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interchange information related to the card scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<Max35Text>> mmInterchangeData = new MMMessageAttribute<CardPaymentTransaction3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmInterchangeData;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "IntrchngData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterchangeData";
			definition = "Interchange information related to the card scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransaction3 obj) {
			return obj.getInterchangeData();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<Max35Text> value) {
			obj.setInterchangeData(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls", required = true)
	protected CardPaymentTransactionDetails3 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3
	 * CardPaymentTransactionDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction3, CardPaymentTransactionDetails3> mmTransactionDetails = new MMMessageAssociationEnd<CardPaymentTransaction3, CardPaymentTransactionDetails3>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransactionDetails3.mmObject();
		}

		@Override
		public CardPaymentTransactionDetails3 getValue(CardPaymentTransaction3 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, CardPaymentTransactionDetails3 value) {
			obj.setTransactionDetails(value);
		}
	};
	@XmlElement(name = "AuthstnRslt")
	protected AuthorisationResult2 authorisationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult2
	 * AuthorisationResult2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the authorisation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction3, Optional<AuthorisationResult2>> mmAuthorisationResult = new MMMessageAssociationEnd<CardPaymentTransaction3, Optional<AuthorisationResult2>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthorisationResult2.mmObject();
		}

		@Override
		public Optional<AuthorisationResult2> getValue(CardPaymentTransaction3 obj) {
			return obj.getAuthorisationResult();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<AuthorisationResult2> value) {
			obj.setAuthorisationResult(value.orElse(null));
		}
	};
	@XmlElement(name = "TxVrfctnRslt")
	protected TransactionVerificationResult1 transactionVerificationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1
	 * TransactionVerificationResult1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxVrfctnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the verifications performed by the issuer to deliver or decline the authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction3, Optional<TransactionVerificationResult1>> mmTransactionVerificationResult = new MMMessageAssociationEnd<CardPaymentTransaction3, Optional<TransactionVerificationResult1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxVrfctnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionVerificationResult";
			definition = "Result of the verifications performed by the issuer to deliver or decline the authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionVerificationResult1.mmObject();
		}

		@Override
		public Optional<TransactionVerificationResult1> getValue(CardPaymentTransaction3 obj) {
			return obj.getTransactionVerificationResult();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<TransactionVerificationResult1> value) {
			obj.setTransactionVerificationResult(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTxData")
	protected Max70Text additionalTransactionData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
	 * CardPaymentTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction3, Optional<Max70Text>> mmAdditionalTransactionData = new MMMessageAttribute<CardPaymentTransaction3, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction3.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionData";
			definition = "Additional information related to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CardPaymentTransaction3 obj) {
			return obj.getAdditionalTransactionData();
		}

		@Override
		public void setValue(CardPaymentTransaction3 obj, Optional<Max70Text> value) {
			obj.setAdditionalTransactionData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction3.mmTransactionCapture, com.tools20022.repository.msg.CardPaymentTransaction3.mmTransactionType,
						com.tools20022.repository.msg.CardPaymentTransaction3.mmAdditionalService, com.tools20022.repository.msg.CardPaymentTransaction3.mmServiceAttribute,
						com.tools20022.repository.msg.CardPaymentTransaction3.mmMerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction3.mmTransactionIdentification,
						com.tools20022.repository.msg.CardPaymentTransaction3.mmOriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction3.mmTransactionSuccess,
						com.tools20022.repository.msg.CardPaymentTransaction3.mmReversal, com.tools20022.repository.msg.CardPaymentTransaction3.mmMerchantOverride, com.tools20022.repository.msg.CardPaymentTransaction3.mmFailureReason,
						com.tools20022.repository.msg.CardPaymentTransaction3.mmInitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction3.mmRecipientTransactionIdentification,
						com.tools20022.repository.msg.CardPaymentTransaction3.mmReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction3.mmInterchangeData,
						com.tools20022.repository.msg.CardPaymentTransaction3.mmTransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction3.mmAuthorisationResult,
						com.tools20022.repository.msg.CardPaymentTransaction3.mmTransactionVerificationResult, com.tools20022.repository.msg.CardPaymentTransaction3.mmAdditionalTransactionData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransaction3";
				definition = "Transaction information in the completion advice message.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction13.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getTransactionCapture() {
		return transactionCapture == null ? Optional.empty() : Optional.of(transactionCapture);
	}

	public CardPaymentTransaction3 setTransactionCapture(TrueFalseIndicator transactionCapture) {
		this.transactionCapture = transactionCapture;
		return this;
	}

	public Optional<CardPaymentServiceType1Code> getTransactionType() {
		return transactionType == null ? Optional.empty() : Optional.of(transactionType);
	}

	public CardPaymentTransaction3 setTransactionType(CardPaymentServiceType1Code transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	public List<CardPaymentServiceType2Code> getAdditionalService() {
		return additionalService == null ? additionalService = new ArrayList<>() : additionalService;
	}

	public CardPaymentTransaction3 setAdditionalService(List<CardPaymentServiceType2Code> additionalService) {
		this.additionalService = Objects.requireNonNull(additionalService);
		return this;
	}

	public Optional<CardPaymentServiceType3Code> getServiceAttribute() {
		return serviceAttribute == null ? Optional.empty() : Optional.of(serviceAttribute);
	}

	public CardPaymentTransaction3 setServiceAttribute(CardPaymentServiceType3Code serviceAttribute) {
		this.serviceAttribute = serviceAttribute;
		return this;
	}

	public Min3Max4Text getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public CardPaymentTransaction3 setMerchantCategoryCode(Min3Max4Text merchantCategoryCode) {
		this.merchantCategoryCode = Objects.requireNonNull(merchantCategoryCode);
		return this;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public CardPaymentTransaction3 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<CardPaymentTransaction8> getOriginalTransaction() {
		return originalTransaction == null ? Optional.empty() : Optional.of(originalTransaction);
	}

	public CardPaymentTransaction3 setOriginalTransaction(CardPaymentTransaction8 originalTransaction) {
		this.originalTransaction = originalTransaction;
		return this;
	}

	public TrueFalseIndicator getTransactionSuccess() {
		return transactionSuccess;
	}

	public CardPaymentTransaction3 setTransactionSuccess(TrueFalseIndicator transactionSuccess) {
		this.transactionSuccess = Objects.requireNonNull(transactionSuccess);
		return this;
	}

	public Optional<TrueFalseIndicator> getReversal() {
		return reversal == null ? Optional.empty() : Optional.of(reversal);
	}

	public CardPaymentTransaction3 setReversal(TrueFalseIndicator reversal) {
		this.reversal = reversal;
		return this;
	}

	public Optional<TrueFalseIndicator> getMerchantOverride() {
		return merchantOverride == null ? Optional.empty() : Optional.of(merchantOverride);
	}

	public CardPaymentTransaction3 setMerchantOverride(TrueFalseIndicator merchantOverride) {
		this.merchantOverride = merchantOverride;
		return this;
	}

	public List<FailureReason1Code> getFailureReason() {
		return failureReason == null ? failureReason = new ArrayList<>() : failureReason;
	}

	public CardPaymentTransaction3 setFailureReason(List<FailureReason1Code> failureReason) {
		this.failureReason = Objects.requireNonNull(failureReason);
		return this;
	}

	public Optional<Max35Text> getInitiatorTransactionIdentification() {
		return initiatorTransactionIdentification == null ? Optional.empty() : Optional.of(initiatorTransactionIdentification);
	}

	public CardPaymentTransaction3 setInitiatorTransactionIdentification(Max35Text initiatorTransactionIdentification) {
		this.initiatorTransactionIdentification = initiatorTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getRecipientTransactionIdentification() {
		return recipientTransactionIdentification == null ? Optional.empty() : Optional.of(recipientTransactionIdentification);
	}

	public CardPaymentTransaction3 setRecipientTransactionIdentification(Max35Text recipientTransactionIdentification) {
		this.recipientTransactionIdentification = recipientTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getReconciliationIdentification() {
		return reconciliationIdentification == null ? Optional.empty() : Optional.of(reconciliationIdentification);
	}

	public CardPaymentTransaction3 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
		return this;
	}

	public Optional<Max35Text> getInterchangeData() {
		return interchangeData == null ? Optional.empty() : Optional.of(interchangeData);
	}

	public CardPaymentTransaction3 setInterchangeData(Max35Text interchangeData) {
		this.interchangeData = interchangeData;
		return this;
	}

	public CardPaymentTransactionDetails3 getTransactionDetails() {
		return transactionDetails;
	}

	public CardPaymentTransaction3 setTransactionDetails(CardPaymentTransactionDetails3 transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}

	public Optional<AuthorisationResult2> getAuthorisationResult() {
		return authorisationResult == null ? Optional.empty() : Optional.of(authorisationResult);
	}

	public CardPaymentTransaction3 setAuthorisationResult(AuthorisationResult2 authorisationResult) {
		this.authorisationResult = authorisationResult;
		return this;
	}

	public Optional<TransactionVerificationResult1> getTransactionVerificationResult() {
		return transactionVerificationResult == null ? Optional.empty() : Optional.of(transactionVerificationResult);
	}

	public CardPaymentTransaction3 setTransactionVerificationResult(TransactionVerificationResult1 transactionVerificationResult) {
		this.transactionVerificationResult = transactionVerificationResult;
		return this;
	}

	public Optional<Max70Text> getAdditionalTransactionData() {
		return additionalTransactionData == null ? Optional.empty() : Optional.of(additionalTransactionData);
	}

	public CardPaymentTransaction3 setAdditionalTransactionData(Max70Text additionalTransactionData) {
		this.additionalTransactionData = additionalTransactionData;
		return this;
	}
}