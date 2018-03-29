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
import com.tools20022.repository.choice.PriceFormatSD1Choice;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.datatype.Exact32AlphaNumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Period3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD7#mmPlaceAndName
 * CashOptionSD7.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD7#mmDTCPayMethod
 * CashOptionSD7.mmDTCPayMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD7#mmDTCPayOrder
 * CashOptionSD7.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmEntitlementCalculationMethod
 * CashOptionSD7.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmEstimatedRateFlag
 * CashOptionSD7.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmNRATaxReportableFlag
 * CashOptionSD7.mmNRATaxReportableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmProtectChargeFlag
 * CashOptionSD7.mmProtectChargeFlag}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD7#mmCSDCashRate
 * CashOptionSD7.mmCSDCashRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD7#mmDTCFeeRate
 * CashOptionSD7.mmDTCFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmDTCUSTaxInstructionPeriod
 * CashOptionSD7.mmDTCUSTaxInstructionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmRDPReferenceNumber
 * CashOptionSD7.mmRDPReferenceNumber}</li>
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
 * "CashOptionSD7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option cash movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashOptionSD2
 * CashOptionSD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOptionSD7", propOrder = {"placeAndName", "dTCPayMethod", "dTCPayOrder", "entitlementCalculationMethod", "estimatedRateFlag", "nRATaxReportableFlag", "protectChargeFlag", "cSDCashRate", "dTCFeeRate",
		"dTCUSTaxInstructionPeriod", "rDPReferenceNumber"})
public class CashOptionSD7 {

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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmPlaceAndName
	 * CashOptionSD2.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Max350Text> mmPlaceAndName = new MMMessageAttribute<CashOptionSD7, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> CashOptionSD2.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CashOptionSD7 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Max350Text value) {
			obj.setPlaceAndName(value);
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
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
	 * "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmDTCPayMethod
	 * CashOptionSD2.mmDTCPayMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<Max3Text>> mmDTCPayMethod = new MMMessageAttribute<CashOptionSD7, Optional<Max3Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			previousVersion_lazy = () -> CashOptionSD2.mmDTCPayMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(CashOptionSD7 obj) {
			return obj.getDTCPayMethod();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<Max3Text> value) {
			obj.setDTCPayMethod(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmDTCPayOrder
	 * CashOptionSD2.mmDTCPayOrder}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<Max3Text>> mmDTCPayOrder = new MMMessageAttribute<CashOptionSD7, Optional<Max3Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Order"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			previousVersion_lazy = () -> CashOptionSD2.mmDTCPayOrder;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(CashOptionSD7 obj) {
			return obj.getDTCPayOrder();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<Max3Text> value) {
			obj.setDTCPayOrder(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmEntitlementCalculationMethod
	 * CashOptionSD2.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<DTCEntitlementCalculationMethod1Code>> mmEntitlementCalculationMethod = new MMMessageAttribute<CashOptionSD7, Optional<DTCEntitlementCalculationMethod1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Entitlement Calculation Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			previousVersion_lazy = () -> CashOptionSD2.mmEntitlementCalculationMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}

		@Override
		public Optional<DTCEntitlementCalculationMethod1Code> getValue(CashOptionSD7 obj) {
			return obj.getEntitlementCalculationMethod();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<DTCEntitlementCalculationMethod1Code> value) {
			obj.setEntitlementCalculationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdRateFlg")
	protected YesNoIndicator estimatedRateFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdRateFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Estimated Rate Flag</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmEstimatedRateFlag
	 * CashOptionSD2.mmEstimatedRateFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<YesNoIndicator>> mmEstimatedRateFlag = new MMMessageAttribute<CashOptionSD7, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Estimated Rate Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			previousVersion_lazy = () -> CashOptionSD2.mmEstimatedRateFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD7 obj) {
			return obj.getEstimatedRateFlag();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<YesNoIndicator> value) {
			obj.setEstimatedRateFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "NRATaxRptblFlg")
	protected YesNoIndicator nRATaxReportableFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NRATaxRptblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: NRA Tax Reportable Flag</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmNRATaxReportableFlag
	 * CashOptionSD2.mmNRATaxReportableFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<YesNoIndicator>> mmNRATaxReportableFlag = new MMMessageAttribute<CashOptionSD7, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "NRATaxRptblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "NRA Tax Reportable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATaxReportableFlag";
			definition = "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA).";
			previousVersion_lazy = () -> CashOptionSD2.mmNRATaxReportableFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD7 obj) {
			return obj.getNRATaxReportableFlag();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<YesNoIndicator> value) {
			obj.setNRATaxReportableFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmProtectChargeFlag
	 * CashOptionSD2.mmProtectChargeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<YesNoIndicator>> mmProtectChargeFlag = new MMMessageAttribute<CashOptionSD7, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Charge Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			previousVersion_lazy = () -> CashOptionSD2.mmProtectChargeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD7 obj) {
			return obj.getProtectChargeFlag();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<YesNoIndicator> value) {
			obj.setProtectChargeFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "CSDCshRate")
	protected PriceFormatSD1Choice cSDCashRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDCshRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Cash Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDCashRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corresponding cash rate paid by CSD."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmCSDCashRate
	 * CashOptionSD2.mmCSDCashRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<PriceFormatSD1Choice>> mmCSDCashRate = new MMMessageAttribute<CashOptionSD7, Optional<PriceFormatSD1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "CSDCshRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Cash Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDCashRate";
			definition = "Corresponding cash rate paid by CSD.";
			previousVersion_lazy = () -> CashOptionSD2.mmCSDCashRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}

		@Override
		public Optional<PriceFormatSD1Choice> getValue(CashOptionSD7 obj) {
			return obj.getCSDCashRate();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<PriceFormatSD1Choice> value) {
			obj.setCSDCashRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCFeeRate")
	protected PriceFormatSD1Choice dTCFeeRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Fee Rate, DTCCSynonym: Currency (DTC
	 * Fee Rate)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which a fee will be charged to a DTC (The Depository Trust Corporation) participant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmDTCFeeRate
	 * CashOptionSD2.mmDTCFeeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<PriceFormatSD1Choice>> mmDTCFeeRate = new MMMessageAttribute<CashOptionSD7, Optional<PriceFormatSD1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCFeeRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Fee Rate"), new DTCCSynonym(this, "Currency (DTC Fee Rate)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFeeRate";
			definition = "Rate at which a fee will be charged to a DTC (The Depository Trust Corporation) participant.";
			previousVersion_lazy = () -> CashOptionSD2.mmDTCFeeRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}

		@Override
		public Optional<PriceFormatSD1Choice> getValue(CashOptionSD7 obj) {
			return obj.getDTCFeeRate();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<PriceFormatSD1Choice> value) {
			obj.setDTCFeeRate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCUSTaxInstrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC NRA Tax Instruction Expiration Date,
	 * DTCCSynonym: DTC NRA Tax Instruction Start Date</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmDTCUSTaxInstructionPeriod
	 * CashOptionSD2.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD7, Optional<Period3>> mmDTCUSTaxInstructionPeriod = new MMMessageAttribute<CashOptionSD7, Optional<Period3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC NRA Tax Instruction Expiration Date"), new DTCCSynonym(this, "DTC NRA Tax Instruction Start Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted.";
			previousVersion_lazy = () -> CashOptionSD2.mmDTCUSTaxInstructionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period3.mmObject();
		}

		@Override
		public Optional<Period3> getValue(CashOptionSD7 obj) {
			return obj.getDTCUSTaxInstructionPeriod();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<Period3> value) {
			obj.setDTCUSTaxInstructionPeriod(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
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
	public static final MMMessageAttribute<CashOptionSD7, Optional<Exact32AlphaNumericText>> mmRDPReferenceNumber = new MMMessageAttribute<CashOptionSD7, Optional<Exact32AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD7.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy records. The number algorhithm is as follows: Department ID (1:1), Activity Type (2:3), Cusip Country Code (5:2), Cusip (7:9), Record Date (15:8), Payable Date (22:8), Sequence Number (29:3), RDP Issue Type (31:1). \r\nUSAGE RULE: this sequence can be populated /extended to event details, option details or a movement, depending on sequence number coordinality to an event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact32AlphaNumericText> getValue(CashOptionSD7 obj) {
			return obj.getRDPReferenceNumber();
		}

		@Override
		public void setValue(CashOptionSD7 obj, Optional<Exact32AlphaNumericText> value) {
			obj.setRDPReferenceNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOptionSD7.mmPlaceAndName, com.tools20022.repository.msg.CashOptionSD7.mmDTCPayMethod, com.tools20022.repository.msg.CashOptionSD7.mmDTCPayOrder,
						com.tools20022.repository.msg.CashOptionSD7.mmEntitlementCalculationMethod, com.tools20022.repository.msg.CashOptionSD7.mmEstimatedRateFlag, com.tools20022.repository.msg.CashOptionSD7.mmNRATaxReportableFlag,
						com.tools20022.repository.msg.CashOptionSD7.mmProtectChargeFlag, com.tools20022.repository.msg.CashOptionSD7.mmCSDCashRate, com.tools20022.repository.msg.CashOptionSD7.mmDTCFeeRate,
						com.tools20022.repository.msg.CashOptionSD7.mmDTCUSTaxInstructionPeriod, com.tools20022.repository.msg.CashOptionSD7.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOptionSD7";
				definition = "Provides additional information regarding corporate action option cash movement details.";
				previousVersion_lazy = () -> CashOptionSD2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CashOptionSD7 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<Max3Text> getDTCPayMethod() {
		return dTCPayMethod == null ? Optional.empty() : Optional.of(dTCPayMethod);
	}

	public CashOptionSD7 setDTCPayMethod(Max3Text dTCPayMethod) {
		this.dTCPayMethod = dTCPayMethod;
		return this;
	}

	public Optional<Max3Text> getDTCPayOrder() {
		return dTCPayOrder == null ? Optional.empty() : Optional.of(dTCPayOrder);
	}

	public CashOptionSD7 setDTCPayOrder(Max3Text dTCPayOrder) {
		this.dTCPayOrder = dTCPayOrder;
		return this;
	}

	public Optional<DTCEntitlementCalculationMethod1Code> getEntitlementCalculationMethod() {
		return entitlementCalculationMethod == null ? Optional.empty() : Optional.of(entitlementCalculationMethod);
	}

	public CashOptionSD7 setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
		return this;
	}

	public Optional<YesNoIndicator> getEstimatedRateFlag() {
		return estimatedRateFlag == null ? Optional.empty() : Optional.of(estimatedRateFlag);
	}

	public CashOptionSD7 setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
		return this;
	}

	public Optional<YesNoIndicator> getNRATaxReportableFlag() {
		return nRATaxReportableFlag == null ? Optional.empty() : Optional.of(nRATaxReportableFlag);
	}

	public CashOptionSD7 setNRATaxReportableFlag(YesNoIndicator nRATaxReportableFlag) {
		this.nRATaxReportableFlag = nRATaxReportableFlag;
		return this;
	}

	public Optional<YesNoIndicator> getProtectChargeFlag() {
		return protectChargeFlag == null ? Optional.empty() : Optional.of(protectChargeFlag);
	}

	public CashOptionSD7 setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
		return this;
	}

	public Optional<PriceFormatSD1Choice> getCSDCashRate() {
		return cSDCashRate == null ? Optional.empty() : Optional.of(cSDCashRate);
	}

	public CashOptionSD7 setCSDCashRate(PriceFormatSD1Choice cSDCashRate) {
		this.cSDCashRate = cSDCashRate;
		return this;
	}

	public Optional<PriceFormatSD1Choice> getDTCFeeRate() {
		return dTCFeeRate == null ? Optional.empty() : Optional.of(dTCFeeRate);
	}

	public CashOptionSD7 setDTCFeeRate(PriceFormatSD1Choice dTCFeeRate) {
		this.dTCFeeRate = dTCFeeRate;
		return this;
	}

	public Optional<Period3> getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod == null ? Optional.empty() : Optional.of(dTCUSTaxInstructionPeriod);
	}

	public CashOptionSD7 setDTCUSTaxInstructionPeriod(Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
		return this;
	}

	public Optional<Exact32AlphaNumericText> getRDPReferenceNumber() {
		return rDPReferenceNumber == null ? Optional.empty() : Optional.of(rDPReferenceNumber);
	}

	public CashOptionSD7 setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
		return this;
	}
}