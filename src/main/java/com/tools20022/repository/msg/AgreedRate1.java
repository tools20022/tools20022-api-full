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
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02;
import com.tools20022.repository.area.trea.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information needed to process a currency exchange or conversion.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#mmExchangeRate
 * AgreedRate1.mmExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#mmUnitCurrency
 * AgreedRate1.mmUnitCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#mmQuotedCurrency
 * AgreedRate1.mmQuotedCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02#mmAgreedRate
 * ForeignExchangeTradeInstructionAmendmentV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02#mmAgreedRate
 * ForeignExchangeTradeInstructionCancellationV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmAgreedRate
 * ForeignExchangeTradeInstructionV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmAgreedRate
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmAgreedRate
 * CreateNonDeliverableForwardOpeningV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardOpeningV02#mmAgreedRate
 * AmendNonDeliverableForwardOpeningV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmAgreedRate
 * CancelNonDeliverableForwardOpeningV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmValuationRate
 * CreateNonDeliverableForwardValuationV02.mmValuationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardValuationV02#mmValuationRate
 * AmendNonDeliverableForwardValuationV02.mmValuationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardValuationV02#mmValuationRate
 * CancelNonDeliverableForwardValuationV02.mmValuationRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgreedRate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed to process a currency exchange or conversion."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3 AgreedRate3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgreedRate1", propOrder = {"exchangeRate", "unitCurrency", "quotedCurrency"})
public class AgreedRate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XchgRate", required = true)
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgreedRate1 AgreedRate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#mmExchangeRate
	 * AgreedRate3.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AgreedRate1.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			nextVersions_lazy = () -> Arrays.asList(AgreedRate3.mmExchangeRate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	@XmlElement(name = "UnitCcy")
	protected CurrencyCode unitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
	 * CurrencyExchange.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgreedRate1 AgreedRate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#mmUnitCurrency
	 * AgreedRate3.mmUnitCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmUnitCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AgreedRate1.mmObject();
			isDerived = false;
			xmlTag = "UnitCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			nextVersions_lazy = () -> Arrays.asList(AgreedRate3.mmUnitCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "QtdCcy")
	protected CurrencyCode quotedCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
	 * CurrencyExchange.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgreedRate1 AgreedRate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtdCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedRate3#mmQuotedCurrency
	 * AgreedRate3.mmQuotedCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuotedCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotedCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AgreedRate1.mmObject();
			isDerived = false;
			xmlTag = "QtdCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			nextVersions_lazy = () -> Arrays.asList(AgreedRate3.mmQuotedCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AgreedRate1.mmExchangeRate, com.tools20022.repository.msg.AgreedRate1.mmUnitCurrency, com.tools20022.repository.msg.AgreedRate1.mmQuotedCurrency);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionAmendmentV02.mmAgreedRate, ForeignExchangeTradeInstructionCancellationV02.mmAgreedRate, ForeignExchangeTradeInstructionV02.mmAgreedRate,
						ForeignExchangeTradeStatusAndDetailsNotificationV02.mmAgreedRate, CreateNonDeliverableForwardOpeningV02.mmAgreedRate, AmendNonDeliverableForwardOpeningV02.mmAgreedRate,
						CancelNonDeliverableForwardOpeningV02.mmAgreedRate, CreateNonDeliverableForwardValuationV02.mmValuationRate, AmendNonDeliverableForwardValuationV02.mmValuationRate,
						CancelNonDeliverableForwardValuationV02.mmValuationRate);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AgreedRate1";
				definition = "Information needed to process a currency exchange or conversion.";
				nextVersions_lazy = () -> Arrays.asList(AgreedRate3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public AgreedRate1 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public Optional<CurrencyCode> getUnitCurrency() {
		return unitCurrency == null ? Optional.empty() : Optional.of(unitCurrency);
	}

	public AgreedRate1 setUnitCurrency(CurrencyCode unitCurrency) {
		this.unitCurrency = unitCurrency;
		return this;
	}

	public Optional<CurrencyCode> getQuotedCurrency() {
		return quotedCurrency == null ? Optional.empty() : Optional.of(quotedCurrency);
	}

	public AgreedRate1 setQuotedCurrency(CurrencyCode quotedCurrency) {
		this.quotedCurrency = quotedCurrency;
		return this;
	}
}