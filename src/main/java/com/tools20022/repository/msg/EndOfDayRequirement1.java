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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Obligations of a clearing member with respect to a central counterparty that
 * are calculated based on end of day positions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement1#mmInitialMarginRequirement
 * EndOfDayRequirement1.mmInitialMarginRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement1#mmVariationMarginRequirement
 * EndOfDayRequirement1.mmVariationMarginRequirement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMarginPresenceRule#forEndOfDayRequirement1
 * ConstraintMarginPresenceRule.forEndOfDayRequirement1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EndOfDayRequirement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligations of a clearing member with respect to a central counterparty that are calculated based on end of day positions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EndOfDayRequirement1", propOrder = {"initialMarginRequirement", "variationMarginRequirement"})
public class EndOfDayRequirement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InitlMrgnRqrmnt")
	protected ActiveCurrencyAndAmount initialMarginRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmInitialMargin
	 * MarginCall.mmInitialMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement1
	 * EndOfDayRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgnRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMarginRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the initial margin requirement for position.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitialMarginRequirement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmInitialMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.EndOfDayRequirement1.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgnRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMarginRequirement";
			definition = "Specifies the initial margin requirement for position.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "VartnMrgnRqrmnt")
	protected AmountAndDirection6 variationMarginRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
	 * MarginCall.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement1
	 * EndOfDayRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Daily change in mark-to-market for the associated position. Indicates whether variation margin paid to clearing members (true) or received from clearing members (false)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariationMarginRequirement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmVariationMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.EndOfDayRequirement1.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRequirement";
			definition = "Daily change in mark-to-market for the associated position. Indicates whether variation margin paid to clearing members (true) or received from clearing members (false).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EndOfDayRequirement1.mmInitialMarginRequirement, com.tools20022.repository.msg.EndOfDayRequirement1.mmVariationMarginRequirement);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMarginPresenceRule.forEndOfDayRequirement1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EndOfDayRequirement1";
				definition = "Obligations of a clearing member with respect to a central counterparty that are calculated based on end of day positions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getInitialMarginRequirement() {
		return initialMarginRequirement == null ? Optional.empty() : Optional.of(initialMarginRequirement);
	}

	public EndOfDayRequirement1 setInitialMarginRequirement(ActiveCurrencyAndAmount initialMarginRequirement) {
		this.initialMarginRequirement = initialMarginRequirement;
		return this;
	}

	public Optional<AmountAndDirection6> getVariationMarginRequirement() {
		return variationMarginRequirement == null ? Optional.empty() : Optional.of(variationMarginRequirement);
	}

	public EndOfDayRequirement1 setVariationMarginRequirement(com.tools20022.repository.msg.AmountAndDirection6 variationMarginRequirement) {
		this.variationMarginRequirement = variationMarginRequirement;
		return this;
	}
}