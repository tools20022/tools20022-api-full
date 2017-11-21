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
import com.tools20022.repository.area.camt.PayInScheduleV03;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Factors used in the calculation of the pay in schedule.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayInFactors1#mmAggregateShortPositionLimit
 * PayInFactors1.mmAggregateShortPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayInFactors1#mmCurrencyFactors
 * PayInFactors1.mmCurrencyFactors}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPayInFactors
 * PayInScheduleV03.mmPayInFactors}</li>
 * </ul>
 * </li>
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
 * "PayInFactors1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Factors used in the calculation of the pay in schedule."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PayInFactors1", propOrder = {"aggregateShortPositionLimit", "currencyFactors"})
public class PayInFactors1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount aggregateShortPositionLimit;
	/**
	 * Maximum allowed sum of short positions in all currencies, converted to
	 * base currency, during settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayInFactors1 PayInFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtShrtPosLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateShortPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum allowed sum of short positions in all currencies, converted to base currency, during settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAggregateShortPositionLimit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PayInFactors1.mmObject();
			isDerived = false;
			xmlTag = "AggtShrtPosLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateShortPositionLimit";
			definition = "Maximum allowed sum of short positions in all currencies, converted to base currency, during settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CurrencyFactors1> currencyFactors;
	/**
	 * Currency specific pay-in factors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1
	 * CurrencyFactors1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayInFactors1 PayInFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyFctrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyFactors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency specific pay-in factors."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyFactors = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PayInFactors1.mmObject();
			isDerived = false;
			xmlTag = "CcyFctrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyFactors";
			definition = "Currency specific pay-in factors.";
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.CurrencyFactors1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PayInFactors1.mmAggregateShortPositionLimit, PayInFactors1.mmCurrencyFactors);
				messageBuildingBlock_lazy = () -> Arrays.asList(PayInScheduleV03.mmPayInFactors);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PayInFactors1";
				definition = "Factors used in the calculation of the pay in schedule.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AggtShrtPosLmt", required = true)
	public ActiveCurrencyAndAmount getAggregateShortPositionLimit() {
		return aggregateShortPositionLimit;
	}

	public void setAggregateShortPositionLimit(ActiveCurrencyAndAmount aggregateShortPositionLimit) {
		this.aggregateShortPositionLimit = aggregateShortPositionLimit;
	}

	@XmlElement(name = "CcyFctrs", required = true)
	public List<CurrencyFactors1> getCurrencyFactors() {
		return currencyFactors;
	}

	public void setCurrencyFactors(List<com.tools20022.repository.msg.CurrencyFactors1> currencyFactors) {
		this.currencyFactors = currencyFactors;
	}
}