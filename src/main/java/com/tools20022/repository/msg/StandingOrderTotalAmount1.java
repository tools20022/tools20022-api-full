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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TotalAmountAndCurrency1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the overall amount of "not yet executed" predefined
 * liquidity transfer orders or "defined" by a system participant in its sphere
 * of responsibility within the system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1#mmSetPredefinedOrder
 * StandingOrderTotalAmount1.mmSetPredefinedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1#mmPendingPredefinedOrder
 * StandingOrderTotalAmount1.mmPendingPredefinedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1#mmSetStandingOrder
 * StandingOrderTotalAmount1.mmSetStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1#mmPendingStandingOrder
 * StandingOrderTotalAmount1.mmPendingStandingOrder}</li>
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
 * "StandingOrderTotalAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the overall amount of \"not yet executed\" predefined liquidity transfer orders or \"defined\" by a system participant in its sphere of responsibility within the system."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingOrderTotalAmount1", propOrder = {"setPredefinedOrder", "pendingPredefinedOrder", "setStandingOrder", "pendingStandingOrder"})
public class StandingOrderTotalAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SetPrdfndOrdr", required = true)
	protected TotalAmountAndCurrency1 setPredefinedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalAmountAndCurrency1
	 * TotalAmountAndCurrency1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1
	 * StandingOrderTotalAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SetPrdfndOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SetPredefinedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total defined amount of predefined liquidity transfer orders."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrderTotalAmount1, TotalAmountAndCurrency1> mmSetPredefinedOrder = new MMMessageAssociationEnd<StandingOrderTotalAmount1, TotalAmountAndCurrency1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderTotalAmount1.mmObject();
			isDerived = false;
			xmlTag = "SetPrdfndOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SetPredefinedOrder";
			definition = "Total defined amount of predefined liquidity transfer orders.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TotalAmountAndCurrency1.mmObject();
		}

		@Override
		public TotalAmountAndCurrency1 getValue(StandingOrderTotalAmount1 obj) {
			return obj.getSetPredefinedOrder();
		}

		@Override
		public void setValue(StandingOrderTotalAmount1 obj, TotalAmountAndCurrency1 value) {
			obj.setSetPredefinedOrder(value);
		}
	};
	@XmlElement(name = "PdgPrdfndOrdr", required = true)
	protected TotalAmountAndCurrency1 pendingPredefinedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalAmountAndCurrency1
	 * TotalAmountAndCurrency1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1
	 * StandingOrderTotalAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrdfndOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingPredefinedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of not yet executed predefined liquidity transfer orders."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrderTotalAmount1, TotalAmountAndCurrency1> mmPendingPredefinedOrder = new MMMessageAssociationEnd<StandingOrderTotalAmount1, TotalAmountAndCurrency1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderTotalAmount1.mmObject();
			isDerived = false;
			xmlTag = "PdgPrdfndOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingPredefinedOrder";
			definition = "Total amount of not yet executed predefined liquidity transfer orders.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TotalAmountAndCurrency1.mmObject();
		}

		@Override
		public TotalAmountAndCurrency1 getValue(StandingOrderTotalAmount1 obj) {
			return obj.getPendingPredefinedOrder();
		}

		@Override
		public void setValue(StandingOrderTotalAmount1 obj, TotalAmountAndCurrency1 value) {
			obj.setPendingPredefinedOrder(value);
		}
	};
	@XmlElement(name = "SetStgOrdr", required = true)
	protected TotalAmountAndCurrency1 setStandingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalAmountAndCurrency1
	 * TotalAmountAndCurrency1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1
	 * StandingOrderTotalAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SetStgOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SetStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total defined amount of standing liquidity transfer orders."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrderTotalAmount1, TotalAmountAndCurrency1> mmSetStandingOrder = new MMMessageAssociationEnd<StandingOrderTotalAmount1, TotalAmountAndCurrency1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderTotalAmount1.mmObject();
			isDerived = false;
			xmlTag = "SetStgOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SetStandingOrder";
			definition = "Total defined amount of standing liquidity transfer orders.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TotalAmountAndCurrency1.mmObject();
		}

		@Override
		public TotalAmountAndCurrency1 getValue(StandingOrderTotalAmount1 obj) {
			return obj.getSetStandingOrder();
		}

		@Override
		public void setValue(StandingOrderTotalAmount1 obj, TotalAmountAndCurrency1 value) {
			obj.setSetStandingOrder(value);
		}
	};
	@XmlElement(name = "PdgStgOrdr", required = true)
	protected TotalAmountAndCurrency1 pendingStandingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalAmountAndCurrency1
	 * TotalAmountAndCurrency1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1
	 * StandingOrderTotalAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgStgOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of not yet executed standing liquidity transfer orders."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrderTotalAmount1, TotalAmountAndCurrency1> mmPendingStandingOrder = new MMMessageAssociationEnd<StandingOrderTotalAmount1, TotalAmountAndCurrency1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingOrderTotalAmount1.mmObject();
			isDerived = false;
			xmlTag = "PdgStgOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingStandingOrder";
			definition = "Total amount of not yet executed standing liquidity transfer orders.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TotalAmountAndCurrency1.mmObject();
		}

		@Override
		public TotalAmountAndCurrency1 getValue(StandingOrderTotalAmount1 obj) {
			return obj.getPendingStandingOrder();
		}

		@Override
		public void setValue(StandingOrderTotalAmount1 obj, TotalAmountAndCurrency1 value) {
			obj.setPendingStandingOrder(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrderTotalAmount1.mmSetPredefinedOrder, com.tools20022.repository.msg.StandingOrderTotalAmount1.mmPendingPredefinedOrder,
						com.tools20022.repository.msg.StandingOrderTotalAmount1.mmSetStandingOrder, com.tools20022.repository.msg.StandingOrderTotalAmount1.mmPendingStandingOrder);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrderTotalAmount1";
				definition = "Provides details on the overall amount of \"not yet executed\" predefined liquidity transfer orders or \"defined\" by a system participant in its sphere of responsibility within the system.";
			}
		});
		return mmObject_lazy.get();
	}

	public TotalAmountAndCurrency1 getSetPredefinedOrder() {
		return setPredefinedOrder;
	}

	public StandingOrderTotalAmount1 setSetPredefinedOrder(TotalAmountAndCurrency1 setPredefinedOrder) {
		this.setPredefinedOrder = Objects.requireNonNull(setPredefinedOrder);
		return this;
	}

	public TotalAmountAndCurrency1 getPendingPredefinedOrder() {
		return pendingPredefinedOrder;
	}

	public StandingOrderTotalAmount1 setPendingPredefinedOrder(TotalAmountAndCurrency1 pendingPredefinedOrder) {
		this.pendingPredefinedOrder = Objects.requireNonNull(pendingPredefinedOrder);
		return this;
	}

	public TotalAmountAndCurrency1 getSetStandingOrder() {
		return setStandingOrder;
	}

	public StandingOrderTotalAmount1 setSetStandingOrder(TotalAmountAndCurrency1 setStandingOrder) {
		this.setStandingOrder = Objects.requireNonNull(setStandingOrder);
		return this;
	}

	public TotalAmountAndCurrency1 getPendingStandingOrder() {
		return pendingStandingOrder;
	}

	public StandingOrderTotalAmount1 setPendingStandingOrder(TotalAmountAndCurrency1 pendingStandingOrder) {
		this.pendingStandingOrder = Objects.requireNonNull(pendingStandingOrder);
		return this;
	}
}