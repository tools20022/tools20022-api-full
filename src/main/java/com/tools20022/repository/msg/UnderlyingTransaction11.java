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
import com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalGroupHeader4;
import com.tools20022.repository.msg.OriginalPaymentInstruction13;
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
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction11#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction11.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction11#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction11.mmOriginalPaymentInformationAndCancellation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04#mmUnderlying
 * CustomerPaymentCancellationRequestV04.mmUnderlying}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule#forUnderlyingTransaction11
 * ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule#forUnderlyingTransaction11
 * ConstraintGroupCancellationAndNumberOfTransactionsRule.
 * forUnderlyingTransaction11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndPaymentInformationRule#forUnderlyingTransaction11
 * ConstraintGroupCancellationTrueAndPaymentInformationRule.
 * forUnderlyingTransaction11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndPaymentInformationRule#forUnderlyingTransaction11
 * ConstraintGroupCancellationFalseAndPaymentInformationRule.
 * forUnderlyingTransaction11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationCaseRule#forUnderlyingTransaction11
 * ConstraintGroupOrPaymentInformationCaseRule.forUnderlyingTransaction11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule#forUnderlyingTransaction11
 * ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction11}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the underlying (group of) transaction(s) to which the investigation applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction12
 * UnderlyingTransaction12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction7
 * UnderlyingTransaction7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction11", propOrder = {"originalGroupInformationAndCancellation", "originalPaymentInformationAndCancellation"})
public class UnderlyingTransaction11 {

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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction11
	 * UnderlyingTransaction11}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12#mmOriginalGroupInformationAndCancellation
	 * UnderlyingTransaction12.mmOriginalGroupInformationAndCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction7#mmOriginalGroupInformationAndCancellation
	 * UnderlyingTransaction7.mmOriginalGroupInformationAndCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction11, Optional<OriginalGroupHeader4>> mmOriginalGroupInformationAndCancellation = new MMMessageAssociationEnd<UnderlyingTransaction11, Optional<OriginalGroupHeader4>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndCancellation";
			definition = "Provides information on the original message, to which the cancellation refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction12.mmOriginalGroupInformationAndCancellation);
			previousVersion_lazy = () -> UnderlyingTransaction7.mmOriginalGroupInformationAndCancellation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupHeader4.mmObject();
		}

		@Override
		public Optional<OriginalGroupHeader4> getValue(UnderlyingTransaction11 obj) {
			return obj.getOriginalGroupInformationAndCancellation();
		}

		@Override
		public void setValue(UnderlyingTransaction11 obj, Optional<OriginalGroupHeader4> value) {
			obj.setOriginalGroupInformationAndCancellation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndCxl")
	protected List<OriginalPaymentInstruction13> originalPaymentInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13
	 * OriginalPaymentInstruction13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction11
	 * UnderlyingTransaction11}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12#mmOriginalPaymentInformationAndCancellation
	 * UnderlyingTransaction12.mmOriginalPaymentInformationAndCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction7#mmOriginalPaymentInformationAndCancellation
	 * UnderlyingTransaction7.mmOriginalPaymentInformationAndCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction11, List<OriginalPaymentInstruction13>> mmOriginalPaymentInformationAndCancellation = new MMMessageAssociationEnd<UnderlyingTransaction11, List<OriginalPaymentInstruction13>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndCancellation";
			definition = "Provides information on the original (group of) transactions, to which the cancellation request refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction12.mmOriginalPaymentInformationAndCancellation);
			previousVersion_lazy = () -> UnderlyingTransaction7.mmOriginalPaymentInformationAndCancellation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalPaymentInstruction13.mmObject();
		}

		@Override
		public List<OriginalPaymentInstruction13> getValue(UnderlyingTransaction11 obj) {
			return obj.getOriginalPaymentInformationAndCancellation();
		}

		@Override
		public void setValue(UnderlyingTransaction11 obj, List<OriginalPaymentInstruction13> value) {
			obj.setOriginalPaymentInformationAndCancellation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTransaction11.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction11.mmOriginalPaymentInformationAndCancellation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentCancellationRequestV04.mmUnderlying);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction11,
						com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule.forUnderlyingTransaction11,
						com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndPaymentInformationRule.forUnderlyingTransaction11,
						com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndPaymentInformationRule.forUnderlyingTransaction11,
						com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationCaseRule.forUnderlyingTransaction11, com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction11);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction11";
				definition = "Identifies the underlying (group of) transaction(s) to which the investigation applies.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction12.mmObject());
				previousVersion_lazy = () -> UnderlyingTransaction7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupHeader4> getOriginalGroupInformationAndCancellation() {
		return originalGroupInformationAndCancellation == null ? Optional.empty() : Optional.of(originalGroupInformationAndCancellation);
	}

	public UnderlyingTransaction11 setOriginalGroupInformationAndCancellation(OriginalGroupHeader4 originalGroupInformationAndCancellation) {
		this.originalGroupInformationAndCancellation = originalGroupInformationAndCancellation;
		return this;
	}

	public List<OriginalPaymentInstruction13> getOriginalPaymentInformationAndCancellation() {
		return originalPaymentInformationAndCancellation == null ? originalPaymentInformationAndCancellation = new ArrayList<>() : originalPaymentInformationAndCancellation;
	}

	public UnderlyingTransaction11 setOriginalPaymentInformationAndCancellation(List<OriginalPaymentInstruction13> originalPaymentInformationAndCancellation) {
		this.originalPaymentInformationAndCancellation = Objects.requireNonNull(originalPaymentInformationAndCancellation);
		return this;
	}
}