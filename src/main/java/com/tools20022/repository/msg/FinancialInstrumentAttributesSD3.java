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
import com.tools20022.repository.codeset.AssetClass1Code;
import com.tools20022.repository.codeset.DTCAssetType1Code;
import com.tools20022.repository.datatype.DecimalNumber;
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
 * Provides additional information regarding corporate action option securities
 * movement security details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3#mmPlaceAndName
 * FinancialInstrumentAttributesSD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3#mmDTCSecurityTransferableFlag
 * FinancialInstrumentAttributesSD3.mmDTCSecurityTransferableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3#mmCSDDisbursedSecurityDetails
 * FinancialInstrumentAttributesSD3.mmCSDDisbursedSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3#mmDTCDisbursedSecurityAssetType
 * FinancialInstrumentAttributesSD3.mmDTCDisbursedSecurityAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3#mmDTCDisbursedSecurityAssetClass
 * FinancialInstrumentAttributesSD3.mmDTCDisbursedSecurityAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3#mmBabyBondDenomination
 * FinancialInstrumentAttributesSD3.mmBabyBondDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3#mmDisbursedSecurityEligibilityFlag
 * FinancialInstrumentAttributesSD3.mmDisbursedSecurityEligibilityFlag}</li>
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
 * "FinancialInstrumentAttributesSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement security details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentAttributesSD3", propOrder = {"placeAndName", "DTCSecurityTransferableFlag", "CSDDisbursedSecurityDetails", "DTCDisbursedSecurityAssetType", "DTCDisbursedSecurityAssetClass", "babyBondDenomination",
		"disbursedSecurityEligibilityFlag"})
public class FinancialInstrumentAttributesSD3 {

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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3
	 * FinancialInstrumentAttributesSD3}</li>
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
			componentContext_lazy = () -> FinancialInstrumentAttributesSD3.mmObject();
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
	protected YesNoIndicator dTCSecurityTransferableFlag;
	/**
	 * Indicates whether or not the newly issued securities are transferable by
	 * the agent. This flag is specific to DTC (The Depository Trust
	 * Corporation).
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3
	 * FinancialInstrumentAttributesSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCSctyTrfblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCSecurityTransferableFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the newly issued securities are transferable by the agent. This flag is specific to DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCSecurityTransferableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCSctyTrfblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCSecurityTransferableFlag";
			definition = "Indicates whether or not the newly issued securities are transferable by the agent. This flag is specific to DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected FinancialInstrumentAttributesSD4 cSDDisbursedSecurityDetails;
	/**
	 * Details of security that DTC will distribute as part of the entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD4
	 * FinancialInstrumentAttributesSD4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3
	 * FinancialInstrumentAttributesSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDDsbrsdSctyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDDisbursedSecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of security that DTC will distribute as part of the entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCSDDisbursedSecurityDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD3.mmObject();
			isDerived = false;
			xmlTag = "CSDDsbrsdSctyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDDisbursedSecurityDetails";
			definition = "Details of security that DTC will distribute as part of the entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD4.mmObject();
		}
	};
	protected DTCAssetType1Code dTCDisbursedSecurityAssetType;
	/**
	 * Further classification of DTC disbursed security instruments into (issue)
	 * asset types at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3
	 * FinancialInstrumentAttributesSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDsbrsdSctyAsstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCDisbursedSecurityAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further classification of DTC disbursed security instruments into (issue) asset types at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDisbursedSecurityAssetType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyAsstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityAssetType";
			definition = "Further classification of DTC disbursed security instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	protected AssetClass1Code dTCDisbursedSecurityAssetClass;
	/**
	 * Classification of DTC disbursed security instruments into asset classes
	 * at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code
	 * AssetClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3
	 * FinancialInstrumentAttributesSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDsbrsdSctyAsstClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCDisbursedSecurityAssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of DTC disbursed security instruments into asset classes at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDisbursedSecurityAssetClass = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyAsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityAssetClass";
			definition = "Classification of DTC disbursed security instruments into asset classes at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}
	};
	protected DecimalNumber babyBondDenomination;
	/**
	 * Dollar amount attributed to the bond when the par value is less than
	 * 1000.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3
	 * FinancialInstrumentAttributesSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BabyBdDnmtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BabyBondDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dollar amount attributed to the bond when the par value is less than 1000."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBabyBondDenomination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD3.mmObject();
			isDerived = false;
			xmlTag = "BabyBdDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BabyBondDenomination";
			definition = "Dollar amount attributed to the bond when the par value is less than 1000.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected YesNoIndicator disbursedSecurityEligibilityFlag;
	/**
	 * Indicates whether the disbursed security is eligible at CSD (for example
	 * in the US - DTC, The Depository Trust Corporation).
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD3
	 * FinancialInstrumentAttributesSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsbrsdSctyElgbltyFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursedSecurityEligibilityFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the disbursed security is eligible at CSD (for example in the US -  DTC, The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDisbursedSecurityEligibilityFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD3.mmObject();
			isDerived = false;
			xmlTag = "DsbrsdSctyElgbltyFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursedSecurityEligibilityFlag";
			definition = "Indicates whether the disbursed security is eligible at CSD (for example in the US -  DTC, The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD3.mmPlaceAndName, FinancialInstrumentAttributesSD3.mmDTCSecurityTransferableFlag, FinancialInstrumentAttributesSD3.mmCSDDisbursedSecurityDetails,
						FinancialInstrumentAttributesSD3.mmDTCDisbursedSecurityAssetType, FinancialInstrumentAttributesSD3.mmDTCDisbursedSecurityAssetClass, FinancialInstrumentAttributesSD3.mmBabyBondDenomination,
						FinancialInstrumentAttributesSD3.mmDisbursedSecurityEligibilityFlag);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributesSD3";
				definition = "Provides additional information regarding corporate action option securities movement security details.";
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

	@XmlElement(name = "DTCSctyTrfblFlg")
	public YesNoIndicator getDTCSecurityTransferableFlag() {
		return dTCSecurityTransferableFlag;
	}

	public void setDTCSecurityTransferableFlag(YesNoIndicator dTCSecurityTransferableFlag) {
		this.dTCSecurityTransferableFlag = dTCSecurityTransferableFlag;
	}

	@XmlElement(name = "CSDDsbrsdSctyDtls")
	public FinancialInstrumentAttributesSD4 getCSDDisbursedSecurityDetails() {
		return cSDDisbursedSecurityDetails;
	}

	public void setCSDDisbursedSecurityDetails(com.tools20022.repository.msg.FinancialInstrumentAttributesSD4 cSDDisbursedSecurityDetails) {
		this.cSDDisbursedSecurityDetails = cSDDisbursedSecurityDetails;
	}

	@XmlElement(name = "DTCDsbrsdSctyAsstTp")
	public DTCAssetType1Code getDTCDisbursedSecurityAssetType() {
		return dTCDisbursedSecurityAssetType;
	}

	public void setDTCDisbursedSecurityAssetType(DTCAssetType1Code dTCDisbursedSecurityAssetType) {
		this.dTCDisbursedSecurityAssetType = dTCDisbursedSecurityAssetType;
	}

	@XmlElement(name = "DTCDsbrsdSctyAsstClss")
	public AssetClass1Code getDTCDisbursedSecurityAssetClass() {
		return dTCDisbursedSecurityAssetClass;
	}

	public void setDTCDisbursedSecurityAssetClass(AssetClass1Code dTCDisbursedSecurityAssetClass) {
		this.dTCDisbursedSecurityAssetClass = dTCDisbursedSecurityAssetClass;
	}

	@XmlElement(name = "BabyBdDnmtn")
	public DecimalNumber getBabyBondDenomination() {
		return babyBondDenomination;
	}

	public void setBabyBondDenomination(DecimalNumber babyBondDenomination) {
		this.babyBondDenomination = babyBondDenomination;
	}

	@XmlElement(name = "DsbrsdSctyElgbltyFlg")
	public YesNoIndicator getDisbursedSecurityEligibilityFlag() {
		return disbursedSecurityEligibilityFlag;
	}

	public void setDisbursedSecurityEligibilityFlag(YesNoIndicator disbursedSecurityEligibilityFlag) {
		this.disbursedSecurityEligibilityFlag = disbursedSecurityEligibilityFlag;
	}
}