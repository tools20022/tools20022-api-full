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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMAmount;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.GeneratedRepository;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * A number of monetary units specified in an active currency where the unit of
 * currency is explicit and compliant with ISO 4217. The number of fractional
 * digits (or minor unit of currency) is not checked as per ISO 4217: It must be
 * lesser than or equal to 13. Note: The decimal separator is a dot.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMAmount#getCurrencyIdentifierSet
 * currencyIdentifierSet} =
 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
 * ActiveCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMDecimal#getMinInclusive
 * minInclusive} = "0"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RestrictedFINActiveCurrencyAnd13DecimalAmount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217. The number of fractional digits (or minor unit of currency) is not checked as per ISO 4217: It must be lesser than or equal to 13.\nNote: The decimal separator is a dot."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"6545.56485"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType
public class RestrictedFINActiveCurrencyAnd13DecimalAmount {

	final static private AtomicReference<MMAmount> mmObject_lazy = new AtomicReference<>();
	@XmlValue
	protected BigDecimal amount;
	@XmlAttribute(name = "ccy", required = true)
	protected ActiveCurrencyCode currency;

	final static public MMAmount mmObject() {
		mmObject_lazy.compareAndSet(null, new MMAmount() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("6545.56485");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RestrictedFINActiveCurrencyAnd13DecimalAmount";
				definition = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217. The number of fractional digits (or minor unit of currency) is not checked as per ISO 4217: It must be lesser than or equal to 13.\nNote: The decimal separator is a dot.";
				currencyIdentifierSet_lazy = () -> ActiveCurrencyCode.mmObject();
				minInclusive = "0";
				totalDigits = 14;
				fractionDigits = 13;
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount() {
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount(BigDecimal amount, ActiveCurrencyCode currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setAmountAndCurrency(BigDecimal amount, ActiveCurrencyCode currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}