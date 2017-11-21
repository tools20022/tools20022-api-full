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
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of the source (place) of the price quotation
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceSourceFormatChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of the source (place) of the price quotation"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriceSourceFormatChoice", propOrder = {"localMarketPlace", "nonLocalMarketPlace", "placeAsDSS"})
public class PriceSourceFormatChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected MICIdentifier localMarketPlace;
	/**
	 * Source of price quotation is the market, expressed as a Market Identifier
	 * Code (MIC).
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
	public static final MMMessageAttribute mmLocalMarketPlace = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> PriceSourceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "LclMktPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalMarketPlace";
			definition = "Source of price quotation is the market, expressed as a Market Identifier Code (MIC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected PriceSource nonLocalMarketPlace;
	/**
	 * Source of a price quotation when it is not the local market.
	 * <p>
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
	public static final MMMessageAttribute mmNonLocalMarketPlace = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SourceOfPrice.mmObject();
			componentContext_lazy = () -> PriceSourceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "NonLclMktPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonLocalMarketPlace";
			definition = "Source of a price quotation when it is not the local market.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceSource.mmObject();
		}
	};
	protected GenericIdentification5 placeAsDSS;
	/**
	 * Source of a price quotation expressed with a propriety identification
	 * scheme.
	 * <p>
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
	public static final MMMessageAttribute mmPlaceAsDSS = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InformationPartyRole.mmGenericIdentification;
			componentContext_lazy = () -> PriceSourceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "PlcAsDSS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAsDSS";
			definition = "Source of a price quotation expressed with a propriety identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PriceSourceFormatChoice.mmLocalMarketPlace, PriceSourceFormatChoice.mmNonLocalMarketPlace, PriceSourceFormatChoice.mmPlaceAsDSS);
				trace_lazy = () -> SourceOfPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceSourceFormatChoice";
				definition = "Choice of the source (place) of the price quotation";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LclMktPlc", required = true)
	public MICIdentifier getLocalMarketPlace() {
		return localMarketPlace;
	}

	public void setLocalMarketPlace(MICIdentifier localMarketPlace) {
		this.localMarketPlace = localMarketPlace;
	}

	@XmlElement(name = "NonLclMktPlc", required = true)
	public PriceSource getNonLocalMarketPlace() {
		return nonLocalMarketPlace;
	}

	public void setNonLocalMarketPlace(PriceSource nonLocalMarketPlace) {
		this.nonLocalMarketPlace = nonLocalMarketPlace;
	}

	@XmlElement(name = "PlcAsDSS", required = true)
	public GenericIdentification5 getPlaceAsDSS() {
		return placeAsDSS;
	}

	public void setPlaceAsDSS(GenericIdentification5 placeAsDSS) {
		this.placeAsDSS = placeAsDSS;
	}
}