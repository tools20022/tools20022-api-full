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
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Withdrawal transaction for which an authorisation is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmCashDispensed
 * ATMTransaction1.mmCashDispensed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmTransactionIdentification
 * ATMTransaction1.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmReconciliationIdentification
 * ATMTransaction1.mmReconciliationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction1#mmAccountData
 * ATMTransaction1.mmAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmProtectedAccountData
 * ATMTransaction1.mmProtectedAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmTotalRequestedAmount
 * ATMTransaction1.mmTotalRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmDetailedRequestedAmount
 * ATMTransaction1.mmDetailedRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmCurrencyConversion
 * ATMTransaction1.mmCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmSelectedMixType
 * ATMTransaction1.mmSelectedMixType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction1#mmSelectedMix
 * ATMTransaction1.mmSelectedMix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmRequestedReceipt
 * ATMTransaction1.mmRequestedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmICCRelatedData
 * ATMTransaction1.mmICCRelatedData}</li>
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
 * "ATMTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Withdrawal transaction for which an authorisation is requested."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction2
 * ATMTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8
 * ATMTransaction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction6
 * ATMTransaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction7
 * ATMTransaction7}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ATMTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator cashDispensed;
	/**
	 * True if cash has to be dispensed by the ATM for the transaction.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshDspnsd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDispensed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if cash has to be dispensed by the ATM for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashDispensed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CshDspnsd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDispensed";
			definition = "True if cash has to be dispensed by the ATM for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * Identification of the transaction assigned by the ATM.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
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
	 * definition} = "Identification of the transaction assigned by the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmTransactionIdentification
	 * ATMTransaction2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmTransactionIdentification
	 * ATMTransaction6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#mmTransactionIdentification
	 * ATMTransaction7.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.mmTransactionIdentification, com.tools20022.repository.msg.ATMTransaction6.mmTransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction7.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected Max35Text reconciliationIdentification;
	/**
	 * Identification of the reconciliation period assigned by the ATM.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
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
	 * "Identification of the reconciliation period assigned by the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmReconciliationIdentification
	 * ATMTransaction2.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.mmReconciliationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CardAccount3 accountData;
	/**
	 * Unprotected account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount3
	 * CardAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unprotected account information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmAccountData
	 * ATMTransaction2.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmAccountData
	 * ATMTransaction6.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#mmAccountInformation
	 * ATMTransaction7.mmAccountInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountData = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmAccount;
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "AcctData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			definition = "Unprotected account information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.mmAccountData, com.tools20022.repository.msg.ATMTransaction6.mmAccountData,
					com.tools20022.repository.msg.ATMTransaction7.mmAccountInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount3.mmObject();
		}
	};
	protected ContentInformationType10 protectedAccountData;
	/**
	 * Encryption of account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAcctData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of account information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmProtectedAccountData
	 * ATMTransaction2.mmProtectedAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmProtectedAccountData
	 * ATMTransaction6.mmProtectedAccountData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAccountData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountData";
			definition = "Encryption of account information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.mmProtectedAccountData, com.tools20022.repository.msg.ATMTransaction6.mmProtectedAccountData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected AmountAndCurrency1 totalRequestedAmount;
	/**
	 * Amount to be authorised by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndCurrency1
	 * AmountAndCurrency1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlReqdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount to be authorised by the issuer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmTotalRequestedAmount
	 * ATMTransaction6.mmTotalRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalRequestedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmAmount;
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Amount to be authorised by the issuer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction6.mmTotalRequestedAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrency1.mmObject();
		}
	};
	protected DetailedAmount12 detailedRequestedAmount;
	/**
	 * Amounts of the withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount12
	 * DetailedAmount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldReqdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amounts of the withdrawal transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmDetailedRequestedAmount
	 * ATMTransaction6.mmDetailedRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedRequestedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmAmount;
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Amounts of the withdrawal transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction6.mmDetailedRequestedAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount12.mmObject();
		}
	};
	protected CurrencyConversion4 currencyConversion;
	/**
	 * Currency conversion accepted by the customer, either to convert the
	 * amount to dispense in the base currency of the ATM, or to convert the
	 * total requested amount in the currency of the customer (so called dynamic
	 * currency conversion).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion4
	 * CurrencyConversion4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency conversion accepted by the customer, either to convert the amount to dispense in the base currency of the ATM, or to convert the total requested amount in the currency of the customer (so called dynamic currency conversion)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmCurrencyConversion
	 * ATMTransaction2.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#mmCurrencyConversion
	 * ATMTransaction7.mmCurrencyConversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyConversion = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmCurrencyExchange;
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CcyConvs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversion";
			definition = "Currency conversion accepted by the customer, either to convert the amount to dispense in the base currency of the ATM, or to convert the total requested amount in the currency of the customer (so called dynamic currency conversion).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.mmCurrencyConversion, com.tools20022.repository.msg.ATMTransaction7.mmCurrencyConversion);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyConversion4.mmObject();
		}
	};
	protected Max35Text selectedMixType;
	/**
	 * Media mix algorithm, the identification of the algorithm is an agreement
	 * between the ATM and the ATM manager.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctdMixTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectedMixType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Media mix algorithm, the identification of the algorithm is an agreement between the ATM and the ATM manager."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction2#mmMixType
	 * ATMTransaction2.mmMixType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmMixType
	 * ATMTransaction8.mmMixType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSelectedMixType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SelctdMixTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedMixType";
			definition = "Media mix algorithm, the identification of the algorithm is an agreement between the ATM and the ATM manager.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.mmMixType, com.tools20022.repository.msg.ATMTransaction8.mmMixType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMMediaMix1> selectedMix;
	/**
	 * Media mix selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMMediaMix1
	 * ATMMediaMix1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctdMix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectedMix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Media mix selected."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction2#mmMix
	 * ATMTransaction2.mmMix}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmMix
	 * ATMTransaction8.mmMix}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSelectedMix = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SelctdMix";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedMix";
			definition = "Media mix selected.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.mmMix, com.tools20022.repository.msg.ATMTransaction8.mmMix);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMMediaMix1.mmObject();
		}
	};
	protected TrueFalseIndicator requestedReceipt;
	/**
	 * True if a receipt has be requested by the customer.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdRct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True if a receipt has be requested by the customer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction8#mmReceiptFlag
	 * ATMTransaction8.mmReceiptFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedReceipt = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "ReqdRct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedReceipt";
			definition = "True if a receipt has be requested by the customer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction8.mmReceiptFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Max10000Binary iCCRelatedData;
	/**
	 * Sequence of one or more TLV data elements from the ATM application, in
	 * accordance with ISO 7816-6, not in a specific order. Present if the
	 * transaction is performed with an EMV chip card application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1
	 * ATMTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmICCRelatedData
	 * ATMTransaction2.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmICCRelatedData
	 * ATMTransaction6.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#mmICCRelatedData
	 * ATMTransaction7.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction1.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.mmICCRelatedData, com.tools20022.repository.msg.ATMTransaction6.mmICCRelatedData,
					com.tools20022.repository.msg.ATMTransaction7.mmICCRelatedData);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction1.mmCashDispensed, com.tools20022.repository.msg.ATMTransaction1.mmTransactionIdentification,
						com.tools20022.repository.msg.ATMTransaction1.mmReconciliationIdentification, com.tools20022.repository.msg.ATMTransaction1.mmAccountData, com.tools20022.repository.msg.ATMTransaction1.mmProtectedAccountData,
						com.tools20022.repository.msg.ATMTransaction1.mmTotalRequestedAmount, com.tools20022.repository.msg.ATMTransaction1.mmDetailedRequestedAmount, com.tools20022.repository.msg.ATMTransaction1.mmCurrencyConversion,
						com.tools20022.repository.msg.ATMTransaction1.mmSelectedMixType, com.tools20022.repository.msg.ATMTransaction1.mmSelectedMix, com.tools20022.repository.msg.ATMTransaction1.mmRequestedReceipt,
						com.tools20022.repository.msg.ATMTransaction1.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction1";
				definition = "Withdrawal transaction for which an authorisation is requested.";
				nextVersions_lazy = () -> Arrays.asList(ATMTransaction2.mmObject(), ATMTransaction8.mmObject(), ATMTransaction6.mmObject(), ATMTransaction7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getCashDispensed() {
		return cashDispensed;
	}

	public void setCashDispensed(TrueFalseIndicator cashDispensed) {
		this.cashDispensed = cashDispensed;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	public CardAccount3 getAccountData() {
		return accountData;
	}

	public void setAccountData(com.tools20022.repository.msg.CardAccount3 accountData) {
		this.accountData = accountData;
	}

	public ContentInformationType10 getProtectedAccountData() {
		return protectedAccountData;
	}

	public void setProtectedAccountData(com.tools20022.repository.msg.ContentInformationType10 protectedAccountData) {
		this.protectedAccountData = protectedAccountData;
	}

	public AmountAndCurrency1 getTotalRequestedAmount() {
		return totalRequestedAmount;
	}

	public void setTotalRequestedAmount(com.tools20022.repository.msg.AmountAndCurrency1 totalRequestedAmount) {
		this.totalRequestedAmount = totalRequestedAmount;
	}

	public DetailedAmount12 getDetailedRequestedAmount() {
		return detailedRequestedAmount;
	}

	public void setDetailedRequestedAmount(com.tools20022.repository.msg.DetailedAmount12 detailedRequestedAmount) {
		this.detailedRequestedAmount = detailedRequestedAmount;
	}

	public CurrencyConversion4 getCurrencyConversion() {
		return currencyConversion;
	}

	public void setCurrencyConversion(com.tools20022.repository.msg.CurrencyConversion4 currencyConversion) {
		this.currencyConversion = currencyConversion;
	}

	public Max35Text getSelectedMixType() {
		return selectedMixType;
	}

	public void setSelectedMixType(Max35Text selectedMixType) {
		this.selectedMixType = selectedMixType;
	}

	public List<ATMMediaMix1> getSelectedMix() {
		return selectedMix;
	}

	public void setSelectedMix(List<com.tools20022.repository.msg.ATMMediaMix1> selectedMix) {
		this.selectedMix = selectedMix;
	}

	public TrueFalseIndicator getRequestedReceipt() {
		return requestedReceipt;
	}

	public void setRequestedReceipt(TrueFalseIndicator requestedReceipt) {
		this.requestedReceipt = requestedReceipt;
	}

	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}
}