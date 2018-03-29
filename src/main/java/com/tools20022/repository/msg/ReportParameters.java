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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BreakdownByParty2;
import com.tools20022.repository.msg.BreakdownByUserDefinedParameter2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters to be used in a report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportParameters#mmCountry
 * ReportParameters.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportParameters#mmCurrency
 * ReportParameters.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportParameters#mmParty
 * ReportParameters.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters#mmUserDefinedParameter
 * ReportParameters.mmUserDefinedParameter}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters to be used in a report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportParameters", propOrder = {"country", "currency", "party", "userDefinedParameter"})
public class ReportParameters {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ctry")
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters
	 * ReportParameters}</li>
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
	 * definition} = "Country for which the cash flow is to be reported."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportParameters, Optional<CountryCode>> mmCountry = new MMMessageAttribute<ReportParameters, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country for which the cash flow is to be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(ReportParameters obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(ReportParameters obj, Optional<CountryCode> value) {
			obj.setCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters
	 * ReportParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for which the cash flow is to be reported."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportParameters, Optional<ActiveOrHistoricCurrencyCode>> mmCurrency = new MMMessageAttribute<ReportParameters, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency for which the cash flow is to be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(ReportParameters obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ReportParameters obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty")
	protected BreakdownByParty2 party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BreakdownByParty2
	 * BreakdownByParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters
	 * ReportParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, eg, fund management company, for which the cash flow report is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportParameters, Optional<BreakdownByParty2>> mmParty = new MMMessageAssociationEnd<ReportParameters, Optional<BreakdownByParty2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Party, eg, fund management company, for which the cash flow report is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BreakdownByParty2.mmObject();
		}

		@Override
		public Optional<BreakdownByParty2> getValue(ReportParameters obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(ReportParameters obj, Optional<BreakdownByParty2> value) {
			obj.setParty(value.orElse(null));
		}
	};
	@XmlElement(name = "UsrDfndParam")
	protected BreakdownByUserDefinedParameter2 userDefinedParameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter2
	 * BreakdownByUserDefinedParameter2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters
	 * ReportParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrDfndParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefinedParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User defined parameter/s to be used for the cash forecast report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportParameters, Optional<BreakdownByUserDefinedParameter2>> mmUserDefinedParameter = new MMMessageAssociationEnd<ReportParameters, Optional<BreakdownByUserDefinedParameter2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters.mmObject();
			isDerived = false;
			xmlTag = "UsrDfndParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefinedParameter";
			definition = "User defined parameter/s to be used for the cash forecast report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BreakdownByUserDefinedParameter2.mmObject();
		}

		@Override
		public Optional<BreakdownByUserDefinedParameter2> getValue(ReportParameters obj) {
			return obj.getUserDefinedParameter();
		}

		@Override
		public void setValue(ReportParameters obj, Optional<BreakdownByUserDefinedParameter2> value) {
			obj.setUserDefinedParameter(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportParameters.mmCountry, com.tools20022.repository.msg.ReportParameters.mmCurrency, com.tools20022.repository.msg.ReportParameters.mmParty,
						com.tools20022.repository.msg.ReportParameters.mmUserDefinedParameter);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReportParameters";
				definition = "Parameters to be used in a report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CountryCode> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public ReportParameters setCountry(CountryCode country) {
		this.country = country;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public ReportParameters setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<BreakdownByParty2> getParty() {
		return party == null ? Optional.empty() : Optional.of(party);
	}

	public ReportParameters setParty(BreakdownByParty2 party) {
		this.party = party;
		return this;
	}

	public Optional<BreakdownByUserDefinedParameter2> getUserDefinedParameter() {
		return userDefinedParameter == null ? Optional.empty() : Optional.of(userDefinedParameter);
	}

	public ReportParameters setUserDefinedParameter(BreakdownByUserDefinedParameter2 userDefinedParameter) {
		this.userDefinedParameter = userDefinedParameter;
		return this;
	}
}