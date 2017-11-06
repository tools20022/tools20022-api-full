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
import com.tools20022.repository.codeset.ATMTransactionStatus1Code;
import com.tools20022.repository.codeset.ATMTransactionStatus2Code;
import com.tools20022.repository.codeset.FailureReason4Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmTransactionIdentification
 * ATMTransaction3.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmTransactionStatus
 * ATMTransaction3.mmTransactionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#mmMultiBundle
 * ATMTransaction3.mmMultiBundle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmBundlePresentedAmount
 * ATMTransaction3.mmBundlePresentedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmPresentedAmountStatus
 * ATMTransaction3.mmPresentedAmountStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#mmIncident
 * ATMTransaction3.mmIncident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmIncidentDetail
 * ATMTransaction3.mmIncidentDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmReconciliationIdentification
 * ATMTransaction3.mmReconciliationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#mmAccountData
 * ATMTransaction3.mmAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmProtectedAccountData
 * ATMTransaction3.mmProtectedAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmTotalPresentedAmount
 * ATMTransaction3.mmTotalPresentedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmTotalAuthorisedAmount
 * ATMTransaction3.mmTotalAuthorisedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmTotalRequestedAmount
 * ATMTransaction3.mmTotalRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmDetailedRequestedAmount
 * ATMTransaction3.mmDetailedRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmCurrencyConversion
 * ATMTransaction3.mmCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmAdditionalCharge
 * ATMTransaction3.mmAdditionalCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmRequestedReceipt
 * ATMTransaction3.mmRequestedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmReceiptPrinted
 * ATMTransaction3.mmReceiptPrinted}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#mmCapturedCard
 * ATMTransaction3.mmCapturedCard}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#mmLimits
 * ATMTransaction3.mmLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmAuthorisationResult
 * ATMTransaction3.mmAuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmICCRelatedData
 * ATMTransaction3.mmICCRelatedData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#mmATMTotals
 * ATMTransaction3.mmATMTotals}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#mmCassette
 * ATMTransaction3.mmCassette}</li>
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
 * "ATMTransaction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Withdrawal transaction for which the completion is sent."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction5
 * ATMTransaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction11
 * ATMTransaction11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMTransaction2
 * ATMTransaction2}</li>
 * </ul>
 */
public class ATMTransaction3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmTransactionIdentification
	 * ATMTransaction5.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmTransactionIdentification
	 * ATMTransaction2.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmTransactionIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction2.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected ATMTransactionStatus1Code transactionStatus;
	/**
	 * Outcome of the financial transaction for the customer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmTransactionStatus
	 * ATMTransaction5.mmTransactionStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Outcome of the financial transaction for the customer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmTransactionStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMTransactionStatus1Code.mmObject();
		}
	};
	protected TrueFalseIndicator multiBundle;
	/**
	 * Multi bundle dispense.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAttribute mmMultiBundle = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "MultiBndl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiBundle";
			definition = "Multi bundle dispense.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<ImpliedCurrencyAndAmount> bundlePresentedAmount;
	/**
	 * Amount per bundle in the currency of the total presented amount, in the
	 * order of the presentation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAttribute mmBundlePresentedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmAmount;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "BndlPresntdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BundlePresentedAmount";
			definition = "Amount per bundle in the currency of the total presented amount, in the order of the presentation.";
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ATMTransactionStatus2Code presentedAmountStatus;
	/**
	 * Status of the amount presented to the customer in the last bundle.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAttribute mmPresentedAmountStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "PresntdAmtSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentedAmountStatus";
			definition = "Status of the amount presented to the customer in the last bundle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMTransactionStatus2Code.mmObject();
		}
	};
	protected List<FailureReason4Code> incident;
	/**
	 * Incident occurring during the processing of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason4Code
	 * FailureReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction5#mmIncident
	 * ATMTransaction5.mmIncident}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncident = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "Incdnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incident";
			definition = "Incident occurring during the processing of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmIncident);
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason4Code.mmObject();
		}
	};
	protected List<Max70Text> incidentDetail;
	/**
	 * Explanation of the incident.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAttribute mmIncidentDetail = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "IncdntDtl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncidentDetail";
			definition = "Explanation of the incident.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmReconciliationIdentification
	 * ATMTransaction5.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmReconciliationIdentification
	 * ATMTransaction2.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmReconciliationIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction2.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CardAccount5 accountData;
	/**
	 * Unprotected account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount5
	 * CardAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmAccountData
	 * ATMTransaction2.mmAccountData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountData = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmAccount;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "AcctData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			definition = "Unprotected account information.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction2.mmAccountData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount5.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmProtectedAccountData
	 * ATMTransaction2.mmProtectedAccountData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAccountData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountData";
			definition = "Encryption of account information.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction2.mmProtectedAccountData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected AmountAndCurrency1 totalPresentedAmount;
	/**
	 * Total amount presented to the customer.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAssociationEnd mmTotalPresentedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmAmount;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TtlPresntdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPresentedAmount";
			definition = "Total amount presented to the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrency1.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount totalAuthorisedAmount;
	/**
	 * Total authorised amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAttribute mmTotalAuthorisedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TtlAuthrsdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAuthorisedAmount";
			definition = "Total authorised amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount totalRequestedAmount;
	/**
	 * Total requested amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAttribute mmTotalRequestedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Total requested amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected DetailedAmount12 detailedRequestedAmount;
	/**
	 * Detail of the requested amounts for the withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount12
	 * DetailedAmount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAssociationEnd mmDetailedRequestedAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Detail of the requested amounts for the withdrawal transaction.";
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmCurrencyConversion
	 * ATMTransaction2.mmCurrencyConversion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyConversion = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmCurrencyExchange;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "CcyConvs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversion";
			definition = "Currency conversion accepted by the customer, either to convert the amount to dispense in the base currency of the ATM, or to convert the total requested amount in the currency of the customer (so called dynamic currency conversion).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction2.mmCurrencyConversion;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyConversion4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount13> additionalCharge;
	/**
	 * Additional charge (for instance tax or fee).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount13
	 * DetailedAmount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	public static final MMMessageAssociationEnd mmAdditionalCharge = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "AddtlChrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCharge";
			definition = "Additional charge (for instance tax or fee).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount13.mmObject();
		}
	};
	protected TrueFalseIndicator requestedReceipt;
	/**
	 * True if the customer has requested a receipt.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmRequestedReceipt
	 * ATMTransaction5.mmRequestedReceipt}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedReceipt = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "ReqdRct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedReceipt";
			definition = "True if the customer has requested a receipt.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmRequestedReceipt);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator receiptPrinted;
	/**
	 * True if a receipt has been printed and presented to the customer.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmReceiptPrinted
	 * ATMTransaction5.mmReceiptPrinted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceiptPrinted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "RctPrtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptPrinted";
			definition = "True if a receipt has been printed and presented to the customer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmReceiptPrinted);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator capturedCard;
	/**
	 * True when the card was captured by the ATM.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CaptrdCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapturedCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True when the card was captured by the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmCapturedCard
	 * ATMTransaction5.mmCapturedCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapturedCard = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "CaptrdCard";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapturedCard";
			definition = "True when the card was captured by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmCapturedCard);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected ATMTransactionAmounts2 limits;
	/**
	 * Limit of amounts for the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
	 * ATMTransactionAmounts2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
	 * PaymentCard.mmLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmLimits
	 * ATMTransaction2.mmLimits}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimits = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmLimit;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Limit of amounts for the customer.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction2.mmLimits;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts2.mmObject();
		}
	};
	protected AuthorisationResult9 authorisationResult;
	/**
	 * Outcome of the withdrawal authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult9
	 * AuthorisationResult9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmAuthorisationResult
	 * ATMTransaction5.mmAuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmAuthorisationResult
	 * ATMTransaction2.mmAuthorisationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the withdrawal authorisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmAuthorisationResult);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction2.mmAuthorisationResult;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthorisationResult9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmICCRelatedData
	 * ATMTransaction5.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmICCRelatedData
	 * ATMTransaction2.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.mmICCRelatedData);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction2.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMTotals1> aTMTotals;
	/**
	 * Current totals of the ATM.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11#mmATMTotals
	 * ATMTransaction11.mmATMTotals}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmATMTotals = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.mmATMTotal;
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "ATMTtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTotals";
			definition = "Current totals of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction11.mmATMTotals);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTotals1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCassette1> cassette;
	/**
	 * Information on the cassettes of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassette1
	 * ATMCassette1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11#mmCassette
	 * ATMTransaction11.mmCassette}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCassette = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction3.mmObject();
			isDerived = false;
			xmlTag = "Csstt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cassette";
			definition = "Information on the cassettes of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction11.mmCassette);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCassette1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction3.mmTransactionIdentification, com.tools20022.repository.msg.ATMTransaction3.mmTransactionStatus,
						com.tools20022.repository.msg.ATMTransaction3.mmMultiBundle, com.tools20022.repository.msg.ATMTransaction3.mmBundlePresentedAmount, com.tools20022.repository.msg.ATMTransaction3.mmPresentedAmountStatus,
						com.tools20022.repository.msg.ATMTransaction3.mmIncident, com.tools20022.repository.msg.ATMTransaction3.mmIncidentDetail, com.tools20022.repository.msg.ATMTransaction3.mmReconciliationIdentification,
						com.tools20022.repository.msg.ATMTransaction3.mmAccountData, com.tools20022.repository.msg.ATMTransaction3.mmProtectedAccountData, com.tools20022.repository.msg.ATMTransaction3.mmTotalPresentedAmount,
						com.tools20022.repository.msg.ATMTransaction3.mmTotalAuthorisedAmount, com.tools20022.repository.msg.ATMTransaction3.mmTotalRequestedAmount, com.tools20022.repository.msg.ATMTransaction3.mmDetailedRequestedAmount,
						com.tools20022.repository.msg.ATMTransaction3.mmCurrencyConversion, com.tools20022.repository.msg.ATMTransaction3.mmAdditionalCharge, com.tools20022.repository.msg.ATMTransaction3.mmRequestedReceipt,
						com.tools20022.repository.msg.ATMTransaction3.mmReceiptPrinted, com.tools20022.repository.msg.ATMTransaction3.mmCapturedCard, com.tools20022.repository.msg.ATMTransaction3.mmLimits,
						com.tools20022.repository.msg.ATMTransaction3.mmAuthorisationResult, com.tools20022.repository.msg.ATMTransaction3.mmICCRelatedData, com.tools20022.repository.msg.ATMTransaction3.mmATMTotals,
						com.tools20022.repository.msg.ATMTransaction3.mmCassette);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction3";
				definition = "Withdrawal transaction for which the completion is sent.";
				nextVersions_lazy = () -> Arrays.asList(ATMTransaction5.mmObject(), ATMTransaction11.mmObject());
				previousVersion_lazy = () -> ATMTransaction2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public ATMTransactionStatus1Code getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(ATMTransactionStatus1Code transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public TrueFalseIndicator getMultiBundle() {
		return multiBundle;
	}

	public void setMultiBundle(TrueFalseIndicator multiBundle) {
		this.multiBundle = multiBundle;
	}

	public List<ImpliedCurrencyAndAmount> getBundlePresentedAmount() {
		return bundlePresentedAmount;
	}

	public void setBundlePresentedAmount(List<ImpliedCurrencyAndAmount> bundlePresentedAmount) {
		this.bundlePresentedAmount = bundlePresentedAmount;
	}

	public ATMTransactionStatus2Code getPresentedAmountStatus() {
		return presentedAmountStatus;
	}

	public void setPresentedAmountStatus(ATMTransactionStatus2Code presentedAmountStatus) {
		this.presentedAmountStatus = presentedAmountStatus;
	}

	public List<FailureReason4Code> getIncident() {
		return incident;
	}

	public void setIncident(List<FailureReason4Code> incident) {
		this.incident = incident;
	}

	public List<Max70Text> getIncidentDetail() {
		return incidentDetail;
	}

	public void setIncidentDetail(List<Max70Text> incidentDetail) {
		this.incidentDetail = incidentDetail;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	public CardAccount5 getAccountData() {
		return accountData;
	}

	public void setAccountData(com.tools20022.repository.msg.CardAccount5 accountData) {
		this.accountData = accountData;
	}

	public ContentInformationType10 getProtectedAccountData() {
		return protectedAccountData;
	}

	public void setProtectedAccountData(com.tools20022.repository.msg.ContentInformationType10 protectedAccountData) {
		this.protectedAccountData = protectedAccountData;
	}

	public AmountAndCurrency1 getTotalPresentedAmount() {
		return totalPresentedAmount;
	}

	public void setTotalPresentedAmount(com.tools20022.repository.msg.AmountAndCurrency1 totalPresentedAmount) {
		this.totalPresentedAmount = totalPresentedAmount;
	}

	public ImpliedCurrencyAndAmount getTotalAuthorisedAmount() {
		return totalAuthorisedAmount;
	}

	public void setTotalAuthorisedAmount(ImpliedCurrencyAndAmount totalAuthorisedAmount) {
		this.totalAuthorisedAmount = totalAuthorisedAmount;
	}

	public ImpliedCurrencyAndAmount getTotalRequestedAmount() {
		return totalRequestedAmount;
	}

	public void setTotalRequestedAmount(ImpliedCurrencyAndAmount totalRequestedAmount) {
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

	public List<DetailedAmount13> getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(List<com.tools20022.repository.msg.DetailedAmount13> additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	public TrueFalseIndicator getRequestedReceipt() {
		return requestedReceipt;
	}

	public void setRequestedReceipt(TrueFalseIndicator requestedReceipt) {
		this.requestedReceipt = requestedReceipt;
	}

	public TrueFalseIndicator getReceiptPrinted() {
		return receiptPrinted;
	}

	public void setReceiptPrinted(TrueFalseIndicator receiptPrinted) {
		this.receiptPrinted = receiptPrinted;
	}

	public TrueFalseIndicator getCapturedCard() {
		return capturedCard;
	}

	public void setCapturedCard(TrueFalseIndicator capturedCard) {
		this.capturedCard = capturedCard;
	}

	public ATMTransactionAmounts2 getLimits() {
		return limits;
	}

	public void setLimits(com.tools20022.repository.msg.ATMTransactionAmounts2 limits) {
		this.limits = limits;
	}

	public AuthorisationResult9 getAuthorisationResult() {
		return authorisationResult;
	}

	public void setAuthorisationResult(com.tools20022.repository.msg.AuthorisationResult9 authorisationResult) {
		this.authorisationResult = authorisationResult;
	}

	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}

	public List<ATMTotals1> getATMTotals() {
		return aTMTotals;
	}

	public void setATMTotals(List<com.tools20022.repository.msg.ATMTotals1> aTMTotals) {
		this.aTMTotals = aTMTotals;
	}

	public List<ATMCassette1> getCassette() {
		return cassette;
	}

	public void setCassette(List<com.tools20022.repository.msg.ATMCassette1> cassette) {
		this.cassette = cassette;
	}
}