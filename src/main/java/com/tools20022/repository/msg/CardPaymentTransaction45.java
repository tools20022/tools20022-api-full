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
import com.tools20022.repository.codeset.CardPaymentServiceType6Code;
import com.tools20022.repository.codeset.FailureReason3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Transaction information in the batch capture.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionType
 * CardPaymentTransaction45.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmAdditionalService
 * CardPaymentTransaction45.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmServiceAttribute
 * CardPaymentTransaction45.mmServiceAttribute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmMerchantCategoryCode
 * CardPaymentTransaction45.mmMerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmSaleReferenceIdentification
 * CardPaymentTransaction45.mmSaleReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionIdentification
 * CardPaymentTransaction45.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmOriginalTransaction
 * CardPaymentTransaction45.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionSuccess
 * CardPaymentTransaction45.mmTransactionSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmReversal
 * CardPaymentTransaction45.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmMerchantOverride
 * CardPaymentTransaction45.mmMerchantOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmFailureReason
 * CardPaymentTransaction45.mmFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmInitiatorTransactionIdentification
 * CardPaymentTransaction45.mmInitiatorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmRecipientTransactionIdentification
 * CardPaymentTransaction45.mmRecipientTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmReconciliationIdentification
 * CardPaymentTransaction45.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmInterchangeData
 * CardPaymentTransaction45.mmInterchangeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionDetails
 * CardPaymentTransaction45.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmAuthorisationResult
 * CardPaymentTransaction45.mmAuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionVerificationResult
 * CardPaymentTransaction45.mmTransactionVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmAdditionalTransactionData
 * CardPaymentTransaction45.mmAdditionalTransactionData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentTransaction45"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transaction information in the batch capture."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction60
 * CardPaymentTransaction60}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29
 * CardPaymentTransaction29}</li>
 * </ul>
 */
public class CardPaymentTransaction45 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentServiceType5Code transactionType;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionType
	 * CardPaymentTransaction60.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionType
	 * CardPaymentTransaction29.mmTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction being undertaken for the main service.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmTransactionType);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmTransactionType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType5Code.mmObject();
		}
	};
	protected List<CardPaymentServiceType6Code> additionalService;
	/**
	 * Service in addition to the main service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmAdditionalService
	 * CardPaymentTransaction60.mmAdditionalService}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmAdditionalService
	 * CardPaymentTransaction29.mmAdditionalService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalService = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmAdditionalService);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmAdditionalService;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	protected CardPaymentServiceType3Code serviceAttribute;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmServiceAttribute
	 * CardPaymentTransaction60.mmServiceAttribute}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmServiceAttribute
	 * CardPaymentTransaction29.mmServiceAttribute}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceAttribute = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "SvcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAttribute";
			definition = "Additional attribute of the service type.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmServiceAttribute);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmServiceAttribute;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType3Code.mmObject();
		}
	};
	protected Min3Max4Text merchantCategoryCode;
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
	 * {@linkplain com.tools20022.repository.entity.MerchantRole#mmMerchantCategoryCode
	 * MerchantRole.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmMerchantCategoryCode
	 * CardPaymentTransaction60.mmMerchantCategoryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmMerchantCategoryCode
	 * CardPaymentTransaction29.mmMerchantCategoryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMerchantCategoryCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MerchantRole.mmMerchantCategoryCode;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "MrchntCtgyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmMerchantCategoryCode);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmMerchantCategoryCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}
	};
	protected Max35Text saleReferenceIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmSaleReferenceIdentification
	 * CardPaymentTransaction60.mmSaleReferenceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmSaleReferenceIdentification
	 * CardPaymentTransaction29.mmSaleReferenceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaleReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "SaleRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceIdentification";
			definition = "Global reference of the sale transaction for the sale system.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmSaleReferenceIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmSaleReferenceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TransactionIdentifier1 transactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionIdentification
	 * CardPaymentTransaction60.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionIdentification
	 * CardPaymentTransaction29.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification of the transaction assigned by the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmTransactionIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected CardPaymentTransaction37 originalTransaction;
	/**
	 * Identification of the original transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37
	 * CardPaymentTransaction37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmOriginalTransaction
	 * CardPaymentTransaction60.mmOriginalTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmOriginalTransaction
	 * CardPaymentTransaction29.mmOriginalTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransaction";
			definition = "Identification of the original transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmOriginalTransaction);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmOriginalTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction37.mmObject();
		}
	};
	protected TrueFalseIndicator transactionSuccess;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmTransactionSuccess
	 * CardPaymentValidation.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionSuccess
	 * CardPaymentTransaction60.mmTransactionSuccess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionSuccess
	 * CardPaymentTransaction29.mmTransactionSuccess}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionSuccess = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmTransactionSuccess;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "TxSucss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSuccess";
			definition = "Outcome of the transaction at the acceptor.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmTransactionSuccess);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmTransactionSuccess;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator reversal;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmReversal
	 * CardPaymentAcquiring.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmReversal
	 * CardPaymentTransaction60.mmReversal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmReversal
	 * CardPaymentTransaction29.mmReversal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversal = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmReversal;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "Rvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmReversal);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmReversal;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator merchantOverride;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmMerchantOverride
	 * CardPaymentValidation.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmMerchantOverride
	 * CardPaymentTransaction60.mmMerchantOverride}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmMerchantOverride
	 * CardPaymentTransaction29.mmMerchantOverride}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMerchantOverride = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmMerchantOverride;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "MrchntOvrrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantOverride";
			definition = "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmMerchantOverride);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmMerchantOverride;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<FailureReason3Code> failureReason;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmFailureReason
	 * CardPaymentStatus.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmFailureReason
	 * CardPaymentTransaction60.mmFailureReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmFailureReason
	 * CardPaymentTransaction29.mmFailureReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFailureReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentStatus.mmFailureReason;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "FailrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailureReason";
			definition = "List of incidents during the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmFailureReason);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmFailureReason;
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason3Code.mmObject();
		}
	};
	protected Max35Text initiatorTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInitiatorTransactionIdentifier
	 * CardPaymentAcquiring.mmInitiatorTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction60.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction29.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatorTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmInitiatorTransactionIdentifier;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmInitiatorTransactionIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmInitiatorTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text recipientTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmRecipientTransactionIdentification
	 * CardPaymentTransaction60.mmRecipientTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmRecipientTransactionIdentification
	 * CardPaymentTransaction29.mmRecipientTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "RcptTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientTransactionIdentification";
			definition = "Identification of the transaction assigned by the recipient party for the initiating party.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmRecipientTransactionIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmRecipientTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text reconciliationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmReconciliationIdentification
	 * CardPaymentTransaction60.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmReconciliationIdentification
	 * CardPaymentTransaction29.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmReconciliationIdentification);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max140Text interchangeData;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInterchangeData
	 * CardPaymentAcquiring.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmInterchangeData
	 * CardPaymentTransaction60.mmInterchangeData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmInterchangeData
	 * CardPaymentTransaction29.mmInterchangeData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterchangeData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmInterchangeData;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "IntrchngData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterchangeData";
			definition = "Interchange information related to the card scheme.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmInterchangeData);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmInterchangeData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected CardPaymentTransactionDetails23 transactionDetails;
	/**
	 * Details of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23
	 * CardPaymentTransactionDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionDetails
	 * CardPaymentTransaction60.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionDetails
	 * CardPaymentTransaction29.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmTransactionDetails);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails23.mmObject();
		}
	};
	protected AuthorisationResult4 authorisationResult;
	/**
	 * Outcome of the authorisation request, and actions to perform.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult4
	 * AuthorisationResult4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * definition} =
	 * "Outcome of the authorisation request, and actions to perform."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmAuthorisationResult
	 * CardPaymentTransaction60.mmAuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmAuthorisationResult
	 * CardPaymentTransaction29.mmAuthorisationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation request, and actions to perform.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmAuthorisationResult);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmAuthorisationResult;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthorisationResult4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TransactionVerificationResult3> transactionVerificationResult;
	/**
	 * Result of performed verifications for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3
	 * TransactionVerificationResult3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * definition} = "Result of performed verifications for the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionVerificationResult
	 * CardPaymentTransaction60.mmTransactionVerificationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionVerificationResult
	 * CardPaymentTransaction29.mmTransactionVerificationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionVerificationResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "TxVrfctnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionVerificationResult";
			definition = "Result of performed verifications for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmTransactionVerificationResult);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmTransactionVerificationResult;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult3.mmObject();
		}
	};
	protected List<Max70Text> additionalTransactionData;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
	 * CardPaymentTransaction45}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmAdditionalTransactionData
	 * CardPaymentTransaction60.mmAdditionalTransactionData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmAdditionalTransactionData
	 * CardPaymentTransaction29.mmAdditionalTransactionData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTransactionData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction45.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionData";
			definition = "Additional information related to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmAdditionalTransactionData);
			previousVersion_lazy = () -> CardPaymentTransaction29.mmAdditionalTransactionData;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentTransaction45.mmTransactionType, CardPaymentTransaction45.mmAdditionalService, CardPaymentTransaction45.mmServiceAttribute,
						CardPaymentTransaction45.mmMerchantCategoryCode, CardPaymentTransaction45.mmSaleReferenceIdentification, CardPaymentTransaction45.mmTransactionIdentification, CardPaymentTransaction45.mmOriginalTransaction,
						CardPaymentTransaction45.mmTransactionSuccess, CardPaymentTransaction45.mmReversal, CardPaymentTransaction45.mmMerchantOverride, CardPaymentTransaction45.mmFailureReason,
						CardPaymentTransaction45.mmInitiatorTransactionIdentification, CardPaymentTransaction45.mmRecipientTransactionIdentification, CardPaymentTransaction45.mmReconciliationIdentification,
						CardPaymentTransaction45.mmInterchangeData, CardPaymentTransaction45.mmTransactionDetails, CardPaymentTransaction45.mmAuthorisationResult, CardPaymentTransaction45.mmTransactionVerificationResult,
						CardPaymentTransaction45.mmAdditionalTransactionData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransaction45";
				definition = "Transaction information in the batch capture.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction60.mmObject());
				previousVersion_lazy = () -> CardPaymentTransaction29.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentServiceType5Code getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(CardPaymentServiceType5Code transactionType) {
		this.transactionType = transactionType;
	}

	public List<CardPaymentServiceType6Code> getAdditionalService() {
		return additionalService;
	}

	public void setAdditionalService(List<CardPaymentServiceType6Code> additionalService) {
		this.additionalService = additionalService;
	}

	public CardPaymentServiceType3Code getServiceAttribute() {
		return serviceAttribute;
	}

	public void setServiceAttribute(CardPaymentServiceType3Code serviceAttribute) {
		this.serviceAttribute = serviceAttribute;
	}

	public Min3Max4Text getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(Min3Max4Text merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public Max35Text getSaleReferenceIdentification() {
		return saleReferenceIdentification;
	}

	public void setSaleReferenceIdentification(Max35Text saleReferenceIdentification) {
		this.saleReferenceIdentification = saleReferenceIdentification;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public CardPaymentTransaction37 getOriginalTransaction() {
		return originalTransaction;
	}

	public void setOriginalTransaction(com.tools20022.repository.msg.CardPaymentTransaction37 originalTransaction) {
		this.originalTransaction = originalTransaction;
	}

	public TrueFalseIndicator getTransactionSuccess() {
		return transactionSuccess;
	}

	public void setTransactionSuccess(TrueFalseIndicator transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}

	public TrueFalseIndicator getReversal() {
		return reversal;
	}

	public void setReversal(TrueFalseIndicator reversal) {
		this.reversal = reversal;
	}

	public TrueFalseIndicator getMerchantOverride() {
		return merchantOverride;
	}

	public void setMerchantOverride(TrueFalseIndicator merchantOverride) {
		this.merchantOverride = merchantOverride;
	}

	public List<FailureReason3Code> getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(List<FailureReason3Code> failureReason) {
		this.failureReason = failureReason;
	}

	public Max35Text getInitiatorTransactionIdentification() {
		return initiatorTransactionIdentification;
	}

	public void setInitiatorTransactionIdentification(Max35Text initiatorTransactionIdentification) {
		this.initiatorTransactionIdentification = initiatorTransactionIdentification;
	}

	public Max35Text getRecipientTransactionIdentification() {
		return recipientTransactionIdentification;
	}

	public void setRecipientTransactionIdentification(Max35Text recipientTransactionIdentification) {
		this.recipientTransactionIdentification = recipientTransactionIdentification;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	public Max140Text getInterchangeData() {
		return interchangeData;
	}

	public void setInterchangeData(Max140Text interchangeData) {
		this.interchangeData = interchangeData;
	}

	public CardPaymentTransactionDetails23 getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(com.tools20022.repository.msg.CardPaymentTransactionDetails23 transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public AuthorisationResult4 getAuthorisationResult() {
		return authorisationResult;
	}

	public void setAuthorisationResult(com.tools20022.repository.msg.AuthorisationResult4 authorisationResult) {
		this.authorisationResult = authorisationResult;
	}

	public List<TransactionVerificationResult3> getTransactionVerificationResult() {
		return transactionVerificationResult;
	}

	public void setTransactionVerificationResult(List<com.tools20022.repository.msg.TransactionVerificationResult3> transactionVerificationResult) {
		this.transactionVerificationResult = transactionVerificationResult;
	}

	public List<Max70Text> getAdditionalTransactionData() {
		return additionalTransactionData;
	}

	public void setAdditionalTransactionData(List<Max70Text> additionalTransactionData) {
		this.additionalTransactionData = additionalTransactionData;
	}
}