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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.Number1Choice;
import com.tools20022.repository.choice.TypeOfPrice1Choice;
import com.tools20022.repository.entity.LotBreakdown;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transaction between two counterparties in which they agree to buy and sell a
 * financial instrument. A trade transaction occurs with the matching of the two
 * counterparties orders. There could be several trade transactions necessary to
 * execute the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmLotNumber
 * QuantityBreakDown1.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmLotQuantity
 * QuantityBreakDown1.mmLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmLotDateTime
 * QuantityBreakDown1.mmLotDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmLotPrice
 * QuantityBreakDown1.mmLotPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmTypeOfPrice
 * QuantityBreakDown1.mmTypeOfPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.LotBreakdown
 * LotBreakdown}</li>
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
 * "QuantityBreakDown1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QuantityBreakDown1", propOrder = {"lotNumber", "lotQuantity", "lotDateTime", "lotPrice", "typeOfPrice"})
public class QuantityBreakDown1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number1Choice lotNumber;
	/**
	 * Number identifying a lot constituting the financial instrument
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Number1Choice Number1Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1
	 * QuantityBreakDown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a lot constituting the financial instrument"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLotNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotNumber;
			componentContext_lazy = () -> QuantityBreakDown1.mmObject();
			isDerived = false;
			xmlTag = "LotNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotNumber";
			definition = "Number identifying a lot constituting the financial instrument";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Number1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice lotQuantity;
	/**
	 * Quantity of financial instruments that is part of the lot described.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
	 * LotBreakdown.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1
	 * QuantityBreakDown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instruments that is part of the lot described."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmSecuritiesQuantity;
			componentContext_lazy = () -> QuantityBreakDown1.mmObject();
			isDerived = false;
			xmlTag = "LotQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotQuantity";
			definition = "Quantity of financial instruments that is part of the lot described.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice lotDateTime;
	/**
	 * Date/time at which the lot was purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotDateTime
	 * LotBreakdown.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1
	 * QuantityBreakDown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the lot was purchased."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLotDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotDateTime;
			componentContext_lazy = () -> QuantityBreakDown1.mmObject();
			isDerived = false;
			xmlTag = "LotDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotDateTime";
			definition = "Date/time at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Price2 lotPrice;
	/**
	 * Price at which the lot was purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
	 * LotBreakdown.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1
	 * QuantityBreakDown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the lot was purchased."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotPrice;
			componentContext_lazy = () -> QuantityBreakDown1.mmObject();
			isDerived = false;
			xmlTag = "LotPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotPrice";
			definition = "Price at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price2.mmObject();
		}
	};
	protected TypeOfPrice1Choice typeOfPrice;
	/**
	 * Specifies the type of price and information about the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice1Choice
	 * TypeOfPrice1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1
	 * QuantityBreakDown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of price and information about the price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeOfPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> QuantityBreakDown1.mmObject();
			isDerived = false;
			xmlTag = "TpOfPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPrice";
			definition = "Specifies the type of price and information about the price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TypeOfPrice1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QuantityBreakDown1.mmLotNumber, QuantityBreakDown1.mmLotQuantity, QuantityBreakDown1.mmLotDateTime, QuantityBreakDown1.mmLotPrice, QuantityBreakDown1.mmTypeOfPrice);
				trace_lazy = () -> LotBreakdown.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuantityBreakDown1";
				definition = "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LotNb")
	public Number1Choice getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(Number1Choice lotNumber) {
		this.lotNumber = lotNumber;
	}

	@XmlElement(name = "LotQty")
	public FinancialInstrumentQuantity1Choice getLotQuantity() {
		return lotQuantity;
	}

	public void setLotQuantity(FinancialInstrumentQuantity1Choice lotQuantity) {
		this.lotQuantity = lotQuantity;
	}

	@XmlElement(name = "LotDtTm")
	public DateAndDateTimeChoice getLotDateTime() {
		return lotDateTime;
	}

	public void setLotDateTime(DateAndDateTimeChoice lotDateTime) {
		this.lotDateTime = lotDateTime;
	}

	@XmlElement(name = "LotPric")
	public Price2 getLotPrice() {
		return lotPrice;
	}

	public void setLotPrice(com.tools20022.repository.msg.Price2 lotPrice) {
		this.lotPrice = lotPrice;
	}

	@XmlElement(name = "TpOfPric")
	public TypeOfPrice1Choice getTypeOfPrice() {
		return typeOfPrice;
	}

	public void setTypeOfPrice(TypeOfPrice1Choice typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
	}
}