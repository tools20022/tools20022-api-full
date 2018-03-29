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
import com.tools20022.repository.codeset.CardPaymentServiceType5Code;
import com.tools20022.repository.codeset.CardPaymentServiceType9Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Min3Max4Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentTransaction52;
import com.tools20022.repository.msg.CardPaymentTransactionDetails41;
import com.tools20022.repository.msg.TransactionIdentifier1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data associated with the transaction during the authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionCapture
 * CardPaymentTransaction76.mmTransactionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionType
 * CardPaymentTransaction76.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmAdditionalService
 * CardPaymentTransaction76.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmServiceAttribute
 * CardPaymentTransaction76.mmServiceAttribute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmMerchantCategoryCode
 * CardPaymentTransaction76.mmMerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmCustomerConsent
 * CardPaymentTransaction76.mmCustomerConsent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmCardProgrammeProposed
 * CardPaymentTransaction76.mmCardProgrammeProposed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmCardProgrammeApplied
 * CardPaymentTransaction76.mmCardProgrammeApplied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmSaleReferenceIdentification
 * CardPaymentTransaction76.mmSaleReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionIdentification
 * CardPaymentTransaction76.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmOriginalTransaction
 * CardPaymentTransaction76.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmInitiatorTransactionIdentification
 * CardPaymentTransaction76.mmInitiatorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmReconciliationIdentification
 * CardPaymentTransaction76.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionDetails
 * CardPaymentTransaction76.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmMerchantReferenceData
 * CardPaymentTransaction76.mmMerchantReferenceData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmAdditionalTransactionData
 * CardPaymentTransaction76.mmAdditionalTransactionData}</li>
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
 * "CardPaymentTransaction76"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data associated with the transaction during the authorisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction80
 * CardPaymentTransaction80}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51
 * CardPaymentTransaction51}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentTransaction76", propOrder = {"transactionCapture", "transactionType", "additionalService", "serviceAttribute", "merchantCategoryCode", "customerConsent", "cardProgrammeProposed", "cardProgrammeApplied",
		"saleReferenceIdentification", "transactionIdentification", "originalTransaction", "initiatorTransactionIdentification", "reconciliationIdentification", "transactionDetails", "merchantReferenceData", "additionalTransactionData"})
public class CardPaymentTransaction76 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxCaptr", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmTransactionCapture
	 * CardPaymentTransaction80.mmTransactionCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmTransactionCapture
	 * CardPaymentTransaction51.mmTransactionCapture}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, TrueFalseIndicator> mmTransactionCapture = new MMMessageAttribute<CardPaymentTransaction76, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "TxCaptr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCapture";
			definition = "Flag indicating whether the transaction data must be captured or not in addition to the message process.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmTransactionCapture);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmTransactionCapture;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentTransaction76 obj) {
			return obj.getTransactionCapture();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, TrueFalseIndicator value) {
			obj.setTransactionCapture(value);
		}
	};
	@XmlElement(name = "TxTp", required = true)
	protected CardPaymentServiceType5Code transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmTransactionType
	 * CardPaymentTransaction80.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmTransactionType
	 * CardPaymentTransaction51.mmTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, CardPaymentServiceType5Code> mmTransactionType = new MMMessageAttribute<CardPaymentTransaction76, CardPaymentServiceType5Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction being undertaken for the main service.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmTransactionType);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType5Code.mmObject();
		}

		@Override
		public CardPaymentServiceType5Code getValue(CardPaymentTransaction76 obj) {
			return obj.getTransactionType();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, CardPaymentServiceType5Code value) {
			obj.setTransactionType(value);
		}
	};
	@XmlElement(name = "AddtlSvc")
	protected List<CardPaymentServiceType9Code> additionalService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmAdditionalService
	 * CardPaymentTransaction80.mmAdditionalService}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmAdditionalService
	 * CardPaymentTransaction51.mmAdditionalService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, List<CardPaymentServiceType9Code>> mmAdditionalService = new MMMessageAttribute<CardPaymentTransaction76, List<CardPaymentServiceType9Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmAdditionalService);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmAdditionalService;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType9Code.mmObject();
		}

		@Override
		public List<CardPaymentServiceType9Code> getValue(CardPaymentTransaction76 obj) {
			return obj.getAdditionalService();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, List<CardPaymentServiceType9Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmServiceAttribute
	 * CardPaymentTransaction80.mmServiceAttribute}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmServiceAttribute
	 * CardPaymentTransaction51.mmServiceAttribute}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, Optional<CardPaymentServiceType3Code>> mmServiceAttribute = new MMMessageAttribute<CardPaymentTransaction76, Optional<CardPaymentServiceType3Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "SvcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAttribute";
			definition = "Additional attribute of the service type.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmServiceAttribute);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmServiceAttribute;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType3Code.mmObject();
		}

		@Override
		public Optional<CardPaymentServiceType3Code> getValue(CardPaymentTransaction76 obj) {
			return obj.getServiceAttribute();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, Optional<CardPaymentServiceType3Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmMerchantCategoryCode
	 * CardPaymentTransaction80.mmMerchantCategoryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmMerchantCategoryCode
	 * CardPaymentTransaction51.mmMerchantCategoryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, Min3Max4Text> mmMerchantCategoryCode = new MMMessageAttribute<CardPaymentTransaction76, Min3Max4Text>() {
		{
			businessElementTrace_lazy = () -> MerchantRole.mmMerchantCategoryCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "MrchntCtgyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmMerchantCategoryCode);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmMerchantCategoryCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}

		@Override
		public Min3Max4Text getValue(CardPaymentTransaction76 obj) {
			return obj.getMerchantCategoryCode();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, Min3Max4Text value) {
			obj.setMerchantCategoryCode(value);
		}
	};
	@XmlElement(name = "CstmrCnsnt")
	protected List<TrueFalseIndicator> customerConsent;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCnsnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConsent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This enables retailers, if they so wish, to clearly indicate whether the consent of the customer was explicitly obtained for a given service instead of being implicitly derived."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmCustomerConsent
	 * CardPaymentTransaction80.mmCustomerConsent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, List<TrueFalseIndicator>> mmCustomerConsent = new MMMessageAttribute<CardPaymentTransaction76, List<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "CstmrCnsnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConsent";
			definition = "This enables retailers, if they so wish, to clearly indicate whether the consent of the customer was explicitly obtained for a given service instead of being implicitly derived.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmCustomerConsent);
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public List<TrueFalseIndicator> getValue(CardPaymentTransaction76 obj) {
			return obj.getCustomerConsent();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, List<TrueFalseIndicator> value) {
			obj.setCustomerConsent(value);
		}
	};
	@XmlElement(name = "CardPrgrmmPropsd")
	protected List<Max35Text> cardProgrammeProposed;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardProgramme
	 * PaymentCard.mmCardProgramme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPrgrmmPropsd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProgrammeProposed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmCardProgrammeProposed
	 * CardPaymentTransaction80.mmCardProgrammeProposed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, List<Max35Text>> mmCardProgrammeProposed = new MMMessageAttribute<CardPaymentTransaction76, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardProgramme;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "CardPrgrmmPropsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProgrammeProposed";
			definition = "The card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmCardProgrammeProposed);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(CardPaymentTransaction76 obj) {
			return obj.getCardProgrammeProposed();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, List<Max35Text> value) {
			obj.setCardProgrammeProposed(value);
		}
	};
	@XmlElement(name = "CardPrgrmmApld")
	protected List<Max35Text> cardProgrammeApplied;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardProgramme
	 * PaymentCard.mmCardProgramme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPrgrmmApld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProgrammeApplied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The card program actually selected by the cardholder among the ones supported by the retailer and/or the one actually proposed to him."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmCardProgrammeApplied
	 * CardPaymentTransaction80.mmCardProgrammeApplied}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, List<Max35Text>> mmCardProgrammeApplied = new MMMessageAttribute<CardPaymentTransaction76, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardProgramme;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "CardPrgrmmApld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProgrammeApplied";
			definition = "The card program actually selected by the cardholder among the ones supported by the retailer and/or the one actually proposed to him.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmCardProgrammeApplied);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(CardPaymentTransaction76 obj) {
			return obj.getCardProgrammeApplied();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, List<Max35Text> value) {
			obj.setCardProgrammeApplied(value);
		}
	};
	@XmlElement(name = "SaleRefId")
	protected Max35Text saleReferenceIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global reference of the sale transaction for the sale system."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmSaleReferenceIdentification
	 * CardPaymentTransaction80.mmSaleReferenceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmSaleReferenceIdentification
	 * CardPaymentTransaction51.mmSaleReferenceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, Optional<Max35Text>> mmSaleReferenceIdentification = new MMMessageAttribute<CardPaymentTransaction76, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "SaleRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceIdentification";
			definition = "Global reference of the sale transaction for the sale system.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmSaleReferenceIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmSaleReferenceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransaction76 obj) {
			return obj.getSaleReferenceIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, Optional<Max35Text> value) {
			obj.setSaleReferenceIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * "Identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmTransactionIdentification
	 * CardPaymentTransaction80.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmTransactionIdentification
	 * CardPaymentTransaction51.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction76, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<CardPaymentTransaction76, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmTransactionIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(CardPaymentTransaction76 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlTx")
	protected CardPaymentTransaction52 originalTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52
	 * CardPaymentTransaction52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmOriginalTransaction
	 * CardPaymentTransaction80.mmOriginalTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmOriginalTransaction
	 * CardPaymentTransaction51.mmOriginalTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction76, Optional<CardPaymentTransaction52>> mmOriginalTransaction = new MMMessageAssociationEnd<CardPaymentTransaction76, Optional<CardPaymentTransaction52>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransaction";
			definition = "Identification of the original transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmOriginalTransaction);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmOriginalTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction52.mmObject();
		}

		@Override
		public Optional<CardPaymentTransaction52> getValue(CardPaymentTransaction76 obj) {
			return obj.getOriginalTransaction();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, Optional<CardPaymentTransaction52> value) {
			obj.setOriginalTransaction(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction80.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction51.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, Optional<Max35Text>> mmInitiatorTransactionIdentification = new MMMessageAttribute<CardPaymentTransaction76, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmInitiatorTransactionIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmInitiatorTransactionIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmInitiatorTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransaction76 obj) {
			return obj.getInitiatorTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, Optional<Max35Text> value) {
			obj.setInitiatorTransactionIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmReconciliationIdentification
	 * CardPaymentTransaction80.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmReconciliationIdentification
	 * CardPaymentTransaction51.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, Optional<Max35Text>> mmReconciliationIdentification = new MMMessageAttribute<CardPaymentTransaction76, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmReconciliationIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransaction76 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, Optional<Max35Text> value) {
			obj.setReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls", required = true)
	protected CardPaymentTransactionDetails41 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41
	 * CardPaymentTransactionDetails41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmTransactionDetails
	 * CardPaymentTransaction80.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmTransactionDetails
	 * CardPaymentTransaction51.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction76, CardPaymentTransactionDetails41> mmTransactionDetails = new MMMessageAssociationEnd<CardPaymentTransaction76, CardPaymentTransactionDetails41>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmTransactionDetails);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransactionDetails41.mmObject();
		}

		@Override
		public CardPaymentTransactionDetails41 getValue(CardPaymentTransaction76 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, CardPaymentTransactionDetails41 value) {
			obj.setTransactionDetails(value);
		}
	};
	@XmlElement(name = "MrchntRefData")
	protected Max70Text merchantReferenceData;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntRefData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantReferenceData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant information that must be returned unchanged in the response."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmMerchantReferenceData
	 * CardPaymentTransaction80.mmMerchantReferenceData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmMerchantReferenceData
	 * CardPaymentTransaction51.mmMerchantReferenceData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, Optional<Max70Text>> mmMerchantReferenceData = new MMMessageAttribute<CardPaymentTransaction76, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "MrchntRefData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantReferenceData";
			definition = "Merchant information that must be returned unchanged in the response.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmMerchantReferenceData);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmMerchantReferenceData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CardPaymentTransaction76 obj) {
			return obj.getMerchantReferenceData();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, Optional<Max70Text> value) {
			obj.setMerchantReferenceData(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTxData")
	protected List<Max70Text> additionalTransactionData;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
	 * CardPaymentTransaction76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmAdditionalTransactionData
	 * CardPaymentTransaction80.mmAdditionalTransactionData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmAdditionalTransactionData
	 * CardPaymentTransaction51.mmAdditionalTransactionData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction76, List<Max70Text>> mmAdditionalTransactionData = new MMMessageAttribute<CardPaymentTransaction76, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction76.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionData";
			definition = "Additional information related to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmAdditionalTransactionData);
			previousVersion_lazy = () -> CardPaymentTransaction51.mmAdditionalTransactionData;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(CardPaymentTransaction76 obj) {
			return obj.getAdditionalTransactionData();
		}

		@Override
		public void setValue(CardPaymentTransaction76 obj, List<Max70Text> value) {
			obj.setAdditionalTransactionData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction76.mmTransactionCapture, com.tools20022.repository.msg.CardPaymentTransaction76.mmTransactionType,
						com.tools20022.repository.msg.CardPaymentTransaction76.mmAdditionalService, com.tools20022.repository.msg.CardPaymentTransaction76.mmServiceAttribute,
						com.tools20022.repository.msg.CardPaymentTransaction76.mmMerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction76.mmCustomerConsent,
						com.tools20022.repository.msg.CardPaymentTransaction76.mmCardProgrammeProposed, com.tools20022.repository.msg.CardPaymentTransaction76.mmCardProgrammeApplied,
						com.tools20022.repository.msg.CardPaymentTransaction76.mmSaleReferenceIdentification, com.tools20022.repository.msg.CardPaymentTransaction76.mmTransactionIdentification,
						com.tools20022.repository.msg.CardPaymentTransaction76.mmOriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction76.mmInitiatorTransactionIdentification,
						com.tools20022.repository.msg.CardPaymentTransaction76.mmReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction76.mmTransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction76.mmMerchantReferenceData, com.tools20022.repository.msg.CardPaymentTransaction76.mmAdditionalTransactionData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransaction76";
				definition = "Data associated with the transaction during the authorisation.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction80.mmObject());
				previousVersion_lazy = () -> CardPaymentTransaction51.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getTransactionCapture() {
		return transactionCapture;
	}

	public CardPaymentTransaction76 setTransactionCapture(TrueFalseIndicator transactionCapture) {
		this.transactionCapture = Objects.requireNonNull(transactionCapture);
		return this;
	}

	public CardPaymentServiceType5Code getTransactionType() {
		return transactionType;
	}

	public CardPaymentTransaction76 setTransactionType(CardPaymentServiceType5Code transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public List<CardPaymentServiceType9Code> getAdditionalService() {
		return additionalService == null ? additionalService = new ArrayList<>() : additionalService;
	}

	public CardPaymentTransaction76 setAdditionalService(List<CardPaymentServiceType9Code> additionalService) {
		this.additionalService = Objects.requireNonNull(additionalService);
		return this;
	}

	public Optional<CardPaymentServiceType3Code> getServiceAttribute() {
		return serviceAttribute == null ? Optional.empty() : Optional.of(serviceAttribute);
	}

	public CardPaymentTransaction76 setServiceAttribute(CardPaymentServiceType3Code serviceAttribute) {
		this.serviceAttribute = serviceAttribute;
		return this;
	}

	public Min3Max4Text getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public CardPaymentTransaction76 setMerchantCategoryCode(Min3Max4Text merchantCategoryCode) {
		this.merchantCategoryCode = Objects.requireNonNull(merchantCategoryCode);
		return this;
	}

	public List<TrueFalseIndicator> getCustomerConsent() {
		return customerConsent == null ? customerConsent = new ArrayList<>() : customerConsent;
	}

	public CardPaymentTransaction76 setCustomerConsent(List<TrueFalseIndicator> customerConsent) {
		this.customerConsent = Objects.requireNonNull(customerConsent);
		return this;
	}

	public List<Max35Text> getCardProgrammeProposed() {
		return cardProgrammeProposed == null ? cardProgrammeProposed = new ArrayList<>() : cardProgrammeProposed;
	}

	public CardPaymentTransaction76 setCardProgrammeProposed(List<Max35Text> cardProgrammeProposed) {
		this.cardProgrammeProposed = Objects.requireNonNull(cardProgrammeProposed);
		return this;
	}

	public List<Max35Text> getCardProgrammeApplied() {
		return cardProgrammeApplied == null ? cardProgrammeApplied = new ArrayList<>() : cardProgrammeApplied;
	}

	public CardPaymentTransaction76 setCardProgrammeApplied(List<Max35Text> cardProgrammeApplied) {
		this.cardProgrammeApplied = Objects.requireNonNull(cardProgrammeApplied);
		return this;
	}

	public Optional<Max35Text> getSaleReferenceIdentification() {
		return saleReferenceIdentification == null ? Optional.empty() : Optional.of(saleReferenceIdentification);
	}

	public CardPaymentTransaction76 setSaleReferenceIdentification(Max35Text saleReferenceIdentification) {
		this.saleReferenceIdentification = saleReferenceIdentification;
		return this;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public CardPaymentTransaction76 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<CardPaymentTransaction52> getOriginalTransaction() {
		return originalTransaction == null ? Optional.empty() : Optional.of(originalTransaction);
	}

	public CardPaymentTransaction76 setOriginalTransaction(CardPaymentTransaction52 originalTransaction) {
		this.originalTransaction = originalTransaction;
		return this;
	}

	public Optional<Max35Text> getInitiatorTransactionIdentification() {
		return initiatorTransactionIdentification == null ? Optional.empty() : Optional.of(initiatorTransactionIdentification);
	}

	public CardPaymentTransaction76 setInitiatorTransactionIdentification(Max35Text initiatorTransactionIdentification) {
		this.initiatorTransactionIdentification = initiatorTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getReconciliationIdentification() {
		return reconciliationIdentification == null ? Optional.empty() : Optional.of(reconciliationIdentification);
	}

	public CardPaymentTransaction76 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
		return this;
	}

	public CardPaymentTransactionDetails41 getTransactionDetails() {
		return transactionDetails;
	}

	public CardPaymentTransaction76 setTransactionDetails(CardPaymentTransactionDetails41 transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}

	public Optional<Max70Text> getMerchantReferenceData() {
		return merchantReferenceData == null ? Optional.empty() : Optional.of(merchantReferenceData);
	}

	public CardPaymentTransaction76 setMerchantReferenceData(Max70Text merchantReferenceData) {
		this.merchantReferenceData = merchantReferenceData;
		return this;
	}

	public List<Max70Text> getAdditionalTransactionData() {
		return additionalTransactionData == null ? additionalTransactionData = new ArrayList<>() : additionalTransactionData;
	}

	public CardPaymentTransaction76 setAdditionalTransactionData(List<Max70Text> additionalTransactionData) {
		this.additionalTransactionData = Objects.requireNonNull(additionalTransactionData);
		return this;
	}
}