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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1#SetPredefinedOrder
 * StandingOrderTotalAmount1.SetPredefinedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1#PendingPredefinedOrder
 * StandingOrderTotalAmount1.PendingPredefinedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1#SetStandingOrder
 * StandingOrderTotalAmount1.SetStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderTotalAmount1#PendingStandingOrder
 * StandingOrderTotalAmount1.PendingStandingOrder}</li>
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
public class StandingOrderTotalAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total defined amount of predefined liquidity transfer orders.
	 * <p>
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
	public static final MMMessageAssociationEnd SetPredefinedOrder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StandingOrderTotalAmount1.mmObject();
			isDerived = false;
			xmlTag = "SetPrdfndOrdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SetPredefinedOrder";
			definition = "Total defined amount of predefined liquidity transfer orders.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TotalAmountAndCurrency1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total amount of not yet executed predefined liquidity transfer orders.
	 * <p>
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
	public static final MMMessageAssociationEnd PendingPredefinedOrder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StandingOrderTotalAmount1.mmObject();
			isDerived = false;
			xmlTag = "PdgPrdfndOrdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingPredefinedOrder";
			definition = "Total amount of not yet executed predefined liquidity transfer orders.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TotalAmountAndCurrency1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total defined amount of standing liquidity transfer orders.
	 * <p>
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
	public static final MMMessageAssociationEnd SetStandingOrder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StandingOrderTotalAmount1.mmObject();
			isDerived = false;
			xmlTag = "SetStgOrdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SetStandingOrder";
			definition = "Total defined amount of standing liquidity transfer orders.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TotalAmountAndCurrency1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total amount of not yet executed standing liquidity transfer orders.
	 * <p>
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
	public static final MMMessageAssociationEnd PendingStandingOrder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StandingOrderTotalAmount1.mmObject();
			isDerived = false;
			xmlTag = "PdgStgOrdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingStandingOrder";
			definition = "Total amount of not yet executed standing liquidity transfer orders.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TotalAmountAndCurrency1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrderTotalAmount1.SetPredefinedOrder, com.tools20022.repository.msg.StandingOrderTotalAmount1.PendingPredefinedOrder,
						com.tools20022.repository.msg.StandingOrderTotalAmount1.SetStandingOrder, com.tools20022.repository.msg.StandingOrderTotalAmount1.PendingStandingOrder);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingOrderTotalAmount1";
				definition = "Provides details on the overall amount of \"not yet executed\" predefined liquidity transfer orders or \"defined\" by a system participant in its sphere of responsibility within the system.";
			}
		});
		return mmObject_lazy.get();
	}
}