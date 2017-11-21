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
import com.tools20022.repository.choice.TypeOfPrice32Choice;
import com.tools20022.repository.entity.Asset;
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
 * Details of breakdown of a quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmLotNumber
 * QuantityBreakdown39.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmLotQuantity
 * QuantityBreakdown39.mmLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmLotDateTime
 * QuantityBreakdown39.mmLotDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmLotPrice
 * QuantityBreakdown39.mmLotPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmTypeOfPrice
 * QuantityBreakdown39.mmTypeOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmAccountBaseCurrencyAmounts
 * QuantityBreakdown39.mmAccountBaseCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmInstrumentCurrencyAmounts
 * QuantityBreakdown39.mmInstrumentCurrencyAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmAlternateReportingCurrencyAmounts
 * QuantityBreakdown39.mmAlternateReportingCurrencyAmounts}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuantityBreakdown39"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of breakdown of a quantity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QuantityBreakdown39", propOrder = {"lotNumber", "lotQuantity", "lotDateTime", "lotPrice", "typeOfPrice", "accountBaseCurrencyAmounts", "instrumentCurrencyAmounts", "alternateReportingCurrencyAmounts"})
public class QuantityBreakdown39 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification39 lotNumber;
	/**
	 * Identification, for tax purposes, of a lot of identical securities that
	 * are bought at a certain date and at a certain price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification39
	 * GenericIdentification39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39
	 * QuantityBreakdown39}</li>
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
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLotNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotNumber;
			componentContext_lazy = () -> QuantityBreakdown39.mmObject();
			isDerived = false;
			xmlTag = "LotNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification39.mmObject();
		}
	};
	protected Balance11 lotQuantity;
	/**
	 * Quantity of financial instruments that is part of the lot described.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance11 Balance11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
	 * LotBreakdown.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39
	 * QuantityBreakdown39}</li>
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
			componentContext_lazy = () -> QuantityBreakdown39.mmObject();
			isDerived = false;
			xmlTag = "LotQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotQuantity";
			definition = "Quantity of financial instruments that is part of the lot described.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Balance11.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39
	 * QuantityBreakdown39}</li>
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
			componentContext_lazy = () -> QuantityBreakdown39.mmObject();
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
	protected Price3 lotPrice;
	/**
	 * Price at which the lot was purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price3 Price3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
	 * LotBreakdown.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39
	 * QuantityBreakdown39}</li>
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
			componentContext_lazy = () -> QuantityBreakdown39.mmObject();
			isDerived = false;
			xmlTag = "LotPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotPrice";
			definition = "Price at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price3.mmObject();
		}
	};
	protected TypeOfPrice32Choice typeOfPrice;
	/**
	 * Specifies the type of price and information about the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice32Choice
	 * TypeOfPrice32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39
	 * QuantityBreakdown39}</li>
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
			componentContext_lazy = () -> QuantityBreakdown39.mmObject();
			isDerived = false;
			xmlTag = "TpOfPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPrice";
			definition = "Specifies the type of price and information about the price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TypeOfPrice32Choice.mmObject();
		}
	};
	protected BalanceAmounts6 accountBaseCurrencyAmounts;
	/**
	 * Valuation amounts for the lot provided in the base currency of the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts6
	 * BalanceAmounts6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
	 * Asset.mmAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39
	 * QuantityBreakdown39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctBaseCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBaseCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts for the lot provided in the base currency of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountBaseCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetValue;
			componentContext_lazy = () -> QuantityBreakdown39.mmObject();
			isDerived = false;
			xmlTag = "AcctBaseCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBaseCurrencyAmounts";
			definition = "Valuation amounts for the lot provided in the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts6.mmObject();
		}
	};
	protected BalanceAmounts6 instrumentCurrencyAmounts;
	/**
	 * Valuation amounts for the lot provided in the currency of the financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts6
	 * BalanceAmounts6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
	 * Asset.mmAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39
	 * QuantityBreakdown39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts for the lot provided in the currency of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetValue;
			componentContext_lazy = () -> QuantityBreakdown39.mmObject();
			isDerived = false;
			xmlTag = "InstrmCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentCurrencyAmounts";
			definition = "Valuation amounts for the lot provided in the currency of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts6.mmObject();
		}
	};
	protected BalanceAmounts6 alternateReportingCurrencyAmounts;
	/**
	 * Valuation amounts for the lot provided in another currency than the base
	 * currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceAmounts6
	 * BalanceAmounts6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
	 * Asset.mmAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39
	 * QuantityBreakdown39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnRptgCcyAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateReportingCurrencyAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation amounts for the lot provided in another currency than the base currency of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAlternateReportingCurrencyAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetValue;
			componentContext_lazy = () -> QuantityBreakdown39.mmObject();
			isDerived = false;
			xmlTag = "AltrnRptgCcyAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateReportingCurrencyAmounts";
			definition = "Valuation amounts for the lot provided in another currency than the base currency of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BalanceAmounts6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QuantityBreakdown39.mmLotNumber, QuantityBreakdown39.mmLotQuantity, QuantityBreakdown39.mmLotDateTime, QuantityBreakdown39.mmLotPrice, QuantityBreakdown39.mmTypeOfPrice,
						QuantityBreakdown39.mmAccountBaseCurrencyAmounts, QuantityBreakdown39.mmInstrumentCurrencyAmounts, QuantityBreakdown39.mmAlternateReportingCurrencyAmounts);
				trace_lazy = () -> LotBreakdown.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityBreakdown39";
				definition = "Details of breakdown of a quantity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LotNb")
	public GenericIdentification39 getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(com.tools20022.repository.msg.GenericIdentification39 lotNumber) {
		this.lotNumber = lotNumber;
	}

	@XmlElement(name = "LotQty")
	public Balance11 getLotQuantity() {
		return lotQuantity;
	}

	public void setLotQuantity(com.tools20022.repository.msg.Balance11 lotQuantity) {
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
	public Price3 getLotPrice() {
		return lotPrice;
	}

	public void setLotPrice(com.tools20022.repository.msg.Price3 lotPrice) {
		this.lotPrice = lotPrice;
	}

	@XmlElement(name = "TpOfPric")
	public TypeOfPrice32Choice getTypeOfPrice() {
		return typeOfPrice;
	}

	public void setTypeOfPrice(TypeOfPrice32Choice typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
	}

	@XmlElement(name = "AcctBaseCcyAmts")
	public BalanceAmounts6 getAccountBaseCurrencyAmounts() {
		return accountBaseCurrencyAmounts;
	}

	public void setAccountBaseCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts6 accountBaseCurrencyAmounts) {
		this.accountBaseCurrencyAmounts = accountBaseCurrencyAmounts;
	}

	@XmlElement(name = "InstrmCcyAmts")
	public BalanceAmounts6 getInstrumentCurrencyAmounts() {
		return instrumentCurrencyAmounts;
	}

	public void setInstrumentCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts6 instrumentCurrencyAmounts) {
		this.instrumentCurrencyAmounts = instrumentCurrencyAmounts;
	}

	@XmlElement(name = "AltrnRptgCcyAmts")
	public BalanceAmounts6 getAlternateReportingCurrencyAmounts() {
		return alternateReportingCurrencyAmounts;
	}

	public void setAlternateReportingCurrencyAmounts(com.tools20022.repository.msg.BalanceAmounts6 alternateReportingCurrencyAmounts) {
		this.alternateReportingCurrencyAmounts = alternateReportingCurrencyAmounts;
	}
}