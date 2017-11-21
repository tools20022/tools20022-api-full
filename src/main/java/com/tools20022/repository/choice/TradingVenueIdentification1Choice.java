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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TradingVenueIdentification1Choice", propOrder = {"marketIdentificationCode", "nationalCompetentAuthority", "other"})
public class TradingVenueIdentification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected MICIdentifier marketIdentificationCode;
	/**
	 * Identification used where reporting entity uses a market identification
	 * code (MIC).
	 * <p>
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
	public static final MMMessageAttribute mmMarketIdentificationCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> TradingVenueIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "MktIdCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketIdentificationCode";
			definition = "Identification used where reporting entity uses a market identification code (MIC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected CountryCode nationalCompetentAuthority;
	/**
	 * Identification used where reporting entity is a national competent
	 * authority.
	 * <p>
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
	public static final MMMessageAttribute mmNationalCompetentAuthority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> TradingVenueIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "NtlCmptntAuthrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalCompetentAuthority";
			definition = "Identification used where reporting entity is a national competent authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected TradingVenueIdentification2 other;
	/**
	 * Identification used where a venue does not have an already defined code
	 * type.
	 * <p>
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
	public static final MMMessageAssociationEnd mmOther = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> TradingVenueIdentification1Choice.mmObject();
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
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradingVenueIdentification1Choice.mmMarketIdentificationCode, TradingVenueIdentification1Choice.mmNationalCompetentAuthority, TradingVenueIdentification1Choice.mmOther);
				trace_lazy = () -> OrganisationIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingVenueIdentification1Choice";
				definition = "Trade venue related fields.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MktIdCd", required = true)
	public MICIdentifier getMarketIdentificationCode() {
		return marketIdentificationCode;
	}

	public void setMarketIdentificationCode(MICIdentifier marketIdentificationCode) {
		this.marketIdentificationCode = marketIdentificationCode;
	}

	@XmlElement(name = "NtlCmptntAuthrty", required = true)
	public CountryCode getNationalCompetentAuthority() {
		return nationalCompetentAuthority;
	}

	public void setNationalCompetentAuthority(CountryCode nationalCompetentAuthority) {
		this.nationalCompetentAuthority = nationalCompetentAuthority;
	}

	@XmlElement(name = "Othr", required = true)
	public TradingVenueIdentification2 getOther() {
		return other;
	}

	public void setOther(TradingVenueIdentification2 other) {
		this.other = other;
	}
}