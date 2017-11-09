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
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9#mmPlaceAndName
 * CorporateActionOptionSD9.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9#mmExtendedOptionFeatures
 * CorporateActionOptionSD9.mmExtendedOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9#mmDTCDefaultOptionFlag
 * CorporateActionOptionSD9.mmDTCDefaultOptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9#mmOptionalDividendSupplementaryDataRequiredFlag
 * CorporateActionOptionSD9.mmOptionalDividendSupplementaryDataRequiredFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9#mmRDPReferenceNumber
 * CorporateActionOptionSD9.mmRDPReferenceNumber}</li>
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
 * "CorporateActionOptionSD9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option details."</li>
 * </ul>
 */
public class CorporateActionOptionSD9 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9
	 * CorporateActionOptionSD9}</li>
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
			componentContext_lazy = () -> CorporateActionOptionSD9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9
	 * CorporateActionOptionSD9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedOptionFeatures = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "XtndedOptnFeatrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedOptionFeatures";
			definition = "Used for options that have particular proprietary feature that cannot be represented in standard ISO message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedOptionFeature1Code.mmObject();
		}
	};
	protected YesNoIndicator dTCDefaultOptionFlag;
	/**
	 * Identifies whether the option will be processed as default by DTC (The
	 * Depository Trust Corporation) when no election is made.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9
	 * CorporateActionOptionSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDfltOptnFlg"</li>
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
			componentContext_lazy = () -> CorporateActionOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "DTCDfltOptnFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDefaultOptionFlag";
			definition = "Identifies whether the option will be processed as default by DTC (The Depository Trust Corporation) when no election is made.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9
	 * CorporateActionOptionSD9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionalDividendSupplementaryDataRequiredFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "OptnlDvddSplmtryDataReqrdFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividendSupplementaryDataRequiredFlag";
			definition = "Indicates whether optional dividend supplementary data are required in the ISO 20022 CAIN instructions for this event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Exact32AlphaNumericText rDPReferenceNumber;
	/**
	 * Unique DTCC legacy reference used for matching and reconciling legacy
	 * records. The number algorhithm is as follows: Department ID (1:1),
	 * Activity Type (2:3), Cusip Country Code (5:2), Cusip (7:9), Record Date
	 * (15:8), Payable Date (22:8), Sequence Number (29:3), RDP Issue Type
	 * (31:1). <br>
	 * USAGE RULE: this sequence can be populated /extended to event details,
	 * option details or a movement, depending on sequence number coordinality
	 * to an event.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD9
	 * CorporateActionOptionSD9}</li>
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
	 * "Unique DTCC legacy reference used for matching and reconciling legacy records. The number algorhithm is as follows: Department ID (1:1), Activity Type (2:3), Cusip Country Code (5:2), Cusip (7:9), Record Date (15:8), Payable Date (22:8), Sequence Number (29:3), RDP Issue Type (31:1). \r\nUSAGE RULE: this sequence can be populated /extended to event details, option details or a movement, depending on sequence number coordinality to an event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRDPReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy records. The number algorhithm is as follows: Department ID (1:1), Activity Type (2:3), Cusip Country Code (5:2), Cusip (7:9), Record Date (15:8), Payable Date (22:8), Sequence Number (29:3), RDP Issue Type (31:1). \r\nUSAGE RULE: this sequence can be populated /extended to event details, option details or a movement, depending on sequence number coordinality to an event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionOptionSD9.mmPlaceAndName, CorporateActionOptionSD9.mmExtendedOptionFeatures, CorporateActionOptionSD9.mmDTCDefaultOptionFlag,
						CorporateActionOptionSD9.mmOptionalDividendSupplementaryDataRequiredFlag, CorporateActionOptionSD9.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOptionSD9";
				definition = "Provides additional information regarding corporate action option details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public ExtendedOptionFeature1Code getExtendedOptionFeatures() {
		return extendedOptionFeatures;
	}

	public void setExtendedOptionFeatures(ExtendedOptionFeature1Code extendedOptionFeatures) {
		this.extendedOptionFeatures = extendedOptionFeatures;
	}

	public YesNoIndicator getDTCDefaultOptionFlag() {
		return dTCDefaultOptionFlag;
	}

	public void setDTCDefaultOptionFlag(YesNoIndicator dTCDefaultOptionFlag) {
		this.dTCDefaultOptionFlag = dTCDefaultOptionFlag;
	}

	public YesNoIndicator getOptionalDividendSupplementaryDataRequiredFlag() {
		return optionalDividendSupplementaryDataRequiredFlag;
	}

	public void setOptionalDividendSupplementaryDataRequiredFlag(YesNoIndicator optionalDividendSupplementaryDataRequiredFlag) {
		this.optionalDividendSupplementaryDataRequiredFlag = optionalDividendSupplementaryDataRequiredFlag;
	}

	public Exact32AlphaNumericText getRDPReferenceNumber() {
		return rDPReferenceNumber;
	}

	public void setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
	}
}