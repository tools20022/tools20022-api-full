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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ExtendedOptionFeature1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Provides additional information regarding corporate action option details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD1#mmPlaceAndName
 * CorporateActionOptionSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD1#mmExtendedOptionFeatures
 * CorporateActionOptionSD1.mmExtendedOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD1#mmDTCDefaultOptionFlag
 * CorporateActionOptionSD1.mmDTCDefaultOptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD1#mmDTCTaxControlNumberRequiredFlag
 * CorporateActionOptionSD1.mmDTCTaxControlNumberRequiredFlag}</li>
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
 * "CorporateActionOptionSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOptionSD7
 * CorporateActionOptionSD7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionOptionSD1", propOrder = {"placeAndName", "extendedOptionFeatures", "dTCDefaultOptionFlag", "dTCTaxControlNumberRequiredFlag"})
public class CorporateActionOptionSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD1
	 * CorporateActionOptionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOptionSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "XtndedOptnFeatrs")
	protected ExtendedOptionFeature1Code extendedOptionFeatures;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
	 * ExtendedOptionFeature1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD1
	 * CorporateActionOptionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedOptnFeatrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Option Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedOptionFeatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for options that have particular proprietary feature that cannot be represented in standard ISO message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedOptionFeatures = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOptionSD1.mmObject();
			isDerived = false;
			xmlTag = "XtndedOptnFeatrs";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Option Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedOptionFeatures";
			definition = "Used for options that have particular proprietary feature that cannot be represented in standard ISO message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedOptionFeature1Code.mmObject();
		}
	};
	@XmlElement(name = "DTCDfltOptnFlg")
	protected YesNoIndicator dTCDefaultOptionFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD1
	 * CorporateActionOptionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDfltOptnFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Default Option Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCDefaultOptionFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the option will be processed as default by DTC (The Depository Trust Corporation) when no election is made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDefaultOptionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOptionSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCDfltOptnFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Default Option Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDefaultOptionFlag";
			definition = "Identifies whether the option will be processed as default by DTC (The Depository Trust Corporation) when no election is made.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DTCTaxCtrlNbReqrdFlg")
	protected YesNoIndicator dTCTaxControlNumberRequiredFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD1
	 * CorporateActionOptionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCTaxCtrlNbReqrdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Tax Control Number Required Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCTaxControlNumberRequiredFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certain tax authorities provide control numbers to investors to instruct on Foreign Tax Relief service at DTC (The Depository Trust Corporation). This flag notes which events have these requirements and requires the DTC participant to input the control numbers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCTaxControlNumberRequiredFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOptionSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCTaxCtrlNbReqrdFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Tax Control Number Required Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCTaxControlNumberRequiredFlag";
			definition = "Certain tax authorities provide control numbers to investors to instruct on Foreign Tax Relief service at DTC (The Depository Trust Corporation). This flag notes which events have these requirements and requires the DTC participant to input the control numbers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOptionSD1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionOptionSD1.mmExtendedOptionFeatures,
						com.tools20022.repository.msg.CorporateActionOptionSD1.mmDTCDefaultOptionFlag, com.tools20022.repository.msg.CorporateActionOptionSD1.mmDTCTaxControlNumberRequiredFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionOptionSD1";
				definition = "Provides additional information regarding corporate action option details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionOptionSD7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionOptionSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<ExtendedOptionFeature1Code> getExtendedOptionFeatures() {
		return extendedOptionFeatures == null ? Optional.empty() : Optional.of(extendedOptionFeatures);
	}

	public CorporateActionOptionSD1 setExtendedOptionFeatures(ExtendedOptionFeature1Code extendedOptionFeatures) {
		this.extendedOptionFeatures = extendedOptionFeatures;
		return this;
	}

	public Optional<YesNoIndicator> getDTCDefaultOptionFlag() {
		return dTCDefaultOptionFlag == null ? Optional.empty() : Optional.of(dTCDefaultOptionFlag);
	}

	public CorporateActionOptionSD1 setDTCDefaultOptionFlag(YesNoIndicator dTCDefaultOptionFlag) {
		this.dTCDefaultOptionFlag = dTCDefaultOptionFlag;
		return this;
	}

	public Optional<YesNoIndicator> getDTCTaxControlNumberRequiredFlag() {
		return dTCTaxControlNumberRequiredFlag == null ? Optional.empty() : Optional.of(dTCTaxControlNumberRequiredFlag);
	}

	public CorporateActionOptionSD1 setDTCTaxControlNumberRequiredFlag(YesNoIndicator dTCTaxControlNumberRequiredFlag) {
		this.dTCTaxControlNumberRequiredFlag = dTCTaxControlNumberRequiredFlag;
		return this;
	}
}