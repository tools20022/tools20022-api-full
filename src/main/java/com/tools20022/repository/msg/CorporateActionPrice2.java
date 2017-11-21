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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PriceFormat3Choice;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies prices.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice2#mmMaximumPrice
 * CorporateActionPrice2.mmMaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice2#mmMinimumPrice
 * CorporateActionPrice2.mmMinimumPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionPrice2", propOrder = {"maximumPrice", "minimumPrice"})
public class CorporateActionPrice2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceFormat3Choice maximumPrice;
	/**
	 * Maximum or cap price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat3Choice
	 * PriceFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
	 * BiddingConditions.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice2
	 * CorporateActionPrice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumPrice;
			componentContext_lazy = () -> CorporateActionPrice2.mmObject();
			isDerived = false;
			xmlTag = "MaxPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumPrice";
			definition = "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat3Choice.mmObject();
		}
	};
	protected PriceFormat3Choice minimumPrice;
	/**
	 * Minimum or floor price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat3Choice
	 * PriceFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
	 * BiddingConditions.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice2
	 * CorporateActionPrice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMinimumPrice;
			componentContext_lazy = () -> CorporateActionPrice2.mmObject();
			isDerived = false;
			xmlTag = "MinPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumPrice";
			definition = "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPrice2.mmMaximumPrice, CorporateActionPrice2.mmMinimumPrice);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice2";
				definition = "Specifies prices.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MaxPric")
	public PriceFormat3Choice getMaximumPrice() {
		return maximumPrice;
	}

	public void setMaximumPrice(PriceFormat3Choice maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	@XmlElement(name = "MinPric")
	public PriceFormat3Choice getMinimumPrice() {
		return minimumPrice;
	}

	public void setMinimumPrice(PriceFormat3Choice minimumPrice) {
		this.minimumPrice = minimumPrice;
	}
}