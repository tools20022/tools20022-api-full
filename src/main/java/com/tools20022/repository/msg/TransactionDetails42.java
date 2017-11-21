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
import com.tools20022.repository.choice.PartyIdentification60Choice;
import com.tools20022.repository.choice.Quantity10Choice;
import com.tools20022.repository.choice.SettlementDate6Choice;
import com.tools20022.repository.choice.TradeDate2Choice;
import com.tools20022.repository.codeset.DeliveryReceiptType2Code;
import com.tools20022.repository.codeset.ReceiveDelivery1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmFinancialInstrumentIdentification
 * TransactionDetails42.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSecuritiesMovementType
 * TransactionDetails42.mmSecuritiesMovementType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails42#mmPayment
 * TransactionDetails42.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSettlementQuantity
 * TransactionDetails42.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSafekeepingAccount
 * TransactionDetails42.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSettlementAmount
 * TransactionDetails42.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSettlementDate
 * TransactionDetails42.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmTradeDate
 * TransactionDetails42.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmDeliveringSettlementParties
 * TransactionDetails42.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmReceivingSettlementParties
 * TransactionDetails42.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmInvestor
 * TransactionDetails42.mmInvestor}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionDetails42"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the details of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails46
 * TransactionDetails46}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionDetails40
 * TransactionDetails40}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionDetails42", propOrder = {"financialInstrumentIdentification", "securitiesMovementType", "payment", "settlementQuantity", "safekeepingAccount", "settlementAmount", "settlementDate", "tradeDate",
		"deliveringSettlementParties", "receivingSettlementParties", "investor"})
public class TransactionDetails42 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification15 financialInstrumentIdentification;
	/**
	 * Way(s) of identifying the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Way(s) of identifying the security.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification15.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesMovementType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesMovementType;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
		}
	};
	protected DeliveryReceiptType2Code payment;
	/**
	 * Specifies how the transaction is to be settled, eg, against payment.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
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
	 * "Specifies how the transaction is to be settled, eg, against payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, eg, against payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}
	};
	protected Quantity10Choice settlementQuantity;
	/**
	 * Total quantity of securities to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity10Choice
	 * Quantity10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity10Choice.mmObject();
		}
	};
	protected SecuritiesAccount17 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount17
	 * SecuritiesAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesAccount;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount17.mmObject();
		}
	};
	protected AmountAndDirection12 settlementAmount;
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection12
	 * AmountAndDirection12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection12.mmObject();
		}
	};
	protected SettlementDate6Choice settlementDate;
	/**
	 * Date and time at which the securities are to be delivered or received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate6Choice
	 * SettlementDate6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementDate6Choice.mmObject();
		}
	};
	protected TradeDate2Choice tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeDate2Choice
	 * TradeDate2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDate2Choice.mmObject();
		}
	};
	protected SettlementParties21 deliveringSettlementParties;
	/**
	 * Identifies the chain of delivering settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties21
	 * SettlementParties21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringSettlementParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties21.mmObject();
		}
	};
	protected SettlementParties21 receivingSettlementParties;
	/**
	 * Identifies the chain of receiving settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties21
	 * SettlementParties21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingSettlementParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties21.mmObject();
		}
	};
	protected PartyIdentification60Choice investor;
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice
	 * PartyIdentification60Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> TransactionDetails42.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification60Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionDetails42.mmFinancialInstrumentIdentification, TransactionDetails42.mmSecuritiesMovementType, TransactionDetails42.mmPayment, TransactionDetails42.mmSettlementQuantity,
						TransactionDetails42.mmSafekeepingAccount, TransactionDetails42.mmSettlementAmount, TransactionDetails42.mmSettlementDate, TransactionDetails42.mmTradeDate, TransactionDetails42.mmDeliveringSettlementParties,
						TransactionDetails42.mmReceivingSettlementParties, TransactionDetails42.mmInvestor);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransactionDetails42";
				definition = "Identifies the details of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionDetails46.mmObject());
				previousVersion_lazy = () -> TransactionDetails40.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification15 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification15 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
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

	@XmlElement(name = "SttlmQty", required = true)
	public Quantity10Choice getSettlementQuantity() {
		return settlementQuantity;
	}

	public void setSettlementQuantity(Quantity10Choice settlementQuantity) {
		this.settlementQuantity = settlementQuantity;
	}

	@XmlElement(name = "SfkpgAcct", required = true)
	public SecuritiesAccount17 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(com.tools20022.repository.msg.SecuritiesAccount17 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "SttlmAmt")
	public AmountAndDirection12 getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(com.tools20022.repository.msg.AmountAndDirection12 settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "SttlmDt", required = true)
	public SettlementDate6Choice getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(SettlementDate6Choice settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "TradDt")
	public TradeDate2Choice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(TradeDate2Choice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "DlvrgSttlmPties")
	public SettlementParties21 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(com.tools20022.repository.msg.SettlementParties21 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	@XmlElement(name = "RcvgSttlmPties")
	public SettlementParties21 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(com.tools20022.repository.msg.SettlementParties21 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	@XmlElement(name = "Invstr")
	public PartyIdentification60Choice getInvestor() {
		return investor;
	}

	public void setInvestor(PartyIdentification60Choice investor) {
		this.investor = investor;
	}
}