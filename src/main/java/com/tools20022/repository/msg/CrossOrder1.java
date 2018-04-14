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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CrossType1Code;
import com.tools20022.repository.codeset.Prioritisation1Code;
import com.tools20022.repository.entity.CrossTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Order9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the cross order (common to each side of the cross).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CrossOrder1#mmCrossType
 * CrossOrder1.mmCrossType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CrossOrder1#mmPrioritisation
 * CrossOrder1.mmPrioritisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CrossOrder1#mmBuySideDetails
 * CrossOrder1.mmBuySideDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CrossOrder1#mmSellSideDetails
 * CrossOrder1.mmSellSideDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CrossOrder1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the cross order (common to each side of the cross)."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CrossOrder1", propOrder = {"crossType", "prioritisation", "buySideDetails", "sellSideDetails"})
public class CrossOrder1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CrossTp", required = true)
	protected CrossType1Code crossType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CrossOrder1 CrossOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrossTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cross being submitted to a market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 549</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CrossOrder1, CrossType1Code> mmCrossType = new MMMessageAttribute<CrossOrder1, CrossType1Code>() {
		{
			businessElementTrace_lazy = () -> CrossTrade.mmCrossType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CrossOrder1.mmObject();
			isDerived = false;
			xmlTag = "CrossTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "549"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossType";
			definition = "Type of cross being submitted to a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CrossType1Code.mmObject();
		}

		@Override
		public CrossType1Code getValue(CrossOrder1 obj) {
			return obj.getCrossType();
		}

		@Override
		public void setValue(CrossOrder1 obj, CrossType1Code value) {
			obj.setCrossType(value);
		}
	};
	@XmlElement(name = "Prtistn", required = true)
	protected Prioritisation1Code prioritisation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CrossOrder1 CrossOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtistn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prioritisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if one side or the other of a cross order should be prioritized.\nThe definition of prioritization is left to the market. In some markets prioritization means which side of the cross order is applied to the market first. In other markets, prioritization may mean that the prioritized side is fully executed (sometimes referred to as the side being protected)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 550</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CrossOrder1, Prioritisation1Code> mmPrioritisation = new MMMessageAttribute<CrossOrder1, Prioritisation1Code>() {
		{
			businessElementTrace_lazy = () -> CrossTrade.mmPrioritisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CrossOrder1.mmObject();
			isDerived = false;
			xmlTag = "Prtistn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "550"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prioritisation";
			definition = "Indicates if one side or the other of a cross order should be prioritized.\nThe definition of prioritization is left to the market. In some markets prioritization means which side of the cross order is applied to the market first. In other markets, prioritization may mean that the prioritized side is fully executed (sometimes referred to as the side being protected).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Prioritisation1Code.mmObject();
		}

		@Override
		public Prioritisation1Code getValue(CrossOrder1 obj) {
			return obj.getPrioritisation();
		}

		@Override
		public void setValue(CrossOrder1 obj, Prioritisation1Code value) {
			obj.setPrioritisation(value);
		}
	};
	@XmlElement(name = "BuySdDtls", required = true)
	protected Order9 buySideDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CrossOrder1 CrossOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuySdDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buyside order details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CrossOrder1, Order9> mmBuySideDetails = new MMMessageAssociationEnd<CrossOrder1, Order9>() {
		{
			businessElementTrace_lazy = () -> CrossTrade.mmBuySideOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.CrossOrder1.mmObject();
			isDerived = false;
			xmlTag = "BuySdDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySideDetails";
			definition = "Buyside order details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Order9.mmObject();
		}

		@Override
		public Order9 getValue(CrossOrder1 obj) {
			return obj.getBuySideDetails();
		}

		@Override
		public void setValue(CrossOrder1 obj, Order9 value) {
			obj.setBuySideDetails(value);
		}
	};
	@XmlElement(name = "SellSdDtls", required = true)
	protected Order9 sellSideDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CrossOrder1 CrossOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellSdDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sell side order details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CrossOrder1, Order9> mmSellSideDetails = new MMMessageAssociationEnd<CrossOrder1, Order9>() {
		{
			businessElementTrace_lazy = () -> CrossTrade.mmSellSideOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.CrossOrder1.mmObject();
			isDerived = false;
			xmlTag = "SellSdDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellSideDetails";
			definition = "Sell side order details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Order9.mmObject();
		}

		@Override
		public Order9 getValue(CrossOrder1 obj) {
			return obj.getSellSideDetails();
		}

		@Override
		public void setValue(CrossOrder1 obj, Order9 value) {
			obj.setSellSideDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CrossOrder1.mmCrossType, com.tools20022.repository.msg.CrossOrder1.mmPrioritisation, com.tools20022.repository.msg.CrossOrder1.mmBuySideDetails,
						com.tools20022.repository.msg.CrossOrder1.mmSellSideDetails);
				trace_lazy = () -> CrossTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CrossOrder1";
				definition = "Provides details about the cross order (common to each side of the cross).";
			}
		});
		return mmObject_lazy.get();
	}

	public CrossType1Code getCrossType() {
		return crossType;
	}

	public CrossOrder1 setCrossType(CrossType1Code crossType) {
		this.crossType = Objects.requireNonNull(crossType);
		return this;
	}

	public Prioritisation1Code getPrioritisation() {
		return prioritisation;
	}

	public CrossOrder1 setPrioritisation(Prioritisation1Code prioritisation) {
		this.prioritisation = Objects.requireNonNull(prioritisation);
		return this;
	}

	public Order9 getBuySideDetails() {
		return buySideDetails;
	}

	public CrossOrder1 setBuySideDetails(Order9 buySideDetails) {
		this.buySideDetails = Objects.requireNonNull(buySideDetails);
		return this;
	}

	public Order9 getSellSideDetails() {
		return sellSideDetails;
	}

	public CrossOrder1 setSellSideDetails(Order9 sellSideDetails) {
		this.sellSideDetails = Objects.requireNonNull(sellSideDetails);
		return this;
	}
}