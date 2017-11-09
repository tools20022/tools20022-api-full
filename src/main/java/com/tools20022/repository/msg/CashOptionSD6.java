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
import com.tools20022.repository.choice.PriceFormatSD1Choice;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.datatype.Exact32AlphaNumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action option cash
 * movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD6#mmPlaceAndName
 * CashOptionSD6.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD6#mmDTCPayMethod
 * CashOptionSD6.mmDTCPayMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD6#mmDTCPayOrder
 * CashOptionSD6.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmEntitlementCalculationMethod
 * CashOptionSD6.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmEstimatedRateFlag
 * CashOptionSD6.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmNRATaxReportableFlag
 * CashOptionSD6.mmNRATaxReportableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmProtectChargeFlag
 * CashOptionSD6.mmProtectChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmDeclaredCashRate
 * CashOptionSD6.mmDeclaredCashRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmDeclaredGrossRate
 * CashOptionSD6.mmDeclaredGrossRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmDeclaredNetRate
 * CashOptionSD6.mmDeclaredNetRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmDeclaredFeeRate
 * CashOptionSD6.mmDeclaredFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmDTCUSTaxInstructionPeriod
 * CashOptionSD6.mmDTCUSTaxInstructionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD6#mmRDPReferenceNumber
 * CashOptionSD6.mmRDPReferenceNumber}</li>
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
 * "CashOptionSD6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option cash movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD8 CashOptionSD8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashOptionSD1
 * CashOptionSD1}</li>
 * </ul>
 */
public class CashOptionSD6 {

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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmPlaceAndName
	 * CashOptionSD8.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmPlaceAndName
	 * CashOptionSD1.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmPlaceAndName);
			previousVersion_lazy = () -> CashOptionSD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max3Text dTCPayMethod;
	/**
	 * Indicates the type of payment. Used in stock dividends processing at DTC
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
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
	 * "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDTCPayMethod
	 * CashOptionSD8.mmDTCPayMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmDTCPayMethod
	 * CashOptionSD1.mmDTCPayMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema. ";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmDTCPayMethod);
			previousVersion_lazy = () -> CashOptionSD1.mmDTCPayMethod;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
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
	 * "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDTCPayOrder
	 * CashOptionSD8.mmDTCPayOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmDTCPayOrder
	 * CashOptionSD1.mmDTCPayOrder}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayOrder = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmDTCPayOrder);
			previousVersion_lazy = () -> CashOptionSD1.mmDTCPayOrder;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmEntitlementCalculationMethod
	 * CashOptionSD8.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmEntitlementCalculationMethod
	 * CashOptionSD1.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmEntitlementCalculationMethod);
			previousVersion_lazy = () -> CashOptionSD1.mmEntitlementCalculationMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	protected YesNoIndicator estimatedRateFlag;
	/**
	 * Denotes whether the rate is approximate.
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdRateFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedRateFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denotes whether the rate is approximate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmEstimatedRateFlag
	 * CashOptionSD8.mmEstimatedRateFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmEstimatedRateFlag
	 * CashOptionSD1.mmEstimatedRateFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedRateFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmEstimatedRateFlag);
			previousVersion_lazy = () -> CashOptionSD1.mmEstimatedRateFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator nRATaxReportableFlag;
	/**
	 * Identifies the income events which are subject to withholding tax if paid
	 * to a non-U.S. resident alien (NRA).
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NRATaxRptblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NRATaxReportableFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmNRATaxReportableFlag
	 * CashOptionSD8.mmNRATaxReportableFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmNRATaxReportableFlag
	 * CashOptionSD1.mmNRATaxReportableFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNRATaxReportableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "NRATaxRptblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATaxReportableFlag";
			definition = "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA).";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmNRATaxReportableFlag);
			previousVersion_lazy = () -> CashOptionSD1.mmNRATaxReportableFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmProtectChargeFlag
	 * CashOptionSD8.mmProtectChargeFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmProtectChargeFlag
	 * CashOptionSD1.mmProtectChargeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmProtectChargeFlag);
			previousVersion_lazy = () -> CashOptionSD1.mmProtectChargeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PriceFormatSD1Choice declaredCashRate;
	/**
	 * Cash rate associated to the payout as declared on the market by the
	 * issuer or offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdCshRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredCashRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate associated to the payout as declared  on the market by the issuer or offeror."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDeclaredCashRate
	 * CashOptionSD8.mmDeclaredCashRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmDeclaredCashRate
	 * CashOptionSD1.mmDeclaredCashRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredCashRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DclrdCshRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredCashRate";
			definition = "Cash rate associated to the payout as declared  on the market by the issuer or offeror.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmDeclaredCashRate);
			previousVersion_lazy = () -> CashOptionSD1.mmDeclaredCashRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}
	};
	protected PriceFormatSD1Choice declaredGrossRate;
	/**
	 * Gross cash rate associated to the payout as declared on the market by the
	 * issuer or offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdGrssRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredGrossRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Gross cash rate associated to the payout as declared on the market by the issuer or offeror."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDeclaredGrossRate
	 * CashOptionSD8.mmDeclaredGrossRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmDeclaredGrossRate
	 * CashOptionSD1.mmDeclaredGrossRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredGrossRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DclrdGrssRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredGrossRate";
			definition = "Gross cash rate associated to the payout as declared on the market by the issuer or offeror.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmDeclaredGrossRate);
			previousVersion_lazy = () -> CashOptionSD1.mmDeclaredGrossRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}
	};
	protected PriceFormatSD1Choice declaredNetRate;
	/**
	 * Net cash rate associated to the payout as declared on the market by the
	 * issuer or offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdNetRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredNetRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash rate associated to the payout as declared on the market by the issuer or offeror."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDeclaredNetRate
	 * CashOptionSD8.mmDeclaredNetRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmDeclaredNetRate
	 * CashOptionSD1.mmDeclaredNetRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredNetRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DclrdNetRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredNetRate";
			definition = "Net cash rate associated to the payout as declared on the market by the issuer or offeror.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmDeclaredNetRate);
			previousVersion_lazy = () -> CashOptionSD1.mmDeclaredNetRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}
	};
	protected PriceFormatSD1Choice declaredFeeRate;
	/**
	 * Rate at which the fee will be charged to a DTC participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the fee will be charged to a DTC participant."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDeclaredFeeRate
	 * CashOptionSD8.mmDeclaredFeeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmDeclaredFeeRate
	 * CashOptionSD1.mmDeclaredFeeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredFeeRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DclrdFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredFeeRate";
			definition = "Rate at which the fee will be charged to a DTC participant.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmDeclaredFeeRate);
			previousVersion_lazy = () -> CashOptionSD1.mmDeclaredFeeRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}
	};
	protected Period3 dTCUSTaxInstructionPeriod;
	/**
	 * Indicates the period during which the instructions for DTC (The
	 * Depository Trust Corporation) US Tax service will be accepted.
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
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
	 * "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDTCUSTaxInstructionPeriod
	 * CashOptionSD8.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD1#mmDTCUSTaxInstructionPeriod
	 * CashOptionSD1.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCUSTaxInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmDTCUSTaxInstructionPeriod);
			previousVersion_lazy = () -> CashOptionSD1.mmDTCUSTaxInstructionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD6 CashOptionSD6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmRDPReferenceNumber
	 * CashOptionSD8.mmRDPReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRDPReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD6.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy records. The number algorhithm is as follows: Department ID (1:1), Activity Type (2:3), Cusip Country Code (5:2), Cusip (7:9), Record Date (15:8), Payable Date (22:8), Sequence Number (29:3), RDP Issue Type (31:1). \r\nUSAGE RULE: this sequence can be populated /extended to event details, option details or a movement, depending on sequence number coordinality to an event.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmRDPReferenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashOptionSD6.mmPlaceAndName, CashOptionSD6.mmDTCPayMethod, CashOptionSD6.mmDTCPayOrder, CashOptionSD6.mmEntitlementCalculationMethod, CashOptionSD6.mmEstimatedRateFlag,
						CashOptionSD6.mmNRATaxReportableFlag, CashOptionSD6.mmProtectChargeFlag, CashOptionSD6.mmDeclaredCashRate, CashOptionSD6.mmDeclaredGrossRate, CashOptionSD6.mmDeclaredNetRate, CashOptionSD6.mmDeclaredFeeRate,
						CashOptionSD6.mmDTCUSTaxInstructionPeriod, CashOptionSD6.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOptionSD6";
				definition = "Provides additional information regarding corporate action option cash movement details.";
				nextVersions_lazy = () -> Arrays.asList(CashOptionSD8.mmObject());
				previousVersion_lazy = () -> CashOptionSD1.mmObject();
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

	public Max3Text getDTCPayMethod() {
		return dTCPayMethod;
	}

	public void setDTCPayMethod(Max3Text dTCPayMethod) {
		this.dTCPayMethod = dTCPayMethod;
	}

	public Max3Text getDTCPayOrder() {
		return dTCPayOrder;
	}

	public void setDTCPayOrder(Max3Text dTCPayOrder) {
		this.dTCPayOrder = dTCPayOrder;
	}

	public DTCEntitlementCalculationMethod1Code getEntitlementCalculationMethod() {
		return entitlementCalculationMethod;
	}

	public void setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
	}

	public YesNoIndicator getEstimatedRateFlag() {
		return estimatedRateFlag;
	}

	public void setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
	}

	public YesNoIndicator getNRATaxReportableFlag() {
		return nRATaxReportableFlag;
	}

	public void setNRATaxReportableFlag(YesNoIndicator nRATaxReportableFlag) {
		this.nRATaxReportableFlag = nRATaxReportableFlag;
	}

	public YesNoIndicator getProtectChargeFlag() {
		return protectChargeFlag;
	}

	public void setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
	}

	public PriceFormatSD1Choice getDeclaredCashRate() {
		return declaredCashRate;
	}

	public void setDeclaredCashRate(PriceFormatSD1Choice declaredCashRate) {
		this.declaredCashRate = declaredCashRate;
	}

	public PriceFormatSD1Choice getDeclaredGrossRate() {
		return declaredGrossRate;
	}

	public void setDeclaredGrossRate(PriceFormatSD1Choice declaredGrossRate) {
		this.declaredGrossRate = declaredGrossRate;
	}

	public PriceFormatSD1Choice getDeclaredNetRate() {
		return declaredNetRate;
	}

	public void setDeclaredNetRate(PriceFormatSD1Choice declaredNetRate) {
		this.declaredNetRate = declaredNetRate;
	}

	public PriceFormatSD1Choice getDeclaredFeeRate() {
		return declaredFeeRate;
	}

	public void setDeclaredFeeRate(PriceFormatSD1Choice declaredFeeRate) {
		this.declaredFeeRate = declaredFeeRate;
	}

	public Period3 getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod;
	}

	public void setDTCUSTaxInstructionPeriod(com.tools20022.repository.msg.Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
	}

	public Exact32AlphaNumericText getRDPReferenceNumber() {
		return rDPReferenceNumber;
	}

	public void setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
	}
}