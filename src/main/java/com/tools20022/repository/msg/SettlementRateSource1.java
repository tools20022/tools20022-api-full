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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Exact2AlphaNumericText;
import com.tools20022.repository.datatype.Exact4NumericText;
import com.tools20022.repository.datatype.RateSourceText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the components of a settlement rate source for a non delvierable
 * trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementRateSource1#mmRateSource
 * SettlementRateSource1.mmRateSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementRateSource1#mmTime
 * SettlementRateSource1.mmTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementRateSource1#mmCountryCode
 * SettlementRateSource1.mmCountryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementRateSource1#mmLocationCode
 * SettlementRateSource1.mmLocationCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTimeCountryLocationRule#forSettlementRateSource1
 * ConstraintTimeCountryLocationRule.forSettlementRateSource1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementRateSource1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the components of a settlement rate source for a non delvierable trade."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementRateSource1", propOrder = {"rateSource", "time", "countryCode", "locationCode"})
public class SettlementRateSource1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RateSrc", required = true)
	protected RateSourceText rateSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RateSourceText
	 * RateSourceText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementRateSource1
	 * SettlementRateSource1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the rate source for the non deliverable trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementRateSource1, RateSourceText> mmRateSource = new MMMessageAttribute<SettlementRateSource1, RateSourceText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementRateSource1.mmObject();
			isDerived = false;
			xmlTag = "RateSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateSource";
			definition = "Specifies the rate source for the non deliverable trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateSourceText.mmObject();
		}

		@Override
		public RateSourceText getValue(SettlementRateSource1 obj) {
			return obj.getRateSource();
		}

		@Override
		public void setValue(SettlementRateSource1 obj, RateSourceText value) {
			obj.setRateSource(value);
		}
	};
	@XmlElement(name = "Tm")
	protected Exact4NumericText time;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4NumericText
	 * Exact4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementRateSource1
	 * SettlementRateSource1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Time"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the time \"HHMM\" associated with the rate source."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementRateSource1, Optional<Exact4NumericText>> mmTime = new MMMessageAttribute<SettlementRateSource1, Optional<Exact4NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementRateSource1.mmObject();
			isDerived = false;
			xmlTag = "Tm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Time";
			definition = "Specifies the time \"HHMM\" associated with the rate source.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4NumericText.mmObject();
		}

		@Override
		public Optional<Exact4NumericText> getValue(SettlementRateSource1 obj) {
			return obj.getTime();
		}

		@Override
		public void setValue(SettlementRateSource1 obj, Optional<Exact4NumericText> value) {
			obj.setTime(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryCd")
	protected CountryCode countryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementRateSource1
	 * SettlementRateSource1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the country code for the quoted rate source."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementRateSource1, Optional<CountryCode>> mmCountryCode = new MMMessageAttribute<SettlementRateSource1, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementRateSource1.mmObject();
			isDerived = false;
			xmlTag = "CtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryCode";
			definition = "Specifies the country code for the quoted rate source.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(SettlementRateSource1 obj) {
			return obj.getCountryCode();
		}

		@Override
		public void setValue(SettlementRateSource1 obj, Optional<CountryCode> value) {
			obj.setCountryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "LctnCd")
	protected Exact2AlphaNumericText locationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact2AlphaNumericText
	 * Exact2AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementRateSource1
	 * SettlementRateSource1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LctnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The location expressed as a 2 character code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementRateSource1, Optional<Exact2AlphaNumericText>> mmLocationCode = new MMMessageAttribute<SettlementRateSource1, Optional<Exact2AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementRateSource1.mmObject();
			isDerived = false;
			xmlTag = "LctnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationCode";
			definition = "The location expressed as a 2 character code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact2AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact2AlphaNumericText> getValue(SettlementRateSource1 obj) {
			return obj.getLocationCode();
		}

		@Override
		public void setValue(SettlementRateSource1 obj, Optional<Exact2AlphaNumericText> value) {
			obj.setLocationCode(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementRateSource1.mmRateSource, com.tools20022.repository.msg.SettlementRateSource1.mmTime,
						com.tools20022.repository.msg.SettlementRateSource1.mmCountryCode, com.tools20022.repository.msg.SettlementRateSource1.mmLocationCode);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTimeCountryLocationRule.forSettlementRateSource1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementRateSource1";
				definition = "Specifies the components of a settlement rate source for a non delvierable trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public RateSourceText getRateSource() {
		return rateSource;
	}

	public SettlementRateSource1 setRateSource(RateSourceText rateSource) {
		this.rateSource = Objects.requireNonNull(rateSource);
		return this;
	}

	public Optional<Exact4NumericText> getTime() {
		return time == null ? Optional.empty() : Optional.of(time);
	}

	public SettlementRateSource1 setTime(Exact4NumericText time) {
		this.time = time;
		return this;
	}

	public Optional<CountryCode> getCountryCode() {
		return countryCode == null ? Optional.empty() : Optional.of(countryCode);
	}

	public SettlementRateSource1 setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public Optional<Exact2AlphaNumericText> getLocationCode() {
		return locationCode == null ? Optional.empty() : Optional.of(locationCode);
	}

	public SettlementRateSource1 setLocationCode(Exact2AlphaNumericText locationCode) {
		this.locationCode = locationCode;
		return this;
	}
}