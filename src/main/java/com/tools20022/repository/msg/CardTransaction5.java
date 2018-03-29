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
import com.tools20022.repository.codeset.CardPaymentServiceType3Code;
import com.tools20022.repository.codeset.CardPaymentServiceType7Code;
import com.tools20022.repository.codeset.CardPaymentServiceType8Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.MerchantRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AuthorisationResult7;
import com.tools20022.repository.msg.CardTransaction3;
import com.tools20022.repository.msg.CardTransactionDetail3;
import com.tools20022.repository.msg.TransactionIdentifier2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card transaction for which the financial authorisation is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionType
 * CardTransaction5.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAdditionalService
 * CardTransaction5.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmServiceAttribute
 * CardTransaction5.mmServiceAttribute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmMerchantCategoryCode
 * CardTransaction5.mmMerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmReconciliation
 * CardTransaction5.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcceptorTransactionDateTime
 * CardTransaction5.mmAcceptorTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcceptorTransactionIdentification
 * CardTransaction5.mmAcceptorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmInitiatorTransactionIdentification
 * CardTransaction5.mmInitiatorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionLifeCycleIdentification
 * CardTransaction5.mmTransactionLifeCycleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionLifeCycleSequenceNumber
 * CardTransaction5.mmTransactionLifeCycleSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionLifeCycleSequenceCounter
 * CardTransaction5.mmTransactionLifeCycleSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcquirerTransactionReference
 * CardTransaction5.mmAcquirerTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmCardIssuerReferenceData
 * CardTransaction5.mmCardIssuerReferenceData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmOriginalTransaction
 * CardTransaction5.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionDetails
 * CardTransaction5.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAuthorisationResult
 * CardTransaction5.mmAuthorisationResult}</li>
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
 * "CardTransaction5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card transaction for which the financial authorisation is requested."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransaction15
 * CardTransaction15}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransaction5", propOrder = {"transactionType", "additionalService", "serviceAttribute", "merchantCategoryCode", "reconciliation", "acceptorTransactionDateTime", "acceptorTransactionIdentification",
		"initiatorTransactionIdentification", "transactionLifeCycleIdentification", "transactionLifeCycleSequenceNumber", "transactionLifeCycleSequenceCounter", "acquirerTransactionReference", "cardIssuerReferenceData",
		"originalTransaction", "transactionDetails", "authorisationResult"})
public class CardTransaction5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxTp", required = true)
	protected CardPaymentServiceType7Code transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
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
	 * "Type of transaction being undertaken for the main service. \r\nIt correspond partially to the ISO 8583 field number 3."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionType
	 * CardTransaction15.mmTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, CardPaymentServiceType7Code> mmTransactionType = new MMMessageAttribute<CardTransaction5, CardPaymentServiceType7Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction being undertaken for the main service. \r\nIt correspond partially to the ISO 8583 field number 3.";
			previousVersion_lazy = () -> CardTransaction15.mmTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType7Code.mmObject();
		}

		@Override
		public CardPaymentServiceType7Code getValue(CardTransaction5 obj) {
			return obj.getTransactionType();
		}

		@Override
		public void setValue(CardTransaction5 obj, CardPaymentServiceType7Code value) {
			obj.setTransactionType(value);
		}
	};
	@XmlElement(name = "AddtlSvc")
	protected List<CardPaymentServiceType8Code> additionalService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType8Code
	 * CardPaymentServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
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
	 * definition} =
	 * "Service in addition to the main service. \r\nIt correspond partially to the ISO 8583: 2003 field number 22-3."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAdditionalService
	 * CardTransaction15.mmAdditionalService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, List<CardPaymentServiceType8Code>> mmAdditionalService = new MMMessageAttribute<CardTransaction5, List<CardPaymentServiceType8Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service. \r\nIt correspond partially to the ISO 8583: 2003 field number 22-3.";
			previousVersion_lazy = () -> CardTransaction15.mmAdditionalService;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType8Code.mmObject();
		}

		@Override
		public List<CardPaymentServiceType8Code> getValue(CardTransaction5 obj) {
			return obj.getAdditionalService();
		}

		@Override
		public void setValue(CardTransaction5 obj, List<CardPaymentServiceType8Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
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
	 * definition} =
	 * "Additional attribute of the service type. \r\nIt correspond partially to the ISO 8583: 2003 field number 22-3."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmServiceAttribute
	 * CardTransaction15.mmServiceAttribute}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Optional<CardPaymentServiceType3Code>> mmServiceAttribute = new MMMessageAttribute<CardTransaction5, Optional<CardPaymentServiceType3Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "SvcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAttribute";
			definition = "Additional attribute of the service type. \r\nIt correspond partially to the ISO 8583: 2003 field number 22-3.";
			previousVersion_lazy = () -> CardTransaction15.mmServiceAttribute;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType3Code.mmObject();
		}

		@Override
		public Optional<CardPaymentServiceType3Code> getValue(CardTransaction5 obj) {
			return obj.getServiceAttribute();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<CardPaymentServiceType3Code> value) {
			obj.setServiceAttribute(value.orElse(null));
		}
	};
	@XmlElement(name = "MrchntCtgyCd")
	protected Min3Max4NumericText merchantCategoryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min3Max4NumericText
	 * Min3Max4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole#mmMerchantCategoryCode
	 * MerchantRole.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
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
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction. \r\nIt correspond to the ISO 8583 field number 18 for the version 87, field numbers 18 and 26 for the version 93, and field number 26 for the version 2003."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmMerchantCategoryCode
	 * CardTransaction15.mmMerchantCategoryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Optional<Min3Max4NumericText>> mmMerchantCategoryCode = new MMMessageAttribute<CardTransaction5, Optional<Min3Max4NumericText>>() {
		{
			businessElementTrace_lazy = () -> MerchantRole.mmMerchantCategoryCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "MrchntCtgyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction. \r\nIt correspond to the ISO 8583 field number 18 for the version 87, field numbers 18 and 26 for the version 93, and field number 26 for the version 2003.";
			previousVersion_lazy = () -> CardTransaction15.mmMerchantCategoryCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min3Max4NumericText.mmObject();
		}

		@Override
		public Optional<Min3Max4NumericText> getValue(CardTransaction5 obj) {
			return obj.getMerchantCategoryCode();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<Min3Max4NumericText> value) {
			obj.setMerchantCategoryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcncltn")
	protected TransactionIdentifier2 reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier2
	 * TransactionIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcncltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reconciliation period between the acquirer and the issuer or their respective agents."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmReconciliation
	 * CardTransaction15.mmReconciliation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction5, Optional<TransactionIdentifier2>> mmReconciliation = new MMMessageAssociationEnd<CardTransaction5, Optional<TransactionIdentifier2>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "Rcncltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Identification of the reconciliation period between the acquirer and the issuer or their respective agents.";
			previousVersion_lazy = () -> CardTransaction15.mmReconciliation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier2.mmObject();
		}

		@Override
		public Optional<TransactionIdentifier2> getValue(CardTransaction5 obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<TransactionIdentifier2> value) {
			obj.setReconciliation(value.orElse(null));
		}
	};
	@XmlElement(name = "AccptrTxDtTm", required = true)
	protected ISODateTime acceptorTransactionDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionDateTime
	 * CardPaymentAcquiring.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptrTxDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorTransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the transaction transported unchanged by the acquirer from the card acceptor to the issuer. Corresponds to the CAPE data element TransactionIdentification/ TransactionDateTime.\r\nIt correspond to the ISO 8583 field number 12."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionDateTime
	 * CardTransaction15.mmAcceptorTransactionDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, ISODateTime> mmAcceptorTransactionDateTime = new MMMessageAttribute<CardTransaction5, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "AccptrTxDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorTransactionDateTime";
			definition = "Date and time of the transaction transported unchanged by the acquirer from the card acceptor to the issuer. Corresponds to the CAPE data element TransactionIdentification/ TransactionDateTime.\r\nIt correspond to the ISO 8583 field number 12.";
			previousVersion_lazy = () -> CardTransaction15.mmAcceptorTransactionDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CardTransaction5 obj) {
			return obj.getAcceptorTransactionDateTime();
		}

		@Override
		public void setValue(CardTransaction5 obj, ISODateTime value) {
			obj.setAcceptorTransactionDateTime(value);
		}
	};
	@XmlElement(name = "AccptrTxId", required = true)
	protected Max35Text acceptorTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique transaction identification generated by the acceptor or the acquirer transported unchanged by the acquirer from the card acceptor to the issuer. It is used to assist locating the original source information. Eventually it could be included in the cardholder statement. It corresponds to ISO 8583, field 37 and CAPE data element TransactionIdentification/TransactionReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionIdentification
	 * CardTransaction15.mmAcceptorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Max35Text> mmAcceptorTransactionIdentification = new MMMessageAttribute<CardTransaction5, Max35Text>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "AccptrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorTransactionIdentification";
			definition = "Unique transaction identification generated by the acceptor or the acquirer transported unchanged by the acquirer from the card acceptor to the issuer. It is used to assist locating the original source information. Eventually it could be included in the cardholder statement. It corresponds to ISO 8583, field 37 and CAPE data element TransactionIdentification/TransactionReference.";
			previousVersion_lazy = () -> CardTransaction15.mmAcceptorTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardTransaction5 obj) {
			return obj.getAcceptorTransactionIdentification();
		}

		@Override
		public void setValue(CardTransaction5 obj, Max35Text value) {
			obj.setAcceptorTransactionIdentification(value);
		}
	};
	@XmlElement(name = "InitrTxId", required = true)
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
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
	 * "Number generated by the transaction Initiator to assist in identifying a transaction uniquely. This value remains unchanged for all messages within a message pair exchange, for instance an initiation/response. It corresponds to the ISO 8583 field number 11."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmInitiatorTransactionIdentification
	 * CardTransaction15.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Max35Text> mmInitiatorTransactionIdentification = new MMMessageAttribute<CardTransaction5, Max35Text>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Number generated by the transaction Initiator to assist in identifying a transaction uniquely. This value remains unchanged for all messages within a message pair exchange, for instance an initiation/response. It corresponds to the ISO 8583 field number 11.";
			previousVersion_lazy = () -> CardTransaction15.mmInitiatorTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardTransaction5 obj) {
			return obj.getInitiatorTransactionIdentification();
		}

		@Override
		public void setValue(CardTransaction5 obj, Max35Text value) {
			obj.setInitiatorTransactionIdentification(value);
		}
	};
	@XmlElement(name = "TxLifeCyclId")
	protected Max35Text transactionLifeCycleIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxLifeCyclId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionLifeCycleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to match transactions throughout their life cycle (for example, authorisation to financial presentment, financial presentment to chargeback). It shall contain the same value in all messages throughout a transaction’s life cycle. It corresponds partially to ISO 8583: 2003 field number 21."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionLifeCycleIdentification
	 * CardTransaction15.mmTransactionLifeCycleIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Optional<Max35Text>> mmTransactionLifeCycleIdentification = new MMMessageAttribute<CardTransaction5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleIdentification";
			definition = "Unique identification to match transactions throughout their life cycle (for example, authorisation to financial presentment, financial presentment to chargeback). It shall contain the same value in all messages throughout a transaction’s life cycle. It corresponds partially to ISO 8583: 2003 field number 21.";
			previousVersion_lazy = () -> CardTransaction15.mmTransactionLifeCycleIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardTransaction5 obj) {
			return obj.getTransactionLifeCycleIdentification();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<Max35Text> value) {
			obj.setTransactionLifeCycleIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TxLifeCyclSeqNb")
	protected Number transactionLifeCycleSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxLifeCyclSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionLifeCycleSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Life cycle transaction sequence number when multiple authorisations are performed for the same presentment.\r\nIt corresponds partially to ISO 8583: 2003 field number 21."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionLifeCycleSequenceNumber
	 * CardTransaction15.mmTransactionLifeCycleSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Optional<Number>> mmTransactionLifeCycleSequenceNumber = new MMMessageAttribute<CardTransaction5, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleSequenceNumber";
			definition = "Life cycle transaction sequence number when multiple authorisations are performed for the same presentment.\r\nIt corresponds partially to ISO 8583: 2003 field number 21.";
			previousVersion_lazy = () -> CardTransaction15.mmTransactionLifeCycleSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardTransaction5 obj) {
			return obj.getTransactionLifeCycleSequenceNumber();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<Number> value) {
			obj.setTransactionLifeCycleSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TxLifeCyclSeqCntr")
	protected Number transactionLifeCycleSequenceCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxLifeCyclSeqCntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionLifeCycleSequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions under the same life cycle transaction sequence number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionLifeCycleSequenceCounter
	 * CardTransaction15.mmTransactionLifeCycleSequenceCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Optional<Number>> mmTransactionLifeCycleSequenceCounter = new MMMessageAttribute<CardTransaction5, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclSeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleSequenceCounter";
			definition = "Total number of transactions under the same life cycle transaction sequence number.";
			previousVersion_lazy = () -> CardTransaction15.mmTransactionLifeCycleSequenceCounter;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardTransaction5 obj) {
			return obj.getTransactionLifeCycleSequenceCounter();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<Number> value) {
			obj.setTransactionLifeCycleSequenceCounter(value.orElse(null));
		}
	};
	@XmlElement(name = "AcqrrTxRef")
	protected Max35NumericText acquirerTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data supplied by an acquirer at clearing time to assist in identifying the original transaction in subsequent messages, for example when researching retrievals and chargebacks. It corresponds to ISO 8583: 2003 field number 31, acquirer reference number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Optional<Max35NumericText>> mmAcquirerTransactionReference = new MMMessageAttribute<CardTransaction5, Optional<Max35NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "AcqrrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerTransactionReference";
			definition = "Data supplied by an acquirer at clearing time to assist in identifying the original transaction in subsequent messages, for example when researching retrievals and chargebacks. It corresponds to ISO 8583: 2003 field number 31, acquirer reference number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Optional<Max35NumericText> getValue(CardTransaction5 obj) {
			return obj.getAcquirerTransactionReference();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<Max35NumericText> value) {
			obj.setAcquirerTransactionReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CardIssrRefData")
	protected Max140Text cardIssuerReferenceData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardIssrRefData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuerReferenceData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data supplied by a card issuer in response messages or in issuer generated messages, that the acquirer may be required to be provided in subsequent messages. It corresponds to ISO 8583: 93 and 2003 field number 95."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction5, Optional<Max140Text>> mmCardIssuerReferenceData = new MMMessageAttribute<CardTransaction5, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "CardIssrRefData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuerReferenceData";
			definition = "Data supplied by a card issuer in response messages or in issuer generated messages, that the acquirer may be required to be provided in subsequent messages. It corresponds to ISO 8583: 93 and 2003 field number 95.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(CardTransaction5 obj) {
			return obj.getCardIssuerReferenceData();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<Max140Text> value) {
			obj.setCardIssuerReferenceData(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlTx")
	protected CardTransaction3 originalTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransaction3
	 * CardTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
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
	 * definition} =
	 * "Identification of the original transaction.\r\nIt corresponds to ISO 8583, field number 90 for the version 87, and 56 for the other versions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmOriginalTransaction
	 * CardTransaction15.mmOriginalTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction5, Optional<CardTransaction3>> mmOriginalTransaction = new MMMessageAssociationEnd<CardTransaction5, Optional<CardTransaction3>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransaction";
			definition = "Identification of the original transaction.\r\nIt corresponds to ISO 8583, field number 90 for the version 87, and 56 for the other versions.";
			previousVersion_lazy = () -> CardTransaction15.mmOriginalTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardTransaction3.mmObject();
		}

		@Override
		public Optional<CardTransaction3> getValue(CardTransaction5 obj) {
			return obj.getOriginalTransaction();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<CardTransaction3> value) {
			obj.setOriginalTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls", required = true)
	protected CardTransactionDetail3 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
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
	 * definition} = "Details of the card transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionDetails
	 * CardTransaction15.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction5, CardTransactionDetail3> mmTransactionDetails = new MMMessageAssociationEnd<CardTransaction5, CardTransactionDetail3>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the card transaction.";
			previousVersion_lazy = () -> CardTransaction15.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransactionDetail3.mmObject();
		}

		@Override
		public CardTransactionDetail3 getValue(CardTransaction5 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(CardTransaction5 obj, CardTransactionDetail3 value) {
			obj.setTransactionDetails(value);
		}
	};
	@XmlElement(name = "AuthstnRslt")
	protected AuthorisationResult7 authorisationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult7
	 * AuthorisationResult7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5
	 * CardTransaction5}</li>
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
	 * definition} = "Outcome of the authorisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAuthorisationResult
	 * CardTransaction15.mmAuthorisationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction5, Optional<AuthorisationResult7>> mmAuthorisationResult = new MMMessageAssociationEnd<CardTransaction5, Optional<AuthorisationResult7>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction5.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation.";
			previousVersion_lazy = () -> CardTransaction15.mmAuthorisationResult;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthorisationResult7.mmObject();
		}

		@Override
		public Optional<AuthorisationResult7> getValue(CardTransaction5 obj) {
			return obj.getAuthorisationResult();
		}

		@Override
		public void setValue(CardTransaction5 obj, Optional<AuthorisationResult7> value) {
			obj.setAuthorisationResult(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction5.mmTransactionType, com.tools20022.repository.msg.CardTransaction5.mmAdditionalService,
						com.tools20022.repository.msg.CardTransaction5.mmServiceAttribute, com.tools20022.repository.msg.CardTransaction5.mmMerchantCategoryCode, com.tools20022.repository.msg.CardTransaction5.mmReconciliation,
						com.tools20022.repository.msg.CardTransaction5.mmAcceptorTransactionDateTime, com.tools20022.repository.msg.CardTransaction5.mmAcceptorTransactionIdentification,
						com.tools20022.repository.msg.CardTransaction5.mmInitiatorTransactionIdentification, com.tools20022.repository.msg.CardTransaction5.mmTransactionLifeCycleIdentification,
						com.tools20022.repository.msg.CardTransaction5.mmTransactionLifeCycleSequenceNumber, com.tools20022.repository.msg.CardTransaction5.mmTransactionLifeCycleSequenceCounter,
						com.tools20022.repository.msg.CardTransaction5.mmAcquirerTransactionReference, com.tools20022.repository.msg.CardTransaction5.mmCardIssuerReferenceData,
						com.tools20022.repository.msg.CardTransaction5.mmOriginalTransaction, com.tools20022.repository.msg.CardTransaction5.mmTransactionDetails, com.tools20022.repository.msg.CardTransaction5.mmAuthorisationResult);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransaction5";
				definition = "Card transaction for which the financial authorisation is requested.";
				previousVersion_lazy = () -> CardTransaction15.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentServiceType7Code getTransactionType() {
		return transactionType;
	}

	public CardTransaction5 setTransactionType(CardPaymentServiceType7Code transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public List<CardPaymentServiceType8Code> getAdditionalService() {
		return additionalService == null ? additionalService = new ArrayList<>() : additionalService;
	}

	public CardTransaction5 setAdditionalService(List<CardPaymentServiceType8Code> additionalService) {
		this.additionalService = Objects.requireNonNull(additionalService);
		return this;
	}

	public Optional<CardPaymentServiceType3Code> getServiceAttribute() {
		return serviceAttribute == null ? Optional.empty() : Optional.of(serviceAttribute);
	}

	public CardTransaction5 setServiceAttribute(CardPaymentServiceType3Code serviceAttribute) {
		this.serviceAttribute = serviceAttribute;
		return this;
	}

	public Optional<Min3Max4NumericText> getMerchantCategoryCode() {
		return merchantCategoryCode == null ? Optional.empty() : Optional.of(merchantCategoryCode);
	}

	public CardTransaction5 setMerchantCategoryCode(Min3Max4NumericText merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
		return this;
	}

	public Optional<TransactionIdentifier2> getReconciliation() {
		return reconciliation == null ? Optional.empty() : Optional.of(reconciliation);
	}

	public CardTransaction5 setReconciliation(TransactionIdentifier2 reconciliation) {
		this.reconciliation = reconciliation;
		return this;
	}

	public ISODateTime getAcceptorTransactionDateTime() {
		return acceptorTransactionDateTime;
	}

	public CardTransaction5 setAcceptorTransactionDateTime(ISODateTime acceptorTransactionDateTime) {
		this.acceptorTransactionDateTime = Objects.requireNonNull(acceptorTransactionDateTime);
		return this;
	}

	public Max35Text getAcceptorTransactionIdentification() {
		return acceptorTransactionIdentification;
	}

	public CardTransaction5 setAcceptorTransactionIdentification(Max35Text acceptorTransactionIdentification) {
		this.acceptorTransactionIdentification = Objects.requireNonNull(acceptorTransactionIdentification);
		return this;
	}

	public Max35Text getInitiatorTransactionIdentification() {
		return initiatorTransactionIdentification;
	}

	public CardTransaction5 setInitiatorTransactionIdentification(Max35Text initiatorTransactionIdentification) {
		this.initiatorTransactionIdentification = Objects.requireNonNull(initiatorTransactionIdentification);
		return this;
	}

	public Optional<Max35Text> getTransactionLifeCycleIdentification() {
		return transactionLifeCycleIdentification == null ? Optional.empty() : Optional.of(transactionLifeCycleIdentification);
	}

	public CardTransaction5 setTransactionLifeCycleIdentification(Max35Text transactionLifeCycleIdentification) {
		this.transactionLifeCycleIdentification = transactionLifeCycleIdentification;
		return this;
	}

	public Optional<Number> getTransactionLifeCycleSequenceNumber() {
		return transactionLifeCycleSequenceNumber == null ? Optional.empty() : Optional.of(transactionLifeCycleSequenceNumber);
	}

	public CardTransaction5 setTransactionLifeCycleSequenceNumber(Number transactionLifeCycleSequenceNumber) {
		this.transactionLifeCycleSequenceNumber = transactionLifeCycleSequenceNumber;
		return this;
	}

	public Optional<Number> getTransactionLifeCycleSequenceCounter() {
		return transactionLifeCycleSequenceCounter == null ? Optional.empty() : Optional.of(transactionLifeCycleSequenceCounter);
	}

	public CardTransaction5 setTransactionLifeCycleSequenceCounter(Number transactionLifeCycleSequenceCounter) {
		this.transactionLifeCycleSequenceCounter = transactionLifeCycleSequenceCounter;
		return this;
	}

	public Optional<Max35NumericText> getAcquirerTransactionReference() {
		return acquirerTransactionReference == null ? Optional.empty() : Optional.of(acquirerTransactionReference);
	}

	public CardTransaction5 setAcquirerTransactionReference(Max35NumericText acquirerTransactionReference) {
		this.acquirerTransactionReference = acquirerTransactionReference;
		return this;
	}

	public Optional<Max140Text> getCardIssuerReferenceData() {
		return cardIssuerReferenceData == null ? Optional.empty() : Optional.of(cardIssuerReferenceData);
	}

	public CardTransaction5 setCardIssuerReferenceData(Max140Text cardIssuerReferenceData) {
		this.cardIssuerReferenceData = cardIssuerReferenceData;
		return this;
	}

	public Optional<CardTransaction3> getOriginalTransaction() {
		return originalTransaction == null ? Optional.empty() : Optional.of(originalTransaction);
	}

	public CardTransaction5 setOriginalTransaction(CardTransaction3 originalTransaction) {
		this.originalTransaction = originalTransaction;
		return this;
	}

	public CardTransactionDetail3 getTransactionDetails() {
		return transactionDetails;
	}

	public CardTransaction5 setTransactionDetails(CardTransactionDetail3 transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}

	public Optional<AuthorisationResult7> getAuthorisationResult() {
		return authorisationResult == null ? Optional.empty() : Optional.of(authorisationResult);
	}

	public CardTransaction5 setAuthorisationResult(AuthorisationResult7 authorisationResult) {
		this.authorisationResult = authorisationResult;
		return this;
	}
}