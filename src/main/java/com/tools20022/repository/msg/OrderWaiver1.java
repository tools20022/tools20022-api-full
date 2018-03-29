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
import com.tools20022.repository.choice.OrderWaiverReason3Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about how an order is to be processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderWaiver1#mmOrderWaiverReason
 * OrderWaiver1.mmOrderWaiverReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderWaiver1#mmInformationValue
 * OrderWaiver1.mmInformationValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintWaiverElementRule#forOrderWaiver1
 * ConstraintWaiverElementRule.forOrderWaiver1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderWaiver1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about how an order is to be processed."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation2
 * AdditionalInformation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderWaiver1", propOrder = {"orderWaiverReason", "informationValue"})
public class OrderWaiver1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrWvrRsn")
	protected List<OrderWaiverReason3Choice> orderWaiverReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice
	 * OrderWaiverReason3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderWaiverReason
	 * InvestmentFundOrder.mmOrderWaiverReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderWaiver1 OrderWaiver1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrWvrRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderWaiverReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why the order has to be handled differently, probably in a manual fashion, because, for example, the investment manager has agreed a waiver to the terms."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation2#mmOrderWaiverReason
	 * AdditionalInformation2.mmOrderWaiverReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderWaiver1, List<OrderWaiverReason3Choice>> mmOrderWaiverReason = new MMMessageAssociationEnd<OrderWaiver1, List<OrderWaiverReason3Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderWaiverReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderWaiver1.mmObject();
			isDerived = false;
			xmlTag = "OrdrWvrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderWaiverReason";
			definition = "Reason why the order has to be handled differently, probably in a manual fashion, because, for example, the investment manager has agreed a waiver to the terms.";
			previousVersion_lazy = () -> AdditionalInformation2.mmOrderWaiverReason;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrderWaiverReason3Choice.mmObject();
		}

		@Override
		public List<OrderWaiverReason3Choice> getValue(OrderWaiver1 obj) {
			return obj.getOrderWaiverReason();
		}

		@Override
		public void setValue(OrderWaiver1 obj, List<OrderWaiverReason3Choice> value) {
			obj.setOrderWaiverReason(value);
		}
	};
	@XmlElement(name = "InfVal")
	protected Max350Text informationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderWaiver1 OrderWaiver1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the order waiver."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation2#mmInformationValue
	 * AdditionalInformation2.mmInformationValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderWaiver1, Optional<Max350Text>> mmInformationValue = new MMMessageAttribute<OrderWaiver1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderWaiver1.mmObject();
			isDerived = false;
			xmlTag = "InfVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationValue";
			definition = "Additional information about the order waiver.";
			previousVersion_lazy = () -> AdditionalInformation2.mmInformationValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(OrderWaiver1 obj) {
			return obj.getInformationValue();
		}

		@Override
		public void setValue(OrderWaiver1 obj, Optional<Max350Text> value) {
			obj.setInformationValue(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderWaiver1.mmOrderWaiverReason, com.tools20022.repository.msg.OrderWaiver1.mmInformationValue);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintWaiverElementRule.forOrderWaiver1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderWaiver1";
				definition = "Information about how an order is to be processed.";
				previousVersion_lazy = () -> AdditionalInformation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<OrderWaiverReason3Choice> getOrderWaiverReason() {
		return orderWaiverReason == null ? orderWaiverReason = new ArrayList<>() : orderWaiverReason;
	}

	public OrderWaiver1 setOrderWaiverReason(List<OrderWaiverReason3Choice> orderWaiverReason) {
		this.orderWaiverReason = Objects.requireNonNull(orderWaiverReason);
		return this;
	}

	public Optional<Max350Text> getInformationValue() {
		return informationValue == null ? Optional.empty() : Optional.of(informationValue);
	}

	public OrderWaiver1 setInformationValue(Max350Text informationValue) {
		this.informationValue = informationValue;
		return this;
	}
}