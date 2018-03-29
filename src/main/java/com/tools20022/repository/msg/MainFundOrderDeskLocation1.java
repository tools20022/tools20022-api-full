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
import com.tools20022.repository.entity.FundOrderDesk;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.entity.Location;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UTCOffset1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * U-003-2009 Addition and Modification of choice component. S-009-2009 They are
 * not valid business options in the redemption processing context. S-015-2009
 * Add new data elements to indicate time zone.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MainFundOrderDeskLocation1#mmCountry
 * MainFundOrderDeskLocation1.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MainFundOrderDeskLocation1#mmTimeZoneOffSet
 * MainFundOrderDeskLocation1.mmTimeZoneOffSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundOrderDesk
 * FundOrderDesk}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MainFundOrderDeskLocation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "U-003-2009 Addition and Modification of choice component. S-009-2009 They are not valid business options in the redemption processing context. S-015-2009 Add new data elements to indicate time zone."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MainFundOrderDeskLocation1", propOrder = {"country", "timeZoneOffSet"})
public class MainFundOrderDeskLocation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ctry", required = true)
	protected CountryCode country;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmAuthorisedCountry
	 * InvestmentFund.mmAuthorisedCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MainFundOrderDeskLocation1
	 * MainFundOrderDeskLocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which it is authorised to commercialise the fund."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MainFundOrderDeskLocation1, CountryCode> mmCountry = new MMMessageAttribute<MainFundOrderDeskLocation1, CountryCode>() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmAuthorisedCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.MainFundOrderDeskLocation1.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country in which it is authorised to commercialise the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(MainFundOrderDeskLocation1 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(MainFundOrderDeskLocation1 obj, CountryCode value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "TmZoneOffSet", required = true)
	protected UTCOffset1 timeZoneOffSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.UTCOffset1
	 * UTCOffset1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmTimeZone
	 * Location.mmTimeZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MainFundOrderDeskLocation1
	 * MainFundOrderDeskLocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmZoneOffSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeZoneOffSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offset of the reporting time before or after 00: 00 hour UTC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MainFundOrderDeskLocation1, UTCOffset1> mmTimeZoneOffSet = new MMMessageAttribute<MainFundOrderDeskLocation1, UTCOffset1>() {
		{
			businessElementTrace_lazy = () -> Location.mmTimeZone;
			componentContext_lazy = () -> com.tools20022.repository.msg.MainFundOrderDeskLocation1.mmObject();
			isDerived = false;
			xmlTag = "TmZoneOffSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZoneOffSet";
			definition = "Offset of the reporting time before or after 00: 00 hour UTC.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UTCOffset1.mmObject();
		}

		@Override
		public UTCOffset1 getValue(MainFundOrderDeskLocation1 obj) {
			return obj.getTimeZoneOffSet();
		}

		@Override
		public void setValue(MainFundOrderDeskLocation1 obj, UTCOffset1 value) {
			obj.setTimeZoneOffSet(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MainFundOrderDeskLocation1.mmCountry, com.tools20022.repository.msg.MainFundOrderDeskLocation1.mmTimeZoneOffSet);
				trace_lazy = () -> FundOrderDesk.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MainFundOrderDeskLocation1";
				definition = "U-003-2009 Addition and Modification of choice component. S-009-2009 They are not valid business options in the redemption processing context. S-015-2009 Add new data elements to indicate time zone.";
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getCountry() {
		return country;
	}

	public MainFundOrderDeskLocation1 setCountry(CountryCode country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public UTCOffset1 getTimeZoneOffSet() {
		return timeZoneOffSet;
	}

	public MainFundOrderDeskLocation1 setTimeZoneOffSet(UTCOffset1 timeZoneOffSet) {
		this.timeZoneOffSet = Objects.requireNonNull(timeZoneOffSet);
		return this;
	}
}