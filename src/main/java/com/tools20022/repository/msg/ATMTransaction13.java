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
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmCashDispensed
 * ATMTransaction13.mmCashDispensed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmTransactionIdentification
 * ATMTransaction13.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmReconciliationIdentification
 * ATMTransaction13.mmReconciliationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction13#mmAccountData
 * ATMTransaction13.mmAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmProtectedAccountData
 * ATMTransaction13.mmProtectedAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmTotalRequestedAmount
 * ATMTransaction13.mmTotalRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmDetailedRequestedAmount
 * ATMTransaction13.mmDetailedRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmCurrencyConversionResult
 * ATMTransaction13.mmCurrencyConversionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmSelectedMixType
 * ATMTransaction13.mmSelectedMixType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction13#mmSelectedMix
 * ATMTransaction13.mmSelectedMix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmRequestedReceipt
 * ATMTransaction13.mmRequestedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmICCRelatedData
 * ATMTransaction13.mmICCRelatedData}</li>
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
 * "ATMTransaction13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Withdrawal transaction for which an authorisation is requested."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction15
 * ATMTransaction15}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction13", propOrder = {"cashDispensed", "transactionIdentification", "reconciliationIdentification", "accountData", "protectedAccountData", "totalRequestedAmount", "detailedRequestedAmount",
		"currencyConversionResult", "selectedMixType", "selectedMix", "requestedReceipt", "iCCRelatedData"})
public class ATMTransaction13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshDspnsd")
	protected TrueFalseIndicator cashDispensed;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	public static final MMMessageAttribute<ATMTransaction13, Optional<TrueFalseIndicator>> mmCashDispensed = new MMMessageAttribute<ATMTransaction13, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "CshDspnsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDispensed";
			definition = "True if cash has to be dispensed by the ATM for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction13 obj) {
			return obj.getCashDispensed();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<TrueFalseIndicator> value) {
			obj.setCashDispensed(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmTransactionIdentification
	 * ATMTransaction15.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction13, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction13, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(ATMTransaction13 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction13 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmReconciliationIdentification
	 * ATMTransaction15.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction13, Optional<Max35Text>> mmReconciliationIdentification = new MMMessageAttribute<ATMTransaction13, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmReconciliationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction13 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<Max35Text> value) {
			obj.setReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctData")
	protected CardAccount7 accountData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount7
	 * CardAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmAccountData
	 * ATMTransaction15.mmAccountData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction13, Optional<CardAccount7>> mmAccountData = new MMMessageAssociationEnd<ATMTransaction13, Optional<CardAccount7>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "AcctData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			definition = "Unprotected account information.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmAccountData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardAccount7.mmObject();
		}

		@Override
		public Optional<CardAccount7> getValue(ATMTransaction13 obj) {
			return obj.getAccountData();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<CardAccount7> value) {
			obj.setAccountData(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdAcctData")
	protected ContentInformationType10 protectedAccountData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmProtectedAccountData
	 * ATMTransaction15.mmProtectedAccountData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction13, Optional<ContentInformationType10>> mmProtectedAccountData = new MMMessageAssociationEnd<ATMTransaction13, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountData";
			definition = "Encryption of account information.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmProtectedAccountData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMTransaction13 obj) {
			return obj.getProtectedAccountData();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedAccountData(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlReqdAmt")
	protected AmountAndCurrency1 totalRequestedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmTotalAmount
	 * ATMTransaction15.mmTotalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction13, Optional<AmountAndCurrency1>> mmTotalRequestedAmount = new MMMessageAssociationEnd<ATMTransaction13, Optional<AmountAndCurrency1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Amount to be authorised by the issuer.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmTotalAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndCurrency1.mmObject();
		}

		@Override
		public Optional<AmountAndCurrency1> getValue(ATMTransaction13 obj) {
			return obj.getTotalRequestedAmount();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<AmountAndCurrency1> value) {
			obj.setTotalRequestedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "DtldReqdAmt")
	protected DetailedAmount12 detailedRequestedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmDetailedRequestedAmount
	 * ATMTransaction15.mmDetailedRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction13, Optional<DetailedAmount12>> mmDetailedRequestedAmount = new MMMessageAssociationEnd<ATMTransaction13, Optional<DetailedAmount12>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Amounts of the withdrawal transaction.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmDetailedRequestedAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount12.mmObject();
		}

		@Override
		public Optional<DetailedAmount12> getValue(ATMTransaction13 obj) {
			return obj.getDetailedRequestedAmount();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<DetailedAmount12> value) {
			obj.setDetailedRequestedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyConvsRslt")
	protected CurrencyConversion9 currencyConversionResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency conversion accepted by the customer, either to convert the amount to dispense in the base currency of the ATM, or to convert the total requested amount in the currency of the customer (so called dynamic currency conversion)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction13, Optional<CurrencyConversion9>> mmCurrencyConversionResult = new MMMessageAssociationEnd<ATMTransaction13, Optional<CurrencyConversion9>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResult";
			definition = "Currency conversion accepted by the customer, either to convert the amount to dispense in the base currency of the ATM, or to convert the total requested amount in the currency of the customer (so called dynamic currency conversion).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyConversion9.mmObject();
		}

		@Override
		public Optional<CurrencyConversion9> getValue(ATMTransaction13 obj) {
			return obj.getCurrencyConversionResult();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<CurrencyConversion9> value) {
			obj.setCurrencyConversionResult(value.orElse(null));
		}
	};
	@XmlElement(name = "SelctdMixTp")
	protected Max35Text selectedMixType;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction13, Optional<Max35Text>> mmSelectedMixType = new MMMessageAttribute<ATMTransaction13, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "SelctdMixTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedMixType";
			definition = "Media mix algorithm, the identification of the algorithm is an agreement between the ATM and the ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction13 obj) {
			return obj.getSelectedMixType();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<Max35Text> value) {
			obj.setSelectedMixType(value.orElse(null));
		}
	};
	@XmlElement(name = "SelctdMix")
	protected List<ATMMediaMix1> selectedMix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMMediaMix1
	 * ATMMediaMix1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction13, List<ATMMediaMix1>> mmSelectedMix = new MMMessageAssociationEnd<ATMTransaction13, List<ATMMediaMix1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "SelctdMix";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedMix";
			definition = "Media mix selected.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMMediaMix1.mmObject();
		}

		@Override
		public List<ATMMediaMix1> getValue(ATMTransaction13 obj) {
			return obj.getSelectedMix();
		}

		@Override
		public void setValue(ATMTransaction13 obj, List<ATMMediaMix1> value) {
			obj.setSelectedMix(value);
		}
	};
	@XmlElement(name = "ReqdRct")
	protected TrueFalseIndicator requestedReceipt;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmRequestedReceipt
	 * ATMTransaction15.mmRequestedReceipt}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction13, Optional<TrueFalseIndicator>> mmRequestedReceipt = new MMMessageAttribute<ATMTransaction13, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "ReqdRct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedReceipt";
			definition = "True if a receipt has be requested by the customer.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmRequestedReceipt);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction13 obj) {
			return obj.getRequestedReceipt();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<TrueFalseIndicator> value) {
			obj.setRequestedReceipt(value.orElse(null));
		}
	};
	@XmlElement(name = "ICCRltdData")
	protected Max10000Binary iCCRelatedData;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmICCRelatedData
	 * ATMTransaction15.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction13, Optional<Max10000Binary>> mmICCRelatedData = new MMMessageAttribute<ATMTransaction13, Optional<Max10000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction13.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmICCRelatedData);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(ATMTransaction13 obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(ATMTransaction13 obj, Optional<Max10000Binary> value) {
			obj.setICCRelatedData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction13.mmCashDispensed, com.tools20022.repository.msg.ATMTransaction13.mmTransactionIdentification,
						com.tools20022.repository.msg.ATMTransaction13.mmReconciliationIdentification, com.tools20022.repository.msg.ATMTransaction13.mmAccountData, com.tools20022.repository.msg.ATMTransaction13.mmProtectedAccountData,
						com.tools20022.repository.msg.ATMTransaction13.mmTotalRequestedAmount, com.tools20022.repository.msg.ATMTransaction13.mmDetailedRequestedAmount,
						com.tools20022.repository.msg.ATMTransaction13.mmCurrencyConversionResult, com.tools20022.repository.msg.ATMTransaction13.mmSelectedMixType, com.tools20022.repository.msg.ATMTransaction13.mmSelectedMix,
						com.tools20022.repository.msg.ATMTransaction13.mmRequestedReceipt, com.tools20022.repository.msg.ATMTransaction13.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction13";
				definition = "Withdrawal transaction for which an authorisation is requested.";
				nextVersions_lazy = () -> Arrays.asList(ATMTransaction15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getCashDispensed() {
		return cashDispensed == null ? Optional.empty() : Optional.of(cashDispensed);
	}

	public ATMTransaction13 setCashDispensed(TrueFalseIndicator cashDispensed) {
		this.cashDispensed = cashDispensed;
		return this;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public ATMTransaction13 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Max35Text> getReconciliationIdentification() {
		return reconciliationIdentification == null ? Optional.empty() : Optional.of(reconciliationIdentification);
	}

	public ATMTransaction13 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
		return this;
	}

	public Optional<CardAccount7> getAccountData() {
		return accountData == null ? Optional.empty() : Optional.of(accountData);
	}

	public ATMTransaction13 setAccountData(CardAccount7 accountData) {
		this.accountData = accountData;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedAccountData() {
		return protectedAccountData == null ? Optional.empty() : Optional.of(protectedAccountData);
	}

	public ATMTransaction13 setProtectedAccountData(ContentInformationType10 protectedAccountData) {
		this.protectedAccountData = protectedAccountData;
		return this;
	}

	public Optional<AmountAndCurrency1> getTotalRequestedAmount() {
		return totalRequestedAmount == null ? Optional.empty() : Optional.of(totalRequestedAmount);
	}

	public ATMTransaction13 setTotalRequestedAmount(AmountAndCurrency1 totalRequestedAmount) {
		this.totalRequestedAmount = totalRequestedAmount;
		return this;
	}

	public Optional<DetailedAmount12> getDetailedRequestedAmount() {
		return detailedRequestedAmount == null ? Optional.empty() : Optional.of(detailedRequestedAmount);
	}

	public ATMTransaction13 setDetailedRequestedAmount(DetailedAmount12 detailedRequestedAmount) {
		this.detailedRequestedAmount = detailedRequestedAmount;
		return this;
	}

	public Optional<CurrencyConversion9> getCurrencyConversionResult() {
		return currencyConversionResult == null ? Optional.empty() : Optional.of(currencyConversionResult);
	}

	public ATMTransaction13 setCurrencyConversionResult(CurrencyConversion9 currencyConversionResult) {
		this.currencyConversionResult = currencyConversionResult;
		return this;
	}

	public Optional<Max35Text> getSelectedMixType() {
		return selectedMixType == null ? Optional.empty() : Optional.of(selectedMixType);
	}

	public ATMTransaction13 setSelectedMixType(Max35Text selectedMixType) {
		this.selectedMixType = selectedMixType;
		return this;
	}

	public List<ATMMediaMix1> getSelectedMix() {
		return selectedMix == null ? selectedMix = new ArrayList<>() : selectedMix;
	}

	public ATMTransaction13 setSelectedMix(List<ATMMediaMix1> selectedMix) {
		this.selectedMix = Objects.requireNonNull(selectedMix);
		return this;
	}

	public Optional<TrueFalseIndicator> getRequestedReceipt() {
		return requestedReceipt == null ? Optional.empty() : Optional.of(requestedReceipt);
	}

	public ATMTransaction13 setRequestedReceipt(TrueFalseIndicator requestedReceipt) {
		this.requestedReceipt = requestedReceipt;
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public ATMTransaction13 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}
}