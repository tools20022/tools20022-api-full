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
import com.tools20022.repository.codeset.DTCBaseDisbursed1Code;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code;
import com.tools20022.repository.codeset.SecuritiesExitReason1Code;
import com.tools20022.repository.datatype.Exact32AlphaNumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Text;
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
 * movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmPlaceAndName
 * SecuritiesOptionSD6.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCPayMethod
 * SecuritiesOptionSD6.mmDTCPayMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCPayOrder
 * SecuritiesOptionSD6.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmReinvestmentIncomeClassification
 * SecuritiesOptionSD6.mmReinvestmentIncomeClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmEntitlementCalculationMethod
 * SecuritiesOptionSD6.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmPriceBasis
 * SecuritiesOptionSD6.mmPriceBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCExitExplanationIndicator
 * SecuritiesOptionSD6.mmDTCExitExplanationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmChargeFlag
 * SecuritiesOptionSD6.mmChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmProtectChargeFlag
 * SecuritiesOptionSD6.mmProtectChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmEstimatedPriceFlag
 * SecuritiesOptionSD6.mmEstimatedPriceFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCFractionalShareInstructionPeriod
 * SecuritiesOptionSD6.mmDTCFractionalShareInstructionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCUSTaxInstructionPeriod
 * SecuritiesOptionSD6.mmDTCUSTaxInstructionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmRDPReferenceNumber
 * SecuritiesOptionSD6.mmRDPReferenceNumber}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOptionSD6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7
 * SecuritiesOptionSD7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
 * SecuritiesOptionSD5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesOptionSD6", propOrder = {"placeAndName", "dTCPayMethod", "dTCPayOrder", "reinvestmentIncomeClassification", "entitlementCalculationMethod", "priceBasis", "dTCExitExplanationIndicator", "chargeFlag",
		"protectChargeFlag", "estimatedPriceFlag", "dTCFractionalShareInstructionPeriod", "dTCUSTaxInstructionPeriod", "rDPReferenceNumber"})
public class SecuritiesOptionSD6 {

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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmPlaceAndName
	 * SecuritiesOptionSD7.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmPlaceAndName
	 * SecuritiesOptionSD5.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmPlaceAndName);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "DTCPayMtd")
	protected Max3Text dTCPayMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Pay Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of payment. Used in stock dividends processing at DTC(The Depository Trust Corporation). Valid values list will be maintained separately from the schema."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmDTCPayMethod
	 * SecuritiesOptionSD7.mmDTCPayMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCPayMethod
	 * SecuritiesOptionSD5.mmDTCPayMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC(The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmDTCPayMethod);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmDTCPayMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	@XmlElement(name = "DTCPayOrdr")
	protected Max3Text dTCPayOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Pay Order</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmDTCPayOrder
	 * SecuritiesOptionSD7.mmDTCPayOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCPayOrder
	 * SecuritiesOptionSD5.mmDTCPayOrder}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayOrder = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Order"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmDTCPayOrder);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmDTCPayOrder;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	@XmlElement(name = "RinvstmtIncmClssfctn")
	protected ReinvestmentIncomeClassification2Code reinvestmentIncomeClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtIncmClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Reinvestment Income Classification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentIncomeClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income classification of the cash proceeds for dividend reinvestment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmReinvestmentIncomeClassification
	 * SecuritiesOptionSD7.mmReinvestmentIncomeClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmReinvestmentIncomeClassification
	 * SecuritiesOptionSD5.mmReinvestmentIncomeClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinvestmentIncomeClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtIncmClssfctn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Reinvestment Income Classification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentIncomeClassification";
			definition = "Income classification of the cash proceeds for dividend reinvestment.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmReinvestmentIncomeClassification);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmReinvestmentIncomeClassification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReinvestmentIncomeClassification2Code.mmObject();
		}
	};
	@XmlElement(name = "EntitlmntClctnMtd")
	protected DTCEntitlementCalculationMethod1Code entitlementCalculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Entitlement Calculation Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementCalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the entitlements were calculated optional dividends."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmEntitlementCalculationMethod
	 * SecuritiesOptionSD7.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmEntitlementCalculationMethod
	 * SecuritiesOptionSD5.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Entitlement Calculation Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmEntitlementCalculationMethod);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmEntitlementCalculationMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	@XmlElement(name = "PricBsis")
	protected DTCBaseDisbursed1Code priceBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCBaseDisbursed1Code
	 * DTCBaseDisbursed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Price Basis</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is based on either base or disbursed security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmPriceBasis
	 * SecuritiesOptionSD7.mmPriceBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmPriceBasis
	 * SecuritiesOptionSD5.mmPriceBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "PricBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Price Basis"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceBasis";
			definition = "Price is based on either base or disbursed security.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmPriceBasis);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmPriceBasis;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCBaseDisbursed1Code.mmObject();
		}
	};
	@XmlElement(name = "DTCExitExpltnInd")
	protected SecuritiesExitReason1Code dTCExitExplanationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesExitReason1Code
	 * SecuritiesExitReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCExitExpltnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Exit Explanation Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCExitExplanationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for DTC (The Depository Trust Corporation) to exit the shares."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmDTCExitExplanationIndicator
	 * SecuritiesOptionSD7.mmDTCExitExplanationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCExitExplanationIndicator
	 * SecuritiesOptionSD5.mmDTCExitExplanationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCExitExplanationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCExitExpltnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Exit Explanation Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCExitExplanationIndicator";
			definition = "Specifies the reason for DTC (The Depository Trust Corporation) to exit the shares.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmDTCExitExplanationIndicator);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmDTCExitExplanationIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecuritiesExitReason1Code.mmObject();
		}
	};
	@XmlElement(name = "ChrgFlg")
	protected YesNoIndicator chargeFlag;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Charge Indicator Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a DTC (The Depository Trust Corporation) participant, using one or more payment bonds in connection with a warrant exercise, will be charged (through settlement on exercise date) the value of the upcoming interest payment on the bond(s)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmChargeFlag
	 * SecuritiesOptionSD7.mmChargeFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmChargeFlag
	 * SecuritiesOptionSD5.mmChargeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "ChrgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Charge Indicator Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeFlag";
			definition = "Indicates whether a DTC (The Depository Trust Corporation) participant, using one or more payment bonds in connection with a warrant exercise, will be charged (through settlement on exercise date) the value of the upcoming interest payment on the bond(s).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmChargeFlag);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmChargeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PrtctChrgFlg")
	protected YesNoIndicator protectChargeFlag;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctChrgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Protect Charge Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectChargeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmProtectChargeFlag
	 * SecuritiesOptionSD7.mmProtectChargeFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmProtectChargeFlag
	 * SecuritiesOptionSD5.mmProtectChargeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Charge Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmProtectChargeFlag);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmProtectChargeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "EstmtdPricFlg")
	protected YesNoIndicator estimatedPriceFlag;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdPricFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Estimated Price Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPriceFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price from the offeror is estimated or final."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmEstimatedPriceFlag
	 * SecuritiesOptionSD7.mmEstimatedPriceFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmEstimatedPriceFlag
	 * SecuritiesOptionSD5.mmEstimatedPriceFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedPriceFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdPricFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Estimated Price Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedPriceFlag";
			definition = "Indicates whether the price from the offeror is estimated or final.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmEstimatedPriceFlag);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmEstimatedPriceFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DTCFrctnlShrInstrPrd")
	protected Period3 dTCFractionalShareInstructionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCFrctnlShrInstrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Fractional Share Instruction
	 * Expiration Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCFractionalShareInstructionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time period during which instructions regarding the disposition of fractional entitlements will be accepted at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmDTCFractionalShareInstructionPeriod
	 * SecuritiesOptionSD7.mmDTCFractionalShareInstructionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCFractionalShareInstructionPeriod
	 * SecuritiesOptionSD5.mmDTCFractionalShareInstructionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCFractionalShareInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCFrctnlShrInstrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Fractional Share Instruction Expiration Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFractionalShareInstructionPeriod";
			definition = "Time period during which instructions regarding the disposition of fractional entitlements will be accepted at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmDTCFractionalShareInstructionPeriod);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmDTCFractionalShareInstructionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};
	@XmlElement(name = "DTCUSTaxInstrPrd")
	protected Period3 dTCUSTaxInstructionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCUSTaxInstrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC NRA Tax Instruction Expiration Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCUSTaxInstructionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the period during which the instructions for US Tax service will be accepted at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmDTCUSTaxInstructionPeriod
	 * SecuritiesOptionSD7.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCUSTaxInstructionPeriod
	 * SecuritiesOptionSD5.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCUSTaxInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC NRA Tax Instruction Expiration Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for US Tax service will be accepted at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmDTCUSTaxInstructionPeriod);
			previousVersion_lazy = () -> SecuritiesOptionSD5.mmDTCUSTaxInstructionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};
	@XmlElement(name = "RDPRefNb")
	protected Exact32AlphaNumericText rDPReferenceNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
	 * SecuritiesOptionSD6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD7#mmRDPReferenceNumber
	 * SecuritiesOptionSD7.mmRDPReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRDPReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy records. The number algorhithm is as follows: Department ID (1:1), Activity Type (2:3), Cusip Country Code (5:2), Cusip (7:9), Record Date (15:8), Payable Date (22:8), Sequence Number (29:3), RDP Issue Type (31:1). \r\nUSAGE RULE: this sequence can be populated /extended to event details, option details or a movement, depending on sequence number coordinality to an event.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmRDPReferenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOptionSD6.mmPlaceAndName, com.tools20022.repository.msg.SecuritiesOptionSD6.mmDTCPayMethod,
						com.tools20022.repository.msg.SecuritiesOptionSD6.mmDTCPayOrder, com.tools20022.repository.msg.SecuritiesOptionSD6.mmReinvestmentIncomeClassification,
						com.tools20022.repository.msg.SecuritiesOptionSD6.mmEntitlementCalculationMethod, com.tools20022.repository.msg.SecuritiesOptionSD6.mmPriceBasis,
						com.tools20022.repository.msg.SecuritiesOptionSD6.mmDTCExitExplanationIndicator, com.tools20022.repository.msg.SecuritiesOptionSD6.mmChargeFlag, com.tools20022.repository.msg.SecuritiesOptionSD6.mmProtectChargeFlag,
						com.tools20022.repository.msg.SecuritiesOptionSD6.mmEstimatedPriceFlag, com.tools20022.repository.msg.SecuritiesOptionSD6.mmDTCFractionalShareInstructionPeriod,
						com.tools20022.repository.msg.SecuritiesOptionSD6.mmDTCUSTaxInstructionPeriod, com.tools20022.repository.msg.SecuritiesOptionSD6.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOptionSD6";
				definition = "Provides additional information regarding corporate action option securities movement details.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD7.mmObject());
				previousVersion_lazy = () -> SecuritiesOptionSD5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public SecuritiesOptionSD6 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<Max3Text> getDTCPayMethod() {
		return dTCPayMethod == null ? Optional.empty() : Optional.of(dTCPayMethod);
	}

	public SecuritiesOptionSD6 setDTCPayMethod(Max3Text dTCPayMethod) {
		this.dTCPayMethod = dTCPayMethod;
		return this;
	}

	public Optional<Max3Text> getDTCPayOrder() {
		return dTCPayOrder == null ? Optional.empty() : Optional.of(dTCPayOrder);
	}

	public SecuritiesOptionSD6 setDTCPayOrder(Max3Text dTCPayOrder) {
		this.dTCPayOrder = dTCPayOrder;
		return this;
	}

	public Optional<ReinvestmentIncomeClassification2Code> getReinvestmentIncomeClassification() {
		return reinvestmentIncomeClassification == null ? Optional.empty() : Optional.of(reinvestmentIncomeClassification);
	}

	public SecuritiesOptionSD6 setReinvestmentIncomeClassification(ReinvestmentIncomeClassification2Code reinvestmentIncomeClassification) {
		this.reinvestmentIncomeClassification = reinvestmentIncomeClassification;
		return this;
	}

	public Optional<DTCEntitlementCalculationMethod1Code> getEntitlementCalculationMethod() {
		return entitlementCalculationMethod == null ? Optional.empty() : Optional.of(entitlementCalculationMethod);
	}

	public SecuritiesOptionSD6 setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
		return this;
	}

	public Optional<DTCBaseDisbursed1Code> getPriceBasis() {
		return priceBasis == null ? Optional.empty() : Optional.of(priceBasis);
	}

	public SecuritiesOptionSD6 setPriceBasis(DTCBaseDisbursed1Code priceBasis) {
		this.priceBasis = priceBasis;
		return this;
	}

	public Optional<SecuritiesExitReason1Code> getDTCExitExplanationIndicator() {
		return dTCExitExplanationIndicator == null ? Optional.empty() : Optional.of(dTCExitExplanationIndicator);
	}

	public SecuritiesOptionSD6 setDTCExitExplanationIndicator(SecuritiesExitReason1Code dTCExitExplanationIndicator) {
		this.dTCExitExplanationIndicator = dTCExitExplanationIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getChargeFlag() {
		return chargeFlag == null ? Optional.empty() : Optional.of(chargeFlag);
	}

	public SecuritiesOptionSD6 setChargeFlag(YesNoIndicator chargeFlag) {
		this.chargeFlag = chargeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getProtectChargeFlag() {
		return protectChargeFlag == null ? Optional.empty() : Optional.of(protectChargeFlag);
	}

	public SecuritiesOptionSD6 setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getEstimatedPriceFlag() {
		return estimatedPriceFlag == null ? Optional.empty() : Optional.of(estimatedPriceFlag);
	}

	public SecuritiesOptionSD6 setEstimatedPriceFlag(YesNoIndicator estimatedPriceFlag) {
		this.estimatedPriceFlag = estimatedPriceFlag;
		return this;
	}

	public Optional<Period3> getDTCFractionalShareInstructionPeriod() {
		return dTCFractionalShareInstructionPeriod == null ? Optional.empty() : Optional.of(dTCFractionalShareInstructionPeriod);
	}

	public SecuritiesOptionSD6 setDTCFractionalShareInstructionPeriod(com.tools20022.repository.msg.Period3 dTCFractionalShareInstructionPeriod) {
		this.dTCFractionalShareInstructionPeriod = dTCFractionalShareInstructionPeriod;
		return this;
	}

	public Optional<Period3> getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod == null ? Optional.empty() : Optional.of(dTCUSTaxInstructionPeriod);
	}

	public SecuritiesOptionSD6 setDTCUSTaxInstructionPeriod(com.tools20022.repository.msg.Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
		return this;
	}

	public Optional<Exact32AlphaNumericText> getRDPReferenceNumber() {
		return rDPReferenceNumber == null ? Optional.empty() : Optional.of(rDPReferenceNumber);
	}

	public SecuritiesOptionSD6 setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
		return this;
	}
}