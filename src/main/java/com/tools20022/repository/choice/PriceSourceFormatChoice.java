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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.SourceOfPrice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification5;
import com.tools20022.repository.msg.PriceSource;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of the source (place) of the price quotation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice#mmLocalMarketPlace
 * PriceSourceFormatChoice.mmLocalMarketPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice#mmNonLocalMarketPlace
 * PriceSourceFormatChoice.mmNonLocalMarketPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice#mmPlaceAsDSS
 * PriceSourceFormatChoice.mmPlaceAsDSS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SourceOfPrice
 * SourceOfPrice}</li>
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
 * "PriceSourceFormatChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of the source (place) of the price quotation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceSourceFormatChoice", propOrder = {"localMarketPlace", "nonLocalMarketPlace", "placeAsDSS"})
public class PriceSourceFormatChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LclMktPlc", required = true)
	protected MICIdentifier localMarketPlace;
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
	 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice
	 * PriceSourceFormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclMktPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalMarketPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of price quotation is the market, expressed as a Market Identifier Code (MIC)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceSourceFormatChoice, MICIdentifier> mmLocalMarketPlace = new MMMessageAttribute<PriceSourceFormatChoice, MICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceSourceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "LclMktPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalMarketPlace";
			definition = "Source of price quotation is the market, expressed as a Market Identifier Code (MIC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public MICIdentifier getValue(PriceSourceFormatChoice obj) {
			return obj.getLocalMarketPlace();
		}

		@Override
		public void setValue(PriceSourceFormatChoice obj, MICIdentifier value) {
			obj.setLocalMarketPlace(value);
		}
	};
	@XmlElement(name = "NonLclMktPlc", required = true)
	protected PriceSource nonLocalMarketPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceSource
	 * PriceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice SourceOfPrice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice
	 * PriceSourceFormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonLclMktPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonLocalMarketPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of a price quotation when it is not the local market."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceSourceFormatChoice, PriceSource> mmNonLocalMarketPlace = new MMMessageAttribute<PriceSourceFormatChoice, PriceSource>() {
		{
			businessComponentTrace_lazy = () -> SourceOfPrice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceSourceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "NonLclMktPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonLocalMarketPlace";
			definition = "Source of a price quotation when it is not the local market.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceSource.mmObject();
		}

		@Override
		public PriceSource getValue(PriceSourceFormatChoice obj) {
			return obj.getNonLocalMarketPlace();
		}

		@Override
		public void setValue(PriceSourceFormatChoice obj, PriceSource value) {
			obj.setNonLocalMarketPlace(value);
		}
	};
	@XmlElement(name = "PlcAsDSS", required = true)
	protected GenericIdentification5 placeAsDSS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification5
	 * GenericIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
	 * InformationPartyRole.mmGenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice
	 * PriceSourceFormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B:PRIC//</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of a price quotation expressed with a propriety identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceSourceFormatChoice, GenericIdentification5> mmPlaceAsDSS = new MMMessageAttribute<PriceSourceFormatChoice, GenericIdentification5>() {
		{
			businessElementTrace_lazy = () -> InformationPartyRole.mmGenericIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceSourceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "PlcAsDSS";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B:PRIC//"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAsDSS";
			definition = "Source of a price quotation expressed with a propriety identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification5.mmObject();
		}

		@Override
		public GenericIdentification5 getValue(PriceSourceFormatChoice obj) {
			return obj.getPlaceAsDSS();
		}

		@Override
		public void setValue(PriceSourceFormatChoice obj, GenericIdentification5 value) {
			obj.setPlaceAsDSS(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceSourceFormatChoice.mmLocalMarketPlace, com.tools20022.repository.choice.PriceSourceFormatChoice.mmNonLocalMarketPlace,
						com.tools20022.repository.choice.PriceSourceFormatChoice.mmPlaceAsDSS);
				trace_lazy = () -> SourceOfPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceSourceFormatChoice";
				definition = "Choice of the source (place) of the price quotation.";
			}
		});
		return mmObject_lazy.get();
	}

	public MICIdentifier getLocalMarketPlace() {
		return localMarketPlace;
	}

	public PriceSourceFormatChoice setLocalMarketPlace(MICIdentifier localMarketPlace) {
		this.localMarketPlace = Objects.requireNonNull(localMarketPlace);
		return this;
	}

	public PriceSource getNonLocalMarketPlace() {
		return nonLocalMarketPlace;
	}

	public PriceSourceFormatChoice setNonLocalMarketPlace(PriceSource nonLocalMarketPlace) {
		this.nonLocalMarketPlace = Objects.requireNonNull(nonLocalMarketPlace);
		return this;
	}

	public GenericIdentification5 getPlaceAsDSS() {
		return placeAsDSS;
	}

	public PriceSourceFormatChoice setPlaceAsDSS(GenericIdentification5 placeAsDSS) {
		this.placeAsDSS = Objects.requireNonNull(placeAsDSS);
		return this;
	}
}