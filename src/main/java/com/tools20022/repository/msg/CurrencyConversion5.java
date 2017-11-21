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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Exchange rate and calculated amount to be presented to the customer when the
 * dispense currency or the deposit currency (target currency) is different to
 * account currency (source currency).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmSourceCurrency
 * CurrencyConversion5.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmSourceCurrencyNumeric
 * CurrencyConversion5.mmSourceCurrencyNumeric}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmTargetCurrency
 * CurrencyConversion5.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmTargetCurrencyNumeric
 * CurrencyConversion5.mmTargetCurrencyNumeric}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmRate
 * CurrencyConversion5.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmCalculatedAmount
 * CurrencyConversion5.mmCalculatedAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
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
 * "CurrencyConversion5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Exchange rate and calculated amount to be presented to the customer when the dispense currency or the deposit currency (target currency) is different to account currency (source currency)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
 * CurrencyConversion1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CurrencyConversion5", propOrder = {"sourceCurrency", "sourceCurrencyNumeric", "targetCurrency", "targetCurrencyNumeric", "rate", "calculatedAmount"})
public class CurrencyConversion5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyCode sourceCurrency;
	/**
	 * Currency from which the amount is converted (ISO 4217, 3 alphanumeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
	 * CurrencyExchange.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5
	 * CurrencyConversion5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency from which the amount is converted (ISO 4217, 3 alphanumeric characters)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrency
	 * CurrencyConversion1.mmSourceCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> CurrencyConversion5.mmObject();
			isDerived = false;
			xmlTag = "SrcCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrency";
			definition = "Currency from which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			previousVersion_lazy = () -> CurrencyConversion1.mmSourceCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ActiveCurrencyCode sourceCurrencyNumeric;
	/**
	 * Currency from which the amount is converted (ISO 4217, 3 numeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5
	 * CurrencyConversion5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcCcyNmrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrencyNumeric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency from which the amount is converted (ISO 4217, 3 numeric characters)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrencyNumeric
	 * CurrencyConversion1.mmSourceCurrencyNumeric}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceCurrencyNumeric = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion5.mmObject();
			isDerived = false;
			xmlTag = "SrcCcyNmrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrencyNumeric";
			definition = "Currency from which the amount is converted (ISO 4217, 3 numeric characters).";
			previousVersion_lazy = () -> CurrencyConversion1.mmSourceCurrencyNumeric;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ActiveCurrencyCode targetCurrency;
	/**
	 * Currency into which the amount is converted (ISO 4217, 3 alphanumeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5
	 * CurrencyConversion5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the amount is converted (ISO 4217, 3 alphanumeric characters)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrency
	 * CurrencyConversion1.mmTargetCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> CurrencyConversion5.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			previousVersion_lazy = () -> CurrencyConversion1.mmTargetCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected Exact3NumericText targetCurrencyNumeric;
	/**
	 * Currency into which the amount is converted (ISO 4217, 3 numeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5
	 * CurrencyConversion5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCcyNmrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrencyNumeric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the amount is converted (ISO 4217, 3 numeric characters)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrencyNumeric
	 * CurrencyConversion1.mmTargetCurrencyNumeric}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetCurrencyNumeric = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion5.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcyNmrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrencyNumeric";
			definition = "Currency into which the amount is converted (ISO 4217, 3 numeric characters).";
			previousVersion_lazy = () -> CurrencyConversion1.mmTargetCurrencyNumeric;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected BaseOneRate rate;
	/**
	 * Currency exchange rate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5
	 * CurrencyConversion5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmExchangeRate
	 * CurrencyConversion1.mmExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> CurrencyConversion5.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Currency exchange rate.";
			previousVersion_lazy = () -> CurrencyConversion1.mmExchangeRate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount calculatedAmount;
	/**
	 * Resulting calculated amount is in target currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmResultingAmount
	 * CurrencyExchange.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5
	 * CurrencyConversion5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resulting calculated amount is in target currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmResultingAmount
	 * CurrencyConversion1.mmResultingAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculatedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> CurrencyConversion5.mmObject();
			isDerived = false;
			xmlTag = "ClctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedAmount";
			definition = "Resulting calculated amount is in target currency.";
			previousVersion_lazy = () -> CurrencyConversion1.mmResultingAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CurrencyConversion5.mmSourceCurrency, CurrencyConversion5.mmSourceCurrencyNumeric, CurrencyConversion5.mmTargetCurrency, CurrencyConversion5.mmTargetCurrencyNumeric,
						CurrencyConversion5.mmRate, CurrencyConversion5.mmCalculatedAmount);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversion5";
				definition = "Exchange rate and calculated amount to be presented to the customer when the dispense currency or the deposit currency (target currency) is different to account currency (source currency).";
				previousVersion_lazy = () -> CurrencyConversion1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SrcCcy", required = true)
	public ActiveCurrencyCode getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(ActiveCurrencyCode sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	@XmlElement(name = "SrcCcyNmrc", required = true)
	public ActiveCurrencyCode getSourceCurrencyNumeric() {
		return sourceCurrencyNumeric;
	}

	public void setSourceCurrencyNumeric(ActiveCurrencyCode sourceCurrencyNumeric) {
		this.sourceCurrencyNumeric = sourceCurrencyNumeric;
	}

	@XmlElement(name = "TrgtCcy", required = true)
	public ActiveCurrencyCode getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(ActiveCurrencyCode targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	@XmlElement(name = "TrgtCcyNmrc", required = true)
	public Exact3NumericText getTargetCurrencyNumeric() {
		return targetCurrencyNumeric;
	}

	public void setTargetCurrencyNumeric(Exact3NumericText targetCurrencyNumeric) {
		this.targetCurrencyNumeric = targetCurrencyNumeric;
	}

	@XmlElement(name = "Rate", required = true)
	public BaseOneRate getRate() {
		return rate;
	}

	public void setRate(BaseOneRate rate) {
		this.rate = rate;
	}

	@XmlElement(name = "ClctdAmt", required = true)
	public ImpliedCurrencyAndAmount getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(ImpliedCurrencyAndAmount calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}
}