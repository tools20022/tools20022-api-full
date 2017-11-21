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
import com.tools20022.repository.choice.PriceFormat2Choice;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#mmIndicativePrice
 * CorporateActionPrice4.mmIndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#mmMarketPrice
 * CorporateActionPrice4.mmMarketPrice}</li>
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
 * "CorporateActionPrice4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionPrice4", propOrder = {"indicativePrice", "marketPrice"})
public class CorporateActionPrice4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceFormat2Choice indicativePrice;
	/**
	 * Estimated price, eg, for valuation purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice
	 * PriceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4
	 * CorporateActionPrice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndctvPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Estimated price, eg, for valuation purposes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndicativePrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CorporateActionPrice.mmObject();
			componentContext_lazy = () -> CorporateActionPrice4.mmObject();
			isDerived = false;
			xmlTag = "IndctvPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicativePrice";
			definition = "Estimated price, eg, for valuation purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat2Choice.mmObject();
		}
	};
	protected PriceFormat2Choice marketPrice;
	/**
	 * Last reported/known price of a financial instrument in a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice
	 * PriceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4
	 * CorporateActionPrice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last reported/known price of a financial instrument in a market."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketPrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CorporateActionPrice.mmObject();
			componentContext_lazy = () -> CorporateActionPrice4.mmObject();
			isDerived = false;
			xmlTag = "MktPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			definition = "Last reported/known price of a financial instrument in a market.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPrice4.mmIndicativePrice, CorporateActionPrice4.mmMarketPrice);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice4";
				definition = "Specifies prices.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IndctvPric")
	public PriceFormat2Choice getIndicativePrice() {
		return indicativePrice;
	}

	public void setIndicativePrice(PriceFormat2Choice indicativePrice) {
		this.indicativePrice = indicativePrice;
	}

	@XmlElement(name = "MktPric")
	public PriceFormat2Choice getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(PriceFormat2Choice marketPrice) {
		this.marketPrice = marketPrice;
	}
}