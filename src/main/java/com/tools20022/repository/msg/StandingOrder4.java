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
import com.tools20022.repository.choice.StandingOrderOrError4Choice;
import com.tools20022.repository.entity.CashStandingOrder;
import com.tools20022.repository.entity.StandingOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.StandingOrderIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the detailed attributes of a standing order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder4#mmStandingOrderIdentification
 * StandingOrder4.mmStandingOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder4#mmStandingOrderOrError
 * StandingOrder4.mmStandingOrderOrError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
 * CashStandingOrder}</li>
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
 * "StandingOrder4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the detailed attributes of a standing order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.StandingOrder3
 * StandingOrder3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingOrder4", propOrder = {"standingOrderIdentification", "standingOrderOrError"})
public class StandingOrder4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StgOrdrId", required = true)
	protected StandingOrderIdentification2 standingOrderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification2
	 * StandingOrderIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIdentification
	 * StandingOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder4 StandingOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder3#mmStandingOrderIdentification
	 * StandingOrder3.mmStandingOrderIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrder4, StandingOrderIdentification2> mmStandingOrderIdentification = new MMMessageAttribute<StandingOrder4, StandingOrderIdentification2>() {
		{
			businessElementTrace_lazy = () -> StandingOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder4.mmObject();
			isDerived = false;
			xmlTag = "StgOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> StandingOrder3.mmStandingOrderIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StandingOrderIdentification2.mmObject();
		}

		@Override
		public StandingOrderIdentification2 getValue(StandingOrder4 obj) {
			return obj.getStandingOrderIdentification();
		}

		@Override
		public void setValue(StandingOrder4 obj, StandingOrderIdentification2 value) {
			obj.setStandingOrderIdentification(value);
		}
	};
	@XmlElement(name = "StgOrdrOrErr", required = true)
	protected StandingOrderOrError4Choice standingOrderOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.StandingOrderOrError4Choice
	 * StandingOrderOrError4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder4 StandingOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested information on the standing order or business error when information has not been found."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrder3#mmStandingOrderOrError
	 * StandingOrder3.mmStandingOrderOrError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrder4, StandingOrderOrError4Choice> mmStandingOrderOrError = new MMMessageAssociationEnd<StandingOrder4, StandingOrderOrError4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrder4.mmObject();
			isDerived = false;
			xmlTag = "StgOrdrOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderOrError";
			definition = "Requested information on the standing order or business error when information has not been found.";
			previousVersion_lazy = () -> StandingOrder3.mmStandingOrderOrError;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StandingOrderOrError4Choice.mmObject();
		}

		@Override
		public StandingOrderOrError4Choice getValue(StandingOrder4 obj) {
			return obj.getStandingOrderOrError();
		}

		@Override
		public void setValue(StandingOrder4 obj, StandingOrderOrError4Choice value) {
			obj.setStandingOrderOrError(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrder4.mmStandingOrderIdentification, com.tools20022.repository.msg.StandingOrder4.mmStandingOrderOrError);
				trace_lazy = () -> CashStandingOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrder4";
				definition = "Defines the detailed attributes of a standing order.";
				previousVersion_lazy = () -> StandingOrder3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public StandingOrderIdentification2 getStandingOrderIdentification() {
		return standingOrderIdentification;
	}

	public StandingOrder4 setStandingOrderIdentification(StandingOrderIdentification2 standingOrderIdentification) {
		this.standingOrderIdentification = Objects.requireNonNull(standingOrderIdentification);
		return this;
	}

	public StandingOrderOrError4Choice getStandingOrderOrError() {
		return standingOrderOrError;
	}

	public StandingOrder4 setStandingOrderOrError(StandingOrderOrError4Choice standingOrderOrError) {
		this.standingOrderOrError = Objects.requireNonNull(standingOrderOrError);
		return this;
	}
}