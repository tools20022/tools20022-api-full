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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Min3Max4NumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.MerchantRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AuthorisationResult7;
import com.tools20022.repository.msg.CardTransaction3;
import com.tools20022.repository.msg.CardTransactionDetail1;
import com.tools20022.repository.msg.TransactionIdentifier2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card transaction for which the authorisation is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionType
 * CardTransaction15.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAdditionalService
 * CardTransaction15.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmServiceAttribute
 * CardTransaction15.mmServiceAttribute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmMerchantCategoryCode
 * CardTransaction15.mmMerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmReconciliation
 * CardTransaction15.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionDateTime
 * CardTransaction15.mmAcceptorTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionIdentification
 * CardTransaction15.mmAcceptorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmInitiatorTransactionIdentification
 * CardTransaction15.mmInitiatorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionLifeCycleIdentification
 * CardTransaction15.mmTransactionLifeCycleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionLifeCycleSequenceNumber
 * CardTransaction15.mmTransactionLifeCycleSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionLifeCycleSequenceCounter
 * CardTransaction15.mmTransactionLifeCycleSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmOriginalTransaction
 * CardTransaction15.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionDetails
 * CardTransaction15.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAuthorisationResult
 * CardTransaction15.mmAuthorisationResult}</li>
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
 * "CardTransaction15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Card transaction for which the authorisation is requested."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction4
 * CardTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction5
 * CardTransaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction3
 * CardTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction7
 * CardTransaction7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransaction15", propOrder = {"transactionType", "additionalService", "serviceAttribute", "merchantCategoryCode", "reconciliation", "acceptorTransactionDateTime", "acceptorTransactionIdentification",
		"initiatorTransactionIdentification", "transactionLifeCycleIdentification", "transactionLifeCycleSequenceNumber", "transactionLifeCycleSequenceCounter", "originalTransaction", "transactionDetails", "authorisationResult"})
public class CardTransaction15 {

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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionType
	 * CardTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionType
	 * CardTransaction5.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionType
	 * CardTransaction7.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, CardPaymentServiceType7Code> mmTransactionType = new MMMessageAttribute<CardTransaction15, CardPaymentServiceType7Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction being undertaken for the main service. \r\nIt correspond partially to the ISO 8583 field number 3.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmTransactionType, CardTransaction5.mmTransactionType, CardTransaction7.mmTransactionType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType7Code.mmObject();
		}

		@Override
		public CardPaymentServiceType7Code getValue(CardTransaction15 obj) {
			return obj.getTransactionType();
		}

		@Override
		public void setValue(CardTransaction15 obj, CardPaymentServiceType7Code value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAdditionalService
	 * CardTransaction5.mmAdditionalService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, List<CardPaymentServiceType8Code>> mmAdditionalService = new MMMessageAttribute<CardTransaction15, List<CardPaymentServiceType8Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service. \r\nIt correspond partially to the ISO 8583: 2003 field number 22-3.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction5.mmAdditionalService);
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType8Code.mmObject();
		}

		@Override
		public List<CardPaymentServiceType8Code> getValue(CardTransaction15 obj) {
			return obj.getAdditionalService();
		}

		@Override
		public void setValue(CardTransaction15 obj, List<CardPaymentServiceType8Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmServiceAttribute
	 * CardTransaction5.mmServiceAttribute}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, Optional<CardPaymentServiceType3Code>> mmServiceAttribute = new MMMessageAttribute<CardTransaction15, Optional<CardPaymentServiceType3Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "SvcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAttribute";
			definition = "Additional attribute of the service type. \r\nIt correspond partially to the ISO 8583: 2003 field number 22-3.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction5.mmServiceAttribute);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType3Code.mmObject();
		}

		@Override
		public Optional<CardPaymentServiceType3Code> getValue(CardTransaction15 obj) {
			return obj.getServiceAttribute();
		}

		@Override
		public void setValue(CardTransaction15 obj, Optional<CardPaymentServiceType3Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmMerchantCategoryCode
	 * CardTransaction5.mmMerchantCategoryCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, Optional<Min3Max4NumericText>> mmMerchantCategoryCode = new MMMessageAttribute<CardTransaction15, Optional<Min3Max4NumericText>>() {
		{
			businessElementTrace_lazy = () -> MerchantRole.mmMerchantCategoryCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "MrchntCtgyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction. \r\nIt correspond to the ISO 8583 field number 18 for the version 87, field numbers 18 and 26 for the version 93, and field number 26 for the version 2003.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction5.mmMerchantCategoryCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min3Max4NumericText.mmObject();
		}

		@Override
		public Optional<Min3Max4NumericText> getValue(CardTransaction15 obj) {
			return obj.getMerchantCategoryCode();
		}

		@Override
		public void setValue(CardTransaction15 obj, Optional<Min3Max4NumericText> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmReconciliation
	 * CardTransaction4.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmReconciliation
	 * CardTransaction5.mmReconciliation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction15, Optional<TransactionIdentifier2>> mmReconciliation = new MMMessageAssociationEnd<CardTransaction15, Optional<TransactionIdentifier2>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "Rcncltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Identification of the reconciliation period between the acquirer and the issuer or their respective agents.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmReconciliation, CardTransaction5.mmReconciliation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier2.mmObject();
		}

		@Override
		public Optional<TransactionIdentifier2> getValue(CardTransaction15 obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(CardTransaction15 obj, Optional<TransactionIdentifier2> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmAcceptorTransactionDateTime
	 * CardTransaction4.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcceptorTransactionDateTime
	 * CardTransaction5.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#mmAcceptorTransactionDateTime
	 * CardTransaction3.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmAcceptorTransactionDateTime
	 * CardTransaction7.mmAcceptorTransactionDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, ISODateTime> mmAcceptorTransactionDateTime = new MMMessageAttribute<CardTransaction15, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AccptrTxDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorTransactionDateTime";
			definition = "Date and time of the transaction transported unchanged by the acquirer from the card acceptor to the issuer. Corresponds to the CAPE data element TransactionIdentification/ TransactionDateTime.\r\nIt correspond to the ISO 8583 field number 12.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmAcceptorTransactionDateTime, CardTransaction5.mmAcceptorTransactionDateTime, CardTransaction3.mmAcceptorTransactionDateTime,
					CardTransaction7.mmAcceptorTransactionDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CardTransaction15 obj) {
			return obj.getAcceptorTransactionDateTime();
		}

		@Override
		public void setValue(CardTransaction15 obj, ISODateTime value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcceptorTransactionIdentification
	 * CardTransaction5.mmAcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmAcceptorTransactionIdentification
	 * CardTransaction7.mmAcceptorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, Max35Text> mmAcceptorTransactionIdentification = new MMMessageAttribute<CardTransaction15, Max35Text>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AccptrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorTransactionIdentification";
			definition = "Unique transaction identification generated by the acceptor or the acquirer transported unchanged by the acquirer from the card acceptor to the issuer. It is used to assist locating the original source information. Eventually it could be included in the cardholder statement. It corresponds to ISO 8583, field 37 and CAPE data element TransactionIdentification/TransactionReference.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction5.mmAcceptorTransactionIdentification, CardTransaction7.mmAcceptorTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardTransaction15 obj) {
			return obj.getAcceptorTransactionIdentification();
		}

		@Override
		public void setValue(CardTransaction15 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmInitiatorTransactionIdentification
	 * CardTransaction4.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmInitiatorTransactionIdentification
	 * CardTransaction5.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#mmInitiatorTransactionIdentification
	 * CardTransaction3.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmInitiatorTransactionIdentification
	 * CardTransaction7.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, Max35Text> mmInitiatorTransactionIdentification = new MMMessageAttribute<CardTransaction15, Max35Text>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Number generated by the transaction Initiator to assist in identifying a transaction uniquely. This value remains unchanged for all messages within a message pair exchange, for instance an initiation/response. It corresponds to the ISO 8583 field number 11.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmInitiatorTransactionIdentification, CardTransaction5.mmInitiatorTransactionIdentification, CardTransaction3.mmInitiatorTransactionIdentification,
					CardTransaction7.mmInitiatorTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardTransaction15 obj) {
			return obj.getInitiatorTransactionIdentification();
		}

		@Override
		public void setValue(CardTransaction15 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionLifeCycleIdentification
	 * CardTransaction4.mmTransactionLifeCycleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionLifeCycleIdentification
	 * CardTransaction5.mmTransactionLifeCycleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionLifeCycleIdentification
	 * CardTransaction7.mmTransactionLifeCycleIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, Optional<Max35Text>> mmTransactionLifeCycleIdentification = new MMMessageAttribute<CardTransaction15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleIdentification";
			definition = "Unique identification to match transactions throughout their life cycle (for example, authorisation to financial presentment, financial presentment to chargeback). It shall contain the same value in all messages throughout a transaction’s life cycle. It corresponds partially to ISO 8583: 2003 field number 21.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmTransactionLifeCycleIdentification, CardTransaction5.mmTransactionLifeCycleIdentification, CardTransaction7.mmTransactionLifeCycleIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardTransaction15 obj) {
			return obj.getTransactionLifeCycleIdentification();
		}

		@Override
		public void setValue(CardTransaction15 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * "Life cycle transaction sequence number when multiple authorisations are performed for the same presentment.\r\nIt corresponds partially to ISO 8583: 2003, field number 21."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionLifeCycleSequenceNumber
	 * CardTransaction4.mmTransactionLifeCycleSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionLifeCycleSequenceNumber
	 * CardTransaction5.mmTransactionLifeCycleSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionLifeCycleSequenceNumber
	 * CardTransaction7.mmTransactionLifeCycleSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, Optional<Number>> mmTransactionLifeCycleSequenceNumber = new MMMessageAttribute<CardTransaction15, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleSequenceNumber";
			definition = "Life cycle transaction sequence number when multiple authorisations are performed for the same presentment.\r\nIt corresponds partially to ISO 8583: 2003, field number 21.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmTransactionLifeCycleSequenceNumber, CardTransaction5.mmTransactionLifeCycleSequenceNumber, CardTransaction7.mmTransactionLifeCycleSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardTransaction15 obj) {
			return obj.getTransactionLifeCycleSequenceNumber();
		}

		@Override
		public void setValue(CardTransaction15 obj, Optional<Number> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionLifeCycleSequenceCounter
	 * CardTransaction5.mmTransactionLifeCycleSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction15, Optional<Number>> mmTransactionLifeCycleSequenceCounter = new MMMessageAttribute<CardTransaction15, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclSeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleSequenceCounter";
			definition = "Total number of transactions under the same life cycle transaction sequence number.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction5.mmTransactionLifeCycleSequenceCounter);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardTransaction15 obj) {
			return obj.getTransactionLifeCycleSequenceCounter();
		}

		@Override
		public void setValue(CardTransaction15 obj, Optional<Number> value) {
			obj.setTransactionLifeCycleSequenceCounter(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * "Identification of the original transaction.\r\nIt corresponds to ISO 8583 field number 90 for the version 87, and field number 56 for the other versions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmOriginalTransaction
	 * CardTransaction5.mmOriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmOriginalTransaction
	 * CardTransaction7.mmOriginalTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction15, Optional<CardTransaction3>> mmOriginalTransaction = new MMMessageAssociationEnd<CardTransaction15, Optional<CardTransaction3>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransaction";
			definition = "Identification of the original transaction.\r\nIt corresponds to ISO 8583 field number 90 for the version 87, and field number 56 for the other versions.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction5.mmOriginalTransaction, CardTransaction7.mmOriginalTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardTransaction3.mmObject();
		}

		@Override
		public Optional<CardTransaction3> getValue(CardTransaction15 obj) {
			return obj.getOriginalTransaction();
		}

		@Override
		public void setValue(CardTransaction15 obj, Optional<CardTransaction3> value) {
			obj.setOriginalTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls", required = true)
	protected CardTransactionDetail1 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransactionDetail1
	 * CardTransactionDetail1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionDetails
	 * CardTransaction4.mmTransactionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionDetails
	 * CardTransaction5.mmTransactionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionDetails
	 * CardTransaction7.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction15, CardTransactionDetail1> mmTransactionDetails = new MMMessageAssociationEnd<CardTransaction15, CardTransactionDetail1>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the card transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmTransactionDetails, CardTransaction5.mmTransactionDetails, CardTransaction7.mmTransactionDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransactionDetail1.mmObject();
		}

		@Override
		public CardTransactionDetail1 getValue(CardTransaction15 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(CardTransaction15 obj, CardTransactionDetail1 value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmAuthorisationResult
	 * CardTransaction4.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAuthorisationResult
	 * CardTransaction5.mmAuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction15, Optional<AuthorisationResult7>> mmAuthorisationResult = new MMMessageAssociationEnd<CardTransaction15, Optional<AuthorisationResult7>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmAuthorisationResult, CardTransaction5.mmAuthorisationResult);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthorisationResult7.mmObject();
		}

		@Override
		public Optional<AuthorisationResult7> getValue(CardTransaction15 obj) {
			return obj.getAuthorisationResult();
		}

		@Override
		public void setValue(CardTransaction15 obj, Optional<AuthorisationResult7> value) {
			obj.setAuthorisationResult(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction15.mmTransactionType, com.tools20022.repository.msg.CardTransaction15.mmAdditionalService,
						com.tools20022.repository.msg.CardTransaction15.mmServiceAttribute, com.tools20022.repository.msg.CardTransaction15.mmMerchantCategoryCode, com.tools20022.repository.msg.CardTransaction15.mmReconciliation,
						com.tools20022.repository.msg.CardTransaction15.mmAcceptorTransactionDateTime, com.tools20022.repository.msg.CardTransaction15.mmAcceptorTransactionIdentification,
						com.tools20022.repository.msg.CardTransaction15.mmInitiatorTransactionIdentification, com.tools20022.repository.msg.CardTransaction15.mmTransactionLifeCycleIdentification,
						com.tools20022.repository.msg.CardTransaction15.mmTransactionLifeCycleSequenceNumber, com.tools20022.repository.msg.CardTransaction15.mmTransactionLifeCycleSequenceCounter,
						com.tools20022.repository.msg.CardTransaction15.mmOriginalTransaction, com.tools20022.repository.msg.CardTransaction15.mmTransactionDetails, com.tools20022.repository.msg.CardTransaction15.mmAuthorisationResult);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransaction15";
				definition = "Card transaction for which the authorisation is requested.";
				nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmObject(), CardTransaction5.mmObject(), CardTransaction3.mmObject(), CardTransaction7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentServiceType7Code getTransactionType() {
		return transactionType;
	}

	public CardTransaction15 setTransactionType(CardPaymentServiceType7Code transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public List<CardPaymentServiceType8Code> getAdditionalService() {
		return additionalService == null ? additionalService = new ArrayList<>() : additionalService;
	}

	public CardTransaction15 setAdditionalService(List<CardPaymentServiceType8Code> additionalService) {
		this.additionalService = Objects.requireNonNull(additionalService);
		return this;
	}

	public Optional<CardPaymentServiceType3Code> getServiceAttribute() {
		return serviceAttribute == null ? Optional.empty() : Optional.of(serviceAttribute);
	}

	public CardTransaction15 setServiceAttribute(CardPaymentServiceType3Code serviceAttribute) {
		this.serviceAttribute = serviceAttribute;
		return this;
	}

	public Optional<Min3Max4NumericText> getMerchantCategoryCode() {
		return merchantCategoryCode == null ? Optional.empty() : Optional.of(merchantCategoryCode);
	}

	public CardTransaction15 setMerchantCategoryCode(Min3Max4NumericText merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
		return this;
	}

	public Optional<TransactionIdentifier2> getReconciliation() {
		return reconciliation == null ? Optional.empty() : Optional.of(reconciliation);
	}

	public CardTransaction15 setReconciliation(TransactionIdentifier2 reconciliation) {
		this.reconciliation = reconciliation;
		return this;
	}

	public ISODateTime getAcceptorTransactionDateTime() {
		return acceptorTransactionDateTime;
	}

	public CardTransaction15 setAcceptorTransactionDateTime(ISODateTime acceptorTransactionDateTime) {
		this.acceptorTransactionDateTime = Objects.requireNonNull(acceptorTransactionDateTime);
		return this;
	}

	public Max35Text getAcceptorTransactionIdentification() {
		return acceptorTransactionIdentification;
	}

	public CardTransaction15 setAcceptorTransactionIdentification(Max35Text acceptorTransactionIdentification) {
		this.acceptorTransactionIdentification = Objects.requireNonNull(acceptorTransactionIdentification);
		return this;
	}

	public Max35Text getInitiatorTransactionIdentification() {
		return initiatorTransactionIdentification;
	}

	public CardTransaction15 setInitiatorTransactionIdentification(Max35Text initiatorTransactionIdentification) {
		this.initiatorTransactionIdentification = Objects.requireNonNull(initiatorTransactionIdentification);
		return this;
	}

	public Optional<Max35Text> getTransactionLifeCycleIdentification() {
		return transactionLifeCycleIdentification == null ? Optional.empty() : Optional.of(transactionLifeCycleIdentification);
	}

	public CardTransaction15 setTransactionLifeCycleIdentification(Max35Text transactionLifeCycleIdentification) {
		this.transactionLifeCycleIdentification = transactionLifeCycleIdentification;
		return this;
	}

	public Optional<Number> getTransactionLifeCycleSequenceNumber() {
		return transactionLifeCycleSequenceNumber == null ? Optional.empty() : Optional.of(transactionLifeCycleSequenceNumber);
	}

	public CardTransaction15 setTransactionLifeCycleSequenceNumber(Number transactionLifeCycleSequenceNumber) {
		this.transactionLifeCycleSequenceNumber = transactionLifeCycleSequenceNumber;
		return this;
	}

	public Optional<Number> getTransactionLifeCycleSequenceCounter() {
		return transactionLifeCycleSequenceCounter == null ? Optional.empty() : Optional.of(transactionLifeCycleSequenceCounter);
	}

	public CardTransaction15 setTransactionLifeCycleSequenceCounter(Number transactionLifeCycleSequenceCounter) {
		this.transactionLifeCycleSequenceCounter = transactionLifeCycleSequenceCounter;
		return this;
	}

	public Optional<CardTransaction3> getOriginalTransaction() {
		return originalTransaction == null ? Optional.empty() : Optional.of(originalTransaction);
	}

	public CardTransaction15 setOriginalTransaction(CardTransaction3 originalTransaction) {
		this.originalTransaction = originalTransaction;
		return this;
	}

	public CardTransactionDetail1 getTransactionDetails() {
		return transactionDetails;
	}

	public CardTransaction15 setTransactionDetails(CardTransactionDetail1 transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}

	public Optional<AuthorisationResult7> getAuthorisationResult() {
		return authorisationResult == null ? Optional.empty() : Optional.of(authorisationResult);
	}

	public CardTransaction15 setAuthorisationResult(AuthorisationResult7 authorisationResult) {
		this.authorisationResult = authorisationResult;
		return this;
	}
}