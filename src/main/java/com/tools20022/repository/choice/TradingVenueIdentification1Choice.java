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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradingVenueIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Trade venue related fields.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#mmMarketIdentificationCode
 * TradingVenueIdentification1Choice.mmMarketIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#mmNationalCompetentAuthority
 * TradingVenueIdentification1Choice.mmNationalCompetentAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#mmOther
 * TradingVenueIdentification1Choice.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidMICRule#forTradingVenueIdentification1Choice
 * ConstraintValidMICRule.forTradingVenueIdentification1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingVenueIdentification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Trade venue related fields."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradingVenueIdentification1Choice", propOrder = {"marketIdentificationCode", "nationalCompetentAuthority", "other"})
public class TradingVenueIdentification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MktIdCd", required = true)
	protected MICIdentifier marketIdentificationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
	 * TradingVenueIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktIdCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used where reporting entity uses a market identification code (MIC)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradingVenueIdentification1Choice, MICIdentifier> mmMarketIdentificationCode = new MMMessageAttribute<TradingVenueIdentification1Choice, MICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.TradingVenueIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "MktIdCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketIdentificationCode";
			definition = "Identification used where reporting entity uses a market identification code (MIC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public MICIdentifier getValue(TradingVenueIdentification1Choice obj) {
			return obj.getMarketIdentificationCode();
		}

		@Override
		public void setValue(TradingVenueIdentification1Choice obj, MICIdentifier value) {
			obj.setMarketIdentificationCode(value);
		}
	};
	@XmlElement(name = "NtlCmptntAuthrty", required = true)
	protected CountryCode nationalCompetentAuthority;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
	 * TradingVenueIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtlCmptntAuthrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalCompetentAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used where reporting entity is a national competent authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradingVenueIdentification1Choice, CountryCode> mmNationalCompetentAuthority = new MMMessageAttribute<TradingVenueIdentification1Choice, CountryCode>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.choice.TradingVenueIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "NtlCmptntAuthrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalCompetentAuthority";
			definition = "Identification used where reporting entity is a national competent authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(TradingVenueIdentification1Choice obj) {
			return obj.getNationalCompetentAuthority();
		}

		@Override
		public void setValue(TradingVenueIdentification1Choice obj, CountryCode value) {
			obj.setNationalCompetentAuthority(value);
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected TradingVenueIdentification2 other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueIdentification2
	 * TradingVenueIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
	 * TradingVenueIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used where a venue does not have an already defined code type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradingVenueIdentification1Choice, TradingVenueIdentification2> mmOther = new MMMessageAssociationEnd<TradingVenueIdentification1Choice, TradingVenueIdentification2>() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.TradingVenueIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Identification used where a venue does not have an already defined code type.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradingVenueIdentification2.mmObject();
		}

		@Override
		public TradingVenueIdentification2 getValue(TradingVenueIdentification1Choice obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(TradingVenueIdentification1Choice obj, TradingVenueIdentification2 value) {
			obj.setOther(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradingVenueIdentification1Choice.mmMarketIdentificationCode,
						com.tools20022.repository.choice.TradingVenueIdentification1Choice.mmNationalCompetentAuthority, com.tools20022.repository.choice.TradingVenueIdentification1Choice.mmOther);
				trace_lazy = () -> OrganisationIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidMICRule.forTradingVenueIdentification1Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingVenueIdentification1Choice";
				definition = "Trade venue related fields.";
			}
		});
		return mmObject_lazy.get();
	}

	public MICIdentifier getMarketIdentificationCode() {
		return marketIdentificationCode;
	}

	public TradingVenueIdentification1Choice setMarketIdentificationCode(MICIdentifier marketIdentificationCode) {
		this.marketIdentificationCode = Objects.requireNonNull(marketIdentificationCode);
		return this;
	}

	public CountryCode getNationalCompetentAuthority() {
		return nationalCompetentAuthority;
	}

	public TradingVenueIdentification1Choice setNationalCompetentAuthority(CountryCode nationalCompetentAuthority) {
		this.nationalCompetentAuthority = Objects.requireNonNull(nationalCompetentAuthority);
		return this;
	}

	public TradingVenueIdentification2 getOther() {
		return other;
	}

	public TradingVenueIdentification1Choice setOther(TradingVenueIdentification2 other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}