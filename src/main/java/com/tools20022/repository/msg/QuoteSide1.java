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
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.choice.PartyIdentification25Choice;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Quote;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates whether the quote details are indicated as an offer, a bid or a mid
 * of a security, commodity, currency (the latter being an average of the offer
 * and the bid).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmPrice
 * QuoteSide1.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmMarketPrice
 * QuoteSide1.mmMarketPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmMinimumQuantity
 * QuoteSide1.mmMinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmQuantity
 * QuoteSide1.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmMaximumQuantity
 * QuoteSide1.mmMaximumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmSourceOfQuote
 * QuoteSide1.mmSourceOfQuote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteSide1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMaximumQuantityOrQuantityGuideline#forQuoteSide1
 * ConstraintMaximumQuantityOrQuantityGuideline.forQuoteSide1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMidSideRule#forQuoteSide1
 * ConstraintMidSideRule.forQuoteSide1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 132,133, 631</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuoteSide1", propOrder = {"price", "marketPrice", "minimumQuantity", "quantity", "maximumQuantity", "sourceOfQuote"})
public class QuoteSide1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pric", required = true)
	protected Price1 price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPrice Quote.mmPrice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the price of the instrument, applicable to the quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 132, FIXSynonym: 133, FIXSynonym: 631</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteSide1, Price1> mmPrice = new MMMessageAttribute<QuoteSide1, Price1>() {
		{
			businessElementTrace_lazy = () -> Quote.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "132"), new FIXSynonym(this, "133"), new FIXSynonym(this, "631"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Price1 getValue(QuoteSide1 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(QuoteSide1 obj, Price1 value) {
			obj.setPrice(value);
		}
	};
	@XmlElement(name = "MktPric")
	protected List<Price1> marketPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
	 * Quote.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used by markets to indicate the current best bid and offer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 645, FIXSynonym: 646</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteSide1, List<Price1>> mmMarketPrice = new MMMessageAttribute<QuoteSide1, List<Price1>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmMarketPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "MktPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "645"), new FIXSynonym(this, "646"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			definition = "Used by markets to indicate the current best bid and offer.";
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public List<Price1> getValue(QuoteSide1 obj) {
			return obj.getMarketPrice();
		}

		@Override
		public void setValue(QuoteSide1 obj, List<Price1> value) {
			obj.setMarketPrice(value);
		}
	};
	@XmlElement(name = "MinQty")
	protected List<FinancialInstrumentQuantityChoice> minimumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMinimumQuantity
	 * Quote.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimal quantity of the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 647, FIXSynonym: 648</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteSide1, List<FinancialInstrumentQuantityChoice>> mmMinimumQuantity = new MMMessageAttribute<QuoteSide1, List<FinancialInstrumentQuantityChoice>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmMinimumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "MinQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "647"), new FIXSynonym(this, "648"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantity";
			definition = "Specifies the minimal quantity of the financial instrument.";
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public List<FinancialInstrumentQuantityChoice> getValue(QuoteSide1 obj) {
			return obj.getMinimumQuantity();
		}

		@Override
		public void setValue(QuoteSide1 obj, List<FinancialInstrumentQuantityChoice> value) {
			obj.setMinimumQuantity(value);
		}
	};
	@XmlElement(name = "Qty")
	protected FinancialInstrumentQuantityChoice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuantity
	 * Quote.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of a Financial Instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 134, FIXSynonym: 135</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteSide1, Optional<FinancialInstrumentQuantityChoice>> mmQuantity = new MMMessageAttribute<QuoteSide1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "134"), new FIXSynonym(this, "135"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of a Financial Instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(QuoteSide1 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(QuoteSide1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxQty")
	protected FinancialInstrumentQuantityChoice maximumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMaximumQuantity
	 * Quote.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the maximum quantity of the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 134, FIXSynonym: 135</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteSide1, Optional<FinancialInstrumentQuantityChoice>> mmMaximumQuantity = new MMMessageAttribute<QuoteSide1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmMaximumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "MaxQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "134"), new FIXSynonym(this, "135"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantity";
			definition = "Specifies the maximum quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(QuoteSide1 obj) {
			return obj.getMaximumQuantity();
		}

		@Override
		public void setValue(QuoteSide1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setMaximumQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "SrcOfQt")
	protected PartyIdentification25Choice sourceOfQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification25Choice
	 * PartyIdentification25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfQt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Source of the quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteSide1, Optional<PartyIdentification25Choice>> mmSourceOfQuote = new MMMessageAssociationEnd<QuoteSide1, Optional<PartyIdentification25Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "SrcOfQt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfQuote";
			definition = "Source of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification25Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification25Choice> getValue(QuoteSide1 obj) {
			return obj.getSourceOfQuote();
		}

		@Override
		public void setValue(QuoteSide1 obj, Optional<PartyIdentification25Choice> value) {
			obj.setSourceOfQuote(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteSide1.mmPrice, com.tools20022.repository.msg.QuoteSide1.mmMarketPrice, com.tools20022.repository.msg.QuoteSide1.mmMinimumQuantity,
						com.tools20022.repository.msg.QuoteSide1.mmQuantity, com.tools20022.repository.msg.QuoteSide1.mmMaximumQuantity, com.tools20022.repository.msg.QuoteSide1.mmSourceOfQuote);
				trace_lazy = () -> Quote.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMaximumQuantityOrQuantityGuideline.forQuoteSide1, com.tools20022.repository.constraints.ConstraintMidSideRule.forQuoteSide1);
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "132,133, 631"));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuoteSide1";
				definition = "Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid).";
			}
		});
		return mmObject_lazy.get();
	}

	public Price1 getPrice() {
		return price;
	}

	public QuoteSide1 setPrice(Price1 price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public List<Price1> getMarketPrice() {
		return marketPrice == null ? marketPrice = new ArrayList<>() : marketPrice;
	}

	public QuoteSide1 setMarketPrice(List<Price1> marketPrice) {
		this.marketPrice = Objects.requireNonNull(marketPrice);
		return this;
	}

	public List<FinancialInstrumentQuantityChoice> getMinimumQuantity() {
		return minimumQuantity == null ? minimumQuantity = new ArrayList<>() : minimumQuantity;
	}

	public QuoteSide1 setMinimumQuantity(List<FinancialInstrumentQuantityChoice> minimumQuantity) {
		this.minimumQuantity = Objects.requireNonNull(minimumQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public QuoteSide1 setQuantity(FinancialInstrumentQuantityChoice quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getMaximumQuantity() {
		return maximumQuantity == null ? Optional.empty() : Optional.of(maximumQuantity);
	}

	public QuoteSide1 setMaximumQuantity(FinancialInstrumentQuantityChoice maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
		return this;
	}

	public Optional<PartyIdentification25Choice> getSourceOfQuote() {
		return sourceOfQuote == null ? Optional.empty() : Optional.of(sourceOfQuote);
	}

	public QuoteSide1 setSourceOfQuote(PartyIdentification25Choice sourceOfQuote) {
		this.sourceOfQuote = sourceOfQuote;
		return this;
	}
}