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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.DeliveryReceiptType2Code;
import com.tools20022.repository.codeset.ReceiveDelivery1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmTransactionActivity
 * TransactionDetails95.mmTransactionActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSettlementTransactionOrCorporateActionEventType
 * TransactionDetails95.mmSettlementTransactionOrCorporateActionEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSecuritiesMovementType
 * TransactionDetails95.mmSecuritiesMovementType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPayment
 * TransactionDetails95.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSettlementParameters
 * TransactionDetails95.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPlaceOfTrade
 * TransactionDetails95.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSafekeepingPlace
 * TransactionDetails95.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPlaceOfClearing
 * TransactionDetails95.mmPlaceOfClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPostingQuantity
 * TransactionDetails95.mmPostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmNumberOfDaysAccrued
 * TransactionDetails95.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPostingAmount
 * TransactionDetails95.mmPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmAccruedInterestAmount
 * TransactionDetails95.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmTradeDate
 * TransactionDetails95.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmEffectiveSettlementDate
 * TransactionDetails95.mmEffectiveSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSettlementDate
 * TransactionDetails95.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmValueDate
 * TransactionDetails95.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmAcknowledgedStatusTimeStamp
 * TransactionDetails95.mmAcknowledgedStatusTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmMatchedStatusTimeStamp
 * TransactionDetails95.mmMatchedStatusTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmDeliveringSettlementParties
 * TransactionDetails95.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmReceivingSettlementParties
 * TransactionDetails95.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmReversalIndicator
 * TransactionDetails95.mmReversalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmTransactionAdditionalDetails
 * TransactionDetails95.mmTransactionAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
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
 * "TransactionDetails95"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the details of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionDetails78
 * TransactionDetails78}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionDetails95", propOrder = {"transactionActivity", "settlementTransactionOrCorporateActionEventType", "securitiesMovementType", "payment", "settlementParameters", "placeOfTrade", "safekeepingPlace",
		"placeOfClearing", "postingQuantity", "numberOfDaysAccrued", "postingAmount", "accruedInterestAmount", "tradeDate", "effectiveSettlementDate", "settlementDate", "valueDate", "acknowledgedStatusTimeStamp", "matchedStatusTimeStamp",
		"deliveringSettlementParties", "receivingSettlementParties", "reversalIndicator", "transactionAdditionalDetails"})
public class TransactionDetails95 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TransactionActivity3Choice transactionActivity;
	/**
	 * Specifies the type of activity to which this instruction relates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice
	 * TransactionActivity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmActivity
	 * SecuritiesTrade.mmActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxActvty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of activity to which this instruction relates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmTransactionActivity
	 * TransactionDetails78.mmTransactionActivity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionActivity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmActivity;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "TxActvty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionActivity";
			definition = "Specifies the type of activity to which this instruction relates.";
			previousVersion_lazy = () -> TransactionDetails78.mmTransactionActivity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionActivity3Choice.mmObject();
		}
	};
	protected SettlementOrCorporateActionEvent19Choice settlementTransactionOrCorporateActionEventType;
	/**
	 * Choice of type for the transaction reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice
	 * SettlementOrCorporateActionEvent19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTxOrCorpActnEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionOrCorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice of type for the transaction reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSettlementTransactionOrCorporateActionEventType
	 * TransactionDetails78.mmSettlementTransactionOrCorporateActionEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTransactionOrCorporateActionEventType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxOrCorpActnEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionOrCorporateActionEventType";
			definition = "Choice of type for the transaction reported.";
			previousVersion_lazy = () -> TransactionDetails78.mmSettlementTransactionOrCorporateActionEventType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementOrCorporateActionEvent19Choice.mmObject();
		}
	};
	protected ReceiveDelivery1Code securitiesMovementType;
	/**
	 * Specifies if the movement on a securities account results from a deliver
	 * or a receive instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
	 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the movement on a securities account results from a deliver or a receive instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSecuritiesMovementType
	 * TransactionDetails78.mmSecuritiesMovementType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesMovementType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesMovementType;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			previousVersion_lazy = () -> TransactionDetails78.mmSecuritiesMovementType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
		}
	};
	protected DeliveryReceiptType2Code payment;
	/**
	 * Specifies how the transaction is to be settled, for example, against
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
	 * SecuritiesSettlement.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the transaction is to be settled, for example, against payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPayment
	 * TransactionDetails78.mmPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			previousVersion_lazy = () -> TransactionDetails78.mmPayment;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}
	};
	protected SettlementDetails126 settlementParameters;
	/**
	 * Parameters applied to the settlement of a security transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementDetails126
	 * SettlementDetails126}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters applied to the settlement of a security transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSettlementParameters
	 * TransactionDetails78.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementParameters = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters applied to the settlement of a security transfer.";
			previousVersion_lazy = () -> TransactionDetails78.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementDetails126.mmObject();
		}
	};
	protected PlaceOfTradeIdentification1 placeOfTrade;
	/**
	 * Market in which a trade transaction has been executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1
	 * PlaceOfTradeIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market in which a trade transaction has been executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPlaceOfTrade
	 * TransactionDetails78.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction has been executed.";
			previousVersion_lazy = () -> TransactionDetails78.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlaceOfTradeIdentification1.mmObject();
		}
	};
	protected SafeKeepingPlace1 safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
	 * SafeKeepingPlace1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSafekeepingPlace
	 * TransactionDetails78.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			previousVersion_lazy = () -> TransactionDetails78.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SafeKeepingPlace1.mmObject();
		}
	};
	protected PlaceOfClearingIdentification1 placeOfClearing;
	/**
	 * Infrastructure which may be a component of a clearing house and which
	 * facilitates clearing and settlement for its members by standing between
	 * the buyer and the seller. It may net transactions and it substitutes
	 * itself as settlement counterparty for each position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1
	 * PlaceOfClearingIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfClr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure which may be a component of a clearing house and which facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPlaceOfClearing
	 * TransactionDetails78.mmPlaceOfClearing}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfClearing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "PlcOfClr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfClearing";
			definition = "Infrastructure which may be a component of a clearing house and which facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position.";
			previousVersion_lazy = () -> TransactionDetails78.mmPlaceOfClearing;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PlaceOfClearingIdentification1.mmObject();
		}
	};
	protected Quantity6Choice postingQuantity;
	/**
	 * Quantity of financial instrument (to be) posted to the safekeeping
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity6Choice
	 * Quantity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument (to be) posted to the safekeeping account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPostingQuantity
	 * TransactionDetails78.mmPostingQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPostingQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "PstngQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingQuantity";
			definition = "Quantity of financial instrument (to be) posted to the safekeeping account.";
			previousVersion_lazy = () -> TransactionDetails78.mmPostingQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity6Choice.mmObject();
		}
	};
	protected Max3Number numberOfDaysAccrued;
	/**
	 * Number of days on which the interest rate accrues (daily accrual note).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days on which the interest rate accrues (daily accrual note)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmNumberOfDaysAccrued
	 * TransactionDetails78.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			previousVersion_lazy = () -> TransactionDetails78.mmNumberOfDaysAccrued;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected AmountAndDirection3 postingAmount;
	/**
	 * Amount of money that is to be/was posted to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection3
	 * AmountAndDirection3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that is to be/was posted to the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPostingAmount
	 * TransactionDetails78.mmPostingAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPostingAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "PstngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingAmount";
			definition = "Amount of money that is to be/was posted to the account.";
			previousVersion_lazy = () -> TransactionDetails78.mmPostingAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection3.mmObject();
		}
	};
	protected AmountAndDirection21 accruedInterestAmount;
	/**
	 * Interest amount that has accrued in between coupon payment periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmAccruedInterestAmount
	 * TransactionDetails78.mmAccruedInterestAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			previousVersion_lazy = () -> TransactionDetails78.mmAccruedInterestAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection21.mmObject();
		}
	};
	protected TradeDate5Choice tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeDate5Choice
	 * TradeDate5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmTradeDate
	 * TransactionDetails78.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			previousVersion_lazy = () -> TransactionDetails78.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDate5Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice effectiveSettlementDate;
	/**
	 * Date and time at which a transaction is completed and cleared, that is,
	 * payment is effected and securities are delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared, that is, payment is effected and securities are delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmEffectiveSettlementDate
	 * TransactionDetails78.mmEffectiveSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEffectiveSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which a transaction is completed and cleared, that is, payment is effected and securities are delivered.";
			previousVersion_lazy = () -> TransactionDetails78.mmEffectiveSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected SettlementDate9Choice settlementDate;
	/**
	 * Date and time at which the securities are to be delivered or received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice
	 * SettlementDate9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSettlementDate
	 * TransactionDetails78.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			previousVersion_lazy = () -> TransactionDetails78.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementDate9Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice valueDate;
	/**
	 * Date and time assets become available to the account owner (in a credit
	 * entry), or cease to be available to the account owner (in a debit entry).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmValueDate
	 * Trade.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmValueDate
	 * TransactionDetails78.mmValueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValueDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmValueDate;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			previousVersion_lazy = () -> TransactionDetails78.mmValueDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ISODateTime acknowledgedStatusTimeStamp;
	/**
	 * Time stamp on when the transaction is acknowledged.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdStsTmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedStatusTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time stamp on when the transaction is acknowledged."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcknowledgedStatusTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "AckdStsTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedStatusTimeStamp";
			definition = "Time stamp on when the transaction is acknowledged.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime matchedStatusTimeStamp;
	/**
	 * Time stamp on when the transaction is matched.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchdStsTmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchedStatusTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time stamp on when the transaction is matched."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchedStatusTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "MtchdStsTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedStatusTimeStamp";
			definition = "Time stamp on when the transaction is matched.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected SettlementParties40 deliveringSettlementParties;
	/**
	 * Identifies the chain of delivering settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties40
	 * SettlementParties40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmDeliveringSettlementParties
	 * TransactionDetails78.mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringSettlementParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			previousVersion_lazy = () -> TransactionDetails78.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties40.mmObject();
		}
	};
	protected SettlementParties40 receivingSettlementParties;
	/**
	 * Identifies the chain of receiving settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties40
	 * SettlementParties40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmReceivingSettlementParties
	 * TransactionDetails78.mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingSettlementParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			previousVersion_lazy = () -> TransactionDetails78.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties40.mmObject();
		}
	};
	protected YesNoIndicator reversalIndicator;
	/**
	 * Specifies whether it is the reversal of a previously reported movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is the reversal of a previously reported movement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmReversalIndicator
	 * TransactionDetails78.mmReversalIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversalIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "RvslInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIndicator";
			definition = "Specifies whether it is the reversal of a previously reported movement.";
			previousVersion_lazy = () -> TransactionDetails78.mmReversalIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max350Text transactionAdditionalDetails;
	/**
	 * Provides additional details on the transaction which can not be included
	 * within the structured fields of the message.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details on the transaction which can not be included within the structured fields of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmTransactionAdditionalDetails
	 * TransactionDetails78.mmTransactionAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionDetails95.mmObject();
			isDerived = false;
			xmlTag = "TxAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAdditionalDetails";
			definition = "Provides additional details on the transaction which can not be included within the structured fields of the message.";
			previousVersion_lazy = () -> TransactionDetails78.mmTransactionAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionDetails95.mmTransactionActivity, TransactionDetails95.mmSettlementTransactionOrCorporateActionEventType, TransactionDetails95.mmSecuritiesMovementType,
						TransactionDetails95.mmPayment, TransactionDetails95.mmSettlementParameters, TransactionDetails95.mmPlaceOfTrade, TransactionDetails95.mmSafekeepingPlace, TransactionDetails95.mmPlaceOfClearing,
						TransactionDetails95.mmPostingQuantity, TransactionDetails95.mmNumberOfDaysAccrued, TransactionDetails95.mmPostingAmount, TransactionDetails95.mmAccruedInterestAmount, TransactionDetails95.mmTradeDate,
						TransactionDetails95.mmEffectiveSettlementDate, TransactionDetails95.mmSettlementDate, TransactionDetails95.mmValueDate, TransactionDetails95.mmAcknowledgedStatusTimeStamp,
						TransactionDetails95.mmMatchedStatusTimeStamp, TransactionDetails95.mmDeliveringSettlementParties, TransactionDetails95.mmReceivingSettlementParties, TransactionDetails95.mmReversalIndicator,
						TransactionDetails95.mmTransactionAdditionalDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionDetails95";
				definition = "Specifies the details of the transaction.";
				previousVersion_lazy = () -> TransactionDetails78.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxActvty", required = true)
	public TransactionActivity3Choice getTransactionActivity() {
		return transactionActivity;
	}

	public void setTransactionActivity(TransactionActivity3Choice transactionActivity) {
		this.transactionActivity = transactionActivity;
	}

	@XmlElement(name = "SttlmTxOrCorpActnEvtTp")
	public SettlementOrCorporateActionEvent19Choice getSettlementTransactionOrCorporateActionEventType() {
		return settlementTransactionOrCorporateActionEventType;
	}

	public void setSettlementTransactionOrCorporateActionEventType(SettlementOrCorporateActionEvent19Choice settlementTransactionOrCorporateActionEventType) {
		this.settlementTransactionOrCorporateActionEventType = settlementTransactionOrCorporateActionEventType;
	}

	@XmlElement(name = "SctiesMvmntTp", required = true)
	public ReceiveDelivery1Code getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public void setSecuritiesMovementType(ReceiveDelivery1Code securitiesMovementType) {
		this.securitiesMovementType = securitiesMovementType;
	}

	@XmlElement(name = "Pmt", required = true)
	public DeliveryReceiptType2Code getPayment() {
		return payment;
	}

	public void setPayment(DeliveryReceiptType2Code payment) {
		this.payment = payment;
	}

	@XmlElement(name = "SttlmParams")
	public SettlementDetails126 getSettlementParameters() {
		return settlementParameters;
	}

	public void setSettlementParameters(com.tools20022.repository.msg.SettlementDetails126 settlementParameters) {
		this.settlementParameters = settlementParameters;
	}

	@XmlElement(name = "PlcOfTrad")
	public PlaceOfTradeIdentification1 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.PlaceOfTradeIdentification1 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "SfkpgPlc")
	public SafeKeepingPlace1 getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(com.tools20022.repository.msg.SafeKeepingPlace1 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "PlcOfClr")
	public PlaceOfClearingIdentification1 getPlaceOfClearing() {
		return placeOfClearing;
	}

	public void setPlaceOfClearing(com.tools20022.repository.msg.PlaceOfClearingIdentification1 placeOfClearing) {
		this.placeOfClearing = placeOfClearing;
	}

	@XmlElement(name = "PstngQty", required = true)
	public Quantity6Choice getPostingQuantity() {
		return postingQuantity;
	}

	public void setPostingQuantity(Quantity6Choice postingQuantity) {
		this.postingQuantity = postingQuantity;
	}

	@XmlElement(name = "NbOfDaysAcrd")
	public Max3Number getNumberOfDaysAccrued() {
		return numberOfDaysAccrued;
	}

	public void setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
	}

	@XmlElement(name = "PstngAmt")
	public AmountAndDirection3 getPostingAmount() {
		return postingAmount;
	}

	public void setPostingAmount(com.tools20022.repository.msg.AmountAndDirection3 postingAmount) {
		this.postingAmount = postingAmount;
	}

	@XmlElement(name = "AcrdIntrstAmt")
	public AmountAndDirection21 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection21 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	@XmlElement(name = "TradDt")
	public TradeDate5Choice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(TradeDate5Choice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "FctvSttlmDt", required = true)
	public DateAndDateTimeChoice getEffectiveSettlementDate() {
		return effectiveSettlementDate;
	}

	public void setEffectiveSettlementDate(DateAndDateTimeChoice effectiveSettlementDate) {
		this.effectiveSettlementDate = effectiveSettlementDate;
	}

	@XmlElement(name = "SttlmDt")
	public SettlementDate9Choice getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(SettlementDate9Choice settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "ValDt")
	public DateAndDateTimeChoice getValueDate() {
		return valueDate;
	}

	public void setValueDate(DateAndDateTimeChoice valueDate) {
		this.valueDate = valueDate;
	}

	@XmlElement(name = "AckdStsTmStmp")
	public ISODateTime getAcknowledgedStatusTimeStamp() {
		return acknowledgedStatusTimeStamp;
	}

	public void setAcknowledgedStatusTimeStamp(ISODateTime acknowledgedStatusTimeStamp) {
		this.acknowledgedStatusTimeStamp = acknowledgedStatusTimeStamp;
	}

	@XmlElement(name = "MtchdStsTmStmp")
	public ISODateTime getMatchedStatusTimeStamp() {
		return matchedStatusTimeStamp;
	}

	public void setMatchedStatusTimeStamp(ISODateTime matchedStatusTimeStamp) {
		this.matchedStatusTimeStamp = matchedStatusTimeStamp;
	}

	@XmlElement(name = "DlvrgSttlmPties")
	public SettlementParties40 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(com.tools20022.repository.msg.SettlementParties40 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	@XmlElement(name = "RcvgSttlmPties")
	public SettlementParties40 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(com.tools20022.repository.msg.SettlementParties40 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	@XmlElement(name = "RvslInd")
	public YesNoIndicator getReversalIndicator() {
		return reversalIndicator;
	}

	public void setReversalIndicator(YesNoIndicator reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
	}

	@XmlElement(name = "TxAddtlDtls")
	public Max350Text getTransactionAdditionalDetails() {
		return transactionAdditionalDetails;
	}

	public void setTransactionAdditionalDetails(Max350Text transactionAdditionalDetails) {
		this.transactionAdditionalDetails = transactionAdditionalDetails;
	}
}