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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PriceFormat19Choice;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between an indicative price or a market price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice#mmIndicativePrice
 * IndicativeOrMarketPrice5Choice.mmIndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice#mmMarketPrice
 * IndicativeOrMarketPrice5Choice.mmMarketPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndicativeOrMarketPrice5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between an indicative price or a market price."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice7Choice
 * IndicativeOrMarketPrice7Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndicativeOrMarketPrice5Choice", propOrder = {"indicativePrice", "marketPrice"})
public class IndicativeOrMarketPrice5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IndctvPric", required = true)
	protected PriceFormat19Choice indicativePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat19Choice
	 * PriceFormat19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice
	 * IndicativeOrMarketPrice5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndctvPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Estimated price, for example, for valuation purposes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::INDC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice7Choice#mmIndicativePrice
	 * IndicativeOrMarketPrice7Choice.mmIndicativePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndicativeOrMarketPrice5Choice, PriceFormat19Choice> mmIndicativePrice = new MMMessageAssociationEnd<IndicativeOrMarketPrice5Choice, PriceFormat19Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice.mmObject();
			isDerived = false;
			xmlTag = "IndctvPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::INDC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicativePrice";
			definition = "Estimated price, for example, for valuation purposes.";
			nextVersions_lazy = () -> Arrays.asList(IndicativeOrMarketPrice7Choice.mmIndicativePrice);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PriceFormat19Choice.mmObject();
		}

		@Override
		public PriceFormat19Choice getValue(IndicativeOrMarketPrice5Choice obj) {
			return obj.getIndicativePrice();
		}

		@Override
		public void setValue(IndicativeOrMarketPrice5Choice obj, PriceFormat19Choice value) {
			obj.setIndicativePrice(value);
		}
	};
	@XmlElement(name = "MktPric", required = true)
	protected PriceFormat19Choice marketPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat19Choice
	 * PriceFormat19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice
	 * IndicativeOrMarketPrice5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last reported/known price of a financial instrument in a market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::MRKT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice7Choice#mmMarketPrice
	 * IndicativeOrMarketPrice7Choice.mmMarketPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndicativeOrMarketPrice5Choice, PriceFormat19Choice> mmMarketPrice = new MMMessageAssociationEnd<IndicativeOrMarketPrice5Choice, PriceFormat19Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice.mmObject();
			isDerived = false;
			xmlTag = "MktPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::MRKT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			definition = "Last reported/known price of a financial instrument in a market.";
			nextVersions_lazy = () -> Arrays.asList(IndicativeOrMarketPrice7Choice.mmMarketPrice);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PriceFormat19Choice.mmObject();
		}

		@Override
		public PriceFormat19Choice getValue(IndicativeOrMarketPrice5Choice obj) {
			return obj.getMarketPrice();
		}

		@Override
		public void setValue(IndicativeOrMarketPrice5Choice obj, PriceFormat19Choice value) {
			obj.setMarketPrice(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice.mmIndicativePrice, com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice.mmMarketPrice);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndicativeOrMarketPrice5Choice";
				definition = "Choice between an indicative price or a market price.";
				nextVersions_lazy = () -> Arrays.asList(IndicativeOrMarketPrice7Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PriceFormat19Choice getIndicativePrice() {
		return indicativePrice;
	}

	public IndicativeOrMarketPrice5Choice setIndicativePrice(PriceFormat19Choice indicativePrice) {
		this.indicativePrice = Objects.requireNonNull(indicativePrice);
		return this;
	}

	public PriceFormat19Choice getMarketPrice() {
		return marketPrice;
	}

	public IndicativeOrMarketPrice5Choice setMarketPrice(PriceFormat19Choice marketPrice) {
		this.marketPrice = Objects.requireNonNull(marketPrice);
		return this;
	}
}