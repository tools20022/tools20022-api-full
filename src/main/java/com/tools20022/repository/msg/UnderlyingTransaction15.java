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
import com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalGroupHeader6;
import com.tools20022.repository.msg.OriginalPaymentInstruction20;
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
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction15.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction15.mmOriginalPaymentInformationAndCancellation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06#mmUnderlying
 * CustomerPaymentCancellationRequestV06.mmUnderlying}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the underlying (group of) transaction(s) to which the investigation applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule#forUnderlyingTransaction15
 * ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule#forUnderlyingTransaction15
 * ConstraintGroupCancellationAndNumberOfTransactionsRule.
 * forUnderlyingTransaction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndPaymentInformationRule#forUnderlyingTransaction15
 * ConstraintGroupCancellationTrueAndPaymentInformationRule.
 * forUnderlyingTransaction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndPaymentInformationRule#forUnderlyingTransaction15
 * ConstraintGroupCancellationFalseAndPaymentInformationRule.
 * forUnderlyingTransaction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationCaseRule#forUnderlyingTransaction15
 * ConstraintGroupOrPaymentInformationCaseRule.forUnderlyingTransaction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule#forUnderlyingTransaction15
 * ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction15}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction21
 * UnderlyingTransaction21}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12
 * UnderlyingTransaction12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction15", propOrder = {"originalGroupInformationAndCancellation", "originalPaymentInformationAndCancellation"})
public class UnderlyingTransaction15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInfAndCxl")
	protected OriginalGroupHeader6 originalGroupInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15
	 * UnderlyingTransaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original message, to which the cancellation refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction21#mmOriginalGroupInformationAndCancellation
	 * UnderlyingTransaction21.mmOriginalGroupInformationAndCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12#mmOriginalGroupInformationAndCancellation
	 * UnderlyingTransaction12.mmOriginalGroupInformationAndCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction15, Optional<OriginalGroupHeader6>> mmOriginalGroupInformationAndCancellation = new MMMessageAssociationEnd<UnderlyingTransaction15, Optional<OriginalGroupHeader6>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndCancellation";
			definition = "Provides information on the original message, to which the cancellation refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction21.mmOriginalGroupInformationAndCancellation);
			previousVersion_lazy = () -> UnderlyingTransaction12.mmOriginalGroupInformationAndCancellation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupHeader6.mmObject();
		}

		@Override
		public Optional<OriginalGroupHeader6> getValue(UnderlyingTransaction15 obj) {
			return obj.getOriginalGroupInformationAndCancellation();
		}

		@Override
		public void setValue(UnderlyingTransaction15 obj, Optional<OriginalGroupHeader6> value) {
			obj.setOriginalGroupInformationAndCancellation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndCxl")
	protected List<OriginalPaymentInstruction20> originalPaymentInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20
	 * OriginalPaymentInstruction20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction15
	 * UnderlyingTransaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original (group of) transactions, to which the cancellation request refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction21#mmOriginalPaymentInformationAndCancellation
	 * UnderlyingTransaction21.mmOriginalPaymentInformationAndCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction12#mmOriginalPaymentInformationAndCancellation
	 * UnderlyingTransaction12.mmOriginalPaymentInformationAndCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction15, List<OriginalPaymentInstruction20>> mmOriginalPaymentInformationAndCancellation = new MMMessageAssociationEnd<UnderlyingTransaction15, List<OriginalPaymentInstruction20>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndCancellation";
			definition = "Provides information on the original (group of) transactions, to which the cancellation request refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction21.mmOriginalPaymentInformationAndCancellation);
			previousVersion_lazy = () -> UnderlyingTransaction12.mmOriginalPaymentInformationAndCancellation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalPaymentInstruction20.mmObject();
		}

		@Override
		public List<OriginalPaymentInstruction20> getValue(UnderlyingTransaction15 obj) {
			return obj.getOriginalPaymentInformationAndCancellation();
		}

		@Override
		public void setValue(UnderlyingTransaction15 obj, List<OriginalPaymentInstruction20> value) {
			obj.setOriginalPaymentInformationAndCancellation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTransaction15.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction15.mmOriginalPaymentInformationAndCancellation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentCancellationRequestV06.mmUnderlying);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction15,
						com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule.forUnderlyingTransaction15,
						com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndPaymentInformationRule.forUnderlyingTransaction15,
						com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndPaymentInformationRule.forUnderlyingTransaction15,
						com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationCaseRule.forUnderlyingTransaction15, com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction15";
				definition = "Identifies the underlying (group of) transaction(s) to which the investigation applies.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction21.mmObject());
				previousVersion_lazy = () -> UnderlyingTransaction12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupHeader6> getOriginalGroupInformationAndCancellation() {
		return originalGroupInformationAndCancellation == null ? Optional.empty() : Optional.of(originalGroupInformationAndCancellation);
	}

	public UnderlyingTransaction15 setOriginalGroupInformationAndCancellation(OriginalGroupHeader6 originalGroupInformationAndCancellation) {
		this.originalGroupInformationAndCancellation = originalGroupInformationAndCancellation;
		return this;
	}

	public List<OriginalPaymentInstruction20> getOriginalPaymentInformationAndCancellation() {
		return originalPaymentInformationAndCancellation == null ? originalPaymentInformationAndCancellation = new ArrayList<>() : originalPaymentInformationAndCancellation;
	}

	public UnderlyingTransaction15 setOriginalPaymentInformationAndCancellation(List<OriginalPaymentInstruction20> originalPaymentInformationAndCancellation) {
		this.originalPaymentInformationAndCancellation = Objects.requireNonNull(originalPaymentInformationAndCancellation);
		return this;
	}
}