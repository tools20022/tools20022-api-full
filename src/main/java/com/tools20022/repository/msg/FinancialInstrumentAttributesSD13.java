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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AssetClass1Code;
import com.tools20022.repository.codeset.DTCAssetType2Code;
import com.tools20022.repository.datatype.DecimalNumber;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmPlaceAndName
 * FinancialInstrumentAttributesSD13.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmDTCSecurityTransferableFlag
 * FinancialInstrumentAttributesSD13.mmDTCSecurityTransferableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmDeclaredDisbursedSecurityDetails
 * FinancialInstrumentAttributesSD13.mmDeclaredDisbursedSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmDTCDisbursedSecurityAssetType
 * FinancialInstrumentAttributesSD13.mmDTCDisbursedSecurityAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmDTCDisbursedSecurityAssetClass
 * FinancialInstrumentAttributesSD13.mmDTCDisbursedSecurityAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13#mmBabyBondDenomination
 * FinancialInstrumentAttributesSD13.mmBabyBondDenomination}</li>
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
 * "FinancialInstrumentAttributesSD13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement security details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1
 * FinancialInstrumentAttributesSD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributesSD13", propOrder = {"placeAndName", "dTCSecurityTransferableFlag", "declaredDisbursedSecurityDetails", "dTCDisbursedSecurityAssetType", "dTCDisbursedSecurityAssetClass", "babyBondDenomination"})
public class FinancialInstrumentAttributesSD13 {

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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13
	 * FinancialInstrumentAttributesSD13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmPlaceAndName
	 * FinancialInstrumentAttributesSD1.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "DTCSctyTrfblFlg")
	protected YesNoIndicator dTCSecurityTransferableFlag;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13
	 * FinancialInstrumentAttributesSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCSctyTrfblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Security Transferable Flag</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmDTCSecurityTransferableFlag
	 * FinancialInstrumentAttributesSD1.mmDTCSecurityTransferableFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCSecurityTransferableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmObject();
			isDerived = false;
			xmlTag = "DTCSctyTrfblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Security Transferable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCSecurityTransferableFlag";
			definition = "Indicates whether or not the newly issued securities are transferable by the agent. This flag is specific to DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD1.mmDTCSecurityTransferableFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DclrdDsbrsdSctyDtls")
	protected FinancialInstrumentAttributesSD2 declaredDisbursedSecurityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2
	 * FinancialInstrumentAttributesSD2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13
	 * FinancialInstrumentAttributesSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdDsbrsdSctyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTCC Disbursed Security Details</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmDeclaredDisbursedSecurityDetails
	 * FinancialInstrumentAttributesSD1.mmDeclaredDisbursedSecurityDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeclaredDisbursedSecurityDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmObject();
			isDerived = false;
			xmlTag = "DclrdDsbrsdSctyDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTCC Disbursed Security Details"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredDisbursedSecurityDetails";
			definition = "Details of security that is being distributed as a result of a corporate action as declared by the issuer or offeror on the market.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD1.mmDeclaredDisbursedSecurityDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD2.mmObject();
		}
	};
	@XmlElement(name = "DTCDsbrsdSctyAsstTp")
	protected DTCAssetType2Code dTCDisbursedSecurityAssetType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13
	 * FinancialInstrumentAttributesSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDsbrsdSctyAsstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Disbursed Security Asset Type</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmDTCDisbursedSecurityAssetType
	 * FinancialInstrumentAttributesSD1.mmDTCDisbursedSecurityAssetType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDisbursedSecurityAssetType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyAsstTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Disbursed Security Asset Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityAssetType";
			definition = "Further classification of DTC disbursed security instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD1.mmDTCDisbursedSecurityAssetType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType2Code.mmObject();
		}
	};
	@XmlElement(name = "DTCDsbrsdSctyAsstClss")
	protected AssetClass1Code dTCDisbursedSecurityAssetClass;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13
	 * FinancialInstrumentAttributesSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDsbrsdSctyAsstClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Disbursed Security Asset Class</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmDTCDisbursedSecurityAssetClass
	 * FinancialInstrumentAttributesSD1.mmDTCDisbursedSecurityAssetClass}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDisbursedSecurityAssetClass = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyAsstClss";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Disbursed Security Asset Class"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityAssetClass";
			definition = "Classification of DTC disbursed security instruments into asset classes at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD1.mmDTCDisbursedSecurityAssetClass;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}
	};
	@XmlElement(name = "BabyBdDnmtn")
	protected DecimalNumber babyBondDenomination;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD13
	 * FinancialInstrumentAttributesSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BabyBdDnmtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Baby Bond Denomination</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD1#mmBabyBondDenomination
	 * FinancialInstrumentAttributesSD1.mmBabyBondDenomination}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBabyBondDenomination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmObject();
			isDerived = false;
			xmlTag = "BabyBdDnmtn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Baby Bond Denomination"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BabyBondDenomination";
			definition = "Dollar amount attributed to the bond when the par value is less than 1000.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD1.mmBabyBondDenomination;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmPlaceAndName, com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmDTCSecurityTransferableFlag,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmDeclaredDisbursedSecurityDetails, com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmDTCDisbursedSecurityAssetType,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmDTCDisbursedSecurityAssetClass, com.tools20022.repository.msg.FinancialInstrumentAttributesSD13.mmBabyBondDenomination);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentAttributesSD13";
				definition = "Provides additional information regarding corporate action option securities movement security details.";
				previousVersion_lazy = () -> FinancialInstrumentAttributesSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public FinancialInstrumentAttributesSD13 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<YesNoIndicator> getDTCSecurityTransferableFlag() {
		return dTCSecurityTransferableFlag == null ? Optional.empty() : Optional.of(dTCSecurityTransferableFlag);
	}

	public FinancialInstrumentAttributesSD13 setDTCSecurityTransferableFlag(YesNoIndicator dTCSecurityTransferableFlag) {
		this.dTCSecurityTransferableFlag = dTCSecurityTransferableFlag;
		return this;
	}

	public Optional<FinancialInstrumentAttributesSD2> getDeclaredDisbursedSecurityDetails() {
		return declaredDisbursedSecurityDetails == null ? Optional.empty() : Optional.of(declaredDisbursedSecurityDetails);
	}

	public FinancialInstrumentAttributesSD13 setDeclaredDisbursedSecurityDetails(com.tools20022.repository.msg.FinancialInstrumentAttributesSD2 declaredDisbursedSecurityDetails) {
		this.declaredDisbursedSecurityDetails = declaredDisbursedSecurityDetails;
		return this;
	}

	public Optional<DTCAssetType2Code> getDTCDisbursedSecurityAssetType() {
		return dTCDisbursedSecurityAssetType == null ? Optional.empty() : Optional.of(dTCDisbursedSecurityAssetType);
	}

	public FinancialInstrumentAttributesSD13 setDTCDisbursedSecurityAssetType(DTCAssetType2Code dTCDisbursedSecurityAssetType) {
		this.dTCDisbursedSecurityAssetType = dTCDisbursedSecurityAssetType;
		return this;
	}

	public Optional<AssetClass1Code> getDTCDisbursedSecurityAssetClass() {
		return dTCDisbursedSecurityAssetClass == null ? Optional.empty() : Optional.of(dTCDisbursedSecurityAssetClass);
	}

	public FinancialInstrumentAttributesSD13 setDTCDisbursedSecurityAssetClass(AssetClass1Code dTCDisbursedSecurityAssetClass) {
		this.dTCDisbursedSecurityAssetClass = dTCDisbursedSecurityAssetClass;
		return this;
	}

	public Optional<DecimalNumber> getBabyBondDenomination() {
		return babyBondDenomination == null ? Optional.empty() : Optional.of(babyBondDenomination);
	}

	public FinancialInstrumentAttributesSD13 setBabyBondDenomination(DecimalNumber babyBondDenomination) {
		this.babyBondDenomination = babyBondDenomination;
		return this;
	}
}