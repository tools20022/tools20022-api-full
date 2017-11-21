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
import com.tools20022.repository.choice.InterestRate8Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a multi-leg interest derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmInterestRate
 * DerivativeInterest3.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmFirstLegInterestRate
 * DerivativeInterest3.mmFirstLegInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmOtherNotionalCurrency
 * DerivativeInterest3.mmOtherNotionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmOtherLegInterestRate
 * DerivativeInterest3.mmOtherLegInterestRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "DerivativeInterest3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a multi-leg interest derivative."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DerivativeInterest3", propOrder = {"interestRate", "firstLegInterestRate", "otherNotionalCurrency", "otherLegInterestRate"})
public class DerivativeInterest3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FloatingInterestRate8 interestRate;
	/**
	 * Provides the interest rate in number of days, weeks, months or years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FloatingInterestRate8
	 * FloatingInterestRate8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3
	 * DerivativeInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the interest rate in number of days, weeks, months or years."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> DerivativeInterest3.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Provides the interest rate in number of days, weeks, months or years.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FloatingInterestRate8.mmObject();
		}
	};
	protected InterestRate8Choice firstLegInterestRate;
	/**
	 * Interest rate of the notional currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.InterestRate8Choice
	 * InterestRate8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3
	 * DerivativeInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstLegIntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstLegInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest rate of the notional currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFirstLegInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> DerivativeInterest3.mmObject();
			isDerived = false;
			xmlTag = "FrstLegIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstLegInterestRate";
			definition = "Interest rate of the notional currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRate8Choice.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode otherNotionalCurrency;
	/**
	 * Notional currency in which leg 2 of the contract is denominated, in case
	 * of multi-currency or cross-currency swaps.<br>
	 * <br>
	 * Notional currency in which leg 2 of the swap is denominated, in case of
	 * swaptions where the underlying swap is multi-currency.<br>
	 * <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrency
	 * Derivative.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3
	 * DerivativeInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrNtnlCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notional currency in which leg 2 of the contract is denominated, in case of multi-currency or cross-currency swaps.\r\n\r\nNotional currency in which leg 2 of the swap is denominated, in case of swaptions where the underlying swap is  multi-currency.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherNotionalCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrency;
			componentContext_lazy = () -> DerivativeInterest3.mmObject();
			isDerived = false;
			xmlTag = "OthrNtnlCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNotionalCurrency";
			definition = "Notional currency in which leg 2 of the contract is denominated, in case of multi-currency or cross-currency swaps.\r\n\r\nNotional currency in which leg 2 of the swap is denominated, in case of swaptions where the underlying swap is  multi-currency.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected InterestRate8Choice otherLegInterestRate;
	/**
	 * Indication of the interest rate used for leg 2, if applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.InterestRate8Choice
	 * InterestRate8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3
	 * DerivativeInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrLegIntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherLegInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of the interest rate used for leg 2, if applicable."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherLegInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> DerivativeInterest3.mmObject();
			isDerived = false;
			xmlTag = "OthrLegIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherLegInterestRate";
			definition = "Indication of the interest rate used for leg 2, if applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRate8Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DerivativeInterest3.mmInterestRate, DerivativeInterest3.mmFirstLegInterestRate, DerivativeInterest3.mmOtherNotionalCurrency, DerivativeInterest3.mmOtherLegInterestRate);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeInterest3";
				definition = "Specifies a multi-leg interest derivative.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IntrstRate", required = true)
	public FloatingInterestRate8 getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(com.tools20022.repository.msg.FloatingInterestRate8 interestRate) {
		this.interestRate = interestRate;
	}

	@XmlElement(name = "FrstLegIntrstRate")
	public InterestRate8Choice getFirstLegInterestRate() {
		return firstLegInterestRate;
	}

	public void setFirstLegInterestRate(InterestRate8Choice firstLegInterestRate) {
		this.firstLegInterestRate = firstLegInterestRate;
	}

	@XmlElement(name = "OthrNtnlCcy")
	public ActiveOrHistoricCurrencyCode getOtherNotionalCurrency() {
		return otherNotionalCurrency;
	}

	public void setOtherNotionalCurrency(ActiveOrHistoricCurrencyCode otherNotionalCurrency) {
		this.otherNotionalCurrency = otherNotionalCurrency;
	}

	@XmlElement(name = "OthrLegIntrstRate")
	public InterestRate8Choice getOtherLegInterestRate() {
		return otherLegInterestRate;
	}

	public void setOtherLegInterestRate(InterestRate8Choice otherLegInterestRate) {
		this.otherLegInterestRate = otherLegInterestRate;
	}
}