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
import com.tools20022.repository.choice.PriceFormatSD2Choice;
import com.tools20022.repository.codeset.DTCCPayoutType5Code;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.datatype.Exact32AlphaNumericText;
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
 * Provides additional information regarding corporate action option cash
 * movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD10#mmPlaceAndName
 * CashOptionSD10.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD10#mmPayoutType
 * CashOptionSD10.mmPayoutType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDTCPayMethod
 * CashOptionSD10.mmDTCPayMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDTCPayOrder
 * CashOptionSD10.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmEntitlementCalculationMethod
 * CashOptionSD10.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmEstimatedRateFlag
 * CashOptionSD10.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmNRATaxReportableFlag
 * CashOptionSD10.mmNRATaxReportableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmProtectChargeFlag
 * CashOptionSD10.mmProtectChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDeclaredCashRate
 * CashOptionSD10.mmDeclaredCashRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDeclaredGrossRate
 * CashOptionSD10.mmDeclaredGrossRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDeclaredNetRate
 * CashOptionSD10.mmDeclaredNetRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDeclaredFeeRate
 * CashOptionSD10.mmDeclaredFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDTCUSTaxInstructionPeriod
 * CashOptionSD10.mmDTCUSTaxInstructionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmRDPReferenceNumber
 * CashOptionSD10.mmRDPReferenceNumber}</li>
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
 * "CashOptionSD10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option cash movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashOptionSD9
 * CashOptionSD9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CashOptionSD10", propOrder = {"placeAndName", "payoutType", "DTCPayMethod", "DTCPayOrder", "entitlementCalculationMethod", "estimatedRateFlag", "NRATaxReportableFlag", "protectChargeFlag", "declaredCashRate",
		"declaredGrossRate", "declaredNetRate", "declaredFeeRate", "DTCUSTaxInstructionPeriod", "RDPReferenceNumber"})
public class CashOptionSD10 {

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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmPlaceAndName
	 * CashOptionSD9.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> CashOptionSD9.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected DTCCPayoutType5Code payoutType;
	/**
	 * Specifies the type of payout associated with the event (for example:
	 * principal, long term capital gain).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code
	 * DTCCPayoutType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of payout associated with the event (for example:  principal, long term capital gain)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmPayoutType
	 * CashOptionSD9.mmPayoutType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayoutType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Specifies the type of payout associated with the event (for example:  principal, long term capital gain).";
			previousVersion_lazy = () -> CashOptionSD9.mmPayoutType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType5Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDTCPayMethod
	 * CashOptionSD9.mmDTCPayMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema. ";
			previousVersion_lazy = () -> CashOptionSD9.mmDTCPayMethod;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDTCPayOrder
	 * CashOptionSD9.mmDTCPayOrder}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayOrder = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			previousVersion_lazy = () -> CashOptionSD9.mmDTCPayOrder;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmEntitlementCalculationMethod
	 * CashOptionSD9.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			previousVersion_lazy = () -> CashOptionSD9.mmEntitlementCalculationMethod;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmEstimatedRateFlag
	 * CashOptionSD9.mmEstimatedRateFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedRateFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			previousVersion_lazy = () -> CashOptionSD9.mmEstimatedRateFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmNRATaxReportableFlag
	 * CashOptionSD9.mmNRATaxReportableFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNRATaxReportableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "NRATaxRptblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATaxReportableFlag";
			definition = "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA).";
			previousVersion_lazy = () -> CashOptionSD9.mmNRATaxReportableFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmProtectChargeFlag
	 * CashOptionSD9.mmProtectChargeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			previousVersion_lazy = () -> CashOptionSD9.mmProtectChargeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PriceFormatSD2Choice declaredCashRate;
	/**
	 * Cash rate associated to the payout as declared on the market by the
	 * issuer or offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDeclaredCashRate
	 * CashOptionSD9.mmDeclaredCashRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredCashRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "DclrdCshRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredCashRate";
			definition = "Cash rate associated to the payout as declared  on the market by the issuer or offeror.";
			previousVersion_lazy = () -> CashOptionSD9.mmDeclaredCashRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}
	};
	protected PriceFormatSD2Choice declaredGrossRate;
	/**
	 * Gross cash rate associated to the payout as declared on the market by the
	 * issuer or offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDeclaredGrossRate
	 * CashOptionSD9.mmDeclaredGrossRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredGrossRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "DclrdGrssRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredGrossRate";
			definition = "Gross cash rate associated to the payout as declared on the market by the issuer or offeror.";
			previousVersion_lazy = () -> CashOptionSD9.mmDeclaredGrossRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}
	};
	protected PriceFormatSD2Choice declaredNetRate;
	/**
	 * Net cash rate associated to the payout as declared on the market by the
	 * issuer or offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDeclaredNetRate
	 * CashOptionSD9.mmDeclaredNetRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredNetRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "DclrdNetRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredNetRate";
			definition = "Net cash rate associated to the payout as declared on the market by the issuer or offeror.";
			previousVersion_lazy = () -> CashOptionSD9.mmDeclaredNetRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}
	};
	protected PriceFormatSD2Choice declaredFeeRate;
	/**
	 * Rate at which the fee will be charged to a DTC participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDeclaredFeeRate
	 * CashOptionSD9.mmDeclaredFeeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredFeeRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "DclrdFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredFeeRate";
			definition = "Rate at which the fee will be charged to a DTC participant.";
			previousVersion_lazy = () -> CashOptionSD9.mmDeclaredFeeRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDTCUSTaxInstructionPeriod
	 * CashOptionSD9.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCUSTaxInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted.";
			previousVersion_lazy = () -> CashOptionSD9.mmDTCUSTaxInstructionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmRDPReferenceNumber
	 * CashOptionSD9.mmRDPReferenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRDPReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOptionSD10.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files.  For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option.  Also, usage rules will specify the different layouts of the   RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).  ";
			previousVersion_lazy = () -> CashOptionSD9.mmRDPReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashOptionSD10.mmPlaceAndName, CashOptionSD10.mmPayoutType, CashOptionSD10.mmDTCPayMethod, CashOptionSD10.mmDTCPayOrder, CashOptionSD10.mmEntitlementCalculationMethod,
						CashOptionSD10.mmEstimatedRateFlag, CashOptionSD10.mmNRATaxReportableFlag, CashOptionSD10.mmProtectChargeFlag, CashOptionSD10.mmDeclaredCashRate, CashOptionSD10.mmDeclaredGrossRate, CashOptionSD10.mmDeclaredNetRate,
						CashOptionSD10.mmDeclaredFeeRate, CashOptionSD10.mmDTCUSTaxInstructionPeriod, CashOptionSD10.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashOptionSD10";
				definition = "Provides additional information regarding corporate action option cash movement details.";
				previousVersion_lazy = () -> CashOptionSD9.mmObject();
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

	@XmlElement(name = "PyoutTp", required = true)
	public DTCCPayoutType5Code getPayoutType() {
		return payoutType;
	}

	public void setPayoutType(DTCCPayoutType5Code payoutType) {
		this.payoutType = payoutType;
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

	@XmlElement(name = "EntitlmntClctnMtd")
	public DTCEntitlementCalculationMethod1Code getEntitlementCalculationMethod() {
		return entitlementCalculationMethod;
	}

	public void setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
	}

	@XmlElement(name = "EstmtdRateFlg")
	public YesNoIndicator getEstimatedRateFlag() {
		return estimatedRateFlag;
	}

	public void setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
	}

	@XmlElement(name = "NRATaxRptblFlg")
	public YesNoIndicator getNRATaxReportableFlag() {
		return nRATaxReportableFlag;
	}

	public void setNRATaxReportableFlag(YesNoIndicator nRATaxReportableFlag) {
		this.nRATaxReportableFlag = nRATaxReportableFlag;
	}

	@XmlElement(name = "PrtctChrgFlg")
	public YesNoIndicator getProtectChargeFlag() {
		return protectChargeFlag;
	}

	public void setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
	}

	@XmlElement(name = "DclrdCshRate")
	public PriceFormatSD2Choice getDeclaredCashRate() {
		return declaredCashRate;
	}

	public void setDeclaredCashRate(PriceFormatSD2Choice declaredCashRate) {
		this.declaredCashRate = declaredCashRate;
	}

	@XmlElement(name = "DclrdGrssRate")
	public PriceFormatSD2Choice getDeclaredGrossRate() {
		return declaredGrossRate;
	}

	public void setDeclaredGrossRate(PriceFormatSD2Choice declaredGrossRate) {
		this.declaredGrossRate = declaredGrossRate;
	}

	@XmlElement(name = "DclrdNetRate")
	public PriceFormatSD2Choice getDeclaredNetRate() {
		return declaredNetRate;
	}

	public void setDeclaredNetRate(PriceFormatSD2Choice declaredNetRate) {
		this.declaredNetRate = declaredNetRate;
	}

	@XmlElement(name = "DclrdFeeRate")
	public PriceFormatSD2Choice getDeclaredFeeRate() {
		return declaredFeeRate;
	}

	public void setDeclaredFeeRate(PriceFormatSD2Choice declaredFeeRate) {
		this.declaredFeeRate = declaredFeeRate;
	}

	@XmlElement(name = "DTCUSTaxInstrPrd")
	public Period3 getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod;
	}

	public void setDTCUSTaxInstructionPeriod(com.tools20022.repository.msg.Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
	}

	@XmlElement(name = "RDPRefNb")
	public Exact32AlphaNumericText getRDPReferenceNumber() {
		return rDPReferenceNumber;
	}

	public void setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
	}
}