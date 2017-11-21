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
import com.tools20022.repository.choice.TypeOfPrice31Choice;
import com.tools20022.repository.codeset.PriceMethod1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmType
 * UnitPrice21.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmValue
 * UnitPrice21.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmPriceMethod
 * UnitPrice21.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice21#mmAccruedInterestNAV
 * UnitPrice21.mmAccruedInterestNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice21#mmNumberOfDaysAccrued
 * UnitPrice21.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice21#mmTaxableIncomePerShare
 * UnitPrice21.mmTaxableIncomePerShare}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
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
 * "UnitPrice21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.UnitPrice12
 * UnitPrice12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UnitPrice21", propOrder = {"type", "value", "priceMethod", "accruedInterestNAV", "numberOfDaysAccrued", "taxableIncomePerShare"})
public class UnitPrice21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TypeOfPrice31Choice type;
	/**
	 * Type and information about a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice
	 * TypeOfPrice31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21 UnitPrice21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmType
	 * UnitPrice12.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> UnitPrice21.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type and information about a price.";
			previousVersion_lazy = () -> UnitPrice12.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TypeOfPrice31Choice.mmObject();
		}
	};
	protected PriceValue1 value;
	/**
	 * Value of the price, for example, as a currency and value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue1
	 * PriceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21 UnitPrice21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, for example, as a currency and value."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmValue
	 * UnitPrice12.mmValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> UnitPrice21.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Value of the price, for example, as a currency and value.";
			previousVersion_lazy = () -> UnitPrice12.mmValue;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue1.mmObject();
		}
	};
	protected PriceMethod1Code priceMethod;
	/**
	 * Type of pricing calculation method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceMethod1Code
	 * PriceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceMethod
	 * SecuritiesPricing.mmPriceMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21 UnitPrice21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of pricing calculation method."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmPriceMethod
	 * UnitPrice12.mmPriceMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceMethod;
			componentContext_lazy = () -> UnitPrice21.mmObject();
			isDerived = false;
			xmlTag = "PricMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			previousVersion_lazy = () -> UnitPrice12.mmPriceMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceMethod1Code.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount accruedInterestNAV;
	/**
	 * Interest that has accumulated between the most recent payment of interest
	 * and the sale of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21 UnitPrice21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest that has accumulated between the most recent payment of interest and the sale of the financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmAccruedInterestNAV
	 * UnitPrice12.mmAccruedInterestNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> UnitPrice21.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestNAV";
			definition = "Interest that has accumulated between the most recent payment of interest and the sale of the financial instrument.";
			previousVersion_lazy = () -> UnitPrice12.mmAccruedInterestNAV;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected Number numberOfDaysAccrued;
	/**
	 * Specifies the number of days used for calculating the accrued interest
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21 UnitPrice21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for calculating the accrued interest amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmNumberOfDaysAccrued
	 * UnitPrice12.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> UnitPrice21.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			previousVersion_lazy = () -> UnitPrice12.mmNumberOfDaysAccrued;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount taxableIncomePerShare;
	/**
	 * Amount included in the NAV that corresponds to gains directly or
	 * indirectly derived from interest payment in the scope of the European
	 * Directive on taxation of savings income in the form of interest payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShare
	 * SecuritiesTax.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21 UnitPrice21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmTaxableIncomePerShare
	 * UnitPrice12.mmTaxableIncomePerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxableIncomePerShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShare;
			componentContext_lazy = () -> UnitPrice21.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			previousVersion_lazy = () -> UnitPrice12.mmTaxableIncomePerShare;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnitPrice21.mmType, UnitPrice21.mmValue, UnitPrice21.mmPriceMethod, UnitPrice21.mmAccruedInterestNAV, UnitPrice21.mmNumberOfDaysAccrued, UnitPrice21.mmTaxableIncomePerShare);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitPrice21";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
				previousVersion_lazy = () -> UnitPrice12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public TypeOfPrice31Choice getType() {
		return type;
	}

	public void setType(TypeOfPrice31Choice type) {
		this.type = type;
	}

	@XmlElement(name = "Val", required = true)
	public PriceValue1 getValue() {
		return value;
	}

	public void setValue(com.tools20022.repository.msg.PriceValue1 value) {
		this.value = value;
	}

	@XmlElement(name = "PricMtd")
	public PriceMethod1Code getPriceMethod() {
		return priceMethod;
	}

	public void setPriceMethod(PriceMethod1Code priceMethod) {
		this.priceMethod = priceMethod;
	}

	@XmlElement(name = "AcrdIntrstNAV")
	public ActiveOrHistoricCurrencyAndAmount getAccruedInterestNAV() {
		return accruedInterestNAV;
	}

	public void setAccruedInterestNAV(ActiveOrHistoricCurrencyAndAmount accruedInterestNAV) {
		this.accruedInterestNAV = accruedInterestNAV;
	}

	@XmlElement(name = "NbOfDaysAcrd")
	public Number getNumberOfDaysAccrued() {
		return numberOfDaysAccrued;
	}

	public void setNumberOfDaysAccrued(Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
	}

	@XmlElement(name = "TaxblIncmPerShr")
	public ActiveCurrencyAnd13DecimalAmount getTaxableIncomePerShare() {
		return taxableIncomePerShare;
	}

	public void setTaxableIncomePerShare(ActiveCurrencyAnd13DecimalAmount taxableIncomePerShare) {
		this.taxableIncomePerShare = taxableIncomePerShare;
	}
}