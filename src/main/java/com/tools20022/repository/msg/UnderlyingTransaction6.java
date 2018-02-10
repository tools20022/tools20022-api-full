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
import com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying (group of) transaction(s) to which the
 * investigation applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction6.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction6.mmOriginalPaymentInformationAndCancellation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02#mmUnderlying
 * CustomerPaymentCancellationRequestV02.mmUnderlying}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule#forUnderlyingTransaction6
 * ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule#forUnderlyingTransaction6
 * ConstraintGroupCancellationAndNumberOfTransactionsRule.
 * forUnderlyingTransaction6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndPaymentInformationRule#forUnderlyingTransaction6
 * ConstraintGroupCancellationTrueAndPaymentInformationRule.
 * forUnderlyingTransaction6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndPaymentInformationRule#forUnderlyingTransaction6
 * ConstraintGroupCancellationFalseAndPaymentInformationRule.
 * forUnderlyingTransaction6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationCaseRule#forUnderlyingTransaction6
 * ConstraintGroupOrPaymentInformationCaseRule.forUnderlyingTransaction6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule#forUnderlyingTransaction6
 * ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the underlying (group of) transaction(s) to which the investigation applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction7
 * UnderlyingTransaction7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction6", propOrder = {"originalGroupInformationAndCancellation", "originalPaymentInformationAndCancellation"})
public class UnderlyingTransaction6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInfAndCxl")
	protected OriginalGroupHeader4 originalGroupInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4
	 * OriginalGroupHeader4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6
	 * UnderlyingTransaction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original message, to which the cancellation refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalGroupInformationAndCancellation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction6.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndCancellation";
			definition = "Provides information on the original message, to which the cancellation refers.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader4.mmObject();
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndCxl")
	protected List<com.tools20022.repository.msg.OriginalPaymentInstruction4> originalPaymentInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4
	 * OriginalPaymentInstruction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6
	 * UnderlyingTransaction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original (group of) transactions, to which the cancellation request refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalPaymentInformationAndCancellation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction6.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndCancellation";
			definition = "Provides information on the original (group of) transactions, to which the cancellation request refers.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTransaction6.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction6.mmOriginalPaymentInformationAndCancellation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentCancellationRequestV02.mmUnderlying);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction6,
						com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule.forUnderlyingTransaction6,
						com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndPaymentInformationRule.forUnderlyingTransaction6,
						com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndPaymentInformationRule.forUnderlyingTransaction6,
						com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationCaseRule.forUnderlyingTransaction6, com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction6";
				definition = "Identifies the underlying (group of) transaction(s) to which the investigation applies.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupHeader4> getOriginalGroupInformationAndCancellation() {
		return originalGroupInformationAndCancellation == null ? Optional.empty() : Optional.of(originalGroupInformationAndCancellation);
	}

	public UnderlyingTransaction6 setOriginalGroupInformationAndCancellation(com.tools20022.repository.msg.OriginalGroupHeader4 originalGroupInformationAndCancellation) {
		this.originalGroupInformationAndCancellation = originalGroupInformationAndCancellation;
		return this;
	}

	public List<OriginalPaymentInstruction4> getOriginalPaymentInformationAndCancellation() {
		return originalPaymentInformationAndCancellation == null ? originalPaymentInformationAndCancellation = new ArrayList<>() : originalPaymentInformationAndCancellation;
	}

	public UnderlyingTransaction6 setOriginalPaymentInformationAndCancellation(List<com.tools20022.repository.msg.OriginalPaymentInstruction4> originalPaymentInformationAndCancellation) {
		this.originalPaymentInformationAndCancellation = Objects.requireNonNull(originalPaymentInformationAndCancellation);
		return this;
	}
}