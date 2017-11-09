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
import com.tools20022.repository.codeset.CrossType1Code;
import com.tools20022.repository.codeset.Prioritisation1Code;
import com.tools20022.repository.entity.CrossTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details about the order to be cancelled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CrossOrder2#mmCrossType
 * CrossOrder2.mmCrossType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CrossOrder2#mmPrioritisation
 * CrossOrder2.mmPrioritisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CrossOrder2#mmBuySideDetails
 * CrossOrder2.mmBuySideDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CrossOrder2#mmSellSideDetails
 * CrossOrder2.mmSellSideDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CrossOrder2#mmCancellationDetails
 * CrossOrder2.mmCancellationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CrossOrder2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the order to be cancelled."</li>
 * </ul>
 */
public class CrossOrder2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CrossType1Code crossType;
	/**
	 * Type of cross being submitted to a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CrossType1Code
	 * CrossType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#mmCrossType
	 * CrossTrade.mmCrossType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CrossOrder2 CrossOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrossTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cross being submitted to a market."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCrossType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CrossTrade.mmCrossType;
			componentContext_lazy = () -> CrossOrder2.mmObject();
			isDerived = false;
			xmlTag = "CrossTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossType";
			definition = "Type of cross being submitted to a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CrossType1Code.mmObject();
		}
	};
	protected Prioritisation1Code prioritisation;
	/**
	 * Indicates if one side or the other of a cross order should be
	 * prioritized. The definition of prioritization is left to the market. In
	 * some markets prioritization means which side of the cross order is
	 * applied to the market first. In other markets, prioritization may mean
	 * that the prioritized side is fully executed (sometimes referred to as the
	 * side being protected).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Prioritisation1Code
	 * Prioritisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#mmPrioritisation
	 * CrossTrade.mmPrioritisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CrossOrder2 CrossOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtistn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prioritisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if one side or the other of a cross order should be prioritized.\nThe definition of prioritization is left to the market. In some markets prioritization means which side of the cross order is applied to the market first. In other markets, prioritization may mean that the prioritized side is fully executed (sometimes referred to as the side being protected)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrioritisation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CrossTrade.mmPrioritisation;
			componentContext_lazy = () -> CrossOrder2.mmObject();
			isDerived = false;
			xmlTag = "Prtistn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prioritisation";
			definition = "Indicates if one side or the other of a cross order should be prioritized.\nThe definition of prioritization is left to the market. In some markets prioritization means which side of the cross order is applied to the market first. In other markets, prioritization may mean that the prioritized side is fully executed (sometimes referred to as the side being protected).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Prioritisation1Code.mmObject();
		}
	};
	protected Order9 buySideDetails;
	/**
	 * Buyside order details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Order9 Order9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#mmBuySideOrder
	 * CrossTrade.mmBuySideOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CrossOrder2 CrossOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuySdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buyside order details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuySideDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CrossTrade.mmBuySideOrder;
			componentContext_lazy = () -> CrossOrder2.mmObject();
			isDerived = false;
			xmlTag = "BuySdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySideDetails";
			definition = "Buyside order details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
		}
	};
	protected Order9 sellSideDetails;
	/**
	 * Sell side order details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Order9 Order9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#mmSellSideOrder
	 * CrossTrade.mmSellSideOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CrossOrder2 CrossOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellSdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sell side order details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellSideDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CrossTrade.mmSellSideOrder;
			componentContext_lazy = () -> CrossOrder2.mmObject();
			isDerived = false;
			xmlTag = "SellSdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellSideDetails";
			definition = "Sell side order details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
		}
	};
	protected CrossOrderCancel1 cancellationDetails;
	/**
	 * Additionnal details related to the cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CrossOrderCancel1
	 * CrossOrderCancel1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CrossOrder2 CrossOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additionnal details related to the cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CrossOrder2.mmObject();
			isDerived = false;
			xmlTag = "CxlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationDetails";
			definition = "Additionnal details related to the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CrossOrderCancel1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CrossOrder2.mmCrossType, CrossOrder2.mmPrioritisation, CrossOrder2.mmBuySideDetails, CrossOrder2.mmSellSideDetails, CrossOrder2.mmCancellationDetails);
				trace_lazy = () -> CrossTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CrossOrder2";
				definition = "Provides details about the order to be cancelled.";
			}
		});
		return mmObject_lazy.get();
	}

	public CrossType1Code getCrossType() {
		return crossType;
	}

	public void setCrossType(CrossType1Code crossType) {
		this.crossType = crossType;
	}

	public Prioritisation1Code getPrioritisation() {
		return prioritisation;
	}

	public void setPrioritisation(Prioritisation1Code prioritisation) {
		this.prioritisation = prioritisation;
	}

	public Order9 getBuySideDetails() {
		return buySideDetails;
	}

	public void setBuySideDetails(com.tools20022.repository.msg.Order9 buySideDetails) {
		this.buySideDetails = buySideDetails;
	}

	public Order9 getSellSideDetails() {
		return sellSideDetails;
	}

	public void setSellSideDetails(com.tools20022.repository.msg.Order9 sellSideDetails) {
		this.sellSideDetails = sellSideDetails;
	}

	public CrossOrderCancel1 getCancellationDetails() {
		return cancellationDetails;
	}

	public void setCancellationDetails(com.tools20022.repository.msg.CrossOrderCancel1 cancellationDetails) {
		this.cancellationDetails = cancellationDetails;
	}
}