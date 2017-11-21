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
import com.tools20022.repository.codeset.ExtendedOptionFeature1Code;
import com.tools20022.repository.datatype.Exact32AlphaNumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10#mmPlaceAndName
 * CorporateActionOptionSD10.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10#mmExtendedOptionFeatures
 * CorporateActionOptionSD10.mmExtendedOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10#mmDefaultOptionFlag
 * CorporateActionOptionSD10.mmDefaultOptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10#mmOptionalDividendSupplementaryDataRequiredFlag
 * CorporateActionOptionSD10.mmOptionalDividendSupplementaryDataRequiredFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10#mmRDPReferenceNumber
 * CorporateActionOptionSD10.mmRDPReferenceNumber}</li>
 * </ul>
 * </li>
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
 * "CorporateActionOptionSD10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD8
 * CorporateActionOptionSD8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionOptionSD10", propOrder = {"placeAndName", "extendedOptionFeatures", "defaultOptionFlag", "optionalDividendSupplementaryDataRequiredFlag", "RDPReferenceNumber"})
public class CorporateActionOptionSD10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10
	 * CorporateActionOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD8#mmPlaceAndName
	 * CorporateActionOptionSD8.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionOptionSD8.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ExtendedOptionFeature1Code extendedOptionFeatures;
	/**
	 * Used for options that have particular proprietary feature that cannot be
	 * represented in standard ISO message.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10
	 * CorporateActionOptionSD10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedOptnFeatrs"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD8#mmExtendedOptionFeatures
	 * CorporateActionOptionSD8.mmExtendedOptionFeatures}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedOptionFeatures = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "XtndedOptnFeatrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedOptionFeatures";
			definition = "Used for options that have particular proprietary feature that cannot be represented in standard ISO message.";
			previousVersion_lazy = () -> CorporateActionOptionSD8.mmExtendedOptionFeatures;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedOptionFeature1Code.mmObject();
		}
	};
	protected YesNoIndicator defaultOptionFlag;
	/**
	 * Identifies whether the option is declared as default by the issuer /
	 * offeror, and will be treated as default by the issuer / offeror if no
	 * elections is made.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10
	 * CorporateActionOptionSD10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltOptnFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultOptionFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the option is declared as default by the issuer / offeror,  and will be treated as default by the issuer / offeror if no elections is made."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD8#mmDefaultOptionFlag
	 * CorporateActionOptionSD8.mmDefaultOptionFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDefaultOptionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "DfltOptnFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultOptionFlag";
			definition = "Identifies whether the option is declared as default by the issuer / offeror,  and will be treated as default by the issuer / offeror if no elections is made.";
			previousVersion_lazy = () -> CorporateActionOptionSD8.mmDefaultOptionFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator optionalDividendSupplementaryDataRequiredFlag;
	/**
	 * Indicates whether optional dividend supplementary data are required in
	 * the ISO 20022 CAIN instructions for this event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10
	 * CorporateActionOptionSD10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnlDvddSplmtryDataReqrdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalDividendSupplementaryDataRequiredFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether optional dividend supplementary data are required in the ISO 20022 CAIN instructions for this event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD8#mmOptionalDividendSupplementaryDataRequiredFlag
	 * CorporateActionOptionSD8.mmOptionalDividendSupplementaryDataRequiredFlag}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionalDividendSupplementaryDataRequiredFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "OptnlDvddSplmtryDataReqrdFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividendSupplementaryDataRequiredFlag";
			definition = "Indicates whether optional dividend supplementary data are required in the ISO 20022 CAIN instructions for this event.";
			previousVersion_lazy = () -> CorporateActionOptionSD8.mmOptionalDividendSupplementaryDataRequiredFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Exact32AlphaNumericText rDPReferenceNumber;
	/**
	 * Unique DTCC legacy reference used for matching and reconciling legacy CCF
	 * records. The element will be populated to all levels of the message
	 * (Event Details, Options, Movements) where applicable to indicate how
	 * values are sourced from CCF legacy files. For example: event has 2
	 * related Activity Types 74, and 54. If event details and cash option are
	 * sourced from the Activity Type 74, then Activity Type 74 will be in RDP
	 * Reference Number in event details, and also on the cash option. The
	 * activity type 54 will be "on" the security option. Also, usage rules will
	 * specify the different layouts of the RDP Reference Number based on DTCC
	 * event group (reorganization, distribution, or redemption).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact32AlphaNumericText
	 * Exact32AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD10
	 * CorporateActionOptionSD10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RDPRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RDPReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files.  For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option.  Also, usage rules will specify the different layouts of the   RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).  "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD8#mmRDPReferenceNumber
	 * CorporateActionOptionSD8.mmRDPReferenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRDPReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files.  For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option.  Also, usage rules will specify the different layouts of the   RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).  ";
			previousVersion_lazy = () -> CorporateActionOptionSD8.mmRDPReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionOptionSD10.mmPlaceAndName, CorporateActionOptionSD10.mmExtendedOptionFeatures, CorporateActionOptionSD10.mmDefaultOptionFlag,
						CorporateActionOptionSD10.mmOptionalDividendSupplementaryDataRequiredFlag, CorporateActionOptionSD10.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOptionSD10";
				definition = "Provides additional information regarding corporate action option details.";
				previousVersion_lazy = () -> CorporateActionOptionSD8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "XtndedOptnFeatrs")
	public ExtendedOptionFeature1Code getExtendedOptionFeatures() {
		return extendedOptionFeatures;
	}

	public void setExtendedOptionFeatures(ExtendedOptionFeature1Code extendedOptionFeatures) {
		this.extendedOptionFeatures = extendedOptionFeatures;
	}

	@XmlElement(name = "DfltOptnFlg")
	public YesNoIndicator getDefaultOptionFlag() {
		return defaultOptionFlag;
	}

	public void setDefaultOptionFlag(YesNoIndicator defaultOptionFlag) {
		this.defaultOptionFlag = defaultOptionFlag;
	}

	@XmlElement(name = "OptnlDvddSplmtryDataReqrdFlg")
	public YesNoIndicator getOptionalDividendSupplementaryDataRequiredFlag() {
		return optionalDividendSupplementaryDataRequiredFlag;
	}

	public void setOptionalDividendSupplementaryDataRequiredFlag(YesNoIndicator optionalDividendSupplementaryDataRequiredFlag) {
		this.optionalDividendSupplementaryDataRequiredFlag = optionalDividendSupplementaryDataRequiredFlag;
	}

	@XmlElement(name = "RDPRefNb")
	public Exact32AlphaNumericText getRDPReferenceNumber() {
		return rDPReferenceNumber;
	}

	public void setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
	}
}