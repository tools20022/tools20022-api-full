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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.RestrictedMonthExact2Number;
import com.tools20022.repository.entity.CreditDefaultSwap;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Credit default swap derivative specific for reporting derivatives on a credit
 * default swap index.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmSeries
 * CreditDefaultSwapIndex2.mmSeries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmVersion
 * CreditDefaultSwapIndex2.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmRollMonth
 * CreditDefaultSwapIndex2.mmRollMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmNextRollDate
 * CreditDefaultSwapIndex2.mmNextRollDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmNotionalCurrency
 * CreditDefaultSwapIndex2.mmNotionalCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
 * CreditDefaultSwap}</li>
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
 * "CreditDefaultSwapIndex2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Credit default swap derivative specific for reporting derivatives on a credit default swap index."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CreditDefaultSwapIndex2", propOrder = {"series", "version", "rollMonth", "nextRollDate", "notionalCurrency"})
public class CreditDefaultSwapIndex2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number series;
	/**
	 * Series number of the composition of the index if applicable.
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
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap#mmSeries
	 * CreditDefaultSwap.mmSeries}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
	 * CreditDefaultSwapIndex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Srs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Series"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Series number of the composition of the index if applicable."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeries = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CreditDefaultSwap.mmSeries;
			componentContext_lazy = () -> CreditDefaultSwapIndex2.mmObject();
			isDerived = false;
			xmlTag = "Srs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Series";
			definition = "Series number of the composition of the index if applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number version;
	/**
	 * New version of a series is issued if one of the constituents defaults and
	 * the index has to be re-weighted to account for the new number of total
	 * constituents within the index.
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
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmVersionNumber
	 * Derivative.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
	 * CreditDefaultSwapIndex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New version of a series is issued if one of the constituents defaults and the index has to be re-weighted to account for the new number of total constituents within the index."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmVersionNumber;
			componentContext_lazy = () -> CreditDefaultSwapIndex2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "New version of a series is issued if one of the constituents defaults and the index has to be re-weighted to account for the new number of total constituents within the index.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<RestrictedMonthExact2Number> rollMonth;
	/**
	 * All months when the roll is expected as established by the index provider
	 * for a given year. Field should be repeated for each month in the roll.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedMonthExact2Number
	 * RestrictedMonthExact2Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
	 * CreditDefaultSwapIndex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RollMnth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All months when the roll is expected as established by the index provider for a given year. Field should be repeated for each month in the roll."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRollMonth = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CreditDefaultSwapIndex2.mmObject();
			isDerived = false;
			xmlTag = "RollMnth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RollMonth";
			definition = "All months when the roll is expected as established by the index provider for a given year. Field should be repeated for each month in the roll.";
			maxOccurs = 12;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedMonthExact2Number.mmObject();
		}
	};
	protected ISODate nextRollDate;
	/**
	 * To be populated in the case of a CDS Index or a derivative CDS Index with
	 * the next roll date of the index as established by the index provider.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap#mmRollDate
	 * CreditDefaultSwap.mmRollDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
	 * CreditDefaultSwapIndex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtRollDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextRollDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To be populated in the case of a CDS Index or a derivative CDS Index with the next roll date of the index as established by the index provider."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextRollDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CreditDefaultSwap.mmRollDate;
			componentContext_lazy = () -> CreditDefaultSwapIndex2.mmObject();
			isDerived = false;
			xmlTag = "NxtRollDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextRollDate";
			definition = "To be populated in the case of a CDS Index or a derivative CDS Index with the next roll date of the index as established by the index provider.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode notionalCurrency;
	/**
	 * Currency in which the notional is denominated.<br>
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
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
	 * CreditDefaultSwapIndex2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the notional is denominated.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrency;
			componentContext_lazy = () -> CreditDefaultSwapIndex2.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency in which the notional is denominated.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CreditDefaultSwapIndex2.mmSeries, CreditDefaultSwapIndex2.mmVersion, CreditDefaultSwapIndex2.mmRollMonth, CreditDefaultSwapIndex2.mmNextRollDate,
						CreditDefaultSwapIndex2.mmNotionalCurrency);
				trace_lazy = () -> CreditDefaultSwap.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwapIndex2";
				definition = "Credit default swap derivative specific for reporting derivatives on a credit default swap index.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Srs")
	public Number getSeries() {
		return series;
	}

	public void setSeries(Number series) {
		this.series = series;
	}

	@XmlElement(name = "Vrsn")
	public Number getVersion() {
		return version;
	}

	public void setVersion(Number version) {
		this.version = version;
	}

	@XmlElement(name = "RollMnth")
	public List<RestrictedMonthExact2Number> getRollMonth() {
		return rollMonth;
	}

	public void setRollMonth(List<RestrictedMonthExact2Number> rollMonth) {
		this.rollMonth = rollMonth;
	}

	@XmlElement(name = "NxtRollDt")
	public ISODate getNextRollDate() {
		return nextRollDate;
	}

	public void setNextRollDate(ISODate nextRollDate) {
		this.nextRollDate = nextRollDate;
	}

	@XmlElement(name = "NtnlCcy", required = true)
	public ActiveOrHistoricCurrencyCode getNotionalCurrency() {
		return notionalCurrency;
	}

	public void setNotionalCurrency(ActiveOrHistoricCurrencyCode notionalCurrency) {
		this.notionalCurrency = notionalCurrency;
	}
}