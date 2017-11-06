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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.CancellationIndividualStatus1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides reference and status information on the original transactions,
 * included in the original instruction, to which the cancellation request
 * message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmCancellationStatusIdentification
 * PaymentTransaction78.mmCancellationStatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmResolvedCase
 * PaymentTransaction78.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalInstructionIdentification
 * PaymentTransaction78.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalEndToEndIdentification
 * PaymentTransaction78.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmTransactionCancellationStatus
 * PaymentTransaction78.mmTransactionCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmCancellationStatusReasonInformation
 * PaymentTransaction78.mmCancellationStatusReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalInstructedAmount
 * PaymentTransaction78.mmOriginalInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalRequestedExecutionDate
 * PaymentTransaction78.mmOriginalRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalRequestedCollectionDate
 * PaymentTransaction78.mmOriginalRequestedCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalTransactionReference
 * PaymentTransaction78.mmOriginalTransactionReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentTransaction78"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides reference and status information on the original transactions, included in the original instruction, to which the cancellation request message applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66
 * PaymentTransaction66}</li>
 * </ul>
 */
public class PaymentTransaction78 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text cancellationStatusIdentification;
	/**
	 * Unique and unambiguous identifier of a cancellation request status, as
	 * assigned by the assigner.
	 * 
	 * Usage: The cancellation status identification can be used for
	 * reconciliation or to link tasks relating to the cancellation request.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a cancellation request status, as assigned by the assigner.\n\nUsage: The cancellation status identification can be used for reconciliation or to link tasks relating to the cancellation request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmCancellationStatusIdentification
	 * PaymentTransaction66.mmCancellationStatusIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationStatusIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "CxlStsId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusIdentification";
			definition = "Unique and unambiguous identifier of a cancellation request status, as assigned by the assigner.\n\nUsage: The cancellation status identification can be used for reconciliation or to link tasks relating to the cancellation request.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmCancellationStatusIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Case3 resolvedCase;
	/**
	 * Identifies the resolved case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
	 * Payment.mmRelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RslvdCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolvedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the resolved case."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmResolvedCase
	 * PaymentTransaction66.mmResolvedCase}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResolvedCase = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmRelatedInvestigationCase;
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "RslvdCase";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolvedCase";
			definition = "Identifies the resolved case.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmResolvedCase;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Case3.mmObject();
		}
	};
	protected Max35Text originalInstructionIdentification;
	/**
	 * Unique identification, as assigned by the original instructing party for
	 * the original instructed party to unambiguously identify the original
	 * instruction.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
	 * PaymentIdentification.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original instructing party for the original instructed party to unambiguously identify the original instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalInstructionIdentification
	 * PaymentTransaction66.mmOriginalInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Unique identification, as assigned by the original instructing party for the original instructed party to unambiguously identify the original instruction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmOriginalInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalEndToEndIdentification;
	/**
	 * Unique identification, as assigned by the original initiating party, to
	 * unambiguously identify the original transaction.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlEndToEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalEndToEndIdentification
	 * PaymentTransaction66.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmOriginalEndToEndIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CancellationIndividualStatus1Code transactionCancellationStatus;
	/**
	 * Specifies the status of the transaction cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationIndividualStatus1Code
	 * CancellationIndividualStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the transaction cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmTransactionCancellationStatus
	 * PaymentTransaction66.mmTransactionCancellationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionCancellationStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentStatus;
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "TxCxlSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCancellationStatus";
			definition = "Specifies the status of the transaction cancellation request.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmTransactionCancellationStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CancellationIndividualStatus1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CancellationStatusReason2> cancellationStatusReasonInformation;
	/**
	 * Provides detailed information on the cancellation status reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2
	 * CancellationStatusReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmStatus
	 * InvestigationCase.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information on the cancellation status reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmCancellationStatusReasonInformation
	 * PaymentTransaction66.mmCancellationStatusReasonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationStatusReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmStatus;
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "CxlStsRsnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformation";
			definition = "Provides detailed information on the cancellation status reason.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmCancellationStatusReasonInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CancellationStatusReason2.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount originalInstructedAmount;
	/**
	 * Amount of money, as provided in the original transaction, to be moved
	 * between the debtor and the creditor, before deduction of charges,
	 * expressed in the currency, as ordered by the original initiating party.<br>
	 * Usage: This amount has to be transported unchanged through the
	 * transaction chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money, as provided in the original transaction, to be moved between the debtor and the creditor, before deduction of charges, expressed in the currency, as ordered by the original initiating party.\r\nUsage: This amount has to be transported unchanged through the transaction chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalInstructedAmount
	 * PaymentTransaction66.mmOriginalInstructedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmInstructedAmount;
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructedAmount";
			definition = "Amount of money, as provided in the original transaction, to be moved between the debtor and the creditor, before deduction of charges, expressed in the currency, as ordered by the original initiating party.\r\nUsage: This amount has to be transported unchanged through the transaction chain.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmOriginalInstructedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected DateAndDateTimeChoice originalRequestedExecutionDate;
	/**
	 * Date at which the initiating party originally requested the clearing
	 * agent to process the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlReqdExctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party originally requested the clearing agent to process the payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalRequestedExecutionDate
	 * PaymentTransaction66.mmOriginalRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalRequestedExecutionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "OrgnlReqdExctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRequestedExecutionDate";
			definition = "Date at which the initiating party originally requested the clearing agent to process the payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmOriginalRequestedExecutionDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ISODate originalRequestedCollectionDate;
	/**
	 * Date at which the creditor originally requested the collection of the
	 * amount of money from the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlReqdColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRequestedCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the creditor originally requested the collection of the amount of money from the debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalRequestedCollectionDate
	 * PaymentTransaction66.mmOriginalRequestedCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalRequestedCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "OrgnlReqdColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRequestedCollectionDate";
			definition = "Date at which the creditor originally requested the collection of the amount of money from the debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmOriginalRequestedCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected OriginalTransactionReference24 originalTransactionReference;
	/**
	 * Key elements used to identify the original transaction that is being
	 * referred to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24
	 * OriginalTransactionReference24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key elements used to identify the original transaction that is being referred to."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalTransactionReference
	 * PaymentTransaction66.mmOriginalTransactionReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalTransactionReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentTransaction78.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Key elements used to identify the original transaction that is being referred to.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTransaction66.mmOriginalTransactionReference;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalTransactionReference24.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction78.mmCancellationStatusIdentification, com.tools20022.repository.msg.PaymentTransaction78.mmResolvedCase,
						com.tools20022.repository.msg.PaymentTransaction78.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction78.mmOriginalEndToEndIdentification,
						com.tools20022.repository.msg.PaymentTransaction78.mmTransactionCancellationStatus, com.tools20022.repository.msg.PaymentTransaction78.mmCancellationStatusReasonInformation,
						com.tools20022.repository.msg.PaymentTransaction78.mmOriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction78.mmOriginalRequestedExecutionDate,
						com.tools20022.repository.msg.PaymentTransaction78.mmOriginalRequestedCollectionDate, com.tools20022.repository.msg.PaymentTransaction78.mmOriginalTransactionReference);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTransaction78";
				definition = "Provides reference and status information on the original transactions, included in the original instruction, to which the cancellation request message applies.";
				previousVersion_lazy = () -> PaymentTransaction66.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCancellationStatusIdentification() {
		return cancellationStatusIdentification;
	}

	public void setCancellationStatusIdentification(Max35Text cancellationStatusIdentification) {
		this.cancellationStatusIdentification = cancellationStatusIdentification;
	}

	public Case3 getResolvedCase() {
		return resolvedCase;
	}

	public void setResolvedCase(com.tools20022.repository.msg.Case3 resolvedCase) {
		this.resolvedCase = resolvedCase;
	}

	public Max35Text getOriginalInstructionIdentification() {
		return originalInstructionIdentification;
	}

	public void setOriginalInstructionIdentification(Max35Text originalInstructionIdentification) {
		this.originalInstructionIdentification = originalInstructionIdentification;
	}

	public Max35Text getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification;
	}

	public void setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
	}

	public CancellationIndividualStatus1Code getTransactionCancellationStatus() {
		return transactionCancellationStatus;
	}

	public void setTransactionCancellationStatus(CancellationIndividualStatus1Code transactionCancellationStatus) {
		this.transactionCancellationStatus = transactionCancellationStatus;
	}

	public List<CancellationStatusReason2> getCancellationStatusReasonInformation() {
		return cancellationStatusReasonInformation;
	}

	public void setCancellationStatusReasonInformation(List<com.tools20022.repository.msg.CancellationStatusReason2> cancellationStatusReasonInformation) {
		this.cancellationStatusReasonInformation = cancellationStatusReasonInformation;
	}

	public ActiveOrHistoricCurrencyAndAmount getOriginalInstructedAmount() {
		return originalInstructedAmount;
	}

	public void setOriginalInstructedAmount(ActiveOrHistoricCurrencyAndAmount originalInstructedAmount) {
		this.originalInstructedAmount = originalInstructedAmount;
	}

	public DateAndDateTimeChoice getOriginalRequestedExecutionDate() {
		return originalRequestedExecutionDate;
	}

	public void setOriginalRequestedExecutionDate(DateAndDateTimeChoice originalRequestedExecutionDate) {
		this.originalRequestedExecutionDate = originalRequestedExecutionDate;
	}

	public ISODate getOriginalRequestedCollectionDate() {
		return originalRequestedCollectionDate;
	}

	public void setOriginalRequestedCollectionDate(ISODate originalRequestedCollectionDate) {
		this.originalRequestedCollectionDate = originalRequestedCollectionDate;
	}

	public OriginalTransactionReference24 getOriginalTransactionReference() {
		return originalTransactionReference;
	}

	public void setOriginalTransactionReference(com.tools20022.repository.msg.OriginalTransactionReference24 originalTransactionReference) {
		this.originalTransactionReference = originalTransactionReference;
	}
}