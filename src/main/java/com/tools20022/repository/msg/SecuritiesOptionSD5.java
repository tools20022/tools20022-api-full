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
import com.tools20022.repository.codeset.DTCBaseDisbursed1Code;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code;
import com.tools20022.repository.codeset.SecuritiesExitReason1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Text;
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
 * movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmPlaceAndName
 * SecuritiesOptionSD5.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCPayMethod
 * SecuritiesOptionSD5.mmDTCPayMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCPayOrder
 * SecuritiesOptionSD5.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmReinvestmentIncomeClassification
 * SecuritiesOptionSD5.mmReinvestmentIncomeClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmEntitlementCalculationMethod
 * SecuritiesOptionSD5.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmPriceBasis
 * SecuritiesOptionSD5.mmPriceBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCExitExplanationIndicator
 * SecuritiesOptionSD5.mmDTCExitExplanationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmChargeFlag
 * SecuritiesOptionSD5.mmChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmProtectChargeFlag
 * SecuritiesOptionSD5.mmProtectChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmEstimatedPriceFlag
 * SecuritiesOptionSD5.mmEstimatedPriceFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCFractionalShareInstructionPeriod
 * SecuritiesOptionSD5.mmDTCFractionalShareInstructionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5#mmDTCUSTaxInstructionPeriod
 * SecuritiesOptionSD5.mmDTCUSTaxInstructionPeriod}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOptionSD5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6
 * SecuritiesOptionSD6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
 * SecuritiesOptionSD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesOptionSD5", propOrder = {"placeAndName", "DTCPayMethod", "DTCPayOrder", "reinvestmentIncomeClassification", "entitlementCalculationMethod", "priceBasis", "DTCExitExplanationIndicator", "chargeFlag",
		"protectChargeFlag", "estimatedPriceFlag", "DTCFractionalShareInstructionPeriod", "DTCUSTaxInstructionPeriod"})
public class SecuritiesOptionSD5 {

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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmPlaceAndName
	 * SecuritiesOptionSD6.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max3Text dTCPayMethod;
	/**
	 * Indicates the type of payment. Used in stock dividends processing at
	 * DTC(The Depository Trust Corporation). Valid values list will be
	 * maintained separately from the schema.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of payment. Used in stock dividends processing at DTC(The Depository Trust Corporation). Valid values list will be maintained separately from the schema. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCPayMethod
	 * SecuritiesOptionSD6.mmDTCPayMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC(The Depository Trust Corporation). Valid values list will be maintained separately from the schema. ";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmDTCPayMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	protected Max3Text dTCPayOrder;
	/**
	 * Indicates the payment order. Used in stock dividends processing at DTC
	 * (The Depository Trust Corporation). Valid values list will be maintained
	 * separately from the schema.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation).  Valid values list will be maintained separately from the schema."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCPayOrder
	 * SecuritiesOptionSD6.mmDTCPayOrder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayOrder = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation).  Valid values list will be maintained separately from the schema.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmDTCPayOrder);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	protected ReinvestmentIncomeClassification1Code reinvestmentIncomeClassification;
	/**
	 * Income classification of the cash proceeds for dividend reinvestment .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtIncmClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentIncomeClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income classification of the cash proceeds for dividend reinvestment ."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmReinvestmentIncomeClassification
	 * SecuritiesOptionSD6.mmReinvestmentIncomeClassification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinvestmentIncomeClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtIncmClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentIncomeClassification";
			definition = "Income classification of the cash proceeds for dividend reinvestment .";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmReinvestmentIncomeClassification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReinvestmentIncomeClassification1Code.mmObject();
		}
	};
	protected DTCEntitlementCalculationMethod1Code entitlementCalculationMethod;
	/**
	 * Indicates how the entitlements were calculated optional dividends.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntClctnMtd"</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmEntitlementCalculationMethod
	 * SecuritiesOptionSD6.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmEntitlementCalculationMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	protected DTCBaseDisbursed1Code priceBasis;
	/**
	 * Price is based on either base or disbursed security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is based on either base or disbursed security. "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmPriceBasis
	 * SecuritiesOptionSD6.mmPriceBasis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "PricBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceBasis";
			definition = "Price is based on either base or disbursed security. ";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmPriceBasis);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCBaseDisbursed1Code.mmObject();
		}
	};
	protected SecuritiesExitReason1Code dTCExitExplanationIndicator;
	/**
	 * Specifies the reason for DTC (The Depository Trust Corporation) to exit
	 * the shares.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCExitExpltnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCExitExplanationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for DTC (The Depository Trust Corporation) to exit the shares. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCExitExplanationIndicator
	 * SecuritiesOptionSD6.mmDTCExitExplanationIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCExitExplanationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCExitExpltnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCExitExplanationIndicator";
			definition = "Specifies the reason for DTC (The Depository Trust Corporation) to exit the shares. ";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmDTCExitExplanationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecuritiesExitReason1Code.mmObject();
		}
	};
	protected YesNoIndicator chargeFlag;
	/**
	 * Indicates whether a DTC (The Depository Trust Corporation) participant,
	 * using one or more payment bonds in connection with a warrant exercise,
	 * will be charged (through settlement on exercise date) the value of the
	 * upcoming interest payment on the bond(s).
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgFlg"</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmChargeFlag
	 * SecuritiesOptionSD6.mmChargeFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "ChrgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeFlag";
			definition = "Indicates whether a DTC (The Depository Trust Corporation) participant, using one or more payment bonds in connection with a warrant exercise, will be charged (through settlement on exercise date) the value of the upcoming interest payment on the bond(s).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmChargeFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator protectChargeFlag;
	/**
	 * Indicates whether a charge is levied on the protect instructions at the
	 * time when the protect is submitted or at the time of the cover. Applies
	 * to warrants or rights exercise scenario where the holder must put up
	 * money with rights or warrants execution. When this flag is set to yes -
	 * charges are due at the time of the protect, when it is set to "no"
	 * changes are due when protect is covered.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctChrgFlg"</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmProtectChargeFlag
	 * SecuritiesOptionSD6.mmProtectChargeFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmProtectChargeFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator estimatedPriceFlag;
	/**
	 * Indicates whether the price from the offeror is estimated or final.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdPricFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPriceFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price from the offeror is estimated or final. "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmEstimatedPriceFlag
	 * SecuritiesOptionSD6.mmEstimatedPriceFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedPriceFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "EstmtdPricFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedPriceFlag";
			definition = "Indicates whether the price from the offeror is estimated or final. ";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmEstimatedPriceFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Period3 dTCFractionalShareInstructionPeriod;
	/**
	 * Time period during which instructions regarding the disposition of
	 * fractional entitlements will be accepted at DTC (The Depository Trust
	 * Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCFrctnlShrInstrPrd"</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCFractionalShareInstructionPeriod
	 * SecuritiesOptionSD6.mmDTCFractionalShareInstructionPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCFractionalShareInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCFrctnlShrInstrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFractionalShareInstructionPeriod";
			definition = "Time period during which instructions regarding the disposition of fractional entitlements will be accepted at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmDTCFractionalShareInstructionPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};
	protected Period3 dTCUSTaxInstructionPeriod;
	/**
	 * Indicates the period during which the instructions for US Tax service
	 * will be accepted at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
	 * SecuritiesOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCUSTaxInstrPrd"</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD6#mmDTCUSTaxInstructionPeriod
	 * SecuritiesOptionSD6.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCUSTaxInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for US Tax service will be accepted at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmDTCUSTaxInstructionPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesOptionSD5.mmPlaceAndName, SecuritiesOptionSD5.mmDTCPayMethod, SecuritiesOptionSD5.mmDTCPayOrder, SecuritiesOptionSD5.mmReinvestmentIncomeClassification,
						SecuritiesOptionSD5.mmEntitlementCalculationMethod, SecuritiesOptionSD5.mmPriceBasis, SecuritiesOptionSD5.mmDTCExitExplanationIndicator, SecuritiesOptionSD5.mmChargeFlag, SecuritiesOptionSD5.mmProtectChargeFlag,
						SecuritiesOptionSD5.mmEstimatedPriceFlag, SecuritiesOptionSD5.mmDTCFractionalShareInstructionPeriod, SecuritiesOptionSD5.mmDTCUSTaxInstructionPeriod);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesOptionSD5";
				definition = "Provides additional information regarding corporate action option securities movement details.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD6.mmObject());
				previousVersion_lazy = () -> SecuritiesOptionSD2.mmObject();
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

	@XmlElement(name = "DTCPayMtd")
	public Max3Text getDTCPayMethod() {
		return dTCPayMethod;
	}

	public void setDTCPayMethod(Max3Text dTCPayMethod) {
		this.dTCPayMethod = dTCPayMethod;
	}

	@XmlElement(name = "DTCPayOrdr")
	public Max3Text getDTCPayOrder() {
		return dTCPayOrder;
	}

	public void setDTCPayOrder(Max3Text dTCPayOrder) {
		this.dTCPayOrder = dTCPayOrder;
	}

	@XmlElement(name = "RinvstmtIncmClssfctn")
	public ReinvestmentIncomeClassification1Code getReinvestmentIncomeClassification() {
		return reinvestmentIncomeClassification;
	}

	public void setReinvestmentIncomeClassification(ReinvestmentIncomeClassification1Code reinvestmentIncomeClassification) {
		this.reinvestmentIncomeClassification = reinvestmentIncomeClassification;
	}

	@XmlElement(name = "EntitlmntClctnMtd")
	public DTCEntitlementCalculationMethod1Code getEntitlementCalculationMethod() {
		return entitlementCalculationMethod;
	}

	public void setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
	}

	@XmlElement(name = "PricBsis")
	public DTCBaseDisbursed1Code getPriceBasis() {
		return priceBasis;
	}

	public void setPriceBasis(DTCBaseDisbursed1Code priceBasis) {
		this.priceBasis = priceBasis;
	}

	@XmlElement(name = "DTCExitExpltnInd")
	public SecuritiesExitReason1Code getDTCExitExplanationIndicator() {
		return dTCExitExplanationIndicator;
	}

	public void setDTCExitExplanationIndicator(SecuritiesExitReason1Code dTCExitExplanationIndicator) {
		this.dTCExitExplanationIndicator = dTCExitExplanationIndicator;
	}

	@XmlElement(name = "ChrgFlg")
	public YesNoIndicator getChargeFlag() {
		return chargeFlag;
	}

	public void setChargeFlag(YesNoIndicator chargeFlag) {
		this.chargeFlag = chargeFlag;
	}

	@XmlElement(name = "PrtctChrgFlg")
	public YesNoIndicator getProtectChargeFlag() {
		return protectChargeFlag;
	}

	public void setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
	}

	@XmlElement(name = "EstmtdPricFlg")
	public YesNoIndicator getEstimatedPriceFlag() {
		return estimatedPriceFlag;
	}

	public void setEstimatedPriceFlag(YesNoIndicator estimatedPriceFlag) {
		this.estimatedPriceFlag = estimatedPriceFlag;
	}

	@XmlElement(name = "DTCFrctnlShrInstrPrd")
	public Period3 getDTCFractionalShareInstructionPeriod() {
		return dTCFractionalShareInstructionPeriod;
	}

	public void setDTCFractionalShareInstructionPeriod(com.tools20022.repository.msg.Period3 dTCFractionalShareInstructionPeriod) {
		this.dTCFractionalShareInstructionPeriod = dTCFractionalShareInstructionPeriod;
	}

	@XmlElement(name = "DTCUSTaxInstrPrd")
	public Period3 getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod;
	}

	public void setDTCUSTaxInstructionPeriod(com.tools20022.repository.msg.Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
	}
}