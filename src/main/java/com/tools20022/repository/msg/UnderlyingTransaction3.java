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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV03;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalGroupInformation24;
import com.tools20022.repository.msg.OriginalPaymentInformation3;
import com.tools20022.repository.msg.PaymentTransactionInformation33;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify the underlying (group of) transaction(s) to
 * which the resolution of investigation applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction3.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction3.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#mmTransactionInformationAndStatus
 * UnderlyingTransaction3.mmTransactionInformationAndStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmCancellationDetails
 * ResolutionOfInvestigationV03.mmCancellationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction3
 * ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction3
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrInitiationTransactionResolvedCaseRule#forUnderlyingTransaction3
 * ConstraintGroupOrInitiationTransactionResolvedCaseRule.
 * forUnderlyingTransaction3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrInterbankTransactionResolvedCaseRule#forUnderlyingTransaction3
 * ConstraintGroupOrInterbankTransactionResolvedCaseRule.
 * forUnderlyingTransaction3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to identify the underlying (group of) transaction(s) to which the resolution of investigation applies."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction3", propOrder = {"originalGroupInformationAndStatus", "originalPaymentInformationAndStatus", "transactionInformationAndStatus"})
public class UnderlyingTransaction3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInfAndSts")
	protected OriginalGroupInformation24 originalGroupInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24
	 * OriginalGroupInformation24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3
	 * UnderlyingTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original cancellation message, to which the resolution refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction3, Optional<OriginalGroupInformation24>> mmOriginalGroupInformationAndStatus = new MMMessageAssociationEnd<UnderlyingTransaction3, Optional<OriginalGroupInformation24>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Set of elements used to provide information on the original cancellation message, to which the resolution refers.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupInformation24.mmObject();
		}

		@Override
		public Optional<OriginalGroupInformation24> getValue(UnderlyingTransaction3 obj) {
			return obj.getOriginalGroupInformationAndStatus();
		}

		@Override
		public void setValue(UnderlyingTransaction3 obj, Optional<OriginalGroupInformation24> value) {
			obj.setOriginalGroupInformationAndStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndSts")
	protected List<OriginalPaymentInformation3> originalPaymentInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3
	 * OriginalPaymentInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3
	 * UnderlyingTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original (group of) transactions, to which the cancellation status refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction3, List<OriginalPaymentInformation3>> mmOriginalPaymentInformationAndStatus = new MMMessageAssociationEnd<UnderlyingTransaction3, List<OriginalPaymentInformation3>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndStatus";
			definition = "Set of elements used to provide information on the original (group of) transactions, to which the cancellation status refers.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalPaymentInformation3.mmObject();
		}

		@Override
		public List<OriginalPaymentInformation3> getValue(UnderlyingTransaction3 obj) {
			return obj.getOriginalPaymentInformationAndStatus();
		}

		@Override
		public void setValue(UnderlyingTransaction3 obj, List<OriginalPaymentInformation3> value) {
			obj.setOriginalPaymentInformationAndStatus(value);
		}
	};
	@XmlElement(name = "TxInfAndSts")
	protected List<PaymentTransactionInformation33> transactionInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33
	 * PaymentTransactionInformation33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3
	 * UnderlyingTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original transactions to which the cancellation request message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction3, List<PaymentTransactionInformation33>> mmTransactionInformationAndStatus = new MMMessageAssociationEnd<UnderlyingTransaction3, List<PaymentTransactionInformation33>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Set of elements used to provide information on the original transactions to which the cancellation request message refers.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransactionInformation33.mmObject();
		}

		@Override
		public List<PaymentTransactionInformation33> getValue(UnderlyingTransaction3 obj) {
			return obj.getTransactionInformationAndStatus();
		}

		@Override
		public void setValue(UnderlyingTransaction3 obj, List<PaymentTransactionInformation33> value) {
			obj.setTransactionInformationAndStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTransaction3.mmOriginalGroupInformationAndStatus, com.tools20022.repository.msg.UnderlyingTransaction3.mmOriginalPaymentInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction3.mmTransactionInformationAndStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(ResolutionOfInvestigationV03.mmCancellationDetails);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction3,
						com.tools20022.repository.constraints.ConstraintGroupOrInitiationTransactionResolvedCaseRule.forUnderlyingTransaction3,
						com.tools20022.repository.constraints.ConstraintGroupOrInterbankTransactionResolvedCaseRule.forUnderlyingTransaction3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction3";
				definition = "Set of elements used to identify the underlying (group of) transaction(s) to which the resolution of investigation applies.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupInformation24> getOriginalGroupInformationAndStatus() {
		return originalGroupInformationAndStatus == null ? Optional.empty() : Optional.of(originalGroupInformationAndStatus);
	}

	public UnderlyingTransaction3 setOriginalGroupInformationAndStatus(OriginalGroupInformation24 originalGroupInformationAndStatus) {
		this.originalGroupInformationAndStatus = originalGroupInformationAndStatus;
		return this;
	}

	public List<OriginalPaymentInformation3> getOriginalPaymentInformationAndStatus() {
		return originalPaymentInformationAndStatus == null ? originalPaymentInformationAndStatus = new ArrayList<>() : originalPaymentInformationAndStatus;
	}

	public UnderlyingTransaction3 setOriginalPaymentInformationAndStatus(List<OriginalPaymentInformation3> originalPaymentInformationAndStatus) {
		this.originalPaymentInformationAndStatus = Objects.requireNonNull(originalPaymentInformationAndStatus);
		return this;
	}

	public List<PaymentTransactionInformation33> getTransactionInformationAndStatus() {
		return transactionInformationAndStatus == null ? transactionInformationAndStatus = new ArrayList<>() : transactionInformationAndStatus;
	}

	public UnderlyingTransaction3 setTransactionInformationAndStatus(List<PaymentTransactionInformation33> transactionInformationAndStatus) {
		this.transactionInformationAndStatus = Objects.requireNonNull(transactionInformationAndStatus);
		return this;
	}
}