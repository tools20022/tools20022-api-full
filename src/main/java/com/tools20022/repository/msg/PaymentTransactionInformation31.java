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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide reference and status information on the
 * original transactions, included in the original instruction, to which the
 * cancellation request message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmCancellationIdentification
 * PaymentTransactionInformation31.mmCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmCase
 * PaymentTransactionInformation31.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalGroupInformation
 * PaymentTransactionInformation31.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInstructionIdentification
 * PaymentTransactionInformation31.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalEndToEndIdentification
 * PaymentTransactionInformation31.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalTransactionIdentification
 * PaymentTransactionInformation31.mmOriginalTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalClearingSystemReference
 * PaymentTransactionInformation31.mmOriginalClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInterbankSettlementAmount
 * PaymentTransactionInformation31.mmOriginalInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInterbankSettlementDate
 * PaymentTransactionInformation31.mmOriginalInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmAssigner
 * PaymentTransactionInformation31.mmAssigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmAssignee
 * PaymentTransactionInformation31.mmAssignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmCancellationReasonInformation
 * PaymentTransactionInformation31.mmCancellationReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalTransactionReference
 * PaymentTransactionInformation31.mmOriginalTransactionReference}</li>
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
 * "PaymentTransactionInformation31"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide reference and status information on the original transactions, included in the original instruction, to which the cancellation request message applies."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentTransactionInformation31", propOrder = {"cancellationIdentification", "case", "originalGroupInformation", "originalInstructionIdentification", "originalEndToEndIdentification", "originalTransactionIdentification",
		"originalClearingSystemReference", "originalInterbankSettlementAmount", "originalInterbankSettlementDate", "assigner", "assignee", "cancellationReasonInformation", "originalTransactionReference"})
public class PaymentTransactionInformation31 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text cancellationIdentification;
	/**
	 * Unique and unambiguous identifier of a cancellation request, as assigned
	 * by the assigner.
	 * 
	 * Usage: The cancellation request identification can be used for
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a cancellation request, as assigned by the assigner.\n\nUsage: The cancellation request identification can be used for reconciliation or to link tasks relating to the cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "CxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationIdentification";
			definition = "Unique and unambiguous identifier of a cancellation request, as assigned by the assigner.\n\nUsage: The cancellation request identification can be used for reconciliation or to link tasks relating to the cancellation request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Case2 case_;
	/**
	 * Set of elements to uniquely and unambiguously identify an exception or an
	 * investigation workflow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
	 * Payment.mmRelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements to uniquely and unambiguously identify an exception or an investigation workflow."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCase = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmRelatedInvestigationCase;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Set of elements to uniquely and unambiguously identify an exception or an investigation workflow.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Case2.mmObject();
		}
	};
	protected OriginalGroupInformation3 originalGroupInformation;
	/**
	 * Set of elements used to provide information on the original messsage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
	 * OriginalGroupInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original messsage."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalGroupInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Set of elements used to provide information on the original messsage.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation3.mmObject();
		}
	};
	protected Max35Text originalInstructionIdentification;
	/**
	 * Unique identification, as assigned by the original instructing party for
	 * the original instructed party, to unambiguously identify the original
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
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
	 * "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.";
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalTransactionIdentification;
	/**
	 * Unique identification, as assigned by the original first instructing
	 * agent, to umambiguously identify the transaction.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
	 * PaymentIdentification.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original first instructing agent, to umambiguously identify the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionIdentification";
			definition = "Unique identification, as assigned by the original first instructing agent, to umambiguously identify the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalClearingSystemReference;
	/**
	 * Unique reference, as assigned by the original clearing system, to
	 * unambiguously identify the original instruction.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmClearingSystemReference
	 * PaymentIdentification.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlClrSysRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference, as assigned by the original clearing system, to unambiguously identify the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalClearingSystemReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmClearingSystemReference;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "OrgnlClrSysRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalClearingSystemReference";
			definition = "Unique reference, as assigned by the original clearing system, to unambiguously identify the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount originalInterbankSettlementAmount;
	/**
	 * Amount of money, as provided in the original transaction, to be moved
	 * between the instructing agent and the instructed agent.
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money, as provided in the original transaction, to be moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementAmount";
			definition = "Amount of money, as provided in the original transaction, to be moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate originalInterbankSettlementDate;
	/**
	 * Date, as provided in the original transaction, on which the amount of
	 * money ceases to be available to the agent that owes it and when the
	 * amount of money becomes available to the agent to which it is due.
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmCreditDateTime
	 * CashSettlement.mmCreditDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date, as provided in the original transaction, on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInterbankSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmCreditDateTime;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementDate";
			definition = "Date, as provided in the original transaction, on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification4 assigner;
	/**
	 * Party who assigns the case. Usage: This is also the agent that instructs
	 * the next party in the chain to carry out the (set of) cancellation
	 * request(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who assigns the case.\nUsage: This is also the agent that instructs the next party in the chain to carry out the (set of) cancellation request(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssigner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party who assigns the case.\nUsage: This is also the agent that instructs the next party in the chain to carry out the (set of) cancellation request(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification4 assignee;
	/**
	 * Party to which the case is assigned. Usage: This is also the agent that
	 * is instructed by the previous party in the chain to carry out the (set
	 * of) cancellation request(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the case is assigned.\nUsage: This is also the agent that is instructed by the previous party in the chain to carry out the (set of) cancellation request(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssignee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party to which the case is assigned.\nUsage: This is also the agent that is instructed by the previous party in the chain to carry out the (set of) cancellation request(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CancellationReasonInformation3> cancellationReasonInformation;
	/**
	 * Set of elements used to provide detailed information on the cancellation
	 * reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation3
	 * CancellationReasonInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCancellationReason
	 * PaymentStatus.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide detailed information on the cancellation reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmCancellationReason;
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "CxlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReasonInformation";
			definition = "Set of elements used to provide detailed information on the cancellation reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CancellationReasonInformation3.mmObject();
		}
	};
	protected OriginalTransactionReference13 originalTransactionReference;
	/**
	 * Set of key elements used to identify the original transaction that is
	 * being referred to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13
	 * OriginalTransactionReference13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
	 * PaymentTransactionInformation31}</li>
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
	 * "Set of key elements used to identify the original transaction that is being referred to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalTransactionReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentTransactionInformation31.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Set of key elements used to identify the original transaction that is being referred to.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalTransactionReference13.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(PaymentTransactionInformation31.mmCancellationIdentification, PaymentTransactionInformation31.mmCase, PaymentTransactionInformation31.mmOriginalGroupInformation,
								PaymentTransactionInformation31.mmOriginalInstructionIdentification, PaymentTransactionInformation31.mmOriginalEndToEndIdentification, PaymentTransactionInformation31.mmOriginalTransactionIdentification,
								PaymentTransactionInformation31.mmOriginalClearingSystemReference, PaymentTransactionInformation31.mmOriginalInterbankSettlementAmount, PaymentTransactionInformation31.mmOriginalInterbankSettlementDate,
								PaymentTransactionInformation31.mmAssigner, PaymentTransactionInformation31.mmAssignee, PaymentTransactionInformation31.mmCancellationReasonInformation,
								PaymentTransactionInformation31.mmOriginalTransactionReference);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTransactionInformation31";
				definition = "Set of elements used to provide reference and status information on the original transactions, included in the original instruction, to which the cancellation request message applies.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CxlId")
	public Max35Text getCancellationIdentification() {
		return cancellationIdentification;
	}

	public void setCancellationIdentification(Max35Text cancellationIdentification) {
		this.cancellationIdentification = cancellationIdentification;
	}

	@XmlElement(name = "Case")
	public Case2 getCase() {
		return case_;
	}

	public void setCase(com.tools20022.repository.msg.Case2 case_) {
		this.case_ = case_;
	}

	@XmlElement(name = "OrgnlGrpInf")
	public OriginalGroupInformation3 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public void setOriginalGroupInformation(com.tools20022.repository.msg.OriginalGroupInformation3 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
	}

	@XmlElement(name = "OrgnlInstrId")
	public Max35Text getOriginalInstructionIdentification() {
		return originalInstructionIdentification;
	}

	public void setOriginalInstructionIdentification(Max35Text originalInstructionIdentification) {
		this.originalInstructionIdentification = originalInstructionIdentification;
	}

	@XmlElement(name = "OrgnlEndToEndId")
	public Max35Text getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification;
	}

	public void setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
	}

	@XmlElement(name = "OrgnlTxId")
	public Max35Text getOriginalTransactionIdentification() {
		return originalTransactionIdentification;
	}

	public void setOriginalTransactionIdentification(Max35Text originalTransactionIdentification) {
		this.originalTransactionIdentification = originalTransactionIdentification;
	}

	@XmlElement(name = "OrgnlClrSysRef")
	public Max35Text getOriginalClearingSystemReference() {
		return originalClearingSystemReference;
	}

	public void setOriginalClearingSystemReference(Max35Text originalClearingSystemReference) {
		this.originalClearingSystemReference = originalClearingSystemReference;
	}

	@XmlElement(name = "OrgnlIntrBkSttlmAmt")
	public ActiveOrHistoricCurrencyAndAmount getOriginalInterbankSettlementAmount() {
		return originalInterbankSettlementAmount;
	}

	public void setOriginalInterbankSettlementAmount(ActiveOrHistoricCurrencyAndAmount originalInterbankSettlementAmount) {
		this.originalInterbankSettlementAmount = originalInterbankSettlementAmount;
	}

	@XmlElement(name = "OrgnlIntrBkSttlmDt")
	public ISODate getOriginalInterbankSettlementDate() {
		return originalInterbankSettlementDate;
	}

	public void setOriginalInterbankSettlementDate(ISODate originalInterbankSettlementDate) {
		this.originalInterbankSettlementDate = originalInterbankSettlementDate;
	}

	@XmlElement(name = "Assgnr")
	public BranchAndFinancialInstitutionIdentification4 getAssigner() {
		return assigner;
	}

	public void setAssigner(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 assigner) {
		this.assigner = assigner;
	}

	@XmlElement(name = "Assgne")
	public BranchAndFinancialInstitutionIdentification4 getAssignee() {
		return assignee;
	}

	public void setAssignee(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 assignee) {
		this.assignee = assignee;
	}

	@XmlElement(name = "CxlRsnInf")
	public List<CancellationReasonInformation3> getCancellationReasonInformation() {
		return cancellationReasonInformation;
	}

	public void setCancellationReasonInformation(List<com.tools20022.repository.msg.CancellationReasonInformation3> cancellationReasonInformation) {
		this.cancellationReasonInformation = cancellationReasonInformation;
	}

	@XmlElement(name = "OrgnlTxRef")
	public OriginalTransactionReference13 getOriginalTransactionReference() {
		return originalTransactionReference;
	}

	public void setOriginalTransactionReference(com.tools20022.repository.msg.OriginalTransactionReference13 originalTransactionReference) {
		this.originalTransactionReference = originalTransactionReference;
	}
}