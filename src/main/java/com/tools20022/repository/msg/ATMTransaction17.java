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
import com.tools20022.repository.codeset.ATMTransactionStatus1Code;
import com.tools20022.repository.codeset.ATMTransactionStatus2Code;
import com.tools20022.repository.codeset.FailureReason7Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Withdrawal transaction for which the completion is sent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTransactionIdentification
 * ATMTransaction17.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTransactionStatus
 * ATMTransaction17.mmTransactionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#mmMultiBundle
 * ATMTransaction17.mmMultiBundle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmBundlePresentedAmount
 * ATMTransaction17.mmBundlePresentedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmPresentedAmountStatus
 * ATMTransaction17.mmPresentedAmountStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#mmIncident
 * ATMTransaction17.mmIncident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmIncidentDetail
 * ATMTransaction17.mmIncidentDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmReconciliationIdentification
 * ATMTransaction17.mmReconciliationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#mmAccountData
 * ATMTransaction17.mmAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmProtectedAccountData
 * ATMTransaction17.mmProtectedAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTotalPresentedAmount
 * ATMTransaction17.mmTotalPresentedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTotalAuthorisedAmount
 * ATMTransaction17.mmTotalAuthorisedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTotalRequestedAmount
 * ATMTransaction17.mmTotalRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmDetailedRequestedAmount
 * ATMTransaction17.mmDetailedRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmCurrencyConversionResult
 * ATMTransaction17.mmCurrencyConversionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmAdditionalCharge
 * ATMTransaction17.mmAdditionalCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmRequestedReceipt
 * ATMTransaction17.mmRequestedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmReceiptPrinted
 * ATMTransaction17.mmReceiptPrinted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmCustomerConsent
 * ATMTransaction17.mmCustomerConsent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#mmLimits
 * ATMTransaction17.mmLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmAuthorisationResult
 * ATMTransaction17.mmAuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmICCRelatedData
 * ATMTransaction17.mmICCRelatedData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#mmATMTotals
 * ATMTransaction17.mmATMTotals}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#mmCassette
 * ATMTransaction17.mmCassette}</li>
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
 * "ATMTransaction17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Withdrawal transaction for which the completion is sent."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction17", propOrder = {"transactionIdentification", "transactionStatus", "multiBundle", "bundlePresentedAmount", "presentedAmountStatus", "incident", "incidentDetail", "reconciliationIdentification",
		"accountData", "protectedAccountData", "totalPresentedAmount", "totalAuthorisedAmount", "totalRequestedAmount", "detailedRequestedAmount", "currencyConversionResult", "additionalCharge", "requestedReceipt", "receiptPrinted",
		"customerConsent", "limits", "authorisationResult", "iCCRelatedData", "aTMTotals", "cassette"})
public class ATMTransaction17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction17, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(ATMTransaction17 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction17 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "TxSts", required = true)
	protected ATMTransactionStatus1Code transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatus1Code
	 * ATMTransactionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentStatus
	 * CardPayment.mmCardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the financial transaction for the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, ATMTransactionStatus1Code> mmTransactionStatus = new MMMessageAttribute<ATMTransaction17, ATMTransactionStatus1Code>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Outcome of the financial transaction for the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMTransactionStatus1Code.mmObject();
		}

		@Override
		public ATMTransactionStatus1Code getValue(ATMTransaction17 obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(ATMTransaction17 obj, ATMTransactionStatus1Code value) {
			obj.setTransactionStatus(value);
		}
	};
	@XmlElement(name = "MultiBndl")
	protected TrueFalseIndicator multiBundle;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MultiBndl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiBundle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Multi bundle dispense."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, Optional<TrueFalseIndicator>> mmMultiBundle = new MMMessageAttribute<ATMTransaction17, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "MultiBndl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiBundle";
			definition = "Multi bundle dispense.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction17 obj) {
			return obj.getMultiBundle();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<TrueFalseIndicator> value) {
			obj.setMultiBundle(value.orElse(null));
		}
	};
	@XmlElement(name = "BndlPresntdAmt")
	protected List<ImpliedCurrencyAndAmount> bundlePresentedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BndlPresntdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BundlePresentedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount per bundle in the currency of the total presented amount, in the order of the presentation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, List<ImpliedCurrencyAndAmount>> mmBundlePresentedAmount = new MMMessageAttribute<ATMTransaction17, List<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "BndlPresntdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BundlePresentedAmount";
			definition = "Amount per bundle in the currency of the total presented amount, in the order of the presentation.";
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public List<ImpliedCurrencyAndAmount> getValue(ATMTransaction17 obj) {
			return obj.getBundlePresentedAmount();
		}

		@Override
		public void setValue(ATMTransaction17 obj, List<ImpliedCurrencyAndAmount> value) {
			obj.setBundlePresentedAmount(value);
		}
	};
	@XmlElement(name = "PresntdAmtSts", required = true)
	protected ATMTransactionStatus2Code presentedAmountStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatus2Code
	 * ATMTransactionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PresntdAmtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedAmountStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the amount presented to the customer in the last bundle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, ATMTransactionStatus2Code> mmPresentedAmountStatus = new MMMessageAttribute<ATMTransaction17, ATMTransactionStatus2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "PresntdAmtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentedAmountStatus";
			definition = "Status of the amount presented to the customer in the last bundle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMTransactionStatus2Code.mmObject();
		}

		@Override
		public ATMTransactionStatus2Code getValue(ATMTransaction17 obj) {
			return obj.getPresentedAmountStatus();
		}

		@Override
		public void setValue(ATMTransaction17 obj, ATMTransactionStatus2Code value) {
			obj.setPresentedAmountStatus(value);
		}
	};
	@XmlElement(name = "Incdnt")
	protected List<FailureReason7Code> incident;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason7Code
	 * FailureReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incdnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Incident occurring during the processing of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, List<FailureReason7Code>> mmIncident = new MMMessageAttribute<ATMTransaction17, List<FailureReason7Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "Incdnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incident";
			definition = "Incident occurring during the processing of the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason7Code.mmObject();
		}

		@Override
		public List<FailureReason7Code> getValue(ATMTransaction17 obj) {
			return obj.getIncident();
		}

		@Override
		public void setValue(ATMTransaction17 obj, List<FailureReason7Code> value) {
			obj.setIncident(value);
		}
	};
	@XmlElement(name = "IncdntDtl")
	protected List<Max70Text> incidentDetail;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncdntDtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncidentDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Explanation of the incident."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, List<Max70Text>> mmIncidentDetail = new MMMessageAttribute<ATMTransaction17, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "IncdntDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncidentDetail";
			definition = "Explanation of the incident.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(ATMTransaction17 obj) {
			return obj.getIncidentDetail();
		}

		@Override
		public void setValue(ATMTransaction17 obj, List<Max70Text> value) {
			obj.setIncidentDetail(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, Optional<Max35Text>> mmReconciliationIdentification = new MMMessageAttribute<ATMTransaction17, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction17 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<Max35Text> value) {
			obj.setReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctData")
	protected CardAccount11 accountData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount11
	 * CardAccount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, Optional<CardAccount11>> mmAccountData = new MMMessageAssociationEnd<ATMTransaction17, Optional<CardAccount11>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "AcctData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			definition = "Unprotected account information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardAccount11.mmObject();
		}

		@Override
		public Optional<CardAccount11> getValue(ATMTransaction17 obj) {
			return obj.getAccountData();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<CardAccount11> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, Optional<ContentInformationType10>> mmProtectedAccountData = new MMMessageAssociationEnd<ATMTransaction17, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountData";
			definition = "Encryption of account information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMTransaction17 obj) {
			return obj.getProtectedAccountData();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedAccountData(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlPresntdAmt", required = true)
	protected AmountAndCurrency1 totalPresentedAmount;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPresntdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPresentedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount presented to the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, AmountAndCurrency1> mmTotalPresentedAmount = new MMMessageAssociationEnd<ATMTransaction17, AmountAndCurrency1>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "TtlPresntdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPresentedAmount";
			definition = "Total amount presented to the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndCurrency1.mmObject();
		}

		@Override
		public AmountAndCurrency1 getValue(ATMTransaction17 obj) {
			return obj.getTotalPresentedAmount();
		}

		@Override
		public void setValue(ATMTransaction17 obj, AmountAndCurrency1 value) {
			obj.setTotalPresentedAmount(value);
		}
	};
	@XmlElement(name = "TtlAuthrsdAmt")
	protected ImpliedCurrencyAndAmount totalAuthorisedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAuthrsdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAuthorisedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total authorised amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, Optional<ImpliedCurrencyAndAmount>> mmTotalAuthorisedAmount = new MMMessageAttribute<ATMTransaction17, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "TtlAuthrsdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAuthorisedAmount";
			definition = "Total authorised amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTransaction17 obj) {
			return obj.getTotalAuthorisedAmount();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setTotalAuthorisedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlReqdAmt")
	protected ImpliedCurrencyAndAmount totalRequestedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * definition} = "Total requested amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, Optional<ImpliedCurrencyAndAmount>> mmTotalRequestedAmount = new MMMessageAttribute<ATMTransaction17, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Total requested amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTransaction17 obj) {
			return obj.getTotalRequestedAmount();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<ImpliedCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * definition} =
	 * "Detail of the requested amounts for the withdrawal transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, Optional<DetailedAmount12>> mmDetailedRequestedAmount = new MMMessageAssociationEnd<ATMTransaction17, Optional<DetailedAmount12>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Detail of the requested amounts for the withdrawal transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount12.mmObject();
		}

		@Override
		public Optional<DetailedAmount12> getValue(ATMTransaction17 obj) {
			return obj.getDetailedRequestedAmount();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<DetailedAmount12> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	public static final MMMessageAssociationEnd<ATMTransaction17, Optional<CurrencyConversion9>> mmCurrencyConversionResult = new MMMessageAssociationEnd<ATMTransaction17, Optional<CurrencyConversion9>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
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
		public Optional<CurrencyConversion9> getValue(ATMTransaction17 obj) {
			return obj.getCurrencyConversionResult();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<CurrencyConversion9> value) {
			obj.setCurrencyConversionResult(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlChrg")
	protected List<DetailedAmount13> additionalCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount13
	 * DetailedAmount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional charge (for instance tax or fee)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, List<DetailedAmount13>> mmAdditionalCharge = new MMMessageAssociationEnd<ATMTransaction17, List<DetailedAmount13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "AddtlChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCharge";
			definition = "Additional charge (for instance tax or fee).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount13.mmObject();
		}

		@Override
		public List<DetailedAmount13> getValue(ATMTransaction17 obj) {
			return obj.getAdditionalCharge();
		}

		@Override
		public void setValue(ATMTransaction17 obj, List<DetailedAmount13> value) {
			obj.setAdditionalCharge(value);
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * definition} = "True if the customer has requested a receipt."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, Optional<TrueFalseIndicator>> mmRequestedReceipt = new MMMessageAttribute<ATMTransaction17, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "ReqdRct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedReceipt";
			definition = "True if the customer has requested a receipt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction17 obj) {
			return obj.getRequestedReceipt();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<TrueFalseIndicator> value) {
			obj.setRequestedReceipt(value.orElse(null));
		}
	};
	@XmlElement(name = "RctPrtd")
	protected TrueFalseIndicator receiptPrinted;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RctPrtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptPrinted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if a receipt has been printed and presented to the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, Optional<TrueFalseIndicator>> mmReceiptPrinted = new MMMessageAttribute<ATMTransaction17, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "RctPrtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptPrinted";
			definition = "True if a receipt has been printed and presented to the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction17 obj) {
			return obj.getReceiptPrinted();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<TrueFalseIndicator> value) {
			obj.setReceiptPrinted(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrCnsnt")
	protected TrueFalseIndicator customerConsent;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * "Explicit consent expressed by a customer on a card-related service proposed by an acquirer or an issuer or any agent acting on behalf of one of them."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, Optional<TrueFalseIndicator>> mmCustomerConsent = new MMMessageAttribute<ATMTransaction17, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "CstmrCnsnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConsent";
			definition = "Explicit consent expressed by a customer on a card-related service proposed by an acquirer or an issuer or any agent acting on behalf of one of them.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction17 obj) {
			return obj.getCustomerConsent();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<TrueFalseIndicator> value) {
			obj.setCustomerConsent(value.orElse(null));
		}
	};
	@XmlElement(name = "Lmts")
	protected ATMTransactionAmounts6 limits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
	 * ATMTransactionAmounts6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
	 * PaymentCard.mmLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit of amounts for the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, Optional<ATMTransactionAmounts6>> mmLimits = new MMMessageAssociationEnd<ATMTransaction17, Optional<ATMTransactionAmounts6>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Limit of amounts for the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTransactionAmounts6.mmObject();
		}

		@Override
		public Optional<ATMTransactionAmounts6> getValue(ATMTransaction17 obj) {
			return obj.getLimits();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<ATMTransactionAmounts6> value) {
			obj.setLimits(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthstnRslt")
	protected AuthorisationResult13 authorisationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * definition} = "Outcome of the withdrawal authorisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, Optional<AuthorisationResult13>> mmAuthorisationResult = new MMMessageAssociationEnd<ATMTransaction17, Optional<AuthorisationResult13>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the withdrawal authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthorisationResult13.mmObject();
		}

		@Override
		public Optional<AuthorisationResult13> getValue(ATMTransaction17 obj) {
			return obj.getAuthorisationResult();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<AuthorisationResult13> value) {
			obj.setAuthorisationResult(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction17, Optional<Max10000Binary>> mmICCRelatedData = new MMMessageAttribute<ATMTransaction17, Optional<Max10000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(ATMTransaction17 obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(ATMTransaction17 obj, Optional<Max10000Binary> value) {
			obj.setICCRelatedData(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMTtls")
	protected List<ATMTotals1> aTMTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTotals1 ATMTotals1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmATMTotal
	 * CardPayment.mmATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current totals of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, List<ATMTotals1>> mmATMTotals = new MMMessageAssociationEnd<ATMTransaction17, List<ATMTotals1>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmATMTotal;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "ATMTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTotals";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTotals1.mmObject();
		}

		@Override
		public List<ATMTotals1> getValue(ATMTransaction17 obj) {
			return obj.getATMTotals();
		}

		@Override
		public void setValue(ATMTransaction17 obj, List<ATMTotals1> value) {
			obj.setATMTotals(value);
		}
	};
	@XmlElement(name = "Csstt")
	protected List<ATMCassette2> cassette;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassette2
	 * ATMCassette2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17
	 * ATMTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Csstt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cassette"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the cassettes of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction17, List<ATMCassette2>> mmCassette = new MMMessageAssociationEnd<ATMTransaction17, List<ATMCassette2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction17.mmObject();
			isDerived = false;
			xmlTag = "Csstt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cassette";
			definition = "Information on the cassettes of the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCassette2.mmObject();
		}

		@Override
		public List<ATMCassette2> getValue(ATMTransaction17 obj) {
			return obj.getCassette();
		}

		@Override
		public void setValue(ATMTransaction17 obj, List<ATMCassette2> value) {
			obj.setCassette(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction17.mmTransactionIdentification, com.tools20022.repository.msg.ATMTransaction17.mmTransactionStatus,
						com.tools20022.repository.msg.ATMTransaction17.mmMultiBundle, com.tools20022.repository.msg.ATMTransaction17.mmBundlePresentedAmount, com.tools20022.repository.msg.ATMTransaction17.mmPresentedAmountStatus,
						com.tools20022.repository.msg.ATMTransaction17.mmIncident, com.tools20022.repository.msg.ATMTransaction17.mmIncidentDetail, com.tools20022.repository.msg.ATMTransaction17.mmReconciliationIdentification,
						com.tools20022.repository.msg.ATMTransaction17.mmAccountData, com.tools20022.repository.msg.ATMTransaction17.mmProtectedAccountData, com.tools20022.repository.msg.ATMTransaction17.mmTotalPresentedAmount,
						com.tools20022.repository.msg.ATMTransaction17.mmTotalAuthorisedAmount, com.tools20022.repository.msg.ATMTransaction17.mmTotalRequestedAmount,
						com.tools20022.repository.msg.ATMTransaction17.mmDetailedRequestedAmount, com.tools20022.repository.msg.ATMTransaction17.mmCurrencyConversionResult, com.tools20022.repository.msg.ATMTransaction17.mmAdditionalCharge,
						com.tools20022.repository.msg.ATMTransaction17.mmRequestedReceipt, com.tools20022.repository.msg.ATMTransaction17.mmReceiptPrinted, com.tools20022.repository.msg.ATMTransaction17.mmCustomerConsent,
						com.tools20022.repository.msg.ATMTransaction17.mmLimits, com.tools20022.repository.msg.ATMTransaction17.mmAuthorisationResult, com.tools20022.repository.msg.ATMTransaction17.mmICCRelatedData,
						com.tools20022.repository.msg.ATMTransaction17.mmATMTotals, com.tools20022.repository.msg.ATMTransaction17.mmCassette);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction17";
				definition = "Withdrawal transaction for which the completion is sent.";
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public ATMTransaction17 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public ATMTransactionStatus1Code getTransactionStatus() {
		return transactionStatus;
	}

	public ATMTransaction17 setTransactionStatus(ATMTransactionStatus1Code transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public Optional<TrueFalseIndicator> getMultiBundle() {
		return multiBundle == null ? Optional.empty() : Optional.of(multiBundle);
	}

	public ATMTransaction17 setMultiBundle(TrueFalseIndicator multiBundle) {
		this.multiBundle = multiBundle;
		return this;
	}

	public List<ImpliedCurrencyAndAmount> getBundlePresentedAmount() {
		return bundlePresentedAmount == null ? bundlePresentedAmount = new ArrayList<>() : bundlePresentedAmount;
	}

	public ATMTransaction17 setBundlePresentedAmount(List<ImpliedCurrencyAndAmount> bundlePresentedAmount) {
		this.bundlePresentedAmount = Objects.requireNonNull(bundlePresentedAmount);
		return this;
	}

	public ATMTransactionStatus2Code getPresentedAmountStatus() {
		return presentedAmountStatus;
	}

	public ATMTransaction17 setPresentedAmountStatus(ATMTransactionStatus2Code presentedAmountStatus) {
		this.presentedAmountStatus = Objects.requireNonNull(presentedAmountStatus);
		return this;
	}

	public List<FailureReason7Code> getIncident() {
		return incident == null ? incident = new ArrayList<>() : incident;
	}

	public ATMTransaction17 setIncident(List<FailureReason7Code> incident) {
		this.incident = Objects.requireNonNull(incident);
		return this;
	}

	public List<Max70Text> getIncidentDetail() {
		return incidentDetail == null ? incidentDetail = new ArrayList<>() : incidentDetail;
	}

	public ATMTransaction17 setIncidentDetail(List<Max70Text> incidentDetail) {
		this.incidentDetail = Objects.requireNonNull(incidentDetail);
		return this;
	}

	public Optional<Max35Text> getReconciliationIdentification() {
		return reconciliationIdentification == null ? Optional.empty() : Optional.of(reconciliationIdentification);
	}

	public ATMTransaction17 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
		return this;
	}

	public Optional<CardAccount11> getAccountData() {
		return accountData == null ? Optional.empty() : Optional.of(accountData);
	}

	public ATMTransaction17 setAccountData(CardAccount11 accountData) {
		this.accountData = accountData;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedAccountData() {
		return protectedAccountData == null ? Optional.empty() : Optional.of(protectedAccountData);
	}

	public ATMTransaction17 setProtectedAccountData(ContentInformationType10 protectedAccountData) {
		this.protectedAccountData = protectedAccountData;
		return this;
	}

	public AmountAndCurrency1 getTotalPresentedAmount() {
		return totalPresentedAmount;
	}

	public ATMTransaction17 setTotalPresentedAmount(AmountAndCurrency1 totalPresentedAmount) {
		this.totalPresentedAmount = Objects.requireNonNull(totalPresentedAmount);
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getTotalAuthorisedAmount() {
		return totalAuthorisedAmount == null ? Optional.empty() : Optional.of(totalAuthorisedAmount);
	}

	public ATMTransaction17 setTotalAuthorisedAmount(ImpliedCurrencyAndAmount totalAuthorisedAmount) {
		this.totalAuthorisedAmount = totalAuthorisedAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getTotalRequestedAmount() {
		return totalRequestedAmount == null ? Optional.empty() : Optional.of(totalRequestedAmount);
	}

	public ATMTransaction17 setTotalRequestedAmount(ImpliedCurrencyAndAmount totalRequestedAmount) {
		this.totalRequestedAmount = totalRequestedAmount;
		return this;
	}

	public Optional<DetailedAmount12> getDetailedRequestedAmount() {
		return detailedRequestedAmount == null ? Optional.empty() : Optional.of(detailedRequestedAmount);
	}

	public ATMTransaction17 setDetailedRequestedAmount(DetailedAmount12 detailedRequestedAmount) {
		this.detailedRequestedAmount = detailedRequestedAmount;
		return this;
	}

	public Optional<CurrencyConversion9> getCurrencyConversionResult() {
		return currencyConversionResult == null ? Optional.empty() : Optional.of(currencyConversionResult);
	}

	public ATMTransaction17 setCurrencyConversionResult(CurrencyConversion9 currencyConversionResult) {
		this.currencyConversionResult = currencyConversionResult;
		return this;
	}

	public List<DetailedAmount13> getAdditionalCharge() {
		return additionalCharge == null ? additionalCharge = new ArrayList<>() : additionalCharge;
	}

	public ATMTransaction17 setAdditionalCharge(List<DetailedAmount13> additionalCharge) {
		this.additionalCharge = Objects.requireNonNull(additionalCharge);
		return this;
	}

	public Optional<TrueFalseIndicator> getRequestedReceipt() {
		return requestedReceipt == null ? Optional.empty() : Optional.of(requestedReceipt);
	}

	public ATMTransaction17 setRequestedReceipt(TrueFalseIndicator requestedReceipt) {
		this.requestedReceipt = requestedReceipt;
		return this;
	}

	public Optional<TrueFalseIndicator> getReceiptPrinted() {
		return receiptPrinted == null ? Optional.empty() : Optional.of(receiptPrinted);
	}

	public ATMTransaction17 setReceiptPrinted(TrueFalseIndicator receiptPrinted) {
		this.receiptPrinted = receiptPrinted;
		return this;
	}

	public Optional<TrueFalseIndicator> getCustomerConsent() {
		return customerConsent == null ? Optional.empty() : Optional.of(customerConsent);
	}

	public ATMTransaction17 setCustomerConsent(TrueFalseIndicator customerConsent) {
		this.customerConsent = customerConsent;
		return this;
	}

	public Optional<ATMTransactionAmounts6> getLimits() {
		return limits == null ? Optional.empty() : Optional.of(limits);
	}

	public ATMTransaction17 setLimits(ATMTransactionAmounts6 limits) {
		this.limits = limits;
		return this;
	}

	public Optional<AuthorisationResult13> getAuthorisationResult() {
		return authorisationResult == null ? Optional.empty() : Optional.of(authorisationResult);
	}

	public ATMTransaction17 setAuthorisationResult(AuthorisationResult13 authorisationResult) {
		this.authorisationResult = authorisationResult;
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public ATMTransaction17 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}

	public List<ATMTotals1> getATMTotals() {
		return aTMTotals == null ? aTMTotals = new ArrayList<>() : aTMTotals;
	}

	public ATMTransaction17 setATMTotals(List<ATMTotals1> aTMTotals) {
		this.aTMTotals = Objects.requireNonNull(aTMTotals);
		return this;
	}

	public List<ATMCassette2> getCassette() {
		return cassette == null ? cassette = new ArrayList<>() : cassette;
	}

	public ATMTransaction17 setCassette(List<ATMCassette2> cassette) {
		this.cassette = Objects.requireNonNull(cassette);
		return this;
	}
}