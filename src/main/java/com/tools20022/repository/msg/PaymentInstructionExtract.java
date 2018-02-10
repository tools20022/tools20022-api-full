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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of a payment instruction. The information contained in this component
 * is sufficient to retrieve a payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmAssignerInstructionIdentification
 * PaymentInstructionExtract.mmAssignerInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmAssigneeInstructionIdentification
 * PaymentInstructionExtract.mmAssigneeInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmCurrencyAmount
 * PaymentInstructionExtract.mmCurrencyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmValueDate
 * PaymentInstructionExtract.mmValueDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPayment#mmUnderlying
 * RequestToModifyPayment.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToCancelPayment#mmUnderlying
 * RequestToCancelPayment.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApply#mmUnderlying
 * UnableToApply.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceipt#mmUnderlying
 * ClaimNonReceipt.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformation#mmUnderlying
 * AdditionalPaymentInformation.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigation#mmCorrectionTransaction
 * ResolutionOfInvestigation.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequest#mmUnderlying
 * DebitAuthorisationRequest.mmUnderlying}</li>
 * </ul>
 * </li>
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
 * "PaymentInstructionExtract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of a payment instruction. The information contained in this component is sufficient to retrieve a payment instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstructionExtract", propOrder = {"assignerInstructionIdentification", "assigneeInstructionIdentification", "currencyAmount", "valueDate"})
public class PaymentInstructionExtract {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AssgnrInstrId")
	protected Max35Text assignerInstructionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract
	 * PaymentInstructionExtract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssgnrInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssignerInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment instruction (eg, field 20 of an MT 103) when meaningful to the case assigner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssignerInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract.mmObject();
			isDerived = false;
			xmlTag = "AssgnrInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssignerInstructionIdentification";
			definition = "Identification of the payment instruction (eg, field 20 of an MT 103) when meaningful to the case assigner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "AssgneInstrId")
	protected Max35Text assigneeInstructionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract
	 * PaymentInstructionExtract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssgneInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssigneeInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment instruction (eg, field 20 of an MT 103) when meaningful to the case assignee."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssigneeInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract.mmObject();
			isDerived = false;
			xmlTag = "AssgneInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssigneeInstructionIdentification";
			definition = "Identification of the payment instruction (eg, field 20 of an MT 103) when meaningful to the case assignee.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CcyAmt")
	protected CurrencyAndAmount currencyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract
	 * PaymentInstructionExtract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the payment. Depending on the context it can be either the amount settled (UnableToApply) or the instructed amount (RequestToCancel, RequestToModify, ClaimNonReceipt)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract.mmObject();
			isDerived = false;
			xmlTag = "CcyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAmount";
			definition = "Amount of the payment. Depending on the context it can be either the amount settled (UnableToApply) or the instructed amount (RequestToCancel, RequestToModify, ClaimNonReceipt).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ValDt")
	protected ISODateTime valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract
	 * PaymentInstructionExtract}</li>
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
	 * definition} = "Value date of the payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Value date of the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionExtract.mmAssignerInstructionIdentification,
						com.tools20022.repository.msg.PaymentInstructionExtract.mmAssigneeInstructionIdentification, com.tools20022.repository.msg.PaymentInstructionExtract.mmCurrencyAmount,
						com.tools20022.repository.msg.PaymentInstructionExtract.mmValueDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(RequestToModifyPayment.mmUnderlying, RequestToCancelPayment.mmUnderlying, UnableToApply.mmUnderlying, ClaimNonReceipt.mmUnderlying, AdditionalPaymentInformation.mmUnderlying,
						ResolutionOfInvestigation.mmCorrectionTransaction, DebitAuthorisationRequest.mmUnderlying);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstructionExtract";
				definition = "Details of a payment instruction. The information contained in this component is sufficient to retrieve a payment instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getAssignerInstructionIdentification() {
		return assignerInstructionIdentification == null ? Optional.empty() : Optional.of(assignerInstructionIdentification);
	}

	public PaymentInstructionExtract setAssignerInstructionIdentification(Max35Text assignerInstructionIdentification) {
		this.assignerInstructionIdentification = assignerInstructionIdentification;
		return this;
	}

	public Optional<Max35Text> getAssigneeInstructionIdentification() {
		return assigneeInstructionIdentification == null ? Optional.empty() : Optional.of(assigneeInstructionIdentification);
	}

	public PaymentInstructionExtract setAssigneeInstructionIdentification(Max35Text assigneeInstructionIdentification) {
		this.assigneeInstructionIdentification = assigneeInstructionIdentification;
		return this;
	}

	public Optional<CurrencyAndAmount> getCurrencyAmount() {
		return currencyAmount == null ? Optional.empty() : Optional.of(currencyAmount);
	}

	public PaymentInstructionExtract setCurrencyAmount(CurrencyAndAmount currencyAmount) {
		this.currencyAmount = currencyAmount;
		return this;
	}

	public Optional<ISODateTime> getValueDate() {
		return valueDate == null ? Optional.empty() : Optional.of(valueDate);
	}

	public PaymentInstructionExtract setValueDate(ISODateTime valueDate) {
		this.valueDate = valueDate;
		return this;
	}
}