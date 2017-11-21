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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmPlaceAndName
 * FinancialInstrumentAttributesSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmDTCSecurityTransferableFlag
 * FinancialInstrumentAttributesSD1.mmDTCSecurityTransferableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmDeclaredDisbursedSecurityDetails
 * FinancialInstrumentAttributesSD1.mmDeclaredDisbursedSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmDTCDisbursedSecurityAssetType
 * FinancialInstrumentAttributesSD1.mmDTCDisbursedSecurityAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmDTCDisbursedSecurityAssetClass
 * FinancialInstrumentAttributesSD1.mmDTCDisbursedSecurityAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmBabyBondDenomination
 * FinancialInstrumentAttributesSD1.mmBabyBondDenomination}</li>
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
 * "FinancialInstrumentAttributesSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement security details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13
 * FinancialInstrumentAttributesSD13}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentAttributesSD1", propOrder = {"placeAndName", "DTCSecurityTransferableFlag", "declaredDisbursedSecurityDetails", "DTCDisbursedSecurityAssetType", "DTCDisbursedSecurityAssetClass", "babyBondDenomination"})
public class FinancialInstrumentAttributesSD1 {

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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1
	 * FinancialInstrumentAttributesSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmPlaceAndName
	 * FinancialInstrumentAttributesSD13.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD13.mmPlaceAndName);
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1
	 * FinancialInstrumentAttributesSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmDTCSecurityTransferableFlag
	 * FinancialInstrumentAttributesSD13.mmDTCSecurityTransferableFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCSecurityTransferableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCSctyTrfblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCSecurityTransferableFlag";
			definition = "Indicates whether or not the newly issued securities are transferable by the agent. This flag is specific to DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD13.mmDTCSecurityTransferableFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected FinancialInstrumentAttributesSD2 declaredDisbursedSecurityDetails;
	/**
	 * Details of security that is being distributed as a result of a corporate
	 * action as declared by the issuer or offeror on the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2
	 * FinancialInstrumentAttributesSD2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1
	 * FinancialInstrumentAttributesSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdDsbrsdSctyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredDisbursedSecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of security that is being distributed as a result of a corporate action as declared by the issuer or offeror on the market."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmDeclaredDisbursedSecurityDetails
	 * FinancialInstrumentAttributesSD13.mmDeclaredDisbursedSecurityDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeclaredDisbursedSecurityDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "DclrdDsbrsdSctyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredDisbursedSecurityDetails";
			definition = "Details of security that is being distributed as a result of a corporate action as declared by the issuer or offeror on the market.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD13.mmDeclaredDisbursedSecurityDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1
	 * FinancialInstrumentAttributesSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmDTCDisbursedSecurityAssetType
	 * FinancialInstrumentAttributesSD13.mmDTCDisbursedSecurityAssetType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDisbursedSecurityAssetType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyAsstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityAssetType";
			definition = "Further classification of DTC disbursed security instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD13.mmDTCDisbursedSecurityAssetType);
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1
	 * FinancialInstrumentAttributesSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmDTCDisbursedSecurityAssetClass
	 * FinancialInstrumentAttributesSD13.mmDTCDisbursedSecurityAssetClass}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDisbursedSecurityAssetClass = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyAsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityAssetClass";
			definition = "Classification of DTC disbursed security instruments into asset classes at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD13.mmDTCDisbursedSecurityAssetClass);
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1
	 * FinancialInstrumentAttributesSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmBabyBondDenomination
	 * FinancialInstrumentAttributesSD13.mmBabyBondDenomination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBabyBondDenomination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD1.mmObject();
			isDerived = false;
			xmlTag = "BabyBdDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BabyBondDenomination";
			definition = "Dollar amount attributed to the bond when the par value is less than 1000.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD13.mmBabyBondDenomination);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD1.mmPlaceAndName, FinancialInstrumentAttributesSD1.mmDTCSecurityTransferableFlag, FinancialInstrumentAttributesSD1.mmDeclaredDisbursedSecurityDetails,
						FinancialInstrumentAttributesSD1.mmDTCDisbursedSecurityAssetType, FinancialInstrumentAttributesSD1.mmDTCDisbursedSecurityAssetClass, FinancialInstrumentAttributesSD1.mmBabyBondDenomination);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributesSD1";
				definition = "Provides additional information regarding corporate action option securities movement security details.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD13.mmObject());
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

	@XmlElement(name = "DclrdDsbrsdSctyDtls")
	public FinancialInstrumentAttributesSD2 getDeclaredDisbursedSecurityDetails() {
		return declaredDisbursedSecurityDetails;
	}

	public void setDeclaredDisbursedSecurityDetails(com.tools20022.repository.msg.FinancialInstrumentAttributesSD2 declaredDisbursedSecurityDetails) {
		this.declaredDisbursedSecurityDetails = declaredDisbursedSecurityDetails;
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
}