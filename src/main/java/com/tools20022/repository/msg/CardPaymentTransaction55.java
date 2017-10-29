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
import com.tools20022.repository.codeset.CardPaymentServiceType3Code;
import com.tools20022.repository.codeset.CardPaymentServiceType5Code;
import com.tools20022.repository.codeset.CardPaymentServiceType9Code;
import com.tools20022.repository.codeset.FailureReason3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionCapture
 * CardPaymentTransaction55.TransactionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionType
 * CardPaymentTransaction55.TransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#AdditionalService
 * CardPaymentTransaction55.AdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#ServiceAttribute
 * CardPaymentTransaction55.ServiceAttribute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#MerchantCategoryCode
 * CardPaymentTransaction55.MerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#SaleReferenceIdentification
 * CardPaymentTransaction55.SaleReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionIdentification
 * CardPaymentTransaction55.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#OriginalTransaction
 * CardPaymentTransaction55.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionSuccess
 * CardPaymentTransaction55.TransactionSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#Reversal
 * CardPaymentTransaction55.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#MerchantOverride
 * CardPaymentTransaction55.MerchantOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#FailureReason
 * CardPaymentTransaction55.FailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#InitiatorTransactionIdentification
 * CardPaymentTransaction55.InitiatorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#RecipientTransactionIdentification
 * CardPaymentTransaction55.RecipientTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#ReconciliationIdentification
 * CardPaymentTransaction55.ReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#InterchangeData
 * CardPaymentTransaction55.InterchangeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionDetails
 * CardPaymentTransaction55.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#AuthorisationResult
 * CardPaymentTransaction55.AuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionVerificationResult
 * CardPaymentTransaction55.TransactionVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#AdditionalTransactionData
 * CardPaymentTransaction55.AdditionalTransactionData}</li>
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
 * "CardPaymentTransaction55"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transaction information in the completion advice message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction69
 * CardPaymentTransaction69}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40
 * CardPaymentTransaction40}</li>
 * </ul>
 */
public class CardPaymentTransaction55 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Flag indicating whether the transaction data must be captured or not in
	 * addition to the message process.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionCapture
	 * CardPaymentTransaction69.TransactionCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionCapture
	 * CardPaymentTransaction40.TransactionCapture}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransactionCapture = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			isDerived = false;
			xmlTag = "TxCaptr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCapture";
			definition = "Flag indicating whether the transaction data must be captured or not in addition to the message process.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.TransactionCapture;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.TransactionCapture);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Type of transaction being undertaken for the main service.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardPaymentService
	 * CardPaymentAcquiring.CardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionType
	 * CardPaymentTransaction69.TransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionType
	 * CardPaymentTransaction40.TransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransactionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.CardPaymentService;
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction being undertaken for the main service.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.TransactionType;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.TransactionType);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType5Code.mmObject();
		}
	};
	/**
	 * Service in addition to the main service.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardPaymentService
	 * CardPaymentAcquiring.CardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#AdditionalService
	 * CardPaymentTransaction69.AdditionalService}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#AdditionalService
	 * CardPaymentTransaction40.AdditionalService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.CardPaymentService;
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.AdditionalService;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.AdditionalService);
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType9Code.mmObject();
		}
	};
	/**
	 * Additional attribute of the service type.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardPaymentService
	 * CardPaymentAcquiring.CardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#ServiceAttribute
	 * CardPaymentTransaction69.ServiceAttribute}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#ServiceAttribute
	 * CardPaymentTransaction40.ServiceAttribute}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ServiceAttribute = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.CardPaymentService;
			isDerived = false;
			xmlTag = "SvcAttr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAttribute";
			definition = "Additional attribute of the service type.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.ServiceAttribute;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.ServiceAttribute);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType3Code.mmObject();
		}
	};
	/**
	 * Category code conform to ISO 18245, related to the type of services or
	 * goods the merchant provides for the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.MerchantRole#MerchantCategoryCode
	 * MerchantRole.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#MerchantCategoryCode
	 * CardPaymentTransaction69.MerchantCategoryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#MerchantCategoryCode
	 * CardPaymentTransaction40.MerchantCategoryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MerchantCategoryCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MerchantRole.MerchantCategoryCode;
			isDerived = false;
			xmlTag = "MrchntCtgyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.MerchantCategoryCode;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.MerchantCategoryCode);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}
	};
	/**
	 * Global reference of the sale transaction for the sale system.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#SaleReferenceIdentification
	 * CardPaymentTransaction69.SaleReferenceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#SaleReferenceIdentification
	 * CardPaymentTransaction40.SaleReferenceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SaleReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			isDerived = false;
			xmlTag = "SaleRefId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceIdentification";
			definition = "Global reference of the sale transaction for the sale system.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.SaleReferenceIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.SaleReferenceIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification of the transaction assigned by the POI (Point Of
	 * Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionIdentification
	 * CardPaymentAcquiring.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionIdentification
	 * CardPaymentTransaction69.TransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionIdentification
	 * CardPaymentTransaction40.TransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransactionIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.TransactionIdentification;
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification of the transaction assigned by the POI (Point Of Interaction).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.TransactionIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.TransactionIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TransactionIdentifier1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the original transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#OriginalTransaction
	 * CardPaymentTransaction69.OriginalTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#OriginalTransaction
	 * CardPaymentTransaction40.OriginalTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransaction";
			definition = "Identification of the original transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.OriginalTransaction;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.OriginalTransaction);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentTransaction52.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Outcome of the transaction at the acceptor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#TransactionSuccess
	 * CardPaymentValidation.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionSuccess
	 * CardPaymentTransaction69.TransactionSuccess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionSuccess
	 * CardPaymentTransaction40.TransactionSuccess}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransactionSuccess = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.TransactionSuccess;
			isDerived = false;
			xmlTag = "TxSucss";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSuccess";
			definition = "Outcome of the transaction at the acceptor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.TransactionSuccess;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.TransactionSuccess);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Notify that a previous transaction has to be reversed if this original
	 * transaction has been approved by the acquirer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Reversal
	 * CardPaymentAcquiring.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#Reversal
	 * CardPaymentTransaction69.Reversal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#Reversal
	 * CardPaymentTransaction40.Reversal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Reversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.Reversal;
			isDerived = false;
			xmlTag = "Rvsl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.Reversal;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.Reversal);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicate that the acceptor has forced the transaction in spite of the
	 * authorisation result (online or offline), or incident to complete the
	 * transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#MerchantOverride
	 * CardPaymentValidation.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#MerchantOverride
	 * CardPaymentTransaction69.MerchantOverride}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#MerchantOverride
	 * CardPaymentTransaction40.MerchantOverride}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MerchantOverride = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.MerchantOverride;
			isDerived = false;
			xmlTag = "MrchntOvrrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantOverride";
			definition = "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.MerchantOverride;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.MerchantOverride);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * List of incidents during the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason3Code
	 * FailureReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#FailureReason
	 * CardPaymentStatus.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#FailureReason
	 * CardPaymentTransaction69.FailureReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#FailureReason
	 * CardPaymentTransaction40.FailureReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FailureReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.FailureReason;
			isDerived = false;
			xmlTag = "FailrRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailureReason";
			definition = "List of incidents during the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.FailureReason;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.FailureReason);
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason3Code.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the initiating party for
	 * the recipient party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionIdentification
	 * CardPaymentAcquiring.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#InitiatorTransactionIdentification
	 * CardPaymentTransaction69.InitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#InitiatorTransactionIdentification
	 * CardPaymentTransaction40.InitiatorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute InitiatorTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.TransactionIdentification;
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.InitiatorTransactionIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.InitiatorTransactionIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the recipient party for the
	 * initiating party.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#RecipientTransactionIdentification
	 * CardPaymentTransaction69.RecipientTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#RecipientTransactionIdentification
	 * CardPaymentTransaction40.RecipientTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RecipientTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			isDerived = false;
			xmlTag = "RcptTxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientTransactionIdentification";
			definition = "Identification of the transaction assigned by the recipient party for the initiating party.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.RecipientTransactionIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.RecipientTransactionIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification of the reconciliation period between the acceptor
	 * and the acquirer. This identification might be linked to the
	 * identification of the settlement for further verification by the
	 * merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#ReconciliationIdentification
	 * ReconciliationTransaction.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#ReconciliationIdentification
	 * CardPaymentTransaction69.ReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#ReconciliationIdentification
	 * CardPaymentTransaction40.ReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReconciliationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.ReconciliationIdentification;
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.ReconciliationIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.ReconciliationIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Interchange information related to the card scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#InterchangeData
	 * CardPaymentAcquiring.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#InterchangeData
	 * CardPaymentTransaction69.InterchangeData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#InterchangeData
	 * CardPaymentTransaction40.InterchangeData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute InterchangeData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.InterchangeData;
			isDerived = false;
			xmlTag = "IntrchngData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterchangeData";
			definition = "Interchange information related to the card scheme.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.InterchangeData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.InterchangeData);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Details of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29
	 * CardPaymentTransactionDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionDetails
	 * CardPaymentTransaction69.TransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionDetails
	 * CardPaymentTransaction40.TransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransactionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.TransactionDetails;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.TransactionDetails);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentTransactionDetails29.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Outcome of the authorisation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult11
	 * AuthorisationResult11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Validation
	 * CardPaymentAcquiring.Validation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#AuthorisationResult
	 * CardPaymentTransaction69.AuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#AuthorisationResult
	 * CardPaymentTransaction40.AuthorisationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AuthorisationResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.Validation;
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation request.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.AuthorisationResult;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.AuthorisationResult);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AuthorisationResult11.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Result of the performed verifications for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
	 * TransactionVerificationResult4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * "Result of the performed verifications for the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionVerificationResult
	 * CardPaymentTransaction69.TransactionVerificationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionVerificationResult
	 * CardPaymentTransaction40.TransactionVerificationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransactionVerificationResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			isDerived = false;
			xmlTag = "TxVrfctnRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionVerificationResult";
			definition = "Result of the performed verifications for the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.TransactionVerificationResult;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.TransactionVerificationResult);
			minOccurs = 0;
			type_lazy = () -> TransactionVerificationResult4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional information related to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
	 * CardPaymentTransaction55}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#AdditionalTransactionData
	 * CardPaymentTransaction69.AdditionalTransactionData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#AdditionalTransactionData
	 * CardPaymentTransaction40.AdditionalTransactionData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalTransactionData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction55.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionData";
			definition = "Additional information related to the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction40.AdditionalTransactionData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction69.AdditionalTransactionData);
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction55.TransactionCapture, com.tools20022.repository.msg.CardPaymentTransaction55.TransactionType,
						com.tools20022.repository.msg.CardPaymentTransaction55.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction55.ServiceAttribute,
						com.tools20022.repository.msg.CardPaymentTransaction55.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction55.SaleReferenceIdentification,
						com.tools20022.repository.msg.CardPaymentTransaction55.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction55.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction55.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction55.Reversal, com.tools20022.repository.msg.CardPaymentTransaction55.MerchantOverride,
						com.tools20022.repository.msg.CardPaymentTransaction55.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction55.InitiatorTransactionIdentification,
						com.tools20022.repository.msg.CardPaymentTransaction55.RecipientTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction55.ReconciliationIdentification,
						com.tools20022.repository.msg.CardPaymentTransaction55.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction55.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction55.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction55.TransactionVerificationResult,
						com.tools20022.repository.msg.CardPaymentTransaction55.AdditionalTransactionData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransaction55";
				definition = "Transaction information in the completion advice message.";
				previousVersion_lazy = () -> CardPaymentTransaction40.mmObject();
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction69.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}