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
import com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price6;
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
 * Aggregated position of holdings held in a securities account for a specified
 * financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#mmItemDate
 * FinancialInstrumentAggregateBalance1.mmItemDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#mmHoldings
 * FinancialInstrumentAggregateBalance1.mmHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#mmPrice
 * FinancialInstrumentAggregateBalance1.mmPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AssetHolding
 * AssetHolding}</li>
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
 * "FinancialInstrumentAggregateBalance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Aggregated position of holdings held in a securities account for a specified financial instrument."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAggregateBalance1", propOrder = {"itemDate", "holdings", "price"})
public class FinancialInstrumentAggregateBalance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ItmDt", required = true)
	protected ISODate itemDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmValueDate
	 * Balance.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1
	 * FinancialInstrumentAggregateBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the line of holding in the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAggregateBalance1, ISODate> mmItemDate = new MMMessageAttribute<FinancialInstrumentAggregateBalance1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Balance.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.mmObject();
			isDerived = false;
			xmlTag = "ItmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemDate";
			definition = "Date of the line of holding in the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(FinancialInstrumentAggregateBalance1 obj) {
			return obj.getItemDate();
		}

		@Override
		public void setValue(FinancialInstrumentAggregateBalance1 obj, ISODate value) {
			obj.setItemDate(value);
		}
	};
	@XmlElement(name = "Hldgs", required = true)
	protected FinancialInstrumentAggregateBalance1Choice holdings;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice
	 * FinancialInstrumentAggregateBalance1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1
	 * FinancialInstrumentAggregateBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hldgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Holdings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balances and sub-balances attributed to the holding."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAggregateBalance1, FinancialInstrumentAggregateBalance1Choice> mmHoldings = new MMMessageAssociationEnd<FinancialInstrumentAggregateBalance1, FinancialInstrumentAggregateBalance1Choice>() {
		{
			businessComponentTrace_lazy = () -> AssetHolding.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.mmObject();
			isDerived = false;
			xmlTag = "Hldgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Holdings";
			definition = "Balances and sub-balances attributed to the holding.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAggregateBalance1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentAggregateBalance1Choice getValue(FinancialInstrumentAggregateBalance1 obj) {
			return obj.getHoldings();
		}

		@Override
		public void setValue(FinancialInstrumentAggregateBalance1 obj, FinancialInstrumentAggregateBalance1Choice value) {
			obj.setHoldings(value);
		}
	};
	@XmlElement(name = "Pric")
	protected List<Price6> price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price6 Price6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1
	 * FinancialInstrumentAggregateBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details on the price value, type and source."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAggregateBalance1, List<Price6>> mmPrice = new MMMessageAssociationEnd<FinancialInstrumentAggregateBalance1, List<Price6>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesPricing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Details on the price value, type and source.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price6.mmObject();
		}

		@Override
		public List<Price6> getValue(FinancialInstrumentAggregateBalance1 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(FinancialInstrumentAggregateBalance1 obj, List<Price6> value) {
			obj.setPrice(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.mmItemDate, com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.mmHoldings,
						com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.mmPrice);
				trace_lazy = () -> AssetHolding.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAggregateBalance1";
				definition = "Aggregated position of holdings held in a securities account for a specified financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getItemDate() {
		return itemDate;
	}

	public FinancialInstrumentAggregateBalance1 setItemDate(ISODate itemDate) {
		this.itemDate = Objects.requireNonNull(itemDate);
		return this;
	}

	public FinancialInstrumentAggregateBalance1Choice getHoldings() {
		return holdings;
	}

	public FinancialInstrumentAggregateBalance1 setHoldings(FinancialInstrumentAggregateBalance1Choice holdings) {
		this.holdings = Objects.requireNonNull(holdings);
		return this;
	}

	public List<Price6> getPrice() {
		return price == null ? price = new ArrayList<>() : price;
	}

	public FinancialInstrumentAggregateBalance1 setPrice(List<Price6> price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}
}