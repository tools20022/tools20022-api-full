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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.TypeOfPrice27Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PriceValueAndRate4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money for which goods or services are offered, sold, or bought.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmCurrentPrice
 * PriceInformation10.mmCurrentPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation10#mmType
 * PriceInformation10.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmPreviousPrice
 * PriceInformation10.mmPreviousPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmAmountOfChange
 * PriceInformation10.mmAmountOfChange}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceInformation10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceInformation10", propOrder = {"currentPrice", "type", "previousPrice", "amountOfChange"})
public class PriceInformation10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurPric", required = true)
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount currentPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10
	 * PriceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current value of the price, eg, as a currency and value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation10, ActiveOrHistoricCurrencyAnd13DecimalAmount> mmCurrentPrice = new MMMessageAttribute<PriceInformation10, ActiveOrHistoricCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation10.mmObject();
			isDerived = false;
			xmlTag = "CurPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentPrice";
			definition = "Current value of the price, eg, as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAnd13DecimalAmount getValue(PriceInformation10 obj) {
			return obj.getCurrentPrice();
		}

		@Override
		public void setValue(PriceInformation10 obj, ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
			obj.setCurrentPrice(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected TypeOfPrice27Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice
	 * TypeOfPrice27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10
	 * PriceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of price and information about the price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation10, TypeOfPrice27Choice> mmType = new MMMessageAttribute<PriceInformation10, TypeOfPrice27Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation10.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of price and information about the price.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TypeOfPrice27Choice.mmObject();
		}

		@Override
		public TypeOfPrice27Choice getValue(PriceInformation10 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PriceInformation10 obj, TypeOfPrice27Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "PrvsPric")
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount previousPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10
	 * PriceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous value of the price, eg, as a currency and value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation10, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>> mmPreviousPrice = new MMMessageAttribute<PriceInformation10, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation10.mmObject();
			isDerived = false;
			xmlTag = "PrvsPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousPrice";
			definition = "Previous value of the price, eg, as a currency and value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getValue(PriceInformation10 obj) {
			return obj.getPreviousPrice();
		}

		@Override
		public void setValue(PriceInformation10 obj, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> value) {
			obj.setPreviousPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtOfChng")
	protected PriceValueAndRate4 amountOfChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PriceValueAndRate4
	 * PriceValueAndRate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10
	 * PriceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtOfChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::4!c//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOfChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference or change between the previous price value and the current price value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation10, Optional<PriceValueAndRate4>> mmAmountOfChange = new MMMessageAttribute<PriceInformation10, Optional<PriceValueAndRate4>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesPricing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation10.mmObject();
			isDerived = false;
			xmlTag = "AmtOfChng";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::4!c//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOfChange";
			definition = "Difference or change between the previous price value and the current price value.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValueAndRate4.mmObject();
		}

		@Override
		public Optional<PriceValueAndRate4> getValue(PriceInformation10 obj) {
			return obj.getAmountOfChange();
		}

		@Override
		public void setValue(PriceInformation10 obj, Optional<PriceValueAndRate4> value) {
			obj.setAmountOfChange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceInformation10.mmCurrentPrice, com.tools20022.repository.msg.PriceInformation10.mmType,
						com.tools20022.repository.msg.PriceInformation10.mmPreviousPrice, com.tools20022.repository.msg.PriceInformation10.mmAmountOfChange);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceInformation10";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAnd13DecimalAmount getCurrentPrice() {
		return currentPrice;
	}

	public PriceInformation10 setCurrentPrice(ActiveOrHistoricCurrencyAnd13DecimalAmount currentPrice) {
		this.currentPrice = Objects.requireNonNull(currentPrice);
		return this;
	}

	public TypeOfPrice27Choice getType() {
		return type;
	}

	public PriceInformation10 setType(TypeOfPrice27Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getPreviousPrice() {
		return previousPrice == null ? Optional.empty() : Optional.of(previousPrice);
	}

	public PriceInformation10 setPreviousPrice(ActiveOrHistoricCurrencyAnd13DecimalAmount previousPrice) {
		this.previousPrice = previousPrice;
		return this;
	}

	public Optional<PriceValueAndRate4> getAmountOfChange() {
		return amountOfChange == null ? Optional.empty() : Optional.of(amountOfChange);
	}

	public PriceInformation10 setAmountOfChange(PriceValueAndRate4 amountOfChange) {
		this.amountOfChange = amountOfChange;
		return this;
	}
}