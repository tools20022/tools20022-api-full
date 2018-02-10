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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashStandingOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.StandingOrderIdentification2;
import com.tools20022.repository.msg.StandingOrderIdentification3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of one or all standing orders set by the member and managed
 * by the transaction administrator.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingOrderOrAll1Choice#mmStandingOrder
 * StandingOrderOrAll1Choice.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingOrderOrAll1Choice#mmAllStandingOrders
 * StandingOrderOrAll1Choice.mmAllStandingOrders}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingOrderOrAll1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics of one or all standing orders set by the member and managed by the transaction administrator."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingOrderOrAll1Choice", propOrder = {"standingOrder", "allStandingOrders"})
public class StandingOrderOrAll1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StgOrdr", required = true)
	protected List<StandingOrderIdentification2> standingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification2
	 * StandingOrderIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StandingOrderOrAll1Choice
	 * StandingOrderOrAll1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of single standing orders defined with specific characteristics."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStandingOrder = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashStandingOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.StandingOrderOrAll1Choice.mmObject();
			isDerived = false;
			xmlTag = "StgOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Identification of single standing orders defined with specific characteristics.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StandingOrderIdentification2.mmObject();
		}
	};
	@XmlElement(name = "AllStgOrdrs", required = true)
	protected List<StandingOrderIdentification3> allStandingOrders;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification3
	 * StandingOrderIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StandingOrderOrAll1Choice
	 * StandingOrderOrAll1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllStgOrdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllStandingOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of all standing orders defined with specific characteristics."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllStandingOrders = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashStandingOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.StandingOrderOrAll1Choice.mmObject();
			isDerived = false;
			xmlTag = "AllStgOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllStandingOrders";
			definition = "Identification of all standing orders defined with specific characteristics.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StandingOrderIdentification3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.StandingOrderOrAll1Choice.mmStandingOrder, com.tools20022.repository.choice.StandingOrderOrAll1Choice.mmAllStandingOrders);
				trace_lazy = () -> CashStandingOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StandingOrderOrAll1Choice";
				definition = "Characteristics of one or all standing orders set by the member and managed by the transaction administrator.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<StandingOrderIdentification2> getStandingOrder() {
		return standingOrder == null ? standingOrder = new ArrayList<>() : standingOrder;
	}

	public StandingOrderOrAll1Choice setStandingOrder(List<StandingOrderIdentification2> standingOrder) {
		this.standingOrder = Objects.requireNonNull(standingOrder);
		return this;
	}

	public List<StandingOrderIdentification3> getAllStandingOrders() {
		return allStandingOrders == null ? allStandingOrders = new ArrayList<>() : allStandingOrders;
	}

	public StandingOrderOrAll1Choice setAllStandingOrders(List<StandingOrderIdentification3> allStandingOrders) {
		this.allStandingOrders = Objects.requireNonNull(allStandingOrders);
		return this;
	}
}