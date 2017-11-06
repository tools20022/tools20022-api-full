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
import com.tools20022.repository.codeset.CardPaymentServiceType7Code;
import com.tools20022.repository.codeset.CardPaymentServiceType8Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Min3Max4NumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CardTransaction15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentServiceType7Code transactionType;
	/**
	 * Type of transaction being undertaken for the main service. <br>
	 * It correspond partially to the ISO 8583 field number 3.
	 * <p>
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
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction being undertaken for the main service. \r\nIt correspond partially to the ISO 8583 field number 3.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmTransactionType, com.tools20022.repository.msg.CardTransaction5.mmTransactionType,
					com.tools20022.repository.msg.CardTransaction7.mmTransactionType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType7Code.mmObject();
		}
	};
	protected List<CardPaymentServiceType8Code> additionalService;
	/**
	 * Service in addition to the main service. <br>
	 * It correspond partially to the ISO 8583:2003 field number 22-3.
	 * <p>
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
	 * "Service in addition to the main service. \r\nIt correspond partially to the ISO 8583:2003 field number 22-3."
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
	public static final MMMessageAttribute mmAdditionalService = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service. \r\nIt correspond partially to the ISO 8583:2003 field number 22-3.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction5.mmAdditionalService);
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType8Code.mmObject();
		}
	};
	protected CardPaymentServiceType3Code serviceAttribute;
	/**
	 * Additional attribute of the service type. <br>
	 * It correspond partially to the ISO 8583:2003 field number 22-3.
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
	 * "Additional attribute of the service type. \r\nIt correspond partially to the ISO 8583:2003 field number 22-3."
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
	public static final MMMessageAttribute mmServiceAttribute = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "SvcAttr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAttribute";
			definition = "Additional attribute of the service type. \r\nIt correspond partially to the ISO 8583:2003 field number 22-3.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction5.mmServiceAttribute);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType3Code.mmObject();
		}
	};
	protected Min3Max4NumericText merchantCategoryCode;
	/**
	 * Category code conform to ISO 18245, related to the type of services or
	 * goods the merchant provides for the transaction. <br>
	 * It correspond to the ISO 8583 field number 18 for the version 87, field
	 * numbers 18 and 26 for the version 93, and field number 26 for the version
	 * 2003.
	 * <p>
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
	public static final MMMessageAttribute mmMerchantCategoryCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MerchantRole.mmMerchantCategoryCode;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "MrchntCtgyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction. \r\nIt correspond to the ISO 8583 field number 18 for the version 87, field numbers 18 and 26 for the version 93, and field number 26 for the version 2003.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction5.mmMerchantCategoryCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min3Max4NumericText.mmObject();
		}
	};
	protected TransactionIdentifier2 reconciliation;
	/**
	 * Identification of the reconciliation period between the acquirer and the
	 * issuer or their respective agents.
	 * <p>
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
	public static final MMMessageAssociationEnd mmReconciliation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "Rcncltn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Identification of the reconciliation period between the acquirer and the issuer or their respective agents.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmReconciliation, com.tools20022.repository.msg.CardTransaction5.mmReconciliation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier2.mmObject();
		}
	};
	protected ISODateTime acceptorTransactionDateTime;
	/**
	 * Date and time of the transaction transported unchanged by the acquirer
	 * from the card acceptor to the issuer. Corresponds to the CAPE data
	 * element TransactionIdentification/ TransactionDateTime.<br>
	 * It correspond to the ISO 8583 field number 12.
	 * <p>
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
	public static final MMMessageAttribute mmAcceptorTransactionDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionDateTime;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AccptrTxDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorTransactionDateTime";
			definition = "Date and time of the transaction transported unchanged by the acquirer from the card acceptor to the issuer. Corresponds to the CAPE data element TransactionIdentification/ TransactionDateTime.\r\nIt correspond to the ISO 8583 field number 12.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmAcceptorTransactionDateTime, com.tools20022.repository.msg.CardTransaction5.mmAcceptorTransactionDateTime,
					com.tools20022.repository.msg.CardTransaction3.mmAcceptorTransactionDateTime, com.tools20022.repository.msg.CardTransaction7.mmAcceptorTransactionDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max35Text acceptorTransactionIdentification;
	/**
	 * Unique transaction identification generated by the acceptor or the
	 * acquirer transported unchanged by the acquirer from the card acceptor to
	 * the issuer. It is used to assist locating the original source
	 * information. Eventually it could be included in the cardholder statement.
	 * It corresponds to ISO 8583, field 37 and CAPE data element
	 * TransactionIdentification/TransactionReference.
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
	public static final MMMessageAttribute mmAcceptorTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AccptrTxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorTransactionIdentification";
			definition = "Unique transaction identification generated by the acceptor or the acquirer transported unchanged by the acquirer from the card acceptor to the issuer. It is used to assist locating the original source information. Eventually it could be included in the cardholder statement. It corresponds to ISO 8583, field 37 and CAPE data element TransactionIdentification/TransactionReference.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction5.mmAcceptorTransactionIdentification, com.tools20022.repository.msg.CardTransaction7.mmAcceptorTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text initiatorTransactionIdentification;
	/**
	 * Number generated by the transaction Initiator to assist in identifying a
	 * transaction uniquely. This value remains unchanged for all messages
	 * within a message pair exchange, for instance an initiation/response. It
	 * corresponds to the ISO 8583 field number 11.
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
	public static final MMMessageAttribute mmInitiatorTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Number generated by the transaction Initiator to assist in identifying a transaction uniquely. This value remains unchanged for all messages within a message pair exchange, for instance an initiation/response. It corresponds to the ISO 8583 field number 11.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmInitiatorTransactionIdentification, com.tools20022.repository.msg.CardTransaction5.mmInitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardTransaction3.mmInitiatorTransactionIdentification, com.tools20022.repository.msg.CardTransaction7.mmInitiatorTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transactionLifeCycleIdentification;
	/**
	 * Unique identification to match transactions throughout their life cycle
	 * (for example, authorisation to financial presentment, financial
	 * presentment to chargeback). It shall contain the same value in all
	 * messages throughout a transaction’s life cycle. It corresponds partially
	 * to ISO 8583:2003 field number 21.
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
	 * "Unique identification to match transactions throughout their life cycle (for example, authorisation to financial presentment, financial presentment to chargeback). It shall contain the same value in all messages throughout a transaction’s life cycle. It corresponds partially to ISO 8583:2003 field number 21."
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
	public static final MMMessageAttribute mmTransactionLifeCycleIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleIdentification";
			definition = "Unique identification to match transactions throughout their life cycle (for example, authorisation to financial presentment, financial presentment to chargeback). It shall contain the same value in all messages throughout a transaction’s life cycle. It corresponds partially to ISO 8583:2003 field number 21.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmTransactionLifeCycleIdentification, com.tools20022.repository.msg.CardTransaction5.mmTransactionLifeCycleIdentification,
					com.tools20022.repository.msg.CardTransaction7.mmTransactionLifeCycleIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number transactionLifeCycleSequenceNumber;
	/**
	 * Life cycle transaction sequence number when multiple authorisations are
	 * performed for the same presentment.<br>
	 * It corresponds partially to ISO 8583:2003, field number 21.
	 * <p>
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
	 * "Life cycle transaction sequence number when multiple authorisations are performed for the same presentment.\r\nIt corresponds partially to ISO 8583:2003, field number 21."
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
	public static final MMMessageAttribute mmTransactionLifeCycleSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclSeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleSequenceNumber";
			definition = "Life cycle transaction sequence number when multiple authorisations are performed for the same presentment.\r\nIt corresponds partially to ISO 8583:2003, field number 21.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmTransactionLifeCycleSequenceNumber, com.tools20022.repository.msg.CardTransaction5.mmTransactionLifeCycleSequenceNumber,
					com.tools20022.repository.msg.CardTransaction7.mmTransactionLifeCycleSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number transactionLifeCycleSequenceCounter;
	/**
	 * Total number of transactions under the same life cycle transaction
	 * sequence number.
	 * <p>
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
	public static final MMMessageAttribute mmTransactionLifeCycleSequenceCounter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclSeqCntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleSequenceCounter";
			definition = "Total number of transactions under the same life cycle transaction sequence number.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction5.mmTransactionLifeCycleSequenceCounter);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected CardTransaction3 originalTransaction;
	/**
	 * Identification of the original transaction.<br>
	 * It corresponds to ISO 8583 field number 90 for the version 87, and field
	 * number 56 for the other versions.
	 * <p>
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
	public static final MMMessageAssociationEnd mmOriginalTransaction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransaction";
			definition = "Identification of the original transaction.\r\nIt corresponds to ISO 8583 field number 90 for the version 87, and field number 56 for the other versions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction5.mmOriginalTransaction, com.tools20022.repository.msg.CardTransaction7.mmOriginalTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransaction3.mmObject();
		}
	};
	protected CardTransactionDetail1 transactionDetails;
	/**
	 * Details of the card transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTransactionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the card transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmTransactionDetails, com.tools20022.repository.msg.CardTransaction5.mmTransactionDetails,
					com.tools20022.repository.msg.CardTransaction7.mmTransactionDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail1.mmObject();
		}
	};
	protected AuthorisationResult7 authorisationResult;
	/**
	 * Outcome of the authorisation.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAuthorisationResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> CardTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmAuthorisationResult, com.tools20022.repository.msg.CardTransaction5.mmAuthorisationResult);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthorisationResult7.mmObject();
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardTransaction15";
				definition = "Card transaction for which the authorisation is requested.";
				nextVersions_lazy = () -> Arrays.asList(CardTransaction4.mmObject(), CardTransaction5.mmObject(), com.tools20022.repository.msg.CardTransaction3.mmObject(), CardTransaction7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentServiceType7Code getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(CardPaymentServiceType7Code transactionType) {
		this.transactionType = transactionType;
	}

	public List<CardPaymentServiceType8Code> getAdditionalService() {
		return additionalService;
	}

	public void setAdditionalService(List<CardPaymentServiceType8Code> additionalService) {
		this.additionalService = additionalService;
	}

	public CardPaymentServiceType3Code getServiceAttribute() {
		return serviceAttribute;
	}

	public void setServiceAttribute(CardPaymentServiceType3Code serviceAttribute) {
		this.serviceAttribute = serviceAttribute;
	}

	public Min3Max4NumericText getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(Min3Max4NumericText merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public TransactionIdentifier2 getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(com.tools20022.repository.msg.TransactionIdentifier2 reconciliation) {
		this.reconciliation = reconciliation;
	}

	public ISODateTime getAcceptorTransactionDateTime() {
		return acceptorTransactionDateTime;
	}

	public void setAcceptorTransactionDateTime(ISODateTime acceptorTransactionDateTime) {
		this.acceptorTransactionDateTime = acceptorTransactionDateTime;
	}

	public Max35Text getAcceptorTransactionIdentification() {
		return acceptorTransactionIdentification;
	}

	public void setAcceptorTransactionIdentification(Max35Text acceptorTransactionIdentification) {
		this.acceptorTransactionIdentification = acceptorTransactionIdentification;
	}

	public Max35Text getInitiatorTransactionIdentification() {
		return initiatorTransactionIdentification;
	}

	public void setInitiatorTransactionIdentification(Max35Text initiatorTransactionIdentification) {
		this.initiatorTransactionIdentification = initiatorTransactionIdentification;
	}

	public Max35Text getTransactionLifeCycleIdentification() {
		return transactionLifeCycleIdentification;
	}

	public void setTransactionLifeCycleIdentification(Max35Text transactionLifeCycleIdentification) {
		this.transactionLifeCycleIdentification = transactionLifeCycleIdentification;
	}

	public Number getTransactionLifeCycleSequenceNumber() {
		return transactionLifeCycleSequenceNumber;
	}

	public void setTransactionLifeCycleSequenceNumber(Number transactionLifeCycleSequenceNumber) {
		this.transactionLifeCycleSequenceNumber = transactionLifeCycleSequenceNumber;
	}

	public Number getTransactionLifeCycleSequenceCounter() {
		return transactionLifeCycleSequenceCounter;
	}

	public void setTransactionLifeCycleSequenceCounter(Number transactionLifeCycleSequenceCounter) {
		this.transactionLifeCycleSequenceCounter = transactionLifeCycleSequenceCounter;
	}

	public CardTransaction3 getOriginalTransaction() {
		return originalTransaction;
	}

	public void setOriginalTransaction(com.tools20022.repository.msg.CardTransaction3 originalTransaction) {
		this.originalTransaction = originalTransaction;
	}

	public CardTransactionDetail1 getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(com.tools20022.repository.msg.CardTransactionDetail1 transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public AuthorisationResult7 getAuthorisationResult() {
		return authorisationResult;
	}

	public void setAuthorisationResult(com.tools20022.repository.msg.AuthorisationResult7 authorisationResult) {
		this.authorisationResult = authorisationResult;
	}
}